package ch.isb_sib.swiss_prot.sjh.elements.table;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.script.Template;

public sealed interface ColOrTemplate extends Element permits Col, Template {

}
