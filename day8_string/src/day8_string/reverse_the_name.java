package day8_string;
//wap to reverse the name
import java.util.*;
public class reverse_the_name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String x = sc.nextLine();
		String y = "";
		for(int i=x.length()-1 ; i>=0 ; i--) {
			y += x.charAt(i);
		}
		System.out.println("the reverse name is");
		System.out.print(y);

	}

}
