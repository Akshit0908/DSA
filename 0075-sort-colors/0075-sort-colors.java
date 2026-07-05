class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int one=0;
        int two=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero+=1;
            else if(arr[i]==1) one+=1;
            else two+=1;
        }
        int index=0;
        for(int i=0;i<zero;i++){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<one;i++){
            arr[index]=1;
            index++;
        }
        for(int i=0;i<two;i++){
            arr[index]=2;
            index++;
        }
    }
}