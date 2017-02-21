package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The multiple attribute is a boolean attribute that indicates whether the user
 * is to be allowed to specify more than one value.
 *
 */
public class Multiple extends BooleanAttribute {
	private static final byte[] NAME = Attribute.fromString("multiple");

	public Multiple(boolean val) {
		super(val);
	}

	@Override
	public byte[] getAttributeName() {
		return NAME;
	}
}