package swiss.sib.swissprot.sjh.elements.sections.header;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.HeadingContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;
import swiss.sib.swissprot.sjh.elements.contenttype.SectioningContent;

public non-sealed class H1 extends CommonElement
        implements FlowContent, SectioningContent, PalpabaleContent, HeadingContent {
    private final static byte[] NAME = "h1".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public H1(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren) {
        super(ga, childeren);
    }

    public H1() {
        super();
    }
}
