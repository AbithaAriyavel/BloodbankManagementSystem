import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
public class project12345 extends project1234
{
public void cal4()
{
jf3=new JFrame();

l7=new JLabel("DONOR ID");
l7.setBounds(300,300,200,30);
l7.setBackground(Color.RED);
l7.setForeground(Color.BLACK);
l7.setOpaque(true);
l7.setFont(f1);
jf3.add(l7);
t6=new JTextField();
t6.setBounds(550,300,200,30);
t6.setFont(f1);
t6.setBackground(Color.BLACK);
t6.setForeground(Color.WHITE);
jf3.add(t6);
l8=new JLabel("NAME");
l8.setBounds(300,450,200,30);
l8.setBackground(Color.RED);
l8.setForeground(Color.BLACK);
l8.setOpaque(true);
l8.setFont(f1);
jf3.add(l8);
t7=new JTextField();
t7.setBounds(550,450,200,30);
t7.setFont(f1);
t7.setBackground(Color.BLACK);
t7.setForeground(Color.WHITE);
jf3.add(t7);
l9=new JLabel("GENDER");
l9.setBounds(300,500,200,30);
l9.setBackground(Color.RED);
l9.setForeground(Color.BLACK);
l9.setOpaque(true);
l9.setFont(f1);
jf3.add(l9);
t8=new JTextField();
t8.setBounds(550,500,200,30);
t8.setFont(f1);
t8.setBackground(Color.BLACK);
t8.setForeground(Color.WHITE);
jf3.add(t8);
l10=new JLabel("MOBILE NUMBER");
l10.setBounds(300,550,200,30);
l10.setBackground(Color.RED);
l10.setForeground(Color.BLACK);
l10.setOpaque(true);
l10.setFont(f1);
jf3.add(l10);
t9=new JTextField();
t9.setBounds(550,550,200,30);
t9.setFont(f1);
t9.setBackground(Color.BLACK);
t9.setForeground(Color.WHITE);
jf3.add(t9);
l11=new JLabel("BLOOD GROUP");
l11.setBounds(300,600,200,30);
l11.setBackground(Color.RED);
l11.setForeground(Color.BLACK);
l11.setOpaque(true);
l11.setFont(f1);
jf3.add(l11);
t10=new JTextField();
t10.setBounds(550,600,200,30);
t10.setFont(f1);
t10.setBackground(Color.BLACK);
t10.setForeground(Color.WHITE);
jf3.add(t10);
b12=new JButton("SUBMIT");
b12.setBounds(425,350,150,50);
b12.setBackground(Color.BLUE);
b12.setForeground(Color.WHITE);
b12.addActionListener(this);
b12.setFont(f1);
jf3.add(b12);
b13=new JButton("<-Back");
b13.setBounds(425,700,150,60);
b13.setBackground(Color.BLUE);
b13.setForeground(Color.WHITE);
b13.addActionListener(this);
b13.setFont(f1);
jf3.add(b13);

JLabel bu9 = new JLabel(new ImageIcon("c5.jpg"));
jf3.getContentPane().add(bu9);
jf3.pack();      
jf3.setVisible(true);
}
public void actionPerformed(ActionEvent e21)
{
try
{
m1=Integer.parseInt(t6.getText());
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/BLOODBANK","root","Malathi@123");
st=con.createStatement();
if(e21.getSource()==b12)
{
String sql = "SELECT Name,Gender,Mobilenumber,Bloodgroup FROM  donordetails WHERE DonorId =?";
       ps=con.prepareStatement(sql);
        ps.setString(1,t6.getText());
rs=ps.executeQuery();
if(rs.next())
{
t7.setText(rs.getString("Name"));
t8.setText(rs.getString("Gender"));
t9.setText(Integer.toString(rs.getInt("Mobilenumber")));
t10.setText(rs.getString("Bloodgroup"));
}
}
}
catch(Exception e67)
{
System.out.println(e67);
}
if(e21.getSource()==b13)
{
jf3.setVisible(false);
project12 t9=new project12();
t9.cal();
}
}
public static void main(String args[])
{
project12 t=new project12();
t.cal();
}
}