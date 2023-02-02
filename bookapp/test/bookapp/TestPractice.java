package bookapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPractice {
	
	@Test
	public void testSum() {
		int a = 10;
		int b = 20;
		
		int sum = a + b;
		
		//기대하는 값 왼쪽, 테스트값 오른 쪽
		assertEquals(30, sum);
	}
	
	@Test
	public void testNotEqual() {
		int a = 10;
		int b = 20;
		
		assertNotEquals(a, b); // 다르면 통과
		
	}
	
	@Test
	public void testSame() {
		Object a = new Object();
		Object b = a;
		
		assertSame(a, b); // 같은 참조면 통과
	}
	
	@Test
	public void testNotSame() {
		Object a = new Object();
		Object b = new Object();
		
		assertNotSame(a, b); // 다른 참조면 통과
	}
	
	@Test
	public void testBoolean() {
		boolean result = true;
		assertTrue(result); //boolean 자료 값이'true'면 통과
	}
}
