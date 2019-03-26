import java.applet.*;
import java.awt.*;
class BorderLayoutExample extends Frame
{
	Button b1,b2,b3,b4,b5;
	BorderLayoutExample()
{
	b1=new Button("Red");
	b2=new Button("Green");
	b3=new Button("Blue");
	b4=new Button("Orange");
	b5=new Button("Pink");
	setBackground(Color.black);
	setLayout(new BorderLayout(5,5));
	this.add(b1,BorderLayout.NORTH);
	this.add(b2,BorderLayout.SOUTH);
	this.add(b3,BorderLayout.EAST);
	this.add(b4,BorderLayout.WEST);
	this.add(b5,BorderLayout.CENTER);
}
public static void main(String s[])
{
	BorderLayoutExample obj= new BorderLayoutExample();
	obj.setSize(200,300);
	obj.setTitle("Border Layout Example");
	obj.setVisible(true);
}}