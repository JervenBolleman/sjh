package swiss.sib.swissprot.sjh.attributes.rdfa.core;

import swiss.sib.swissprot.sjh.attributes.content.Rel;
import swiss.sib.swissprot.sjh.attributes.meta.Content;
import swiss.sib.swissprot.sjh.attributes.rdfa.RdfaAttribute;

public sealed interface RdfaCoreAttribute extends RdfaAttribute permits Content, Datatype, Rel, Rev, Inlist, Resource, About {

}
