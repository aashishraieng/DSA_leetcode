class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }

        for (int i = 1; i <= len; i++) {
            if (!map.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
}