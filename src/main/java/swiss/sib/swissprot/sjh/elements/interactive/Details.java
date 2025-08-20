package swiss.sib.swissprot.sjh.elements.interactive;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.Open;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.SectioningRoot;

public non-sealed class Details extends CommonElement
        implements FlowContent, SectioningRoot, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "details".getBytes(UTF_8);
    private final Open open;

    public Details(Stream<GlobalAttribute> ga, Open open) {
        super(ga, Stream.empty());
        this.open = open;
    }

    public Details(Stream<GlobalAttribute> ga, Summary summary, Open open) {
        super(ga, Stream.of(summary));
        this.open = open;
    }

    @Override
    protected byte[] getName() {
        return NAME;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (open != null)
            return Stream.of(open);
        else
            return Stream.empty();
    }

}
