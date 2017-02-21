package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The readonly attribute is a boolean attribute that controls whether or not
 * the user can edit the form control. When specified, the element is not
 * mutable
 *
 */
public class ReadOnly extends BooleanAttribute {
	private static final byte[] NAME = Attribute.fromString("readonly");

	public ReadOnly(boolean val) {
		super(val);
	}

	@Override
	public byte[] getAttributeName() {
		return NAME;
	}
}