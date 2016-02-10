package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Span;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;

public class Col extends CommonElement implements ColOrTemplate {
    private final static byte[] NAME = "col".getBytes(UTF_8);
    private final Span span;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Col(Stream<GlobalAttribute> ga, Span span) {
	super(ga, Stream.empty());
	this.span = span;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(span);
    }
}
