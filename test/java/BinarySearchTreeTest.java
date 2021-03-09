import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
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
    @Test
    public void given13NumbersWhenAddedToBinaryTreeShouldReturnSizeThirteen()
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(22);
        binarySearchTree.add(60);
        binarySearchTree.add(95);
        binarySearchTree.add(65);
        binarySearchTree.add(40);
        binarySearchTree.add(11);
        binarySearchTree.add(3);
        binarySearchTree.add(16);
        binarySearchTree.add(63);
        binarySearchTree.add(67);
        int sizeOfTree = binarySearchTree.getSize();
        System.out.println("Size of Binary Tree :- "+sizeOfTree);
        Assertions.assertEquals(13, sizeOfTree);
    }
    @Test
    public void given13NumbersWhenAddedToBinaryTreeShouldReturnTrueForSearchedElement()
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(22);
        binarySearchTree.add(60);
        binarySearchTree.add(95);
        binarySearchTree.add(65);
        binarySearchTree.add(40);
        binarySearchTree.add(11);
        binarySearchTree.add(3);
        binarySearchTree.add(16);
        binarySearchTree.add(63);
        binarySearchTree.add(67);

        Comparable result = binarySearchTree.nodeSearch(binarySearchTree.root,67);
        System.out.println("Search element from Binary Tree :- "+result);
        Assertions.assertEquals(67,result);
    }
}