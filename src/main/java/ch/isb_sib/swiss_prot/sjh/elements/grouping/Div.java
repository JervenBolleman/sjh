package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;


public class Div
    extends CommonElement
    implements FlowContent, PalpabaleContent
{
	private final static byte[] NAME = "div".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Div(GlobalAttribute[] ga, Stream<? extends FlowContent> childeren)
	{
		super(ga, childeren);
	}

	public Div()
	{
		super();
	}

	public Div(Stream<? extends FlowContent> childeren)
	{
		super(childeren);
	}
}