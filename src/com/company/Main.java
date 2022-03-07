package com.company;

public class Main {

    public static void main(String[] args) {
        BinNode<Integer> tree = new BinNode<Integer>(
                new BinNode<Integer>(new BinNode<Integer>(5), 44, null), 12,
                new BinNode<Integer>(new BinNode<Integer>(2),
                        5, new BinNode<Integer>(29)));
    }
}
