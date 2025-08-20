package swiss.sib.swissprot.sjh;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;
import static swiss.sib.swissprot.sjh.Elements.body;
import static swiss.sib.swissprot.sjh.Elements.div;
import static swiss.sib.swissprot.sjh.Elements.head;
import static swiss.sib.swissprot.sjh.Elements.html;
import static swiss.sib.swissprot.sjh.Elements.li;
import static swiss.sib.swissprot.sjh.Elements.link;
import static swiss.sib.swissprot.sjh.Elements.main;
import static swiss.sib.swissprot.sjh.Elements.ol;
import static swiss.sib.swissprot.sjh.Elements.p;
import static swiss.sib.swissprot.sjh.Elements.title;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import swiss.sib.swissprot.sjh.Attributes;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.HTML;
import swiss.sib.swissprot.sjh.elements.grouping.LI;
import swiss.sib.swissprot.sjh.elements.grouping.OL;
import swiss.sib.swissprot.sjh.elements.meta.Head;
import swiss.sib.swissprot.sjh.elements.sections.Body;

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

        test(html, """
                <!DOCTYPE html><html><head><title>test</title><link href="/" rel="home"/></head><body/></html>""");
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
                """
                        <!DOCTYPE html><html><head><title>test</title><link href="/" rel="home"/></head><body><main/><div/></body></html>""");
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
                """
                        <!DOCTYPE html><html><head><title>test</title><link href="/" rel="home"/></head><body><main/><div><ol><li>me</li><li>you</li></ol></div></body></html>""");
    }

    private void test(Element html, String expectedRaw) throws IOException {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        html.render(boas);
        assertEquals(expectedRaw, new String(boas.toByteArray(), UTF_8));
    }

}
