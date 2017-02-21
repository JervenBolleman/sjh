package ch.isb_sib.swiss_prot.sjh.attributes.script;


import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;


public class Async
	extends BooleanAttribute
{
	private static final byte[] LANG_IS = Attribute.fromString("async");

    public Async(boolean bool)
	{
	super(bool);
	}

	@Override
	public byte[] getAttributeName()
	{
		return LANG_IS;
	}
}