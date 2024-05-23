package domain;

import domain.list.CircularDoublyLinkedList;
import domain.list.SinglyLinkedList;
import domain.queue.LinkedQueue;
import domain.stack.LinkedStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTreeTest {

    @Test
    void Test() {
        BTree bTree = new BTree();
        for(int i = 0; i < 10; i++){
            bTree.add(util.Utility.getRandom(50));
            LinkedStack stack= new LinkedStack();
            LinkedQueue queue = new LinkedQueue();
            CircularDoublyLinkedList circular =new CircularDoublyLinkedList();
            SinglyLinkedList singly = new SinglyLinkedList();

        }
//        bTree.add(20);
//        bTree.add(30);
//        bTree.add(40);

        try {
            System.out.println(bTree);//chanced it fo a bit bTree.preOrder()
            System.out.println("Size " +bTree.size());
            int value = util.Utility.getRandom(50);
            bTree.remove(value);
            if (bTree.contains(value)) {
                bTree.remove(value);
                System.out.println("Value: "+value+" has been removed");
            }else System.out.println("the value ("+value+") was not found"); //TODO fix the remove to properly remove the number
            System.out.println("tree height: "+bTree.height());
            System.out.println(bTree);

        } catch (TreeException e) {
            throw new RuntimeException(e);
        }
        //TODO add the height(element) test
        //TODO add the lists, Stack & queue
//        try {
//            System.out.println(bTree.InOrder());
//        } catch (TreeException e) {
//            throw new RuntimeException(e);
//        }
    }
}