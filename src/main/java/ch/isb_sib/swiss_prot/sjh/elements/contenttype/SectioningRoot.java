package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.flow.Dialog;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.BlockQuote;
import ch.isb_sib.swiss_prot.sjh.elements.interactive.Details;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Body;

public sealed interface SectioningRoot extends Element permits BlockQuote, Body, Details, Dialog {

}
