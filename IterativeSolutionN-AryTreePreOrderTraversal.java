/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        Stack<Node> stack=new Stack<>();
        LinkedList<Integer> list=new LinkedList<>();
        
        //Base Case
        if(root==null){
            return list;
        }
        
        stack.add(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            list.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){
                stack.add(node.children.get(i));
            }
        }
        return list;
    }
}
