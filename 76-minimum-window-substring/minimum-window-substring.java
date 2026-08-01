class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int c = 0; c < t.length(); c++) {
            map.put(t.charAt(c), map.getOrDefault(t.charAt(c), 0) + 1);
        }
        int i = 0;
        int minLen = Integer.MAX_VALUE;
        int len = -1;
        int startIndex = -1;
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            char right = s.charAt(j);
            if (map.containsKey(right)) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) - 1);
                if (map.get(right) >= 0) {
                    count++;
                }

            }
            while (count == t.length()) {
                len = j - i + 1;
                if (len < minLen) {
                    minLen = len;
                    startIndex = i;
                }
                char left = s.charAt(i);
                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);
                    if (map.get(left) > 0) {
                        count--;
                    }
                }
                i++;

            }

        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(startIndex, minLen + startIndex);
    }
}