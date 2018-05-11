package unit_tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FileIO implements ActionListener {
	JFrame frame;
	JLabel label;
	JButton button1;
	JButton button2;
	JPanel panel;
	JTextArea area;

	void setup() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Save");
		button2 = new JButton("Load");
		area = new JTextArea(50, 50);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(area);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	public static void main(String[] args) {
		FileIO a = new FileIO();
		a.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			String name = JOptionPane.showInputDialog("Enter File Name");
			try {
				FileWriter write = new FileWriter(name);
				write.write(area.getText());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource().equals(button2)) {
			// finish something here
		}
	}
}
