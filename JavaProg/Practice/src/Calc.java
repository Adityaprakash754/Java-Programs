import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Calc implements ActionListener {
    JTextField tf1,tf2,tf3;
    JButton b1,b2;
    public Calc()
    {
        JFrame f = new JFrame();
        tf1 = new JTextField ();
        tf2 = new JTextField ();
        tf3 = new JTextField ();

        tf1.setBounds(50,50,150,20);
        tf2.setBounds(50,100,150,20);
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);

        b1 = new JButton("+");
        b2 = new JButton("-");

        b1.setBounds(50,200,150,20);
        b2.setBounds(120,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        int a,b,c=0;
        a= Integer.parseInt(s1);
        b= Integer.parseInt(s2);

        if(e.getSource() == b1)
            c = a+b;
        else if(e.getSource() == b2)
            c = a-b;

        String res = String.valueOf(c);
        tf3.setText(res);
    }
}
