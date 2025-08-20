package swiss.sib.swissprot.sjh.attributes.global;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class TabIndex implements GlobalAttribute {
    private static final byte[] NAME = Attribute.fromString("tabindex");

    private final byte[] value;

    public TabIndex(String value) {
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
