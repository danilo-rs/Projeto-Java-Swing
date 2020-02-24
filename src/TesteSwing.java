import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TesteSwing {

	public static void main(String[] args) {
//Criando a janela e o titulo
		JFrame frame = new JFrame ("UTD - Java com Banco de Dados");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
//Craindo o painel
		JPanel panel = new JPanel ();
//Criando o label
		JLabel rotulo = new JLabel ();
		rotulo.setText ("Nome: ");
		panel.add (rotulo);
//Criando o texto p/ digitar
		JTextField textField = new JTextField (40);
		panel.add (textField);
		frame.setContentPane (panel);
		frame.pack ();
		frame.setVisible (true);
	}
}
