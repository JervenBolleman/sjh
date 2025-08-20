package swiss.sib.swissprot.sjh.attributes.embedded;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

public enum Autoplay implements BooleanAttribute, EmbeddedAttribute {
    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("autoplay");

    private Autoplay() {
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
