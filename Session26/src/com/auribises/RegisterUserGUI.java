package com.auribises;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterUserGUI implements ActionListener{
	
	// Declare References to the UI Components
	/*Frame fr;
	Label lblTitle, lblName, lblEmail, lblPassword;
	TextField txtName, txtEmail, txtPassword;
	Button btnRegister, btnCancel;
	Panel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButtons, pnlAll;*/
	
	JFrame fr;
	JLabel lblTitle, lblName, lblEmail, lblPassword;
	JTextField txtName, txtEmail, txtPassword;
	JButton btnRegister, btnCancel;
	//JPasswordField pField;
	JPanel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButtons, pnlAll;
	
	// Constructor will initialize all the references !!
	RegisterUserGUI(){
		
		// Create Objects of UI Components
		fr = new JFrame("Register User");
		//fr.setTitle("Register User");
		
		lblTitle = new JLabel("Enter Your Details !!");
		
		lblName = new JLabel();
		lblName.setText("Enter Your Name");
		
		lblEmail = new JLabel("Enter Your Email");
		lblPassword = new JLabel("Enter Your Password");
		
		txtName = new JTextField(16);
		txtEmail = new JTextField(16);
		txtPassword = new JTextField(16);
		
		btnRegister = new JButton("Register");
		btnCancel = new JButton("Cancel");
		//btnCancel.setLabel("Cancel");
		
		btnRegister.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pnlTitle = new JPanel(); 
		pnlName = new JPanel();  
		pnlEmail = new JPanel();
		pnlPassword = new JPanel();  
		pnlButtons = new JPanel(); 
		pnlAll = new JPanel(); 
		
	}
	
	// Add the Components into Containers
	void showGUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlPassword.add(lblPassword);
		pnlPassword.add(txtPassword);
		
		pnlButtons.add(btnRegister);
		pnlButtons.add(btnCancel);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlPassword);
		pnlAll.add(pnlButtons);
		
		GridLayout gridLayout = new GridLayout(5, 1);
		pnlAll.setLayout(gridLayout);
		
		fr.add(pnlAll);
		
		// Show the Frame with a size
		//fr.setSize(400, 300);
		fr.pack();
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnRegister){
			System.out.println("Button Register Clicked...");
			
			String name = txtName.getText();
			String email = txtEmail.getText();
			String password = txtPassword.getText();
			
			//int i = Integer.parseInt(str);
					
			System.out.println("Name: "+name+" Email: "+email+" Password: "+password);
		}else{
			System.out.println("Button Cancel Clicked...");
			fr.dispose();
		}
		
		
	}
	
	//Assignment : Click of Button -> Start a Thread -> Thread will perform Serialization

}
