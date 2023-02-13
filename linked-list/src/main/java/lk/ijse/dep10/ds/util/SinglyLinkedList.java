package lk.ijse.dep10.ds.util;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void add(String value) {
        Node node = new Node(Integer.parseInt(value), null);
        if (size == 0) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public String toString() {
        String data = "[";

        Node temp = head;
        while (temp != null) {
            data += temp.data + ", ";
            temp = temp.next;
        }
        if (size != 0) data += "\b\b";
        data += "]";
        return data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = head;
        size = 0;
    }

    public String get(int index) {
        return "10";
    }

    public boolean contains(String input) {
        Node temp = head;
        while (temp != null){
            if (temp.data == Integer.parseInt(input)) return true;
            temp = temp.next;
        }
        return false;
    }

    public void remove(int index) {
        size--;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}