
package labeltest;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
   private JLabel label1;
   private JLabel label2;
   private JLabel label3;
   
   public LabelFrame(){
    super ("Testing JLabel");
    setLayout(new FlowLayout());
    
    label1 = new JLabel("Rotulo com texto");
    label1.setToolTipText("Este é o rotulo 1");
    add( label1);
    
    Icon bug = new ImageIcon ( getClass().getResource("bug1.png"));
    label2 = new JLabel ("Rotulo com texto e icone", bug, SwingConstants.LEFT);
    label2.setToolTipText("Este é o rotulo 2");
    add(label2);
    
    label3 = new JLabel();
    label3.setText("Rotulo com icone e texto na parte de baixo");
    label3.setIcon(bug);
    label3.setHorizontalTextPosition( SwingConstants.CENTER);
    label3.setVerticalTextPosition( SwingConstants.BOTTOM);
    label3.setToolTipText("Este é o rotulo 3");
    add (label3);
      }
    }
