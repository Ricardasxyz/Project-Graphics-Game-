import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		Gameplay gameplay = new Gameplay();
		JFrame obj = new JFrame(); // pats r�mas
		
		
		obj.setBounds(10, 10, 700, 600); // r�mo parametrai
		obj.setTitle("Ball Game"); // pavadinimas �aidimo
		obj.setResizable(false); // tam, kad nesikeist� dydis
		obj.setVisible(true); // tam, kad matyt�si
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // aplikacijos u�darymas

		obj.add(gameplay); // pridedam gameplay obj prie frame 
	}

}
