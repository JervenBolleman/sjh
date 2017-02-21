package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;


public class Autoplay
		extends BooleanAttribute
{
	private static final byte[] NAME = Attribute.fromString("autoplay");

	public Autoplay(boolean bool)
	{
		super(bool);
	}

	@Override
	public byte[] getAttributeName()
	{
		return NAME;
	}
}