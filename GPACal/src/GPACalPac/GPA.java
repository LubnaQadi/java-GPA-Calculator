package GPACalPac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GPA extends JFrame implements ActionListener{
	
	public static String username;
	public static String password;
	
	public static JFrame welcomeFrame=new JFrame("Welcome");

	public static JLabel welcomeLabel=new JLabel();
	public static JLabel calLabel=new JLabel(" To Calculate Your GPA Enter Start");
	public static JLabel gpaCalLabel=new JLabel();
	
	public static JLabel gradeLabel=new JLabel();
	
	public static JButton startButton=new JButton("Start");
	public static JButton gpaButton=new JButton("Calculate GPA");
	
	int sum;
	int totalHours;
	double gpa;
	String gpaString=gpa+"";
	
	public GPA(){
		
    welcomeFrame.setSize(400,400);
	welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	welcomeLabel.setFont(new Font("Arial", Font.PLAIN,25));
    calLabel.setFont(new Font("Arial", Font.PLAIN,18));
    startButton.setFont(new Font("Calibri", Font.BOLD,30));
    gpaCalLabel.setFont(new Font("Arial", Font.PLAIN,25));
    gpaButton.setFont(new Font("Calibri", Font.BOLD,30));
    gradeLabel.setFont(new Font("Calibri", Font.BOLD,30));

    welcomeLabel.setBounds(50,50, 300,50);
	calLabel.setBounds(50,110,300,50);
	gpaCalLabel.setBounds(50,110,300,50);
    startButton.setBounds(110,230,150,50);
	gpaButton.setBounds(90,230,200,50);
	gradeLabel.setBounds(130,170,150,50);
	
	calLabel.setBorder(BorderFactory.createLineBorder(Color.orange));
	gpaCalLabel.setBorder(BorderFactory.createLineBorder(Color.orange));
	welcomeLabel.setBorder(BorderFactory.createLineBorder(Color.orange)); 
	    
	gpaButton.setBorder(BorderFactory.createBevelBorder(1, Color.darkGray, Color.orange));
	gpaButton.setBackground(new Color(255,200,0));
	gpaButton.setForeground(Color.BLACK);
	
	startButton.setBorder(BorderFactory.createBevelBorder(1, Color.darkGray, Color.orange));
	startButton.setBackground(new Color(255,200,0));
	startButton.setForeground(Color.BLACK);
	
	
	welcomeFrame.add(welcomeLabel);
	welcomeFrame.add(calLabel);
	welcomeFrame.add(gpaCalLabel);
	welcomeFrame.add(startButton);
	welcomeFrame.add(gpaButton);
	welcomeFrame.add(gradeLabel);
	
	startButton.addActionListener(this);
    gpaButton.addActionListener(this);

	welcomeFrame.setLayout(null);
	welcomeFrame.setVisible(false);
  
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(startButton)){//if user click Start Welcome frame will close and showInputDialog will open
		welcomeFrame.setVisible(false);//Close Welcome Frame
		String noSub=JOptionPane.showInputDialog("Enter the # of Subjects");
		int number=Integer.parseInt(noSub);//Convert from string to integer

        totalHours=0;
        sum=0;
//JOptionPane with multiple inputs
        JTextField hours = new JTextField(3);
        JTextField mark  = new JTextField(3);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Number of Hours: "));
        myPanel.add(hours);
        myPanel.add(Box.createHorizontalStrut(15)); // A spacer
        myPanel.add(new JLabel("Mark: "));
        myPanel.add(mark);

        for(int i=0 ; i<number ; i++){
          int result = JOptionPane.showConfirmDialog(null, myPanel,
          "Please Enter Number of Hours and The Mark of subject no."+(i+1), JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {

          int hoursInt=Integer.parseInt(hours.getText());//Convert from string to integer
          totalHours=totalHours+hoursInt;//To calculate total hours
 
          int markInt=Integer.parseInt(mark.getText());//Convert from string to integer
	      sum=sum+(hoursInt * markInt);

        }//End if
        
           hours.setText("");
           mark.setText("");

	    }//End for loop
    
 //Calculate GPA
	       gpa=sum*1.0/totalHours;
	       String grade="";
	       if(gpa>=95 && gpa<=100) {
	    	   grade="Exceptional";
	       }else if(gpa>=90 && gpa<95) {
	    	   grade="Excellent";
	       }else if(gpa>=85 && gpa<90) {
	    	   grade="Superior";
	       }else if(gpa>=80 && gpa<85) {
	    	   grade="Very Good";
	       }else if(gpa>=75 && gpa<80) {
	    	   grade="Above Average";
	       }else if(gpa>=70 && gpa<75) {
	    	   grade="Good";
	       }else if(gpa>=65 && gpa<70) {
	    	   grade="High Pass";
	       }else if(gpa>=60 && gpa<65) {
	    	   grade="Pass";
	       }else if(gpa<60) {
	    	   grade="Fail";
	       }
	       
	       
	       welcomeFrame.setVisible(true);
	       gpaButton.setVisible(true);
	       gradeLabel.setText(grade);
	       

	      calLabel.setVisible(false);
	      gradeLabel.setVisible(false);
       	  startButton.setVisible(false);

	}//End if
		else if(e.getSource().equals(gpaButton)){//GPA Button

			gpaCalLabel.setText(" Your GPA is "+gpa+"%");
			gpaCalLabel.setVisible(true);
			gradeLabel.setVisible(true);

			}//End else if
	}//End actionPerformed method
}//End GPA Class

