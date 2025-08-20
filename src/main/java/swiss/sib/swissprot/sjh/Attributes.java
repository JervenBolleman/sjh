package swiss.sib.swissprot.sjh;

import java.time.temporal.TemporalAccessor;
import java.util.Objects;
import java.util.stream.Stream;

import swiss.sib.swissprot.sjh.attributes.Cite;
import swiss.sib.swissprot.sjh.attributes.DateTime;
import swiss.sib.swissprot.sjh.attributes.Download;
import swiss.sib.swissprot.sjh.attributes.content.CrossOrigin;
import swiss.sib.swissprot.sjh.attributes.content.Href;
import swiss.sib.swissprot.sjh.attributes.content.HrefLang;
import swiss.sib.swissprot.sjh.attributes.content.Media;
import swiss.sib.swissprot.sjh.attributes.content.Rel;
import swiss.sib.swissprot.sjh.attributes.content.Sizes;
import swiss.sib.swissprot.sjh.attributes.content.Target;
import swiss.sib.swissprot.sjh.attributes.content.Type;
import swiss.sib.swissprot.sjh.attributes.embedded.Alt;
import swiss.sib.swissprot.sjh.attributes.embedded.Coords;
import swiss.sib.swissprot.sjh.attributes.embedded.Data;
import swiss.sib.swissprot.sjh.attributes.embedded.Form;
import swiss.sib.swissprot.sjh.attributes.embedded.Height;
import swiss.sib.swissprot.sjh.attributes.embedded.IsMap;
import swiss.sib.swissprot.sjh.attributes.embedded.Label;
import swiss.sib.swissprot.sjh.attributes.embedded.Loop;
import swiss.sib.swissprot.sjh.attributes.embedded.MediaGroup;
import swiss.sib.swissprot.sjh.attributes.embedded.Poster;
import swiss.sib.swissprot.sjh.attributes.embedded.Preload;
import swiss.sib.swissprot.sjh.attributes.embedded.SandBox;
import swiss.sib.swissprot.sjh.attributes.embedded.Shape;
import swiss.sib.swissprot.sjh.attributes.embedded.Src;
import swiss.sib.swissprot.sjh.attributes.embedded.SrcDoc;
import swiss.sib.swissprot.sjh.attributes.embedded.SrcLang;
import swiss.sib.swissprot.sjh.attributes.embedded.UseMap;
import swiss.sib.swissprot.sjh.attributes.embedded.Width;
import swiss.sib.swissprot.sjh.attributes.event.OnAbort;
import swiss.sib.swissprot.sjh.attributes.event.OnBlur;
import swiss.sib.swissprot.sjh.attributes.event.OnCanPlay;
import swiss.sib.swissprot.sjh.attributes.event.OnCanPlayThrough;
import swiss.sib.swissprot.sjh.attributes.event.OnCancel;
import swiss.sib.swissprot.sjh.attributes.event.OnClick;
import swiss.sib.swissprot.sjh.attributes.event.OnCueChange;
import swiss.sib.swissprot.sjh.attributes.event.OnDblClick;
import swiss.sib.swissprot.sjh.attributes.event.OnDurationChange;
import swiss.sib.swissprot.sjh.attributes.event.OnEmptied;
import swiss.sib.swissprot.sjh.attributes.event.OnEnded;
import swiss.sib.swissprot.sjh.attributes.event.OnError;
import swiss.sib.swissprot.sjh.attributes.event.OnFocus;
import swiss.sib.swissprot.sjh.attributes.event.OnInput;
import swiss.sib.swissprot.sjh.attributes.event.OnInvalid;
import swiss.sib.swissprot.sjh.attributes.event.OnKeyDown;
import swiss.sib.swissprot.sjh.attributes.event.OnKeyUp;
import swiss.sib.swissprot.sjh.attributes.event.OnLoad;
import swiss.sib.swissprot.sjh.attributes.event.OnLoadStart;
import swiss.sib.swissprot.sjh.attributes.event.OnLoadedData;
import swiss.sib.swissprot.sjh.attributes.event.OnLoadedMetaData;
import swiss.sib.swissprot.sjh.attributes.event.OnMouseDown;
import swiss.sib.swissprot.sjh.attributes.event.OnMouseEnter;
import swiss.sib.swissprot.sjh.attributes.event.OnMouseOver;
import swiss.sib.swissprot.sjh.attributes.event.OnMouseUp;
import swiss.sib.swissprot.sjh.attributes.event.OnMouseWheel;
import swiss.sib.swissprot.sjh.attributes.event.OnPause;
import swiss.sib.swissprot.sjh.attributes.event.OnPlay;
import swiss.sib.swissprot.sjh.attributes.event.OnPlaying;
import swiss.sib.swissprot.sjh.attributes.event.OnProgress;
import swiss.sib.swissprot.sjh.attributes.event.OnRateChange;
import swiss.sib.swissprot.sjh.attributes.event.OnReset;
import swiss.sib.swissprot.sjh.attributes.event.OnResize;
import swiss.sib.swissprot.sjh.attributes.event.OnScroll;
import swiss.sib.swissprot.sjh.attributes.event.OnSeekEnd;
import swiss.sib.swissprot.sjh.attributes.event.OnSeeking;
import swiss.sib.swissprot.sjh.attributes.event.OnSelect;
import swiss.sib.swissprot.sjh.attributes.event.OnShow;
import swiss.sib.swissprot.sjh.attributes.event.OnStalled;
import swiss.sib.swissprot.sjh.attributes.event.OnSubmit;
import swiss.sib.swissprot.sjh.attributes.event.OnSuspend;
import swiss.sib.swissprot.sjh.attributes.event.OnTimeUpdate;
import swiss.sib.swissprot.sjh.attributes.event.OnToggle;
import swiss.sib.swissprot.sjh.attributes.event.OnVolumeChange;
import swiss.sib.swissprot.sjh.attributes.event.OnWaiting;
import swiss.sib.swissprot.sjh.attributes.form.Accept;
import swiss.sib.swissprot.sjh.attributes.form.AcceptCharset;
import swiss.sib.swissprot.sjh.attributes.form.Action;
import swiss.sib.swissprot.sjh.attributes.form.AutoComplete;
import swiss.sib.swissprot.sjh.attributes.form.Challenge;
import swiss.sib.swissprot.sjh.attributes.form.Cols;
import swiss.sib.swissprot.sjh.attributes.form.DirName;
import swiss.sib.swissprot.sjh.attributes.form.EncType;
import swiss.sib.swissprot.sjh.attributes.form.For;
import swiss.sib.swissprot.sjh.attributes.form.FormAction;
import swiss.sib.swissprot.sjh.attributes.form.FormEnctype;
import swiss.sib.swissprot.sjh.attributes.form.FormMethod;
import swiss.sib.swissprot.sjh.attributes.form.FormTarget;
import swiss.sib.swissprot.sjh.attributes.form.High;
import swiss.sib.swissprot.sjh.attributes.form.InputMode;
import swiss.sib.swissprot.sjh.attributes.form.KeyType;
import swiss.sib.swissprot.sjh.attributes.form.List;
import swiss.sib.swissprot.sjh.attributes.form.Low;
import swiss.sib.swissprot.sjh.attributes.form.Max;
import swiss.sib.swissprot.sjh.attributes.form.MaxLength;
import swiss.sib.swissprot.sjh.attributes.form.Menu;
import swiss.sib.swissprot.sjh.attributes.form.Method;
import swiss.sib.swissprot.sjh.attributes.form.Min;
import swiss.sib.swissprot.sjh.attributes.form.MinLength;
import swiss.sib.swissprot.sjh.attributes.form.Optimum;
import swiss.sib.swissprot.sjh.attributes.form.Pattern;
import swiss.sib.swissprot.sjh.attributes.form.PlaceHolder;
import swiss.sib.swissprot.sjh.attributes.form.Rows;
import swiss.sib.swissprot.sjh.attributes.form.Size;
import swiss.sib.swissprot.sjh.attributes.form.Step;
import swiss.sib.swissprot.sjh.attributes.form.Wrap;
import swiss.sib.swissprot.sjh.attributes.global.ATitle;
import swiss.sib.swissprot.sjh.attributes.global.AccessKey;
import swiss.sib.swissprot.sjh.attributes.global.Clazz;
import swiss.sib.swissprot.sjh.attributes.global.Dir;
import swiss.sib.swissprot.sjh.attributes.global.DirAuto;
import swiss.sib.swissprot.sjh.attributes.global.DirLTR;
import swiss.sib.swissprot.sjh.attributes.global.DirRTL;
import swiss.sib.swissprot.sjh.attributes.global.GlobalAttribute;
import swiss.sib.swissprot.sjh.attributes.global.Id;
import swiss.sib.swissprot.sjh.attributes.global.Lang;
import swiss.sib.swissprot.sjh.attributes.global.SpellCheck;
import swiss.sib.swissprot.sjh.attributes.global.Style;
import swiss.sib.swissprot.sjh.attributes.global.TabIndex;
import swiss.sib.swissprot.sjh.attributes.global.Translate;
import swiss.sib.swissprot.sjh.attributes.grouping.Kind;
import swiss.sib.swissprot.sjh.attributes.grouping.Start;
import swiss.sib.swissprot.sjh.attributes.grouping.Value;
import swiss.sib.swissprot.sjh.attributes.head.Manifest;
import swiss.sib.swissprot.sjh.attributes.meta.Charset;
import swiss.sib.swissprot.sjh.attributes.meta.Content;
import swiss.sib.swissprot.sjh.attributes.meta.HttpEquiv;
import swiss.sib.swissprot.sjh.attributes.meta.Name;
import swiss.sib.swissprot.sjh.attributes.script.Nonce;
import swiss.sib.swissprot.sjh.attributes.table.Abbr;
import swiss.sib.swissprot.sjh.attributes.table.Border;
import swiss.sib.swissprot.sjh.attributes.table.ColSpan;
import swiss.sib.swissprot.sjh.attributes.table.Headers;
import swiss.sib.swissprot.sjh.attributes.table.RowSpan;
import swiss.sib.swissprot.sjh.attributes.table.Scope;
import swiss.sib.swissprot.sjh.attributes.table.Sortable;
import swiss.sib.swissprot.sjh.attributes.table.Sorted;
import swiss.sib.swissprot.sjh.attributes.table.Span;

