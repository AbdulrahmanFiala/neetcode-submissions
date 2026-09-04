class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int num: nums){
            if(uniqueSet.contains(num)){
                return true;
            }
            uniqueSet.add(num);
        }
        return false;

    }
}