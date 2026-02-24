// Last updated: 2/24/2026, 10:42:58 AM
class Solution {
    public static List<Integer>g(int row){
        List<Integer>ans=new ArrayList<>();
        ans.add(1);
        int res=1;
        for(int i=1;i<row;i++){
            res=res*(row-i);
            res=res/i;
            ans.add(res);

        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
       ans.add(g(i));
        }
        return ans;
    }
}