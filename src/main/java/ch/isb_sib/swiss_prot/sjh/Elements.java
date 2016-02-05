package ch.isb_sib.swiss_prot.sjh;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
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
		return new Audio();
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
}
