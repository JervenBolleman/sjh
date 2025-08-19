package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Audio;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Embed;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Iframe;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Img;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Object;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Track;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Video;

public sealed interface EmbeddedContent extends Element permits Audio, Embed, Iframe, Img, Object, Track, Video {

}
