package ch.isb_sib.swiss_prot.sjh.attributes.form;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class PlaceHolder implements FormAttribute {
    private static final byte[] NAME = Attribute.fromString("placeholder");

    private final byte[] value;

    public PlaceHolder(String value) {
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