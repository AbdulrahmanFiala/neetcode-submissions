class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap= new HashMap<>();
        for (String str : strs){
            int[] freqArr = new int[26];
            for (int i = 0; i < str.length(); i++){
                freqArr[str.charAt(i) - 'a']++;
            }   
            String key = Arrays.toString(freqArr);
            strMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(strMap.values());
    }
}