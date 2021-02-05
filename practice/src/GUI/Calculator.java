package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	class NorthP extends JPanel {
		public NorthP() {
			setBackground(Color.GRAY);
			setOpaque(true);
			add(new JLabel("수식입력"));
			add(new JTextField(20));
		}
	}

	class CenterP extends JPanel {
		public CenterP() {
			setLayout(new GridLayout(4, 5, 5, 5));
			for(int i = 0; i<10; i++) {
				JButton jb = new JButton(Integer.toString(i));
				add(jb);
			}
			add(new JButton("CE"));
			add(new JButton("계산"));
		}
	}

	class SouthP extends JPanel {
		public SouthP() {
			setBackground(Color.YELLOW);
			setOpaque(true);
			add(new JLabel("계산 결과"));
			add(new JTextField(20));
		}
	}
	public Calculator() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();

		c.add(new NorthP(), BorderLayout.NORTH);
		c.add(new CenterP(), BorderLayout.CENTER);
		c.add(new SouthP(), BorderLayout.SOUTH);

		

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}

}