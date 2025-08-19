package ch.isb_sib.swiss_prot.sjh;

import java.time.temporal.TemporalAccessor;
import java.util.Objects;
import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.Cite;
import ch.isb_sib.swiss_prot.sjh.attributes.DateTime;
import ch.isb_sib.swiss_prot.sjh.attributes.Download;
import ch.isb_sib.swiss_prot.sjh.attributes.content.CrossOrigin;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Href;
import ch.isb_sib.swiss_prot.sjh.attributes.content.HrefLang;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Media;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Rel;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Sizes;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Target;
import ch.isb_sib.swiss_prot.sjh.attributes.content.Type;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Alt;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Coords;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Data;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Form;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Height;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.IsMap;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Label;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Loop;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.MediaGroup;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Poster;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Preload;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.SandBox;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Shape;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Src;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.SrcDoc;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.SrcLang;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.UseMap;
import ch.isb_sib.swiss_prot.sjh.attributes.embedded.Width;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnAbort;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnBlur;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnCanPlay;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnCanPlayThrough;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnCancel;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnClick;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnCueChange;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnDblClick;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnDurationChange;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnEmptied;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnEnded;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnError;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnFocus;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnInput;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnInvalid;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnKeyDown;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnKeyUp;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnLoad;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnLoadStart;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnLoadedData;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnLoadedMetaData;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnMouseDown;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnMouseEnter;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnMouseOver;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnMouseUp;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnMouseWheel;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnPause;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnPlay;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnPlaying;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnProgress;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnRateChange;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnReset;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnResize;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnScroll;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnSeekEnd;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnSeeking;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnSelect;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnShow;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnStalled;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnSubmit;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnSuspend;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnTimeUpdate;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnToggle;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnVolumeChange;
import ch.isb_sib.swiss_prot.sjh.attributes.event.OnWaiting;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Accept;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AcceptCharset;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Action;
import ch.isb_sib.swiss_prot.sjh.attributes.form.AutoComplete;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Challenge;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Cols;
import ch.isb_sib.swiss_prot.sjh.attributes.form.DirName;
import ch.isb_sib.swiss_prot.sjh.attributes.form.EncType;
import ch.isb_sib.swiss_prot.sjh.attributes.form.For;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormAction;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormEnctype;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormMethod;
import ch.isb_sib.swiss_prot.sjh.attributes.form.FormTarget;
import ch.isb_sib.swiss_prot.sjh.attributes.form.High;
import ch.isb_sib.swiss_prot.sjh.attributes.form.InputMode;
import ch.isb_sib.swiss_prot.sjh.attributes.form.KeyType;
import ch.isb_sib.swiss_prot.sjh.attributes.form.List;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Low;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Max;
import ch.isb_sib.swiss_prot.sjh.attributes.form.MaxLength;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Menu;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Method;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Min;
import ch.isb_sib.swiss_prot.sjh.attributes.form.MinLength;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Optimum;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Pattern;
import ch.isb_sib.swiss_prot.sjh.attributes.form.PlaceHolder;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Rows;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Size;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Step;
import ch.isb_sib.swiss_prot.sjh.attributes.form.Wrap;
import ch.isb_sib.swiss_prot.sjh.attributes.global.ATitle;
import ch.isb_sib.swiss_prot.sjh.attributes.global.AccessKey;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Clazz;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Dir;
import ch.isb_sib.swiss_prot.sjh.attributes.global.DirAuto;
import ch.isb_sib.swiss_prot.sjh.attributes.global.DirLTR;
import ch.isb_sib.swiss_prot.sjh.attributes.global.DirRTL;
import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Id;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Lang;
import ch.isb_sib.swiss_prot.sjh.attributes.global.SpellCheck;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Style;
import ch.isb_sib.swiss_prot.sjh.attributes.global.TabIndex;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Translate;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Kind;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Start;
import ch.isb_sib.swiss_prot.sjh.attributes.grouping.Value;
import ch.isb_sib.swiss_prot.sjh.attributes.head.Manifest;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Charset;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Content;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.HttpEquiv;
import ch.isb_sib.swiss_prot.sjh.attributes.meta.Name;
import ch.isb_sib.swiss_prot.sjh.attributes.script.Nonce;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Abbr;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Border;
import ch.isb_sib.swiss_prot.sjh.attributes.table.ColSpan;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Headers;
import ch.isb_sib.swiss_prot.sjh.attributes.table.RowSpan;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Scope;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Sortable;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Sorted;
import ch.isb_sib.swiss_prot.sjh.attributes.table.Span;

public class Attributes {
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type hidden = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.hidden
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type text = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.text
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type search = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.search
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type tel = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.tel
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type url = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.url
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type email = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.email
            .getType();

    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type password = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.password
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type date = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.date
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type time = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.time
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type number = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.number
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type range = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.range
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type color = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.color
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type checkbox = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.checkbox
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type radio = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.radio
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type file = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.file
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type submit = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.submit
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type image = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.image
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type reset = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.reset
            .getType();
    public static ch.isb_sib.swiss_prot.sjh.attributes.form.Type button = ch.isb_sib.swiss_prot.sjh.attributes.form.Type.Types.button
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
