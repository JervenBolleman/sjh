package swiss.sib.swissprot.sjh.elements.script;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.MetaContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

/**
 * The noscript element represents nothing if scripting is enabled, and represents its children if scripting is
 * disabled. It is used to present different markup to user agents that support scripting and those that don't support
 * scripting, by affecting how the document is parsed.
 */
public non-sealed class NoScript extends CommonElement implements FlowContent, PhrasingContent, MetaContent {
    private final static byte[] NAME = "noscript".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public NoScript(Stream<GlobalAttribute> ga, Stream<? extends FlowContent> childeren) {
        super(ga, childeren);
    }

    public NoScript() {
        super();
    }
}
