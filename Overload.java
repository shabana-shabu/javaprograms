class A
{
	int add(int a,int b)
	{
		System.out.println("Int val ");
		return a+b;
	}
	long add(long a,long b)
	{
		System.out.println("Long val ");
		return a+b;
	}
	double add(double a,double b)
	{
		System.out.println("double val ");
		return a+b;
	}
}
public class Overload {
	public static void main(String[] args) {
		A ob = new A();
		System.out.println(ob.add(2, 3));
		System.out.println(ob.add(887654445677l,88));
		System.out.println(ob.add(8.9,8));
	}
}