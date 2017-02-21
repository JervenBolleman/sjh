package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The required attribute is a boolean attribute. When specified, the element is
 * required.
 * 
 * Constraint validation: If the element is required, and its value IDL
 * attribute applies and is in the mode value, and the element is mutable, and
 * the element's value is the empty string, then the element is suffering from
 * being missing.
 * 
 *
 */
public class Required extends BooleanAttribute {
	private static final byte[] NAME = Attribute.fromString("required");

	public Required(boolean val) {
		super(val);
	}

	@Override
	public byte[] getAttributeName() {
		return NAME;
	}
}