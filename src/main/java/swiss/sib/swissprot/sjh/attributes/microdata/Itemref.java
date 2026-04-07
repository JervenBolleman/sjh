package swiss.sib.swissprot.sjh.attributes.microdata;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class Itemref implements MicrodataAttribute {

	private final byte[] value;

	public Itemref(String value) {
		Objects.nonNull(value);
		this.value = Attribute.fromString(value);
	}

	private static final byte[] ATTR_NAME = "itemscope".getBytes(StandardCharsets.UTF_8);

	@Override
	public byte[] getValue() {
		return value;
	}

	@Override
	public byte[] getAttributeName() {
		return ATTR_NAME;
	}
}
