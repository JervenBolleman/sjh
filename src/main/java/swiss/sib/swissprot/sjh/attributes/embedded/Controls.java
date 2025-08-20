package swiss.sib.swissprot.sjh.attributes.embedded;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

public enum Controls implements BooleanAttribute, EmbeddedAttribute {

    TRUE(), FALSE();

    private Controls() {
    }

    private static final byte[] NAME = Attribute.fromString("controls");

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }

    @Override
    public boolean is() {
        return this == TRUE;
    }
}
