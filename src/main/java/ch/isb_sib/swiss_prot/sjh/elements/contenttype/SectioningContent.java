package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Figure;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Article;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Aside;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Nav;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Section;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H1;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H2;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H3;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H4;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H5;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H6;

public sealed interface SectioningContent extends Element
	permits Article, Aside, Figure, H1, H2, H3, H4, H5, H6, Nav, Section {

}
