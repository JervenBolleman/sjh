package ch.isb_sib.swiss_prot.sjh.attributes.menu;

import static java.nio.charset.StandardCharsets.UTF_8;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

/**
 * The icon attribute gives a picture that represents the command. If the attribute is specified, the attribute's value
 * must contain a valid non-empty URL potentially surrounded by spaces. To obtain the absolute URL of the icon when the
 * attribute's value is not the empty string, the attribute's value must be parsed relative to the element's node
 * document. When the attribute is absent, or its value is the empty string, or parsing its value fails, there is no
 * icon.
 */
public non-sealed class Icon implements MenuAttribute {

    private final static byte[] NAME = "icon".getBytes(UTF_8);

    private byte[] value;

    private Icon(String bytes) {
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
