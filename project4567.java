import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class project4567 extends project456 implements ActionListener
{
public void fun1()
{
jf3=new JFrame();
l3=new JLabel("DONOR ID");
l3.setBounds(100,200,200,30);
l3.setFont(f1);
l3.setBackground(Color.RED);
l3.setForeground(Color.BLACK);
l3.setOpaque(true);
jf3.add(l3);
t3=new JTextField();
t3.setBounds(350,200,200,30);
t3.setFont(f1);
t3.setBackground(Color.CYAN);
t3.setForeground(Color.BLACK);
jf3.add(t3);
l4=new JLabel("NAME");
l4.setBounds(100,250,200,30);
l4.setFont(f1);
l4.setBackground(Color.RED);
l4.setForeground(Color.BLACK);
l4.setOpaque(true);
jf3.add(l4);
t4=new JTextField();
t4.setBounds(350,250,200,30);
t4.setFont(f1);
t4.setBackground(Color.CYAN);
t4.setForeground(Color.BLACK);
jf3.add(t4);
l5=new JLabel("FATHER NAME");
l5.setBounds(100,300,200,30);
l5.setFont(f1);
l5.setBackground(Color.RED);
l5.setForeground(Color.BLACK);
l5.setOpaque(true);
jf3.add(l5);
t5=new JTextField();
t5.setBounds(350,300,200,30);
t5.setFont(f1);
t5.setBackground(Color.CYAN);
t5.setForeground(Color.BLACK);
jf3.add(t5);
l6=new JLabel("MOTHER NAME");
l6.setBounds(100,350,200,30);
l6.setFont(f1);
l6.setBackground(Color.RED);
l6.setForeground(Color.BLACK);
l6.setOpaque(true);
jf3.add(l6);
t6=new JTextField();
t6.setBounds(350,350,200,30);
t6.setFont(f1);
t6.setBackground(Color.CYAN);
t6.setForeground(Color.BLACK);
jf3.add(t6);
l7=new JLabel("DOB");
l7.setBounds(100,400,200,30);
l7.setFont(f1);
l7.setBackground(Color.RED);
l7.setForeground(Color.BLACK);
l7.setOpaque(true);
jf3.add(l7);
t12=new JTextField();
t12.setBounds(350,400,200,30);
t12.setFont(f1);
t12.setBackground(Color.CYAN);
t12.setForeground(Color.BLACK);
jf3.add(t12);
l8=new JLabel("NO. OF PACKETS");
l8.setBounds(100,450,200,30);
l8.setFont(f1);
l8.setBackground(Color.RED);
l8.setForeground(Color.BLACK);
l8.setOpaque(true);
jf3.add(l8);
t7=new JTextField();
t7.setBounds(350,450,200,30);
t7.setFont(f1);
t7.setBackground(Color.CYAN);
t7.setForeground(Color.BLACK);
jf3.add(t7);
l9=new JLabel("GENDER");
l9.setBounds(100,500,200,30);
l9.setFont(f1);
l9.setBackground(Color.RED);
l9.setForeground(Color.BLACK);
l9.setOpaque(true);
jf3.add(l9);
r1=new JRadioButton("Male");    
r2=new JRadioButton("Female");    
r1.setBounds(350,500,100,30);    
r2.setBounds(480,500,150,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);
bg.add(r2);    
r1.setFont(f1);
r1.setBackground(Color.BLACK);
r1.setForeground(Color.WHITE);
jf3.add(r1);
r2.setFont(f1);
r2.setBackground(Color.BLACK);
r2.setForeground(Color.WHITE);
jf3.add(r2);
l10=new JLabel("MOBILE NO");
l10.setBounds(700,200,200,30);
l10.setFont(f1);
l10.setBackground(Color.RED);
l10.setForeground(Color.BLACK);
l10.setOpaque(true);
jf3.add(l10);
t8=new JTextField();
t8.setBounds(950,200,200,30);
t8.setFont(f1);
t8.setBackground(Color.CYAN);
t8.setForeground(Color.BLACK);
jf3.add(t8);
l11=new JLabel("EMAIL");
l11.setBounds(700,250,200,30);
l11.setFont(f1);
l11.setBackground(Color.RED);
l11.setForeground(Color.BLACK);
l11.setOpaque(true);
jf3.add(l11);
t9=new JTextField();
t9.setBounds(950,250,400,30);
t9.setFont(f1);
t9.setBackground(Color.CYAN);
t9.setForeground(Color.BLACK);
jf3.add(t9);
l12=new JLabel("BLOOD GROUP");
l12.setBounds(700,300,200,30);
l12.setFont(f1);
l12.setBackground(Color.RED);
l12.setForeground(Color.BLACK);
l12.setOpaque(true);
jf3.add(l12);
c4=new JComboBox();
c4.addItem("A+");
c4.addItem("B+");
c4.addItem("O+");
c4.addItem("AB+");
c4.addItem("B-");
c4.addItem("A-");
c4.addItem("O-");
c4.addItem("AB-");
c4.setFont(f1);
c4.setBounds(950,300,50,30);
c4.setBackground(Color.RED);
c4.setForeground(Color.WHITE);
jf3.add(c4);
l13=new JLabel("CITY");
l13.setBounds(700,350,200,30);
l13.setFont(f1);
l13.setBackground(Color.RED);
l13.setForeground(Color.BLACK);
l13.setOpaque(true);
jf3.add(l13);
t11=new JTextField();
t11.setBounds(950,350,200,30);
t11.setFont(f1);
t11.setBackground(Color.CYAN);
t11.setForeground(Color.BLACK);
jf3.add(t11);
l14=new JLabel("ADDRESS");
l14.setBounds(700,400,200,30);
l14.setFont(f1);
l14.setBackground(Color.RED);
l14.setForeground(Color.BLACK);
l14.setOpaque(true);
jf3.add(l14);
a1=new JTextArea();
a1.setBounds(950,400,250,150);
a1.setFont(f1);
a1.setBackground(Color.CYAN);
a1.setForeground(Color.BLACK);
jf3.add(a1);
b5=new JButton("RESET");
b5.setBounds(300,700,200,30);
b5.setBackground(Color.YELLOW);
b5.setForeground(Color.BLACK);
b5.setFont(f1);
b5.addActionListener(this);
jf3.add(b5);
b6=new JButton("CLOSE");
b6.setBounds(550,700,200,30);
b6.setBackground(Color.PINK);
b6.setForeground(Color.BLACK);
b6.addActionListener(this);
b6.setFont(f1);
jf3.add(b6);
b7=new JButton("SUBMIT");
b7.setBounds(800,700,200,30);
b7.setBackground(Color.CYAN);
b7.setForeground(Color.BLACK);
b7.setFont(f1);
b7.addActionListener(this);
jf3.add(b7);
b8=new JButton("BACK");
b8.setBounds(1050,700,200,30);
b8.setBackground(Color.GREEN);
b8.setForeground(Color.BLACK);
b8.setFont(f1);
b8.addActionListener(this);
jf3.add(b8);
//

JLabel bu2 = new JLabel(new ImageIcon("R3.jpg"));
jf3.getContentPane().add(bu2);
jf3.pack();      
jf3.setVisible(true);
} 
public void actionPerformed(ActionEvent e8)
{

try
{
if(e8.getSource()==b7)
{
e=Integer.parseInt(t3.getText());
f=t4.getText();
g=t5.getText();
h=t6.getText();
i=t12.getText();
k=Integer.parseInt(t7.getText());
j=Integer.parseInt(t8.getText());
l=t9.getText();
m=t11.getText();
n=a1.getText();
if (r1.isSelected())
{
ff=r1.getText();
}
if(r2.isSelected()) 
{
ff=r2.getText();
}
if( (!t3.getText().equals("")) &&(!t4.getText().equals("")) &&(!t5.getText().equals(""))&&(!t6.getText().equals(""))&&(!t12.getText().equals(""))&&(!t7.getText().equals(""))&& (!t8.getText().equals(""))&&(!t9.getText().equals(""))&&(!t11.getText().equals(""))&&(!a1.getText().equals("")))
{
fg=(String)c4.getSelectedItem();
System.out.println(fg);
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/BLOODBANK","root","Malathi@123");  
ps=con.prepareStatement("insert into donordetails(DonorId,Name,FatherName,MotherName,DOB,Packetno,Gender,Mobilenumber,Email,Bloodgroup,City,Address)values(?,?,?,?,?,?,?,?,?,?,?,?)");
ps.setInt(1,e);
ps.setString(2,f);
ps.setString(3,g);
ps.setString(4,h);
ps.setString(5,i);
ps.setInt(6,k);
ps.setString(7,ff);
ps.setInt(8,j);
ps.setString(9,l);
ps.setString(10,fg);
ps.setString(11,m);
ps.setString(12,n);
int x=ps.executeUpdate();
if (x>0)
{
JOptionPane.showMessageDialog(jf,"Form Submitted","Warning",JOptionPane.WARNING_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(jf,"Form Not Submitted","Warning",JOptionPane.WARNING_MESSAGE);
}
if (fg.equals ("A+"))
{
rs=ps.executeQuery("select Ap from Bloodtypes");
while(rs.next())
{
d1=rs.getInt("Ap");
}
d1=d1+k;
}
if (fg.equals ("B+"))
{
rs=ps.executeQuery("select Bp from Bloodtypes");
while(rs.next())
{
d2=rs.getInt("Bp");
}
d2=d2+k;
}
 if (fg.equals ("O+"))
{
rs=ps.executeQuery("select Op from Bloodtypes");
while(rs.next())
{
d3=rs.getInt("Op");
}
d3=d3+k;
}
if (fg.equals ("AB+"))
{
rs=ps.executeQuery("select ABp from Bloodtypes");
while(rs.next())
{
d4=rs.getInt("ABp");
}
d4=d4+k;
}
if (fg.equals ("A-"))
{
rs=ps.executeQuery("select An from Bloodtypes");
while(rs.next())
{
d5=rs.getInt("An");
}
d5=d5+k;
}
 if (fg.equals ("B-"))
{
rs=ps.executeQuery("select Bn from Bloodtypes");
while(rs.next())
{
d6=rs.getInt("Bn");
}
d6=d6+k;
}
 if (fg.equals ("O-"))
{
rs=ps.executeQuery("select O1 from Bloodtypes");
while(rs.next())
{
d7=rs.getInt("O1");
}
d7=d7+k;
}
 if (fg.equals ("AB-"))
{
rs=ps.executeQuery("select AB1 from Bloodtypes");
while(rs.next())
{
d8=rs.getInt("AB1");
}
d8=d8+k;
}
}
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/BLOODBANK","root","Malathi@123");
ps=con.prepareStatement("insert into Bloodtypes(Ap,Bp,Op,ABp,An,Bn,O1,AB1)values(?,?,?,?,?,?,?,?)");
ps.setInt(1,d1);
ps.setInt(2,d2);
ps.setInt(3,d3);
ps.setInt(4,d4);
ps.setInt(5,d5);
ps.setInt(6,d6);
ps.setInt(7,d7);
ps.setInt(8,d8);
int y=ps.executeUpdate();
ps.close();
con.close();
}
}
catch (Exception e1)
{
System.out.println(e1);
}
if(e8.getSource()==b5)
{
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t12.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t11.setText("");
a1.setText("");
}
if(e8.getSource()==b6)
{
System.exit(0);
}
if(e8.getSource()==b8)
{
jf3.setVisible(false);
project456 t1=new project456();
t1.fun();
}
}
}
