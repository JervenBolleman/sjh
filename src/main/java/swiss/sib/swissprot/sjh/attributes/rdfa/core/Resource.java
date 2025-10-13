package swiss.sib.swissprot.sjh.attributes.rdfa.core;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

/**
 * a SafeCURIEorCURIEorIRI for expressing the partner resource of a relationship
 * that is not intended to be navigable (e.g., a 'clickable' link) (also an
 * 'object');
 */
public final class Resource implements RdfaCoreAttribute {
	private static final byte[] NAME = Attribute.fromString("resource");

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
		return NAME;
	}

}
