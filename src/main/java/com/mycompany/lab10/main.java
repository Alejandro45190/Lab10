package com.mycompany.lab10;

public class main {
    public static void main(String[] args) {
        PostfixNotation pfn = new PostfixNotation("821/-");
        System.out.println(pfn.evalPostfix());
    }
}
