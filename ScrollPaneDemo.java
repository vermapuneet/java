import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JScrollPane;  
public class ScrollPaneDemo extends JFrame  
{  
public ScrollPaneDemo() {  
super("ScrollPane Demo");  
ImageIcon img = new ImageIcon("a.jpg");  
  
JScrollPane png = new JScrollPane(new JLabel(img));  
  
getContentPane().add(png);  
setSize(200,200);  
setVisible(true);  
}  
  
public static void main(String[] args) {  
new ScrollPaneDemo();  
}  
}  