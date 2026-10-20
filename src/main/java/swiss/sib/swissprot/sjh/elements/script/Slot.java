package swiss.sib.swissprot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

/**
 * The slot element: a placeholder inside a web component that users can fill with their own markup.
 *
 * @see <a href="https://html.spec.whatwg.org/dev/scripting.html#the-slot-element">HTML Standard: the slot element</a>
 */
public non-sealed class Slot extends CommonElement implements FlowContent, PhrasingContent {
    private final static byte[] NAME = "slot".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Slot(Stream<GlobalAttribute> ga, Stream<? extends Element> childeren) {
        super(ga, childeren);
    }

    public Slot() {
        super();
    }
}
