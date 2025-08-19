package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Reversed;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Start;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;

public non-sealed class OL extends CommonElement implements FlowContent, PalpabaleContent {
    private final static byte[] NAME = "ol".getBytes(UTF_8);
    private final Reversed rev;
    private final Start start;
    private final Type type;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public OL(Stream<GlobalAttribute> ga, Reversed rev, Start start, Type type, Stream<LI> childeren) {
        super(ga, childeren);
        this.rev = rev;
        this.start = start;
        this.type = type;
    }

    public OL() {
        this(Stream.empty());

    }

    public OL(Stream<LI> childeren) {
        super(Stream.<GlobalAttribute> empty(), childeren);
        this.rev = null;
        this.start = null;
        this.type = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(rev, start, type).filter(Objects::nonNull);
    }
}
