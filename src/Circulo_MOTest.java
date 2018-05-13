import static org.junit.Assert.*;

import org.junit.Test;

public class Circulo_MOTest {
	Circulo_MO circulo1=new Circulo_MO(7,"Circulo 1");
	Circulo_MO circulo2=new Circulo_MO(0,"Circulo 2");
	Circulo_MO circulo3=new Circulo_MO(-3,"Circulo 3");

	@Test
	public void TestPerimetro1() {
		assertEquals(43.9824, circulo1.perimetro(),0);
	}
	
	@Test
	public void TestArea1() {
		assertEquals(153.9384, circulo1.area(),0);
	}
	@Test
	public void TestPerimetro2() {
		assertEquals(0, circulo2.perimetro(),0);
	}
	
	@Test
	public void TestArea2() {
		assertEquals(0, circulo2.area(),0);
	}

	@Test
	public void TestPerimetro3() {
		assertEquals(-18.8496, circulo3.perimetro(),0);
	}
	
	@Test
	public void TestArea3() {
		assertEquals(28.2744, circulo3.area(),0);
	}
}
