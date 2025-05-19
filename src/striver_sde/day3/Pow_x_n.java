package striver_sde.day3;

public class Pow_x_n {
    public double myPow(double x, int n) {
        double a = 1.0;
        long nn =  n;
        if (nn < 0) nn = -1 * nn;
        while(nn > 0){
            if(nn % 2 == 1){
                a = a * x;
                nn--;
            }else{
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) a = (double)(1.0) / (double)(a);
        return a;

    }
}
