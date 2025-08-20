package swiss.sib.swissprot.sjh.elements.sections.header;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.HeadingContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.script.Template;

public non-sealed class HGroup extends CommonElement implements FlowContent, PalpabaleContent, HeadingContent {
    private final static byte[] NAME = "hgroup".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public HGroup(Stream<GlobalAttribute> ga, Stream<HeadingContent> childeren) {
        super(ga, childeren);
    }

    public HGroup(Stream<GlobalAttribute> ga, Stream<HeadingContent> subheaders, Stream<Template> templates) {
        super(ga, Stream.concat(subheaders, templates));
    }

    public HGroup() {
        super();
    }
}
