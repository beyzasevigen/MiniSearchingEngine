/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buraknafigirgin_beyzanursevigen_searchengine;

/**
 *
 * @author Beyza Sevigen
 */
public class bst {

    public static bstNode root;

    /**
     *
     */
    public static guiForBST gui = new guiForBST();

    public bst() {
        root = null;
    }

    public void add(String data, String fileName) {
        root = addRec(root, data.toLowerCase(), fileName);
    }

    private bstNode addRec(bstNode root, String data, String fileName) {
        if (root == null) {
            root = new bstNode(data, fileName);
            root.list = new dsLinkedList();
            root.list.add(fileName);
            return root;
        }

        if (data.compareTo(root.word.toLowerCase()) < 0) {
            root.left = addRec(root.left, data, fileName);

        } else if (data.compareTo(root.word.toLowerCase()) > 0) {
            root.right = addRec(root.right, data, fileName);
        } else {
            Node current = root.list.head;
            while (current != null) {
                if (current.fileName.equals(fileName)) {
                    current.count++;
                    break;
                } else if (current.next == null) {
                    current.next = new Node(fileName);
                    break;
                }
                current = current.next;
            }
            if (current == null) {
                root.list.head = new Node(fileName);
            }
        }

        return root;
    }
    

    public static bstNode search(String word) {
        return searchRec(root, word.toLowerCase());
    }

    private static bstNode searchRec(bstNode root, String word) {
        if (root == null || root.word.equalsIgnoreCase(word)) {
            if (root != null) {
            }
            return root;
        }

        if (word.compareTo(root.word.toLowerCase()) < 0) {
            return searchRec(root.left, word);
        } else {
            return searchRec(root.right, word);
        }
    }
}
