import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JPanelExample extends JPanel implements ListSelectionListener {
    private JList<String> jlist;
    private JLabel jlabel;
    Color gray = new Color(218, 229, 234);
    String items[] = {"1", "2", "3"};

    JPanelExample() {
        this.setPreferredSize(new Dimension(400, 400)); // set size of task
        this.setBackground(gray); // set background color of task
        this.setLayout(new BorderLayout()); // set layout of task

        jlist = new JList<>(this.items);
        jlist.setPreferredSize(new Dimension(40, 100));
        jlist.addListSelectionListener(this);
        this.add(jlist, BorderLayout.NORTH);

        jlabel = new JLabel("Select a number");
        jlabel .setHorizontalAlignment(JLabel.CENTER); // set alignment of index label
        jlabel.setPreferredSize(new Dimension(20, 20)); // set size of index label
        this.add(jlabel, BorderLayout.SOUTH);
    }

    public void valueChanged(ListSelectionEvent e)
    {
        jlabel.setText(jlist.getSelectedValue());
    }
}

class JFrameExample extends JFrame {
    private JPanelExample jpanel;
    private JList jlist;
    
    JFrameExample() {
        this.setSize(400, 600); // 400 width and 600 height
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        this.setVisible(true); // Make visible

        jpanel = new JPanelExample();
        this.add(jpanel);
    }
}

public class JListExampleApp {
    public static void main(String args[]) {
    new JFrameExample();
    } 
}
