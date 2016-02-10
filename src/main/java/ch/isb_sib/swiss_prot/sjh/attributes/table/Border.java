package ch.isb_sib.swiss_prot.sjh.attributes.table;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public class Border implements Attribute {
    private static final byte[] LANG_IS = Attribute.fromString("border");

    private final byte[] value;

    public Border(String value) {
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