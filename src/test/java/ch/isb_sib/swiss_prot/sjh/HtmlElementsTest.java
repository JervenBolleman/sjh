package ch.isb_sib.swiss_prot.sjh;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import ch.isb_sib.swiss_prot.sjh.attributes.global.Clazz;
import ch.isb_sib.swiss_prot.sjh.attributes.global.Id;
import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.HTML;


public class HtmlElementsTest
{
	@Test
	public void basic()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Method[] methods = Elements.class.getDeclaredMethods();
		for (Method method : methods)
		{

			if (method.getParameterCount() == 0)
			{
				String name = method.getReturnType().getSimpleName();
				Element el = (Element) method.invoke(null, (Object[]) null);
				if (!(el instanceof HTML))
					test(el, "<" + name.toLowerCase() + "/>");
			}
		}
	}

	@Test
	public void id()
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Method[] methods = Elements.class.getDeclaredMethods();
		int count = 0;
		for (Method method : methods)
		{

			if (method.getParameterCount() == 1)
			{
				String name = method.getReturnType().getSimpleName();
				Class<?>[] pt = method.getParameterTypes();
				if (pt[0].equals(Id.class))
				{
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
	    throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Method[] methods = Elements.class.getDeclaredMethods();
		int count = 0;
		for (Method method : methods)
		{

			if (method.getParameterCount() == 1)
			{
				String name = method.getReturnType().getSimpleName();
				Class<?>[] pt = method.getParameterTypes();
				if (pt[0].equals(Clazz.class))
				{
					Element el = (Element) method.invoke(null, new Clazz("test"));
					if (!(el instanceof HTML))
						test(el, "<" + name.toLowerCase() + " class=\"test\"/>");
					count++;
				}
			}
		}
		assertTrue("Make sure we test ", count > 10);
	}

	private void test(Element el, String expectedRaw)
	    throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		el.render(boas);
		assertEquals(expectedRaw,
		    new String(boas.toByteArray(), UTF_8));
	}
}
