package swiss.sib.swissprot.sjh.elements.contenttype;

import swiss.sib.swissprot.sjh.elements.Element;
import swiss.sib.swissprot.sjh.elements.Text;
import swiss.sib.swissprot.sjh.elements.embedded.Area;
import swiss.sib.swissprot.sjh.elements.embedded.Audio;
import swiss.sib.swissprot.sjh.elements.embedded.Embed;
import swiss.sib.swissprot.sjh.elements.embedded.Iframe;
import swiss.sib.swissprot.sjh.elements.embedded.Img;
import swiss.sib.swissprot.sjh.elements.embedded.Map;
import swiss.sib.swissprot.sjh.elements.embedded.Object;
import swiss.sib.swissprot.sjh.elements.embedded.Video;
import swiss.sib.swissprot.sjh.elements.flow.Dialog;
import swiss.sib.swissprot.sjh.elements.form.Button;
import swiss.sib.swissprot.sjh.elements.form.DataList;
import swiss.sib.swissprot.sjh.elements.form.FieldSet;
import swiss.sib.swissprot.sjh.elements.form.Form;
import swiss.sib.swissprot.sjh.elements.form.Input;
import swiss.sib.swissprot.sjh.elements.form.KeyGen;
import swiss.sib.swissprot.sjh.elements.form.Label;
import swiss.sib.swissprot.sjh.elements.form.Meter;
import swiss.sib.swissprot.sjh.elements.form.Output;
import swiss.sib.swissprot.sjh.elements.form.Progress;
import swiss.sib.swissprot.sjh.elements.form.Select;
import swiss.sib.swissprot.sjh.elements.form.TextArea;
import swiss.sib.swissprot.sjh.elements.grouping.BlockQuote;
import swiss.sib.swissprot.sjh.elements.grouping.DL;
import swiss.sib.swissprot.sjh.elements.grouping.Div;
import swiss.sib.swissprot.sjh.elements.grouping.Figure;
import swiss.sib.swissprot.sjh.elements.grouping.HR;
import swiss.sib.swissprot.sjh.elements.grouping.Main;
import swiss.sib.swissprot.sjh.elements.grouping.OL;
import swiss.sib.swissprot.sjh.elements.grouping.P;
import swiss.sib.swissprot.sjh.elements.grouping.Pre;
import swiss.sib.swissprot.sjh.elements.grouping.UL;
import swiss.sib.swissprot.sjh.elements.interactive.Details;
import swiss.sib.swissprot.sjh.elements.interactive.Menu;
import swiss.sib.swissprot.sjh.elements.interactive.MenuItem;
import swiss.sib.swissprot.sjh.elements.script.Canvas;
import swiss.sib.swissprot.sjh.elements.script.NoScript;
import swiss.sib.swissprot.sjh.elements.script.Script;
import swiss.sib.swissprot.sjh.elements.script.Template;
import swiss.sib.swissprot.sjh.elements.sections.Address;
import swiss.sib.swissprot.sjh.elements.sections.Article;
import swiss.sib.swissprot.sjh.elements.sections.Aside;
import swiss.sib.swissprot.sjh.elements.sections.Footer;
import swiss.sib.swissprot.sjh.elements.sections.Header;
import swiss.sib.swissprot.sjh.elements.sections.Nav;
import swiss.sib.swissprot.sjh.elements.sections.Section;
import swiss.sib.swissprot.sjh.elements.sections.header.H1;
import swiss.sib.swissprot.sjh.elements.sections.header.H2;
import swiss.sib.swissprot.sjh.elements.sections.header.H3;
import swiss.sib.swissprot.sjh.elements.sections.header.H4;
import swiss.sib.swissprot.sjh.elements.sections.header.H5;
import swiss.sib.swissprot.sjh.elements.sections.header.H6;
import swiss.sib.swissprot.sjh.elements.sections.header.HGroup;
import swiss.sib.swissprot.sjh.elements.table.Table;
import swiss.sib.swissprot.sjh.elements.text.A;
import swiss.sib.swissprot.sjh.elements.text.Abbr;
import swiss.sib.swissprot.sjh.elements.text.B;
import swiss.sib.swissprot.sjh.elements.text.Bdi;
import swiss.sib.swissprot.sjh.elements.text.Bdo;
import swiss.sib.swissprot.sjh.elements.text.Br;
import swiss.sib.swissprot.sjh.elements.text.Cite;
import swiss.sib.swissprot.sjh.elements.text.Code;
import swiss.sib.swissprot.sjh.elements.text.Data;
import swiss.sib.swissprot.sjh.elements.text.Dfn;
import swiss.sib.swissprot.sjh.elements.text.Em;
import swiss.sib.swissprot.sjh.elements.text.I;
import swiss.sib.swissprot.sjh.elements.text.Kbd;
import swiss.sib.swissprot.sjh.elements.text.Mark;
import swiss.sib.swissprot.sjh.elements.text.Q;
import swiss.sib.swissprot.sjh.elements.text.S;
import swiss.sib.swissprot.sjh.elements.text.Samp;
import swiss.sib.swissprot.sjh.elements.text.Small;
import swiss.sib.swissprot.sjh.elements.text.Span;
import swiss.sib.swissprot.sjh.elements.text.Strong;
import swiss.sib.swissprot.sjh.elements.text.Sub;
import swiss.sib.swissprot.sjh.elements.text.Sup;
import swiss.sib.swissprot.sjh.elements.text.Time;
import swiss.sib.swissprot.sjh.elements.text.U;
import swiss.sib.swissprot.sjh.elements.text.Var;
import swiss.sib.swissprot.sjh.elements.text.WBr;
import swiss.sib.swissprot.sjh.elements.text.ruby.Rb;
import swiss.sib.swissprot.sjh.elements.text.ruby.Rp;
import swiss.sib.swissprot.sjh.elements.text.ruby.Rt;
import swiss.sib.swissprot.sjh.elements.text.ruby.Rtc;
import swiss.sib.swissprot.sjh.elements.text.ruby.Ruby;

@SuppressWarnings("deprecation")
public sealed interface FlowContent extends Element
        permits A, Abbr, Address, Area, Article, Aside, Audio, B, Bdi, Bdo, BlockQuote, Br, Button, Canvas, Cite, Code,
        Data, DataList, Details, Dfn, Dialog, Div, DL, Em, Embed, FieldSet, Figure, Footer, Form, H1, H2, H3, H4, H5,
        H6, Header, HGroup, HR, I, Iframe, Img, Input, Kbd, KeyGen, Label, Main, Map, Mark, Menu, MenuItem, Meter, Nav,
        NoScript, Object, OL, Output, P, Pre, Progress, Q, Rb, Rp, Rt, Rtc, Ruby, S, Samp, Script, Section, Select,
        Small, Span, Strong, Sub, Sup, Table, Template, Text, TextArea, Time, U, UL, Var, Video, WBr {

}
