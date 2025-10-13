package swiss.sib.swissprot.sjh.attributes.rdfa.lite;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Prefix implements RdfaLiteAttribute {
	private static final byte[] ATTR_NAME = Attribute.fromString("prefix");

	private final byte[] value;

	public Prefix(String value) {
		Objects.nonNull(value);
		this.value = Attribute.fromString(value);
	}

	@Override
	public byte[] getValue() {
		return value;
	}

	@Override
	public byte[] getAttributeName() {
		// TODO Auto-generated method stub
		return ATTR_NAME;
	}

}
