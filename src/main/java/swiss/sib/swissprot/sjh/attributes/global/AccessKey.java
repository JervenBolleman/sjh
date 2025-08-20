package swiss.sib.swissprot.sjh.attributes.global;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class AccessKey implements GlobalAttribute {
    private static final byte[] LANG_IS = Attribute.fromString("accesskey");

    private final byte[] value;

    public AccessKey(String value) {
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
