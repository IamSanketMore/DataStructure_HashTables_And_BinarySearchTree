import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree()
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        int sizeOfTree = binarySearchTree.getSize();
        System.out.println("Size of Binary Tree :- "+sizeOfTree);
        Assertions.assertEquals(3, sizeOfTree);
    }
}