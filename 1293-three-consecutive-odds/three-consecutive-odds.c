bool threeConsecutiveOdds(int* arr, int arrSize) {
    int si=0;
    int ei=2;
    while(ei<arrSize){
        int cnt=0;
        for(int i=si;i<=ei;i++){
            if(arr[i] % 2 == 1){
                cnt+=1;
            }
            else break;
        }
        if(cnt==3){
            return true;
        }
        si++,ei++;
    }
    return false;
}