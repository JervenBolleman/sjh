package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.form.High;
import swiss.sib.swissprot.sjh.attributes.form.Low;
import swiss.sib.swissprot.sjh.attributes.form.Max;
import swiss.sib.swissprot.sjh.attributes.form.Min;
import swiss.sib.swissprot.sjh.attributes.form.Optimum;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.grouping.Value;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Meter extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "meter".getBytes(UTF_8);
    private final Max max;
    private final Value value;
    private final High high;
    private final Min min;
    private final Low low;
    private final Optimum optimum;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Meter(Stream<GlobalAttribute> ga, Value value, Min min, Max max, Low low, High high, Optimum optimum) {
        super(ga, Stream.empty());
        this.value = value;
        this.min = min;
        this.max = max;
        this.low = low;
        this.high = high;
        this.optimum = optimum;

    }

    public Meter(Stream<GlobalAttribute> ga, Value value, Min min, Max max, Low low, Optimum optimum, High high,
            Stream<? extends PhrasingContent> childeren) {
        super(ga, childeren);
        this.value = value;
        this.min = min;
        this.max = max;
        this.low = low;
        this.optimum = optimum;
        this.high = high;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(value, max, min, low, high, optimum).filter(Objects::nonNull);
    }
}
