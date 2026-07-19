


# Binary Trees - Index

| Sr. No. | Program                                   | Time Complexity | Space Complexity |
| ------: | ----------------------------------------- | :-------------: | :--------------: |
|       1 | Binary Tree Construction (Preorder Array) |       O(N)      |       O(H)       |
|       2 | Preorder Traversal                        |       O(N)      |       O(H)       |
|       3 | Inorder Traversal                         |       O(N)      |       O(H)       |
|       4 | Postorder Traversal                       |       O(N)      |       O(H)       |
|       5 | Level Order Traversal                     |       O(N)      |       O(N)       |
|       6 | Height of Binary Tree                     |       O(N)      |       O(H)       |
|       7 | Count Total Nodes                         |       O(N)      |       O(H)       |
|       8 | Sum of Nodes                              |       O(N)      |       O(H)       |
|       9 | Diameter of Binary Tree (Brute Force)     |      O(N²)      |       O(H)       |
|      10 | Diameter of Binary Tree (Optimized)       |       O(N)      |       O(H)       |
|      11 | Subtree of Another Tree                   |     O(N × M)    |       O(H)       |
|      12 | Top View of Binary Tree                   |       O(N)      |       O(N)       |
|      13 | Kth Level of Binary Tree                  |       O(N)      |       O(H)       |
|      14 | Lowest Common Ancestor (Approach 1)       |       O(N)      |       O(N)       |
|      15 | Lowest Common Ancestor (Approach 2)       |       O(N)      |       O(H)       |
|      16 | Minimum Distance Between Two Nodes        |       O(N)      |       O(H)       |
|      17 | Kth Ancestor of a Node                    |       O(N)      |       O(H)       |
|      18 | Transform to Sum Tree                     |       O(N)      |       O(H)       |

---

# Complexity Summary

| Complexity   | Programs                             |
| ------------ | ------------------------------------ |
| **O(N²)**    | Diameter (Brute Force)               |
| **O(N × M)** | Subtree of Another Tree              |
| **O(N)**     | All remaining Binary Tree operations |







// ============================================================
//                  BINARY TREES - PART 1
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Binary Tree Construction (Preorder Array)
//
// TC: O(N)
// Reason: Every element of the preorder array is processed once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       static class BinaryTreeBuilder {

              static int idx = -1;

              // Builds Binary Tree from preorder array
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
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTreeBuilder.buildTree(nodes);

              System.out.println(root.data);
       }
}

/*
 * Output:
 * 1
 */

// ------------------------------------------------------------
// Binary Trees | Preorder Traversal
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       static class BinaryTreeBuilder {

              static int idx = -1;

              // Builds Binary Tree from preorder array
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
       }

       // Preorder Traversal
       public static void preOrder(Node root) {

              if (root == null) {
                     return;
              }

              System.out.print(root.data + " ");

              preOrder(root.left);
              preOrder(root.right);
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTreeBuilder.buildTree(nodes);

              preOrder(root);
       }
}

/*
 * Output:
 * 1 2 4 5 3 6
 */



// ============================================================
// BINARY TREES - PART 2
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Inorder Traversal
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       static class BinaryTreeBuilder {

              static int idx = -1;

              // Builds Binary Tree from preorder array
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
       }

       // Inorder Traversal
       public static void inOrder(Node root) {

              if (root == null) {
                     return;
              }

              inOrder(root.left);
              System.out.print(root.data + " ");
              inOrder(root.right);
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTreeBuilder.buildTree(nodes);

              inOrder(root);
       }
}

/*
 * Output:
 * 4 2 5 1 3 6
 */

// ------------------------------------------------------------
// Binary Trees | Postorder Traversal
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       static class BinaryTreeBuilder {

              static int idx = -1;

              // Builds Binary Tree from preorder array
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
       }

       // Postorder Traversal
       public static void postOrder(Node root) {

              if (root == null) {
                     return;
              }

              postOrder(root.left);
              postOrder(root.right);
              System.out.print(root.data + " ");
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTreeBuilder.buildTree(nodes);

              postOrder(root);
       }
}

/*
 * Output:
 * 4 5 2 6 3 1
 */


