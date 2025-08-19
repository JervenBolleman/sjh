package ch.isb_sib.swiss_prot.sjh.attributes.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public final class Type implements FormAttribute {
    private final static byte[] NAME = "type".getBytes(UTF_8);

    public enum Types {
	hidden("hidden"), // Hidden An arbitrary string n/a
	text("text"), // Text Text with no line breaks A text field
	search("search"), // Search Text with no line breaks Search field
	tel("tel"), // Telephone Text with no line breaks A text field
	url("url"), // URL An absolute URL A text field
	email("email"), // E-mail An e-mail address or list of e-mail addresses
			// A text
	// field
	password("password"), // Password Text with no line breaks (sensitive
			      // information) A
	// text field that obscures data entry
	date("date"), // Date A date (year, month, day) with no time zone A date
		      // control
	time("time"), // Time A time (hour, minute, seconds, fractional seconds)
		      // with no
	// time zone A time control
	number("number"), // Number A numerical value A text field or spinner
			  // control
	range("range"), // Range A numerical value, with the extra semantic that
			// the
	// exact value is not important A slider control or similar
	color("color"), // Color An sRGB color with 8-bit red, green, and blue
			// components
	// A color well
	checkbox("checkbox"), // Checkbox A set of zero or more values from a
			      // predefined
	// list A checkbox
	radio("radio"), // Radio Button An enumerated value A radio button
	file("file"), // File Upload Zero or more files each with a MIME type
		      // and
	// optionally a file name A label and a button
	submit("submit"), // Submit Button An enumerated value, with the extra
			  // semantic
	// that it must be the last value selected and initiates form
	// submission A button
	image("image"), // Image Button A coordinate, relative to a particular
			// image's
	// size, with the extra semantic that it must be the last value
	// selected and initiates form submission Either a clickable
	// image, or a button
	reset("	reset"), // Reset Button n/a A button
	button("button");
	private final Type type;

	// Button

	private Types(String value) {
	    this.type = new Type(value.getBytes(UTF_8));
	}

	public Type getType() {
	    return type;
	}
    }

    private byte[] value;

    private Type(byte[] bytes) {
	this.value = bytes;
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
