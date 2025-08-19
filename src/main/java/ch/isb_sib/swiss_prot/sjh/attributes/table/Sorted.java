package ch.isb_sib.swiss_prot.sjh.attributes.table;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class Sorted implements TableAttribute {
    private static final byte[] LANG_IS = Attribute.fromString("sorted");

    private final byte[] value;

    public Sorted(String value) {
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