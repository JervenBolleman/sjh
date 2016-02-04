package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Element;


public class Div
    extends CommonElement
{
	private final static byte[] NAME = "body".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Div(GlobalAttribute[] ga, Stream<Element> childeren)
	{
		super(ga, childeren);
	}

	public Div()
	{
		super();
	}

	public Div(Stream<Element> childeren)
	{
		super(childeren);
	}
}
