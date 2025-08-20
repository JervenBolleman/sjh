package swiss.sib.swissprot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.DateTime;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Time extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "time".getBytes(UTF_8);
    private final DateTime datetime;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Time(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren, DateTime datetime) {
        super(ga, childeren);
        this.datetime = datetime;
    }

    public Time() {
        super();
        datetime = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (datetime != null)
            return Stream.of(datetime);
        else
            return Stream.empty();
    }
}