// ============================================================
// BINARY TREES - PART 3
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Level Order Traversal
//
// TC: O(N)
// Reason: Every node is inserted into and removed from the queue once.
//
// SC: O(N)
// Reason: Queue may contain all nodes of one level in the worst case.
// ------------------------------------------------------------

import java.util.*;

public class BinaryTree {

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

       static class BinaryTreeBuilder {

              static int idx = -1;

              // Builds Binary Tree from preorder array
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
       }

       // Level Order Traversal
       public static void levelOrder(Node root) {

              if (root == null) {
                     return;
              }

              Queue<Node> q = new LinkedList<>();

              q.add(root);
              q.add(null);

              while (!q.isEmpty()) {

                     Node curr = q.remove();

                     if (curr == null) {

                            System.out.println();

                            if (q.isEmpty()) {
                                   break;
                            } else {
                                   q.add(null);
                            }

                     } else {

                            System.out.print(curr.data + " ");

                            if (curr.left != null) {
                                   q.add(curr.left);
                            }

                            if (curr.right != null) {
                                   q.add(curr.right);
                            }
                     }
              }
       }

       public static void main(String args[]) {

              int nodes[] = {
                            1, 2, 4, -1, -1, 5, -1, -1,
                            3, -1, 6, -1, -1
              };

              Node root = BinaryTreeBuilder.buildTree(nodes);

              levelOrder(root);
       }
}

/*
 * Output:
 * 1
 * 2 3
 * 4 5 6
 */

// ------------------------------------------------------------
// Binary Trees | Height of Binary Tree
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Finds Height of Binary Tree
       public static int height(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftHeight = height(root.left);
              int rightHeight = height(root.right);

              return Math.max(leftHeight, rightHeight) + 1;
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 4 5
               * / \ \
               * 6 7 8
               */

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(height(root));
       }
}

/*
 * Output:
 * 3
 */



// ============================================================
// BINARY TREES - PART 4
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Count Total Nodes
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Counts Total Nodes
       public static int count(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftCount = count(root.left);
              int rightCount = count(root.right);

              return leftCount + rightCount + 1;
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 4 5
               * / \ \
               * 6 7 8
               */

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(count(root));
       }
}

/*
 * Output:
 * 6
 */

// ------------------------------------------------------------
// Binary Trees | Sum of Nodes
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Finds Sum of All Nodes
       public static int sum(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftSum = sum(root.left);
              int rightSum = sum(root.right);

              return leftSum + rightSum + root.data;
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 4 5
               * / \ \
               * 6 7 8
               */

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(sum(root));
       }
}

/*
 * Output:
 * 31
 */

// ------------------------------------------------------------
// Binary Trees | Diameter of Binary Tree (Brute Force)
//
// TC: O(N²)
// Reason: Height is calculated for every node.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Finds Height of Binary Tree
       public static int height(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftHeight = height(root.left);
              int rightHeight = height(root.right);

              return Math.max(leftHeight, rightHeight) + 1;
       }

       // Finds Diameter of Binary Tree (Brute Force)
       public static int diameter(Node root) {

              if (root == null) {
                     return 0;
              }

              int leftDiameter = diameter(root.left);
              int rightDiameter = diameter(root.right);

              int leftHeight = height(root.left);
              int rightHeight = height(root.right);

              int selfDiameter = leftHeight + rightHeight + 1;

              return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 4 5
               * / \ \
               * 6 7 8
               */

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(diameter(root));
       }
}

/*
 * Output:
 * 5
 */



// ============================================================
// BINARY TREES - PART 5
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Diameter of Binary Tree (Optimized)
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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
              int diam;
              int ht;

              Info(int diam, int ht) {
                     this.diam = diam;
                     this.ht = ht;
              }
       }

       // Finds Diameter of Binary Tree (Optimized)
       public static Info diameter(Node root) {

              if (root == null) {
                     return new Info(0, 0);
              }

              Info leftInfo = diameter(root.left);
              Info rightInfo = diameter(root.right);

              int diam = Math.max(
                            Math.max(leftInfo.diam, rightInfo.diam),
                            leftInfo.ht + rightInfo.ht + 1);

              int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

              return new Info(diam, ht);
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 4 5
               * / \ \
               * 6 7 8
               */

              Node root = new Node(1);
              root.left = new Node(4);
              root.right = new Node(5);
              root.left.left = new Node(6);
              root.left.right = new Node(7);
              root.right.right = new Node(8);

              System.out.println(diameter(root).diam);
       }
}

