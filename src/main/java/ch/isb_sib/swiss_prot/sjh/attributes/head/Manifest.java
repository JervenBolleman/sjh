package ch.isb_sib.swiss_prot.sjh.attributes.head;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class Manifest implements Attribute {
    private static final byte[] LANG_IS = Attribute.fromString("manifest");

    private final byte[] value;

    public Manifest(String value) {
        Objects.nonNull(value);
        this.value = Attribute.fromString(value);
    }

    @Override
    public byte[] getValue() {
        return value;
    }

    @Override
    public byte[] getAttributeName() {
        return LANG_IS;
    }
}
