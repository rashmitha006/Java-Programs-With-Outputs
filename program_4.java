//4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming in Blue color plain font with font size of 32 using Jframe and Jlabel
package Swings;
import java.awt.Color;
import java.awt.Font;
//A simple Swing application.
import javax.swing.*;
class SwingExample {
SwingExample () {
//Create a new JFrame container.
JFrame jfrm = new JFrame("A Simple Swing Application");
//jfrm.setFont("Serif",Font.BOLD,18);
//label = new JLabel("A label"); label.setFont(new Font("Serif", Font.PLAIN, 14));
//Give the frame an initial size.
jfrm.setSize(275, 100);
//Terminate the program when the user closes the application.
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Create a text-based label.
JLabel jlab = new JLabel(" Hello! VI C , Welcome to Swing Programming!");
// set properties for label
jlab.setFont(new Font("Verdana", Font.PLAIN,32));
jlab.setForeground(new Color(0,0,255));
//Add the label to the content pane.
jfrm.add(jlab);
//Display the frame.
jfrm.setVisible(true);
}
public static void main(String args[]) {
//Create the frame on the event dispatching thread.
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new SwingExample();
}
});
}
}
//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).

package Swings;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ButtonExample{
JLabel l1;
ButtonExample(){
JFrame f=new JFrame("Button Example");
l1=new JLabel();
l1.setBounds(50,50, 700,100);
l1.setFont(new Font("Lucida Calligraphy",Font.BOLD,60));
JButton b1=new JButton(" India ");
JButton b2=new JButton(" Srilanka ");

b1.setBounds(100,200,100, 100);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
l1.setText("India is pressed");
}
});
b2.setBounds(400,200,100, 100);
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
l1.setText("SriLanka is pressed");
}
});
f.add(b1);
f.add(b2);
f.add(l1);
f.setSize(300,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new ButtonExample();
}
}
