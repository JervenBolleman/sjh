package swiss.sib.swissprot.sjh.attributes.meta;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Name implements MetaAttribute {
    private static final byte[] LANG_IS = Attribute.fromString("name");

    private final byte[] value;

    public Name(String value) {
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
