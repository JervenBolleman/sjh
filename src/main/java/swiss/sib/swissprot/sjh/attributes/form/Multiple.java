package swiss.sib.swissprot.sjh.attributes.form;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * The multiple attribute is a boolean attribute that indicates whether the user is to be allowed to specify more than
 * one value.
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
