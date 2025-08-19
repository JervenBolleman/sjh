package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The readonly attribute is a boolean attribute that controls whether or not
 * the user can edit the form control. When specified, the element is not
 * mutable
 *
 */
public enum ReadOnly implements FormAttribute, BooleanAttribute {

    TRUE, FALSE;

    private static final byte[] NAME = Attribute.fromString("readonly");

    private ReadOnly() {

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