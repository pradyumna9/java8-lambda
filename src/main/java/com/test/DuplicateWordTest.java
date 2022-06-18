package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordTest {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("([a-zA-Z0-9])\\1{2}");
        Matcher matcher = pattern.matcher("is Duplicate word Available".toUpperCase());
        System.out.println(matcher.find());

		List<String> wordList = Arrays.asList("SONY","TV","LTD","SONY");
		String testChar = "asdffffffasdf";
		int count = 0;
		char[] charArray = testChar.toCharArray();
		
		boolean duplicateWordAvail = wordList.stream().anyMatch(x->Collections.frequency(wordList, x)>2);
		System.out.println("Is Duplicate word Available:"+duplicateWordAvail);
		boolean isIdentical = isIdentical(testChar);
		System.out.println(isIdentical);
		
	}
	
	
	public static boolean isIdentical(String str)
    {
		String regex= "([a-z])\\\\1{3}";
        Pattern p = Pattern.compile(regex);
 
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
