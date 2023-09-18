package hello;

import javax.swing.JFrame;

public class main {
   public static void main(String args[]) {
	   System.out.println("hello");
	   JFrame frame =new JFrame("hello");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setBounds(30, 30, 200, 200);
	   frame.setVisible(true);
   }
}
