import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class project456 extends project45 implements ActionListener
{
public void fun()
{
jf2=new JFrame();
b3=new JButton("NEW DONOR");
b3.setBounds(600,300,200,60);
b3.setBackground(Color.BLACK);
b3.setForeground(Color.WHITE);
b3.setFont(f1);
b3.addActionListener(this);
jf2.add(b3);
b4=new JButton("SEARCH BLOOD");
b4.setBounds(600,400,200,60);
b4.setBackground(Color.BLACK);
b4.setForeground(Color.WHITE);
b4.setFont(f1);
b4.addActionListener(this);
jf2.add(b4);
//
JLabel bu1 = new JLabel(new ImageIcon("c2.jpg"));
jf2.getContentPane().add(bu1);
jf2.pack();      
jf2.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
try
{
if(e.getSource()==b3)
{
jf2.setVisible(false);
project4567 ob1= new project4567();
ob1.fun1();
}
}
catch (Exception e1)
{
System.out.println(e1);
}
if(e.getSource()==b4)
{
jf2.setVisible(false);
project45678 ob2=new project45678();
ob2.fun2();
}
}
}

