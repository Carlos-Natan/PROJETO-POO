import javax.swing.JOptionPane;

public class P {
    public static void main(String[] args) {
        
        System.out.println("\033[30;47mAFHKJ\033[0m");


        double N1 = Double.parseDouble(JOptionPane.showInputDialog ("INFORME A PRIMEIRA NOTA: "));
        double N2 = Double.parseDouble (JOptionPane.showInputDialog("INFORME A SEGUNDA NOTA: "));
        double M1 = (N1 + N2) / 2;


        double N3 = Double.parseDouble(JOptionPane.showInputDialog ("INFORME A TERCEIRA NOTA: "));
        double N4 = Double.parseDouble (JOptionPane.showInputDialog("INFORME A QUARTA NOTA: "));
        double M2 = (N3 + N4) / 2;
        double MF = (M1 + M2) / 2;

        JOptionPane.showMessageDialog(null, "PRIMEIRA NOTA: " + N1 + "\nSEGUNDA NOTA: " + N2 + "\nTERCEIRA NOTA: " + N3+ "\nQUARTA NOTA: " + N4 + "\n_____________________________\nM1: "+ M1 + "\nM2: " + M2 +"\n____________________________\nMEDIA FINAL: " + MF, "INFORMAÇÕES", JOptionPane.INFORMATION_MESSAGE);
		
	}
}

