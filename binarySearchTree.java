
/*
Build a Binary Search Tree (BST) using Insertion



public class binarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
        }
    }

    // Inserts a value into the BST and returns the updated root
    public static Node insert(Node root, int val) {

        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }
    

    // Performs inorder traversal of the BST
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int values[] = {5, 1, 3, 4, 2, 7};

        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

    }
}






Search a Key in a Binary Search Tree (BST)


public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Inserts a value into the BST
    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    // Performs inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //search a key in BST
    public static boolean search(Node root, int key) {

        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Searches a key in the BST

    public static void main(String[] args) {

        int values[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();

        if(search(root, 7)) {
            System.out.println("key is found");
        } else {
            System.out.println("key is not found");
        }
    }
}









Delete a Node from a Binary Search Tree (BST)


public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }


    // Performs inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Inserts a value into the BST
    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    // Deletes a node from BST
    public static Node delete(Node root, int val) {

        if(root == null) {
            return null;
        }

        if(val > root.data) {
            root.right = delete(root.right, val);
        } else if(val < root.data) {
            root.left = delete(root.left, val);
        } else {

            //if its a leaf node
            if(root.left == null && root.right == null) {
                return null;
            }

            //if its a single child node
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //two child 
            Node iS = inorderSuccessor(root.right);
            root.data = iS.data;
            root.right = delete(root.right, iS.data);
        }

        return root;
    }
    
    // Finds the inorder successor
    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }
    

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;

        //insert values in BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Original BST:");
        inorder(root);

        System.out.println();

        // Delete a node
        root = delete(root, 10);

        System.out.println("The Node 10 is deleted");
        inorder(root);
    }
}





Print in Range method

public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Performs inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Inserts a value into the BST
    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void printInRange(int k1, int k2, Node root) {

        if(root == null) {
            return;
        }

        if(root.data >= k1 && root.data <= k2) {
            printInRange(k1, k2, root.left);
            System.out.print(root.data + " ");
            printInRange(k1, k2, root.right);
        } else if(root.data < k1) {
            printInRange(k1, k2, root.right);
        } else {
            printInRange(k1, k2, root.left);
        }
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;

        // insert values in BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Original BST:");
        inorder(root);

        System.out.println();

        printInRange(5, 12, root);
    }
}







ROOT TO LEAF


import java.util.ArrayList;

public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Performs inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Inserts a value into the BST
    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static void printPath(ArrayList<Integer> al) {

        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+"->");
        }
        System.out.print("null");
        System.out.println();
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> al) {

        if(root == null) {
            return;
        }

        al.add(root.data);

        // leaf node
        if (root.left == null && root.right == null) {
            printPath(al);
            al.remove(al.size() - 1);
            return;
        }

        rootToLeaf(root.left, al);
        rootToLeaf(root.right, al);

        al.remove(al.size() - 1);
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;

        // insert values in BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Original BST:");
        inorder(root);

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println();

        rootToLeaf(root, al);
    }
}







VALIDATE A BST

public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Performs inorder traversal
    public static void inorder(Node root) { 
        
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Inserts a value into the BST
    public static Node insert(Node root, int val) {
        
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    // Validates if the tree is a BST
    public static boolean isValidBst(Node root, Node min, Node max) {

        if(root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }
    
    public static void main(String[] args) {

        int values[] = { 5, 3, 1, 4, 6, 7 };

        Node root = null;

        // Insert values in BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println();

        if (isValidBst(root, null, null)) {
            System.out.println("Valid BST");
        } else {

            System.out.println("Not a Valid BST");
        }
    }
}







Mirror a Binary Search Tree (Mirror a BST)




public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Performs inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Inserts a value into the BST
    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    // Mirrors the BST
    public static Node mirror(Node root) {

        //base case
        if(root == null) {
            return null;
        }

        //recursive step
        Node leftS = mirror(root.left);
        Node rightS = mirror(root.right);

        root.left = rightS;
        root.right = leftS;

        //return
        return root;
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 6, 10, 11 };

        Node root = null;

        // Insert values in BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Original BST:");
        inorder(root);      

        root = mirror(root);

        System.out.println();

        System.out.println("Mirror BST:");
        inorder(root);
    }
}






Convert Sorted Array to Balanced Binary Search Tree (BST)



public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Performs inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Creates a Balanced BST from a Sorted Array
    public static Node createBST(int arr[], int st, int end) {
 
        if(st > end) {
            return null;
        }

        int mid = (st+end)/2;

        Node root = new Node(arr[mid]);

        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }


    public static void main(String[] args) {

        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = createBST(arr, 0, arr.length - 1);

        System.out.println("Inorder Traversal of Balanced BST:");
        inorder(root);
    }
}






Convert BST to Balanced BST


import java.util.ArrayList;

public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Preorder Traversal
    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Stores inorder traversal in ArrayList
    public static void inorder(Node root, ArrayList<Integer> al) {

        if(root == null) {
            return;
        }

        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
        
    }

    // Creates Balanced BST from sorted ArrayList
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {

        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node root = new Node(inorder.get(mid));

        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);

        return root;
    }

    // Converts BST into Balanced BST
    public static Node balanceBST(Node root) {

        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);

        return createBST(al, 0, al.size()-1);
    }

    public static void main(String[] args) {

        Node root = new Node(8);

        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println("Original BST (Preorder):");
        preorder(root);

        root = balanceBST(root);

        System.out.println();

        System.out.println("Balanced BST (Preorder):");
        preorder(root);
    }
}







Largest BST in a Binary Tree


public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int maxBST = 0;

    // Stores information about each subtree
    static class info {

        boolean isBST;
        int size;
        int min;
        int max;

        public info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }


    // Finds largest BST
    public static info largestBST(Node root) {

        if(root == null) {
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        info leftInfo = largestBST(root.left);
        info rightInfo = largestBST(root.right);

        int size = leftInfo.size+rightInfo.size+1;

        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min) );
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max) );

        //Not a BST
        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new info(false, size, min, max);
        }

        //left or right is not a valid subtree
        if(!leftInfo.isBST || !rightInfo.isBST) {
            return new info(false, size, min, max);
        }

        // current subtree is BST

        maxBST = Math.max(maxBST, size);

        return new info(true, size, min, max);
    }


    public static void main(String[] args) {


        Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);

        System.out.println("Size of Largest BST = " + maxBST);
    }
}




Binary Search Tree (BST) – Merge Two BSTs into One Balanced BST




import java.util.ArrayList;

public class binarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Inorder Traversal
    public static void inorder(Node root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // Merge two sorted ArrayLists
    public static void mergeList(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list) {

        int i=0;
        int j=0;

        while(i<list1.size() && j<list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }

    
        while(i<list1.size()){
            list.add(list1.get(i));
            i++;
        }

        while (j<list2.size()) {
            list.add(list2.get(j));
            j++;
        }
    }

    // Create Balanced BST
    public static Node createBST(ArrayList<Integer> list, int st, int end) {

        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;

        Node root = new Node(list.get(mid));

        root.left = createBST(list, st, mid - 1);
        root.right = createBST(list, mid + 1, end);

        return root;
    }

    // Merge two BSTs
    public static Node mergeBST(Node root1, Node root2){

        //create two arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        //sort the two arraylist
        inorder(root1, list1);
        inorder(root2, list2);

        mergeList(list1, list2, list);

        Node root = createBST(list, 0,list.size()-1);

        return root;
    }
    

    // Preorder Traversal
    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // BST 1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST 2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);

        System.out.println("Preorder Traversal of Merged Balanced BST:");
        preorder(root);
    }
}

*/













































