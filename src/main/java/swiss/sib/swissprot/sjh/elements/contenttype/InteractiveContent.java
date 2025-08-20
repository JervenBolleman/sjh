package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.embedded.Audio;
import swiss.sib.swissprot.sjh.elements.embedded.Embed;
import swiss.sib.swissprot.sjh.elements.embedded.Iframe;
import swiss.sib.swissprot.sjh.elements.embedded.Img;
import swiss.sib.swissprot.sjh.elements.embedded.Object;
import swiss.sib.swissprot.sjh.elements.embedded.Video;
import swiss.sib.swissprot.sjh.elements.form.Button;
import swiss.sib.swissprot.sjh.elements.form.FieldSet;
import swiss.sib.swissprot.sjh.elements.form.Input;
import swiss.sib.swissprot.sjh.elements.form.KeyGen;
import swiss.sib.swissprot.sjh.elements.form.Label;
import swiss.sib.swissprot.sjh.elements.form.Meter;
import swiss.sib.swissprot.sjh.elements.form.Output;
import swiss.sib.swissprot.sjh.elements.form.Progress;
import swiss.sib.swissprot.sjh.elements.form.Select;
import swiss.sib.swissprot.sjh.elements.form.TextArea;
import swiss.sib.swissprot.sjh.elements.interactive.Details;
import swiss.sib.swissprot.sjh.elements.text.A;

@SuppressWarnings("deprecation")
public sealed interface InteractiveContent extends Element permits A, Audio, Button, Details, Embed, FieldSet, Iframe,
        Img, Input, KeyGen, Label, Meter, Object, Output, Progress, Select, TextArea, Video {

}
