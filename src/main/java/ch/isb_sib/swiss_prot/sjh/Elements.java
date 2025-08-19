package ch.isb_sib.swiss_prot.sjh;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.DateTime;
import static ch.isb_sib.swiss_prot.sjh.Attributes.ga;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Checked;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Disabled;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Selected;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Clazz;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Id;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Reversed;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Start;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.HTML;
import ch.isb_sib.swiss_prot.sjh.elements.Text;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.MetaContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Area;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Audio;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Embed;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Iframe;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Img;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Map;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Object;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Param;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Source;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Track;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Video;
import ch.isb_sib.swiss_prot.sjh.elements.form.Button;
import ch.isb_sib.swiss_prot.sjh.elements.form.DataList;
import ch.isb_sib.swiss_prot.sjh.elements.form.FieldSet;
import ch.isb_sib.swiss_prot.sjh.elements.form.Form;
import ch.isb_sib.swiss_prot.sjh.elements.form.Input;
import ch.isb_sib.swiss_prot.sjh.elements.form.KeyGen;
import ch.isb_sib.swiss_prot.sjh.elements.form.Label;
import ch.isb_sib.swiss_prot.sjh.elements.form.Legend;
import ch.isb_sib.swiss_prot.sjh.elements.form.Meter;
import ch.isb_sib.swiss_prot.sjh.elements.form.OptGroup;
import ch.isb_sib.swiss_prot.sjh.elements.form.Option;
import ch.isb_sib.swiss_prot.sjh.elements.form.OptionOrOptGroup;
import ch.isb_sib.swiss_prot.sjh.elements.form.Output;
import ch.isb_sib.swiss_prot.sjh.elements.form.Progress;
import ch.isb_sib.swiss_prot.sjh.elements.form.Select;
import ch.isb_sib.swiss_prot.sjh.elements.form.TextArea;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.BlockQuote;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.DD;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.DL;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.DT;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Div;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.DtOrDd;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.FigCaption;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Figure;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.HR;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.LI;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Main;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.OL;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.P;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Pre;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.UL;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Base;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Head;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Link;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Meta;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Style;
import ch.isb_sib.swiss_prot.sjh.elements.meta.Title;
import ch.isb_sib.swiss_prot.sjh.elements.script.Canvas;
import ch.isb_sib.swiss_prot.sjh.elements.script.NoScript;
import ch.isb_sib.swiss_prot.sjh.elements.script.Script;
import ch.isb_sib.swiss_prot.sjh.elements.script.Template;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Address;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Article;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Aside;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Body;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Footer;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Header;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Nav;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Section;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H1;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H2;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H3;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H4;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H5;
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.H6;
import ch.isb_sib.swiss_prot.sjh.elements.table.Caption;
import ch.isb_sib.swiss_prot.sjh.elements.table.Col;
import ch.isb_sib.swiss_prot.sjh.elements.table.ColGroup;
import ch.isb_sib.swiss_prot.sjh.elements.table.ColOrTemplate;
import ch.isb_sib.swiss_prot.sjh.elements.table.TBody;
import ch.isb_sib.swiss_prot.sjh.elements.table.TD;
import ch.isb_sib.swiss_prot.sjh.elements.table.TDOrTH;
import ch.isb_sib.swiss_prot.sjh.elements.table.TFoot;
import ch.isb_sib.swiss_prot.sjh.elements.table.TH;
import ch.isb_sib.swiss_prot.sjh.elements.table.THead;
import ch.isb_sib.swiss_prot.sjh.elements.table.TR;
import ch.isb_sib.swiss_prot.sjh.elements.table.Table;
import ch.isb_sib.swiss_prot.sjh.elements.text.A;
import ch.isb_sib.swiss_prot.sjh.elements.text.Abbr;
import ch.isb_sib.swiss_prot.sjh.elements.text.B;
import ch.isb_sib.swiss_prot.sjh.elements.text.Bdi;
import ch.isb_sib.swiss_prot.sjh.elements.text.Bdo;
import ch.isb_sib.swiss_prot.sjh.elements.text.Br;
import ch.isb_sib.swiss_prot.sjh.elements.text.Cite;
import ch.isb_sib.swiss_prot.sjh.elements.text.Code;
import ch.isb_sib.swiss_prot.sjh.elements.text.Data;
import ch.isb_sib.swiss_prot.sjh.elements.text.Dfn;
import ch.isb_sib.swiss_prot.sjh.elements.text.Em;
import ch.isb_sib.swiss_prot.sjh.elements.text.I;
import ch.isb_sib.swiss_prot.sjh.elements.text.Kbd;
import ch.isb_sib.swiss_prot.sjh.elements.text.Mark;
import ch.isb_sib.swiss_prot.sjh.elements.text.Q;
import ch.isb_sib.swiss_prot.sjh.elements.text.S;
import ch.isb_sib.swiss_prot.sjh.elements.text.Samp;
import ch.isb_sib.swiss_prot.sjh.elements.text.Small;
import ch.isb_sib.swiss_prot.sjh.elements.text.Span;
import ch.isb_sib.swiss_prot.sjh.elements.text.Strong;
import ch.isb_sib.swiss_prot.sjh.elements.text.Sub;
import ch.isb_sib.swiss_prot.sjh.elements.text.Sup;
import ch.isb_sib.swiss_prot.sjh.elements.text.Time;
import ch.isb_sib.swiss_prot.sjh.elements.text.U;
import ch.isb_sib.swiss_prot.sjh.elements.text.Var;
import ch.isb_sib.swiss_prot.sjh.elements.text.WBr;
import ch.isb_sib.swiss_prot.sjh.elements.text.ruby.Rb;
import ch.isb_sib.swiss_prot.sjh.elements.text.ruby.Rp;
import ch.isb_sib.swiss_prot.sjh.elements.text.ruby.Rt;
import ch.isb_sib.swiss_prot.sjh.elements.text.ruby.Rtc;
import ch.isb_sib.swiss_prot.sjh.elements.text.ruby.Ruby;

@SuppressWarnings("unused")
public class Elements {
    public static HTML html() {
	return new HTML();
    }

    public static HTML html(Head head, Body body) {
	return new HTML(head, body);
    }

    public static Head head(Title title) {
	return new Head(title);
    }

    public static Head head(Title title, MetaContent... metacontent) {
	return new Head(title, Stream.of(metacontent));
    }

    public static Title title(String title) {
	return new Title(new Text(title));
    }

    public static Base base() {
	return new Base();
    }

    public static Meta meta() {
	return new Meta(null, null, null, null, null);
    }

    public static Link link(Href href, Rel rel) {
	return new Link(null, href, null, rel, null, null, null, null);
    }

    public static Style style() {
	return new Style();
    }

    public static Body body() {
	return new Body();
    }

    public static Body body(Element... content) {
	return new Body(Stream.<GlobalAttribute> empty(), Stream.of(content));
    }

    public static Article article() {
	return new Article();
    }

    public static Section section() {
	return new Section();
    }

    public static Nav nav() {
	return new Nav();
    }

    public static Aside aside() {
	return new Aside();
    }

    public static H1 h1() {
	return new H1();
    }

    public static H2 h2() {
	return new H2();
    }

    public static H3 h3() {
	return new H3();
    }

    public static H4 h4() {
	return new H4();
    }

    public static H5 h5() {
	return new H5();
    }

    public static H6 h6() {
	return new H6();
    }

    public static Header header() {
	return new Header();
    }

    public static Footer footer() {
	return new Footer();
    }

    public static Address address() {
	return new Address();
    }

    public static P p() {
	return new P();
    }

    public static HR hr() {
	return new HR();
    }

    public static Pre pre() {
	return new Pre();
    }

    public static BlockQuote blockquote() {
	return new BlockQuote();
    }

    public static OL ol() {
	return new OL();
    }

    public static UL ul() {
	return new UL();
    }

    public static LI li() {
	return new LI();
    }

    public static DL dl() {
	return new DL();
    }

    public static DT dt() {
	return new DT();
    }

    public static DD dd() {
	return new DD();
    }

    public static Figure figure(Stream<? extends FlowContent> childeren) {
	return new Figure(Stream.<GlobalAttribute> empty(), childeren, null);
    }

    public static FigCaption figcaption() {
	return new FigCaption();
    }

    public static Div div() {
	return new Div();
    }

    public static Main main() {
	return new Main();
    }

    public static A a(Stream<Element> childeren) {
	return new A(childeren);
    }

    public static A a(Id id, Clazz clazz, Href href, Stream<Element> childeren) {
	return new A(ga(id, clazz), childeren, href);
    }

    public static A a(Href href, Stream<Element> childeren) {
	return new A(Stream.empty(), childeren, href);
    }

    public static A a(Href href, Element... childeren) {
	return new A(Stream.empty(), Stream.of(childeren), href);
    }

    public static A a(Id id, Clazz clazz, Href href, Element... childeren) {
	return new A(ga(id, clazz), Stream.of(childeren), href);
    }

    public static A a(Id id, Clazz clazz, Href href) {
	return new A(ga(id, clazz), Stream.empty(), href);
    }

    public static Em em() {
	return new Em();
    }

    public static Strong strong() {
	return new Strong();
    }

    public static Small small() {
	return new Small();
    }

    public static S s() {
	return new S();
    }

    public static Cite cite() {
	return new Cite();
    }

    public static Q q(Stream<? extends PhrasingContent> childeren) {
	return new Q(childeren);
    }

    public static Dfn dfn() {
	return new Dfn();
    }

    public static Abbr abbr() {
	return new Abbr();
    }

    public static Data data(Stream<? extends PhrasingContent> childeren) {
	return new Data(childeren);
    }

    public static Time time() {
	return new Time();
    }

    public static Code code() {
	return new Code();
    }

    public static Var var() {
	return new Var();
    }

    public static Samp samp() {
	return new Samp();
    }

    public static Kbd kbd() {
	return new Kbd();
    }

    public static Sub sub() {
	return new Sub();
    }

    public static Sup sup() {
	return new Sup();
    }

    public static I i() {
	return new I();
    }

    public static B b() {
	return new B();
    }

    public static U u() {
	return new U();
    }

    public static Mark mark() {
	return new Mark();
    }

