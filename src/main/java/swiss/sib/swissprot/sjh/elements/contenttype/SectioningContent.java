package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.grouping.Figure;
import swiss.sib.swissprot.sjh.elements.sections.Article;
import swiss.sib.swissprot.sjh.elements.sections.Aside;
import swiss.sib.swissprot.sjh.elements.sections.Nav;
import swiss.sib.swissprot.sjh.elements.sections.Section;
import swiss.sib.swissprot.sjh.elements.sections.header.H1;
import swiss.sib.swissprot.sjh.elements.sections.header.H2;
import swiss.sib.swissprot.sjh.elements.sections.header.H3;
import swiss.sib.swissprot.sjh.elements.sections.header.H4;
import swiss.sib.swissprot.sjh.elements.sections.header.H5;
import swiss.sib.swissprot.sjh.elements.sections.header.H6;

public sealed interface SectioningContent extends Element
        permits Article, Aside, Figure, H1, H2, H3, H4, H5, H6, Nav, Section {

}
