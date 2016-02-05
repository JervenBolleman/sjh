package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;


public class Abbr
    extends CommonElement
    implements FlowContent, PhrasingContent, PalpabaleContent

{
	private final static byte[] NAME = "abbr".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Abbr(GlobalAttribute[] ga, Stream<? extends PhrasingContent> childeren)
	{
		super(ga, childeren);
	}

	public Abbr()
	{
		super();
	}

	public Abbr(Stream<? extends PhrasingContent> childeren)
	{
		super(childeren);
	}
}
