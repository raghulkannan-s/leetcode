// Last updated: 4/21/2026, 7:26:38 AM
1public class Node{
2    int key, val;
3    Node prev, next;
4
5    public Node( int key, int val ){
6        this.key = key;
7        this.val = val;
8    }
9}
10
11
12class LRUCache {
13    int cap;
14    int size;
15    Map<Integer, Node> map;
16    Node head;
17    Node tail;
18
19    public LRUCache(int capacity) {
20        cap = capacity;
21        size = 0;
22        map = new HashMap<>();
23        head = new Node(-1, -1);
24        tail = new Node(-1, -1);
25        head.next = tail;
26        tail.prev = head;
27    }
28
29    public void remove(Node node){
30        node.prev.next = node.next;
31        node.next.prev = node.prev;
32    }
33
34    public void insert( Node node ){
35        head.next.prev = node;
36        node.next = head.next;
37        head.next = node;
38        node.prev = head;
39    }
40    
41    public int get(int key) {
42        Node node = map.get(key);
43        if( node == null ) return -1;
44        remove(node);
45        insert(node);
46        return node.val;
47    }
48    
49    public void put(int key, int value) {
50
51        if (cap == 0) return;
52        Node node = map.get(key);
53
54        if (node != null) {
55            node.val = value;
56            remove(node);
57            insert(node);
58            return;
59        }
60
61        if( cap == size ) {
62            Node lru = tail.prev;
63            map.remove(lru.key);
64            remove(lru);
65        }
66        else{
67            size++;
68        }
69
70        Node newNode = new Node(key, value);
71        insert(newNode);
72        map.put( key, newNode );
73
74    }
75}
76
77/**
78 * Your LRUCache object will be instantiated and called as such:
79 * LRUCache obj = new LRUCache(capacity);
80 * int param_1 = obj.get(key);
81 * obj.put(key,value);
82 */