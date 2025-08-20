package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.embedded.Img;
import swiss.sib.swissprot.sjh.elements.embedded.Object;

public sealed interface FormAssociatedContent extends Element permits Img, Object {

}
