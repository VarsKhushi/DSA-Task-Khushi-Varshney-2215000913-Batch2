class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res =new int[n];
        if(k==0){
            return res;
        }
        else if(k>0){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=1;j<=k;j++){
                    int x=(i+j)%n;
                    sum+=code[x];
                }
                res[i]=sum;
            }return res;
        }
        else {
            k=-1*k;
            for(int i=0;i<code.length;i++){
                int sum=0;
                for(int j=1;j<=k;j++){
                    int x=(i-j);
                    if(x<0){
                        x=n+x;}
                    sum+=code[x];
                }
                res[i]=sum;
            }return res;
        }
    }
}