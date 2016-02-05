package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class SandBox
    implements Attribute
{
	private static final byte[] NAME = Attribute.fromString("sandbox");

	private final byte[] value;

	public SandBox(String value)
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