/*
 * Output:
 * 5
 */

// ------------------------------------------------------------
// Binary Trees | Subtree of Another Tree
//
// TC: O(N × M)
// Reason: Each node of the main tree may compare the entire subtree.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

              if (root == null && subRoot == null) {
                     return true;
              }

              if (root == null || subRoot == null || root.data != subRoot.data) {
                     return false;
              }

              if (!isIdentical(root.left, subRoot.left)) {
                     return false;
              }

              if (!isIdentical(root.right, subRoot.right)) {
                     return false;
              }

              return true;
       }

       // Checks whether subRoot is a subtree of root
       public static boolean isSubtree(Node root, Node subRoot) {

              if (root == null) {
                     return false;
              }

              if (root.data == subRoot.data) {
                     if (isIdentical(root, subRoot)) {
                            return true;
                     }
              }

              return isSubtree(root.left, subRoot)
                            || isSubtree(root.right, subRoot);
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ \
               * 4 5 6
               */

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.right = new Node(6);

              /*
               * 2
               * / \
               * 4 5
               */

              Node subRoot = new Node(2);
              subRoot.left = new Node(4);
              subRoot.right = new Node(5);

              System.out.println(isSubtree(root, subRoot));
       }
}

/*
 * Output:
 * true
 */


// ============================================================
// BINARY TREES - PART 6
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Top View of Binary Tree
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(N)
// Reason: Queue and HashMap may store all nodes in the worst case.
// ------------------------------------------------------------

import java.util.*;

public class BinaryTree {

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

       // Prints Top View of Binary Tree
       public static void topView(Node root) {

              if (root == null) {
                     return;
              }

              Queue<Info> q = new LinkedList<>();
              HashMap<Integer, Node> map = new HashMap<>();

              int min = 0;
              int max = 0;

              q.add(new Info(root, 0));
              q.add(null);

              while (!q.isEmpty()) {

                     Info curr = q.remove();

                     if (curr == null) {

                            if (q.isEmpty()) {
                                   break;
                            } else {
                                   q.add(null);
                            }

                     } else {

                            if (!map.containsKey(curr.hd)) {
                                   map.put(curr.hd, curr.node);
                            }

                            if (curr.node.left != null) {
                                   q.add(new Info(curr.node.left, curr.hd - 1));
                                   min = Math.min(min, curr.hd - 1);
                            }

                            if (curr.node.right != null) {
                                   q.add(new Info(curr.node.right, curr.hd + 1));
                                   max = Math.max(max, curr.hd + 1);
                            }
                     }
              }

              for (int i = min; i <= max; i++) {
                     System.out.print(map.get(i).data + " ");
              }

              System.out.println();
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ / \
               * 4 5 6 7
               */

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

/*
 * Output:
 * 4 2 1 3 7
 */

// ------------------------------------------------------------
// Binary Trees | Kth Level of Binary Tree
//
// TC: O(N)
// Reason: Every node is visited at most once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Prints Nodes at Kth Level
       public static void KLevel(Node root, int level, int k) {

              if (root == null) {
                     return;
              }

              if (level == k) {
                     System.out.print(root.data + " ");
                     return;
              }

              KLevel(root.left, level + 1, k);
              KLevel(root.right, level + 1, k);
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ / \
               * 4 5 6 7
               */

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              int k = 3;

              KLevel(root, 1, k);
       }
}

/*
 * Output:
 * 4 5 6 7
 */


// ============================================================
// BINARY TREES - PART 7
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Lowest Common Ancestor (Approach 1)
//
// TC: O(N)
// Reason: getPath() is called twice and both paths are compared.
//
// SC: O(N)
// Reason: Two ArrayLists store the paths and recursion uses O(H).
// ------------------------------------------------------------

import java.util.*;

public class BinaryTree {

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

       // Finds Root to Node Path
       public static boolean getPath(Node root, int n, ArrayList<Node> path) {

              if (root == null) {
                     return false;
              }

              path.add(root);

              if (root.data == n) {
                     return true;
              }

              boolean foundLeft = getPath(root.left, n, path);
              boolean foundRight = getPath(root.right, n, path);

              if (foundLeft || foundRight) {
                     return true;
              }

              path.remove(path.size() - 1);
              return false;
       }

