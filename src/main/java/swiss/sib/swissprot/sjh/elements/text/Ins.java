package swiss.sib.swissprot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

/**
 * The ins element: an addition to the document. Its content is transparent.
 *
 * @see <a href="https://html.spec.whatwg.org/dev/edits.html#the-ins-element">HTML Standard: the ins element</a>
 */
public non-sealed class Ins extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "ins".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Ins(Stream<GlobalAttribute> ga, Stream<? extends Element> childeren) {
        super(ga, childeren);
    }

    public Ins() {
        super();
    }
}
