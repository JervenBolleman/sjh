package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public non-sealed class Label
    implements EmbeddedAttribute
{
	private static final byte[] NAME = Attribute.fromString("label");

	private final byte[] value;

	public Label(String value)
	{
		Objects.nonNull(value);
		this.value = Attribute.fromString(value);
	}

	@Override
	public byte[] getValue()
	{
		return value;
	}

	@Override
	public byte[] getAttributeName()
	{
		return NAME;
	}
}