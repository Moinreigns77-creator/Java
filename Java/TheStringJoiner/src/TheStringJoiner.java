import java.util.Scanner;

public class TheStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(joinStrings( scan.nextLine(),scan.nextLine()));
		

	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+" "+str2;
	}

}
