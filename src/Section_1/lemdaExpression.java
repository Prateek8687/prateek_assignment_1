package Section_1;


public class lemdaExpression{

	public static void main(String[] args) {
		interfaceadd mi = (a, b) -> 
		{
			return a+b;
		};
		double p= mi.add(10, 20);
		System.out.println("sum: "+p);
		
	}

}
