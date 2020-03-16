class Solution {
    public String compressString(String S) {
        var builder = new StringBuilder();

        var res = builder.toString();
        return res.length() > S.length() ? S : res;
    }
}