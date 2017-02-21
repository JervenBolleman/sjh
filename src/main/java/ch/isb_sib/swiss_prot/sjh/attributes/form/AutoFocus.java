package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The autofocus content attribute allows the author to indicate that a control
 * is to be focused as soon as the page is loaded or as soon as the dialog
 * within which it finds itself is shown, allowing the user to just start typing
 * without having to manually focus the main control.
 * 
 * The autofocus attribute is a boolean attribute.
 * 
 * An element's nearest ancestor autofocus scoping root element is the element
 * itself if the element is a dialog element, or else is the element's nearest
 * ancestor dialog element, if any, or else is the element's last inclusive
 * ancestor element.
 * 
 */
public class AutoFocus extends BooleanAttribute {
	private static final byte[] NAME = Attribute.fromString("autofocus");

	public AutoFocus(boolean val) {
		super(val);
	}

	@Override
	public byte[] getAttributeName() {
		return NAME;
	}
}