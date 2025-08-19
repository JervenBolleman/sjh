package ch.isb_sib.swiss_prot.sjh.attributes;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Objects;

public non-sealed class DateTime implements Attribute {
    private static final byte[] LANG_IS = Attribute.fromString("datetime");

    private final byte[] value;

    public DateTime(TemporalAccessor value) {
	Objects.nonNull(value);
	this.value = Attribute.fromString(DateTimeFormatter.ISO_LOCAL_DATE.format(value));
    }

    @Override
    public byte[] getValue() {
	return value;
    }

    @Override
    public byte[] getAttributeName() {
	return LANG_IS;
    }
}