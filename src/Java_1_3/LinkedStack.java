package Java_1_3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack<Item> implements Iterable<Item> {
    private Node first;
    private int N ;
    private class Node {
        Item item;
        Node next;
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public boolean isEmpyt() {return N == 0;}
    public int size () {return N;}
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }


}
