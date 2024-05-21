/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buraknafigirgin_beyzanursevigen_searchengine;

/**
 *
 * @author Beyza Sevigen
 */
public class bstNode {
    String word;
    bstNode left,right;
    dsLinkedList list;
    

    public bstNode(String word, String fileName){
        this.word = word;
        this.list = new dsLinkedList();
        this.list.add(fileName);
        this.left = null;
        this.right = null;
    }
    
    public int countSum() {
        return list.countSum();
    }
}
