//package Linked_List;
//
//public class Basics {
//    Node head;
//    class Node{
//        String data;
//        Node next;
//        Node(String data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public void addFirst(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//           head= newNode;
//           return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//    public void addLast(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head= newNode;
//            return;
//        }
//        Node currNode = head;
//        while (currNode != null){
//            currNode=currNode.next;
//        }
//        currNode.next = newNode;
//    }
//    public void printList(){
//        if(head==null){
//            System.out.println("List is emplty");
//            return;
//        }
//        Node currNode = head;
//        while (currNode != null){
//            System.out.print(currNode+" -> ");
//            currNode=currNode.next;
//        }
//        System.out.print("Null");
//    }
//
//    public static void main(String[] args) {
//      Basics list = new Basics();
//        list.addFirst("Hi");
//        list.addFirst("gm");
//        list.printList();
//    }
//}
//
