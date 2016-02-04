package ch.isb_sib.swiss_prot.sjh;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.content.CrossOrigin;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.elements.Body;
import ch.isb_sib.swiss_prot.sjh.elements.HTML;
import ch.isb_sib.swiss_prot.sjh.elements.Head;
import ch.isb_sib.swiss_prot.sjh.elements.Link;
import ch.isb_sib.swiss_prot.sjh.elements.MetaContent;
import ch.isb_sib.swiss_prot.sjh.elements.Text;
import ch.isb_sib.swiss_prot.sjh.elements.Title;


public class Elements
{
	public static HTML html()
	{
		return new HTML();
	}

	public static Head head(Title title)
	{
		return new Head(title);
	}

	public static Head head(Title title, MetaContent... metacontent)
	{
		return new Head(title, Stream.of(metacontent));
	}

	public static Title title(String title)
	{
		return new Title(new Text(title));
	}

	public static Body body()
	{
		return new Body();
	}

	public static HTML html(Head head, Body body)
	{
		return new HTML(head, body);
	}

	public static Link link(Href href, Rel rel)
	{
		return new Link(null, href, null, rel, null, null, null, null);
	}

	public static Href href(String url)
	{
		return new Href(url);
	}

	public static Rel rel(String rel)
	{
		return new Rel(rel);
	}
}
