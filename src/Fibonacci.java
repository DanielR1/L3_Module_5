import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
	String n = JOptionPane.showInputDialog("How many numbers do you want?");
	int x = Integer.parseInt(n);
	int a=0;
	int b=1;
	if(x>0) {
		System.out.println("0");
	}
	if(x>1) {
		System.out.println("1");
	}
	for (int i = 0; i < x+1; i++) {
		
		if(a+b>0) {
			System.out.println(a+b);
			int temp1 = a;
			int temp2 = b;
			a=b;
			b=temp1+temp2;
			
		}
		
	}
}
}
