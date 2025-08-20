package swiss.sib.swissprot.sjh.attributes.form;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class High implements FormAttribute {
    private static final byte[] NAME = Attribute.fromString("high");

    private final byte[] value;

    public High(String value) {
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
