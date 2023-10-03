public class LinkedList {
    private class Node{
        int data;

        Node address;

        Node(int data){
            this.data = data;
        }
    }

    Node head;

    Node tail;

    int size = 0;

    boolean isEmpty(){
        if(head==null && tail == null)
            return true;
        else
            return false;
    }

    void  addLast(int item) {
        Node node = new Node(item);
        if(isEmpty()){
            head = tail = node;
        }
        else{
            tail.address = node;
            tail = node ;
        }
        size++;
        

    }

    void addF

    int getSize(){
        return size;
    }

}
