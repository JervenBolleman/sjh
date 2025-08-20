package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.sections.header.H1;
import swiss.sib.swissprot.sjh.elements.sections.header.H2;
import swiss.sib.swissprot.sjh.elements.sections.header.H3;
import swiss.sib.swissprot.sjh.elements.sections.header.H4;
import swiss.sib.swissprot.sjh.elements.sections.header.H5;
import swiss.sib.swissprot.sjh.elements.sections.header.H6;
import swiss.sib.swissprot.sjh.elements.sections.header.HGroup;

/**
 * Heading content defines the header of a section (whether explicitly marked up using sectioning content elements, or
 * implied by the heading content itself). h1,h2,h3,h4,h5,h6,hgroup
 */
public sealed interface HeadingContent extends Element permits H1, H2, H3, H4, H5, H6, HGroup {

}
