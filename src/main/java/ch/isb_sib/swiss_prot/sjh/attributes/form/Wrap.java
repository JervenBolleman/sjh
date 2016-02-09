package ch.isb_sib.swiss_prot.sjh.attributes.form;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class Wrap
    implements Attribute
{
	private static final byte[] NAME = Attribute.fromString("wrap");

	private final byte[] value;

	public Wrap(String value)
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