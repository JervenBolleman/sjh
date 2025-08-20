package swiss.sib.swissprot.sjh.attributes.meta;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Content implements MetaAttribute {
    private static final byte[] LANG_IS = Attribute.fromString("content");

    private final byte[] value;

    public Content(String value) {
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
