package GPACalPac;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.synth.SynthButtonUI;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class User extends JFrame implements ActionListener{
	public static String username;
	public static String password;
	
	public static JFrame loginFrame=new JFrame("Login");
	public static JButton loginButton=new JButton("Login");

	public static JLabel userLabel=new JLabel(" Username");
	public static JLabel passLabel=new JLabel(" Password");

	public static JTextField userText;//Username
	public static JPasswordField passText = new JPasswordField();//Password
	
	public static JLabel calLabel=new JLabel("To Calculate Your GPA Enter Start");

	int sum;
	int totalHours;
	double gpa;
	String gpaString=gpa+"";
	
	public static GPA gpaClass=new GPA();
	
	public User(){
		
		loginFrame.setSize(400,400);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	    userText=new JTextField(20);
	    userText.setFont(new Font("Arial", Font.PLAIN,18));

	    userLabel.setFont(new Font("Arial", Font.BOLD,15));
	    passLabel.setFont(new Font("Arial", Font.BOLD,15));
	    loginButton.setFont(new Font("Calibri", Font.BOLD,30));

	    userLabel.setBounds(30,50, 200,30);
	    userText.setBounds(120,50, 200,30);
	    passLabel.setBounds(30,100, 200,30);
	    passText.setBounds(120,100,200,30);
	    loginButton.setBounds(90,200,200,60);
	
	    userLabel.setBorder(BorderFactory.createLineBorder(Color.orange));
	    passLabel.setBorder(BorderFactory.createLineBorder(Color.orange));
	    
	    userText.setBorder(BorderFactory.createLineBorder(Color.orange));
	    passText.setBorder(BorderFactory.createLineBorder(Color.orange));
	    
	    loginButton.setBorder(BorderFactory.createBevelBorder(1, Color.darkGray, Color.orange));
	    loginButton.setBackground(new Color(255,200,0));
	    loginButton.setForeground(Color.BLACK);
	    
	    loginFrame.add(userText);
	    loginFrame.add(passText);
	    loginFrame.add(userLabel);
	    loginFrame.add(passLabel);
	    loginFrame.add(loginButton);
	    

	   loginButton.addActionListener(this);

	    loginFrame.setLayout(null);
	    loginFrame.setVisible(true);
	} 
	    //End of Login Frame

	 
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(loginButton)){//Login Button
	
			username = userText.getText();//To read username
			password = passText.getText();//To read password
			
				switch(username){
								
			case "Osama": 	
				switch(password) {
			
			case "osama123": 
			// If user enter right username and
			//password system will print Welcome back
			//if username and password are correct

		    loginFrame.setVisible(false);//Close Login Frame
		    gpaClass.gpaCalLabel.setVisible(false);
		    gpaClass.gpaButton.setVisible(false);
		    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
		    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
		   
			break;
			default: 	
				if(!password.equals("osama123")) 
				{
				// If user enter wrong password and 
				//right username system will print Wrong password 
		
	JOptionPane.showMessageDialog(null,"Wrong username or password :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
				userText.setText("");
				passText.setText("");

			}//End if
				else if(password.equals("osama123")) {
				    loginFrame.setVisible(false);//Close Login Frame
				    gpaClass.gpaCalLabel.setVisible(false);
				    gpaClass.gpaButton.setVisible(false);
				    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
				    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
			    
			}//End else if
				}//End switch
				break;
			case "Amal": 
				switch(password) {
				
				case "amal123": 
					    loginFrame.setVisible(false);//Close Login Frame
					    gpaClass.gpaCalLabel.setVisible(false);
					    gpaClass.gpaButton.setVisible(false);
					    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
					    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
					
					break;
				default: 
				if(!password.equals("amal123")) {
			
	JOptionPane.showMessageDialog(null,"Wrong username or password :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
					userText.setText("");
					passText.setText("");

				}//End if
				else if(password.equals("amal123")) {
					 loginFrame.setVisible(false);//Close Login Frame
					    gpaClass.gpaCalLabel.setVisible(false);
					    gpaClass.gpaButton.setVisible(false);
					    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
					    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				}//End else if
				
			}//End switch
			break;
			case "Mahmoud": 
				switch(password) {
				
				case "mahmoud123": 
					
					 loginFrame.setVisible(false);//Close Login Frame
					    gpaClass.gpaCalLabel.setVisible(false);
					    gpaClass.gpaButton.setVisible(false);
					    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
					    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
			    
				break;
				default: if(!password.equals("mahmoud123")) {
					
	JOptionPane.showMessageDialog(null,"Wrong username or password :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
					userText.setText("");
					passText.setText("");

				}//End if
				else if(password.equals("mahmoud123")){
				 loginFrame.setVisible(false);//Close Login Frame
				    gpaClass.gpaCalLabel.setVisible(false);
				    gpaClass.gpaButton.setVisible(false);
				    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
				    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
			}//End else if
				}//End switch
			break;
			case "Raneen": 
				switch(password) {
				
				case "raneen123": 
								
					 loginFrame.setVisible(false);//Close Login Frame
					    gpaClass.gpaCalLabel.setVisible(false);
					    gpaClass.gpaButton.setVisible(false);
					    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
					    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				    
					break;
				default: if(!password.equals("raneen123")) {
					
	JOptionPane.showMessageDialog(null,"Wrong username or password :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
					userText.setText("");
					passText.setText("");

				}//End if
				else if(password.equals("raneen123")){
				 loginFrame.setVisible(false);//Close Login Frame
				    gpaClass.gpaCalLabel.setVisible(false);
				    gpaClass.gpaButton.setVisible(false);
				    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
				    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				}//End else if
			}//End switch
			break;
			case "Mai": 
				switch(password) {
				
				case "mai123": 
				
					 loginFrame.setVisible(false);//Close Login Frame
					    gpaClass.gpaCalLabel.setVisible(false);
					    gpaClass.gpaButton.setVisible(false);
					    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
					    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
			    
				break;
				default: if(!password.equals("mai123")) {
					
	JOptionPane.showMessageDialog(null,"Wrong username or password :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
					userText.setText("");
					passText.setText("");

				}//End if
				else if(password.equals("mai123")){
				 loginFrame.setVisible(false);//Close Login Frame
				    gpaClass.gpaCalLabel.setVisible(false);
				    gpaClass.gpaButton.setVisible(false);
				    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
				    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				}//End else if
				}//End switch 
			break;
			case "Loay": 
				switch(password) {
				
				case "loay123":
					
					 loginFrame.setVisible(false);//Close Login Frame
					    gpaClass.gpaCalLabel.setVisible(false);
					    gpaClass.gpaButton.setVisible(false);
					    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
					    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				    
				break;
				default: if(!password.equals("loay123")) {
										
	JOptionPane.showMessageDialog(null,"Wrong username or password :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
					userText.setText("");
					passText.setText("");

				}//End if
				else if(password.equals("loay123")){
			   	 loginFrame.setVisible(false);//Close Login Frame
				    gpaClass.gpaCalLabel.setVisible(false);
				    gpaClass.gpaButton.setVisible(false);
				    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
				    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				}//End else if
				
			}//End switch
			break;
			case "Hamza": 
				switch(password) {
				
				case "hamza123": 
					
					 loginFrame.setVisible(false);//Close Login Frame
					    gpaClass.gpaCalLabel.setVisible(false);
					    gpaClass.gpaButton.setVisible(false);
					    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
					    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				    
				break;
				default: if(!password.equals("hamza123")) {
										
	JOptionPane.showMessageDialog(null,"Wrong username or password :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
					userText.setText("");
					passText.setText("");

				}//End if
				else if(password.equals("hamza123")){
				 loginFrame.setVisible(false);//Close Login Frame
				    gpaClass.gpaCalLabel.setVisible(false);
				    gpaClass.gpaButton.setVisible(false);
				    gpaClass.welcomeLabel.setText(" Welcome Back "+username+" :)");
				    gpaClass.welcomeFrame.setVisible(true);//Open Welcome Frame
				}//End else if
			}//End switch
			break;
					
			default:
			{
	JOptionPane.showMessageDialog(null,"User Not Found :(, try again","This is an ERROR msg",JOptionPane.ERROR_MESSAGE);
				userText.setText("");
				passText.setText("");

			}
			// If user enter wrong username
			//system will print wrong username or password 
				}
		}
	}
	    
}

