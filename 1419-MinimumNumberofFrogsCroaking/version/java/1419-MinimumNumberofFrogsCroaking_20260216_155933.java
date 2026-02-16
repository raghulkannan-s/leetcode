// Last updated: 2/16/2026, 3:59:33 PM
1class Solution {
2    public String arrangeWords(String s) {
3    s = s.toLowerCase();
4        String[] words = s.split(" ");
5
6        sorter(words);
7        words[0] = ""+ Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
8        StringBuilder res = new StringBuilder();
9        
10        for( int i = 0; i<words.length; i++ ){
11            res.append(words[i]);
12            if( i < words.length-1 ){
13                res.append(" ");
14            }
15        }
16        return res.toString();
17
18
19    }
20
21    public static void sorter(String[] a){
22        for( int i = 0; i < a.length - 1; i++ ){
23            for( int j = 0; j < a.length - i - 1; j++ ){
24                if( a[j].length() > a[j+1].length() ){
25                    swap(a, j, j+1);
26                }
27            }
28        }
29    }
30
31    public static void swap( String[] arr, int left, int right ){
32        String temp = arr[left];
33        arr[left] = arr[right];
34        arr[right] = temp;
35    }
36
37}