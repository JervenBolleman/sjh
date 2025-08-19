package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Data extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "data".getBytes(UTF_8);
    private final Value value;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Data(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren, Value value) {
        super(ga, childeren);
        this.value = value;
    }

    public Data(Stream<? extends PhrasingContent> childeren) {
        super(Stream.<GlobalAttribute> empty(), childeren);
        this.value = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (value != null)
            return Stream.of(value);
        else
            return Stream.empty();
    }

}