    public static Ruby ruby() {
	return new Ruby();
    }

    public static Rt rt() {
	return new Rt();
    }

    public static Rp rp() {
	return new Rp();
    }

    public static Bdi bdi(Stream<? extends PhrasingContent> childeren) {
	return new Bdi(Stream.empty(), childeren);
    }

    public static Bdo bdo(Stream<? extends PhrasingContent> childeren) {
	return new Bdo(Stream.empty(), childeren);
    }

    public static Span span(Stream<GlobalAttribute> attributes, Stream<? extends PhrasingContent> childeren) {
	return new Span(attributes, childeren);
    }

    public static Span span(Stream<GlobalAttribute> attributes, PhrasingContent... childeren) {
	return new Span(attributes, Stream.of(childeren));
    }

    public static Span span(Stream<? extends PhrasingContent> childeren) {
	return new Span(Stream.empty(), childeren);
    }

    public static Span span() {
	return new Span(Stream.empty(), Stream.empty());
    }

    public static Br br() {
	return new Br();
    }

    public static WBr wbr() {
	return new WBr();
    }

    public static Img img() {
	return new Img(null, null, null, null, null, null, null, null);
    }

    public static Iframe iframe() {
	return new Iframe(null, null, null, null, null, null, null);
    }

    public static Embed embed() {
	return new Embed(null, null, null, null, null);
    }

    public static Object object() {
	return new Object(null, null, null, null, null, null, null, null, null, Stream.<Param> empty());
    }

    public static Param param() {
	return new Param(null, null, null);
    }

    public static Video video() {
	return new Video(Stream.empty(), null, null, null, null, null, null, null, null, null, null, (Height) null,
		Stream.<Track> empty());
    }

    public static Audio audio() {
	return new Audio(Stream.empty());
    }

    public static Source source() {
	return new Source(null, null, null, null, null, null);
    }

    public static Track track() {
	return new Track(null, null, null);
    }

    public static Map map() {
	return new Map(null, null, Stream.<FlowContent> empty());
    }

    public static Area area() {
	return new Area(Stream.empty());
    }

    public static Article article(Id id, Stream<? extends FlowContent> childeren) {
	return new Article(ga(id), childeren);
    }

    public static Section section(Id id, Stream<? extends FlowContent> childeren) {
	return new Section(ga(id), childeren);
    }

    public static Nav nav(Id id, Stream<? extends FlowContent> childeren) {
	return new Nav(ga(id), childeren);
    }

    public static Aside aside(Id id, Stream<? extends FlowContent> childeren) {
	return new Aside(ga(id), childeren);
    }

    public static H1 h1(Id id, Stream<? extends PhrasingContent> childeren) {
	return new H1(ga(id), childeren);
    }

    public static H2 h2(Id id, Stream<? extends PhrasingContent> childeren) {
	return new H2(ga(id), childeren);
    }

    public static H3 h3(Id id, Stream<? extends PhrasingContent> childeren) {
	return new H3(ga(id), childeren);
    }

    public static H4 h4(Id id, Stream<? extends PhrasingContent> childeren) {
	return new H4(ga(id), childeren);
    }

    public static H5 h5(Id id, Stream<? extends PhrasingContent> childeren) {
	return new H5(ga(id), childeren);
    }

    public static H6 h6(Id id, Stream<? extends PhrasingContent> childeren) {
	return new H6(ga(id), childeren);
    }

    public static Header header(Id id, Stream<? extends FlowContent> childeren) {
	return new Header(ga(id), childeren);
    }

    public static Footer footer(Id id, Stream<? extends FlowContent> childeren) {
	return new Footer(ga(id), childeren);
    }

    public static Address address(Id id, Stream<? extends FlowContent> childeren) {
	return new Address(ga(id), childeren);
    }

    public static P p(Id id, Stream<? extends PhrasingContent> childeren) {
	return new P(ga(id), childeren);
    }

    public static Pre pre(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Pre(ga(id), childeren);
    }

    public static BlockQuote blockquote(Id id, Stream<? extends FlowContent> childeren) {
	return new BlockQuote(ga(id), null, childeren);
    }

    public static OL ol(Id id, Stream<LI> childeren) {
	Stream<GlobalAttribute> ga = ga(id);
	Reversed reversed = (Reversed) null;
	Start start = (Start) null;
	Type type = (Type) null;
	return new OL(ga, reversed, start, type, childeren);
    }

    public static UL ul(Id id, Stream<LI> childeren) {
	return new UL(ga(id), childeren);
    }

    public static LI li(Id id, Stream<? extends FlowContent> childeren) {
	return new LI(ga(id), childeren, null);
    }

    public static DL dl(Id id, Stream<? extends DtOrDd> childeren) {
	return new DL(ga(id), childeren);
    }

    public static DT dt(Id id, Stream<? extends FlowContent> childeren) {
	return new DT(ga(id), childeren);
    }

    public static DD dd(Id id, Stream<? extends FlowContent> childeren) {
	return new DD(ga(id), childeren);
    }

    public static FigCaption figcaption(Id id, Stream<? extends FlowContent> childeren) {
	return new FigCaption(ga(id), childeren);
    }

    public static Div div(Id id, Stream<? extends FlowContent> childeren) {
	return new Div(ga(id), childeren);
    }

    public static Main main(Id id, Stream<? extends FlowContent> childeren) {
	return new Main(ga(id), childeren);
    }

    public static A a(Id id) {
	return new A(ga(id), Stream.empty());
    }

    public static Em em(Id id) {
	return new Em(ga(id), Stream.empty());
    }

    public static Strong strong(Id id) {
	return new Strong(ga(id), Stream.empty());
    }

    public static Small small(Id id) {
	return new Small(ga(id), Stream.empty());
    }

    public static S s(Id id) {
	return new S(ga(id), Stream.empty());
    }

    public static Cite cite(Id id) {
	return new Cite(ga(id), Stream.empty());
    }

    public static Q q(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Q(ga(id), childeren, null);
    }

    public static Dfn dfn(Id id) {
	return new Dfn(ga(id), Stream.empty());
    }

    public static Abbr abbr(Id id) {
	return new Abbr(ga(id), Stream.empty());
    }

    public static Data data(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Data(ga(id), childeren, null);
    }

    public static Time time(Id id, DateTime dt) {
	return new Time(ga(id), Stream.empty(), dt);
    }

    public static Code code(Id id) {
	return new Code(ga(id), Stream.empty());
    }

    public static Var var(Id id) {
	return new Var(ga(id), Stream.empty());
    }

    public static Samp samp(Id id) {
	return new Samp(ga(id), Stream.empty());
    }

    public static Kbd kbd(Id id) {
	return new Kbd(ga(id), Stream.empty());
    }

    public static Sub sub(Id id) {
	return new Sub(ga(id), Stream.empty());
    }

    public static Sup sup(Id id) {
	return new Sup(ga(id), Stream.empty());
    }

    public static Sup sup(Text text) {
	return new Sup(Stream.empty(), Stream.of(text));
    }

    public static I i(Id id) {
	return new I(ga(id), Stream.empty());
    }

    public static B b(Id id) {
	return new B(ga(id), Stream.empty());
    }

    public static U u(Id id) {
	return new U(ga(id), Stream.empty());
    }

    public static Mark mark(Id id) {
	return new Mark(ga(id), Stream.empty());
    }

    public static Ruby ruby(Id id) {
	return new Ruby(ga(id), Stream.empty());
    }

    public static Rt rt(Id id) {
	return new Rt(ga(id), Stream.empty());
    }

    public static Rp rp(Id id) {
	return new Rp(ga(id), Stream.empty());
    }

    public static Bdi bdi(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Bdi(ga(id), childeren);
    }

    public static Bdo bdo(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Bdo(ga(id), childeren);
    }

    public static Span span(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Span(ga(id), childeren);
    }

    public static Br br(Id id) {
	return new Br(ga(id));
    }

    public static WBr wbr(Id id) {
	return new WBr(ga(id));
    }

    public static Img img(Id id) {
	return new Img(ga(id), null, null, null, null, null, null, null);
    }

    public static Img img(Src src) {
	return new Img(Stream.empty(), null, src, null, null, null, null, null);
    }

    public static Iframe iframe(Id id) {
	return new Iframe(ga(id), null, null, null, null, null, null);
    }

    public static Embed embed(Id id) {
	return new Embed(ga(id), null, null, null, null);
    }

    public static Object object(Id id) {
	return new Object(ga(id), null, null, null, null, null, null, null, null, Stream.<Param> empty());
    }

    public static Param param(Id id) {
	return new Param(ga(id), null, null);
    }

    public static Video video(Id id) {
	return new Video(ga(id), null, null, null, null, null, null, null, null, null, null, (Height) null,
		Stream.<Track> empty());
    }

    public static Audio audio(Id id) {
	return new Audio(ga(id));
    }

    public static Source source(Id id) {
	return new Source(ga(id), null, null, null, null, null);
    }

    public static Track track(Id id) {
	return new Track(ga(id), null, null);
    }

    public static Map map(Id id) {
	return new Map(ga(id), null, Stream.<FlowContent> empty());
    }

    public static Area area(Id id) {
	return new Area(ga(id));
    }

    public static HTML html(Id id, Head head, Body body) {
	return new HTML(ga(id), head, body);
    }

    public static Article article(Id id) {
	return new Article(ga(id), Stream.empty());
    }

    public static Section section(Id id) {
	return new Section(ga(id), Stream.empty());
    }

    public static Nav nav(Id id) {
	return new Nav(ga(id), Stream.empty());
    }

    public static Aside aside(Id id) {
	return new Aside(ga(id), Stream.empty());
    }

    public static H1 h1(Id id) {
	return new H1(ga(id), Stream.empty());
    }

    public static H2 h2(Id id) {
	return new H2(ga(id), Stream.empty());
    }

    public static H3 h3(Id id) {
	return new H3(ga(id), Stream.empty());
    }

    public static H4 h4(Id id) {
	return new H4(ga(id), Stream.empty());
    }

    public static H5 h5(Id id) {
	return new H5(ga(id), Stream.empty());
    }

    public static H6 h6(Id id) {
	return new H6(ga(id), Stream.empty());
    }

