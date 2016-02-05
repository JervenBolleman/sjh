package ch.isb_sib.swiss_prot.sjh;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import ch.isb_sib.swiss_prot.sjh.elements.Element;
import ch.isb_sib.swiss_prot.sjh.elements.HTML;


public class HtmlEmptyElementsTest
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
				Element el = (Element) method.invoke(null, null);
				if (!(el instanceof HTML))
					test(el, "<" + name.toLowerCase() + "/>");
			}
		}
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
