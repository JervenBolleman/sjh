package swiss.sib.swissprot.sjh.attributes.rdfa.core;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public enum Datatype implements RdfaCoreAttribute {
	XSD_INTEGER("xsd:integer"),
	XSD_STRING("xsd:string"),
	XSD_NON_NEGATIVE_INTEGER("xsd:nonNegativeInteger");

	private final byte[] value;
	private static final byte[] ATTR_NAME = Attribute.fromString("datatype");

	private Datatype(String value) {
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
