package bitwiseOperator_b_i;

public class Program1 {

	public static void main(String[] args) {
		for(int a = 0; a <= 15; a++) {
			System.out.println(Integer.toBinaryString(a) + " : " + lsb(a));
		}
	}
	public static int lsb(int n) {
		return (n & 1);
	}
}
