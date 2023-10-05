public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

      //  System.out.println(list.isEmpty());
        list.addLast(30);
        list.addLast(10);
        list.addLast(20);
        list.addFirst(40);
        list.removeLast();
        System.out.println(list.getSize());
    }
}