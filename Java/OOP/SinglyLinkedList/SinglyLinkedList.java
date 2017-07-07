public class SinglyLinkedList{
  private Node head;
  public SinglyLinkedList(){
    this.head = null;
  }
  public Node add(int value){

      if(this.head == null){
        this.head = new Node(value);
        return this.head;
    }
    Node ptr = this.head;

    while(ptr.next != null){
      ptr =ptr.next;
    }
    ptr.next = new Node(value);
    return this.head;
  }

  public Node remove(){
    Node ptr = this.head;
    while(ptr.next.next != null){
      ptr = ptr.next;
    }
    ptr.next = null;
    return ptr;

  }

  public void printValues(){
    Node ptr = this.head;
    while(ptr != null){
      System.out.println(ptr.value);
      ptr = ptr.next;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.add(1);
    sll.add(2);
    sll.add(3);
    sll.add(4);
    sll.add(5);
    sll.add(6);


    sll.remove();
    sll.printValues();
    System.out.println(sll);
  }
}
