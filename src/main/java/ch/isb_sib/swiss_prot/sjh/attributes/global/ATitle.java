package ch.isb_sib.swiss_prot.sjh.attributes.global;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class ATitle implements GlobalAttribute {
    private static final byte[] NAME = Attribute.fromString("title");

    private final byte[] value;

    public ATitle(String value) {
        Objects.nonNull(value);
        this.value = Attribute.fromString(value);
    }

    @Override
    public byte[] getValue() {
        return value;
    }

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }
}
