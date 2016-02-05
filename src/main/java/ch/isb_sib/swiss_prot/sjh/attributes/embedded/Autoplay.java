package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class Autoplay
    implements Attribute
{
	private static final byte[] NAME = Attribute.fromString("autoplay");

	private final byte[] value;

	public Autoplay(String value)
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