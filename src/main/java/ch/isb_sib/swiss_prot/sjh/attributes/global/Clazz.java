package ch.isb_sib.swiss_prot.sjh.attributes.global;

import java.util.Arrays;
import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class Clazz implements GlobalAttribute {
    private static final byte[] CLAZZ = Attribute.fromString("class");

    private final byte[] value;

    public Clazz(String value) {
	Objects.nonNull(value);
	this.value = Attribute.fromString(value);
    }

    public Clazz(String... values) {
	Objects.nonNull(values);
	byte[] tobe = new byte[0];
	for (int i = 0; i < values.length; i++) {
	    if (values[i] != null) {
		String value = values[i];
		byte[] vb = Attribute.fromString(value);
		tobe = Arrays.copyOf(tobe, tobe.length + vb.length + 1);
		tobe[tobe.length - (vb.length + 1)] = ' ';
		System.arraycopy(vb, 0, tobe, tobe.length - vb.length, vb.length);
	    }
	}
	this.value = tobe;
    }

    @Override
    public byte[] getValue() {
	return value;
    }

    @Override
    public byte[] getAttributeName() {
	return CLAZZ;
    }
}
