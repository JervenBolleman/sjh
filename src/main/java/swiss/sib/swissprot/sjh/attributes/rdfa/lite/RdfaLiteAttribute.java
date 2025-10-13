package swiss.sib.swissprot.sjh.attributes.rdfa.lite;

import swiss.sib.swissprot.sjh.attributes.rdfa.RdfaAttribute;

public sealed interface RdfaLiteAttribute extends RdfaAttribute permits Vocab, Typeof, Property, Resource, Prefix {

}
