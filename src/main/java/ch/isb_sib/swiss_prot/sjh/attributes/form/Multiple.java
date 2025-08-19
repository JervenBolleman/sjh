package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The multiple attribute is a boolean attribute that indicates whether the user
 * is to be allowed to specify more than one value.
 *
 */
public enum Multiple implements FormAttribute, BooleanAttribute {

    TRUE, FALSE;

    private static final byte[] NAME = Attribute.fromString("multiple");

    private Multiple() {
    }

    @Override
    public byte[] getAttributeName() {
	return NAME;
    }

    @Override
    public boolean is() {
	return this == TRUE;
    }
}