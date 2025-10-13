package swiss.sib.swissprot.sjh.attributes.rdfa.lite;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Resource implements RdfaLiteAttribute {

	private static final byte[] ATTR_NAME = Attribute.fromString("prefix");
	private final byte[] value;

	public Resource(String value) {
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
