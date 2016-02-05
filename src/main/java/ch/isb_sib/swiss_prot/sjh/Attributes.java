package ch.isb_sib.swiss_prot.sjh;

import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;


public class Attributes
{
	public static ch.isb_sib.swiss_prot.sjh.elements.meta.Style style()
	{
		return new ch.isb_sib.swiss_prot.sjh.elements.meta.Style();
	}

	public static ch.isb_sib.swiss_prot.sjh.attributes.global.Style style(String css)
	{
		return new ch.isb_sib.swiss_prot.sjh.attributes.global.Style(css);
	}

	public static Rel rel(String rel)
	{
		return new Rel(rel);
	}

	public static Href href(String url)
	{
		return new Href(url);
	}
}
