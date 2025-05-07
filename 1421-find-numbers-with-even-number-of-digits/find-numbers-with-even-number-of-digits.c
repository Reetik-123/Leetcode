int findNumbers(int* nums, int numsSize) {
    int count=0;
    for(int i=0;i<numsSize;i++){
        int cnt=0;
        int num=nums[i];
        if(num==0){
            cnt=1;
        }
        else{
            while(num>0){
                num/=10;
                cnt++;
                }
            }
        if (cnt%2==0){
            count+=1;
        }
        else{
            continue;
        }
    }
    return count;
}