package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.Cite;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.SectioningRoot;

public non-sealed class BlockQuote extends CommonElement implements FlowContent, SectioningRoot {
    private final static byte[] NAME = "blockquote".getBytes(UTF_8);
    private final Cite cite;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public BlockQuote(Stream<GlobalAttribute> ga, Cite cite, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
        this.cite = cite;
    }

    public BlockQuote() {
        super();
        this.cite = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (this.cite != null)
            return Stream.of(this.cite);
        else
            return Stream.empty();
    }

}
