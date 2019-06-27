package com.example;

import com.google.common.base.Joiner;

public class Main {

    public static void main(String[] args) {
        Joiner joiner = Joiner.on(" ");
        System.out.println(joiner.join("Which process", "can I pipe some coffee from?"));
      System.out.print("Java Specification Version: ");
      System.out.println(System.getProperty("java.specification.version"));
      System.out.print("java Runtime Environment (JRE) version: ");
      System.out.println(System.getProperty("java.version"));
    }
}
