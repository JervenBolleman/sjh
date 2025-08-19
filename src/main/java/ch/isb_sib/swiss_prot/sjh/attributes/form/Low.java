package ch.isb_sib.swiss_prot.sjh.attributes.form;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class Low implements FormAttribute {
    private static final byte[] NAME = Attribute.fromString("low");

    private final byte[] value;

    public Low(String value) {
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
