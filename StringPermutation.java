import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(permutate("bAc", "bca"));
	}
	
	public static int permutate(String string1, String string2) {
		// assuming both strings must have the same number of characters
        int size = string1.length();
        
        char[] arr1 = string1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = string2.toCharArray();
        Arrays.sort(arr2);
        string1 = new String(arr1);
        string2 = new String(arr2);
        
        for (int i = 0; i < size; i++){
        	if (string1.charAt(i) != string2.charAt(i)){
        		return 0;
        	}
        
        }
        return 1;
	}
}
