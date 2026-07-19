
/* 
Binary Tree Representation using Preorder Traversal Array (Build Binary Tree Recursively)

public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     left = null;
                     right = null;
              }
       }

       static class BinaryTree {

              static int idx = -1;

              public static Node buildTree(int nodes[]) {
                     idx++;

                     if(nodes[idx] == -1) {
                            return null;
                     }
              
                     Node newNode = new Node(nodes[idx]);

                     newNode.left = buildTree(nodes);
                     newNode.right = buildTree(nodes);

                     return newNode;
              }

              
       }

       public static void main(String args[]) {

              int nodes[] = {
                     1, 2, 4, -1, -1, 5, -1, -1,
                     3, -1, 6, -1, -1
              };

              BinaryTree tree = new BinaryTree();

              Node root = tree.buildTree(nodes);

              System.out.println(root.data);
       }
}




Preorder Traversal




public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       static class BinaryTree {

              static int idx = -1;

              // Builds the binary tree from preorder array
              public static Node buildTree(int nodes[]) {

                     idx++;

                     if (nodes[idx] == -1) {
                            return null;
                     }

                     Node newNode = new Node(nodes[idx]);

                     newNode.left = buildTree(nodes);
                     newNode.right = buildTree(nodes);

                     return newNode;
              }

              // Preorder Traversal (Root -> Left -> Right)
              public static void preOrder(Node root) {

                     if(root == null) {
                            return;
                     }

                     System.out.print(root.data+" ");

                     preOrder(root.left);
                     preOrder(root.right);
              }
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTree.buildTree(nodes);

              BinaryTree.preOrder(root);
       }
}






Inorder


public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       static class BinaryTree {

              static int idx = -1;

              // Builds the binary tree from preorder array
              public static Node buildTree(int nodes[]) {

                     idx++;

                     if (nodes[idx] == -1) {
                            return null;
                     }

                     Node newNode = new Node(nodes[idx]);

                     newNode.left = buildTree(nodes);
                     newNode.right = buildTree(nodes);

                     return newNode;
              }

              // Preorder Traversal (Root -> Left -> Right)
              public static void preOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     System.out.print(root.data + " ");

                     preOrder(root.left);
                     preOrder(root.right);
              } 

              public static void inOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     inOrder(root.left);
                     System.out.print(root.data + " ");
                     inOrder(root.right);
              }
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTree.buildTree(nodes);

              BinaryTree.preOrder(root);
              System.out.println();
              BinaryTree.inOrder(root);
       }
}



Postorder Traversal of Binary Tree


public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       static class BinaryTree {

              static int idx = -1;

              // Builds the binary tree from preorder array
              public static Node buildTree(int nodes[]) {

                     idx++;

                     if (nodes[idx] == -1) {
                            return null;
                     }

                     Node newNode = new Node(nodes[idx]);

                     newNode.left = buildTree(nodes);
                     newNode.right = buildTree(nodes);

                     return newNode;
              }

              // Preorder Traversal (Root -> Left -> Right)
              public static void preOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     System.out.print(root.data + " ");

                     preOrder(root.left);
                     preOrder(root.right);
              }

              public static void inOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     inOrder(root.left);
                     System.out.print(root.data + " ");
                     inOrder(root.right);
              }

              public static void postOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     postOrder(root.left);
                     postOrder(root.right);
                     System.out.print(root.data + " ");
              }
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTree.buildTree(nodes);

              BinaryTree.preOrder(root);
              System.out.println();
              BinaryTree.inOrder(root);
              System.out.println();
              BinaryTree.postOrder(root);
       }
}




Level Order




import java.util.*;

public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       static class BinaryTree {

              static int idx = -1;

              // Builds the binary tree from preorder array
              public static Node buildTree(int nodes[]) {

                     idx++;

                     if (nodes[idx] == -1) {
                            return null;
                     }

                     Node newNode = new Node(nodes[idx]);

                     newNode.left = buildTree(nodes);
                     newNode.right = buildTree(nodes);

                     return newNode;
              }

              // Preorder Traversal (Root -> Left -> Right)
              public static void preOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     System.out.print(root.data + " ");

                     preOrder(root.left);
                     preOrder(root.right);
              }

              // Inorder Traversal (Left -> Root -> Right)
              public static void inOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     inOrder(root.left);
                     System.out.print(root.data + " ");
                     inOrder(root.right);
              }

              // Postorder Traversal (Left -> Right -> Root)
              public static void postOrder(Node root) {

                     if (root == null) {
                            return;
                     }

                     postOrder(root.left);
                     postOrder(root.right);
                     System.out.print(root.data + " ");
              }

              // Level Order Traversal
              public static void levelOrder(Node root) {

                     if(root == null) {
                            return;
                     }

                     Queue<Node> q = new java.util.LinkedList<>();

                     q.add(root);
                     q.add(null);

                     while(!q.isEmpty()) {

                            Node curr = q.remove();

                            if(curr == null) {
                                   System.out.println();

                                   if(q.isEmpty()) {
                                          break;
                                   } else {
                                          q.add(null);
                                   }
                            } else {
                                   System.out.print(curr.data+" ");

                                   if(curr.left != null)  {
                                          q.add(curr.left);
                                   }

                                   if (curr.right != null) {
                                          q.add(curr.right);
                                   }
                                   
                            }
                     }
              }
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTree.buildTree(nodes);

              System.out.println("Preorder Traversal:");
              BinaryTree.preOrder(root);

              System.out.println("\n");

              System.out.println("Inorder Traversal:");
              BinaryTree.inOrder(root);

              System.out.println("\n");

              System.out.println("Postorder Traversal:");
              BinaryTree.postOrder(root);

              System.out.println("\n");

              System.out.println("Level Order Traversal:");
              BinaryTree.levelOrder(root);
       }
}



Height of a Binary Tree




public class binaryTree {

       static class Node{
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       public static int height(Node root) {

              if(root == null) {
                     return 0;
              }

              int leftHeight = height(root.left);
              int rightHeight = height(root.right);

              return Math.max(leftHeight,rightHeight) + 1;
       }

       public static void main(String args[]) {

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(height(root));
       }
}



count the number of nodes

public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       public static int count(Node root) {

              if(root == null) {
                     return 0;
              }

              int leftCount = count(root.left);
              int rightCount = count(root.right);

              return leftCount+rightCount+1;
       }

       

       public static void main(String args[]) {

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(count(root));
       }
}


sum of nodes data


public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       public static int sum(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftSum = sum(root.left);
              int rightSum = sum(root.right);

              return leftSum+rightSum+root.data;
       }

       public static void main(String args[]) {

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(sum(root));
       }
}




diameter of the tree




public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       public static int diameter(Node root) {
              
              if(root == null) {
                     return 0;
              }

              int leftD = diameter(root.left);
              int rightD = diameter(root.right);
              int leftH = height(root.left);
              int rightH = height(root.right);

              int selfD = leftH+rightH+1;
              
              return Math.max(selfD,Math.max(leftD,rightD));
       }

       public static int height(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftHeight = height(root.left);
              int rightHeight = height(root.right);

              return Math.max(leftHeight, rightHeight) + 1;
       } 

       
       public static void main(String args[]) {

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(diameter(root));
       }
}




Diameter of the tree optimized

public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       public static int diameter2(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftD = diameter2(root.left);
              int rightD = diameter2(root.right);
              int leftH = height(root.left);
              int rightH = height(root.right);

              int selfD = leftH + rightH + 1;

              return Math.max(selfD, Math.max(leftD, rightD));
       }

       public static int height(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftHeight = height(root.left);
              int rightHeight = height(root.right);

              return Math.max(leftHeight, rightHeight) + 1;
       }

       static class Info {
              int ht;
              int diam;

              public Info(int diam, int ht) {
                     this.ht = ht;
                     this.diam = diam;
              }
       }

       public static Info diameter(Node root) {
              
              if(root == null) {
                     return new Info(0,0);
              }

              Info leftInfo = diameter(root.left);
              Info rightInfo = diameter(root.right);

              int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
              int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

              return new Info (diam, ht);
       }


       public static void main(String args[]) {

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(diameter(root).diam);
       }
}




subtree of another tree





public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       // Checks if two trees are identical
       public static boolean isIdentical(Node root, Node subRoot) {
              
              if(root == null && subRoot == null) {
                     return true;
              }

              if(root == null || subRoot == null || root.data != subRoot.data) {
                     return false;
              }

              if(!isIdentical(root.left, subRoot.left)) {
                     return false;
              }

              if(!isIdentical(root.right, subRoot.right)) {
                     return false;
              }

              return true;
       }
       

       // Checks whether subRoot is a subtree of root
       public static boolean isSubtree(Node root, Node subRoot) {
              if(root == null) {
                     return false;
              }

              
              if(root.data == subRoot.data) {
                     if(isIdentical(root, subRoot)) {
                            return true;
                     }
              }
              
              return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
       }
       

       public static void main(String args[]) {

             

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.right = new Node(6);

              

              Node subRoot = new Node(2);
              subRoot.left = new Node(4);
              subRoot.right = new Node(5);

              System.out.println(isSubtree(root, subRoot));
       }
}





Top View of Binary Tree




import java.util.*;

public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       static class Info {
              Node node;
              int hd;

              Info(Node node, int hd) {
                     this.node = node;
                     this.hd = hd;
              }
       }

       // Top View of Binary Tree
       public static void topView(Node root) {

              if(root == null) {
                     return;
              }

              Queue<Info> q = new java.util.LinkedList<>();
              HashMap<Integer, Node> map = new HashMap<>(); 

              int min = 0, max = 0;

              q.add(new Info(root, 0));
              q.add(null);

              while(!q.isEmpty()) {

                     Info curr = q.remove();

                     if(curr == null) {
                            if(q.isEmpty()) {
                                   break;
                            } else {
                                   q.add(null);
                            }
                     } else {

                            if(!map.containsKey(curr.hd)) {
                            map.put(curr.hd, curr.node);
                            }

                            if(curr.node.left != null) {
                                   q.add(new Info(curr.node.left, curr.hd-1));
                                   min = Math.min(min, curr.hd-1);
                            }

                            if(curr.node.right != null) {
                                   q.add(new Info(curr.node.right, curr.hd+1));
                                   max = Math.max(max, curr.hd+1);
                            }
                     }
               }
              
                     
              for(int i=min; i<=max; i++) {
                     System.out.print(map.get(i).data+" ");
              }
              System.out.println();
       }

       public static void main(String args[]) {

              

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              topView(root);
       }
}



x

Kth Level of a Binary Tree

public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       // Prints all nodes at Kth level
       public static void KLevel(Node root, int level, int K) {

              if(root == null) {
                     return;
              }

              if(level == K) {
                     System.out.print(root.data+" ");
                     return;
              }

              KLevel(root.left, level+1, K);
              KLevel(root.right, level+1, K);
       }

       public static void main(String args[]) {

              

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              int K = 3;

              KLevel(root, 1, K);
       }
}





Lowest Common Ancestor (Approach 1 - Using Paths)




import java.util.*;

public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       // Finds root to node path
       public static boolean getPath(Node root, int n, ArrayList<Node> path) {

              if(root == null) {
                     return false;
              }

              path.add(root);

              if(root.data == n) {
                     return true;
              }

              boolean foundLeft = getPath(root.left, n, path);
              boolean foundRight = getPath(root.right, n, path);

              if(foundLeft || foundRight) {
                     return true;
              }

              path.remove(path.size()-1);
              return false;
       }

       // Lowest Common Ancestor
       public static Node lca(Node root, int n1, int n2) {

              ArrayList<Node> path1 = new ArrayList<>();
              ArrayList<Node> path2 = new ArrayList<>();

              getPath(root, n1, path1);
              getPath(root, n2, path2);

              int i=0;

              for(; i<path1.size() && i<path2.size(); i++) {
                     if(path1.get(i) != path2.get(i)) {
                            break;
                     }
              }

              return path1.get(i-1);
       }
       

       public static void main(String args[]) {

              

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              int n1 = 4;
              int n2 = 5;

              System.out.println
              (lca(root,n1,n2).data);
       }
}






Lowest Common Ancestor (Approach 2 - Optimized)











public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       // Optimized Lowest Common Ancestor
       public static Node lca2(Node root, int n1, int n2) {

              if(root == null || root.data == n1 || root.data == n2) {
                     return root;
              }

              Node leftLca = lca2(root.left, n1, n2);
              Node rightLca = lca2(root.right, n1, n2);

              if(leftLca == null) {
                     return rightLca;
              }

              if(rightLca == null) {
                     return leftLca;
              }

              return root;
       }

       public static void main(String args[]) {

              

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.right = new Node(6);

              int n1 = 4;
              int n2 = 6;

              System.out.println(lca2(root, n1, n2).data);
       }
}










Minimum Distance Between Two Nodes



public class binaryTree {

       static class Node {
              int data;
              Node left;
              Node right;

              Node(int data) {
                     this.data = data;
                     this.left = null;
                     this.right = null;
              }
       }

       // Optimized Lowest Common Ancestor
       public static Node lca2(Node root, int n1, int n2) {

              if (root == null || root.data == n1 || root.data == n2) {
                     return root;
              }

              Node leftLca = lca2(root.left, n1, n2);
              Node rightLca = lca2(root.right, n1, n2);

              if (leftLca == null) {
                     return rightLca;
              }

              if (rightLca == null) {
                     return leftLca;
              }

              return root;
       }

       // Distance from LCA to given node
       public static int dist(Node root, int n) {

              if(root == null) {
                     return -1;
              }

              if(root.data == n) {
                     return 0;
              }

              int leftDist = dist(root.left, n);
              int rightDist = dist(root.right, n);

              if(leftDist == -1 && rightDist == -1) {
                     return -1;
              } else if(leftDist == -1) {
                     return rightDist+1;
              } else {
                     return leftDist+1;
              }
       }

       // Minimum Distance Between Two Nodes
       public static int minDist(Node root, int n1, int n2) {

              Node lca = lca2(root, n1, n2);

              int leftDist = dist(lca, n1);
              int rightDist = dist(lca, n2);

              return leftDist+rightDist;
       }

       public static void main(String args[]) {

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              int n1 = 4;
              int n2 = 6;

              System.out.println(minDist(root, n1, n2));
       }
}






Kth Ancestor of a Node in Binary Tree (Optimized Recursive Approach)



public class binaryTree {

       static class Node {
              int data;
              Node left, right;

              Node(int data) {
                     this.data = data;
                     left = right = null;
              }
       }

       // Finds Kth Ancestor
       public static int kAncestor(Node root, int n, int k) {

              if(root == null) {
                     return -1;
              }

              if(root.data == n) {
                     return 0;
              }

              int leftD = kAncestor(root.left, n, k);
              int rightD = kAncestor(root.right, n, k);

              if(leftD == -1 && rightD == -1) {
                     return -1;
              }

              int max = Math.max(leftD, rightD);

              if(max+1 == k) {
                     System.out.println(k + "th Ancestor from " + n + " node is: " + root.data);
              }

              
              return max+1;
       }

       
       public static void main(String args[]) {



              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              int n = 5;
              int k = 2;

              kAncestor(root, n, k);
       }
}




Transform to Sum Tree (Binary Tree)


public class BinaryTree {

       static class Node {
              int data;
              Node left, right;

              Node(int data) {
                     this.data = data;
                     left = right = null;
              }
       }

       // Transform Binary Tree into Sum Tree
       public static int transform(Node root) {

              if(root == null) {
                     return 0;
              }
              
              int leftChild = transform(root.left);
              int rightChild = transform(root.right);

              int data = root.data;

              int newLeft = (root.left == null) ? 0 : root.left.data;
              int newRight = (root.right == null) ? 0 : root.right.data;

              root.data = leftChild + newLeft + rightChild + newRight;

              return data;
       }

       // Preorder Traversal
       public static void preOrder(Node root) {

              if(root == null) {
                     return;
              }

              System.out.println(root.data+" ");
              preOrder(root.left);
              preOrder(root.right);
       }
       
       public static void main(String args[]) {

            

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              transform(root);
              preOrder(root);

       }
}

*/


















