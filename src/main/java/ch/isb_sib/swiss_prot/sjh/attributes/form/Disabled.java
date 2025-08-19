package ch.isb_sib.swiss_prot.sjh.attributes.form;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.BooleanAttribute;

/**
 * The disabled content attribute is a boolean attribute.
 * 
 * A form control is disabled if any of the following conditions are met:
 * 
 * The element is a button, input, select, or textarea element, and the disabled
 * attribute is specified on this element (regardless of its value). The element
 * is a descendant of a fieldset element whose disabled attribute is specified,
 * and is not a descendant of that fieldset element's first legend element
 * child, if any.
 * 
 * A form control that is disabled must prevent any click events that are queued
 * on the user interaction task source from being dispatched on the element.
 * 
 * Constraint validation: If an element is disabled, it is barred from
 * constraint validation.
 * 
 * The disabled IDL attribute must reflect the disabled content attribute.
 */
public enum Disabled implements FormAttribute, BooleanAttribute {

    TRUE(), FALSE();

    private static final byte[] NAME = Attribute.fromString("disabled");

    private Disabled() {
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