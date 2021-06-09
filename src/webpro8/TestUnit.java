package webpro8;
import static org.junit.Assert.*;

import org.junit.Test;
public class TestUnit 
{

	@Test
	void testAdd()
	{
		assertEquals(30, Cal.add(10, 20));
	}
}
