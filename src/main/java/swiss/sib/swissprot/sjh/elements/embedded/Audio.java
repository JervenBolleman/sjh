package swiss.sib.swissprot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Attribute;
import swiss.sib.swissprot.sjh.attributes.content.CrossOrigin;
import swiss.sib.swissprot.sjh.attributes.embedded.Autoplay;
import swiss.sib.swissprot.sjh.attributes.embedded.Controls;
import swiss.sib.swissprot.sjh.attributes.embedded.Loop;
import swiss.sib.swissprot.sjh.attributes.embedded.MediaGroup;
import swiss.sib.swissprot.sjh.attributes.embedded.Muted;
import swiss.sib.swissprot.sjh.attributes.embedded.Preload;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.elements.CommonElement;
import swiss.sib.swissprot.sjh.elements.contenttype.EmbeddedContent;
import swiss.sib.swissprot.sjh.elements.contenttype.FlowContent;
import swiss.sib.swissprot.sjh.elements.contenttype.InteractiveContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PalpabaleContent;
import swiss.sib.swissprot.sjh.elements.contenttype.PhrasingContent;

public non-sealed class Audio extends CommonElement
        implements FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent, PalpabaleContent {
    private final static byte[] NAME = "audio".getBytes(UTF_8);
    private final Src src;
    private final CrossOrigin co;
    private final Preload preload;
    private final Autoplay autoplay;
    private final MediaGroup mediagroup;
    private final Loop loop;
    private final Muted muted;
    private final Controls controls;

    @Override
    protected byte[] getName() {
        return NAME;
    }

    public Audio(Stream<GlobalAttribute> ga, Src src, CrossOrigin co, Preload preload, Autoplay autoplay,
            MediaGroup mediagroup, Loop loop, Muted muted, Controls controls, Stream<Track> tracks) {
        super(ga, tracks);
        this.src = src;
        this.co = co;
        this.preload = preload;
        this.autoplay = autoplay;
        this.mediagroup = mediagroup;
        this.loop = loop;
        this.muted = muted;
        this.controls = controls;
    }

    public Audio(Stream<GlobalAttribute> ga, CrossOrigin co, Preload preload, Autoplay autoplay, MediaGroup mediagroup,
            Loop loop, Muted muted, Controls controls, Stream<Source> sources, Stream<Track> tracks) {
        super(ga, Stream.concat(sources, tracks));
        this.src = null;
        this.co = co;
        this.preload = preload;
        this.autoplay = autoplay;
        this.mediagroup = mediagroup;
        this.loop = loop;
        this.muted = muted;
        this.controls = controls;
    }

    public Audio(Stream<GlobalAttribute> ga) {
        this(ga, Stream.empty());
    }

    public Audio(Stream<GlobalAttribute> ga, Stream<Track> track) {
        super(ga, track);
        this.src = null;
        this.co = null;
        this.preload = null;
        this.autoplay = null;
        this.mediagroup = null;
        this.loop = null;
        this.muted = null;
        this.controls = null;
    }

    @Override
    protected Stream<Attribute> getElementSpecificAttributes() {
        return Stream.of(src, co, preload, autoplay, mediagroup, loop, muted, controls).filter(Objects::nonNull);
    }
}
