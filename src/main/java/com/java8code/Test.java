package com.java8code;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class Test {
    public static void main(String[] args) {
        MessageWriter pdfWriter = (m) -> m+" WRITER";
        MessageWriter htmlWriter = (m) -> m+" WRITER";
        System.out.println(pdfWriter.write("PDF"));
        System.out.println(htmlWriter.write("HTML"));
        StringBuffer element = new StringBuffer("18283");
        String reverse = String.valueOf(element.reverse());
        System.out.println(reverse);


        LinkedList strings = new LinkedList<String>();
        Queue<String> stringsSet = new PriorityBlockingQueue<String>() ;
        strings.add("PK");
        strings.add("");
        strings.add("null");
        strings.addFirst("PK3");
        strings.addLast("PK123");
        System.out.println(strings);
        stringsSet.add("PK");
        stringsSet.add("PK1");
        stringsSet.add("PK2");
        stringsSet.add("PK3");
        System.out.println(stringsSet);


    }
}
