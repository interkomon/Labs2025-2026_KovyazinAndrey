package lr9.ExampleIndepWork.Example5;

public class MyClass5Tail {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node tail = head;

        for (int i = 1; i < 10; i++) {
            tail.next = new Node(i, null);
            tail = tail.next;
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
}
