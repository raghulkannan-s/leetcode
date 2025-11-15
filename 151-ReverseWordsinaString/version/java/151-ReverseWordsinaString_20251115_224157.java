// Last updated: 11/15/2025, 10:41:57 PM
class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(parts));
        return String.join(" ", parts);
    }
}
