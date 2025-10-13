package swiss.sib.swissprot.sjh.attributes.rdfa.core;

import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

/**
 * An attribute used to indicate that the object associated with a rel or
 * property attribute on the same element is to be added to the list for that
 * predicate. The value of this attribute MUST be ignored. Presence of this
 * attribute causes a list to be created if it does not already exist.;
 */
public final class Inlist implements RdfaCoreAttribute {
	private static final byte[] NAME = Attribute.fromString("inlist");

	private final byte[] value;

	public Inlist(String value) {
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
