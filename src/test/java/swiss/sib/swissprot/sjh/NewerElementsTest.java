package swiss.sib.swissprot.sjh;

import static org.junit.Assert.assertEquals;
import static swiss.sib.swissprot.sjh.Attributes.id;
import static swiss.sib.swissprot.sjh.Elements.del;
import static swiss.sib.swissprot.sjh.Elements.details;
import static swiss.sib.swissprot.sjh.Elements.dialog;
import static swiss.sib.swissprot.sjh.Elements.hgroup;
import static swiss.sib.swissprot.sjh.Elements.ins;
import static swiss.sib.swissprot.sjh.Elements.menu;
import static swiss.sib.swissprot.sjh.Elements.picture;
import static swiss.sib.swissprot.sjh.Elements.search;
import static swiss.sib.swissprot.sjh.Elements.selectedcontent;
import static swiss.sib.swissprot.sjh.Elements.slot;
import static swiss.sib.swissprot.sjh.Elements.summary;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import org.junit.Test;

import swiss.sib.swissprot.sjh.attributes.content.Open;
import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.embedded.Img;

public class NewerElementsTest {
    private static String render(Element element) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        element.render(out);
        return out.toString(StandardCharsets.UTF_8);
    }

    @Test
    public void edits() throws IOException {
        assertEquals("<del id=\"a\">old</del>", render(del(id("a"), "old")));
        assertEquals("<ins id=\"a\">new</ins>", render(ins(id("a"), "new")));
    }

    @Test
    public void slotAndSearch() throws IOException {
        assertEquals("<slot/>", render(slot()));
        assertEquals("<search id=\"s\"/>", render(search(id("s"))));
    }

    @Test
    public void selectedContent() throws IOException {
        assertEquals("<selectedcontent/>", render(selectedcontent()));
    }

    @Test
    public void summaryAndDetails() throws IOException {
        assertEquals("<details id=\"d\"><summary id=\"s\">More</summary></details>",
                render(details(id("d"), summary(id("s"), "More"))));
    }

    @Test
    public void dialogWithContent() throws IOException {
        assertEquals("<dialog id=\"d\"><search/></dialog>", render(dialog(id("d"), search())));
        assertEquals("<dialog id=\"d\" open/>", render(dialog(id("d"), Open.TRUE)));
    }

    @Test
    public void menuAndHgroup() throws IOException {
        assertEquals("<menu id=\"m\">x</menu>", render(menu(id("m"), "x")));
        assertEquals("<hgroup id=\"h\"/>", render(hgroup(id("h"), Stream.empty())));
    }

    private static Img img() {
        return Elements.img(new swiss.sib.swissprot.sjh.attributes.embedded.Src("a.png"));
    }

    @Test
    public void pictureWithImage() throws IOException {
        assertEquals("<picture id=\"p\">" + render(img()) + "</picture>", render(picture(id("p"), img())));
    }
}