    public static Header header(Id id) {
	return new Header(ga(id), Stream.empty());
    }

    public static Footer footer(Id id) {
	return new Footer(ga(id), Stream.empty());
    }

    public static Address address(Id id) {
	return new Address(ga(id), Stream.empty());
    }

    public static P p(Id id) {
	return new P(ga(id), Stream.empty());
    }

    public static P p(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new P(ga(clazz), childeren);
    }

    public static P p(Clazz clazz, PhrasingContent... childeren) {
	return new P(ga(clazz), Stream.of(childeren));
    }

    public static HR hr(Id id) {
	return new HR(ga(id));
    }

    public static Pre pre(Id id) {
	return new Pre(ga(id), Stream.empty());
    }

    public static BlockQuote blockquote(Id id) {
	return new BlockQuote(ga(id), null, Stream.empty());
    }

    public static OL ol(Id id) {
	Stream<GlobalAttribute> ga = ga(id);
	Reversed reversed = (Reversed) null;
	Start start = (Start) null;
	Type type = (Type) null;
	Stream<LI> childeren = Stream.<LI> empty();
	return new OL(ga, reversed, start, type, childeren);
    }

    public static UL ul(Id id) {
	return new UL(ga(id), Stream.empty());
    }

    public static LI li(Id id) {
	return new LI(ga(id), Stream.empty(), null);
    }

    public static LI li(String string) {
	return new LI(Stream.empty(), Stream.of(new Text(string)), null);
    }

    public static DL dl(Id id) {
	return new DL(ga(id), Stream.empty());
    }

    public static DT dt(Id id) {
	return new DT(ga(id), Stream.empty());
    }

    public static DD dd(Id id) {
	return new DD(ga(id), Stream.empty());
    }

    public static Figure figure(Id id, Stream<? extends FlowContent> childeren) {
	return new Figure(ga(id), childeren, null);
    }

    public static FigCaption figcaption(Id id) {
	return new FigCaption(ga(id), Stream.empty());
    }

    public static Div div(Id id) {
	return new Div(ga(id), Stream.empty());
    }

    public static Main main(Id id) {
	return new Main(ga(id), Stream.empty());
    }

    public static A a(Id id, Stream<Element> childeren) {
	return new A(ga(id), childeren);
    }

    public static Em em(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Em(ga(id), childeren);
    }

    public static Strong strong(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Strong(ga(id), childeren);
    }

    public static Small small(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Small(ga(id), childeren);
    }

    public static S s(Id id, Stream<? extends PhrasingContent> childeren) {
	return new S(ga(id), childeren);
    }

    public static Cite cite(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Cite(ga(id), childeren);
    }

    public static Q q(Id id) {
	return new Q(ga(id), Stream.empty(), null);
    }

    public static Dfn dfn(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Dfn(ga(id), childeren);
    }

    public static Abbr abbr(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Abbr(ga(id), childeren);
    }

    public static Data data(Id id) {
	return new Data(ga(id), Stream.empty(), null);
    }

    public static Time time(Id id, DateTime dt, Stream<? extends PhrasingContent> childeren) {
	return new Time(ga(id), childeren, dt);
    }

    public static Code code(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Code(ga(id), childeren);
    }

    public static Var var(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Var(ga(id), childeren);
    }

    public static Samp samp(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Samp(ga(id), childeren);
    }

    public static Kbd kbd(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Kbd(ga(id), childeren);
    }

    public static Sub sub(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Sub(ga(id), childeren);
    }

    public static Sup sup(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Sup(ga(id), childeren);
    }

    public static I i(Id id, Stream<? extends PhrasingContent> childeren) {
	return new I(ga(id), childeren);
    }

    public static B b(Id id, Stream<? extends PhrasingContent> childeren) {
	return new B(ga(id), childeren);
    }

    public static U u(Id id, Stream<? extends PhrasingContent> childeren) {
	return new U(ga(id), childeren);
    }

    public static Mark mark(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Mark(ga(id), childeren);
    }

    public static Ruby ruby(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Ruby(ga(id), childeren);
    }

    public static Rt rt(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Rt(ga(id), childeren);
    }

    public static Rp rp(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Rp(ga(id), childeren);
    }

    public static Bdi bdi(Id id) {
	return new Bdi(ga(id), Stream.empty());
    }

    public static Bdo bdo(Id id) {
	return new Bdo(ga(id), Stream.empty());
    }

    public static Span span(Id id) {
	return new Span(ga(id), Stream.empty());
    }

    public static Object object(Id id, Stream<Param> params) {
	return new Object(ga(id), null, null, null, null, null, null, null, null, params);
    }

    public static Param param(Id id, Name name) {
	return new Param(ga(id), name, null);
    }

    public static Param param(Id id, Name name, Value value) {
	return new Param(ga(id), name, value);
    }

    public static Param param(Id id, Value value) {
	return new Param(ga(id), null, value);
    }

    public static Video video(Id id, Stream<Track> tracks) {
	return new Video(ga(id), null, null, null, null, null, null, null, null, null, null, (Height) null, tracks);
    }

    public static Audio audio(Id id, Stream<? extends FlowContent> tracks) {
	return new Audio(ga(id));
    }

    public static Source source(Id id, Stream<? extends FlowContent> childeren) {
	return new Source(ga(id), null, null, null, null, null);
    }

    public static Track track(Id id, Stream<? extends FlowContent> childeren) {
	return new Track(ga(id), null, null);
    }

    public static Map map(Id id, Stream<? extends FlowContent> childeren) {
	return new Map(ga(id), null, childeren);
    }

    public static Area area(Clazz clazz) {
	return new Area(ga(clazz));
    }

    public static HTML html(Clazz clazz, Head head, Body body) {
	return new HTML(ga(clazz), head, body);
    }

    public static Article article(Clazz clazz) {
	return new Article(ga(clazz), Stream.empty());
    }

    public static Section section(Clazz clazz) {
	return new Section(ga(clazz), Stream.empty());
    }

    public static Nav nav(Clazz clazz) {
	return new Nav(ga(clazz), Stream.empty());
    }

    public static Aside aside(Clazz clazz) {
	return new Aside(ga(clazz), Stream.empty());
    }

    public static H1 h1(Clazz clazz) {
	return new H1(ga(clazz), Stream.empty());
    }

    public static H2 h2(Clazz clazz) {
	return new H2(ga(clazz), Stream.empty());
    }

    public static H3 h3(Clazz clazz) {
	return new H3(ga(clazz), Stream.empty());
    }

    public static H4 h4(Clazz clazz) {
	return new H4(ga(clazz), Stream.empty());
    }

    public static H5 h5(Clazz clazz) {
	return new H5(ga(clazz), Stream.empty());
    }

    public static H6 h6(Clazz clazz) {
	return new H6(ga(clazz), Stream.empty());
    }

    public static Header header(Clazz clazz) {
	return new Header(ga(clazz), Stream.empty());
    }

    public static Footer footer(Clazz clazz) {
	return new Footer(ga(clazz), Stream.empty());
    }

    public static Address address(Clazz clazz) {
	return new Address(ga(clazz), Stream.empty());
    }

    public static P p(Clazz clazz) {
	return new P(ga(clazz), Stream.empty());
    }

    public static HR hr(Clazz clazz) {
	return new HR(ga(clazz));
    }

    public static Pre pre(Clazz clazz) {
	return new Pre(ga(clazz), Stream.empty());
    }

    public static BlockQuote blockquote(Clazz clazz) {
	return new BlockQuote(ga(clazz), null, Stream.empty());
    }

    public static OL ol(Clazz clazz) {
	Stream<GlobalAttribute> ga = ga(clazz);
	Reversed reversed = (Reversed) null;
	Start start = (Start) null;
	Type type = (Type) null;
	Stream<LI> childeren = Stream.<LI> empty();
	return new OL(ga, reversed, start, type, childeren);
    }

    public static UL ul(Clazz clazz) {
	return new UL(ga(clazz), Stream.empty());
    }

    public static LI li(Clazz clazz) {
	return new LI(ga(clazz), Stream.empty(), null);
    }

    public static LI li(Clazz clazz, FlowContent child) {
	return new LI(ga(clazz), Stream.of(child), null);
    }

    public static DL dl(Clazz clazz) {
	return new DL(ga(clazz), Stream.empty());
    }

    public static DT dt(Clazz clazz) {
	return new DT(ga(clazz), Stream.empty());
    }

    public static DD dd(Clazz clazz) {
	return new DD(ga(clazz), Stream.empty());
    }

    public static Figure figure(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Figure(ga(clazz), childeren, null);
    }

    public static FigCaption figcaption(Clazz clazz) {
	return new FigCaption(ga(clazz), Stream.empty());
    }

    public static Div div(Clazz clazz) {
	return new Div(ga(clazz), Stream.empty());
    }

    public static Div div(Clazz clazz, FlowContent... childeren) {
	return new Div(ga(clazz), Stream.of(childeren));
    }

    public static Div div(Clazz clazz, ch.isb_sib.swiss_prot.sjh.attributes.global.Style style,
	    FlowContent... childeren) {
	return new Div(ga(clazz, style), Stream.of(childeren));
    }

    public static Div div(Clazz clazz, ch.isb_sib.swiss_prot.sjh.attributes.global.Style style,
	    Stream<? extends FlowContent> childeren) {
	return new Div(ga(clazz, style), childeren);
    }

    public static Div div(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Div(ga(clazz), childeren);
    }

    public static Main main(Clazz clazz) {
	return new Main(ga(clazz), Stream.empty());
    }

    public static A a(Clazz clazz, Stream<Element> childeren) {
	return new A(ga(clazz), childeren);
    }

    public static Em em(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Em(ga(clazz), childeren);
    }

    public static Strong strong(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Strong(ga(clazz), childeren);
    }

    public static Small small(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Small(ga(clazz), childeren);
    }

    public static S s(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new S(ga(clazz), childeren);
    }

    public static Cite cite(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Cite(ga(clazz), childeren);
    }

    public static Q q(Clazz clazz) {
	return new Q(ga(clazz), Stream.empty(), null);
    }

    public static Dfn dfn(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Dfn(ga(clazz), childeren);
    }

    public static Abbr abbr(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Abbr(ga(clazz), childeren);
    }

