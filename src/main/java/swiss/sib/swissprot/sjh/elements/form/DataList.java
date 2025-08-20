package swiss.sib.swissprot.sjh.elements.form;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class DataList<T extends Element> extends CommonElement implements FlowContent, PhrasingContent {
    private final static byte[] NAME = "datalist".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public DataList(Stream<GlobalAttribute> ga, Stream<T> childeren) {
        super(ga, childeren);
    }
}
