// Last updated: 4/6/2026, 12:38:28 AM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;
4        for( char c : moves.toCharArray() ){
5            switch(c){
6                case ('R'):
7                    y++;
8                    break;
9                case ('L'):
10                    y--;
11                    break;
12                case ('U'):
13                    x--;
14                    break;
15                case ('D'):
16                    x++;
17                    break;
18            }
19        }
20
21        return ( x == 0 && y == 0 );
22    }
23}