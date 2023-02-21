package day8_string;
//wap to extract digit and characters sepratly
import java.util.*;
public class digit_and_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your string");
		String x = sc.nextLine();
		String y = "";
		String z = "";
		for(int i=0 ; i<x.length() ; i++) {
			if(Character.isDigit(x.charAt(i))) {
				y += x.charAt(i);
			}else {
				z += x.charAt(i);
			}
		}
		System.out.println("digits and characters are seprated from ur string");
		System.out.println(y);
		System.out.println(z);

	}

}
