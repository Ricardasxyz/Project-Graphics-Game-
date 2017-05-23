import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		Gameplay gameplay = new Gameplay();
		JFrame obj = new JFrame(); // pats rëmas
		
		
		obj.setBounds(10, 10, 700, 600); // rëmo parametrai
		obj.setTitle("Ball Game"); // pavadinimas þaidimo
		obj.setResizable(false); // tam, kad nesikeistø dydis
		obj.setVisible(true); // tam, kad matytøsi
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // aplikacijos uþdarymas

		obj.add(gameplay); // pridedam gameplay obj prie frame 
	}

}
