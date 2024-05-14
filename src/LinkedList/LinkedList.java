package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        System.out.println("Tail Value : "+tail.value);
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        System.out.println("Head Value : "+head.value);
        return head;
    }

    public int getLength() {
        System.out.println("Length : "+length);
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LinkedList(int value){
        //create new node
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void append(int value){
        //create new node and add node to end
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast(){
        //remove node from last
        Node pre = head;
        Node temp = head;
        if(length == 0){
            return null;
        }
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        //create new node and add node to beginning
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        //remove node from first
        if(length==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }
    public Node get(int index){
        //get value of node of particular index
        if(index<0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0;i < index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        //set a value of node at a particular index
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value){
        //create new node and insert node at particular index
        if(index < 0 || index > length) {
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    public Node remove(int index){
        //remove node from particular index
        if(index < 0 || index > length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    public void reverse(){
        //reverse the linked list
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0;i < length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node middleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public Node kThNodeFromEnd(int k){
        Node back = head;
        Node front = head;
        for(int count = 0;count < k;count++){
            if(front == null){
                return null;
            }
            front = front.next;
        }
        while(front != null){
            back = back.next;
            front = front.next;
        }
        return back;
    }
    public void partitionList(int x){
        Node smaller = new Node(0);
        Node larger = new Node(0);
        Node smaller_pointer = smaller, larger_pointer = larger;
        while(head != null){
            if(head.value < x){
                smaller_pointer.next = head;
                smaller_pointer = head;
            }else{
                larger_pointer.next = head;
                larger_pointer = head;
            }
            head = head.next;
        }
        smaller_pointer.next = larger.next;
        larger_pointer.next = null;
        head = smaller.next;
        larger = null;
        smaller = null;
    }
    public void removeDuplicates(){
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while(current != null){
            if(values.contains(current.value)){
                previous.next = current.next;
                length--;
            }else{
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
        printList();
    }
    public int binaryToDecimal(){
        int num = 0;
        Node head_pointer = head;
        while(head_pointer != null){
            num = num * 2 + head_pointer.value;
            head_pointer = head_pointer.next;
        }
        return num;
    }
    public void reverseBetween(int startIndex, int endIndex){
        if(head == null){
            return;
        }
        Node head_pointer = head, temp  = head, tail_pointer = tail;
        Node new_head = null, new_head_pointer = new_head;
        for(int i = 0;i < startIndex;i++){
            head_pointer = head_pointer.next;
        }
        for(int j = 0;j < endIndex;j++){
            temp = temp.next;
        }

//        Node head_pointer = head;
//        Node temp = head;
//        for(int i = 0;i < startIndex;i++){
//            head_pointer = head_pointer.next;
//        }
//        for(int j = 0;j < endIndex;j++){
//            temp = temp.next;
//        }
//        int reverse = head_pointer.value;
//        head_pointer.value = temp.value;
//        temp.value = reverse;
        printList();
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
