// Q. https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d; next = null; 
    }
}

class Solution {
    Node sortedInsert(Node head1, int key) {
        Node nodeToInsert = new Node(key);
        
        if(nodeToInsert.data <= head1.data) {
            nodeToInsert.next = head1;
            head1 = nodeToInsert;
            return head1;
        }
        
        Node previous = head1;
        Node current = head1.next;
        
        while(current!=null && current.data < nodeToInsert.data) {
            previous = current;
            current = current.next;
        }
        
        previous.next = nodeToInsert;
        nodeToInsert.next = current;
        
        return head1;
    }
}
