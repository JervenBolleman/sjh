package swiss.sib.swissprot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;

/**
 * The search element: a part of the document that contains the controls for a search or filtering operation.
 *
 * @see <a href="https://html.spec.whatwg.org/dev/grouping-content.html#the-search-element">HTML Standard: the search element</a>
 */
public non-sealed class Search extends CommonElement implements FlowContent, PalpabaleContent {
    private final static byte[] NAME = "search".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Search(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
    }

    public Search() {
        super();
    }
}
