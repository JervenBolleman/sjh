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
 * The del element: a removal from the document. Its content is transparent.
 *
 * @see <a href="https://html.spec.whatwg.org/dev/edits.html#the-del-element">HTML Standard: the del element</a>
 */
public non-sealed class Del extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "del".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Del(Stream<GlobalAttribute> ga, Stream<? extends Element> childeren) {
        super(ga, childeren);
    }

    public Del() {
        super();
    }
}
