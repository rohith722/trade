package trade;
import java.util.Scanner;
public class Demo4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter data");
	String data = sc.next();
	char ch;
	String newStr = "";
	for(int i=data.length()-1;i>=0;i--) {
		ch = data.charAt(i);
		newStr = newStr +ch;
		}
	System.out.println("data for keyboard ---->"+data);
	System.out.println("new Str ---->"+newStr);
	if(data.contentEquals(newStr) == true) {
		System.out.println("polydrome");
		
	}
	else {
		System.out.println("not polydrome");
	}
	sc.close();
	}

}
