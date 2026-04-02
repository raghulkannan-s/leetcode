// Last updated: 4/2/2026, 5:51:11 PM
1class ProductOfNumbers {
2
3    List<Integer> proList;
4
5    public ProductOfNumbers() {
6        proList = new ArrayList<>();
7        proList.add(1);
8    }
9    
10    public void add(int num) {
11        if( num == 0 ){
12            proList = new ArrayList<>();
13            proList.add(1);
14        }else{
15            int prev = proList.get( proList.size()-1 ) ;
16            proList.add( prev * num );
17        }
18    }
19    
20    public int getProduct(int k) {
21        int n = proList.size()-1;
22        if( k > n ){
23            return 0;
24        }
25        return proList.get(n) / proList.get(n-k);
26
27    }
28}
29
30/**
31 * Your ProductOfNumbers object will be instantiated and called as such:
32 * ProductOfNumbers obj = new ProductOfNumbers();
33 * obj.add(num);
34 * int param_2 = obj.getProduct(k);
35 */