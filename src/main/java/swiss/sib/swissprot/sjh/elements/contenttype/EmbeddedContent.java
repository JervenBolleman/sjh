package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.embedded.Audio;
import swiss.sib.swissprot.sjh.elements.embedded.Embed;
import swiss.sib.swissprot.sjh.elements.embedded.Iframe;
import swiss.sib.swissprot.sjh.elements.embedded.Img;
import swiss.sib.swissprot.sjh.elements.embedded.Object;
import swiss.sib.swissprot.sjh.elements.embedded.Track;
import swiss.sib.swissprot.sjh.elements.embedded.Video;

public sealed interface EmbeddedContent extends Element permits Audio, Embed, Iframe, Img, Object, Track, Video {

}
