package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public class Legend extends CommonElement {
    private final static byte[] NAME = "legend".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Legend(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childreren) {
        super(ga, childreren);
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.empty();
    }
}
