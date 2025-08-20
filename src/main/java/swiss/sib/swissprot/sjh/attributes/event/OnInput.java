package swiss.sib.swissprot.sjh.attributes.event;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class OnInput implements EventAttribute {
    private static final byte[] NAME = Attribute.fromString("oninput");

    private final byte[] value;

    public OnInput(String value) {
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
