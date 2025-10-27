class BinarySearchTree {
// Node structure
class Node {
int data;
Node left, right;
Node(int data) {
this.data = data;
}
}

Node root;

// Insert element in BST
Node insert(Node root, int data) {
if (root == null) {
root = new Node(data);
return root;
}
if (data &lt; root.data)

root.left = insert(root.left, data);
else if (data &gt; root.data)
root.right = insert(root.right, data);
return root;
}

// Search element in BST
boolean search(Node root, int key) {
if (root == null)
return false;
if (root.data == key)
return true;
else if (key &lt; root.data)
return search(root.left, key);
else
return search(root.right, key);
}

// Delete element from BST
Node delete(Node root, int key) {
if (root == null)
return null;

if (key &lt; root.data)
root.left = delete(root.left, key);
else if (key &gt; root.data)

root.right = delete(root.right, key);
else {
// Node found
if (root.left == null)
return root.right;
else if (root.right == null)
return root.left;

// Node with two children: get inorder successor
root.data = minValue(root.right);
root.right = delete(root.right, root.data);
}
return root;
}

int minValue(Node root) {
int minv = root.data;
while (root.left != null) {
minv = root.left.data;
root = root.left;
}
return minv;
}

// Inorder Traversal
void inorder(Node root) {

if (root != null) {
inorder(root.left);
System.out.print(root.data + &quot; &quot;);
inorder(root.right);
}
}

public static void main(String[] args) {
BinarySearchTree bst = new BinarySearchTree();

// Constructing BST
bst.root = bst.insert(bst.root, 50);
bst.insert(bst.root, 30);
bst.insert(bst.root, 70);
bst.insert(bst.root, 20);
bst.insert(bst.root, 40);
bst.insert(bst.root, 60);
bst.insert(bst.root, 80);

System.out.print(&quot;Inorder traversal of BST: &quot;);
bst.inorder(bst.root);
System.out.println();

// Searching a key
int key = 40;
System.out.println(&quot;Search for &quot; + key + &quot;: &quot; + (bst.search(bst.root, key) ? &quot;Found&quot; :
&quot;Not Found&quot;));


// Deleting a node
bst.root = bst.delete(bst.root, 20);
System.out.print(&quot;BST after deleting 20: &quot;);
bst.inorder(bst.root);
System.out.println();

bst.root = bst.delete(bst.root, 30);
System.out.print(&quot;BST after deleting 30: &quot;);
bst.inorder(bst.root);
System.out.println();

bst.root = bst.delete(bst.root, 50);
System.out.print(&quot;BST after deleting 50: &quot;);
bst.inorder(bst.root);
System.out.println();
}
}
