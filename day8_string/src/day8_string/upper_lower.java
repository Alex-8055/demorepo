package day8_string;
//wap to convert upper case to lower and visa versa
import java.util.*;
public class upper_lower {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String x = sc.nextLine();
		String y = "";
		for(int i=0 ; i<x.length() ; i++) {
			if(Character.isUpperCase(x.charAt(i))) {
				y += Character.toLowerCase(x.charAt(i));
			}else {
				y += Character.toUpperCase(x.charAt(i));
			}
		}
		System.out.println("your converted string is");
		System.out.println(y);
				

	}

}
