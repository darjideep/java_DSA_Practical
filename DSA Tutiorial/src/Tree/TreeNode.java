package Tree;

import java.util.ArrayList;

public class TreeNode<t> {
    t data;   
    ArrayList<TreeNode<t>>children;
    
    public TreeNode(t data){
        this.data=data;
        children=new ArrayList<>();
    }
}
