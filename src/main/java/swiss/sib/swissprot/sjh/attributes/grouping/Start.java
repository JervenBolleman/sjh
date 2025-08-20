package swiss.sib.swissprot.sjh.attributes.grouping;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Start implements GroupingAttribute {
    private static final byte[] NAME = Attribute.fromString("start");

    private final byte[] value;

    public Start(String value) {
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
