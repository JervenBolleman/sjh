package swiss.sib.swissprot.sjh.attributes.form;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

public enum FormNoValidate implements FormAttribute, BooleanAttribute {

    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("formnovalidate");

    private FormNoValidate() {
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
