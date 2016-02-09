package ch.isb_sib.swiss_prot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Head;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Body;


public class HTML
    extends CommonElement
{
	private final static byte[] NAME = "html".getBytes(UTF_8);
	private static final byte[] DOCTYPE = "<!DOCTYPE html>".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public HTML(GlobalAttribute[] ga, Head head, Body body)
	{
		super(ga, Stream.of(head, body));
	}

	public HTML()
	{
		super();
	}

	public HTML(Head head, Body body)
	{
		super(Stream.of(head, body));
	}

	@Override
	public void render(OutputStream stream)
	    throws IOException
	{
		stream.write(DOCTYPE);
		super.render(stream);
	}
}
