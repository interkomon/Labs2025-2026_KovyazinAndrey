package lr9.ExampleIndepWork.Example8;

public class MyClass8 {
    private Node head;

    public static void main(String[] args) {
        MyClass8 list = new MyClass8();

        list.createHead(new int[]{1, 2, 3, 4});
        System.out.println("createHead: " + list.toStringList());

        list.createTail(new int[]{5, 6, 7, 8});
        System.out.println("createTail: " + list.toStringList());

        list.addFirst(4);
        System.out.println("AddFirst(4): " + list.toStringList());

        list.addLast(9);
        System.out.println("AddLast(9): " + list.toStringList());

        list.insert(2, 100);
        System.out.println("Insert(2, 100): " + list.toStringList());

        list.removeFirst();
        System.out.println("RemoveFirst(): " + list.toStringList());

        list.removeLast();
        System.out.println("RemoveLast(): " + list.toStringList());

        list.remove(2);
        System.out.println("Remove(2): " + list.toStringList());

        list.createHeadRec(new int[]{10, 20, 30});
        System.out.println("createHeadRec: " + list.toStringRec());

        list.createTailRec(new int[]{40, 50, 60});
        System.out.println("createTailRec: " + list.toStringRec());
    }

    public void createHead(int[] values) {
        head = null;
        for (int value : values) {
            head = new Node(value, head);
        }
    }

    public void createTail(int[] values) {
        head = null;
        Node tail = null;
        for (int value : values) {
            Node newNode = new Node(value, null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public String toStringList() {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        return sb.toString().trim();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newNode;
    }

    public void insert(int index, int value) {
        if (index <= 0 || head == null) {
            addFirst(value);
            return;
        }
        Node ref = head;
        int k = 0;
        while (ref.next != null && k < index - 1) {
            ref = ref.next;
            k++;
        }
        ref.next = new Node(value, ref.next);
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int index) {
        if (head == null) {
            return;
        }
        if (index <= 0) {
            removeFirst();
            return;
        }
        Node ref = head;
        int k = 0;
        while (ref.next != null && ref.next.next != null && k < index - 1) {
            ref = ref.next;
            k++;
        }
        if (ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    public void createHeadRec(int[] values) {
        head = null;
        createHeadRecInternal(values, 0);
    }

    private void createHeadRecInternal(int[] values, int index) {
        if (index >= values.length) {
            return;
        }
        head = new Node(values[index], head);
        createHeadRecInternal(values, index + 1);
    }

    public void createTailRec(int[] values) {
        head = createTailRecInternal(values, 0);
    }

    private Node createTailRecInternal(int[] values, int index) {
        if (index >= values.length) {
            return null;
        }
        return new Node(values[index], createTailRecInternal(values, index + 1));
    }

    public String toStringRec() {
        return toStringRecInternal(head).trim();
    }

    private String toStringRecInternal(Node node) {
        if (node == null) {
            return "";
        }
        return node.value + " " + toStringRecInternal(node.next);
    }
}

