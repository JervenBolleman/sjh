package ch.isb_sib.swiss_prot.sjh.elements.embedded;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;
import ch.isb_sib.swiss_prot.sjh.attributes.content.CrossOrigin;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Autoplay;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Controls;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Loop;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.MediaGroup;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Muted;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Preload;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.EmbeddedContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.InteractiveContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;


public class Audio
    extends CommonElement
    implements FlowContent, PhrasingContent, EmbeddedContent, InteractiveContent,
    PalpabaleContent
{
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
	protected byte[] getName()
	{
		return NAME;
	}

	public Audio(GlobalAttribute[] ga, Src src, CrossOrigin co, Preload preload, Autoplay autoplay,
	    MediaGroup mediagroup, Loop loop, Muted muted, Controls controls, Stream<Track> tracks)
	{
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

	public Audio(GlobalAttribute[] ga, CrossOrigin co, Preload preload, Autoplay autoplay,
	    MediaGroup mediagroup, Loop loop, Muted muted, Controls controls, Stream<Source> sources, Stream<Track> tracks)
	{
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

	public Audio(GlobalAttribute[] ga)
	{
		super(ga);
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
	protected Stream<Attribute> getElementSpecificAttributes()
	{
		return Stream.of(src, co, preload, autoplay, mediagroup, loop, muted, controls).filter(Objects::nonNull);
	}
}
