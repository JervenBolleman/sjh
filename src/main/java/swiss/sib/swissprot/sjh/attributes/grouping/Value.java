package swiss.sib.swissprot.sjh.attributes.grouping;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Value implements GroupingAttribute {
    private static final byte[] NAME = Attribute.fromString("value");

    private final byte[] value;

    public Value(String value) {
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
