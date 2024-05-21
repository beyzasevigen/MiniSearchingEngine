/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buraknafigirgin_beyzanursevigen_searchengine;

/**
 *
 * @author Beyza Sevigen
 */
public class dsLinkedList {

    Node head;
    Node tail;
    int size;

    public dsLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(String fileName) {
        Node node = new Node(fileName);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    
    public int getSize(){
        return size;
    }

    public void remove(String fileName) {
        if (head == null) {
            return; 
        }
        if (head.fileName.equals(fileName)) {
            head = head.next;
            if (head == null) {
                tail = null; 
            }
            return; 
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.fileName.equals(fileName)) {
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current; 
                }
                return; 
            }
            current = current.next;
        }
    }

    public boolean contains(String fileName) {
        Node current = head;
        while (current != null) {
            if (current.fileName.equals(fileName)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public Node getNodeList(){
        Node current = this.head;
        while (current != null) {
            System.out.print(current.fileName + " -> " + current.count + "\n");
            current = current.next;
        }
        return current;
    }
    
    public int countSum(){
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.count;
            current = current.next;
        }
        return sum;
    }
}
