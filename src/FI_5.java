import java.util.Scanner;

public class FI_5{

	public static void main(String[] args) {
		boolean p, q;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input p:");
		p = keyboard.nextBoolean();
		System.out.println("Input q:");
		q = keyboard.nextBoolean();
		
		if(p && q) {
			q = false;
		}else {
			if(!q) {
				System.out.println(p);
			}
			if(p == q) {
				System.out.println(p || q);
			}
		}
		
		System.out.println(q);
	}

}