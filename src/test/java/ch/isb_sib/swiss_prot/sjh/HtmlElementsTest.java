package ch.isb_sib.swiss_prot.sjh;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.stream.Stream;

import org.junit.Test;

import ch.isb_sib.swiss_prot.sjh.attributes.global.Clazz;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Id;
import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.HTML;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;
import ch.isb_sib.swiss_prot.sjh.elements.grouping.LI;

public class HtmlElementsTest {
    @Test
    public void basic()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Method[] methods = Elements.class.getDeclaredMethods();
	for (Method method : methods) {

	    if (method.getParameterCount() == 0) {
		String name = method.getReturnType().getSimpleName();
		Element el = (Element) method.invoke(null, (Object[]) null);
		if (!(el instanceof HTML))
		    test(el, "<" + name.toLowerCase() + "/>");
	    }
	}
    }

    @Test
    public void id() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Method[] methods = Elements.class.getDeclaredMethods();
	int count = 0;
	for (Method method : methods) {

	    if (method.getParameterCount() == 1) {
		String name = method.getReturnType().getSimpleName();
		Class<?>[] pt = method.getParameterTypes();
		if (pt[0].equals(Id.class)) {
		    Element el = (Element) method.invoke(null, new Id("test"));
		    if (!(el instanceof HTML))
			test(el, "<" + name.toLowerCase() + " id=\"test\"/>");
		    count++;
		}
	    }
	}
	assertTrue("Make sure we test ", count > 10);
    }

    @Test
    public void clazz()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Method[] methods = Elements.class.getDeclaredMethods();
	int count = 0;
	for (Method method : methods) {

	    if (method.getParameterCount() == 1) {
		String name = method.getReturnType().getSimpleName();
		Class<?>[] pt = method.getParameterTypes();
		if (pt[0].equals(Clazz.class)) {
		    Element el = (Element) method.invoke(null, new Clazz("test"));
		    if (!(el instanceof HTML))
			test(el, "<" + name.toLowerCase() + " class=\"test\"/>");
		    count++;
		}
	    }
	}
	assertTrue("Make sure we test ", count > 10);
    }

    @Test
    public void idAndClazz()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Method[] methods = Elements.class.getDeclaredMethods();
	int count = 0;
	for (Method method : methods) {

	    if (method.getParameterCount() == 2) {
		String name = method.getReturnType().getSimpleName();
		Class<?>[] pt = method.getParameterTypes();
		if (pt[0].equals(Id.class) && pt[1].equals(Clazz.class)) {
		    try {
		    Element el = (Element) method.invoke(null, new Id("test"), new Clazz("test"));
		    if (!(el instanceof HTML))
			test(el, "<" + name.toLowerCase() + " id=\"test\" class=\"test\"/>");
		    } catch (Exception e) {
			fail(method.getName() + ' ' + e.getMessage());
		    }
		    count++;
		}
	    }
	}
	assertTrue("Make sure we test ", count > 10);
    }

    @Test
    public void idAndClazzAndChildStream()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Method[] methods = Elements.class.getDeclaredMethods();
	int countFlow = 0, countPhrase = 0, countLI = 0;
	for (Method method : methods) {

	    if (method.getParameterCount() == 3 && !method.isVarArgs()) {
		String name = method.getReturnType().getSimpleName();
		Class<?>[] pts = method.getParameterTypes();
		if (pts[0].equals(Id.class) && pts[1].equals(Clazz.class) && pts[2].equals(Stream.class)) {
		    Type type = method.getGenericParameterTypes()[2];
		    assertTrue(type instanceof ParameterizedType);
		    ParameterizedType pt = (ParameterizedType) type;
		    Type[] ata = pt.getActualTypeArguments();
		    assertEquals(1, ata.length);
		    if (ata[0] instanceof WildcardType) {
			Type upperBound = ((WildcardType) ata[0]).getUpperBounds()[0];
			if (upperBound.equals(FlowContent.class)) {
			    Element el = (Element) method.invoke(null, new Id("test"), new Clazz("test"),
				    Stream.of(Elements.div()));
			    if (!(el instanceof HTML))
				test(el, "<" + name.toLowerCase() + " id=\"test\" class=\"test\"><div/></"
					+ name.toLowerCase() + ">");
			    countFlow++;
			}

			else if (upperBound.equals(PhrasingContent.class)) {
			    Element el = (Element) method.invoke(null, new Id("test"), new Clazz("test"),
				    Stream.of(Elements.span()));
			    if (!(el instanceof HTML))
				test(el, "<" + name.toLowerCase() + " id=\"test\" class=\"test\"><span/></"
					+ name.toLowerCase() + ">");
			    countPhrase++;
			}
		    } else if (ata[0].equals(LI.class)) {
			Element el = (Element) method.invoke(null, new Id("test"), new Clazz("test"),
				Stream.of(Elements.li()));
			if (!(el instanceof HTML))
			    test(el, "<" + name.toLowerCase() + " id=\"test\" class=\"test\"><li/></"
				    + name.toLowerCase() + ">");
			countLI++;
		    }

		}
	    }
	}
	assertTrue("Make sure we test ", countFlow > 10);
	assertTrue("Make sure we test ", countPhrase > 10);
	assertEquals("Make sure we test ", countLI, 2);
    }

    @Test
    public void idAndClazzAndChildVarArg()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Method[] methods = Elements.class.getDeclaredMethods();
	int countFlow = 0, countPhrase = 0, countLI = 0;
	for (Method method : methods) {

	    if (method.getParameterCount() == 3 && method.isVarArgs()) {
		String name = method.getReturnType().getSimpleName();
		Class<?>[] pts = method.getParameterTypes();

		if (pts[0].equals(Id.class) && pts[1].equals(Clazz.class)) {
		    Class<?> array = pts[2];
		    assertTrue(array.isArray());
		    try {
			if (array.getComponentType().equals(FlowContent.class)) {
			    Element el = (Element) method.invoke(null, new Id("test"), new Clazz("test"),
				    new FlowContent[] { Elements.div() });
			    test(el, "<" + name.toLowerCase() + " id=\"test\" class=\"test\"><div/></"
				    + name.toLowerCase() + ">");
			    countFlow++;
			} else if (array.getComponentType().equals(PhrasingContent.class)) {
			    Element el = (Element) method.invoke(null, new Id("test"), new Clazz("test"),
				    new PhrasingContent[] { Elements.span() });
			    test(el, "<" + name.toLowerCase() + " id=\"test\" class=\"test\"><span/></"
				    + name.toLowerCase() + ">");
			    countPhrase++;

			} else if (array.getComponentType().equals(LI.class)) {
			    Element el = (Element) method.invoke(null, new Id("test"), new Clazz("test"),
				    new LI[] { Elements.li() });
			    if (!(el instanceof HTML))
				test(el, "<" + name.toLowerCase() + " id=\"test\" class=\"test\"><li/></"
					+ name.toLowerCase() + ">");
			    countLI++;
			}
		    } catch (IllegalArgumentException e) {
			fail(method.toString());
		    }
		}
	    }
	}

	assertTrue("Make sure we test ", countFlow > 10);
	assertTrue("Make sure we test ", countPhrase > 10);
	assertEquals("Make sure we test ", countLI, 2);
    }

    private void test(Element el, String expectedRaw) throws IOException {
	ByteArrayOutputStream boas = new ByteArrayOutputStream();
	el.render(boas);
	assertEquals(expectedRaw, new String(boas.toByteArray(), UTF_8));
    }
}
