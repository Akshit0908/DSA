class Solution {
public:
    double myPow(double x, int n) {
            long long N=n;
            if(N==0) return 1;
            if(N<0){
                N=-N;
                x=1/x;
            }
            if(N%2==0){
                return myPow(x*x,N/2);
            }
            else{
                return x*myPow(x*x,N/2);
            }
        }
};