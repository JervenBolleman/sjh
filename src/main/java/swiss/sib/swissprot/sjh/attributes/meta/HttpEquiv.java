package swiss.sib.swissprot.sjh.attributes.meta;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class HttpEquiv implements MetaAttribute {
    private static final byte[] LANG_IS = Attribute.fromString("http-equiv");

    private final byte[] value;

    public HttpEquiv(String value) {
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
