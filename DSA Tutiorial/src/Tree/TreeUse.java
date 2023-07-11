package Tree;
public class TreeUse {
    public static void main(String[] args) {
//        public static TreeNode<Integer>takeInput(){
//            
//        }
//        TreeNode<Integer> root=takeInput();
        TreeNode<Integer> root=new TreeNode<>(4);
        TreeNode<Integer> n1=new TreeNode<>(2);
        TreeNode<Integer> n2=new TreeNode<>(3);
        TreeNode<Integer> n3=new TreeNode<>(5);
        TreeNode<Integer> n4=new TreeNode<>(6);
        
        root.children.add(n1);
        root.children.add(n2);
        root.children.add(n3);
        n2.children.add(n4);
        
        System.out.println("Root Data"+root.data);
        System.out.println("1st Node ==> "+root.children.get(0).data);
        System.out.println("2nd Node ==> "+root.children.get(1).data);
        System.out.println("3rd Node ==> "+root.children.get(2).data);
        
        System.out.println("3rd node child ==> "+n2.children.get(0).data);
    }
    
}
