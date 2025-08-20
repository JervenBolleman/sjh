package swiss.sib.swissprot.sjh.attributes.embedded;

import swiss.sib.swissprot.sjh.attributes.Attribute;

@SuppressWarnings("deprecation")
public sealed interface EmbeddedAttribute extends Attribute
        permits Alt, Autoplay, Controls, Coords, Data, Default, Form, Height, Label, IsMap, MediaGroup, Muted, Poster,
        Preload, SandBox, Shape, Src, SrcDoc, SrcLang, TypeMustMatch, UseMap, Width {

}
