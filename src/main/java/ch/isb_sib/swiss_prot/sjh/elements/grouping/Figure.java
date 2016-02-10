package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.SectioningContent;

public class Figure extends CommonElement implements FlowContent, SectioningContent, PalpabaleContent {
    private final static byte[] NAME = "figure".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public Figure(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren, FigCaption caption) {
	super(ga, Stream.concat(childeren, Stream.of(caption)));
    }

    public Figure(Stream<GlobalAttribute> ga, FigCaption caption, Stream<? extends FlowContent> childeren) {
	super(ga, Stream.concat(Stream.of(caption), childeren));
    }
}
