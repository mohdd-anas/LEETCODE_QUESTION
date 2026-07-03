class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {

        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                // int j=i+1;
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum > target) {
                        l--;

                    } else if (sum < target) {
                        k++;
                    } else {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }

                }
            }
        }
        return new ArrayList<>(ans);
    }
}
