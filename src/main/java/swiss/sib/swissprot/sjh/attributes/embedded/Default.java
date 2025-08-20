package swiss.sib.swissprot.sjh.attributes.embedded;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

public enum Default implements EmbeddedAttribute, BooleanAttribute {
    TRUE(), FALSE();

    private Default() {
    }

    private static final byte[] NAME = Attribute.fromString("default");

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }

    @Override
    public boolean is() {

        return this == TRUE;
    }
}