    public static Data data(Clazz clazz) {
	return new Data(ga(clazz), Stream.empty(), null);
    }

    public static Time time(Clazz clazz, DateTime dt, Stream<? extends PhrasingContent> childeren) {
	return new Time(ga(clazz), childeren, dt);
    }

    public static Code code(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Code(ga(clazz), childeren);
    }

    public static Var var(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Var(ga(clazz), childeren);
    }

    public static Samp samp(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Samp(ga(clazz), childeren);
    }

    public static Kbd kbd(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Kbd(ga(clazz), childeren);
    }

    public static Sub sub(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Sub(ga(clazz), childeren);
    }

    public static Sup sup(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Sup(ga(clazz), childeren);
    }

    public static I i(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new I(ga(clazz), childeren);
    }

    public static B b(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new B(ga(clazz), childeren);
    }

    public static U u(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new U(ga(clazz), childeren);
    }

    public static Mark mark(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Mark(ga(clazz), childeren);
    }

    public static Ruby ruby(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Ruby(ga(clazz), childeren);
    }

    public static Rt rt(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Rt(ga(clazz), childeren);
    }

    public static Rp rp(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Rp(ga(clazz), childeren);
    }

    public static Bdi bdi(Clazz clazz) {
	return new Bdi(ga(clazz), Stream.empty());
    }

    public static Bdo bdo(Clazz clazz) {
	return new Bdo(ga(clazz), Stream.empty());
    }

    public static Span span(Clazz clazz) {
	return new Span(ga(clazz), Stream.empty());
    }

    public static Object object(Clazz clazz, Stream<Param> params) {
	return new Object(ga(clazz), null, null, null, null, null, null, null, null, params);
    }

    public static Param param(Clazz clazz, Name name) {
	return new Param(ga(clazz), name, null);
    }

    public static Param param(Clazz clazz, Name name, Value value) {
	return new Param(ga(clazz), name, value);
    }

    public static Param param(Clazz clazz, Value value) {
	return new Param(ga(clazz), null, value);
    }

    public static Video video(Clazz clazz, Stream<Track> tracks) {
	return new Video(ga(clazz), null, null, null, null, null, null, null, null, null, null, (Height) null, tracks);
    }

    public static Audio audio(Clazz clazz, Stream<? extends FlowContent> tracks) {
	return new Audio(ga(clazz));
    }

    public static A a(Id id, Clazz clazz) {
	return new A(ga(id, clazz), Stream.empty());
    }

    public static Em em(Id id, Clazz clazz) {
	return new Em(ga(id, clazz), Stream.empty());
    }

    public static Small small(Id id, Clazz clazz) {
	return new Small(ga(id, clazz), Stream.empty());
    }

    public static S s(Id id, Clazz clazz) {
	return new S(ga(id, clazz), Stream.empty());
    }

    public static Cite cite(Id id, Clazz clazz) {
	return new Cite(ga(id, clazz), Stream.empty());
    }

    public static Q q(Id id, Clazz clazz) {
	return new Q(ga(id, clazz), Stream.empty(), null);
    }

    public static Dfn dfn(Id id, Clazz clazz) {
	return new Dfn(ga(id, clazz), Stream.empty());
    }

    public static Abbr abbr(Id id, Clazz clazz) {
	return new Abbr(ga(id, clazz), Stream.empty());
    }

    public static Data data(Id id, Clazz clazz) {
	return new Data(ga(id, clazz), Stream.empty(), null);
    }

    public static Time time(Id id, Clazz clazz, DateTime dt) {
	return new Time(ga(id, clazz), Stream.empty(), dt);
    }

    public static Code code(Id id, Clazz clazz) {
	return new Code(ga(id, clazz), Stream.empty());
    }

    public static Bdi bdi(Id id, Clazz clazz) {
	return new Bdi(ga(id, clazz), Stream.empty());
    }

    public static Bdo bdo(Id id, Clazz clazz) {
	return new Bdo(ga(id, clazz), Stream.empty());
    }

    public static Span span(Id id, Clazz clazz) {
	return new Span(ga(id, clazz), Stream.empty());
    }

    public static Var var(Id id, Clazz clazz) {
	return new Var(ga(id, clazz), Stream.empty());
    }

    public static Samp samp(Id id, Clazz clazz) {
	return new Samp(ga(id, clazz), Stream.empty());
    }

    public static Kbd kbd(Id id, Clazz clazz) {
	return new Kbd(ga(id, clazz), Stream.empty());
    }

    public static Sub sub(Id id, Clazz clazz) {
	return new Sub(ga(id, clazz), Stream.empty());
    }

    public static Sup sup(Id id, Clazz clazz) {
	return new Sup(ga(id, clazz), Stream.empty());
    }

    public static I i(Id id, Clazz clazz) {
	return new I(ga(id, clazz), Stream.empty());
    }

    public static B b(Id id, Clazz clazz) {
	return new B(ga(id, clazz), Stream.empty());
    }

    public static U u(Id id, Clazz clazz) {
	return new U(ga(id, clazz), Stream.empty());
    }

    public static Mark mark(Id id, Clazz clazz) {
	return new Mark(ga(id, clazz), Stream.empty());
    }

    public static Ruby ruby(Id id, Clazz clazz) {
	return new Ruby(ga(id, clazz), Stream.empty());
    }

    public static Rt rt(Id id, Clazz clazz) {
	return new Rt(ga(id, clazz), Stream.empty());
    }

    public static Rp rp(Id id, Clazz clazz) {
	return new Rp(ga(id, clazz), Stream.empty());
    }

    public static Br br(Id id, Clazz clazz) {
	return new Br(ga(id, clazz));
    }

    public static WBr wbr(Id id, Clazz clazz) {
	return new WBr(ga(id, clazz));
    }

    public static Img img(Id id, Clazz clazz) {
	return new Img(ga(id, clazz), null, null, null, null, null, null, null);
    }

    public static Iframe iframe(Id id, Clazz clazz) {
	return new Iframe(ga(id, clazz), null, null, null, null, null, null);
    }

    public static Embed embed(Id id, Clazz clazz) {
	return new Embed(ga(id, clazz), null, null, null, null);
    }

    public static Object object(Id id, Clazz clazz) {
	return new Object(ga(id, clazz), null, null, null, null, null, null, null, null, Stream.<Param> empty());
    }

    public static Param param(Id id, Clazz clazz) {
	return new Param(ga(id, clazz), null, null);
    }

    public static Video video(Id id, Clazz clazz) {
	return new Video(ga(id, clazz), null, null, null, null, null, null, null, null, null, null, (Height) null,
		Stream.<Track> empty());
    }

    public static Audio audio(Id id, Clazz clazz) {
	return new Audio(ga(id, clazz));
    }

    public static Source source(Id id, Clazz clazz) {
	return new Source(ga(id, clazz), null, null, null, null, null);
    }

    public static Track track(Id id, Clazz clazz) {
	return new Track(ga(id, clazz), null, null);
    }

    public static Map map(Id id, Clazz clazz) {
	return new Map(ga(id, clazz), null, Stream.<FlowContent> empty());
    }

    public static Area area(Id id, Clazz clazz) {
	return new Area(ga(id, clazz));
    }

    public static HTML html(Id id, Clazz clazz, Head head, Body body) {
	return new HTML(ga(id, clazz), head, body);
    }

    public static Article article(Id id, Clazz clazz) {
	return new Article(ga(id, clazz), Stream.empty());
    }

    public static Section section(Id id, Clazz clazz) {
	return new Section(ga(id, clazz), Stream.empty());
    }

    public static Nav nav(Id id, Clazz clazz) {
	return new Nav(ga(id, clazz), Stream.empty());
    }

    public static Aside aside(Id id, Clazz clazz) {
	return new Aside(ga(id, clazz), Stream.empty());
    }

    public static Map map(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Map(ga(clazz), null, childeren);
    }

    public static Article article(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Article(ga(id, clazz), childeren);
    }

    public static Section section(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Section(ga(id, clazz), childeren);
    }

    public static Nav nav(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Nav(ga(id, clazz), childeren);
    }

    public static Aside aside(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Aside(ga(id, clazz), childeren);
    }

    public static H1 h1(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new H1(ga(id, clazz), childeren);
    }

    public static H2 h2(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new H2(ga(id, clazz), childeren);
    }

    public static H3 h3(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new H3(ga(id, clazz), childeren);
    }

    public static H4 h4(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new H4(ga(id, clazz), childeren);
    }

    public static H5 h5(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new H5(ga(id, clazz), childeren);
    }

    public static H6 h6(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new H6(ga(id, clazz), childeren);
    }

    public static Header header(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Header(ga(id, clazz), childeren);
    }

    public static Footer footer(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Footer(ga(id, clazz), childeren);
    }

    public static Address address(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Address(ga(id, clazz), childeren);
    }

    public static P p(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new P(ga(id, clazz), childeren);
    }

    public static Pre pre(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Pre(ga(id, clazz), childeren);
    }

    public static BlockQuote blockquote(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new BlockQuote(ga(id, clazz), null, childeren);
    }

    public static OL ol(Id id, Clazz clazz, Stream<LI> childeren) {
	Stream<GlobalAttribute> ga = ga(id, clazz);
	Reversed reversed = (Reversed) null;
	Start start = (Start) null;
	Type type = (Type) null;
	return new OL(ga, reversed, start, type, childeren);
    }

    public static UL ul(Id id, Clazz clazz, Stream<LI> childeren) {
	return new UL(ga(id, clazz), childeren);
    }

    public static LI li(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new LI(ga(id, clazz), childeren, null);
    }

    public static DL dl(Id id, Clazz clazz, Stream<? extends DtOrDd> childeren) {
	return new DL(ga(id, clazz), childeren);
    }

    public static DT dt(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new DT(ga(id, clazz), childeren);
    }

    public static DD dd(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new DD(ga(id, clazz), childeren);
    }

    public static FigCaption figcaption(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new FigCaption(ga(id, clazz), childeren);
    }

    public static Div div(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Div(ga(id, clazz), childeren);
    }

    public static Main main(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Main(ga(id, clazz), childeren);
    }

    public static H1 h1(Id id, Clazz clazz) {
	return new H1(ga(id, clazz), Stream.empty());
    }

