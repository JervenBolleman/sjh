package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;

public class THead extends CommonElement {
    private final static byte[] NAME = "thead".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public THead(Stream<GlobalAttribute> ga, Stream<TR> children) {
        super(ga, children);
    }
}
