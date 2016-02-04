package ch.isb_sib.swiss_prot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import com.sun.xml.internal.ws.util.StreamUtils;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Target;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;


public class Base
    extends CommonElement
{
	private final static byte[] NAME = "html".getBytes(UTF_8);
	private final Href href;
	private final Target target;

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Base(GlobalAttribute[] ga, Href href, Target target)
	{
		super(ga);
		this.href = href;
		this.target = target;
	}

	public Base()
	{
		super();
		this.href = null;
		this.target = null;
	}

	@Override
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		if (href != null && target != null)
			return Stream.of(href, target);
		else if (href != null)
			return Stream.of(href);
		else if (target != null)
			return Stream.of(target);
		else
			return Stream.of();
	}

	public Base(Href href, Target target)
	{
		super();
		this.href = href;
		this.target = target;
	}
}
