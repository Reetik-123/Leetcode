class Solution {
public:
    int makeVec(int n) {
    vector<int> v;
    while (n > 0) {
        int i = n % 10;
        v.push_back(i);
        n = n / 10;
    }
    int sum = 0;
    for (int i = 0; i < v.size(); i++) {
        sum += v[i] * v[i];
    }
    return sum;
}

bool isHappy(int n) {
    unordered_set<int> seen;
    int sums = n;
    while (sums != 1 && seen.find(sums) == seen.end()) {
        seen.insert(sums);
        sums = makeVec(sums);
    }
    return sums == 1;
}
};