package ch.isb_sib.swiss_prot.sjh.attributes.meta;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class Charset implements MetaAttribute {
    private static final byte[] LANG_IS = Attribute.fromString("charset");

    private final byte[] value;

    public Charset(String value) {
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