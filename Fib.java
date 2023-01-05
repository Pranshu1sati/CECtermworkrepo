public class Fib {
    public static void main(String[] args) {
        int n =5;
       System.out.println( itefib(5));
        System.out.println(recfib(6));
        System.out.println(dpfib(9));
    }
    private static int itefib(int n) {
        int x =0,y=1,z=0;
        for (int i = 0; i < n; i++) {
            // System.out.println(x);
            z=x+y;
            y=x;
            x=z;
        }
        return x;
    }
    private static int recfib(int n){
        if (n <= 1)
            return n;
        return recfib(n - 1) + recfib(n - 2);
    }
   
static int dpfib(int n)
	{
	
	int f[] = new int[n+2]; 
	int i;
	
	
	f[0] = 0;
	f[1] = 1;
	
	for (i = 2; i <= n; i++)
	{
	
		f[i] = f[i-1] + f[i-2];
	}
	
	return f[n];
	}
	
	
};

