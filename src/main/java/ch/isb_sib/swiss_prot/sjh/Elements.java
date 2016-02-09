package ch.isb_sib.swiss_prot.sjh;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.DateTime;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
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


public class Elements
{
	public static HTML html()
	{
		return new HTML();
	}

	public static HTML html(Head head, Body body)
	{
		return new HTML(head, body);
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

	public static Base base()
	{
		return new Base();
	}

	public static Meta meta()
	{
		return new Meta(null, null, null, null, null);
	}

	public static Link link(Href href, Rel rel)
	{
		return new Link(null, href, null, rel, null, null, null, null);
	}

	public static Style style()
	{
		return new Style();
	}

	public static Body body()
	{
		return new Body();
	}

	public static Body body(Element... content)
	{
		return new Body(Stream.of(content));
	}

	public static Article article()
	{
		return new Article();
	}

	public static Section section()
	{
		return new Section();
	}

	public static Nav nav()
	{
		return new Nav();
	}

	public static Aside aside()
	{
		return new Aside();
	}

	public static H1 h1()
	{
		return new H1();
	}

	public static H2 h2()
	{
		return new H2();
	}

	public static H3 h3()
	{
		return new H3();
	}

	public static H4 h4()
	{
		return new H4();
	}

	public static H5 h5()
	{
		return new H5();
	}

	public static H6 h6()
	{
		return new H6();
	}

	public static Header header()
	{
		return new Header();
	}

	public static Footer footer()
	{
		return new Footer();
	}

	public static Address address()
	{
		return new Address();
	}

	public static P p()
	{
		return new P();
	}

	public static HR hr()
	{
		return new HR();
	}

	public static Pre pre()
	{
		return new Pre();
	}

	public static BlockQuote blockquote()
	{
		return new BlockQuote();
	}

	public static OL ol()
	{
		return new OL();
	}

	public static UL ul()
	{
		return new UL();
	}

	public static LI li()
	{
		return new LI();
	}

	public static DL dl()
	{
		return new DL();
	}

	public static DT dt()
	{
		return new DT();
	}

	public static DD dd()
	{
		return new DD();
	}

	public static Figure figure(Stream<? extends FlowContent> childeren)
	{
		return new Figure(childeren);
	}

	public static FigCaption figcaption()
	{
		return new FigCaption();
	}

	public static Div div()
	{
		return new Div();
	}

	public static Main main()
	{
		return new Main();
	}

	public static A a(Stream<Element> childeren)
	{
		return new A(childeren);
	}

	public static Em em()
	{
		return new Em();
	}

	public static Strong strong()
	{
		return new Strong();
	}

	public static Small small()
	{
		return new Small();
	}

	public static S s()
	{
		return new S();
	}

	public static Cite cite()
	{
		return new Cite();
	}

	public static Q q(Stream<? extends PhrasingContent> childeren)
	{
		return new Q(childeren);
	}

	public static Dfn dfn()
	{
		return new Dfn();
	}

	public static Abbr abbr()
	{
		return new Abbr();
	}

	public static Data data(Stream<? extends PhrasingContent> childeren)
	{
		return new Data(childeren);
	}

	public static Time time()
	{
		return new Time();
	}

	public static Code code()
	{
		return new Code();
	}

	public static Var var()
	{
		return new Var();
	}

	public static Samp samp()
	{
		return new Samp();
	}

	public static Kbd kbd()
	{
		return new Kbd();
	}

	public static Sub sub()
	{
		return new Sub();
	}

	public static Sup sup()
	{
		return new Sup();
	}

	public static I i()
	{
		return new I();
	}

	public static B b()
	{
		return new B();
	}

	public static U u()
	{
		return new U();
	}

	public static Mark mark()
	{
		return new Mark();
	}

	public static Ruby ruby()
	{
		return new Ruby();
	}

	public static Rb rb()
	{
		return new Rb();
	}

	public static Rt rt()
	{
		return new Rt();
	}

	public static Rtc rtc()
	{
		return new Rtc();
	}

	public static Rp rp()
	{
		return new Rp();
	}

	public static Bdi bdi(Stream<? extends PhrasingContent> childeren)
	{
		return new Bdi(childeren);
	}

	public static Bdo bdo(Stream<? extends PhrasingContent> childeren)
	{
		return new Bdo(childeren);
	}

	public static Span span(Stream<? extends PhrasingContent> childeren)
	{
		return new Span(childeren);
	}

	public static Span span()
	{
		return new Span(Stream.empty());
	}

	public static Br br()
	{
		return new Br();
	}

	public static WBr wbr()
	{
		return new WBr();
	}

	public static Img img()
	{
		return new Img(null, null, null, null, null, null, null, null);
	}

	public static Iframe iframe()
	{
		return new Iframe(null, null, null, null, null, null, null);
	}

	public static Embed embed()
	{
		return new Embed(null, null, null, null, null);
	}

	public static Object object()
	{
		return new Object(null, null, null, null, null, null, null, null, null, Stream.<Param> empty());
	}

	public static Param param()
	{
		return new Param(null, null, null);
	}

	public static Video video()
	{
		return new Video(null, null, null, null, null, null, null, null, null, null, null, (Height) null,
		    Stream.<Track> empty());
	}

	public static Audio audio()
	{
		return new Audio(new GlobalAttribute[0]);
	}

	public static Source source()
	{
		return new Source(null, null, null, null, null, null);
	}

	public static Track track()
	{
		return new Track(null, null, null);
	}

	public static Map map()
	{
		return new Map(null, null, Stream.<FlowContent> empty());
	}

	public static Area area()
	{
		return new Area();
	}

	public static Article article(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Article(new GlobalAttribute[] { id }, childeren);
	}

	public static Section section(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Section(new GlobalAttribute[] { id }, childeren);
	}

	public static Nav nav(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Nav(new GlobalAttribute[] { id }, childeren);
	}

	public static Aside aside(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Aside(new GlobalAttribute[] { id }, childeren);
	}

	public static H1 h1(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new H1(new GlobalAttribute[] { id }, childeren);
	}

	public static H2 h2(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new H2(new GlobalAttribute[] { id }, childeren);
	}

	public static H3 h3(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new H3(new GlobalAttribute[] { id }, childeren);
	}

	public static H4 h4(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new H4(new GlobalAttribute[] { id }, childeren);
	}

	public static H5 h5(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new H5(new GlobalAttribute[] { id }, childeren);
	}

	public static H6 h6(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new H6(new GlobalAttribute[] { id }, childeren);
	}

	public static Header header(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Header(new GlobalAttribute[] { id }, childeren);
	}

	public static Footer footer(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Footer(new GlobalAttribute[] { id }, childeren);
	}

	public static Address address(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Address(new GlobalAttribute[] { id }, childeren);
	}

	public static P p(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new P(new GlobalAttribute[] { id }, childeren);
	}

	public static Pre pre(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Pre(new GlobalAttribute[] { id }, childeren);
	}

	public static BlockQuote blockquote(Id id, Stream<? extends FlowContent> childeren)
	{
		return new BlockQuote(new GlobalAttribute[] { id }, null, childeren);
	}

	public static OL ol(Id id, Stream<LI> childeren)
	{
		GlobalAttribute[] ga = new GlobalAttribute[] { id };
		Reversed reversed = (Reversed) null;
		Start start = (Start) null;
		Type type = (Type) null;
		return new OL(ga, reversed, start, type, childeren);
	}

	public static UL ul(Id id, Stream<LI> childeren)
	{
		return new UL(new GlobalAttribute[] { id }, childeren);
	}

	public static LI li(Id id, Stream<? extends FlowContent> childeren)
	{
		return new LI(new GlobalAttribute[] { id }, childeren, null);
	}

	public static DL dl(Id id, Stream<? extends DtOrDd> childeren)
	{
		return new DL(new GlobalAttribute[] { id }, childeren);
	}

	public static DT dt(Id id, Stream<? extends FlowContent> childeren)
	{
		return new DT(new GlobalAttribute[] { id }, childeren);
	}

	public static DD dd(Id id, Stream<? extends FlowContent> childeren)
	{
		return new DD(new GlobalAttribute[] { id }, childeren);
	}

	public static FigCaption figcaption(Id id, Stream<? extends FlowContent> childeren)
	{
		return new FigCaption(new GlobalAttribute[] { id }, childeren);
	}

	public static Div div(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Div(new GlobalAttribute[] { id }, childeren);
	}

	public static Main main(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Main(new GlobalAttribute[] { id }, childeren);
	}

	public static A a(Id id)
	{
		return new A(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Em em(Id id)
	{
		return new Em(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Strong strong(Id id)
	{
		return new Strong(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Small small(Id id)
	{
		return new Small(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static S s(Id id)
	{
		return new S(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Cite cite(Id id)
	{
		return new Cite(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Q q(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Q(new GlobalAttribute[] { id }, childeren, null);
	}

	public static Dfn dfn(Id id)
	{
		return new Dfn(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Abbr abbr(Id id)
	{
		return new Abbr(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Data data(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Data(new GlobalAttribute[] { id }, childeren, null);
	}

	public static Time time(Id id, DateTime dt)
	{
		return new Time(new GlobalAttribute[] { id }, Stream.empty(), dt);
	}

	public static Code code(Id id)
	{
		return new Code(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Var var(Id id)
	{
		return new Var(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Samp samp(Id id)
	{
		return new Samp(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Kbd kbd(Id id)
	{
		return new Kbd(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Sub sub(Id id)
	{
		return new Sub(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Sup sup(Id id)
	{
		return new Sup(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static I i(Id id)
	{
		return new I(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static B b(Id id)
	{
		return new B(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static U u(Id id)
	{
		return new U(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Mark mark(Id id)
	{
		return new Mark(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Ruby ruby(Id id)
	{
		return new Ruby(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Rb rb(Id id)
	{
		return new Rb(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Rt rt(Id id)
	{
		return new Rt(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Rtc rtc(Id id)
	{
		return new Rtc(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Rp rp(Id id)
	{
		return new Rp(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Bdi bdi(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Bdi(new GlobalAttribute[] { id }, childeren);
	}

	public static Bdo bdo(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Bdo(new GlobalAttribute[] { id }, childeren);
	}

	public static Span span(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Span(new GlobalAttribute[] { id }, childeren);
	}

	public static Br br(Id id)
	{
		return new Br(new GlobalAttribute[] { id });
	}

	public static WBr wbr(Id id)
	{
		return new WBr(new GlobalAttribute[] { id });
	}

	public static Img img(Id id)
	{
		return new Img(new GlobalAttribute[] { id }, null, null, null, null, null, null, null);
	}

	public static Iframe iframe(Id id)
	{
		return new Iframe(new GlobalAttribute[] { id }, null, null, null, null, null, null);
	}

	public static Embed embed(Id id)
	{
		return new Embed(new GlobalAttribute[] { id }, null, null, null, null);
	}

	public static Object object(Id id)
	{
		return new Object(new GlobalAttribute[] { id }, null, null, null, null, null, null, null, null,
		    Stream.<Param> empty());
	}

	public static Param param(Id id)
	{
		return new Param(new GlobalAttribute[] { id }, null, null);
	}

	public static Video video(Id id)
	{
		return new Video(new GlobalAttribute[] { id }, null, null, null, null, null, null, null, null, null,
		    null, (Height) null,
		    Stream.<Track> empty());
	}

	public static Audio audio(Id id)
	{
		return new Audio(new GlobalAttribute[] { id });
	}

	public static Source source(Id id)
	{
		return new Source(new GlobalAttribute[] { id }, null, null, null, null, null);
	}

	public static Track track(Id id)
	{
		return new Track(new GlobalAttribute[] { id }, null, null);
	}

	public static Map map(Id id)
	{
		return new Map(new GlobalAttribute[] { id }, null, Stream.<FlowContent> empty());
	}

	public static Area area(Id id)
	{
		return new Area(new GlobalAttribute[] { id });
	}

	public static HTML html(Id id, Head head, Body body)
	{
		return new HTML(new GlobalAttribute[] { id }, head, body);
	}

	public static Article article(Id id)
	{
		return new Article(new GlobalAttribute[] { id });
	}

	public static Section section(Id id)
	{
		return new Section(new GlobalAttribute[] { id });
	}

	public static Nav nav(Id id)
	{
		return new Nav(new GlobalAttribute[] { id });
	}

	public static Aside aside(Id id)
	{
		return new Aside(new GlobalAttribute[] { id });
	}

	public static H1 h1(Id id)
	{
		return new H1(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static H2 h2(Id id)
	{
		return new H2(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static H3 h3(Id id)
	{
		return new H3(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static H4 h4(Id id)
	{
		return new H4(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static H5 h5(Id id)
	{
		return new H5(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static H6 h6(Id id)
	{
		return new H6(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Header header(Id id)
	{
		return new Header(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Footer footer(Id id)
	{
		return new Footer(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Address address(Id id)
	{
		return new Address(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static P p(Id id)
	{
		return new P(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static HR hr(Id id)
	{
		return new HR(new GlobalAttribute[] { id });
	}

	public static Pre pre(Id id)
	{
		return new Pre(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static BlockQuote blockquote(Id id)
	{
		return new BlockQuote(new GlobalAttribute[] { id }, null, Stream.empty());
	}

	public static OL ol(Id id)
	{
		GlobalAttribute[] ga = new GlobalAttribute[] { id };
		Reversed reversed = (Reversed) null;
		Start start = (Start) null;
		Type type = (Type) null;
		Stream<LI> childeren = Stream.<LI> empty();
		return new OL(ga, reversed, start, type, childeren);
	}

	public static UL ul(Id id)
	{
		return new UL(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static LI li(Id id)
	{
		return new LI(new GlobalAttribute[] { id }, Stream.empty(), null);
	}

	public static LI li(String string)
	{
		return new LI(Stream.of(new Text(string)));
	}

	public static DL dl(Id id)
	{
		return new DL(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static DT dt(Id id)
	{
		return new DT(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static DD dd(Id id)
	{
		return new DD(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Figure figure(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Figure(new GlobalAttribute[] { id }, childeren, null);
	}

	public static FigCaption figcaption(Id id)
	{
		return new FigCaption(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Div div(Id id)
	{
		return new Div(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Main main(Id id)
	{
		return new Main(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static A a(Id id, Stream<Element> childeren)
	{
		return new A(new GlobalAttribute[] { id }, childeren);
	}

	public static Em em(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Em(new GlobalAttribute[] { id }, childeren);
	}

	public static Strong strong(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Strong(new GlobalAttribute[] { id }, childeren);
	}

	public static Small small(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Small(new GlobalAttribute[] { id }, childeren);
	}

	public static S s(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new S(new GlobalAttribute[] { id }, childeren);
	}

	public static Cite cite(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Cite(new GlobalAttribute[] { id }, childeren);
	}

	public static Q q(Id id)
	{
		return new Q(new GlobalAttribute[] { id }, Stream.empty(), null);
	}

	public static Dfn dfn(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Dfn(new GlobalAttribute[] { id }, childeren);
	}

	public static Abbr abbr(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Abbr(new GlobalAttribute[] { id }, childeren);
	}

	public static Data data(Id id)
	{
		return new Data(new GlobalAttribute[] { id }, Stream.empty(), null);
	}

	public static Time time(Id id, DateTime dt, Stream<? extends PhrasingContent> childeren)
	{
		return new Time(new GlobalAttribute[] { id }, childeren, dt);
	}

	public static Code code(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Code(new GlobalAttribute[] { id }, childeren);
	}

	public static Var var(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Var(new GlobalAttribute[] { id }, childeren);
	}

	public static Samp samp(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Samp(new GlobalAttribute[] { id }, childeren);
	}

	public static Kbd kbd(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Kbd(new GlobalAttribute[] { id }, childeren);
	}

	public static Sub sub(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Sub(new GlobalAttribute[] { id }, childeren);
	}

	public static Sup sup(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Sup(new GlobalAttribute[] { id }, childeren);
	}

	public static I i(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new I(new GlobalAttribute[] { id }, childeren);
	}

	public static B b(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new B(new GlobalAttribute[] { id }, childeren);
	}

	public static U u(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new U(new GlobalAttribute[] { id }, childeren);
	}

	public static Mark mark(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Mark(new GlobalAttribute[] { id }, childeren);
	}

	public static Ruby ruby(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Ruby(new GlobalAttribute[] { id }, childeren);
	}

	public static Rb rb(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Rb(new GlobalAttribute[] { id }, childeren);
	}

	public static Rt rt(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Rt(new GlobalAttribute[] { id }, childeren);
	}

	public static Rtc rtc(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Rtc(new GlobalAttribute[] { id }, childeren);
	}

	public static Rp rp(Id id, Stream<? extends PhrasingContent> childeren)
	{
		return new Rp(new GlobalAttribute[] { id }, childeren);
	}

	public static Bdi bdi(Id id)
	{
		return new Bdi(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Bdo bdo(Id id)
	{
		return new Bdo(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Span span(Id id)
	{
		return new Span(new GlobalAttribute[] { id }, Stream.empty());
	}

	public static Object object(Id id, Stream<Param> params)
	{
		return new Object(new GlobalAttribute[] { id }, null, null, null, null, null, null, null, null,
		    params);
	}

	public static Param param(Id id, Name name)
	{
		return new Param(new GlobalAttribute[] { id }, name, null);
	}

	public static Param param(Id id, Name name, Value value)
	{
		return new Param(new GlobalAttribute[] { id }, name, value);
	}

	public static Param param(Id id, Value value)
	{
		return new Param(new GlobalAttribute[] { id }, null, value);
	}

	public static Video video(Id id, Stream<Track> tracks)
	{
		return new Video(new GlobalAttribute[] { id }, null, null, null, null, null, null, null, null, null,
		    null, (Height) null,
		    tracks);
	}

	public static Audio audio(Id id, Stream<? extends FlowContent> tracks)
	{
		return new Audio(new GlobalAttribute[] { id });
	}

	public static Source source(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Source(new GlobalAttribute[] { id }, null, null, null, null, null);
	}

	public static Track track(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Track(new GlobalAttribute[] { id }, null, null);
	}

	public static Map map(Id id, Stream<? extends FlowContent> childeren)
	{
		return new Map(new GlobalAttribute[] { id }, null, childeren);
	}

	public static Area area(Clazz clazz)
	{
		return new Area(new GlobalAttribute[] { clazz });
	}

	public static HTML html(Clazz clazz, Head head, Body body)
	{
		return new HTML(new GlobalAttribute[] { clazz }, head, body);
	}

	public static Article article(Clazz clazz)
	{
		return new Article(new GlobalAttribute[] { clazz });
	}

	public static Section section(Clazz clazz)
	{
		return new Section(new GlobalAttribute[] { clazz });
	}

	public static Nav nav(Clazz clazz)
	{
		return new Nav(new GlobalAttribute[] { clazz });
	}

	public static Aside aside(Clazz clazz)
	{
		return new Aside(new GlobalAttribute[] { clazz });
	}

	public static H1 h1(Clazz clazz)
	{
		return new H1(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static H2 h2(Clazz clazz)
	{
		return new H2(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static H3 h3(Clazz clazz)
	{
		return new H3(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static H4 h4(Clazz clazz)
	{
		return new H4(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static H5 h5(Clazz clazz)
	{
		return new H5(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static H6 h6(Clazz clazz)
	{
		return new H6(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Header header(Clazz clazz)
	{
		return new Header(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Footer footer(Clazz clazz)
	{
		return new Footer(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Address address(Clazz clazz)
	{
		return new Address(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static P p(Clazz clazz)
	{
		return new P(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static HR hr(Clazz clazz)
	{
		return new HR(new GlobalAttribute[] { clazz });
	}

	public static Pre pre(Clazz clazz)
	{
		return new Pre(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static BlockQuote blockquote(Clazz clazz)
	{
		return new BlockQuote(new GlobalAttribute[] { clazz }, null, Stream.empty());
	}

	public static OL ol(Clazz clazz)
	{
		GlobalAttribute[] ga = new GlobalAttribute[] { clazz };
		Reversed reversed = (Reversed) null;
		Start start = (Start) null;
		Type type = (Type) null;
		Stream<LI> childeren = Stream.<LI> empty();
		return new OL(ga, reversed, start, type, childeren);
	}

	public static UL ul(Clazz clazz)
	{
		return new UL(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static LI li(Clazz clazz)
	{
		return new LI(new GlobalAttribute[] { clazz }, Stream.empty(), null);
	}

	public static DL dl(Clazz clazz)
	{
		return new DL(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static DT dt(Clazz clazz)
	{
		return new DT(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static DD dd(Clazz clazz)
	{
		return new DD(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Figure figure(Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Figure(new GlobalAttribute[] { clazz }, childeren, null);
	}

	public static FigCaption figcaption(Clazz clazz)
	{
		return new FigCaption(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Div div(Clazz clazz)
	{
		return new Div(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Main main(Clazz clazz)
	{
		return new Main(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static A a(Clazz clazz, Stream<Element> childeren)
	{
		return new A(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Em em(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Em(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Strong strong(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Strong(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Small small(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Small(new GlobalAttribute[] { clazz }, childeren);
	}

	public static S s(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new S(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Cite cite(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Cite(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Q q(Clazz clazz)
	{
		return new Q(new GlobalAttribute[] { clazz }, Stream.empty(), null);
	}

	public static Dfn dfn(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Dfn(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Abbr abbr(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Abbr(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Data data(Clazz clazz)
	{
		return new Data(new GlobalAttribute[] { clazz }, Stream.empty(), null);
	}

	public static Time time(Clazz clazz, DateTime dt, Stream<? extends PhrasingContent> childeren)
	{
		return new Time(new GlobalAttribute[] { clazz }, childeren, dt);
	}

	public static Code code(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Code(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Var var(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Var(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Samp samp(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Samp(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Kbd kbd(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Kbd(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Sub sub(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Sub(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Sup sup(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Sup(new GlobalAttribute[] { clazz }, childeren);
	}

	public static I i(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new I(new GlobalAttribute[] { clazz }, childeren);
	}

	public static B b(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new B(new GlobalAttribute[] { clazz }, childeren);
	}

	public static U u(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new U(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Mark mark(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Mark(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Ruby ruby(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Ruby(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Rb rb(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rb(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Rt rt(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rt(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Rtc rtc(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rtc(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Rp rp(Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rp(new GlobalAttribute[] { clazz }, childeren);
	}

	public static Bdi bdi(Clazz clazz)
	{
		return new Bdi(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Bdo bdo(Clazz clazz)
	{
		return new Bdo(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Span span(Clazz clazz)
	{
		return new Span(new GlobalAttribute[] { clazz }, Stream.empty());
	}

	public static Object object(Clazz clazz, Stream<Param> params)
	{
		return new Object(new GlobalAttribute[] { clazz }, null, null, null, null, null, null, null, null,
		    params);
	}

	public static Param param(Clazz clazz, Name name)
	{
		return new Param(new GlobalAttribute[] { clazz }, name, null);
	}

	public static Param param(Clazz clazz, Name name, Value value)
	{
		return new Param(new GlobalAttribute[] { clazz }, name, value);
	}

	public static Param param(Clazz clazz, Value value)
	{
		return new Param(new GlobalAttribute[] { clazz }, null, value);
	}

	public static Video video(Clazz clazz, Stream<Track> tracks)
	{
		return new Video(new GlobalAttribute[] { clazz }, null, null, null, null, null, null, null, null, null,
		    null, (Height) null,
		    tracks);
	}

	public static Audio audio(Clazz clazz, Stream<? extends FlowContent> tracks)
	{
		return new Audio(new GlobalAttribute[] { clazz });
	}



	public static A a(Id id, Clazz clazz)
	{
		return new A(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Em em(Id id, Clazz clazz)
	{
		return new Em(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Small small(Id id, Clazz clazz)
	{
		return new Small(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static S s(Id id, Clazz clazz)
	{
		return new S(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Cite cite(Id id, Clazz clazz)
	{
		return new Cite(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Q q(Id id, Clazz clazz)
	{
		return new Q(new GlobalAttribute[] { id, clazz }, Stream.empty(), null);
	}

	public static Dfn dfn(Id id, Clazz clazz)
	{
		return new Dfn(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Abbr abbr(Id id, Clazz clazz)
	{
		return new Abbr(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Data data(Id id, Clazz clazz)
	{
		return new Data(new GlobalAttribute[] { id, clazz }, Stream.empty(), null);
	}

	public static Time time(Id id, Clazz clazz, DateTime dt)
	{
		return new Time(new GlobalAttribute[] { id, clazz }, Stream.empty(), dt);
	}

	public static Code code(Id id, Clazz clazz)
	{
		return new Code(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}
	public static Bdi bdi(Id id, Clazz clazz)
	{
		return new Bdi(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Bdo bdo(Id id, Clazz clazz)
	{
		return new Bdo(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Span span(Id id, Clazz clazz)
	{
		return new Span(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Var var(Id id, Clazz clazz)
	{
		return new Var(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Samp samp(Id id, Clazz clazz)
	{
		return new Samp(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Kbd kbd(Id id, Clazz clazz)
	{
		return new Kbd(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Sub sub(Id id, Clazz clazz)
	{
		return new Sub(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Sup sup(Id id, Clazz clazz)
	{
		return new Sup(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static I i(Id id, Clazz clazz)
	{
		return new I(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static B b(Id id, Clazz clazz)
	{
		return new B(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static U u(Id id, Clazz clazz)
	{
		return new U(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Mark mark(Id id, Clazz clazz)
	{
		return new Mark(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Ruby ruby(Id id, Clazz clazz)
	{
		return new Ruby(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Rb rb(Id id, Clazz clazz)
	{
		return new Rb(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Rt rt(Id id, Clazz clazz)
	{
		return new Rt(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Rtc rtc(Id id, Clazz clazz)
	{
		return new Rtc(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Rp rp(Id id, Clazz clazz)
	{
		return new Rp(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}


	public static Br br(Id id, Clazz clazz)
	{
		return new Br(new GlobalAttribute[] { id, clazz });
	}

	public static WBr wbr(Id id, Clazz clazz)
	{
		return new WBr(new GlobalAttribute[] { id, clazz });
	}

	public static Img img(Id id, Clazz clazz)
	{
		return new Img(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null, null);
	}

	public static Iframe iframe(Id id, Clazz clazz)
	{
		return new Iframe(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null);
	}

	public static Embed embed(Id id, Clazz clazz)
	{
		return new Embed(new GlobalAttribute[] { id, clazz }, null, null, null, null);
	}

	public static Object object(Id id, Clazz clazz)
	{
		return new Object(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null, null, null,
		    Stream.<Param> empty());
	}

	public static Param param(Id id, Clazz clazz)
	{
		return new Param(new GlobalAttribute[] { id, clazz }, null, null);
	}

	public static Video video(Id id, Clazz clazz)
	{
		return new Video(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null, null, null, null,
		    null, (Height) null,
		    Stream.<Track> empty());
	}

	public static Audio audio(Id id, Clazz clazz)
	{
		return new Audio(new GlobalAttribute[] { id, clazz });
	}

	public static Source source(Id id, Clazz clazz)
	{
		return new Source(new GlobalAttribute[] { id, clazz }, null, null, null, null, null);
	}

	public static Track track(Id id, Clazz clazz)
	{
		return new Track(new GlobalAttribute[] { id, clazz }, null, null);
	}

	public static Map map(Id id, Clazz clazz)
	{
		return new Map(new GlobalAttribute[] { id, clazz }, null, Stream.<FlowContent> empty());
	}

	public static Area area(Id id, Clazz clazz)
	{
		return new Area(new GlobalAttribute[] { id, clazz });
	}

	public static HTML html(Id id, Clazz clazz, Head head, Body body)
	{
		return new HTML(new GlobalAttribute[] { id, clazz }, head, body);
	}

	public static Article article(Id id, Clazz clazz)
	{
		return new Article(new GlobalAttribute[] { id, clazz });
	}

	public static Section section(Id id, Clazz clazz)
	{
		return new Section(new GlobalAttribute[] { id, clazz });
	}

	public static Nav nav(Id id, Clazz clazz)
	{
		return new Nav(new GlobalAttribute[] { id, clazz });
	}

	public static Aside aside(Id id, Clazz clazz)
	{
		return new Aside(new GlobalAttribute[] { id, clazz });
	}

	public static Map map(Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Map(new GlobalAttribute[] { clazz }, null, childeren);
	}

	public static Article article(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Article(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Section section(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Section(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Nav nav(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Nav(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Aside aside(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Aside(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static H1 h1(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new H1(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static H2 h2(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new H2(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static H3 h3(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new H3(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static H4 h4(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new H4(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static H5 h5(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new H5(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static H6 h6(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new H6(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Header header(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Header(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Footer footer(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Footer(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Address address(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Address(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static P p(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new P(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Pre pre(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Pre(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static BlockQuote blockquote(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new BlockQuote(new GlobalAttribute[] { id, clazz }, null, childeren);
	}

	public static OL ol(Id id, Clazz clazz, Stream<LI> childeren)
	{
		GlobalAttribute[] ga = new GlobalAttribute[] { id, clazz };
		Reversed reversed = (Reversed) null;
		Start start = (Start) null;
		Type type = (Type) null;
		return new OL(ga, reversed, start, type, childeren);
	}

	public static UL ul(Id id, Clazz clazz, Stream<LI> childeren)
	{
		return new UL(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static LI li(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new LI(new GlobalAttribute[] { id, clazz }, childeren, null);
	}

	public static DL dl(Id id, Clazz clazz, Stream<? extends DtOrDd> childeren)
	{
		return new DL(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static DT dt(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new DT(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static DD dd(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new DD(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static FigCaption figcaption(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new FigCaption(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Div div(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Div(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Main main(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Main(new GlobalAttribute[] { id, clazz }, childeren);
	}
	public static H1 h1(Id id, Clazz clazz)
	{
		return new H1(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static H2 h2(Id id, Clazz clazz)
	{
		return new H2(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static H3 h3(Id id, Clazz clazz)
	{
		return new H3(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static H4 h4(Id id, Clazz clazz)
	{
		return new H4(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static H5 h5(Id id, Clazz clazz)
	{
		return new H5(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static H6 h6(Id id, Clazz clazz)
	{
		return new H6(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Header header(Id id, Clazz clazz)
	{
		return new Header(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Footer footer(Id id, Clazz clazz)
	{
		return new Footer(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Address address(Id id, Clazz clazz)
	{
		return new Address(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static P p(Id id, Clazz clazz)
	{
		return new P(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static HR hr(Id id, Clazz clazz)
	{
		return new HR(new GlobalAttribute[] { id, clazz });
	}

	public static Pre pre(Id id, Clazz clazz)
	{
		return new Pre(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static BlockQuote blockquote(Id id, Clazz clazz)
	{
		return new BlockQuote(new GlobalAttribute[] { id, clazz }, null, Stream.empty());
	}

	public static OL ol(Id id, Clazz clazz)
	{
		GlobalAttribute[] ga = new GlobalAttribute[] { id, clazz };
		Reversed reversed = (Reversed) null;
		Start start = (Start) null;
		Type type = (Type) null;
		Stream<LI> childeren = Stream.<LI> empty();
		return new OL(ga, reversed, start, type, childeren);
	}

	public static UL ul(Id id, Clazz clazz)
	{
		return new UL(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static LI li(Id id, Clazz clazz)
	{
		return new LI(new GlobalAttribute[] { id, clazz }, Stream.empty(), null);
	}

	public static DL dl(Id id, Clazz clazz)
	{
		return new DL(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static DT dt(Id id, Clazz clazz)
	{
		return new DT(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static DD dd(Id id, Clazz clazz)
	{
		return new DD(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Figure figure(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Figure(new GlobalAttribute[] { id, clazz }, childeren, null);
	}

	public static FigCaption figcaption(Id id, Clazz clazz)
	{
		return new FigCaption(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Div div(Id id, Clazz clazz)
	{
		return new Div(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static Main main(Id id, Clazz clazz)
	{
		return new Main(new GlobalAttribute[] { id, clazz }, Stream.empty());
	}

	public static A a(Id id, Clazz clazz, Stream<Element> childeren)
	{
		return new A(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Em em(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Em(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Strong strong(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Strong(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Small small(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Small(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static S s(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new S(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Cite cite(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Cite(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Q q(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Q(new GlobalAttribute[] { id, clazz }, childeren, null);
	}

	public static Dfn dfn(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Dfn(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Abbr abbr(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Abbr(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Data data(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Data(new GlobalAttribute[] { id, clazz }, childeren, null);
	}

	public static Time time(Id id, Clazz clazz, DateTime dt, Stream<? extends PhrasingContent> childeren)
	{
		return new Time(new GlobalAttribute[] { id, clazz }, childeren, dt);
	}

	public static Code code(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Code(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Var var(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Var(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Samp samp(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Samp(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Kbd kbd(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Kbd(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Sub sub(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Sub(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Sup sup(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Sup(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static I i(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new I(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static B b(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new B(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static U u(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new U(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Mark mark(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Mark(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Ruby ruby(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Ruby(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Rb rb(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rb(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Rt rt(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rt(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Rtc rtc(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rtc(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Rp rp(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Rp(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Bdi bdi(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Bdi(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Bdo bdo(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Bdo(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Span span(Id id, Clazz clazz, Stream<? extends PhrasingContent> childeren)
	{
		return new Span(new GlobalAttribute[] { id, clazz }, childeren);
	}

	public static Object object(Id id, Clazz clazz, Stream<Param> params)
	{
		return new Object(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null, null, null,
		    params);
	}

	public static Param param(Id id, Clazz clazz, Name name)
	{
		return new Param(new GlobalAttribute[] { id }, name, null);
	}

	public static Param param(Id id, Clazz clazz, Name name, Value value)
	{
		return new Param(new GlobalAttribute[] { id, clazz }, name, value);
	}

	public static Param param(Id id, Clazz clazz, Value value)
	{
		return new Param(new GlobalAttribute[] { id, clazz }, null, value);
	}

	public static Video video(Id id, Clazz clazz, Stream<Track> tracks)
	{
		return new Video(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null, null, null, null,
		    null, (Height) null,
		    tracks);
	}

	public static Audio audio(Id id, Clazz clazz, Stream<Track> tracks)
	{
		return new Audio(new GlobalAttribute[] { id, clazz }, tracks);
	}

	public static Map map(Id id, Clazz clazz, Stream<? extends FlowContent> childeren)
	{
		return new Map(new GlobalAttribute[] { id, clazz }, null, childeren);
	}

	public static A a(Id id, Clazz clazz, Element... childeren)
	{
		return new A(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Em em(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Em(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Strong strong(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Strong(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Small small(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Small(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static S s(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new S(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Cite cite(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Cite(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Q q(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Q(new GlobalAttribute[] { id, clazz }, Stream.of(childeren), null);
	}

	public static Dfn dfn(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Dfn(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Abbr abbr(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Abbr(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Data data(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Data(new GlobalAttribute[] { id, clazz }, Stream.of(childeren), null);
	}

	public static Time time(Id id, Clazz clazz, DateTime dt, PhrasingContent... childeren)
	{
		return new Time(new GlobalAttribute[] { id, clazz }, Stream.of(childeren), dt);
	}

	public static Code code(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Code(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Var var(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Var(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Samp samp(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Samp(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Kbd kbd(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Kbd(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Sub sub(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Sub(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Sup sup(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Sup(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static I i(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new I(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static B b(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new B(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static U u(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new U(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Mark mark(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Mark(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Ruby ruby(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Ruby(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Rb rb(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Rb(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Rt rt(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Rt(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Rtc rtc(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Rtc(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Rp rp(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Rp(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Bdi bdi(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Bdi(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Bdo bdo(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Bdo(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Span span(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Span(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Object object(Id id, Clazz clazz, Param... params)
	{
		return new Object(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null, null, null,
		    Stream.of(params));
	}

	public static Video video(Id id, Clazz clazz, Track... tracks)
	{
		return new Video(new GlobalAttribute[] { id, clazz }, null, null, null, null, null, null, null, null, null,
		    null, (Height) null,
		    Stream.of(tracks));
	}

	public static Audio audio(Id id, Clazz clazz, Track tracks)
	{
		return new Audio(new GlobalAttribute[] { id, clazz }, Stream.of(tracks));
	}

	public static Map map(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Map(new GlobalAttribute[] { id, clazz }, null, Stream.of(childeren));
	}

	public static Nav nav(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Nav(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Aside aside(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Aside(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static H1 h1(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new H1(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static H2 h2(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new H2(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static H3 h3(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new H3(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static H4 h4(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new H4(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static H5 h5(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new H5(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static H6 h6(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new H6(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Header header(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Header(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Footer footer(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Footer(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Address address(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Address(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static P p(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new P(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Pre pre(Id id, Clazz clazz, PhrasingContent... childeren)
	{
		return new Pre(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static BlockQuote blockquote(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new BlockQuote(new GlobalAttribute[] { id, clazz }, null, Stream.of(childeren));
	}

	public static OL ol(Id id, Clazz clazz, LI... childeren)
	{
		GlobalAttribute[] ga = new GlobalAttribute[] { id, clazz };
		Reversed reversed = (Reversed) null;
		Start start = (Start) null;
		Type type = (Type) null;
		return new OL(ga, reversed, start, type, Stream.of(childeren));
	}

	public static UL ul(Id id, Clazz clazz, LI... childeren)
	{
		return new UL(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static LI li(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new LI(new GlobalAttribute[] { id, clazz }, Stream.of(childeren), null);
	}

	public static DL dl(Id id, Clazz clazz, DtOrDd... childeren)
	{
		return new DL(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static DT dt(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new DT(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static DD dd(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new DD(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static FigCaption figcaption(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new FigCaption(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Div div(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Div(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Main main(Id id, Clazz clazz, FlowContent... childeren)
	{
		return new Main(new GlobalAttribute[] { id, clazz }, Stream.of(childeren));
	}

	public static Article article(FlowContent... childeren)
	{
		return new Article(Stream.of(childeren));
	}

	public static Section section(FlowContent... childeren)
	{
		return new Section(Stream.of(childeren));
	}

	public static Nav nav(FlowContent... childeren)
	{
		return new Nav(Stream.of(childeren));
	}

	public static Aside aside(FlowContent... childeren)
	{
		return new Aside(Stream.of(childeren));
	}

	public static H1 h1(PhrasingContent... childeren)
	{
		return new H1(Stream.of(childeren));
	}

	public static H2 h2(PhrasingContent... childeren)
	{
		return new H2(Stream.of(childeren));
	}

	public static H3 h3(PhrasingContent... childeren)
	{
		return new H3(Stream.of(childeren));
	}

	public static H4 h4(PhrasingContent... childeren)
	{
		return new H4(Stream.of(childeren));
	}

	public static H5 h5(PhrasingContent... childeren)
	{
		return new H5(Stream.of(childeren));
	}

	public static H6 h6(PhrasingContent... childeren)
	{
		return new H6(Stream.of(childeren));
	}

	public static Header header(FlowContent... childeren)
	{
		return new Header(Stream.of(childeren));
	}

	public static Footer footer(FlowContent... childeren)
	{
		return new Footer(Stream.of(childeren));
	}

	public static Address address(FlowContent... childeren)
	{
		return new Address(Stream.of(childeren));
	}

	public static P p(PhrasingContent... childeren)
	{
		return new P(Stream.of(childeren));
	}

	public static Pre pre(PhrasingContent... childeren)
	{
		return new Pre(Stream.of(childeren));
	}

	public static BlockQuote blockquote(FlowContent... childeren)
	{
		return new BlockQuote(Stream.of(childeren));
	}

	public static OL ol(Stream<LI> childeren)
	{
		Reversed reversed = (Reversed) null;
		Start start = (Start) null;
		Type type = (Type) null;
		return new OL(null, reversed, start, type, childeren);
	}

	public static UL ul(LI... childeren)
	{
		return new UL(Stream.of(childeren));
	}

	public static LI li(FlowContent... childeren)
	{
		return new LI(Stream.of(childeren));
	}

	public static DL dl(DtOrDd... childeren)
	{
		return new DL(Stream.of(childeren));
	}

	public static DT dt(FlowContent... childeren)
	{
		return new DT(Stream.of(childeren));
	}

	public static DD dd(FlowContent... childeren)
	{
		return new DD(Stream.of(childeren));
	}

	public static FigCaption figcaption(FlowContent... childeren)
	{
		return new FigCaption(Stream.of(childeren));
	}

	public static Div div(FlowContent... childeren)
	{
		return new Div(Stream.of(childeren));
	}

	public static Main main(FlowContent... childeren)
	{
		return new Main(Stream.of(childeren));
	}
	
	public static A a(Id id,Clazz clazz, String string){return new A(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Abbr abbr(Id id,Clazz clazz, String string){return new Abbr(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static B b(Id id,Clazz clazz, String string){return new B(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Bdi bdi(Id id,Clazz clazz, String string){return new Bdi(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Bdo bdo(Id id,Clazz clazz, String string){return new Bdo(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Cite cite(Id id,Clazz clazz, String string){return new Cite(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Code code(Id id,Clazz clazz, String string){return new Code(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Data data(Id id,Clazz clazz, String string){return new Data(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)),null);}
	public static Dfn ffn(Id id,Clazz clazz, String string){return new Dfn(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Em em(Id id,Clazz clazz, String string){return new Em(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static I i(Id id,Clazz clazz, String string){return new I(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Kbd kbd(Id id,Clazz clazz, String string){return new Kbd(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Mark mark(Id id,Clazz clazz, String string){return new Mark(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Q q(Id id,Clazz clazz, String string){return new Q(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)),null);}
	public static S s(Id id,Clazz clazz, String string){return new S(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Samp samp(Id id,Clazz clazz, String string){return new Samp(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Small small(Id id,Clazz clazz, String string){return new Small(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Span span(Id id,Clazz clazz, String string){return new Span(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Strong strong(Id id,Clazz clazz, String string){return new Strong(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Sub sub(Id id,Clazz clazz, String string){return new Sub(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Sup sup(Id id,Clazz clazz, String string){return new Sup(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static U u(Id id,Clazz clazz, String string){return new U(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Var var(Id id,Clazz clazz, String string){return new Var(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}

	public static A a(Id id, String string)
	{
		return new A(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Abbr abbr(Id id, String string)
	{
		return new Abbr(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static B b(Id id, String string)
	{
		return new B(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Bdi bdi(Id id, String string)
	{
		return new Bdi(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Bdo bdo(Id id, String string)
	{
		return new Bdo(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Cite cite(Id id, String string)
	{
		return new Cite(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Code code(Id id, String string)
	{
		return new Code(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Data data(Id id, String string)
	{
		return new Data(new GlobalAttribute[] { id }, Stream.of(new Text(string)), null);
	}

	public static Dfn ffn(Id id, String string)
	{
		return new Dfn(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Em em(Id id, String string)
	{
		return new Em(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static I i(Id id, String string)
	{
		return new I(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Kbd kbd(Id id, String string)
	{
		return new Kbd(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Mark mark(Id id, String string)
	{
		return new Mark(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Q q(Id id, String string)
	{
		return new Q(new GlobalAttribute[] { id }, Stream.of(new Text(string)), null);
	}

	public static S s(Id id, String string)
	{
		return new S(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Samp samp(Id id, String string)
	{
		return new Samp(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Small small(Id id, String string)
	{
		return new Small(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Span span(Id id, String string)
	{
		return new Span(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Strong strong(Id id, String string)
	{
		return new Strong(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Sub sub(Id id, String string)
	{
		return new Sub(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Sup sup(Id id, String string)
	{
		return new Sup(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static U u(Id id, String string)
	{
		return new U(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Var var(Id id, String string)
	{
		return new Var(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static A a(Clazz clazz, String string)
	{
		return new A(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Abbr abbr(Clazz clazz, String string)
	{
		return new Abbr(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static B b(Clazz clazz, String string)
	{
		return new B(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Bdi bdi(Clazz clazz, String string)
	{
		return new Bdi(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Bdo bdo(Clazz clazz, String string)
	{
		return new Bdo(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Cite cite(Clazz clazz, String string)
	{
		return new Cite(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Code code(Clazz clazz, String string)
	{
		return new Code(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Data data(Clazz clazz, String string)
	{
		return new Data(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)), null);
	}

	public static Dfn ffn(Clazz clazz, String string)
	{
		return new Dfn(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Em em(Clazz clazz, String string)
	{
		return new Em(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static I i(Clazz clazz, String string)
	{
		return new I(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Kbd kbd(Clazz clazz, String string)
	{
		return new Kbd(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Mark mark(Clazz clazz, String string)
	{
		return new Mark(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Q q(Clazz clazz, String string)
	{
		return new Q(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)), null);
	}

	public static S s(Clazz clazz, String string)
	{
		return new S(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Samp samp(Clazz clazz, String string)
	{
		return new Samp(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Small small(Clazz clazz, String string)
	{
		return new Small(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Span span(Clazz clazz, String string)
	{
		return new Span(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Strong strong(Clazz clazz, String string)
	{
		return new Strong(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Sub sub(Clazz clazz, String string)
	{
		return new Sub(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Sup sup(Clazz clazz, String string)
	{
		return new Sup(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static U u(Clazz clazz, String string)
	{
		return new U(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Var var(Clazz clazz, String string)
	{
		return new Var(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}
	
	public static H1 h1(Id id,Clazz clazz, String string){return new H1(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static H2 h2(Id id,Clazz clazz, String string){return new H2(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static H3 h3(Id id,Clazz clazz, String string){return new H3(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static H4 h4(Id id,Clazz clazz, String string){return new H4(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static H5 h5(Id id,Clazz clazz, String string){return new H5(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static H6 h6(Id id,Clazz clazz, String string){return new H6(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Address address(Id id,Clazz clazz, String string){return new Address(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Article article(Id id,Clazz clazz, String string){return new Article(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Aside aside(Id id,Clazz clazz, String string){return new Aside(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Body body(Id id,Clazz clazz, String string){return new Body(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Footer footer(Id id,Clazz clazz, String string){return new Footer(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Header header(Id id,Clazz clazz, String string){return new Header(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Nav nav(Id id,Clazz clazz, String string){return new Nav(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Section section(Id id,Clazz clazz, String string){return new Section(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static BlockQuote BlockQuote(Id id,Clazz clazz, String string){return new BlockQuote(new GlobalAttribute[]{ id , clazz }, null, Stream.of(new Text(string)));}
	public static Div Div(Id id,Clazz clazz, String string){return new Div(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static LI LI(Id id,Clazz clazz, String string){return new LI(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)), null);}
	public static Main Main(Id id,Clazz clazz, String string){return new Main(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static P P(Id id,Clazz clazz, String string){return new P(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}
	public static Pre Pre(Id id,Clazz clazz, String string){return new Pre(new GlobalAttribute[]{ id , clazz }, Stream.of(new Text(string)));}

	public static H1 h1(Id id, String string)
	{
		return new H1(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static H2 h2(Id id, String string)
	{
		return new H2(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static H3 h3(Id id, String string)
	{
		return new H3(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static H4 h4(Id id, String string)
	{
		return new H4(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static H5 h5(Id id, String string)
	{
		return new H5(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static H6 h6(Id id, String string)
	{
		return new H6(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Address address(Id id, String string)
	{
		return new Address(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Article article(Id id, String string)
	{
		return new Article(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Aside aside(Id id, String string)
	{
		return new Aside(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Body body(Id id, String string)
	{
		return new Body(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Footer footer(Id id, String string)
	{
		return new Footer(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Header header(Id id, String string)
	{
		return new Header(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Nav nav(Id id, String string)
	{
		return new Nav(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Section section(Id id, String string)
	{
		return new Section(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static BlockQuote BlockQuote(Id id, String string)
	{
		return new BlockQuote(new GlobalAttribute[] { id }, null, Stream.of(new Text(string)));
	}

	public static Div Div(Id id, String string)
	{
		return new Div(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static LI LI(Id id, String string)
	{
		return new LI(new GlobalAttribute[] { id }, Stream.of(new Text(string)), null);
	}

	public static Main Main(Id id, String string)
	{
		return new Main(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static P P(Id id, String string)
	{
		return new P(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static Pre Pre(Id id, String string)
	{
		return new Pre(new GlobalAttribute[] { id }, Stream.of(new Text(string)));
	}

	public static H1 h1(Clazz clazz, String string)
	{
		return new H1(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static H2 h2(Clazz clazz, String string)
	{
		return new H2(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static H3 h3(Clazz clazz, String string)
	{
		return new H3(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static H4 h4(Clazz clazz, String string)
	{
		return new H4(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static H5 h5(Clazz clazz, String string)
	{
		return new H5(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static H6 h6(Clazz clazz, String string)
	{
		return new H6(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Address address(Clazz clazz, String string)
	{
		return new Address(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Article article(Clazz clazz, String string)
	{
		return new Article(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Aside aside(Clazz clazz, String string)
	{
		return new Aside(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Body body(Clazz clazz, String string)
	{
		return new Body(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Footer footer(Clazz clazz, String string)
	{
		return new Footer(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Header header(Clazz clazz, String string)
	{
		return new Header(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Nav nav(Clazz clazz, String string)
	{
		return new Nav(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Section section(Clazz clazz, String string)
	{
		return new Section(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static BlockQuote BlockQuote(Clazz clazz, String string)
	{
		return new BlockQuote(new GlobalAttribute[] { clazz }, null, Stream.of(new Text(string)));
	}

	public static Div Div(Clazz clazz, String string)
	{
		return new Div(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static LI LI(Clazz clazz, String string)
	{
		return new LI(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)), null);
	}

	public static Main Main(Clazz clazz, String string)
	{
		return new Main(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static P P(Clazz clazz, String string)
	{
		return new P(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}

	public static Pre Pre(Clazz clazz, String string)
	{
		return new Pre(new GlobalAttribute[] { clazz }, Stream.of(new Text(string)));
	}
}
