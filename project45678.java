import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class project45678 extends project4567 implements ActionListener
{
public void fun2()
{
jf4=new JFrame();
l16=new JLabel("BLOOD TYPE");
l16.setBounds(500,300,150,30);
l16.setBackground(Color.WHITE);
l16.setForeground(Color.BLACK);
l16.setOpaque(true);
l16.setFont(f1);
jf4.add(l16);
c5=new JComboBox();
c5.addItem("A+");
c5.addItem("B+");
c5.addItem("O+");
c5.addItem("AB+");
c5.addItem("B-");
c5.addItem("A-");
c5.addItem("O-");
c5.addItem("AB-");
c5.setFont(f1);
c5.setBounds(750,300,50,30);
c5.setBackground(Color.YELLOW);
c5.setForeground(Color.BLACK);
jf4.add(c5);
b9=new JButton("SUBMIT");
b9.setBounds(600,350,150,30);
b9.setBackground(Color.BLUE);
b9.setForeground(Color.WHITE);
b9.addActionListener(this);
b9.setFont(f1);
jf4.add(b9);
l17=new JLabel("NO.OF PACKETS AVAILABLE");
l17.setBounds(500,450,400,30);
l17.setBackground(Color.WHITE);
l17.setForeground(Color.BLACK);
l17.setOpaque(true);
l17.setFont(f1);
jf4.add(l17);
t13=new JTextField();
t13.setBounds(650,500,50,30);
t13.setFont(f1);
t13.setBackground(Color.BLACK);
t13.setForeground(Color.WHITE);
jf4.add(t13);
b10=new JButton("<-Back");
b10.setBounds(600,700,150,60);
b10.setBackground(Color.BLUE);
b10.setForeground(Color.WHITE);
b10.addActionListener(this);
b10.setFont(f1);
jf4.add(b10);
JLabel bu7 = new JLabel(new ImageIcon("blood2.jpg"));
jf4.getContentPane().add(bu7);
jf4.pack();      
jf4.setVisible(true);
}
public void actionPerformed(ActionEvent e5)
{
try
{
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/BLOODBANK","root","Malathi@123");  
st=con.createStatement();
if (e5.getSource()==b9)
{
fh=(String)c5.getSelectedItem();
System.out.println(fh);
if (fh.equals("A+"))
{
rs=st.executeQuery("select Ap from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("Ap");
t13.setText(Integer.toString(g1));
}
}
if (fh.equals("B+"))
{
rs=st.executeQuery("select Bp from Bloodtypes");
while (rs.next())
{
g2=rs.getInt("Bp");
t13.setText(Integer.toString(g2));
}
}
 if (fh.equals("O+"))
{
rs=st.executeQuery("select Op from Bloodtypes");
while (rs.next())
{
g3=rs.getInt("Op");
t13.setText(Integer.toString(g3));
}
}
 if (fh.equals("AB+"))
{
rs=st.executeQuery("select ABp from Bloodtypes");
while (rs.next())
{
g4=rs.getInt("ABp");
t13.setText(Integer.toString(g4));
}
}
 if (fh.equals("A-"))
{
rs=st.executeQuery("select An from Bloodtypes");
while (rs.next())
{
g5=rs.getInt("An");
t13.setText(Integer.toString(g5));
}
}
 if (fh.equals("B-"))
{
rs=st.executeQuery("select Bn from Bloodtypes");
while (rs.next())
{
g6=rs.getInt("Bn");
t13.setText(Integer.toString(g6));
}
}
if (fh.equals("O-"))
{
rs=st.executeQuery("select O1 from Bloodtypes");
while (rs.next())
{
g7=rs.getInt("O1");
t13.setText(Integer.toString(g7));
}
}
 if (fh.equals("AB-"))
{
rs=st.executeQuery("select AB1 from Bloodtypes");
while (rs.next())
{
g8=rs.getInt("AB1");
t13.setText(Integer.toString(g8));
}
}
}
}
catch (Exception e6)
{
System.out.println(e6);
}

if(e5.getSource()==b10)
{
jf4.setVisible(false);
project456 t1=new project456();
t1.fun();
}
}
public static void main(String args[])
{
project45 t=new project45();
t.cal();
}
}

