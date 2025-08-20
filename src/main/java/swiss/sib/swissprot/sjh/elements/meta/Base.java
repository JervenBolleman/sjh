package swiss.sib.swissprot.sjh.elements.meta;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.Href;
import swiss.sib.swissprot.sjh.attributes.content.Target;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;

public class Base extends CommonElement {
    private final static byte[] NAME = "base".getBytes(UTF_8);
    private final Href href;
    private final Target target;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Base(Stream<GlobalAttribute> ga, Href href, Target target) {
        super(ga, Stream.empty());
        this.href = href;
        this.target = target;
    }

    public Base() {
        super();
        this.href = null;
        this.target = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (href != null && target != null)
            return Stream.of(href, target);
        else if (href != null)
            return Stream.of(href);
        else if (target != null)
            return Stream.of(target);
        else
            return Stream.empty();
    }

    public Base(Href href, Target target) {
        super();
        this.href = href;
        this.target = target;
    }
}
