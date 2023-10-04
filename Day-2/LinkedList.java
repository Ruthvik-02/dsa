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

    void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            head = tail = node;
        }
        else{
            node.address = head;
            head = node ;
        }
        size++;
    }

    int indexOf(int item){
        var current = head;
        int index = 0;

        while (current!=null){
            if(item == current.data){
                return index;
            }
            current = current.address;
            index++;
        }
        return -1;
    }

    boolean isContains(int item){
        var current = head;

        while (current!=null){
            if(item == current.data){
                return true;
            }
            current = current.address;
        }
        return false;
    }

    boolean isContains1(int item){
        if(indexOf(item)==-1)
            return false;
        return true;
    }
    int getSize(){
        return size;
    }

}
