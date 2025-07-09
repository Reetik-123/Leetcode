class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int low = 0;
        int high = numbers.size() - 1;
        
        while (low < high) {
            
            if (numbers[low] + numbers[high] == target) {
                return {low + 1, high + 1}; // 1-based indexing
            } else if (numbers[low] + numbers[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        
        return {0}; // Or throw exception if no solution is guaranteed
    }
};