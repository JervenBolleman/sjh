package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;


public class WBr
    extends CommonElement
    implements FlowContent, PhrasingContent, PalpabaleContent
{
	private final static byte[] NAME = "wbr".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public WBr(GlobalAttribute[] ga)
	{
		super(ga);
	}

	public WBr()
	{
		super();
	}
}
