package swiss.sib.swissprot.sjh.attributes.menu;

import static java.nio.charset.StandardCharsets.UTF_8;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public non-sealed class RadioGroup implements MenuAttribute {

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
