package ch.isb_sib.swiss_prot.sjh.elements.sections;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;


public class Footer
    extends CommonElement
    implements FlowContent, PalpabaleContent
{
	private final static byte[] NAME = "footer".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public Footer(GlobalAttribute[] ga, Stream<? extends FlowContent> childeren)
	{
		super(ga, childeren);
	}

	public Footer()
	{
		super();
	}

	public Footer(Stream<? extends FlowContent> childeren)
	{
		super(childeren);
	}
}
