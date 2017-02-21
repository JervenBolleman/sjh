package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;


public class FormNoValidate
	extends BooleanAttribute
{
	private static final byte[] NAME = Attribute.fromString("formnovalidate");


    public FormNoValidate(boolean bool)
	{
	super(bool);
	}

	@Override
	public byte[] getAttributeName()
	{
		return NAME;
	}
}