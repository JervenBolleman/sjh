package swiss.sib.swissprot.sjh.attributes;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public non-sealed class DateTime implements Attribute {
    private static final byte[] LANG_IS = Attribute.fromString("datetime");

    private final byte[] value;

    public DateTime(LocalDateTime value) {
        Objects.nonNull(value);
        this.value = Attribute.fromString(DateTimeFormatter.ISO_LOCAL_DATE.format(value));
    }
    
    public DateTime(String value) {
        Objects.nonNull(value);
        this.value = value.getBytes(StandardCharsets.UTF_8);
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
