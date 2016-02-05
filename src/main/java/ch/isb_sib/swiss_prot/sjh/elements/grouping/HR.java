package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;


public class HR
    extends CommonElement
    implements FlowContent
{
	private final static byte[] NAME = "hr".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public HR(GlobalAttribute[] ga)
	{
		super(ga);
	}

	public HR()
	{
		super();
	}
}
