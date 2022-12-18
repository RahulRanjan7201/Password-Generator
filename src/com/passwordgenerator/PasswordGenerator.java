package com.passwordgenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.crypto.SecretKey;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PasswordGenerator implements ActionListener {
	JTextField field;
	JButton button;

	public PasswordGenerator() {
		// TODO Auto-generated constructor stub
		constructFrame();
	}

	public static void main(String[] args) {
		new PasswordGenerator();
	}

	public void constructFrame() {
		JFrame frame = new JFrame();
		field = new JTextField();
		button = new JButton("Generate Password");
		field.setEditable(false);
		field.setBounds(100, 100, 150, 20);
		button.setBounds(100, 130, 150, 40);
		button.addActionListener(this);
		frame.add(button);
		frame.add(field);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Generator generator = new Generator();
		try {
			SecretKey key = generator.genPass();
			field.setText((key.getEncoded().toString()));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