public class Attributes {
    public static swiss.sib.swissprot.sjh.attributes.form.Type hidden = swiss.sib.swissprot.sjh.attributes.form.Type.Types.hidden
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type text = swiss.sib.swissprot.sjh.attributes.form.Type.Types.text
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type search = swiss.sib.swissprot.sjh.attributes.form.Type.Types.search
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type tel = swiss.sib.swissprot.sjh.attributes.form.Type.Types.tel
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type url = swiss.sib.swissprot.sjh.attributes.form.Type.Types.url
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type email = swiss.sib.swissprot.sjh.attributes.form.Type.Types.email
            .getType();

    public static swiss.sib.swissprot.sjh.attributes.form.Type password = swiss.sib.swissprot.sjh.attributes.form.Type.Types.password
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type date = swiss.sib.swissprot.sjh.attributes.form.Type.Types.date
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type time = swiss.sib.swissprot.sjh.attributes.form.Type.Types.time
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type number = swiss.sib.swissprot.sjh.attributes.form.Type.Types.number
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type range = swiss.sib.swissprot.sjh.attributes.form.Type.Types.range
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type color = swiss.sib.swissprot.sjh.attributes.form.Type.Types.color
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type checkbox = swiss.sib.swissprot.sjh.attributes.form.Type.Types.checkbox
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type radio = swiss.sib.swissprot.sjh.attributes.form.Type.Types.radio
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type file = swiss.sib.swissprot.sjh.attributes.form.Type.Types.file
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type submit = swiss.sib.swissprot.sjh.attributes.form.Type.Types.submit
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type image = swiss.sib.swissprot.sjh.attributes.form.Type.Types.image
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type reset = swiss.sib.swissprot.sjh.attributes.form.Type.Types.reset
            .getType();
    public static swiss.sib.swissprot.sjh.attributes.form.Type button = swiss.sib.swissprot.sjh.attributes.form.Type.Types.button
            .getType();

