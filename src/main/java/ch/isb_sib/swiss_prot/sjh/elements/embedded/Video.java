package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.CrossOrigin;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Autoplay;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Controls;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Loop;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.MediaGroup;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Muted;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Poster;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Preload;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.EmbeddedContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class Video extends CommonElement
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
