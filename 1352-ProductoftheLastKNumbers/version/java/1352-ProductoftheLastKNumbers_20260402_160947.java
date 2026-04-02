// Last updated: 4/2/2026, 4:09:47 PM
1class ProductOfNumbers {
2
3    List<Integer> arr;
4    
5    public ProductOfNumbers() {
6        arr = new ArrayList<>();
7    }
8    
9    public void add(int num) {
10        arr.add(num);
11    }
12    
13    public int getProduct(int k) {
14        int n = arr.size()-1;
15
16        int product = 1;
17
18        while( k-- > 0 ){
19            product *= arr.get(n);
20            n--;
21        }
22
23        return product;
24        
25    }
26}
27
28/**
29 * Your ProductOfNumbers object will be instantiated and called as such:
30 * ProductOfNumbers obj = new ProductOfNumbers();
31 * obj.add(num);
32 * int param_2 = obj.getProduct(k);
33 */