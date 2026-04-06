// Last updated: 4/6/2026, 11:38:27 AM
1class Solution {
2    public int daysBetweenDates(String date1, String date2) {
3        return Math.abs(date(date1) - date(date2));
4    }
5    public int date( String date ){
6        String[] part = date.split("-");
7        int y = Integer.parseInt(part[0]);
8        int m = Integer.parseInt(part[1]);
9        int d = Integer.parseInt(part[2]);
10
11        int days = 0;
12        int ty = 1900;
13        while( ty < y ){
14            if(isLeap(ty)) { days+=366; }
15            else { days+=365; }
16            ty++;
17        }
18        int tm = 0;
19        int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
20        while( tm < m-1 ){
21            days+=month[tm];
22            tm++;
23        }
24        if (isLeap(y) && m > 2) days++;
25        days+=d;
26        return days;
27    }
28    public boolean isLeap( int y ){
29        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
30    }
31}