    public static CrossOrigin crossOrigin(String value) {
        return new CrossOrigin(value);
    }

    public static Href href(String value) {
        return new Href(value);
    }

    public static HrefLang hrefLang(String value) {
        return new HrefLang(value);
    }

    public static Media media(String value) {
        return new Media(value);
    }

    public static Rel rel(String value) {
        return new Rel(value);
    }

    public static Sizes sizes(String value) {
        return new Sizes(value);
    }

    public static Target target(String value) {
        return new Target(value);
    }

    public static Type type(String value) {
        return new Type(value);
    }

    public static Alt alt(String value) {
        return new Alt(value);
    }

    public static Coords coords(String value) {
        return new Coords(value);
    }

    public static Data data(String value) {
        return new Data(value);
    }

    public static Form form(String value) {
        return new Form(value);
    }

    public static Height height(String value) {
        return new Height(value);
    }

    public static IsMap isMap(boolean bool) {
        if (bool) {
            return IsMap.TRUE;
        } else {
            return IsMap.FALSE;
        }
    }

    public static Label label(String value) {
        return new Label(value);
    }

    public static Loop loop(boolean bool) {
        if (bool) {
            return Loop.TRUE;
        } else {
            return Loop.FALSE;
        }
    }

    public static MediaGroup mediaGroup(String value) {
        return new MediaGroup(value);
    }

