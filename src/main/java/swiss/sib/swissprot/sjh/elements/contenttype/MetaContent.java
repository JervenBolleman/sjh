package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.meta.Link;
import swiss.sib.swissprot.sjh.elements.meta.Meta;
import swiss.sib.swissprot.sjh.elements.script.Canvas;
import swiss.sib.swissprot.sjh.elements.script.NoScript;
import swiss.sib.swissprot.sjh.elements.script.Script;
import swiss.sib.swissprot.sjh.elements.script.Template;

public sealed interface MetaContent extends Element permits Link, Meta, Canvas, NoScript, Script, Template {

}
