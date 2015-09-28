package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	
	Triangle Test1;
	Triangle Test2;
	Triangle Test3;
	Triangle Test4;
	
	@AfterClass
	public static void tearDownAC() throws Exception
	{
		
	}
	
	@BeforeClass
	public static void setUpBC()throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		Test1=new Triangle(4,5,6);
		Test2=new Triangle(7,8,9);
		Test3=new Triangle(8,9,10);
		Test4=new Triangle(4,5,7);
	}
	
	@After
	public void teardown() throws Exception
	{
		
	}

	@Test
	public final void Test1Perimeter() 
	{
		Test1.getPerimeter();
		assertEquals("Perimeter of a triange with sides 4, 5, 6 is 15", (double)15,
				(double)Test1.getPerimeter(),.0001);
	}
	@Test
	public final void Test2Perimeter() 
	{
		Test2.getPerimeter();
		assertEquals("Perimeter of a triange with sides 7, 8, 9 is 24", (double)24,
				(double)Test2.getPerimeter(),.0001);
	}
	@Test
	public final void Test3Perimeter() 
	{
		Test3.getPerimeter();
		assertEquals("Perimeter of a triange with sides 8, 9, 10 is 27", (double)27,
				(double)Test3.getPerimeter(),.0001);
	}
	@Test
	public final void Test4Perimeter() 
	{
		Test1.getPerimeter();
		assertEquals("Perimeter of a triange with sides 4, 5, 7 is 16", (double)16,
				(double)Test1.getPerimeter(),.0001);
	}
	
	@Test
	public final void Test1Area()
	{
		Test1.getArea();
		assertEquals("The area of a triangle with sides 7,8,9 is 27",
		(double)27,(double)Test1.getArea(),.0001);
	}
	@Test
	public final void Test2Area()
	{
		Test2.getArea();
		assertEquals("The area of a triangle with sides 4,5,6 is 10",
		(double)10,(double)Test2.getArea(),.0001);
	}
	@Test
	public final void Test3Area()
	{
		Test3.getArea();
		assertEquals("The area of a triangle with sides 8,9,10 is 34",
		(double)34,(double)Test3.getArea(),.0001);
	}
	@Test
	public final void Test4Area()
	{
		Test4.getArea();
		assertEquals("The area of a triangle with sides 4,5,7 is 10",
		(double)10,(double)Test4.getArea(),.0001);
	}
}