    public static Poster poster(String value) {
        return new Poster(value);
    }

    public static Preload preload(String value) {
        return new Preload(value);
    }

    public static SandBox sandBox(String value) {
        return new SandBox(value);
    }

    public static Shape shape(String value) {
        return new Shape(value);
    }

    public static Src src(String value) {
        return new Src(value);
    }

    public static SrcDoc srcDoc(String value) {
        return new SrcDoc(value);
    }

    public static SrcLang srcLang(String value) {
        return new SrcLang(value);
    }

    public static UseMap useMap(String value) {
        return new UseMap(value);
    }

    public static Width width(String value) {
        return new Width(value);
    }

    public static OnAbort onAbort(String value) {
        return new OnAbort(value);
    }

    public static OnBlur onBlur(String value) {
        return new OnBlur(value);
    }

    public static OnCancel onCancel(String value) {
        return new OnCancel(value);
    }

    public static OnCanPlay onCanPlay(String value) {
        return new OnCanPlay(value);
    }

    public static OnCanPlayThrough onCanPlayThrough(String value) {
        return new OnCanPlayThrough(value);
    }

    public static OnClick onClick(String value) {
        return new OnClick(value);
    }

    public static OnCueChange onCueChange(String value) {
        return new OnCueChange(value);
    }

    public static OnDblClick onDblClick(String value) {
        return new OnDblClick(value);
    }

    public static OnDurationChange onDurationChange(String value) {
        return new OnDurationChange(value);
    }

    public static OnEmptied onEmptied(String value) {
        return new OnEmptied(value);
    }

    public static OnEnded onEnded(String value) {
        return new OnEnded(value);
    }

    public static OnError onError(String value) {
        return new OnError(value);
    }

    public static OnFocus onFocus(String value) {
        return new OnFocus(value);
    }

    public static OnInput onInput(String value) {
        return new OnInput(value);
    }

    public static OnInvalid onInvalid(String value) {
        return new OnInvalid(value);
    }

    public static OnKeyDown onKeyDown(String value) {
        return new OnKeyDown(value);
    }

    public static OnKeyUp onKeyUp(String value) {
        return new OnKeyUp(value);
    }

    public static OnLoad onLoad(String value) {
        return new OnLoad(value);
    }

    public static OnLoadedData onLoadedData(String value) {
        return new OnLoadedData(value);
    }

    public static OnLoadedMetaData onLoadedMetaData(String value) {
        return new OnLoadedMetaData(value);
    }

