package ch.isb_sib.swiss_prot.sjh.attributes.menu;

import static java.nio.charset.StandardCharsets.UTF_8;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public class RadioGroup implements Attribute {

	private final static byte[] NAME = "radiogroup".getBytes(UTF_8);

	private byte[] value;

	private RadioGroup(String bytes) {
		this.value = Attribute.fromString(bytes);
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
