package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Link;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Meta;
import ch.isb_sib.swiss_prot.sjh.elements.script.Canvas;
import ch.isb_sib.swiss_prot.sjh.elements.script.NoScript;
import ch.isb_sib.swiss_prot.sjh.elements.script.Script;
import ch.isb_sib.swiss_prot.sjh.elements.script.Template;

public sealed interface MetaContent extends Element permits Link, Meta, Canvas, NoScript, Script, Template {

}
