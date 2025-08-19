package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.EmbeddedContent;

public non-sealed class Track extends CommonElement implements EmbeddedContent {
    private final static byte[] NAME = "track".getBytes(UTF_8);
    private final Src src;
    private final Type type;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Track(Stream<GlobalAttribute> ga, Src src, Type type) {
        super(ga, Stream.empty());
        this.src = src;
        this.type = type;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (src != null) {
            if (type != null)
                return Stream.of(src, type);
            else
                return Stream.of(src);
        } else if (type != null)
            return Stream.of(type);
        else
            return Stream.empty();
    }
}
