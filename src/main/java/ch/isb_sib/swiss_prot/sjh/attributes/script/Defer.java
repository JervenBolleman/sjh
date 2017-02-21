package ch.isb_sib.swiss_prot.sjh.attributes.script;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;


public class Defer
	extends BooleanAttribute
{
	private static final byte[] LANG_IS = Attribute.fromString("defer");

	public Defer(boolean bool)
	{
		super(bool);
	}

	@Override
	public byte[] getAttributeName()
	{
		return LANG_IS;
	}
}