/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buraknafigirgin_beyzanursevigen_searchengine;

/**
 *
 * @author Beyza Sevigen
 */
public class Node {
    String fileName;
    int count;
    Node next;
    
    public static Node node;
    
    public Node(String fileName){
        this.fileName = fileName;
        this.count = 1;
        this.next = null;
    }
}
