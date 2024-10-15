import java.util.HashMap;

public class LRUCache {
    //https://www.javatpoint.com/doubly-linked-list-program-in-java
    private class Node {
        Node prev;
        Node next;

        int nodeKey;
        int nodeData;
        Node(int key, int value){
            this.nodeKey = key;
            this.nodeData = value;
        }
    }

    Node head, tail;
    int nodeCount;

    int size;

    HashMap<Integer, Node> hm = new HashMap<Integer, Node>();
    public LRUCache(int capacity) {
        head = null;
        tail = null;
        head.next = tail;
        tail.prev = head;

        nodeCount = 0;
        size = capacity;
    }

    public int get(int key) {
        if(hm.containsKey(key)){
            //Must put this element at the front of the list
            Node newNode = new Node(key, hm.get(key).nodeData);
            if(head == null) {
                head = tail = newNode;
                //head's previous will be null
                head.prev = null;
                //tail's next will be null
                tail.next = null;
                nodeCount++;
            } else {
                //The head's prev will point to the newNode
                head.prev = newNode;
                //The newNode's next will point to the head
                newNode.next = head;
                //The newNode's prev will point to null because it will be the first node
                newNode.prev = null;
                //The newNode will become new head because now the newly created node is the first node of the list
                head = newNode;
                nodeCount++;
            }
            return hm.get(key).nodeData;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(hm.containsKey(key)){
            hm.replace(key, hm.get(key));
        }

        Node newNode = new Node(key, hm.get(key).nodeData);

        if(head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.prev = null;
            //tail's next will be null
            tail.next = null;
            nodeCount++;
        }else if(nodeCount >= size){
            //Must replace the tail element bc at cap
            newNode.next = tail.prev;
            tail.prev.next = newNode;
            tail = newNode;
            tail.next = null;
        } else {
            // Add to the tail bs still have room
            //The newly created node will be the last node, so now tail's next will point to that newly created node
            tail.next = newNode;
            //The tail will point to the second last node so the newly created node's prev will point to tail
            newNode.prev = tail;
            //The newly created node will become new tail because it is last node in the list
            tail = newNode;
            //The newly created node will be the last node so tail's next will be null
            tail.next = null;
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
