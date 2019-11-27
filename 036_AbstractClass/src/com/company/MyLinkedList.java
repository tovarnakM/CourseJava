package com.company;

public class MyLinkedList implements NodeList {

    private ListItems root = null;

    public MyLinkedList(ListItems root) {
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItems items) {

        if (this.root == null){
            this.root = items;
            return true;
        }
        ListItems currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(items);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(items).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(items).setPrevious(currentItem.previous());
                    items.setNext(currentItem).setPrevious(items);

                } else {
                    items.setNext(this.root).setPrevious(items);
                    this.root = items;
                }
                return false;
            } else {
                System.out.println("No added " + items.getValue());
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItems items) {
        return false;
    }

    @Override
    public void traverse(ListItems root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
