package taschenrechner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class App extends JFrame implements ActionListener {
	private final JButton button;
	private final JTextField textField1;
	private final JTextField textField2;
	
	private final JTextField sumField;
	private final JTextField prodField;
	
	public App() {
		super();
		
		this.button = new JButton();
		this.button.addActionListener(this);
		this.button.setText("Calculate");
		
		this.textField1 = new JTextField();
		this.textField1.setColumns(10);
		
		this.textField2 = new JTextField();
		this.textField2.setColumns(10);
		
		this.sumField = new JTextField();
		this.sumField.setColumns(10);
		
		this.prodField = new JTextField();
		this.prodField.setColumns(10);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		add(this.textField1);
		add(this.textField2);
		add(this.button);
		add(this.sumField);
		add(this.prodField);
		
		
		pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int sum;
		int product;
		
		
		
		sum = Integer.parseInt(this.textField1.getText()) + Integer.parseInt(this.textField2.getText());
		product = Integer.parseInt(this.textField1.getText()) * Integer.parseInt(this.textField2.getText());
		
		this.sumField.setText(""+sum);
		this.prodField.setText(""+product);
	}

	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		App app = new App();
		app.setLocationRelativeTo(null);
		app.setVisible(true);
	}
	
}
