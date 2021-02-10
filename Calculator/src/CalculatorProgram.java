import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorProgram extends JFrame{
	JTextField t_f = new JTextField("");
	String str = "", str1 = "";
	static String result = "";
	static char oper = 'n';
	char op;
	Integer count_pm = 0;
	
	public CalculatorProgram(){
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white); 
		JPanel panel = new JPanel(new GridLayout(5, 4, 1, 1));
		
		JButton ac = new JButton("AC");
		ac.setBackground(Color.LIGHT_GRAY); ac.setForeground(Color.white);
		ac.setBorderPainted(false);
		ac.setFont(new Font("°íµñ", Font.BOLD, 20));
		ac.addMouseListener(new MyMouseAdapter()); 
		panel.add(ac);
		
		JButton p_m = new JButton("¡¾");
		p_m.setBackground(Color.LIGHT_GRAY); p_m.setForeground(Color.white);
		p_m.setBorderPainted(false);
		p_m.setFont(new Font("°íµñ", Font.BOLD, 20));
		p_m.addMouseListener(new MyMouseAdapter()); 
		panel.add(p_m);
		
		JButton perc = new JButton("%");
		perc.setBackground(Color.LIGHT_GRAY); perc.setForeground(Color.white);
		perc.setBorderPainted(false);
		perc.setFont(new Font("°íµñ", Font.BOLD, 20));
		perc.addMouseListener(new MyMouseAdapter()); 
		panel.add(perc);
		
		JButton divide = new JButton("¡À");
		divide.setBackground(Color.pink); divide.setForeground(Color.white);
		divide.setBorderPainted(false);
		divide.setFont(new Font("°íµñ", Font.BOLD, 20));
		divide.addMouseListener(new MyMouseAdapter()); 
		panel.add(divide);
		
		JButton seven = new JButton("7");
		seven.setBackground(Color.DARK_GRAY); seven.setForeground(Color.white);
		seven.setBorderPainted(false);
		seven.setFont(new Font("°íµñ", Font.BOLD, 20));
		seven.addMouseListener(new MyMouseAdapter()); 
		panel.add(seven);
		
		JButton eight = new JButton("8");
		eight.setBackground(Color.DARK_GRAY); eight.setForeground(Color.white);
		eight.setBorderPainted(false);
		eight.setFont(new Font("°íµñ", Font.BOLD, 20));
		eight.addMouseListener(new MyMouseAdapter()); 
		panel.add(eight);
		
		JButton nine = new JButton("9");
		nine.setBackground(Color.DARK_GRAY); nine.setForeground(Color.white);
		nine.setBorderPainted(false);
		nine.setFont(new Font("°íµñ", Font.BOLD, 20));
		nine.addMouseListener(new MyMouseAdapter()); 
		panel.add(nine);
		
		JButton multiply = new JButton("x");
		multiply.setBackground(Color.pink); multiply.setForeground(Color.white);
		multiply.setBorderPainted(false);
		multiply.setFont(new Font("°íµñ", Font.BOLD, 20));
		multiply.addMouseListener(new MyMouseAdapter()); 
		panel.add(multiply);
		
		JButton four = new JButton("4");
		four.setBackground(Color.DARK_GRAY); four.setForeground(Color.white);
		four.setBorderPainted(false);
		four.setFont(new Font("°íµñ", Font.BOLD, 20));
		four.addMouseListener(new MyMouseAdapter()); 
		panel.add(four);
		
		JButton five = new JButton("5");
		five.setBackground(Color.DARK_GRAY); five.setForeground(Color.white);
		five.setBorderPainted(false);
		five.setFont(new Font("°íµñ", Font.BOLD, 20));
		five.addMouseListener(new MyMouseAdapter()); 
		panel.add(five);
		
		JButton six = new JButton("6");
		six.setBackground(Color.DARK_GRAY); six.setForeground(Color.white);
		six.setBorderPainted(false);
		six.setFont(new Font("°íµñ", Font.BOLD, 20));
		six.addMouseListener(new MyMouseAdapter()); 
		panel.add(six);
		
		JButton minus = new JButton("-");
		minus.setBackground(Color.pink); minus.setForeground(Color.white);
		minus.setBorderPainted(false);
		minus.setFont(new Font("°íµñ", Font.BOLD, 20));
		minus.addMouseListener(new MyMouseAdapter()); 
		panel.add(minus);
		
		JButton one = new JButton("1");
		one.setBackground(Color.DARK_GRAY); one.setForeground(Color.white);
		one.setBorderPainted(false);
		one.setFont(new Font("°íµñ", Font.BOLD, 20));
		one.addMouseListener(new MyMouseAdapter()); 
		panel.add(one);
		
		JButton two = new JButton("2");
		two.setBackground(Color.DARK_GRAY); two.setForeground(Color.white);
		two.setBorderPainted(false);
		two.setFont(new Font("°íµñ", Font.BOLD, 20));
		two.addMouseListener(new MyMouseAdapter()); 
		panel.add(two);
		
		JButton three = new JButton("3");
		three.setBackground(Color.DARK_GRAY); three.setForeground(Color.white);
		three.setBorderPainted(false);
		three.setFont(new Font("°íµñ", Font.BOLD, 20));
		three.addMouseListener(new MyMouseAdapter()); 
		panel.add(three);
		
		JButton plus = new JButton("+");
		plus.setBackground(Color.pink); plus.setForeground(Color.white);
		plus.setBorderPainted(false);
		plus.setFont(new Font("°íµñ", Font.BOLD, 20));
		plus.addMouseListener(new MyMouseAdapter()); 
		panel.add(plus);
		
		JButton zero = new JButton("0");
		zero.setBackground(Color.DARK_GRAY); zero.setForeground(Color.white);
		zero.setBorderPainted(false);
		zero.setFont(new Font("°íµñ", Font.BOLD, 20));
		zero.addMouseListener(new MyMouseAdapter()); 
		panel.add(zero);
		
		JButton double_zero = new JButton("00");
		double_zero.setBackground(Color.DARK_GRAY); double_zero.setForeground(Color.white);
		double_zero.setBorderPainted(false);
		double_zero.setFont(new Font("°íµñ", Font.BOLD, 20));
		double_zero.addMouseListener(new MyMouseAdapter()); 
		panel.add(double_zero);
		
		JButton point = new JButton(".");
		point.setBackground(Color.DARK_GRAY); point.setForeground(Color.white);
		point.setBorderPainted(false);
		point.setFont(new Font("°íµñ", Font.BOLD, 20));
		point.addMouseListener(new MyMouseAdapter()); 
		panel.add(point);
		
		JButton equal = new JButton("=");
		equal.setBackground(Color.pink); equal.setForeground(Color.white);
		equal.setBorderPainted(false);
		equal.setFont(new Font("°íµñ", Font.BOLD, 20));
		equal.addMouseListener(new MyMouseAdapter()); 
		panel.add(equal);
		
		t_f.setBackground(Color.white); t_f.setForeground(Color.DARK_GRAY);
		t_f.setFont(new Font("°íµñ", Font.BOLD, 30));
		t_f.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		t_f.setHorizontalAlignment(JTextField.RIGHT);
		
		panel.setBackground(Color.white);
		panel.setSize(320, 320);
		panel.setLocation(5, 230);
		t_f.setSize(200, 30);
		t_f.setLocation(120, 190);
		c.add(panel);
		c.add(t_f);
		setSize(348, 600);
		setVisible(true);
	}
	public static String confirm(String s1, String s) {
		if (oper == '-') {
			result = Double.toString(Double.parseDouble(s1) - Double.parseDouble(s));
		}
		else if(oper == '+') {
			result =  Double.toString(Double.parseDouble(s1) + Double.parseDouble(s));
		}
		else if(oper == 'x') {
			result = Double.toString(Double.parseDouble(s1) * Double.parseDouble(s));
		}
		else {
			result = Double.toString(Double.parseDouble(s1) / Double.parseDouble(s));
		}
		
		if (Double.parseDouble(result) % 1 == 0) {
			result = Integer.toString((int)(Math.round(Double.parseDouble(result))));
		}
		return result;
	}
	class MyMouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			JButton but = (JButton)e.getSource();
			if (but.getText().equals("AC")){
				op = 'C';
			}
			else if (but.getText().equals("00")){
				op = '^';
			}
			else {
				op = but.getText().charAt(0);
			}
			switch (op) {
				case 'C':
					t_f.setText("");
					count_pm = 0; 
					oper = 'n';
					break;
				case '¡¾':
					count_pm += 1;
					if (count_pm % 2 == 0) {
						str = t_f.getText();	
						if (Double.parseDouble(str) % 1 == 0) {
							t_f.setText(String.valueOf((int)Math.abs(Double.valueOf(str))));
						}
						else 
							t_f.setText(String.valueOf(Math.abs(Double.valueOf(str))));
					}
					else {
						str = t_f.getText();
						t_f.setText("-" + str);
					}
					break;
				case '%':
					str = t_f.getText(); 
					if (Double.parseDouble(str) % 1 == 0) {
						str = String.valueOf(Integer.parseInt(str) * 0.01);}
					else {
						str = String.valueOf(Double.parseDouble(str) * 0.01);}
					t_f.setText(str); 
					break;
				case '+':
					str1 = t_f.getText();
					t_f.setText("");
					oper = '+';
					break;
				case '-':
					str1 = t_f.getText();
					t_f.setText("");
					oper = '-';
					break;
				case '¡À':
					str1 = t_f.getText();
					t_f.setText("");
					oper = '¡À';
					break;
				case 'x':
					str1 = t_f.getText();
					t_f.setText("");
					oper = 'x';
					break;
				case '=':
					result = confirm(str1, str);
					t_f.setText(result);
					oper = 'n';
					break;
				case '.':
					str = t_f.getText(); t_f.setText(str + "."); str = t_f.getText();
					break;
				case '0':
					str = t_f.getText(); t_f.setText(str + "0"); str = t_f.getText();
					break;
				case '^':
					str = t_f.getText(); t_f.setText(str + "00"); str = t_f.getText();
					break;
				case '1':
					str = t_f.getText(); t_f.setText(str + "1"); str = t_f.getText();
					break;
				case '2':
					str = t_f.getText(); t_f.setText(str + "2"); str = t_f.getText();
					break;
				case '3':
					str = t_f.getText(); t_f.setText(str + "3"); str = t_f.getText();
					break;
				case '4':
					str = t_f.getText(); t_f.setText(str + "4"); str = t_f.getText();
					break;
				case '5':
					str = t_f.getText(); t_f.setText(str + "5"); str = t_f.getText();
					break;
				case '6':
					str = t_f.getText(); t_f.setText(str + "6"); str = t_f.getText();
					break;
				case '7':
					str = t_f.getText(); t_f.setText(str + "7"); str = t_f.getText();
					break;
				case '8':
					str = t_f.getText(); t_f.setText(str + "8"); str = t_f.getText();
					break;
				case '9':
					str = t_f.getText(); t_f.setText(str + "9"); str = t_f.getText();
					break;
				default:
					break;
			}
		}
	}
	public static void main(String[] args) {
		new CalculatorProgram();
	}
}