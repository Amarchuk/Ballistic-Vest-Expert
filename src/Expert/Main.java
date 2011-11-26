/*
 *  Date: 11/26/11
 *   Time: 14:47
 *   Author: 
 *      Alexander Marchuk
 *      aamarchuk@gmail.com
 */

package Expert;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Expert");
        frame.setPreferredSize(new Dimension(1100, 600));
        frame.setLocation(100,150);
        ExpertWindow w = new ExpertWindow();
        w.setPicture("imgs/startPage.jpg");
        frame.setContentPane(w.getForm());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}

