package swiss.sib.swissprot.sjh.attributes.event;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class OnLoad implements EventAttribute {
    private static final byte[] NAME = Attribute.fromString("onload");

    private final byte[] value;

    public OnLoad(String value) {
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
