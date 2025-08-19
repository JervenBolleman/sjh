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

    public ColGroup(Stream<GlobalAttribute> ga, Span span) {
        super(ga, Stream.empty());
        this.span = span;
    }

    public ColGroup(Stream<GlobalAttribute> ga, Stream<ColOrTemplate> childeren) {
        super(ga, childeren);
        this.span = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (span == null)
            return Stream.empty();
        else
            return Stream.of(span);
    }
}
