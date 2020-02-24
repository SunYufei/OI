//给定一个未排序的整数数组，找出最长连续序列的长度。 
//
// 要求算法的时间复杂度为 O(n)。 
//
// 示例: 
//
// 输入: [100, 4, 200, 1, 3, 2]
//输出: 4
//解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。 
// Related Topics 并查集 数组


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if (nums.size() <= 0)
            return 0;
        sort(nums.begin(), nums.end());
        nums.erase(unique(nums.begin(), nums.end()), nums.end());
        size_t len = nums.size();
        vector<int> dp(len, 1);
        for (size_t i = 1; i < len; i++)
            if (nums[i] - nums[i - 1] == 1)
                dp[i] = dp[i - 1] + 1;
        return *max_element(dp.begin(), dp.end());
    }
};
//leetcode submit region end(Prohibit modification and deletion)
