// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JFrame;
// public class BorderLayout extends JFrame{
//     publid static void main(String[] args)
//     {
//         BorderLayoutDemo bld = new BorderLayou
//         bld.setVisible(true);
//         bld.setSize(400, 500);
//         bld.setTitle("border Layout");
// }
// JButton jb1 = null;
// JButton jb2 = null;
// JButton jb3 = null;
// JButton jb4 = null;
// JButton jb5 = null;
// public java.awt.BorderLayoutDemo()
// }

// jb1 = new JButton("Center");
// add(jb1, BorderLayout.CENTER);
// jb2 = new JButton("West");
// add(jb2, BorderLayout.WEST);
// jb3 = new JButton("SOUTH");
// add(jb3, BorderLayout.SOUTH);
// jb4 = new JButton("North");
// add(jb4, BorderLayout.NORTH);
// jb5 = new JButton("East");
// add(jb5, BorderLayout.East);

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {

    JButton jb1, jb2, jb3, jb4, jb5;

    public BorderLayoutDemo() {
        jb1 = new JButton("Center");
        jb2 = new JButton("West");
        jb3 = new JButton("South");
        jb4 = new JButton("North");
        jb5 = new JButton("East");

        setLayout(new BorderLayout());

        add(jb1, BorderLayout.CENTER);
        add(jb2, BorderLayout.WEST);
        add(jb3, BorderLayout.SOUTH);
        add(jb4, BorderLayout.NORTH);
        add(jb5, BorderLayout.EAST);

        setSize(400, 500);
        setTitle("Border Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BorderLayoutDemo bld = new BorderLayoutDemo();
        bld.setVisible(true);
    }
}