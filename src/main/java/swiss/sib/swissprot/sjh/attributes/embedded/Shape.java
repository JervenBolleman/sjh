package swiss.sib.swissprot.sjh.attributes.embedded;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Shape implements EmbeddedAttribute {
    private static final byte[] NAME = Attribute.fromString("shape");

    private final byte[] value;

    public Shape(String value) {
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
