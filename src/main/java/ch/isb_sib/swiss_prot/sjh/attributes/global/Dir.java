package ch.isb_sib.swiss_prot.sjh.attributes.global;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public sealed abstract class Dir implements GlobalAttribute permits DirLTR, DirRTL, DirAuto {
    private static final byte[] NAME = Attribute.fromString("dir");

    private final byte[] value;

    protected Dir(String value) {
        Objects.nonNull(value);
        this.value = Attribute.fromString(value);
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