    public static H2 h2(Id id, Clazz clazz) {
	return new H2(ga(id, clazz), Stream.empty());
    }

    public static H3 h3(Id id, Clazz clazz) {
	return new H3(ga(id, clazz), Stream.empty());
    }

    public static H4 h4(Id id, Clazz clazz) {
	return new H4(ga(id, clazz), Stream.empty());
    }

    public static H5 h5(Id id, Clazz clazz) {
	return new H5(ga(id, clazz), Stream.empty());
    }

    public static H6 h6(Id id, Clazz clazz) {
	return new H6(ga(id, clazz), Stream.empty());
    }

    public static Header header(Id id, Clazz clazz) {
	return new Header(ga(id, clazz), Stream.empty());
    }

    public static Footer footer(Id id, Clazz clazz) {
	return new Footer(ga(id, clazz), Stream.empty());
    }

    public static Address address(Id id, Clazz clazz) {
	return new Address(ga(id, clazz), Stream.empty());
    }

    public static P p(Id id, Clazz clazz) {
	return new P(ga(id, clazz), Stream.empty());
    }

    public static HR hr(Id id, Clazz clazz) {
	return new HR(ga(id, clazz));
    }

    public static Pre pre(Id id, Clazz clazz) {
	return new Pre(ga(id, clazz), Stream.empty());
    }

    public static BlockQuote blockquote(Id id, Clazz clazz) {
	return new BlockQuote(ga(id, clazz), null, Stream.empty());
    }

    public static OL ol(Id id, Clazz clazz) {
	Stream<GlobalAttribute> ga = ga(id, clazz);
	Reversed reversed = (Reversed) null;
	Start start = (Start) null;
	Type type = (Type) null;
	Stream<LI> childeren = Stream.<LI> empty();
	return new OL(ga, reversed, start, type, childeren);
    }

    public static UL ul(Id id, Clazz clazz) {
	return new UL(ga(id, clazz), Stream.empty());
    }

    public static LI li(Id id, Clazz clazz) {
	return new LI(ga(id, clazz), Stream.empty(), null);
    }

    public static DL dl(Id id, Clazz clazz) {
	return new DL(ga(id, clazz), Stream.empty());
    }

    public static DT dt(Id id, Clazz clazz) {
	return new DT(ga(id, clazz), Stream.empty());
    }

    public static DD dd(Id id, Clazz clazz) {
	return new DD(ga(id, clazz), Stream.empty());
    }

    public static Figure figure(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Figure(ga(id, clazz), childeren, null);
    }

    public static FigCaption figcaption(Id id, Clazz clazz) {
	return new FigCaption(ga(id, clazz), Stream.empty());
    }

    public static Div div(Id id, Clazz clazz) {
	return new Div(ga(id, clazz), Stream.empty());
    }

    public static Main main(Id id, Clazz clazz) {
	return new Main(ga(id, clazz), Stream.empty());
    }

    public static A a(Id id, Clazz clazz, Stream<Element> childeren) {
	return new A(ga(id, clazz), childeren);
    }

    public static Em em(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Em(ga(id, clazz), childeren);
    }

    public static Strong strong(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Strong(ga(id, clazz), childeren);
    }

    public static Small small(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Small(ga(id, clazz), childeren);
    }

    public static S s(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new S(ga(id, clazz), childeren);
    }

    public static Cite cite(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Cite(ga(id, clazz), childeren);
    }

    public static Q q(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Q(ga(id, clazz), childeren, null);
    }

    public static Dfn dfn(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Dfn(ga(id, clazz), childeren);
    }

    public static Abbr abbr(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Abbr(ga(id, clazz), childeren);
    }

    public static Data data(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Data(ga(id, clazz), childeren, null);
    }

    public static Time time(Id id, Clazz clazz, DateTime dt, Stream<? extends PhrasingContent> childeren) {
	return new Time(ga(id, clazz), childeren, dt);
    }

    public static Code code(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Code(ga(id, clazz), childeren);
    }

    public static Var var(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Var(ga(id, clazz), childeren);
    }

    public static Samp samp(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Samp(ga(id, clazz), childeren);
    }

    public static Kbd kbd(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Kbd(ga(id, clazz), childeren);
    }

    public static Sub sub(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Sub(ga(id, clazz), childeren);
    }

    public static Sup sup(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Sup(ga(id, clazz), childeren);
    }

    public static I i(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new I(ga(id, clazz), childeren);
    }

    public static B b(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new B(ga(id, clazz), childeren);
    }

    public static U u(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new U(ga(id, clazz), childeren);
    }

    public static Mark mark(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Mark(ga(id, clazz), childeren);
    }

    public static Ruby ruby(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Ruby(ga(id, clazz), childeren);
    }

    public static Rt rt(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Rt(ga(id, clazz), childeren);
    }

    public static Rp rp(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Rp(ga(id, clazz), childeren);
    }

    public static Bdi bdi(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Bdi(ga(id, clazz), childeren);
    }

    public static Bdo bdo(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Bdo(ga(id, clazz), childeren);
    }

    public static Span span(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Span(ga(id, clazz), childeren);
    }

    public static Object object(Id id, Clazz clazz, Stream<Param> params) {
	return new Object(ga(id, clazz), null, null, null, null, null, null, null, null, params);
    }

    public static Param param(Id id, Clazz clazz, Name name) {
	return new Param(ga(id), name, null);
    }

    public static Param param(Id id, Clazz clazz, Name name, Value value) {
	return new Param(ga(id, clazz), name, value);
    }

    public static Param param(Id id, Clazz clazz, Value value) {
	return new Param(ga(id, clazz), null, value);
    }

    public static Video video(Id id, Clazz clazz, Stream<Track> tracks) {
	return new Video(ga(id, clazz), null, null, null, null, null, null, null, null, null, null, (Height) null,
		tracks);
    }

    public static Audio audio(Id id, Clazz clazz, Stream<Track> tracks) {
	return new Audio(ga(id, clazz), tracks);
    }

    public static Map map(Id id, Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Map(ga(id, clazz), null, childeren);
    }

    public static A a(Id id, Clazz clazz, Element... childeren) {
	return new A(ga(id, clazz), Stream.of(childeren));
    }

    public static Em em(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Em(ga(id, clazz), Stream.of(childeren));
    }

    public static Strong strong(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Strong(ga(id, clazz), Stream.of(childeren));
    }

    public static Small small(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Small(ga(id, clazz), Stream.of(childeren));
    }

    public static S s(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new S(ga(id, clazz), Stream.of(childeren));
    }

    public static Cite cite(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Cite(ga(id, clazz), Stream.of(childeren));
    }

    public static Q q(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Q(ga(id, clazz), Stream.of(childeren), null);
    }

    public static Dfn dfn(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Dfn(ga(id, clazz), Stream.of(childeren));
    }

    public static Abbr abbr(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Abbr(ga(id, clazz), Stream.of(childeren));
    }

    public static Data data(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Data(ga(id, clazz), Stream.of(childeren), null);
    }

    public static Time time(Id id, Clazz clazz, DateTime dt, PhrasingContent... childeren) {
	return new Time(ga(id, clazz), Stream.of(childeren), dt);
    }

    public static Code code(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Code(ga(id, clazz), Stream.of(childeren));
    }

    public static Var var(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Var(ga(id, clazz), Stream.of(childeren));
    }

    public static Samp samp(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Samp(ga(id, clazz), Stream.of(childeren));
    }

    public static Kbd kbd(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Kbd(ga(id, clazz), Stream.of(childeren));
    }

    public static Sub sub(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Sub(ga(id, clazz), Stream.of(childeren));
    }

    public static Sup sup(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Sup(ga(id, clazz), Stream.of(childeren));
    }

    public static I i(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new I(ga(id, clazz), Stream.of(childeren));
    }

    public static B b(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new B(ga(id, clazz), Stream.of(childeren));
    }

    public static U u(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new U(ga(id, clazz), Stream.of(childeren));
    }

    public static Mark mark(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Mark(ga(id, clazz), Stream.of(childeren));
    }

    public static Ruby ruby(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Ruby(ga(id, clazz), Stream.of(childeren));
    }

    public static Rt rt(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Rt(ga(id, clazz), Stream.of(childeren));
    }

    public static Rp rp(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Rp(ga(id, clazz), Stream.of(childeren));
    }

    public static Bdi bdi(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Bdi(ga(id, clazz), Stream.of(childeren));
    }

    public static Bdo bdo(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Bdo(ga(id, clazz), Stream.of(childeren));
    }

    public static Span span(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Span(ga(id, clazz), Stream.of(childeren));
    }

    public static Object object(Id id, Clazz clazz, Param... params) {
	return new Object(ga(id, clazz), null, null, null, null, null, null, null, null, Stream.of(params));
    }

    public static Video video(Id id, Clazz clazz, Track... tracks) {
	return new Video(ga(id, clazz), null, null, null, null, null, null, null, null, null, null, (Height) null,
		Stream.of(tracks));
    }

    public static Audio audio(Id id, Clazz clazz, Track tracks) {
	return new Audio(ga(id, clazz), Stream.of(tracks));
    }

    public static Map map(Id id, Clazz clazz, FlowContent... childeren) {
	return new Map(ga(id, clazz), null, Stream.of(childeren));
    }

    public static Nav nav(Id id, Clazz clazz, FlowContent... childeren) {
	return new Nav(ga(id, clazz), Stream.of(childeren));
    }

    public static Aside aside(Id id, Clazz clazz, FlowContent... childeren) {
	return new Aside(ga(id, clazz), Stream.of(childeren));
    }

    public static H1 h1(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new H1(ga(id, clazz), Stream.of(childeren));
    }

    public static H2 h2(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new H2(ga(id, clazz), Stream.of(childeren));
    }

    public static H3 h3(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new H3(ga(id, clazz), Stream.of(childeren));
    }

    public static H4 h4(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new H4(ga(id, clazz), Stream.of(childeren));
    }

    public static H5 h5(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new H5(ga(id, clazz), Stream.of(childeren));
    }

    public static H6 h6(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new H6(ga(id, clazz), Stream.of(childeren));
    }

