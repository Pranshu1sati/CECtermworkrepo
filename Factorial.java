public class Factorial {
    public static void main(String[] args) {
        System.out.println(itefact(5));
        System.out.println(recfact(5));
        System.out.println(dpfact(5));
    }
    private static int itefact(int n) {
        int x=1;
        for (int i = 1; i <= n; i++) {
            x=x*i;
        }
        return x;
    }
    private static int recfact(int n) {
        if(n<=1)
            return 1;
        return n*recfact(n-1);
        
    }
    private static int dpfact(int n) {
        int []fc=new int[n+1];
        fc[0]=1;
        fc[1]=1;
    for (int i = 2; i <= n; i++) {
     fc[i]=fc[i-1]*i;
    }
        return fc[n];
    }
}