    public static OnLoadStart onLoadStart(String value) {
        return new OnLoadStart(value);
    }

    public static OnMouseDown onMouseDown(String value) {
        return new OnMouseDown(value);
    }

    public static OnMouseEnter onMouseEnter(String value) {
        return new OnMouseEnter(value);
    }

    public static OnMouseOver onMouseOver(String value) {
        return new OnMouseOver(value);
    }

    public static OnMouseUp onMouseUp(String value) {
        return new OnMouseUp(value);
    }

    public static OnMouseWheel onMouseWheel(String value) {
        return new OnMouseWheel(value);
    }

    public static OnPause onPause(String value) {
        return new OnPause(value);
    }

    public static OnPlay onPlay(String value) {
        return new OnPlay(value);
    }

    public static OnPlaying onPlaying(String value) {
        return new OnPlaying(value);
    }

    public static OnProgress onProgress(String value) {
        return new OnProgress(value);
    }

    public static OnRateChange onRateChange(String value) {
        return new OnRateChange(value);
    }

    public static OnReset onReset(String value) {
        return new OnReset(value);
    }

    public static OnResize onResize(String value) {
        return new OnResize(value);
    }

    public static OnScroll onScroll(String value) {
        return new OnScroll(value);
    }

    public static OnSeekEnd onSeekEnd(String value) {
        return new OnSeekEnd(value);
    }

    public static OnSeeking onSeeking(String value) {
        return new OnSeeking(value);
    }

    public static OnSelect onSelect(String value) {
        return new OnSelect(value);
    }

    public static OnShow onShow(String value) {
        return new OnShow(value);
    }

    public static OnStalled onStalled(String value) {
        return new OnStalled(value);
    }

    public static OnSubmit onSubmit(String value) {
        return new OnSubmit(value);
    }

    public static OnSuspend onSuspend(String value) {
        return new OnSuspend(value);
    }

    public static OnTimeUpdate onTimeUpdate(String value) {
        return new OnTimeUpdate(value);
    }

    public static OnToggle onToggle(String value) {
        return new OnToggle(value);
    }

    public static OnVolumeChange onVolumeChange(String value) {
        return new OnVolumeChange(value);
    }

    public static OnWaiting onWaiting(String value) {
        return new OnWaiting(value);
    }

    public static AccessKey accessKey(String value) {
        return new AccessKey(value);
    }

    public static ATitle title(String value) {
        return new ATitle(value);
    }

    public static Clazz clazz(String value) {
        return new Clazz(value);
    }

    public static Clazz clazz(String... values) {
        return new Clazz(values);
    }

    public static DirAuto dirAuto() {
        return new DirAuto();
    }

    public static DirLTR dirLTR() {
        return new DirLTR();
    }

    public static DirRTL dirRTL() {
        return new DirRTL();
    }

    public static Id id(String value) {
        return new Id(value);
    }

    public static Lang lang(String value) {
        return new Lang(value);
    }

    public static SpellCheck spellCheck(String value) {
        return new SpellCheck(value);
    }

    public static Style style(String value) {
        return new Style(value);
    }

    public static TabIndex tabIndex(String value) {
        return new TabIndex(value);
    }

    public static Translate translate(String value) {
        return new Translate(value);
    }

    public static Kind kind(String value) {
        return new Kind(value);
    }

    public static Start start(String value) {
        return new Start(value);
    }

    public static Value value(String value) {
        return new Value(value);
    }

    public static Manifest manifest(String value) {
        return new Manifest(value);
    }

    public static Charset charset(String value) {
        return new Charset(value);
    }

    public static Content content(String value) {
        return new Content(value);
    }

    public static HttpEquiv httpEquiv(String value) {
        return new HttpEquiv(value);
    }

    public static Name name(String value) {
        return new Name(value);
    }

    public static Cite cite(String value) {
        return new Cite(value);
    }

    public static DateTime dateTime(TemporalAccessor temp) {
        return new DateTime(temp);
    }

    public static Download download(String value) {
        return new Download(value);
    }

