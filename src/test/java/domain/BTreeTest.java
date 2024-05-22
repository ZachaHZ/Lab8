package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTreeTest {

    @Test
    void Test() {
        BTree bTree = new BTree();
        for(int i = 0; i < 10; i++){
            bTree.add(util.Utility.getRandom(50));
        }
//        bTree.add(20);
//        bTree.add(30);
//        bTree.add(40);

        try {
            System.out.println(bTree.preOrder());
            System.out.println("Size " +bTree.size());
        } catch (TreeException e) {
            throw new RuntimeException(e);
        }

//        try {
//            System.out.println(bTree.InOrder());
//        } catch (TreeException e) {
//            throw new RuntimeException(e);
//        }
    }
}