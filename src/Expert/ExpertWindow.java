/*
 *  Date: 11/26/11
 *   Time: 14:48
 *   Author: 
 *      Alexander Marchuk
 *      aamarchuk@gmail.com
 */

package Expert;

import javax.swing.*;

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

    public ExpertWindow(){

    }

    public JPanel getForm(){
        return this.Main;
    }

    public void setPicture(String path){
        Picture.setIcon(new ImageIcon(path));
    }

}