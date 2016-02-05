package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;


public class LI
    extends CommonElement
{
	private final static byte[] NAME = "li".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public LI(GlobalAttribute[] ga, Stream<? extends FlowContent> childeren, Value value)
	{
		super(ga, childeren);
	}

	public LI()
	{
		super();
	}

	public LI(Stream<? extends FlowContent> childeren)
	{
		super(childeren);
	}
}
