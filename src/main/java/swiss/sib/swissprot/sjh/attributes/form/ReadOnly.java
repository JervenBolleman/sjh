package swiss.sib.swissprot.sjh.attributes.form;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * The readonly attribute is a boolean attribute that controls whether or not the user can edit the form control. When
 * specified, the element is not mutable
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
