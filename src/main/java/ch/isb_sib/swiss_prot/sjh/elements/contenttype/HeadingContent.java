package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H1;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H2;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H3;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H4;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H5;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H6;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.HGroup;

/**
 * Heading content defines the header of a section (whether explicitly marked up
 * using sectioning content elements, or implied by the heading content itself).
 * 
 * h1,h2,h3,h4,h5,h6,hgroup
 *
 * 
 */
public sealed interface HeadingContent extends Element permits H1, H2, H3, H4, H5, H6, HGroup {

}
