package swiss.sib.swissprot.sjh.attributes.rdfa.lite;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Property implements RdfaLiteAttribute {
	private static final byte[] ATTR_NAME = Attribute.fromString("property");

	private final byte[] value;

	public Property(String value) {
		Objects.nonNull(value);
		this.value = Attribute.fromString(value);
	}

	@Override
	public byte[] getValue() {
		return value;
	}

	@Override
	public byte[] getAttributeName() {
		return ATTR_NAME;
	}

}
