package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;

/**
 * The selectedcontent element: shows the content of the selected option inside the button of a customizable select. The
 * browser fills it in, so it has no content.
 *
 * @see <a href="https://html.spec.whatwg.org/dev/form-elements.html#the-selectedcontent-element">HTML Standard: the selectedcontent element</a>
 */
public class SelectedContent extends CommonElement {
    private final static byte[] NAME = "selectedcontent".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public SelectedContent(Stream<GlobalAttribute> ga) {
        super(ga, Stream.empty());
    }

    public SelectedContent() {
        super();
    }
}
