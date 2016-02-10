package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;

public class TBody extends CommonElement {
    private final static byte[] NAME = "tbody".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public TBody(GlobalAttribute[] ga, Stream<TR> children) {
	super(ga, children);
    }
}