package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.flow.Dialog;
import swiss.sib.swissprot.sjh.elements.grouping.BlockQuote;
import swiss.sib.swissprot.sjh.elements.interactive.Details;
import swiss.sib.swissprot.sjh.elements.sections.Body;

public sealed interface SectioningRoot extends Element permits BlockQuote, Body, Details, Dialog {

}
