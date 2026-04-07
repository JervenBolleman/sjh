package swiss.sib.swissprot.sjh.attributes.microdata;

import java.nio.charset.StandardCharsets;

import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * This is a boolean attribute but can't be false.
 */
public non-sealed class Itemscope implements MicrodataAttribute, BooleanAttribute {

	public Itemscope() {
	}

	private static final byte[] ATTR_NAME = "itemscope".getBytes(StandardCharsets.UTF_8);

	@Override
	public byte[] getAttributeName() {
		return ATTR_NAME;
	}

	@Override
	public boolean is() {
		return true;
	}

}
