package day8_string;
//wap to convert alternater character to lower and upper case
import java.util.*;
public class alternet_lower_and_upper {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your string");
		String x = sc.nextLine();
		String y = "";
		for(int i=0 ; i<x.length() ; i++) {
			if(i%2 == 0) {
				y += Character.toUpperCase(x.charAt(i));
			}else {
				y += Character.toLowerCase(x.charAt(i));
			}
			
		}
		System.out.println("your converted string is");
		System.out.println(y);
		

	}

}
