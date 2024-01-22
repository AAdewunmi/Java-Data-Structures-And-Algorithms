package Tree.BinaryTree.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        hot.addChild(tea);
        hot.addChild(coffee);
        TreeNode beer = new TreeNode("Beer");
        TreeNode wine = new TreeNode("Wine");
        cold.addChild(beer);
        cold.addChild(wine);
        System.out.println(drinks.print(0));
    }
}
