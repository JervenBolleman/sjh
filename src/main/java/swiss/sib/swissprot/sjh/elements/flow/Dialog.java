package swiss.sib.swissprot.sjh.elements.flow;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.Open;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.SectioningRoot;

/**
 * The dialog element represents a part of an application that a user interacts with to perform a task, for example a
 * dialog box, inspector, or window. The open attribute is a boolean attribute. When specified, it indicates that the
 * dialog element is active and that the user can interact with it. A dialog element without an open attribute specified
 * should not be shown to the user. This requirement may be implemented indirectly through the style layer. For example,
 * user agents that support the suggested default rendering implement this requirement using the CSS rules described in
 * the rendering section.
 */
public non-sealed class Dialog extends CommonElement implements FlowContent, SectioningRoot {
    private final static byte[] NAME = "dialog".getBytes(UTF_8);
    private final Open open;

    public Dialog(Stream<GlobalAttribute> ga, Open open) {
        super(ga, Stream.empty());
        this.open = open;
    }

    @Override
    protected byte[] getName() {
        return NAME;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        if (open != null)
            return Stream.of(open);
        else
            return Stream.empty();
    }

}
