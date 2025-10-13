package swiss.sib.swissprot.sjh.attributes.rdfa.core;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

/**
 * a SafeCURIEorCURIEorIRI, used for stating what the data is about (a 'subject'
 * in RDF terminology);
 */
public final class About implements RdfaCoreAttribute {
	private static final byte[] NAME = Attribute.fromString("about");

	private final byte[] value;

	public About(String value) {
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
