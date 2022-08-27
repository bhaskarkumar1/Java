
import com.sun.source.tree.Tree;
import org.w3c.dom.CDATASection;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello wccccccccccorld!");
        TreeNode drinks=new TreeNode("Drinks");
        TreeNode hot=new TreeNode("hot");
        TreeNode cold=new TreeNode("cold");
        drinks.addChild(hot);
        drinks.addChild(cold);
        System.out.println(drinks.print(0));


    }

}