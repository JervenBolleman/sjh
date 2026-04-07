package swiss.sib.swissprot.sjh.attributes.microdata;

import swiss.sib.swissprot.sjh.attributes.rdfa.RdfaAttribute;
/**
 * @link https://html.spec.whatwg.org/multipage/microdata.html#introduction-7
 */
public sealed interface MicrodataAttribute extends RdfaAttribute permits Itemscope, Itemprop, Itemtype, Itemref, Itemid {

}
