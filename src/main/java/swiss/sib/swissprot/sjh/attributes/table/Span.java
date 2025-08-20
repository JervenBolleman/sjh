package swiss.sib.swissprot.sjh.attributes.table;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Span implements TableAttribute {
    private static final byte[] LANG_IS = Attribute.fromString("span");

    private final byte[] value;

    public Span(String value) {
        Objects.nonNull(value);
        this.value = Attribute.fromString(value);
    }

    @Override
    public byte[] getValue() {
        return value;
    }

    @Override
    public byte[] getAttributeName() {
        return LANG_IS;
    }
}
