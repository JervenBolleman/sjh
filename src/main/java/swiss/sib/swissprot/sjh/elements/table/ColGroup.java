package swiss.sib.swissprot.sjh.elements.table;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.table.Span;
import swiss.sib.swissprot.sjh.elements.CommonElement;

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
