
public class HelloJavaWorld {
	public static int getOne() 
	{
		return 1;
	}
	
	public static String getString()
	{
		return "hello";
	}
	
	public static String concatString ( String a, String b)
	{
		return a+" "+b;
	}
	
	public static double[] getDoubleVector()
	{
		double[] vec = {1.0,2.0,3.0};
		return vec; 
	}
	
	public static double[][] getDoubleMatrix()
	{
		double[][] mtx = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
		return mtx; 
	}
}
