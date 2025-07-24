// Last updated: 7/24/2025, 9:45:46 PM
// Frequency mapping in Java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap <String, List<String>> map = new HashMap<>();

        for ( String word : strs){

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            if( !map.containsKey(sortedKey) ){
                map.put(sortedKey, new ArrayList<>());
            }

            map.get(sortedKey).add(word);
        }

        return new ArrayList<>(map.values());

    }
}