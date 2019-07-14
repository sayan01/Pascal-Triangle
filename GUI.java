import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Label lblInput;
	private TextField tfInput;
	private JTextArea taOutput;
	public GUI(){
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("Pascal's Triangle");
		setSize (500,500);
		lblInput = new Label ( "Enter Height: ",Label.CENTER);
		tfInput = new TextField ("5",50);
		tfInput.addActionListener(this);
		taOutput = new JTextArea("Triangle appears here ",5, 20);
		taOutput.setEditable(false);
		add(lblInput);
		add(tfInput);
		add(taOutput);
		setVisible(true);
	}
	public static void main(String[] args){
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		int h = Integer.parseInt(tfInput.getText());
		String s = Choose.drawPascTr(h);
		tfInput.setText("");
		taOutput.setText(s);
	}
}
