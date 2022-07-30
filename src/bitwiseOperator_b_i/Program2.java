package bitwiseOperator_b_i;

public class Program2 {
	static int setBitNumber(int n)
    {
        if (n == 0)
            return 0;
 
        int msb = 0;
        n = n / 2;
 
        while (n != 0) {
            n = n / 2;
            msb++;
        }
 
        return (1 << msb);
    }
	public static void main(String[] args) {
		int n = 0;
        System.out.println(setBitNumber(n));
	}

}
