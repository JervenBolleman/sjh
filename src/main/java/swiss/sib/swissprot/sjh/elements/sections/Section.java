package swiss.sib.swissprot.sjh.elements.sections;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.SectioningContent;

public non-sealed class Section extends CommonElement implements FlowContent, SectioningContent, PalpabaleContent {
    private final static byte[] NAME = "section".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Section(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
    }

    public Section() {
        super();
    }
}
