/*
 *  Date: 11/26/11
 *   Time: 14:48
 *   Author: 
 *      Alexander Marchuk
 *      aamarchuk@gmail.com
 */

package Expert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ExpertWindow {
    private JPanel Main;
    private JButton Documents;
    private JButton startTest;
    private JTextArea testResult;
    private JComboBox specialTypeBox;
    private JComboBox defenceBox;
    private JComboBox matherialBox;
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
    private JComboBox changeStyle;
    private JCheckBox checkStyle;

    public ExpertWindow() {

        JFrame frame = new JFrame("Expert");
        frame.setPreferredSize(new Dimension(1100, 600));
        frame.setLocation(100, 150);
        this.setPicture("imgs/startPage.jpg");
        frame.setContentPane(this.getForm());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);


        Vest b2 = new Vest("6Б2", "Общевойсковой бронежилет 6Б2 (Ж-81)", "общевойсковой", "2", 4.4, 4.8, 28, 1981, "титан", "http://www.russianarms.ru/forum/index.php/topic,1521.0.html", "imgs/6b2.jpg", "");
        Vest b3 = new Vest("6Б3", "Общевойсковые бронежилеты 6Б3Т (Ж-85Т), 6Б3ТМ (Ж-85ТМ) и 6Б3Т-М-01 (Ж-85ТМ-01)", "общевойсковой", "3", 6.5, 12.1, 49.6, 1985, "титан", "http://www.russianarms.ru/forum/index.php/topic,1522.0.html", "imgs/6b3.jpg", "");
        Vest b4 = new Vest("6Б4", "Общевойсковые бронежилеты серии 6Б4 (Ж-85К) и 6Б4-01 (Ж-85К-01)", "общевойсковой", "4", 7.6, 15.6, 49.6, 1985, "керамика", "http://www.russianarms.ru/forum/index.php/topic,2366.0.html", "imgs/6b4.jpg", "");
        Vest b5 = new Vest("6Б5", "imgs/6b5.jpg");
        Vest b11 = new Vest("6Б11", "imgs/6b11.jpg");
        Vest b15 = new Vest("6Б15", "imgs/6b15.jpg");
        Vest b17 = new Vest("6Б17", "imgs/6b17.jpg");
        Vest b19 = new Vest("6Б19", "imgs/6b19.jpg");
        Vest b20 = new Vest("6Б20", "imgs/6b20.jpg");
        Vest b21 = new Vest("6Б21", "imgs/6b21.jpg");
        Vest b23 = new Vest("6Б23", "imgs/6b23.jpg");
        Vest b24 = new Vest("6Б24", "imgs/6b24.jpg");
        Vest b25 = new Vest("6Б25", "imgs/6b25.jpg");
        Vest b43 = new Vest("6Б43", "imgs/6b43.jpg");

        final HashMap map = new HashMap();

        map.put(b2.nameShort, b2);
        map.put(b3.nameShort, b3);
        map.put(b4.nameShort, b4);
        map.put(b5.nameShort, b5);
        map.put(b11.nameShort, b11);
        map.put(b15.nameShort, b15);
        map.put(b17.nameShort, b17);
        map.put(b19.nameShort, b19);
        map.put(b20.nameShort, b20);
        map.put(b21.nameShort, b21);
        map.put(b23.nameShort, b23);
        map.put(b24.nameShort, b24);
        map.put(b25.nameShort, b25);
        map.put(b43.nameShort, b43);

        changeStyle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "comboBoxChanged") {
                    if (changeStyle.getSelectedItem() == "Опознавание") {
                        Head.setFont(new Font(null, Font.PLAIN, 28));
                        Head.setText("Опознование");
                        setPicture("imgs/startPage.jpg");
                        startTest.setText("Начать опознование");

                    }
                    if (changeStyle.getSelectedItem() == "Обучение") {
                        Vest request = (Vest) map.get(showVast.getSelectedItem());
                        printVestAllInfo((Vest) map.get(request.nameShort));
                    }
                    if (changeStyle.getSelectedItem() == "Описание") {
                        Head.setText("A3");

                    }
                    if (changeStyle.getSelectedItem() == "...") {
                        Head.setFont(new Font(null, Font.PLAIN, 18));
                        Head.setText("Экспертная система \"Бронежилеты\" 642 уч.вз. Марчук А.  ");
                        setPicture("imgs/startPage.jpg");
                    }
                }
            }
        });


        startTest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showVast.getSelectedItem() == "..." && startTest.getText() == "Начать опознование") {
                    Vest request = new Vest("", "", (String) specialTypeBox.getSelectedItem(), (String) armorTypeBox.getSelectedItem(), Double.valueOf(weightMinVal.getText()), Double.valueOf(weightMaxVal.getText()), Double.valueOf(armorAreaVal.getText()), Integer.valueOf(yearDestribVal.getText()), (String) matherialBox.getSelectedItem(), "", "", "");  //TODO
                    Test(map, request);
                } else if (startTest.getText() == "Начать опознование") {
                    Vest request = (Vest) map.get(showVast.getSelectedItem());
                    printVestInfo(request);
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

    public void printVestInfo(Vest v) {

        HashMap nato = new HashMap();
        nato.put("1", "II");
        nato.put("2", "III-A");
        nato.put("3", "III-A");
        nato.put("4", "III");
        nato.put("5", "III");
        nato.put("5а", "III");
        nato.put("6", "IV");
        nato.put("6а", "IV");

        HashMap def = new HashMap();
        def.put("1", "осколки");
        def.put("2", "пистолет");
        def.put("3", "пистолет");
        def.put("4", "АК-74");
        def.put("5", "АК-74");
        def.put("5а", "АК-74");
        def.put("6", "винтовка СВД");
        def.put("6а", "винтовка СВД");

        testResult.setText("Название:" + v.nameFull + "\n" +
                "Класс защиты(РФ): " + v.armorClass + "\n" +
                "Класс защиты(НАТО): " + nato.get(v.armorClass) + "\n" +
                "Вес(минимальный): " + v.weightMin + "\n" +
                "Вес(максимальный): " + v.weightMax + "\n" +
                "Материал: " + v.matherial + "\n" +
                "Площадь защиты: " + v.armorArea + "\n" +
                "Защита от: " + def.get(v.armorClass) + "\n" +
                "Год принятия на вооружение: " + v.yearDestr + "\n" +
                "URL: " + v.url + "\n");

        // setPicture(v.image);

    }

    public void printVestAllInfo(Vest v) {
        HashMap nato = new HashMap();
        nato.put("1", "II");
        nato.put("2", "III-A");
        nato.put("3", "III-A");
        nato.put("4", "III");
        nato.put("5", "III");
        nato.put("5а", "III");
        nato.put("6", "IV");
        nato.put("6а", "IV");

        HashMap def = new HashMap();
        def.put("1", "осколки");
        def.put("2", "пистолет Токарева");
        def.put("3", "пистолет Токарева");
        def.put("4", "автомат АК-74");
        def.put("5", "автомат АК-74");
        def.put("5а", "автомат АК-74");
        def.put("6", "винтовка СВД");
        def.put("6а", "винтовка СВД");

        specialTypeBox.setSelectedItem(v.specialType);
        defenceBox.setSelectedItem(v.matherial);
        matherialBox.setSelectedItem(def.get(v.armorClass));
        armorTypeBox.setSelectedItem(String.valueOf(v.armorClass));
        weightMaxVal.setText(String.valueOf(v.weightMax));
        weightMinVal.setText(String.valueOf(v.weightMin));
        armorAreaVal.setText(String.valueOf(v.armorArea));
        yearDestribVal.setText(String.valueOf(v.yearDestr));
        // setPicture(v.image);
        Head.setText(v.nameFull);
        // Head.setText(v.nameShort);
    }

    public void Test(HashMap<String, Vest> map, Vest request) {

        HashMap def = new HashMap();
        def.put("1", "осколки");
        def.put("2", "пистолет Токарева");
        def.put("3", "пистолет Токарева");
        def.put("4", "автомат АК-74");
        def.put("5", "автомат АК-74");
        def.put("5а", "автомат АК-74");
        def.put("6", "винтовка СВД");
        def.put("6а", "винтовка СВД");

        String[] allVests = {"6Б2", "6Б3", "6Б4", "6Б5", "6Б11", "6Б15", "6Б17", "6Б19", "6Б20", "6Б21", "6Б23", "6Б24", "6Б25", "6Б43",};

        testResult.setText("Результаты тестирования: \n");

        for (String s : allVests) {
            map.get(s).approachFields = 0;

            if (map.get(s).specialType == "...") {
                map.get(s).approachFields += 1;
            } else {
                if (map.get(s).specialType == request.specialType)
                    map.get(s).approachFields += 1;
            }

            if (map.get(s).armorClass == "...") {
                map.get(s).approachFields += 1;
            } else {
                if (map.get(s).armorClass == request.armorClass)
                    map.get(s).approachFields += 1;
            }

            if (map.get(s).weightMin >= request.weightMin)
                map.get(s).approachFields += 1;

            if (map.get(s).weightMax <= request.weightMax)
                map.get(s).approachFields += 1;

            if (map.get(s).armorArea >= request.armorArea)
                map.get(s).approachFields += 1;

            if (map.get(s).yearDestr <= request.yearDestr)
                map.get(s).approachFields += 1;

            if (map.get(s).matherial == "...") {
                map.get(s).approachFields += 1;
            } else {
                if (map.get(s).matherial == request.matherial)
                    map.get(s).approachFields += 1;
                // testResult.setText(testResult.getText()+map.get(s).matherial+ request.matherial+"\n");
            }

            if (def.get(map.get(s).armorClass) == def.get(request.armorClass)) {
                map.get(s).approachFields += 1;
            }


            if (map.get(s).approachFields >= 6)
                testResult.setText(testResult.getText() + "\nНаиболее вероятный: " + map.get(s).nameShort + ":" + String.valueOf(map.get(s).approachFields));
            if (map.get(s).approachFields < 6 && map.get(s).approachFields > 4)
                testResult.setText(testResult.getText() + "\nВероятный: " + map.get(s).nameShort + ":" + String.valueOf(map.get(s).approachFields));
            if (map.get(s).approachFields <= 4 && map.get(s).approachFields >= 3)
                testResult.setText(testResult.getText() + "\nНаименее вероятный: " + map.get(s).nameShort + ":" + String.valueOf(map.get(s).approachFields));

        }


    }

    public static void main(String[] args) {
        ExpertWindow w = new ExpertWindow();
    }

}