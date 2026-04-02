// Last updated: 4/2/2026, 10:09:06 AM
class Solution {
    public int hIndex(int[] citations) {
        int papers = citations.length;
        int[] citationMap = new int[papers + 1];

        for(int citation : citations){
            citationMap[Math.min(citation,papers)]++;
        }

        int totalPapers = 0;
        for(int hIndex = papers; hIndex >= 0; hIndex--){
            totalPapers += citationMap[hIndex];
            if(totalPapers >= hIndex)
                return hIndex;
        }
        return 0;
    }
}