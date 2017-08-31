
/**
	 * 3 Implement a method to perform basic string compression using the counts of repeated characters.
	 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not
	 * become smaller than the original string, your method should return the original string.
	 * The method signature is: “public static String compress(String input)” You must write all code
	 * in proper Java, and please include import statements for any libraries you use.
	 */

public class CompressedString {

	public static void main(String[] args) {
		String originalString = "aabcccccaaa";
		System.out.println(compress(originalString));
	}
	
	public static String compress(String input){
		String mCompressedString = "";
		
		int originalSize = input.length();
		int c = 1;		// counter
		
		for (int i = 0; i < originalSize; i++){
			char currentChar = input.charAt(i);	// extracts left character
			char nextChar = 0;
			
			// this helps to see if loop has reached the last element
			// of the string. This avoids array out of index error
			if ((i + 1) < originalSize){
				nextChar = input.charAt(i + 1);	// extracts right character
			}
			
			// compares if left and right character are equal
			if (currentChar == nextChar){
				c++;		// character counter
			} else {
				mCompressedString += currentChar + String.valueOf(c);
				c = 1;		// restart the count to 1
			}
		}
		
		// compare the size to decide and return the smaller string
		if (mCompressedString.length() >= originalSize){
			return input;
		} else {
			return mCompressedString; 
		}
	}
}
