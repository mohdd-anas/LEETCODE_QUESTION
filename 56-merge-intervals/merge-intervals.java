class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < intervals.length; i++) {
            if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < intervals[i][0]) {

                ans.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            } else {
                int end = Math.max(
                        ans.get(ans.size() - 1).get(1),
                        intervals[i][1]);
                ans.get(ans.size() - 1).set(1, end);
            }
        }
        int[][] result = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}