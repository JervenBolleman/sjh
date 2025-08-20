package swiss.sib.swissprot.sjh.attributes.form;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.BooleanAttribute;

/**
 * The autofocus content attribute allows the author to indicate that a control is to be focused as soon as the page is
 * loaded or as soon as the dialog within which it finds itself is shown, allowing the user to just start typing without
 * having to manually focus the main control. The autofocus attribute is a boolean attribute. An element's nearest
 * ancestor autofocus scoping root element is the element itself if the element is a dialog element, or else is the
 * element's nearest ancestor dialog element, if any, or else is the element's last inclusive ancestor element.
 */
public enum AutoFocus implements BooleanAttribute {

    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("autofocus");

    private AutoFocus() {

    }

    @Override
    public byte[] getAttributeName() {
        return NAME;
    }

    @Override
    public boolean is() {
        return this == TRUE;
    }
}
