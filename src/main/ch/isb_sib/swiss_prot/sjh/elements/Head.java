package ch.isb_sib.swiss_prot.sjh.elements;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;


public class Head
    extends CommonElement
{
	private final static byte[] NAME = "head".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Head(GlobalAttribute[] ga, Title title, Base base,
	    Stream<MetaContent> metacontent)
	{
		super(ga,
		    concat(title, base, metacontent));
	}

	public Head(Title title, Base base,
	    Stream<MetaContent> metacontent)
	{
		super(concat(title, base, metacontent));
	}

	public Head(Title title)
	{
		super(Stream.of(title));
	}

	public Head(Title title, Stream<MetaContent> metacontent)
	{
		super(Stream.concat(Stream.of(title), metacontent));
	}

	private static Stream<Element> concat(Title title, Base base, Stream<MetaContent> metacontent)
	{
		return Stream.<Element> concat(Stream.of(title),
		    Stream.<Element> concat(Stream.of(base), metacontent));
	}
}
