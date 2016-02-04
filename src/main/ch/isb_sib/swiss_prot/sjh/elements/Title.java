package ch.isb_sib.swiss_prot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;


public class Title
    extends CommonElement
{
	private final static byte[] NAME = "title".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Title(GlobalAttribute[] ga, Text text)
	{
		super(ga, Stream.of(text));
	}

	public Title()
	{
		super();
	}

	public Title(Text text)
	{
		super(Stream.of(text));
	}
}
