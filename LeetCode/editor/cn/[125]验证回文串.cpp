//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
public:
    bool isPalindrome(string s) {
        size_t len = s.length();
        if (len == 0 || len == 1)
            return true;
        size_t i;
        for (i = 0; i < len; i++) {
            char ch = s[i];
            if (ch >= 'A' && ch <= 'Z')
                s[i] = 'a' + ch - 'A';
        }
        size_t left = 0, right = len - 1;
        while (left < right) {
            char l = s[left++];
            char r = s[right--];
            while (!((l >= 'a' && l <= 'z') || (l >= '0' && l <= '9')) &&
                   left < len)
                l = s[left++];
            while (!((r >= 'a' && r <= 'z') || (r >= '0' && r <= '9')) &&
                   right > 0)
                r = s[right--];
            if (((l >= 'a' && l <= 'z') || (l >= '0' && l <= '9')) &&
                ((r >= 'a' && r <= 'z') || (r >= '0' && r <= '9')) && r != l)
                return false;
        }
        return true;
    }
};
//leetcode submit region end(Prohibit modification and deletion)
