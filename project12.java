import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
class project12 extends project1 implements ActionListener
{
public void cal()
{
jf=new JFrame();
l12=new JLabel("SANGUINE BLOOD BANK");
l12.setBounds(400,100,900,60);
l12.setFont(f3);
l12.setBackground(Color.WHITE);
l12.setForeground(Color.BLACK);
l12.setOpaque(true);
jf.add(l12);
l13=new JLabel("*Life savers*");
l13.setBounds(750,150,170,50);
l13.setFont(f4);
l13.setBackground(Color.WHITE);
l13.setForeground(Color.BLACK);
l13.setOpaque(true);
jf.add(l13);
b1=new JButton("DONOR DETAILS");
b1.setBounds(600,400,300,70);
b1.setFont(f1);
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
jf.add(b1);
b2=new JButton("BILLING");
b2.setBounds(600,500,300,70);
b2.setFont(f1);
b2.setBackground(Color.BLUE);
b2.setForeground(Color.WHITE);
b2.addActionListener(this);
jf.add(b2);
b4=new JButton("ABOUT");
b4.setBounds(600,600,300,70);
b4.setFont(f1);
b4.addActionListener(this);
b4.setBackground(Color.BLUE);
b4.setForeground(Color.WHITE);
jf.add(b4);
JLabel bu1 = new JLabel(new ImageIcon("a6.jpg"));
jf.getContentPane().add(bu1);
jf.pack();      
jf.setVisible(true);
}
public void actionPerformed(ActionEvent e7)
{
if(e7.getSource()==b1)
{
jf.setVisible(false);
project12345 ob3= new project12345();
ob3.cal4();
}
if(e7.getSource()==b2)
{
jf.setVisible(false);
project123 ob1= new project123();
ob1.cal1();
}
if(e7.getSource()==b4)
{
jf.setVisible(false);
project1234 ob2= new project1234();
ob2.cal2();
}
}
}



