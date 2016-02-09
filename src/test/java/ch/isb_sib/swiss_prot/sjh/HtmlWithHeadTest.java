package ch.isb_sib.swiss_prot.sjh;

import org.junit.Test;

import ch.isb_sib.swiss_prot.sjh.Attributes;
import ch.isb_sib.swiss_prot.sjh.elements.HTML;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Head;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Body;

import static ch.isb_sib.swiss_prot.sjh.Elements.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class HtmlWithHeadTest
{
	@Test
	public void basichtml()
	    throws IOException
	{
		HTML html = html();
		test(html, "<!DOCTYPE html><html/>");
	}

	@Test
	public void basichtmlhead()
	    throws IOException
	{
		Head head = head(title("test"));
		Body body = body();
		HTML html = html(head, body);

		test(html, "<!DOCTYPE html><html><head><title>test</title></head><body/></html>");
	}

	@Test
	public void basichtmlheadlink()
	    throws IOException
	{
		Head head = head(title("test"), link(Attributes.href("/"), Attributes.rel("home")));
		Body body = body();
		HTML html = html(head, body);

		test(html,
		    "<!DOCTYPE html><html><head><title>test</title><link href=\"/\" rel=\"home\"/></head><body/></html>");
	}

	private void test(HTML html, String expectedRaw)
	    throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		html.render(boas);
		assertEquals(expectedRaw,
		    new String(boas.toByteArray(), UTF_8));
	}
}
