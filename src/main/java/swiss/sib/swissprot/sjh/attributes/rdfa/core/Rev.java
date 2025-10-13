package swiss.sib.swissprot.sjh.attributes.rdfa.core;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

/**
 * a white space separated list of TERMorCURIEorAbsIRIs, used for expressing
 * reverse relationships between two resources (also 'predicates');
 */
public final class Rev implements RdfaCoreAttribute {
	private static final byte[] NAME = Attribute.fromString("rev");

	private final byte[] value;

	public Rev(String value) {
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
