package swiss.sib.swissprot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.MetaContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;
import swiss.sib.swissprot.sjh.elements.contenttype.ScriptSupporting;
import swiss.sib.swissprot.sjh.elements.table.ColOrTemplate;

public non-sealed class Template extends CommonElement
        implements FlowContent, PhrasingContent, MetaContent, PalpabaleContent, ColOrTemplate, ScriptSupporting {
    private final static byte[] NAME = "template".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Template(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
    }

    public Template() {
        super();
    }
}
