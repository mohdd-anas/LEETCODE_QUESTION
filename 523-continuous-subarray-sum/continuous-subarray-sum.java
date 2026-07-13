class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int i = 0;
        while (i < nums.length) {
            prefix = prefix + nums[i];
            int remain = prefix % k;
            if (map.containsKey(remain)) {

                if (i - map.get(remain) >= 2) {
                    return true;
                }
            } else {
                map.put(remain, i);
            }

            i++;
        }
        return false;
    }
}