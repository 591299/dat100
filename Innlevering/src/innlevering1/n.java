package innlevering1;
import static javax.swing.JOptionPane.*;  
import static java.lang.Integer.*;
public class n {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog ("Heltall:"));
		int i = 1;
		int tall = 1;
		String svar = "Fakultet av " + n + " er ";
		if (n==0) {
		System.out.println(1);
		}
		else {
		for (i=1;i<=n;i++){
		tall*=i;
		}
		showMessageDialog(null,svar + tall); 
		}
	}
}


