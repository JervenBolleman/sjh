package swiss.sib.swissprot.sjh.attributes.grouping;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Kind implements GroupingAttribute {
    private static final byte[] NAME = Attribute.fromString("kind");

    private final byte[] value;

    public Kind(String value) {
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
