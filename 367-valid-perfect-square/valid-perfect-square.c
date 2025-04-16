#include <stdbool.h>

bool isPerfectSquare(int num) {
    if (num < 0) return false;  // Negative numbers can't be perfect squares

    int low = 0;
    int high = num;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        
        // Use long long to safely compute mid * mid
        long long midSquared = (long long)mid * mid;
        
        if (midSquared == num) {
            return true;
        }
        else if (midSquared > num) {
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }

    return false;
}
