package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Img;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Object;

public sealed interface FormAssociatedContent extends Element permits Img, Object {

}
