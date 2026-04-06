// Last updated: 4/6/2026, 11:32:17 AM
1class Solution {
2    public int daysBetweenDates(String date1, String date2) {
3        return Math.abs(date(date1) - date(date2));
4    }
5
6    public int date( String date ){
7
8        String[] part = date.split("-");
9        int y = Integer.parseInt(part[0]);
10        int m = Integer.parseInt(part[1]);
11        int d = Integer.parseInt(part[2]);
12
13        boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
14
15        int days = 0;
16
17        int ty = 1900;
18        while( ty < y ){
19            if((ty % 4 == 0 && ty % 100 != 0) || (ty % 400 == 0)) { days+=366; }
20            else { days+=365; }
21            ty++;
22        }
23        int tm = 0;
24
25        int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
26
27        while( tm < m-1 ){
28            days+=month[tm];
29            tm++;
30        }
31        if (leap && m > 2) days++;
32
33        days+=d;
34
35        return days;
36
37
38    }
39}