package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;

public class TR extends CommonElement implements TROrTH {
    private final static byte[] NAME = "tr".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public TR(Stream<GlobalAttribute> ga, Stream<TROrTH> children) {
	super(ga, children);
    }
}
