class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start=0,end=n-1;
        
        while(start<=end){
            int m = start + (end-start) / 2;
            int missing=arr[m]-(m+1);
            if(missing<k){
                start = m+1;
            }
            else{
                end = m-1;
            }
        }
        return start+k;
        }
}