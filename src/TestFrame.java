import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame {
     public static void createGUI() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          final JFrame frame = new JFrame("Test frame");
          
          JPanel panel = new JPanel();
          
          Icon leftIcon = UIManager.getIcon("OptionPane.errorIcon");
          
          final JButton leftButton = new JButton("Enable");
          leftButton.setVerticalTextPosition(AbstractButton.CENTER);
          leftButton.setHorizontalTextPosition(AbstractButton.LEADING);
          leftButton.setIcon(leftIcon);
          panel.add(leftButton);
          
          Icon centerIcon = UIManager.getIcon("OptionPane.informationIcon");
          
          final JButton centerButton = new JButton("Center");
          centerButton.setVerticalTextPosition(AbstractButton.BOTTOM);
          centerButton.setHorizontalTextPosition(AbstractButton.CENTER);
          centerButton.setIcon(centerIcon);
          centerButton.setEnabled(false);
          panel.add(centerButton);
          
          centerButton.setPreferredSize(new Dimension(100, 100));
          
          Icon rightIcon = UIManager.getIcon("OptionPane.questionIcon");
          
          final JButton rightButton = new JButton("Disable");
          rightButton.setIcon(rightIcon);
          rightButton.setEnabled(false);          
          panel.add(rightButton);
          
          leftButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    leftButton.setEnabled(false);
                    centerButton.setEnabled(true);
                    rightButton.setEnabled(true);
               }
          });
          
          rightButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    leftButton.setEnabled(true);
                    centerButton.setEnabled(false);
                    rightButton.setEnabled(false);
               }
          });
          
          frame.getContentPane().add(panel);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setPreferredSize(new Dimension(350, 145));          
          
          frame.pack();
          
          frame.setLocationRelativeTo(null);
          
          frame.setVisible(true);
     }
     
     public static void main(String[] args) {
          javax.swing.SwingUtilities.invokeLater(new Runnable() {
               public void run() {
                    createGUI();
               }
          });
     }
}