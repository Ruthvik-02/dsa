public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

      //  System.out.println(list.isEmpty());
        list.addLast(30);
        list.addLast(10);
        list.addLast(20);

        System.out.println(list.getSize());
    }
}