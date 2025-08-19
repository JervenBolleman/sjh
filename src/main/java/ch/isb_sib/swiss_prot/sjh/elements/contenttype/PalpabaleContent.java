package ch.isb_sib.swiss_prot.sjh.elements.contenttype;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Audio;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Embed;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Iframe;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Img;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Map;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Video;
import ch.isb_sib.swiss_prot.sjh.elements.embedded.Object;
import ch.isb_sib.swiss_prot.sjh.elements.form.Button;
import ch.isb_sib.swiss_prot.sjh.elements.form.FieldSet;
import ch.isb_sib.swiss_prot.sjh.elements.form.Input;
import ch.isb_sib.swiss_prot.sjh.elements.form.KeyGen;
import ch.isb_sib.swiss_prot.sjh.elements.form.Label;
import ch.isb_sib.swiss_prot.sjh.elements.form.Meter;
import ch.isb_sib.swiss_prot.sjh.elements.form.Output;
import ch.isb_sib.swiss_prot.sjh.elements.form.Progress;
import ch.isb_sib.swiss_prot.sjh.elements.form.Select;
import ch.isb_sib.swiss_prot.sjh.elements.form.TextArea;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.DL;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Div;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Figure;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Main;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.OL;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.P;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.Pre;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.UL;
import ch.isb_sib.swiss_prot.sjh.elements.interactive.Details;
import ch.isb_sib.swiss_prot.sjh.elements.script.Canvas;
import ch.isb_sib.swiss_prot.sjh.elements.script.Template;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Address;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Article;
import ch.isb_sib.swiss_prot.sjh.elements.sections.Aside;
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
import ch.isb_sib.swiss_prot.sjh.elements.sections.header.HGroup;
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

@SuppressWarnings("deprecation")
public sealed interface PalpabaleContent extends Element permits A, Abbr, Address, Article, Aside, Audio, B, Bdi, Bdo,
        Br, Button, Canvas, Cite, Code, Data, Details, Dfn, Div, DL, Em, Embed, FieldSet, Figure, Footer, H1, H2, H3,
        H4, H5, H6, Header, HGroup, I, Iframe, Img, Input, Kbd, KeyGen, Label, Main, Map, Mark, Meter, Nav, Object, OL,
        Output, P, Pre, Progress, Q, Rp, Rb, Rt, Rtc, Ruby, S, Samp, Section, Select, Small, Span, Strong, Sub, Sup,
        Table, Template, TextArea, Time, U, UL, Var, Video, WBr {

}
