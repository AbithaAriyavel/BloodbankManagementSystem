import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
class project1234 extends project123 implements ActionListener
{
public void cal2()
{
jf2=new JFrame();
jf2.getContentPane().setBackground(Color.PINK);
jf2.setVisible(true);
jf2.setLayout(null);
l16=new JLabel("SANGUINE BLOOD BANK");
l16.setBounds(400,100,900,60);
l16.setFont(f3);
l16.setBackground(Color.WHITE);
l16.setForeground(Color.BLACK);
l16.setOpaque(true);
jf2.add(l16);
l15=new JLabel("*Life savers*");
l15.setBounds(750,150,170,50);
l15.setFont(f4);
l15.setBackground(Color.WHITE);
l15.setForeground(Color.BLACK);
l15.setOpaque(true);
jf2.add(l15);
a1=new JTextArea();
a1.setBounds(0,300,1900,150);
a1.setFont(f2);
a1.setText("ABOUT US :"+"\n"+"\t"+"Medindia is a leading online provider of health information, applications and services for consumers, doctors, healthcare professionals globally."+"\n"+"Medindia, currently ranks #1 in India / South Asia in terms of traffic in the health category and among the top health sites in the world."+"\n"+"Medindia has been a pioneer in many ways and was one of the earliest health websites to be launched from India."+"\n"+"Medindia offers almost 1 million pages of trusted health and wellness.");
a1.setBackground(Color.PINK);
a1.setForeground(Color.BLACK);
jf2.add(a1);
a2=new JTextArea();
a2.setBounds(0,450,1900,150);
a2.setFont(f2);
a2.setText("Mission :"+"\n"+"\t"+"Medindia's mission is to empower consumers, doctors and healthcare professionals globally with authentic, accurate,"+"\n"+" timely and personalized health information and provide them tools to allow for better management of health, provide better care to patients,"+"\n"+" and lead healthier lives.");
a2.setBackground(Color.PINK);
a2.setForeground(Color.BLACK);
jf2.add(a2);
b9=new JButton("Back");
b9.setBounds(1380,700,200,80);
b9.setBackground(Color.RED);
b9.setForeground(Color.BLACK);
b9.setFont(f2);
jf2.add(b9);
b9.addActionListener(this);

b10=new JButton(new ImageIcon("b1.jpg"));
b10.setBounds(100,600,200,200);
b10.setBackground(Color.RED);
b10.setForeground(Color.BLACK);
b10.setFont(f2);
jf2.add(b10);

b11=new JButton(new ImageIcon("b2.jpg"));
b11.setBounds(400,600,200,200);
b11.setBackground(Color.RED);
b11.setForeground(Color.BLACK);
b11.setFont(f2);
jf2.add(b11);

b12=new JButton(new ImageIcon("b3.jpg"));
b12.setBounds(700,600,200,200);
b12.setBackground(Color.RED);
b12.setForeground(Color.BLACK);
b12.setFont(f2);
jf2.add(b12);


}


public void actionPerformed(ActionEvent e10)
{
if(e10.getSource()==b9)
{
jf2.setVisible(false);
project12 obj1=new project12();
obj1.cal();
}
}
}