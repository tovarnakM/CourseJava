package com.company;

public interface NodeList {
    ListItems getRoot();
    boolean addItem(ListItems items);
    boolean removeItem(ListItems items);
    void traverse(ListItems root);
}