       // Lowest Common Ancestor (Approach 1)
       public static Node lca(Node root, int n1, int n2) {

              ArrayList<Node> path1 = new ArrayList<>();
              ArrayList<Node> path2 = new ArrayList<>();

              getPath(root, n1, path1);
              getPath(root, n2, path2);

              int i = 0;

              for (; i < path1.size() && i < path2.size(); i++) {
                     if (path1.get(i) != path2.get(i)) {
                            break;
                     }
              }

              return path1.get(i - 1);
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ / \
               * 4 5 6 7
               */

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              int n1 = 4;
              int n2 = 5;

              System.out.println(lca(root, n1, n2).data);
       }
}

/*
 * Output:
 * 2
 */

// ------------------------------------------------------------
// Binary Trees | Lowest Common Ancestor (Approach 2)
//
// TC: O(N)
// Reason: Every node is visited only once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Lowest Common Ancestor (Optimized)
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

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ / \
               * 4 5 6 7
               */

              Node root = new Node(1);
              root.left = new Node(2);
              root.right = new Node(3);
              root.left.left = new Node(4);
              root.left.right = new Node(5);
              root.right.left = new Node(6);
              root.right.right = new Node(7);

              int n1 = 4;
              int n2 = 5;

              System.out.println(lca2(root, n1, n2).data);
       }
}

/*
 * Output:
 * 2
 */



// ============================================================
// BINARY TREES - PART 8
// ============================================================

// ------------------------------------------------------------
// Binary Trees | Minimum Distance Between Two Nodes
//
// TC: O(N)
// Reason: lca2() -> O(N), dist() for n1 -> O(N), dist() for n2 -> O(N).
// Total = O(N) + O(N) + O(N) = O(3N) = O(N).
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

              if (root == null) {
                     return -1;
              }

              if (root.data == n) {
                     return 0;
              }

              int leftDist = dist(root.left, n);
              int rightDist = dist(root.right, n);

              if (leftDist == -1 && rightDist == -1) {
                     return -1;
              } else if (leftDist == -1) {
                     return rightDist + 1;
              } else {
                     return leftDist + 1;
              }
       }

       // Minimum Distance Between Two Nodes
       public static int minDist(Node root, int n1, int n2) {

              Node lca = lca2(root, n1, n2);

              int leftDist = dist(lca, n1);
              int rightDist = dist(lca, n2);

              return leftDist + rightDist;
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ / \
               * 4 5 6 7
               */

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

/*
 * Output:
 * 4
 */

// ------------------------------------------------------------
// Binary Trees | Kth Ancestor of a Node
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Finds Kth Ancestor
       public static int kAncestor(Node root, int n, int k) {

              if (root == null) {
                     return -1;
              }

              if (root.data == n) {
                     return 0;
              }

              int leftDist = kAncestor(root.left, n, k);
              int rightDist = kAncestor(root.right, n, k);

              if (leftDist == -1 && rightDist == -1) {
                     return -1;
              }

              int max = Math.max(leftDist, rightDist);

              if (max + 1 == k) {
                     System.out.println(k + "th Ancestor of node " + n + " is: " + root.data);
              }

              return max + 1;
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ / \
               * 4 5 6 7
               */

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

/*
 * Output:
 * 2th Ancestor of node 5 is: 1
 */

// ------------------------------------------------------------
// Binary Trees | Transform to Sum Tree
//
// TC: O(N)
// Reason: Every node is visited exactly once.
//
// SC: O(H)
// Reason: Recursive call stack stores at most H nodes.
// ------------------------------------------------------------

public class BinaryTree {

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

       // Transform Binary Tree into Sum Tree
       public static int transform(Node root) {

              if (root == null) {
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

              if (root == null) {
                     return;
              }

              System.out.print(root.data + " ");

              preOrder(root.left);
              preOrder(root.right);
       }

       public static void main(String args[]) {

              /*
               * 1
               * / \
               * 2 3
               * / \ / \
               * 4 5 6 7
               * 
               * Expected Sum Tree
               * 
               * 27
               * / \
               * 9 13
               * / \ / \
               * 0 0 0 0
               */

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

/*
 * Output:
 * 27 9 0 0 13 0 0
 */




















