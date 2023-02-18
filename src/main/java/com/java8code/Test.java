package com.java8code;

public class Test {
    public static void main(String[] args) {
        MessageWriter pdfWriter = (m) -> m+" WRITER";
        MessageWriter htmlWriter = (m) -> m+" WRITER";
        System.out.println(pdfWriter.write("PDF"));
        System.out.println(htmlWriter.write("HTML"));
    }
}
