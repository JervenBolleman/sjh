package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Audio;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Embed;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Iframe;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Img;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Object;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Video;
import ch.isb_sib.swiss_prot.sjh.elements.form.Button;
import ch.isb_sib.swiss_prot.sjh.elements.form.FieldSet;
import ch.isb_sib.swiss_prot.sjh.elements.form.Input;
import ch.isb_sib.swiss_prot.sjh.elements.form.KeyGen;
import ch.isb_sib.swiss_prot.sjh.elements.form.Label;
import ch.isb_sib.swiss_prot.sjh.elements.form.Meter;
import ch.isb_sib.swiss_prot.sjh.elements.form.Output;
import ch.isb_sib.swiss_prot.sjh.elements.form.Progress;
import ch.isb_sib.swiss_prot.sjh.elements.form.Select;
import ch.isb_sib.swiss_prot.sjh.elements.form.TextArea;
import ch.isb_sib.swiss_prot.sjh.elements.interactive.Details;
import ch.isb_sib.swiss_prot.sjh.elements.text.A;

@SuppressWarnings("deprecation")
public sealed interface InteractiveContent extends Element permits A, Audio, Button, Details, Embed, FieldSet, Iframe,
        Img, Input, KeyGen, Label, Meter, Object, Output, Progress, Select, TextArea, Video {

}
