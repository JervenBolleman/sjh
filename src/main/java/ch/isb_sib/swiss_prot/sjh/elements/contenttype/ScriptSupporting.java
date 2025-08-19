package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.script.Script;
import ch.isb_sib.swiss_prot.sjh.elements.script.Template;

public sealed interface ScriptSupporting extends Element permits Script, Template {

}
