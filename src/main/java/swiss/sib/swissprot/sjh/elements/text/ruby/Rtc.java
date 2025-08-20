package swiss.sib.swissprot.sjh.elements.text.ruby;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

@Deprecated(since = "0.1.0")
public non-sealed class Rtc extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "rtc".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Rtc(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren) {
        super(ga, childeren);
    }

    public Rtc() {
        super();
    }
}
