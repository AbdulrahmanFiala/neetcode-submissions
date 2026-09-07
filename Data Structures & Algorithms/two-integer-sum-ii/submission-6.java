class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            indices.put(numbers[i], i);
        }

        for(int i = 0; i < numbers.length; i++){
            int diff = target - numbers[i];
            if(indices.containsKey(diff) && indices.get(diff) != i){
                return new int[]{i+1, indices.get(diff)+1};
            }
        }
        return new int[0];
    }
}
