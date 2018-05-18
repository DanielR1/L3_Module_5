package unit_tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
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
	JFileChooser choose;

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
				write.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource().equals(button2)) {
			String total;
			// finish something here
			choose = new JFileChooser();
			choose.showOpenDialog(frame);
			File chosen = choose.getSelectedFile();
			BufferedReader read;
			try {
				read = new BufferedReader(new FileReader(chosen));
				 total="";
				 String line = read.readLine();
				 while(line!=null) {
					 total+=line+"\n";
					 
					 line=read.readLine();
				 }
				 area.setText(total);
					}
			 catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
}
