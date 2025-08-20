package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.CrossOrigin;
import swiss.sib.swissprot.sjh.attributes.embedded.Autoplay;
import swiss.sib.swissprot.sjh.attributes.embedded.Controls;
import swiss.sib.swissprot.sjh.attributes.embedded.Height;
import swiss.sib.swissprot.sjh.attributes.embedded.Loop;
import swiss.sib.swissprot.sjh.attributes.embedded.MediaGroup;
import swiss.sib.swissprot.sjh.attributes.embedded.Muted;
import swiss.sib.swissprot.sjh.attributes.embedded.Poster;
import swiss.sib.swissprot.sjh.attributes.embedded.Preload;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.embedded.Width;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.EmbeddedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Video extends CommonElement
        implements FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "video".getBytes(UTF_8);
    private final Src src;
    private final CrossOrigin co;
    private final Poster poster;
    private final Preload preload;
    private final Autoplay autoplay;
    private final MediaGroup mediagroup;
    private final Loop loop;
    private final Muted muted;
    private final Controls controls;
    private final Width width;
    private final Height height;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Video(Stream<GlobalAttribute> ga, Src src, CrossOrigin co, Poster poster, Preload preload, Autoplay autoplay,
            MediaGroup mediagroup, Loop loop, Muted muted, Controls controls, Width width, Height height,
            Stream<Track> tracks) {
        super(ga, tracks);
        this.src = src;
        this.co = co;
        this.poster = poster;
        this.preload = preload;
        this.autoplay = autoplay;
        this.mediagroup = mediagroup;
        this.loop = loop;
        this.muted = muted;
        this.controls = controls;
        this.width = width;
        this.height = height;
    }

    public Video(Stream<GlobalAttribute> ga, CrossOrigin co, Poster poster, Preload preload, Autoplay autoplay,
            MediaGroup mediagroup, Loop loop, Muted muted, Controls controls, Width width, Height height,
            Stream<Source> sources, Stream<Track> tracks) {
        super(ga, Stream.concat(sources, tracks));
        this.src = null;
        this.co = co;
        this.poster = poster;
        this.preload = preload;
        this.autoplay = autoplay;
        this.mediagroup = mediagroup;
        this.loop = loop;
        this.muted = muted;
        this.controls = controls;
        this.width = width;
        this.height = height;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(src, co, poster, preload, autoplay, mediagroup, loop, muted, controls, width, height)
                .filter(Objects::nonNull);
    }
}
