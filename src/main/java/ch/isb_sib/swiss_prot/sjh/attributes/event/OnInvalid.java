package ch.isb_sib.swiss_prot.sjh.attributes.event;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class OnInvalid
    implements EventAttribute
{
	private static final byte[] NAME = Attribute.fromString("oninvalid");

	private final byte[] value;

	public OnInvalid(String value)
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
