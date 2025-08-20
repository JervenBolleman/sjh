package swiss.sib.swissprot.sjh.attributes.global;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Id implements GlobalAttribute {
    private static final byte[] NAME = Attribute.fromString("id");

    private final byte[] value;

    public Id(String value) {
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
