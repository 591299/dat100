package innlevering1;
import static javax.swing.JOptionPane.*;  
import static java.lang.Double.*;
import static java.lang.Integer.*;
public class oppgave {

	public static void main(String[] args) {
		double inntekt = parseDouble(showInputDialog("Bruttoinntekt:"));
		double trinn1 = (inntekt-164100)*0.0093;
		double trinn2 = (inntekt-230950)*0.0241;
		double trinn3 = (inntekt-580650)*0.1152;
		double trinn4 = (inntekt-934050)*0.1452;
		double en = (230950-164100)*0.0093;
		double to = (580650-230950)*0.0241;
		double tre = (934050-580650)*0.1152;
		if (inntekt <= 164100) {
		showMessageDialog(null, "Din inntekt på " + inntekt + " gir ingen trinnskatt.");
		}
		else if ((inntekt>=164100)&&(inntekt<230950)) {
		showMessageDialog(null, "Din inntekt på " + inntekt + " kroner gir en trinnskatt på " + trinn1 + " kroner.");
		}
		else if ((inntekt>=230950)&&(inntekt<580650)) {
		showMessageDialog(null, "Din inntekt på " + inntekt + " kroner gir en trinnskatt på " + (trinn2 + en) + " kroner.");
		}
		else if ((inntekt>=580650)&&(inntekt<934050)) {
		showMessageDialog(null, "Din inntekt på " + inntekt + " kroner gir en trinnskatt på " + (trinn3 + en + to) + " kroner.");
		}
		else;
		{
		showMessageDialog(null, "Din inntekt på " + inntekt + " kroner gir en trinnskatt på " + (trinn4 + en + to + tre) + " kroner.");
		}


	}

}
