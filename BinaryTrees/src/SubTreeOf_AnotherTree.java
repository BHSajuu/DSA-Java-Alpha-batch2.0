public class SubTreeOf_AnotherTree {
    public static  class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
          this.data=data;
          this.left=null;
          this.right=null;
        }
      }
      public static boolean isIdentical(Node root,Node subRoot){
         if(root == null && subRoot ==null){
            return true;
         }
         if((root.data != subRoot.data) || root == null || subRoot == null){
            return  false;
         }
         if(!isIdentical(root.left, subRoot.left)){
            return false ;
         }
         if(!isIdentical(root.right, subRoot.right)){
            return false ;
         }
         return true;
      }
    public  static boolean isSubTree(Node root ,Node subRoot){
        if(root ==null)
              return false;
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }
      public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right= new Node(6);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.err.println(isSubTree(root, subRoot));
      }
}
