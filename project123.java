import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
class project123 extends project12 implements ActionListener
{
public void cal1()
{
jf1=new JFrame();

l1=new JLabel("BLOOD TYPE");
l1.setBounds(400,300,150,30);
l1.setBackground(Color.RED);
l1.setForeground(Color.BLACK);
l1.setOpaque(true);
l1.setFont(f1);
jf1.add(l1);
c1=new JComboBox();
c1.addItem("A+");
c1.addItem("B+");
c1.addItem("O+");
c1.addItem("AB+");
c1.addItem("B-");
c1.addItem("A-");
c1.addItem("O-");
c1.addItem("AB-");
c1.setFont(f1);
c1.setBounds(750,300,50,30);
c1.setBackground(Color.RED);
c1.setForeground(Color.WHITE);
jf1.add(c1);
b5=new JButton("SUBMIT");
b5.setBounds(550,350,150,30);
b5.setBackground(Color.BLUE);
b5.setForeground(Color.WHITE);
b5.addActionListener(this);
b5.setFont(f1);
jf1.add(b5);
l2=new JLabel("AVAILABLE");
l2.setBounds(400,400,200,30);
l2.setBackground(Color.RED);
l2.setForeground(Color.BLACK);
l2.setOpaque(true);
l2.setFont(f1);
jf1.add(l2);
t1=new JTextField();
t1.setBounds(750,400,200,30);
t1.setFont(f1);
t1.setBackground(Color.BLACK);
t1.setForeground(Color.WHITE);
jf1.add(t1);
l3=new JLabel("NO.OF PACKETS FOR SALE");
l3.setBounds(400,450,300,30);
l3.setBackground(Color.RED);
l3.setForeground(Color.BLACK);
l3.setOpaque(true);
l3.setFont(f1);
jf1.add(l3);
t2=new JTextField();
t2.setBounds(750,450,200,30);
t2.setFont(f1);
t2.setBackground(Color.BLACK);
t2.setForeground(Color.WHITE);
jf1.add(t2);
b6=new JButton("SUBMIT");
b6.setBounds(550,500,150,30);
b6.setBackground(Color.BLUE);
b6.setForeground(Color.WHITE);
b6.addActionListener(this);
b6.setFont(f1);
jf1.add(b6);
l4=new JLabel("RATE");
l4.setBounds(400,550,200,30);
l4.setBackground(Color.RED);
l4.setForeground(Color.BLACK);
l4.setOpaque(true);
l4.setFont(f1);
jf1.add(l4);
t3=new JTextField();
t3.setBounds(750,550,200,30);
t3.setFont(f1);
t3.setBackground(Color.BLACK);
t3.setForeground(Color.WHITE);
jf1.add(t3);
l5=new JLabel("TOTAL AMOUNT");
l5.setBounds(400,600,200,30);
l5.setBackground(Color.RED);
l5.setForeground(Color.BLACK);
l5.setOpaque(true);
l5.setFont(f1);
jf1.add(l5);
t4=new JTextField();
t4.setBounds(750,600,200,30);
t4.setFont(f1);
t4.setBackground(Color.BLACK);
t4.setForeground(Color.WHITE);
jf1.add(t4);
l6=new JLabel("DATE");
l6.setBounds(950,200,100,30);
l6.setBackground(Color.RED);
l6.setForeground(Color.BLACK);
l6.setOpaque(true);
l6.setFont(f1);
jf1.add(l6);
t5=new JTextField();
t5.setBounds(1100,200,200,30);
t5.setFont(f1);
t5.setBackground(Color.BLACK);
t5.setForeground(Color.WHITE);
jf1.add(t5);
b7=new JButton("RESET");
b7.setBounds(450,650,200,30);
b7.setBackground(Color.YELLOW);
b7.setForeground(Color.BLACK);
b7.setFont(f1);
b7.addActionListener(this);
jf1.add(b7);
b8=new JButton("BACK");
b8.setBounds(700,650,200,30);
b8.setBackground(Color.PINK);
b8.setForeground(Color.BLACK);
b8.setFont(f1);
b8.addActionListener(this);
jf1.add(b8);
JLabel bu2 = new JLabel(new ImageIcon("blood2.jpg"));
jf1.getContentPane().add(bu2);
jf1.pack();      
jf1.setVisible(true);
}
public void actionPerformed(ActionEvent e5)
{

try
{
if (e5.getSource()==b5)
{
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/BLOODBANK","root","Malathi@123");  
st=con.createStatement();
fh=(String)c1.getSelectedItem();
if (fh.equals("A+"))
{
rs=st.executeQuery("select Ap from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("Ap");
}
t1.setText(Integer.toString(g1));
}
if (fh.equals("B+"))
{
rs=st.executeQuery("select Bp from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("Bp");
}
t1.setText(Integer.toString(g1));
}
if (fh.equals("O+"))
{
rs=st.executeQuery("select Op from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("Op");
}
t1.setText(Integer.toString(g1));
}
if (fh.equals("AB+"))
{
rs=st.executeQuery("select ABp from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("ABp");
}
t1.setText(Integer.toString(g1));
}

if (fh.equals("A-"))
{
rs=st.executeQuery("select An from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("An");
}
t1.setText(Integer.toString(g1));
}
if (fh.equals("B-"))
{
rs=st.executeQuery("select Bn from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("Bn");
}
t1.setText(Integer.toString(g1));
}
if (fh.equals("O-"))
{
rs=st.executeQuery("select O1 from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("O1");
}
t1.setText(Integer.toString(g1));
}
if (fh.equals("AB-"))
{
rs=st.executeQuery("select AB1 from Bloodtypes");
while (rs.next())
{
g1=rs.getInt("AB1");
}
t1.setText(Integer.toString(g1));
}
}
}
catch(Exception ex)
{
System.out.println(ex);
}
//***************************Button b6 submit*****************************
try
{
if(e5.getSource()==b6)
{
d1=Integer.parseInt(t2.getText());
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/BLOODBANK","root","Malathi@123");  
st=con.createStatement();
System.out.println(fh);
if (fh.equals("A+"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='A1' ");
while(rs.next())
{
h1=rs.getInt("rate");
d1=d1*h1;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h1));
}
}
}
if (fh.equals("B+"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='B1' ");
while(rs.next())
{
h2=rs.getInt("rate");
d1=d1*h2;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h2));
}
}
}
if (fh.equals("O+"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='O1' ");
while(rs.next())
{
h3=rs.getInt("rate");
d1=d1*h3;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h3));
}
}
}
if (fh.equals("AB+"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='AB1' ");
while(rs.next())
{
h4=rs.getInt("rate");
d1=d1*h4;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h4));
}
}
}
if (fh.equals("A-"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='A2' ");
while(rs.next())
{
h5=rs.getInt("rate");
d1=d1*h5;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h5));
}
}
}
if (fh.equals("B-"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='B2' ");
while(rs.next())
{
h6=rs.getInt("rate");
d1=d1*h6;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h6));
}
}
}
if (fh.equals("O-"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='O2' ");
while(rs.next())
{
h7=rs.getInt("rate");
d1=d1*h7;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h7));
}
}
}
if (fh.equals("AB-"))
{
rs=st.executeQuery("select rate from Bloodrate where bloodtypes='AB2' ");
while(rs.next())
{
h8=rs.getInt("rate");
d1=d1*h8;
if(g1!=0)
{
t4.setText(Integer.toString(d1));
t3.setText(Integer.toString(h8));
}
}
}
}
}
catch(Exception ex1)
{
System.out.println(ex1);
}
//***********************************Reset***********************
if(e5.getSource()==b7)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
}
//******************************************back************
if(e5.getSource()==b8)
{
jf1.setVisible(false);
project12 obj=new project12();
obj.cal();
}


///*********************classs
}
}
