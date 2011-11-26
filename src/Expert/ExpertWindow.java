/*
 *  Date: 11/26/11
 *   Time: 14:48
 *   Author: 
 *      Alexander Marchuk
 *      aamarchuk@gmail.com
 */

package Expert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpertWindow {
    private JPanel Main;
    private JButton Documents;
    private JButton startTest;
    private JTextArea testResult;
    private JComboBox specialTypeBox;
    private JComboBox matherialBox;
    private JComboBox defenceBox;
    private JComboBox armorTypeBox;
    private JTextField weightMinVal;
    private JTextField weightMaxVal;
    private JLabel specialType;
    private JLabel armorType;
    private JLabel weightMax;
    private JLabel weightMin;
    private JLabel armorArea;
    private JLabel yearDestrib;
    private JTextField armorAreaVal;
    private JTextField yearDestribVal;
    private JLabel defenceFrom;
    private JLabel materialVest;
    private JLabel Head;
    private JLabel Picture;
    private JComboBox showVast;

    public ExpertWindow() {
        String[] allVests = {"...", "6Б2","6Б3","6Б4","6Б5","6Б11","6Б15","6Б17","6Б19","6Б20","6Б21","6Б23","6Б24","6Б25","6Б43",};

        startTest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(showVast.getSelectedItem() == "..."){
                    testResult.setText("Yarr\n");
                }
                else{
                    testResult.setText((String) showVast.getSelectedItem());
                }

            }
        });

    }

    public JPanel getForm() {
        return this.Main;
    }

    public void setPicture(String path) {
        Picture.setIcon(new ImageIcon(path));
    }

}