    public static Header header(Id id, Clazz clazz, FlowContent... childeren) {
	return new Header(ga(id, clazz), Stream.of(childeren));
    }

    public static Footer footer(Id id, Clazz clazz, FlowContent... childeren) {
	return new Footer(ga(id, clazz), Stream.of(childeren));
    }

    public static Address address(Id id, Clazz clazz, FlowContent... childeren) {
	return new Address(ga(id, clazz), Stream.of(childeren));
    }

    public static P p(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new P(ga(id, clazz), Stream.of(childeren));
    }

    public static Pre pre(Id id, Clazz clazz, PhrasingContent... childeren) {
	return new Pre(ga(id, clazz), Stream.of(childeren));
    }

    public static BlockQuote blockquote(Id id, Clazz clazz, FlowContent... childeren) {
	return new BlockQuote(ga(id, clazz), null, Stream.of(childeren));
    }

    public static OL ol(Id id, Clazz clazz, LI... childeren) {
	Stream<GlobalAttribute> ga = ga(id, clazz);
	Reversed reversed = (Reversed) null;
	Start start = (Start) null;
	Type type = (Type) null;
	return new OL(ga, reversed, start, type, Stream.of(childeren));
    }

    public static UL ul(Id id, Clazz clazz, LI... childeren) {
	return new UL(ga(id, clazz), Stream.of(childeren));
    }

    public static LI li(Id id, Clazz clazz, FlowContent... childeren) {
	return new LI(ga(id, clazz), Stream.of(childeren), null);
    }

    public static DL dl(Id id, Clazz clazz, DtOrDd... childeren) {
	return new DL(ga(id, clazz), Stream.of(childeren));
    }

    public static DT dt(Id id, Clazz clazz, FlowContent... childeren) {
	return new DT(ga(id, clazz), Stream.of(childeren));
    }

    public static DD dd(Id id, Clazz clazz, FlowContent... childeren) {
	return new DD(ga(id, clazz), Stream.of(childeren));
    }

    public static FigCaption figcaption(Id id, Clazz clazz, FlowContent... childeren) {
	return new FigCaption(ga(id, clazz), Stream.of(childeren));
    }

    public static Div div(Id id, Clazz clazz, FlowContent... childeren) {
	return new Div(ga(id, clazz), Stream.of(childeren));
    }

    public static Main main(Id id, Clazz clazz, FlowContent... childeren) {
	return new Main(ga(id, clazz), Stream.of(childeren));
    }

    public static Article article(FlowContent... childeren) {
	return new Article(Stream.<GlobalAttribute> empty(), Stream.of(childeren));
    }

    public static Section section(FlowContent... childeren) {
	return new Section(Stream.<GlobalAttribute> empty(), Stream.of(childeren));
    }

    public static Nav nav(FlowContent... childeren) {
	return new Nav(Stream.empty(), Stream.of(childeren));
    }

    public static Aside aside(FlowContent... childeren) {
	return new Aside(Stream.empty(), Stream.of(childeren));
    }

    public static H1 h1(PhrasingContent... childeren) {
	return new H1(Stream.empty(), Stream.of(childeren));
    }

    public static H2 h2(PhrasingContent... childeren) {
	return new H2(Stream.empty(), Stream.of(childeren));
    }

    public static H3 h3(PhrasingContent... childeren) {
	return new H3(Stream.empty(), Stream.of(childeren));
    }

    public static H4 h4(PhrasingContent... childeren) {
	return new H4(Stream.empty(), Stream.of(childeren));
    }

    public static H5 h5(PhrasingContent... childeren) {
	return new H5(Stream.empty(), Stream.of(childeren));
    }

    public static H6 h6(PhrasingContent... childeren) {
	return new H6(Stream.empty(), Stream.of(childeren));
    }

    public static Header header(FlowContent... childeren) {
	return new Header(Stream.empty(), Stream.of(childeren));
    }

    public static Footer footer(FlowContent... childeren) {
	return new Footer(Stream.empty(), Stream.of(childeren));
    }

    public static Address address(FlowContent... childeren) {
	return new Address(Stream.empty(), Stream.of(childeren));
    }

    public static P p(PhrasingContent... childeren) {
	return new P(Stream.empty(), Stream.of(childeren));
    }

    public static Pre pre(PhrasingContent... childeren) {
	return new Pre(Stream.empty(), Stream.of(childeren));
    }

    public static BlockQuote blockquote(FlowContent... childeren) {
	return new BlockQuote(Stream.empty(), null, Stream.of(childeren));
    }

    public static OL ol(Stream<LI> childeren) {
	Reversed reversed = (Reversed) null;
	Start start = (Start) null;
	Type type = (Type) null;
	return new OL(null, reversed, start, type, childeren);
    }

    public static UL ul(LI... childeren) {
	return new UL(Stream.empty(), Stream.of(childeren));
    }

    public static LI li(FlowContent... childeren) {
	return new LI(Stream.empty(), Stream.of(childeren), null);
    }

    public static DL dl(DtOrDd... childeren) {
	return new DL(Stream.of(childeren));
    }

    public static DT dt(FlowContent... childeren) {
	return new DT(Stream.empty(), Stream.of(childeren));
    }

    public static DD dd(FlowContent... childeren) {
	return new DD(Stream.empty(), Stream.of(childeren));
    }

    public static FigCaption figcaption(FlowContent... childeren) {
	return new FigCaption(Stream.empty(), Stream.of(childeren));
    }

    public static Div div(FlowContent... childeren) {
	return new Div(Stream.empty(), Stream.of(childeren));
    }

    public static Main main(FlowContent... childeren) {
	return new Main(Stream.empty(), Stream.of(childeren));
    }

