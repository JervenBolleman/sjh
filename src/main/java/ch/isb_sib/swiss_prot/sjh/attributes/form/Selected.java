package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;


public class Selected
    extends BooleanAttribute
{
	private static final byte[] NAME = Attribute.fromString("selected");

	public Selected(boolean value)
	{
	    super(value);
	}

	@Override
	public byte[] getAttributeName() {
	    return NAME;
	}
}