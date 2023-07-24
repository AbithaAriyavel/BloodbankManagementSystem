import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
class project45 extends project4 implements ActionListener
{
public void cal()
{
jf=new JFrame();
l18=new JLabel("SANGUINE BLOOD BANK");
l18.setBounds(400,100,900,60);
l18.setFont(f2);
l18.setBackground(Color.WHITE);
l18.setForeground(Color.BLACK);
l18.setOpaque(true);
jf.add(l18);
l19=new JLabel("*Life savers*");
l19.setBounds(750,150,170,50);
l19.setFont(f3);
l19.setBackground(Color.WHITE);
l19.setForeground(Color.BLACK);
l19.setOpaque(true);
jf.add(l19);
l1=new JLabel("USER ID");
l1.setBounds(500,300,200,40);
l1.setFont(f1);
l1.setBackground(Color.RED);
l1.setForeground(Color.WHITE);
l1.setOpaque(true);
jf.add(l1);
t1=new JTextField();
t1.setBounds(850,300,200,40);
t1.setFont(f1);
t1.setBackground(Color.BLUE);
t1.setForeground(Color.WHITE);
jf.add(t1);
l2=new JLabel("PASSWORD");
l2.setBounds(500,400,200,40);
l2.setFont(f1);
l2.setBackground(Color.RED);
l2.setForeground(Color.WHITE);
l2.setOpaque(true);
jf.add(l2);
pf=new JPasswordField();
pf.setBounds(850,400,200,40);
pf.setFont(f1);
pf.setBackground(Color.BLACK);
pf.setForeground(Color.WHITE);
jf.add(pf);
b1=new JButton("LOGIN");
b1.setBounds(550,500,150,60);
b1.setBackground(Color.BLUE);
b1.setForeground(Color.WHITE);
b1.setFont(f1);
b1.addActionListener(this);
jf.add(b1);
b2=new JButton("CREATE");
b2.setBounds(800,500,150,60);
b2.setBackground(Color.BLUE);
b2.setForeground(Color.WHITE);
b2.setFont(f1);
b2.addActionListener(this);
jf.add(b2); 
JLabel bu = new JLabel(new ImageIcon("c12.jpg"));
jf.getContentPane().add(bu);
jf.pack();      
jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
a=t1.getText();
b=pf.getText();
try
{
if(e.getSource()==b1)
{
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/BLOODBANK","root","Malathi@123");  
st=con.createStatement();
rs=st.executeQuery("select * from blood");
while(rs.next())
{
c=rs.getString("UserId");
d=rs.getString("Password");
if((c.equals(a))&&(d.equals(b)))
{
t=1;
jf.setVisible(false);
project456 ob=new project456();
ob.fun();
}
}
if(t!=1)
	{
	if((a.equals(" "))||(b.equals(" ")))
	{
	JOptionPane.showMessageDialog(jf,"fill the box","Warning",JOptionPane.WARNING_MESSAGE);
	}
	if((!a.equals(c))&&(!b.equals(d)))
	{
	JOptionPane.showMessageDialog(jf,"Create Your Accont!","Warning",JOptionPane.WARNING_MESSAGE);
	}
}
}
}
catch(Exception e1)
{
System.out.println(e1);
}
try
{
if(e.getSource()==b2)
{
if((!a.equals(" "))||(!b.equals(" ")))
{
ps=con.prepareStatement("insert into blood(UserId,Password)values(?,?)");
ps.setString(1,a);
ps.setString(2,b);
int x=ps.executeUpdate();
if(x>0)
{
JOptionPane.showMessageDialog(jf,"account created","Warning",JOptionPane.WARNING_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(jf,"account is not created","Warning",JOptionPane.WARNING_MESSAGE);
}
}
}
}
catch(Exception e2)
{
System.out.println(e2);
}
}
}

