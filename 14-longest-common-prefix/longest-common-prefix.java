class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) minLen = Math.min(minLen, s.length());
        if (minLen == 0) return "";

        int lo = 0, hi = minLen;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isCommonPrefix(strs, mid)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;   
            }
        }
        return strs[0].substring(0, hi);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < len; j++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) return false;
            }
        }
        return true;
    }
}