    public static A a(Id id, Clazz clazz, String string) {
	return new A(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Abbr abbr(Id id, Clazz clazz, String string) {
	return new Abbr(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static B b(Id id, Clazz clazz, String string) {
	return new B(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Bdi bdi(Id id, Clazz clazz, String string) {
	return new Bdi(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Bdo bdo(Id id, Clazz clazz, String string) {
	return new Bdo(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Cite cite(Id id, Clazz clazz, String string) {
	return new Cite(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Code code(Id id, Clazz clazz, String string) {
	return new Code(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Data data(Id id, Clazz clazz, String string) {
	return new Data(ga(id, clazz), Stream.of(new Text(string)), null);
    }

    public static Dfn ffn(Id id, Clazz clazz, String string) {
	return new Dfn(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Em em(Id id, Clazz clazz, String string) {
	return new Em(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static I i(Id id, Clazz clazz, String string) {
	return new I(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Kbd kbd(Id id, Clazz clazz, String string) {
	return new Kbd(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Mark mark(Id id, Clazz clazz, String string) {
	return new Mark(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Q q(Id id, Clazz clazz, String string) {
	return new Q(ga(id, clazz), Stream.of(new Text(string)), null);
    }

    public static S s(Id id, Clazz clazz, String string) {
	return new S(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Samp samp(Id id, Clazz clazz, String string) {
	return new Samp(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Small small(Id id, Clazz clazz, String string) {
	return new Small(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Span span(Id id, Clazz clazz, String string) {
	return new Span(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Strong strong(Id id, Clazz clazz, String string) {
	return new Strong(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Sub sub(Id id, Clazz clazz, String string) {
	return new Sub(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Sup sup(Id id, Clazz clazz, String string) {
	return new Sup(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static U u(Id id, Clazz clazz, String string) {
	return new U(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Var var(Id id, Clazz clazz, String string) {
	return new Var(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static A a(Id id, String string) {
	return new A(ga(id), Stream.of(new Text(string)));
    }

    public static Abbr abbr(Id id, String string) {
	return new Abbr(ga(id), Stream.of(new Text(string)));
    }

    public static B b(Id id, String string) {
	return new B(ga(id), Stream.of(new Text(string)));
    }

    public static Bdi bdi(Id id, String string) {
	return new Bdi(ga(id), Stream.of(new Text(string)));
    }

    public static Bdo bdo(Id id, String string) {
	return new Bdo(ga(id), Stream.of(new Text(string)));
    }

    public static Cite cite(Id id, String string) {
	return new Cite(ga(id), Stream.of(new Text(string)));
    }

    public static Code code(Id id, String string) {
	return new Code(ga(id), Stream.of(new Text(string)));
    }

    public static Data data(Id id, String string) {
	return new Data(ga(id), Stream.of(new Text(string)), null);
    }

    public static Dfn ffn(Id id, String string) {
	return new Dfn(ga(id), Stream.of(new Text(string)));
    }

    public static Em em(Id id, String string) {
	return new Em(ga(id), Stream.of(new Text(string)));
    }

    public static I i(Id id, String string) {
	return new I(ga(id), Stream.of(new Text(string)));
    }

    public static Kbd kbd(Id id, String string) {
	return new Kbd(ga(id), Stream.of(new Text(string)));
    }

    public static Mark mark(Id id, String string) {
	return new Mark(ga(id), Stream.of(new Text(string)));
    }

    public static Q q(Id id, String string) {
	return new Q(ga(id), Stream.of(new Text(string)), null);
    }

    public static S s(Id id, String string) {
	return new S(ga(id), Stream.of(new Text(string)));
    }

    public static Samp samp(Id id, String string) {
	return new Samp(ga(id), Stream.of(new Text(string)));
    }

    public static Small small(Id id, String string) {
	return new Small(ga(id), Stream.of(new Text(string)));
    }

    public static Span span(Id id, String string) {
	return new Span(ga(id), Stream.of(new Text(string)));
    }

    public static Strong strong(Id id, String string) {
	return new Strong(ga(id), Stream.of(new Text(string)));
    }

    public static Sub sub(Id id, String string) {
	return new Sub(ga(id), Stream.of(new Text(string)));
    }

    public static Sup sup(Id id, String string) {
	return new Sup(ga(id), Stream.of(new Text(string)));
    }

    public static U u(Id id, String string) {
	return new U(ga(id), Stream.of(new Text(string)));
    }

    public static Var var(Id id, String string) {
	return new Var(ga(id), Stream.of(new Text(string)));
    }

    public static A a(Clazz clazz, String string) {
	return new A(ga(clazz), Stream.of(new Text(string)));
    }

    public static Abbr abbr(Clazz clazz, String string) {
	return new Abbr(ga(clazz), Stream.of(new Text(string)));
    }

    public static B b(Clazz clazz, String string) {
	return new B(ga(clazz), Stream.of(new Text(string)));
    }

    public static Bdi bdi(Clazz clazz, String string) {
	return new Bdi(ga(clazz), Stream.of(new Text(string)));
    }

    public static Bdo bdo(Clazz clazz, String string) {
	return new Bdo(ga(clazz), Stream.of(new Text(string)));
    }

    public static Cite cite(Clazz clazz, String string) {
	return new Cite(ga(clazz), Stream.of(new Text(string)));
    }

    public static Code code(Clazz clazz, String string) {
	return new Code(ga(clazz), Stream.of(new Text(string)));
    }

    public static Data data(Clazz clazz, String string) {
	return new Data(ga(clazz), Stream.of(new Text(string)), null);
    }

    public static Dfn ffn(Clazz clazz, String string) {
	return new Dfn(ga(clazz), Stream.of(new Text(string)));
    }

    public static Em em(Clazz clazz, String string) {
	return new Em(ga(clazz), Stream.of(new Text(string)));
    }

    public static I i(Clazz clazz, String string) {
	return new I(ga(clazz), Stream.of(new Text(string)));
    }

    public static Kbd kbd(Clazz clazz, String string) {
	return new Kbd(ga(clazz), Stream.of(new Text(string)));
    }

    public static Mark mark(Clazz clazz, String string) {
	return new Mark(ga(clazz), Stream.of(new Text(string)));
    }

    public static Q q(Clazz clazz, String string) {
	return new Q(ga(clazz), Stream.of(new Text(string)), null);
    }

    public static S s(Clazz clazz, String string) {
	return new S(ga(clazz), Stream.of(new Text(string)));
    }

    public static Samp samp(Clazz clazz, String string) {
	return new Samp(ga(clazz), Stream.of(new Text(string)));
    }

    public static Small small(Clazz clazz, String string) {
	return new Small(ga(clazz), Stream.of(new Text(string)));
    }

    public static Span span(Clazz clazz, String string) {
	return new Span(ga(clazz), Stream.of(new Text(string)));
    }

    public static Span span(Clazz clazz, PhrasingContent... contents) {
	return new Span(ga(clazz), Stream.of(contents));
    }

    public static Strong strong(Clazz clazz, String string) {
	return new Strong(ga(clazz), Stream.of(new Text(string)));
    }

    public static Sub sub(Clazz clazz, String string) {
	return new Sub(ga(clazz), Stream.of(new Text(string)));
    }

    public static Sup sup(Clazz clazz, String string) {
	return new Sup(ga(clazz), Stream.of(new Text(string)));
    }

    public static U u(Clazz clazz, String string) {
	return new U(ga(clazz), Stream.of(new Text(string)));
    }

    public static Var var(Clazz clazz, String string) {
	return new Var(ga(clazz), Stream.of(new Text(string)));
    }

    public static H1 h1(Id id, Clazz clazz, String string) {
	return new H1(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static H2 h2(Id id, Clazz clazz, String string) {
	return new H2(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static H3 h3(Id id, Clazz clazz, String string) {
	return new H3(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static H4 h4(Id id, Clazz clazz, String string) {
	return new H4(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static H5 h5(Id id, Clazz clazz, String string) {
	return new H5(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static H6 h6(Id id, Clazz clazz, String string) {
	return new H6(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Address address(Id id, Clazz clazz, String string) {
	return new Address(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Article article(Id id, Clazz clazz, String string) {
	return new Article(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Aside aside(Id id, Clazz clazz, String string) {
	return new Aside(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Body body(Id id, Clazz clazz, String string) {
	return new Body(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Footer footer(Id id, Clazz clazz, String string) {
	return new Footer(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Header header(Id id, Clazz clazz, String string) {
	return new Header(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Nav nav(Id id, Clazz clazz, String string) {
	return new Nav(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Section section(Id id, Clazz clazz, String string) {
	return new Section(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static BlockQuote BlockQuote(Id id, Clazz clazz, String string) {
	return new BlockQuote(ga(id, clazz), null, Stream.of(new Text(string)));
    }

    public static Div Div(Id id, Clazz clazz, String string) {
	return new Div(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static LI LI(Id id, Clazz clazz, String string) {
	return new LI(ga(id, clazz), Stream.of(new Text(string)), null);
    }

    public static Main Main(Id id, Clazz clazz, String string) {
	return new Main(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static P P(Id id, Clazz clazz, String string) {
	return new P(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static Pre Pre(Id id, Clazz clazz, String string) {
	return new Pre(ga(id, clazz), Stream.of(new Text(string)));
    }

    public static H1 h1(Id id, String string) {
	return new H1(ga(id), Stream.of(new Text(string)));
    }

    public static H2 h2(Id id, String string) {
	return new H2(ga(id), Stream.of(new Text(string)));
    }

    public static H3 h3(Id id, String string) {
	return new H3(ga(id), Stream.of(new Text(string)));
    }

    public static H4 h4(Id id, String string) {
	return new H4(ga(id), Stream.of(new Text(string)));
    }

    public static H5 h5(Id id, String string) {
	return new H5(ga(id), Stream.of(new Text(string)));
    }

    public static H6 h6(Id id, String string) {
	return new H6(ga(id), Stream.of(new Text(string)));
    }

    public static Address address(Id id, String string) {
	return new Address(ga(id), Stream.of(new Text(string)));
    }

    public static Article article(Id id, String string) {
	return new Article(ga(id), Stream.of(new Text(string)));
    }

    public static Aside aside(Id id, String string) {
	return new Aside(ga(id), Stream.of(new Text(string)));
    }

    public static Body body(Id id, String string) {
	return new Body(ga(id), Stream.of(new Text(string)));
    }

    public static Footer footer(Id id, String string) {
	return new Footer(ga(id), Stream.of(new Text(string)));
    }

    public static Header header(Id id, String string) {
	return new Header(ga(id), Stream.of(new Text(string)));
    }

    public static Nav nav(Id id, String string) {
	return new Nav(ga(id), Stream.of(new Text(string)));
    }

    public static Section section(Id id, String string) {
	return new Section(ga(id), Stream.of(new Text(string)));
    }

    public static BlockQuote BlockQuote(Id id, String string) {
	return new BlockQuote(ga(id), null, Stream.of(new Text(string)));
    }

    public static Div Div(Id id, String string) {
	return new Div(ga(id), Stream.of(new Text(string)));
    }

    public static LI LI(Id id, String string) {
	return new LI(ga(id), Stream.of(new Text(string)), null);
    }

    public static Main Main(Id id, String string) {
	return new Main(ga(id), Stream.of(new Text(string)));
    }

    public static P P(Id id, String string) {
	return new P(ga(id), Stream.of(new Text(string)));
    }

    public static Pre Pre(Id id, String string) {
	return new Pre(ga(id), Stream.of(new Text(string)));
    }

    public static H1 h1(Clazz clazz, String string) {
	return new H1(ga(clazz), Stream.of(new Text(string)));
    }

    public static H2 h2(Clazz clazz, String string) {
	return new H2(ga(clazz), Stream.of(new Text(string)));
    }

    public static H3 h3(Clazz clazz, String string) {
	return new H3(ga(clazz), Stream.of(new Text(string)));
    }

    public static H4 h4(Clazz clazz, String string) {
	return new H4(ga(clazz), Stream.of(new Text(string)));
    }

    public static H5 h5(Clazz clazz, String string) {
	return new H5(ga(clazz), Stream.of(new Text(string)));
    }

    public static H6 h6(Clazz clazz, String string) {
	return new H6(ga(clazz), Stream.of(new Text(string)));
    }

    public static Address address(Clazz clazz, String string) {
	return new Address(ga(clazz), Stream.of(new Text(string)));
    }

    public static Article article(Clazz clazz, String string) {
	return new Article(ga(clazz), Stream.of(new Text(string)));
    }

    public static Aside aside(Clazz clazz, String string) {
	return new Aside(ga(clazz), Stream.of(new Text(string)));
    }

    public static Body body(Clazz clazz, String string) {
	return new Body(ga(clazz), Stream.of(new Text(string)));
    }

    public static Footer footer(Clazz clazz, String string) {
	return new Footer(ga(clazz), Stream.of(new Text(string)));
    }

    public static Header header(Clazz clazz, String string) {
	return new Header(ga(clazz), Stream.of(new Text(string)));
    }

    public static Nav nav(Clazz clazz, String string) {
	return new Nav(ga(clazz), Stream.of(new Text(string)));
    }

    public static Section section(Clazz clazz, String string) {
	return new Section(ga(clazz), Stream.of(new Text(string)));
    }

    public static BlockQuote BlockQuote(Clazz clazz, String string) {
	return new BlockQuote(ga(clazz), null, Stream.of(new Text(string)));
    }

    public static Div Div(Clazz clazz, String string) {
	return new Div(ga(clazz), Stream.of(new Text(string)));
    }

    public static LI LI(Clazz clazz, String string) {
	return new LI(ga(clazz), Stream.of(new Text(string)), null);
    }

    public static Main Main(Clazz clazz, String string) {
	return new Main(ga(clazz), Stream.of(new Text(string)));
    }

    public static P P(Clazz clazz, String string) {
	return new P(ga(clazz), Stream.of(new Text(string)));
    }

    public static Pre Pre(Clazz clazz, String string) {
	return new Pre(ga(clazz), Stream.of(new Text(string)));
    }

    public static Button button(Id id, Clazz clazz) {
	return new Button(ga(id, clazz), Stream.empty());
    }

    public static DataList<Option> dataList(Id id, Clazz clazz) {
	return new DataList<Option>(ga(id, clazz), Stream.empty());
    }

    public static FieldSet fieldSet(Id id, Clazz clazz) {
	return new FieldSet(ga(id, clazz), null, null, null, null, Stream.empty());
    }

    public static Form form(Id id, Clazz clazz) {
	return new Form(ga(id, clazz), Stream.empty());
    }

    public static Input input(Id id, Clazz clazz) {
	return new Input(ga(id, clazz));
    }

    public static Input input(Id id, Clazz clazz, ch.isb_sib.swiss_prot.sjh.attributes.form.Type type) {
	return new Input(ga(id, clazz), type);
    }

    public static Input input(Id id, Clazz clazz, ch.isb_sib.swiss_prot.sjh.attributes.form.Type type, Checked checked,
	    Disabled disabled) {
	return new Input(ga(id, clazz), checked, disabled, type);
    }

    public static Label label(Id id, Clazz clazz) {
	return new Label(ga(id, clazz), null, null);
    }

    public static Legend legend(Id id, Clazz clazz) {
	return new Legend(ga(id, clazz), Stream.empty());
    }

    public static Meter meter(Id id, Clazz clazz) {
	return new Meter(ga(id, clazz), null, null, null, null, null, null);
    }

    public static OptGroup optgroup(Id id, Clazz clazz) {
	return new OptGroup(ga(id, clazz), null, null, Stream.empty());
    }

    public static Option option(Id id, Clazz clazz) {
	return new Option(ga(id, clazz), null, null, null, (Value) null);
    }

    public static Option option(Stream<GlobalAttribute> gas, Value value) {
	return new Option(gas, null, null, null, value);
    }

    public static Option option(Selected selected, Value value) {
	return new Option(Stream.empty(), null, null, selected, value);
    }

    public static Option option(Selected selected, Value value, Text text) {
	return new Option(Stream.empty(), null, null, selected, value, text);
    }

    public static Output output(Id id, Clazz clazz) {
	return new Output(ga(id, clazz), null, null, null, Stream.empty());
    }

    public static Progress progress(Id id, Clazz clazz) {
	return new Progress(ga(id, clazz), null, null);
    }

    public static Select select(Id id, Clazz clazz) {
	return new Select(ga(id, clazz), null, null, null, null, null, null, null, null, Stream.empty());
    }

    public static Select select(Name name, Stream<OptionOrOptGroup> childeren) {
	return new Select(Stream.empty(), null, null, null, null, null, null, name, null, childeren);
    }

    public static TextArea textArea(Id id, Clazz clazz) {
	return new TextArea(ga(id, clazz), null, null, null, null, null, null, null, null, null, null, null, null, null,
		null, null);
    }

    public static Canvas canvas(Id id, Clazz clazz) {
	return new Canvas(ga(id, clazz), null, null, Stream.empty());
    }

    public static NoScript noscript(Id id, Clazz clazz) {
	return new NoScript(ga(id, clazz), Stream.empty());
    }

    public static Script script(Id id, Clazz clazz) {
		return new Script(ga(id, clazz), null, null, null, null, null, null, null, null, null);
    }

    public static Template template(Id id, Clazz clazz) {
	return new Template(ga(id, clazz), Stream.empty());
    }

    public static Caption caption(Id id, Clazz clazz) {
	return new Caption(ga(id, clazz), Stream.empty());
    }

    public static Col col(Id id, Clazz clazz) {
	return new Col(ga(id, clazz), null);
    }

    public static ColGroup colgroup(Id id, Clazz clazz) {
	return new ColGroup(ga(id, clazz), Stream.empty());
    }

    public static Table table(Id id, Clazz clazz) {
	return new Table(ga(id, clazz), null, Stream.empty(), null, null, Stream.empty(), Stream.empty(), null, null);
    }

    public static TBody tbody(Id id, Clazz clazz) {
	return new TBody(ga(id, clazz), Stream.empty());
    }

    public static TD td(Id id, Clazz clazz) {
	return new TD(ga(id, clazz), Stream.empty(), null, null, null);
    }

    public static TFoot tfoot(Id id, Clazz clazz) {
	return new TFoot(ga(id, clazz), Stream.empty());
    }

    public static TH th(Id id, Clazz clazz) {
	return new TH(ga(id, clazz), Stream.empty(), null, null, null, null, null, null);
    }

    public static THead thead(Id id, Clazz clazz) {
	return new THead(ga(id, clazz), Stream.empty());
    }

    public static TR tr(Id id, Clazz clazz) {
	return new TR(ga(id, clazz), Stream.empty());
    }

    public static Button button(Id id, Stream<OptionOrOptGroup> childeren) {
	return new Button(ga(id), childeren);
    }

    public static DataList<Option> datalist(Id id, Stream<Option> childeren) {
	return new DataList<Option>(ga(id), childeren);
    }

    public static FieldSet fieldset(Id id, Stream<? extends FlowContent> childeren) {
	return new FieldSet(ga(id), null, null, null, null, childeren);
    }

    public static Form form(Id id, Stream<? extends FlowContent> childeren) {
	return new Form(ga(id), childeren);
    }

    public static Legend legend(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Legend(ga(id), childeren);
    }

    public static Meter meter(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Meter(ga(id), null, null, null, null, null, null, childeren);
    }

    public static OptGroup optgroup(Id id, Stream<Option> childeren) {
	return new OptGroup(ga(id), null, null, childeren);
    }

    public static Output output(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Output(ga(id), null, null, null, childeren);
    }

    public static Progress progress(Id id, Stream<? extends PhrasingContent> childeren) {
	return new Progress(ga(id), null, null, childeren);
    }

    public static Select select(Id id, Stream<OptionOrOptGroup> childeren) {
	return new Select(ga(id), null, null, null, null, null, null, null, null, childeren);
    }

    public static TextArea textArea(Id id, String text) {
	return new TextArea(ga(id), null, null, null, null, null, null, null, null, null, null, null, null, null, null,
		new Text(text));
    }

    public static Canvas canvas(Id id, Stream<? extends FlowContent> childeren) {
	return new Canvas(ga(id), null, null, childeren);
    }

    public static NoScript noscript(Id id, Stream<? extends FlowContent> childeren) {
	return new NoScript(ga(id), childeren);
    }

    public static Script script(Id id, String text) {
		return new Script(ga(id), null, null, null, null, null, null, null, null, new Text(text));
    }

    public static Template template(Id id, Stream<? extends FlowContent> childeren) {
	return new Template(ga(id), childeren);
    }

    public static Caption caption(Id id, Stream<? extends FlowContent> childeren) {
	return new Caption(ga(id), childeren);
    }

    public static Col col(Id id, String span) {
	return new Col(ga(id), new ch.isb_sib.swiss_prot.sjh.attributes.table.Span(span));
    }

    public static ColGroup colgroup(Id id, Stream<ColOrTemplate> childeren) {
	return new ColGroup(ga(id), childeren);
    }

    public static TBody tbody(Id id, Stream<TR> childeren) {
	return new TBody(ga(id), childeren);
    }

    public static TD td(Id id, Stream<? extends FlowContent> childeren) {
	return new TD(ga(id), childeren, null, null, null);
    }

    public static TFoot tfoot(Id id, Stream<TR> childeren) {
	return new TFoot(ga(id), childeren);
    }

    public static TH th(Id id, Stream<? extends FlowContent> childeren) {
	return new TH(ga(id), childeren, null, null, null, null, null, null);
    }

    public static THead thead(Id id, Stream<TR> childeren) {
	return new THead(ga(id), childeren);
    }

    public static TR tr(Id id, Stream<TDOrTH> childeren) {
	return new TR(ga(id), childeren);
    }

    public static Button button(Clazz clazz, Stream<OptionOrOptGroup> childeren) {
	return new Button(ga(clazz), childeren);
    }

    public static DataList<Option> datalist(Clazz clazz, Stream<Option> childeren) {
	return new DataList<Option>(ga(clazz), childeren);
    }

    public static FieldSet fieldset(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new FieldSet(ga(clazz), null, null, null, null, childeren);
    }

    public static Form form(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Form(ga(clazz), childeren);
    }

    public static Legend legend(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Legend(ga(clazz), childeren);
    }

    public static Meter meter(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Meter(ga(clazz), null, null, null, null, null, null, childeren);
    }

    public static OptGroup optgroup(Clazz clazz, Stream<Option> childeren) {
	return new OptGroup(ga(clazz), null, null, childeren);
    }

    public static Output output(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Output(ga(clazz), null, null, null, childeren);
    }

    public static Progress progress(Clazz clazz, Stream<? extends PhrasingContent> childeren) {
	return new Progress(ga(clazz), null, null, childeren);
    }

    public static Select select(Clazz clazz, Stream<OptionOrOptGroup> childeren) {
	return new Select(ga(clazz), null, null, null, null, null, null, null, null, childeren);
    }

    public static TextArea textArea(Clazz clazz, String text) {
	return new TextArea(ga(clazz), null, null, null, null, null, null, null, null, null, null, null, null, null,
		null, new Text(text));
    }

    public static Canvas canvas(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Canvas(ga(clazz), null, null, childeren);
    }

    public static NoScript noscript(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new NoScript(ga(clazz), childeren);
    }

    public static Script script(Clazz clazz, String text) {
		return new Script(ga(clazz), null, null, null, null, null, null, null, null, new Text(text));
    }

    public static Template template(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Template(ga(clazz), childeren);
    }

    public static Caption caption(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new Caption(ga(clazz), childeren);
    }

    public static Col col(Clazz clazz, String span) {
	return new Col(ga(clazz), new ch.isb_sib.swiss_prot.sjh.attributes.table.Span(span));
    }

    public static ColGroup colgroup(Clazz clazz, Stream<ColOrTemplate> childeren) {
	return new ColGroup(ga(clazz), childeren);
    }

    public static TBody tbody(Clazz clazz, Stream<TR> childeren) {
	return new TBody(ga(clazz), childeren);
    }

    public static TD td(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new TD(ga(clazz), childeren, null, null, null);
    }

    public static TFoot tfoot(Clazz clazz, Stream<TR> childeren) {
	return new TFoot(ga(clazz), childeren);
    }

    public static TH th(Clazz clazz, Stream<? extends FlowContent> childeren) {
	return new TH(ga(clazz), childeren, null, null, null, null, null, null);
    }

    public static THead thead(Clazz clazz, Stream<TR> childeren) {
	return new THead(ga(clazz), childeren);
    }

    public static TR tr(Clazz clazz, Stream<TDOrTH> childeren) {
	return new TR(ga(clazz), childeren);
    }

    public static Text text(String text) {
	return new Text(text);
    }

    public static None none() {
	return None.none;
    }
}
