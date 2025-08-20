package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.form.Max;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.grouping.Value;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Progress extends CommonElement
        implements FlowContent, PhrasingContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "progress".getBytes(UTF_8);
    private final Max max;
    private final Value value;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Progress(Stream<GlobalAttribute> ga, Value value, Max max) {
        super(ga, Stream.empty());
        this.value = value;
        this.max = max;

    }

    public Progress(Stream<GlobalAttribute> ga, Value value, Max max, Stream<? extends PhrasingContent> childeren) {
        super(ga, childeren);
        this.value = value;
        this.max = max;

    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(this.value, this.max).filter(Objects::nonNull);
    }
}