    public static Accept accept(String string) {
        return new Accept(string);
    }

    public static AcceptCharset acceptCharset(String string) {
        return new AcceptCharset(string);
    }

    public static Action action(String string) {
        return new Action(string);
    }

    public static AutoComplete autoComplete(String string) {
        return new AutoComplete(string);
    }

    public static DirName dirName(String string) {
        return new DirName(string);
    }

    public static EncType encType(String string) {
        return new EncType(string);
    }

    public static For fora(String string) {
        return new For(string);
    }

    public static FormAction formAction(String string) {
        return new FormAction(string);
    }

    public static FormEnctype formEnctype(String string) {
        return new FormEnctype(string);
    }

    public static FormMethod formMethod(String string) {
        return new FormMethod(string);
    }

    public static FormTarget formTarget(String string) {
        return new FormTarget(string);
    }

    public static InputMode inputMode(String string) {
        return new InputMode(string);
    }

    public static List list(String string) {
        return new List(string);
    }

    public static Max max(String string) {
        return new Max(string);
    }

    public static Method method(String string) {
        return new Method(string);
    }

    public static Min min(String string) {
        return new Min(string);
    }

    public static MinLength minLength(String string) {
        return new MinLength(string);
    }

    public static Pattern pattern(String string) {
        return new Pattern(string);
    }

    public static PlaceHolder placeHolder(String string) {
        return new PlaceHolder(string);
    }

    public static Size size(String string) {
        return new Size(string);
    }

    public static Step step(String string) {
        return new Step(string);
    }

    public static Menu menu(String string) {
        return new Menu(string);
    }

    public static Cols cols(String string) {
        return new Cols(string);
    }

    public static MaxLength maxLength(String string) {
        return new MaxLength(string);
    }

    public static Rows rows(String string) {
        return new Rows(string);
    }

    public static Wrap wrap(String string) {
        return new Wrap(string);
    }

    public static KeyType keytype(String string) {
        return new KeyType(string);
    }

    public static Challenge challenge(String string) {
        return new Challenge(string);
    }

    public static Low low(String string) {
        return new Low(string);
    }

    public static High high(String string) {
        return new High(string);
    }

    public static Optimum optimum(String string) {
        return new Optimum(string);
    }

    public static Nonce nonce(String string) {
        return new Nonce(string);
    }

    public static Abbr abbr(String string) {
        return new Abbr(string);
    }

    public static Border border(String string) {
        return new Border(string);
    }

    public static ColSpan colSpan(String string) {
        return new ColSpan(string);
    }

    public static Headers headers(String string) {
        return new Headers(string);
    }

    public static RowSpan rowSpan(String string) {
        return new RowSpan(string);
    }

    public static Scope scope(String string) {
        return new Scope(string);
    }

    public static Sortable sortable(String string) {
        return new Sortable(string);
    }

    public static Sorted sorted(String string) {
        return new Sorted(string);
    }

    public static Span span(String string) {
        return new Span(string);
    }

    public static Stream<GlobalAttribute> ga(Id id, ATitle title, Lang lang, Translate translate, Dir dir, Clazz clazz,
            Style style) {
        return Stream.of(id, title, lang, translate, dir, clazz, style).filter(Objects::nonNull);
    }

    public static Stream<GlobalAttribute> ga(Id id, Clazz clazz, Style style) {
        return Stream.of(id, clazz, style).filter(Objects::nonNull);
    }

    public static Stream<GlobalAttribute> ga(Id id, Clazz clazz) {
        return Stream.of(id, clazz).filter(Objects::nonNull);
    }

    public static Stream<GlobalAttribute> ga(Id id) {
        return Stream.of(id);
    }

    public static Stream<GlobalAttribute> ga(Clazz clazz) {
        return Stream.of(clazz);
    }

    public static Stream<GlobalAttribute> ga(Id id, Style style) {
        return Stream.of(id, style).filter(Objects::nonNull);
    }

    public static Stream<GlobalAttribute> ga(Clazz clazz, Style style) {
        return Stream.of(clazz, style).filter(Objects::nonNull);
    }
}
