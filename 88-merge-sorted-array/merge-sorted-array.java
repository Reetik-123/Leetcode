class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i=m+n-1;
        int j=n-1;
        while(j!=-1){
            int temp = arr1[i];
            arr1[i]=arr2[j];
            arr2[j]=temp;
            j--;
            i--;
        }
        Arrays.sort(arr1);
    }
}