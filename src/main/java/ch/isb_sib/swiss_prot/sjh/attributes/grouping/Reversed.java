package ch.isb_sib.swiss_prot.sjh.attributes.grouping;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

public class Reversed extends BooleanAttribute {
	private static final byte[] NAME = Attribute.fromString("reversed");

	public Reversed(boolean bool) {
		super(bool);
	}

	@Override
	public byte[] getAttributeName() {
		return NAME;
	}
}