// Last updated: 2/16/2026, 3:57:23 PM
1class Solution {
2    public String arrangeWords(String s) {
3    s = s.toLowerCase();
4        String[] words = s.split(" ");
5
6        sorter(words);
7        words[0] = ""+ Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
8        StringBuilder res = new StringBuilder();
9        
10        for( String w : words ){
11            res.append(w);
12            res.append(" ");
13        }
14        return res.toString().substring(0,s.length());
15
16    }
17
18    public static void sorter(String[] a){
19        for( int i = 0; i < a.length - 1; i++ ){
20            for( int j = 0; j < a.length - i - 1; j++ ){
21                if( a[j].length() > a[j+1].length() ){
22                    swap(a, j, j+1);
23                }
24            }
25        }
26    }
27
28    public static void swap( String[] arr, int left, int right ){
29        String temp = arr[left];
30        arr[left] = arr[right];
31        arr[right] = temp;
32    }
33
34}