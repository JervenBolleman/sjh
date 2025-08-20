package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.script.Script;
import swiss.sib.swissprot.sjh.elements.script.Template;

public sealed interface ScriptSupporting extends Element permits Script, Template {

}
