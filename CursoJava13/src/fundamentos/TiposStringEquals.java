package fundamentos;
import java.util.Scanner;

public class TiposStringEquals {
	public static void main(String[] args) {
		
		 String s1 = new String("2");
		 System.out.println("2"== s1);
		 System.out.println("2".equals(s1));
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 String s2 = entrada.next();
		 System.out.println("2"== s2.trim());
		 System.out.println("2".equals(s2.trim()));
		 
		 
		 entrada.close();
		 
		 System.out.println(args);
		 
	}
	 
}
