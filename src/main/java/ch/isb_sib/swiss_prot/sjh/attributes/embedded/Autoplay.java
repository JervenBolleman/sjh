package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

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
