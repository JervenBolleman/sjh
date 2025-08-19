package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The required attribute is a boolean attribute. When specified, the element is required. Constraint validation: If the
 * element is required, and its value IDL attribute applies and is in the mode value, and the element is mutable, and
 * the element's value is the empty string, then the element is suffering from being missing.
 */
public enum Required implements FormAttribute, BooleanAttribute {

    TRUE, FALSE;

    private static final byte[] NAME = Attribute.fromString("required");

    private Required() {
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
