package innlevering1;
import static javax.swing.JOptionPane.*;  
import static java.lang.Double.*;
import static java.lang.Integer.*;
public class karakter {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			int poeng = parseInt(showInputDialog("Poengsum:"));
			char karakter = ' ';
			if ((poeng>=90)&&(poeng<=100)) {
			karakter = 'A';
			showMessageDialog(null, "Du fikk karakter: " + karakter);
			}
			else if ((poeng>=80)&&(poeng<=89)) {
			karakter = 'B';
			showMessageDialog(null, "Du fikk karakter: " + karakter);
			}
			else if ((poeng>=60)&&(poeng<=79)) {
			karakter = 'C';
			showMessageDialog(null, "Du fikk karakter: " + karakter);
			}
			else if ((poeng>=50)&&(poeng<=59)) {
			karakter = 'D';
			showMessageDialog(null, "Du fikk karakter: " + karakter);
			}
			else if ((poeng>=40)&&(poeng<=49)) {
			karakter = 'E';
			showMessageDialog(null, "Du fikk karakter: " + karakter);
			}
			else if ((poeng>=0)&&(poeng<=39)) {
			karakter = 'F';
			showMessageDialog(null, "Du fikk karakter: " + karakter);
			}
			else if ((poeng>100)||(poeng<0)) {
			if (i>0) {
			i--;
			}
			showMessageDialog(null, "Skriv inn et tall mellom 0 og 100");
			}
			karakter = 0;
			}
	}
}

		
		
	
	