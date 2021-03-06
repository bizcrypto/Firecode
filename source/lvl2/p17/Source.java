package source.lvl2.p17;

class Source {
    static double pow(double x, int n) {
        double e = 1;
        if(n > 0) for(int i = 1; i <= n; i++) e *= x;
        else for(int i = -1; i >= n; i--) e /= x;
        return e;
    }
   /* ********************************************************************** */ 
    static double pow2(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        return n < 0 ? 1/(x * pow2(x, -n-1)) : x * pow2(x, n-1);
    }
}
