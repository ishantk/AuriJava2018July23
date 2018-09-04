package com.auribises;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUserGUI implements ActionListener{
	
	// Declare References to the UI Components
	Frame fr;
	Label lblTitle, lblName, lblEmail, lblPassword;
	TextField txtName, txtEmail, txtPassword;
	Button btnRegister, btnCancel;
	Panel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButtons, pnlAll;
	
	// Constructor will initialize all the references !!
	RegisterUserGUI(){
		
		// Create Objects of UI Components
		fr = new Frame("Register User");
		//fr.setTitle("Register User");
		
		lblTitle = new Label("Enter Your Details !!");
		
		lblName = new Label();
		lblName.setText("Enter Your Name");
		
		lblEmail = new Label("Enter Your Email");
		lblPassword = new Label("Enter Your Password");
		
		txtName = new TextField(16);
		txtEmail = new TextField(16);
		txtPassword = new TextField(16);
		
		btnRegister = new Button("Register");
		btnCancel = new Button();
		btnCancel.setLabel("Cancel");
		
		btnRegister.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pnlTitle = new Panel(); 
		pnlName = new Panel();  
		pnlEmail = new Panel();
		pnlPassword = new Panel();  
		pnlButtons = new Panel(); 
		pnlAll = new Panel(); 
		
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
