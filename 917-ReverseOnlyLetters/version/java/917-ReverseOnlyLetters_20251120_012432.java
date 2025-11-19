// Last updated: 11/20/2025, 1:24:32 AM
class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = parts.length-1; i>=0; i--){
            sb.append(parts[i]);
            if( i>0 ){
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}
