package swiss.sib.swissprot.sjh.elements.table;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.script.Template;

public sealed interface ColOrTemplate extends Element permits Col, Template {

}
