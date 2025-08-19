package ch.isb_sib.swiss_prot.sjh.attributes.embedded;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

@SuppressWarnings("deprecation")
public sealed interface EmbeddedAttribute extends Attribute
	permits Alt, Autoplay, Controls, Coords, Data, Default, Form, Height, Label, IsMap, MediaGroup, Muted, Poster,
	Preload, SandBox, Shape, Src, SrcDoc, SrcLang, TypeMustMatch, UseMap, Width {

}
