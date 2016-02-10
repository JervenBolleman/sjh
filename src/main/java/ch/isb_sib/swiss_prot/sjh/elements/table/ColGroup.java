package ch.isb_sib.swiss_prot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Span;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;

public class ColGroup extends CommonElement {
    private final static byte[] NAME = "colgroup".getBytes(UTF_8);
    private final Span span;

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public ColGroup(GlobalAttribute[] ga, Span span) {
	super(ga);
	this.span = span;
    }

    public ColGroup(GlobalAttribute[] ga, Stream<ColOrTemplate> childeren) {
	super(ga, childeren);
	this.span = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
	return Stream.of(span);
    }
}
