package ch.isb_sib.swiss_prot.sjh.attributes.menu;

import static java.nio.charset.StandardCharsets.UTF_8;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public enum Type implements MenuAttribute {

    context("context"), // The attribute has two states. The "context"
			// keyword maps to the context menu state, in which
			// the element is declaring a context menu.
    toolbar("toolbar"); // The "toolbar" keyword maps to the toolbar state,
			// in which the element is declaring a toolbar. The
			// attribute may also be omitted.

    private final static byte[] NAME = "type".getBytes(UTF_8);

    private byte[] value;

    private Type(String bytes) {
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
