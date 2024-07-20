package com.test.stringproblem;

/*String Rotation Problem
 * 
given a string = "decode"
left rotation of string with 2 characters is = "codede"
right rotation of string with 2 characters is "dedeco"

To find if one string is rotation of another String by using a  solution- is to 
concatenate s1 with itself. s2 is a rotation of s1 if and only if it is a substring 
of the rotated string. In java we can either use string contains or indexOf to check
for substring.*/

public class StringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "code"; // deco 
		String toBeChecked = "deocde";
		int rotationCharacters = 2;
		System.out.println(checkForRotation(originalString, toBeChecked));
		System.out.println(leftRotate(originalString, rotationCharacters)); 
		System.out.println(rightRotate(originalString, rotationCharacters)); 
	}
	private static String rightRotate(String originalString, int rotationCharacters) {
		//decode  - // dedeco
		int partition = originalString.length() - rotationCharacters; //4
		String rotatedString = originalString.substring(partition) + originalString.substring(0, partition);
								//de									//deco
		return rotatedString;
	}

	private static String leftRotate(String originalString, int r) {

		//decode -  // codede
		String rotatedString = originalString.substring(r) + originalString.substring(0,r);
								//code							//de

		return rotatedString;
	}
	private static boolean checkForRotation(String originalString, String toBeChecked) {
		String concatenatedString = originalString + originalString;
		if(concatenatedString.contains(toBeChecked))
			return true;
		return false;

	}

}
