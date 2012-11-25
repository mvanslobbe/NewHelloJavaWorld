import static org.junit.Assert.*;

import org.junit.Test;

public class HelloJavaWorldTests {

	@Test
	public void getOneTest() {
		int i = HelloJavaWorld.getOne();
		assertEquals ( i, 1);
	}
	
	@Test
	public void getStringTest() {
		String hello = HelloJavaWorld.getString();
		assertEquals ( hello, "hello");
	}
	
	@Test
	public void concatStringTest() {
		String concat = HelloJavaWorld.concatString("hello","world");
		assertEquals( concat, "hello world");
	}
	
	@Test
	public void getDoubleVectorTest()
	{
		double[] vec = HelloJavaWorld.getDoubleVector();
		assertEquals ( vec.length, 3);
		for ( int i = 0 ; i < vec.length; i ++ )
			assertEquals ( vec[i], (double)i+1.0,0.0001);
	}

	@Test
	public void getDoubleMatrixTest()
	{
		double[][] mtx = HelloJavaWorld.getDoubleMatrix();
		assertEquals ( mtx.length, 3);
		for ( int i = 0 ; i < mtx.length; i ++ )
			for ( int j = 0 ; j < mtx[i].length; j ++ )
			assertEquals ( mtx[i][j], (i*3)+j+1, 0.0001 );
	}
}
