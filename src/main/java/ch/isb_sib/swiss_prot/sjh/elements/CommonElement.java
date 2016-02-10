package ch.isb_sib.swiss_prot.sjh.elements;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;


public abstract class CommonElement
    implements Element
{
    private final Stream<GlobalAttribute> attributes;
	private final Stream<? extends Element> childeren;

	protected abstract byte[] getName();

	public void render(OutputStream stream)
	    throws IOException
	{
		stream.write('<');
		stream.write(getName());
		Iterator<Attribute> sa = getAttributes().iterator();
		if (sa.hasNext())
			stream.write(' ');
		while (sa.hasNext())
		{
			sa.next().render(stream);
			if (sa.hasNext())
				stream.write(' ');
		}
		if (childeren != null)
		{

			Iterator<? extends Element> iter = childeren
			    .iterator();
			if (iter.hasNext())
			{
				stream.write('>');
				while (iter.hasNext())
					iter.next().render(stream);
				stream.write('<');
				stream.write('/');
				stream.write(getName());
				stream.write('>');
			}
			else
			{
				stream.write('/');
				stream.write('>');
			}
		}
		else
		{
			stream.write('/');
			stream.write('>');
		}
	}

    protected CommonElement(Stream<GlobalAttribute> ga, Stream<? extends Element> childeren)
	{
		super();
		this.attributes = ga;
		this.childeren = childeren.filter(Objects::nonNull);
	}

	protected CommonElement()
	{
		super();
		this.attributes = null;
		this.childeren = null;
	}

	private Stream<GlobalAttribute> getGlobalAttributes()
	{
		if (attributes != null)
	    return attributes;
		else
			return Stream.empty();
	}

	private final Stream<Attribute> getAttributes()
	{
		return Stream.concat(getGlobalAttributes(), getElementSpecificAttributes());
	}

	protected Stream<Attribute> getElementSpecificAttributes()
	{
		return Stream.empty();
	}
}
