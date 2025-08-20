package swiss.sib.swissprot.sjh.attributes.content;

import swiss.sib.swissprot.sjh.attributes.Attribute;

public sealed interface ContentAttribute extends Attribute
        permits CrossOrigin, Href, HrefLang, Media, NoModule, Open, Rel, Sizes, Target, Type {

}
