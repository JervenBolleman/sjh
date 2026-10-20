package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.EmbeddedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

/**
 * The picture element: lets the browser choose between several sources for the image that it contains.
 *
 * @see <a href="https://html.spec.whatwg.org/dev/embedded-content.html#the-picture-element">HTML Standard: the picture element</a>
 */
public non-sealed class Picture extends CommonElement implements FlowContent, PhrasingContent, EmbeddedContent {
    private final static byte[] NAME = "picture".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Picture(Stream<GlobalAttribute> ga, Stream<Source> sources, Img img) {
        super(ga, Stream.concat(sources, Stream.of(img)));
    }
}
