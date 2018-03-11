package com.divya.array;
import org.junit.Assert;

public class StringCount {

	public static void main(String[] args) {
		String lineString = "Divya  is Great. Divya Divya Divya";
		Assert.assertEquals(true, searchWordInString(lineString, "is"));
		Assert.assertEquals(false, searchWordInString(lineString, "is "));
		Assert.assertEquals(false, searchWordInString(lineString, "Div"));
		Assert.assertEquals(4, searchWordCountInString(lineString, "Divya"));
	}

	private static int searchWordCountInString(String lineString, String searchWord) {
		String[] newSplitString = lineString.split(" ");
		int increment = 0;
		String trimString = searchWord.trim();
		for (String string : newSplitString) {
			if (string.equals(trimString)) {
				increment++;
			}
		}
		return increment;
	}

	private static boolean searchWordInString(String lineString, String searchWord) {
		String[] newSplitString = lineString.split(" ");
		for (String string : newSplitString) {
			if (string.equals(searchWord)) {
				return true;
			}
		}
		return false;
	}

	private static void printString(String searchingString) {
		System.out.println("The String is " + searchingString);
	}

}
