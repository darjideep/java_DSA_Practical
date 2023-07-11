package LinkList;
public class LinkListUse {
    
    public static void print(Node<Integer> head){
        while(head !=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node <Integer>node1=new Node<>(5);
//        System.out.println(node1.data);
//        System.out.println(node1.next);
        
        Node <Integer>node2=new Node<>(11);
        Node <Integer>node3=new Node<>(22);
        node1.next=node2;
        node2.next=node3;
        
        Node<Integer> head=node1;
        
        print(head);
//        while(head !=null){
//            System.out.print(head.data +" ");
//            head=head.next;
//        }
    }
    
}
