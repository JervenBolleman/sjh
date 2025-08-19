package ch.isb_sib.swiss_prot.sjh.attributes.event;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public non-sealed class OnVolumeChange implements EventAttribute {
    private static final byte[] NAME = Attribute.fromString("onvolumechange");

    private final byte[] value;

    public OnVolumeChange(String value) {
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
