package ch.isb_sib.swiss_prot.sjh;

import static ch.isb_sib.swiss_prot.sjh.Elements.body;
import static ch.isb_sib.swiss_prot.sjh.Elements.div;
import static ch.isb_sib.swiss_prot.sjh.Elements.head;
import static ch.isb_sib.swiss_prot.sjh.Elements.html;
import static ch.isb_sib.swiss_prot.sjh.Elements.li;
import static ch.isb_sib.swiss_prot.sjh.Elements.link;
import static ch.isb_sib.swiss_prot.sjh.Elements.main;
import static ch.isb_sib.swiss_prot.sjh.Elements.ol;
import static ch.isb_sib.swiss_prot.sjh.Elements.p;
import static ch.isb_sib.swiss_prot.sjh.Elements.title;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.HTML;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.LI;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.OL;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Head;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Body;

public class HtmlWithHeadTest {
    @Test
    public void basichtml() throws IOException {
	HTML html = html();
	test(html, "<!DOCTYPE html><html/>");
    }

    @Test
    public void basichtmlhead() throws IOException {
	Head head = head(title("test"));
	Body body = body();
	HTML html = html(head, body);

	test(html, "<!DOCTYPE html><html><head><title>test</title></head><body/></html>");
    }

    @Test
    public void basichtmlheadlink() throws IOException {
	Head head = head(title("test"), link(Attributes.href("/"), Attributes.rel("home")));
	Body body = body();
	HTML html = html(head, body);

	test(html,
		"<!DOCTYPE html><html><head><title>test</title><link href=\"/\" rel=\"home\"/></head><body/></html>");
    }

    // @Test
    // public void cantdivinp() throws IOException {
    //
    // Does not compile!
    // test(p(div()),
    // "<p><div/></p>");
    // }

    @Test
    public void canpindiv() throws IOException {
	test(div(p()), "<div><p/></div>");
    }

    @Test
    public void basichtmlheadlinkbody() throws IOException {
	Head head = head(title("test"), link(Attributes.href("/"), Attributes.rel("home")));
	Body body = body(main(), div());
	HTML html = html(head, body);

	test(html,
		"<!DOCTYPE html><html><head><title>test</title><link href=\"/\" rel=\"home\"/></head><body><main/><div/></body></html>");
    }

    @Test
    public void basichtmlheadlinkbodyolusers() throws IOException {
	Head head = head(title("test"), link(Attributes.href("/"), Attributes.rel("home")));
	List<String> users = new ArrayList<>();
	users.add("me");
	users.add("you");

	Stream<LI> map = users.stream().map(u -> li(u));
	OL orderedListOfUser = ol(map);
	Body body = body(main(), div(orderedListOfUser));
	HTML html = html(head, body);

	test(html,
		"<!DOCTYPE html><html><head><title>test</title><link href=\"/\" rel=\"home\"/></head><body><main/><div><ol><li>me</li><li>you</li></ol></div></body></html>");
    }

    private void test(Element html, String expectedRaw) throws IOException {
	ByteArrayOutputStream boas = new ByteArrayOutputStream();
	html.render(boas);
	assertEquals(expectedRaw, new String(boas.toByteArray(), UTF_8));
    }
}
