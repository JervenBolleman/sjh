package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Map extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "map".getBytes(UTF_8);
    private final Name name;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Map(Stream<GlobalAttribute> ga, Name name, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
        this.name = name;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (name != null)
            return Stream.of(name);
        else
            return Stream.empty();
    }
}
