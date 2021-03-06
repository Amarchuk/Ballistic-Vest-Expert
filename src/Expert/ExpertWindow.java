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
import java.util.Random;
import java.util.TreeMap;

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
    public int requestNumber = 0;
    int questNumber = 0;
    String answers = "";

    public ExpertWindow() {

        JFrame frame = new JFrame("Expert");
        frame.setPreferredSize(new Dimension(1100, 600));
        frame.setLocation(100, 150);
        ImageIcon startPage = new ImageIcon(getClass().getResource("/imgs/startPage.jpg"));
        this.setPicture(startPage);
        frame.setContentPane(this.getForm());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Vest b2 = new Vest("6Б2", "Общевойсковой бронежилет 6Б2 (Ж-81)", "общевойсковой", "2", 4.4, 4.8, 28, 1981, "титан", "http://www.russianarms.ru/forum/index.php/topic,1521.0.html", "/imgs/6b2.jpg", "");
        Vest b3 = new Vest("6Б3", "Общевойсковые бронежилеты 6Б3Т \n" +
                "(Ж-85Т), 6Б3ТМ (Ж-85ТМ) \n ", "общевойсковой", "3", 6.5, 12.1, 49.6, 1985, "титан", "http://www.russianarms.ru/forum/index.php/topic,1522.0.html", "/imgs/6b3.jpg", "");
        Vest b4 = new Vest("6Б4", "Общевойсковые бронежилеты серии 6Б4\n" +
                "(Ж-85К) и 6Б4-01 \n(Ж-85К-01)", "общевойсковой", "4", 7.6, 15.6, 49.6, 1985, "керамика", "http://www.russianarms.ru/forum/index.php/topic,2366.0.html", "/imgs/6b4.jpg", "");
        Vest b5 = new Vest("6Б5", "Общевойсковые бронежилеты 6Б5 (Ж-86)\n" +
                " и 6Б5М серии \"Улей\"", "общевойсковой", "3", 2.7, 12.2, 49.6, 1986, "керамика", "http://www.russianarms.ru/forum/index.php/topic,1523.0.html", "/imgs/6b5.jpg", "Имеет 18 модификаций");
        Vest b11 = new Vest("6Б11", "Общевойсковые бронежилеты 6Б11, \n" +
                "6Б12 и 6Б13 серии «Забрало»", "общевойсковой", "3", 4.2, 12.7, 50, 1999, "керамика", "http://www.russianarms.ru/forum/index.php/topic,1527.0.html", "/imgs/6b11.jpg", "");
        Vest b15 = new Vest("6Б15", "Защитный комплект для экипажей \n" +
                "бронированных машин 6Б15 «Ковбой»", "специальный", "1", 6.5, 6.5, 45, 2003, "ткань", "http://www.russianarms.ru/forum/index.php/topic,1532.0.html", "/imgs/6b15.jpg", "");
        Vest b17 = new Vest("6Б17", "Бронежилеты специальные скрытного \n" +
                "ношения 6Б17 и 6Б18", "специальный", "1", 4.6, 5.0, 40, 2000, "ткань", "http://www.russianarms.ru/forum/index.php/topic,1533.0.html", "/imgs/6b15.jpg", "");
        Vest b19 = new Vest("6Б19", "Бронежилет для наружных боевых постов\n" +
                "кораблей и морской пехоты 6Б19", "специальный", "1", 2.8, 6.9, 28, 2003, "ткань", "http://www.russianarms.ru/forum/index.php/topic,1534.0.html", "/imgs/6b17.jpg", "Запас плавучести – от 3 до 6 кг");
        Vest b20 = new Vest("6Б20", "6Б20 - бронежилет для боевых пловцов ВМФ", "специальный", "1", 2.5, 4.3, 32, 2003, "ткань", "http://www.russianarms.ru/forum/index.php/topic,1535.0.html", "/imgs/6b20.jpg", "");
        Vest b21 = new Vest("6Б21", "Боевые защитные комплекты 6Б21 и 6Б22 \"Пермячка-О\"", "специальный", "3", 8.5, 11.0, 160, 2004, "керамика", "http://www.russianarms.ru/forum/index.php/topic,1536.0.html", "/imgs/6b21.jpg", "Имеет пламезащитные рукава и штаны");
        Vest b23 = new Vest("6Б23", "Общевойсковой бронежилет 6Б23 \n" +
                "(6Б23-1, 6Б23-2)", "общевойсковой", "3", 3.6, 10.2, 48, 2003, "сталь", "http://www.russianarms.ru/forum/index.php/topic,1537.0.html", "/imgs/6b23.jpg", "");
        Vest b24 = new Vest("6Б24", "Бронекомплект для старшего командного\n" +
                "состава 6Б24 \"Земляника-О\"", "специальный", "2", 4.5, 5.0, 45, 2001, "ткань", "http://www.russianarms.ru/forum/index.php/topic,1538.0.html", "/imgs/6b24.jpg", "Есть летний и зимний варианты");
        Vest b25 = new Vest("6Б25", "Защитный комплект для экипажей БМ ракетных войск и артиллерии 6Б25", "специальный", "1", 6.5, 6.5, 45, 2003, "ткань", "http://www.russianarms.ru/forum/index.php/topic,1532.0.html", "/imgs/6b25.jpg", "Содержит огнезащитный костюм, вариант развития 6Б15 «Ковбой»");
        Vest b43 = new Vest("6Б43", "Общевойсковой штурмовой бронежилет \n" +
                "6Б43 \"Забрало-Ш\"", "общевойсковой", "6а", 4.5, 15.0, 68, 2010, "керамика", "http://www.russianarms.ru/forum/index.php/topic,6684.0.html?PHPSESSID=k9f2n8bgvcaoe2b9o145c7abk6", "/imgs/6b43.jpg", "");

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

        final String[] allVests = {"6Б2", "6Б3", "6Б4", "6Б5", "6Б11", "6Б15", "6Б17", "6Б19", "6Б20", "6Б21", "6Б23", "6Б24", "6Б25", "6Б43",};


        final HashMap fields = new HashMap();


        fields.put(0, "specialTypeBox");
        fields.put(1, "defenceBox");
        fields.put(2, "matherialBox");
        fields.put(3, "armorTypeBox");
        fields.put(4, "weightMaxVal");
        fields.put(5, "weightMinVal");
        fields.put(6, "armorAreaVal");
        fields.put(7, "yearDestribVal");

        final HashMap fieldsVest = new HashMap();

        fieldsVest.put("specialTypeBox", "\"общевойсковой\" или \"специальный\"");
        fieldsVest.put("defenceBox", "\"защита от\"");
        fieldsVest.put("matherialBox", "материал");
        fieldsVest.put("armorTypeBox", "класс защиты");
        fieldsVest.put("weightMaxVal", "максимальный вес");
        fieldsVest.put("weightMinVal", "минимальный вес");
        fieldsVest.put("armorAreaVal", "площадь защиты (в дм2)");
        fieldsVest.put("yearDestribVal", "год принятия на вооружение");

        changeStyle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon startPage = new ImageIcon(getClass().getResource("/imgs/startPage.jpg"));

                if (e.getActionCommand() == "comboBoxChanged") {
                    if (changeStyle.getSelectedItem() == "Опознавание") {
                        Head.setFont(new Font(null, Font.PLAIN, 28));
                        testResult.setText("Введите параметры тестирования или выберите бронежилет \n для получения справки");
                        Head.setText("Опознавание");
                        setPicture(startPage);
                        startTest.setText("Начать опознавание");
                        clearFields();
                    }
                    if (changeStyle.getSelectedItem() == "Обучение") {
                        Head.setText("Обучение");
                        testResult.setText("Нажмите для получения вопроса -->>>");
                        setPicture(startPage);
                        startTest.setText("Получить вопрос");
                        clearFields();
                        questNumber = 0;
                        answers = "";
                    }
                    if (changeStyle.getSelectedItem() == "Описание") {
                        Head.setFont(new Font(null, Font.BOLD, 16));
                        testResult.setText("Выберите бронежилет -->>>");
                        Head.setText("Описание");
                        setPicture(startPage);
                        startTest.setText("Показать параметры");
                        clearFields();
                    }
                    if (changeStyle.getSelectedItem() == "...") {
                        Head.setFont(new Font(null, Font.BOLD, 18));
                        testResult.setText("Выберите режим (правый верхний угол)");
                        Head.setText("Экспертная система \"Бронежилеты\" 642 уч.вз. Марчук А.  ");
                        setPicture("/imgs/startPage.jpg");
                        startTest.setText("");
                        clearFields();
                    }
                }
            }
        });

        Documents.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent eee) {
                try {
                    String sys = System.getProperty("os.name");
                    if (sys.startsWith("Windows")) {
                        Runtime runtime = Runtime.getRuntime();
                        Process process0 = runtime.exec(new String[]{"explorer", "/documents"});

                    } else {

                        Runtime runtime = Runtime.getRuntime();
                        Process process0 = runtime.exec(new String[]{"nautilus", "/home/amarch/Documents/Voenka/Expert/Ballistic-Vest-Expert/documents"});

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        startTest.addActionListener(new ActionListener() {
            Random i = new Random();
            Vest request;
            int curr = 0;
            String trueAnswer = "";
            String userAnswer = "";

            public void actionPerformed(ActionEvent e) {
                if (showVast.getSelectedItem() == "..." && startTest.getText() == "Начать опознавание") {

                    Vest request = getRequest();
                    Test(map, request);
                } else if (startTest.getText() == "Начать опознавание") {
                    Vest request = (Vest) map.get(showVast.getSelectedItem());
                    printVestInfo(request);
                }

                if (showVast.getSelectedItem() == "..." && startTest.getText() == "Показать параметры") {
                    testResult.setText("Выберите бронежилет --->>>");
                } else if (startTest.getText() == "Показать параметры") {
                    Vest request = (Vest) map.get(showVast.getSelectedItem());
                    printVestAllInfo(request);
                }


                if (startTest.getText() == "Получить вопрос" || startTest.getText() == "Дать ответ" || startTest.getText() == "Вывести результаты тестирования") {


                    if (showVast.getSelectedItem() == "..." && startTest.getText() == "Получить вопрос") {
                        clearFields();
                        testResult.setText("");
                        Head.setFont(new Font(null, Font.BOLD, 16));
                        questNumber += 1;
                        request = (Vest) map.get(allVests[i.nextInt(14)]);
                        curr = i.nextInt(8);
                        trueAnswer = getTrueAnswer(curr, request);

                        Head.setText("Введите " + fieldsVest.get(fields.get(curr)) + " у бронежилета " + request.nameShort + ".");
                        answers = answers + "Вопрос: \"Введите " + fieldsVest.get(fields.get(curr)) + " у бронежилета " + request.nameShort + ".\"\n";
                        startTest.setText("Дать ответ");

                    } else if (startTest.getText() == "Получить вопрос") {
                        clearFields();
                        questNumber += 1;
                        testResult.setText("");
                        Head.setFont(new Font(null, Font.BOLD, 16));

                        request = (Vest) map.get(showVast.getSelectedItem());
                        curr = i.nextInt(8);
                        trueAnswer = getTrueAnswer(curr, request);
                        Head.setText("Введите " + fieldsVest.get(fields.get(curr)) + " у бронежилета " + request.nameShort + ".");
                        answers = answers + "Вопрос: \"Введите " + fieldsVest.get(fields.get(curr)) + " у бронежилета " + request.nameShort + ".\"\n";
                        startTest.setText("Дать ответ");

                    } else if (startTest.getText() == "Дать ответ" && questNumber < 5) {
                        userAnswer = getUserAnswer(curr);
                        if (userAnswer.equals(trueAnswer)) {
                            answers = answers + "Верно! Вы ввели: " + userAnswer + "\n";
                        } else {
                            answers = answers + "Неверно! Вы ввели: " + userAnswer + "\n" + "Правильный ответ " + trueAnswer + "\n";
                        }
                        startTest.setText("Получить вопрос");

                    } else if (startTest.getText() == "Дать ответ" && questNumber == 5) {
                        userAnswer = getUserAnswer(curr);
                        if (userAnswer.equals(trueAnswer)) {
                            answers = answers + "Верно! Вы ввели: " + userAnswer + "\n";
                        } else {
                            answers = answers + "Неверно! Вы ввели: " + userAnswer + "\n" + "Правильный ответ " + trueAnswer + "\n";
                        }
                        startTest.setText("Вывести результаты тестирования");
                    } else if (startTest.getText() == "Вывести результаты тестирования") {
                        answers += "Количество верных ответов: ";
                        int rightNum = 0;

                        while (answers.contains("Верно!")) {
                            rightNum += 1;
                            answers = answers.replaceFirst("Верно!", "Верно.");
                        }
                        answers += String.valueOf(rightNum);
                        testResult.setText(answers);
                        questNumber = 0;
                        answers = "";
                        startTest.setText("Получить вопрос");
                    }
                }
            }
        });

    }

    public JPanel getForm() {
        return this.Main;
    }

    public Vest getRequest() {

        requestNumber = 0;

        String specialTypeBoxV = "";
        String armorTypeBoxV = "";
        double weightMinValV = 0;
        double weightMaxValV = 0;
        double armorAreaValV = 0;
        int yearDestribValV = 0;
        String matherialBoxV = "";
        String defenceBoxV = "";

        HashMap def = new HashMap();
        def.put("1", "осколки");
        def.put("2", "пистолет");
        def.put("3", "пистолет");
        def.put("4", "АК-74");
        def.put("5", "АК-74");
        def.put("5а", "АК-74");
        def.put("6", "винтовка СВД");
        def.put("6а", "винтовка СВД");

        if (specialTypeBox.getSelectedItem() != null) {
            specialTypeBoxV = (String) specialTypeBox.getSelectedItem();
            requestNumber += 1;
        }

        if (armorTypeBox.getSelectedItem() != null) {
            armorTypeBoxV = (String) armorTypeBox.getSelectedItem();
            requestNumber += 1;
            if (defenceBox.getSelectedItem() != null) {
                defenceBoxV = (String) defenceBox.getSelectedItem();
            }
        }

        if (!weightMinVal.getText().isEmpty()) {
            weightMinValV = Double.valueOf(weightMinVal.getText());
            requestNumber += 1;
        }

        if (!weightMaxVal.getText().isEmpty()) {
            weightMaxValV = Double.valueOf(weightMaxVal.getText());
            requestNumber += 1;
        }


        if (!armorAreaVal.getText().isEmpty()) {
            armorAreaValV = Double.valueOf(armorAreaVal.getText());
            requestNumber += 1;
        }

        if (!yearDestribVal.getText().isEmpty()) {
            yearDestribValV = Integer.valueOf(yearDestribVal.getText());
            requestNumber += 1;
        }

        if (matherialBox.getSelectedItem() != null) {
            matherialBoxV = (String) matherialBox.getSelectedItem();
            requestNumber += 1;
        }

        return new Vest(defenceBoxV, "", specialTypeBoxV, armorTypeBoxV, weightMinValV, weightMaxValV, armorAreaValV, yearDestribValV, matherialBoxV, "", "", "");
    }

    public void setPicture(String path) {
        Picture.setIcon(new ImageIcon(path));
    }

    public void setPicture(ImageIcon img) {
        Picture.setIcon(img);
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
        ImageIcon img = new ImageIcon(getClass().getResource(v.image));
        setPicture(img);

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
        defenceBox.setSelectedItem(def.get(v.armorClass));
        matherialBox.setSelectedItem(v.matherial);
        armorTypeBox.setSelectedItem(String.valueOf(v.armorClass));
        weightMaxVal.setText(String.valueOf(v.weightMax));
        weightMinVal.setText(String.valueOf(v.weightMin));
        armorAreaVal.setText(String.valueOf(v.armorArea));
        yearDestribVal.setText(String.valueOf(v.yearDestr));

        ImageIcon im = new ImageIcon(getClass().getResource(v.image));
        setPicture(im);
        Head.setText(v.nameFull);
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

        HashMap<Integer, String> result = new HashMap<Integer, String>();

        String[] allVests = {"6Б2", "6Б3", "6Б4", "6Б5", "6Б11", "6Б15", "6Б17", "6Б19", "6Б20", "6Б21", "6Б23", "6Б24", "6Б25", "6Б43",};

        testResult.setText("Результаты тестирования: \n");

        int i = 0;
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

            if (1.15 * request.weightMin >= map.get(s).weightMin && map.get(s).weightMin >= 0.85 * request.weightMin)
                map.get(s).approachFields += 1;

            if (map.get(s).weightMax <= 1.15 * request.weightMax && map.get(s).weightMax >= 0.85 * request.weightMax)
                map.get(s).approachFields += 1;

            if (map.get(s).armorArea >= 0.85 * request.armorArea && map.get(s).armorArea <= 1.15 * request.armorArea)
                map.get(s).approachFields += 1;

            if (map.get(s).yearDestr <= 1.15 * request.yearDestr && map.get(s).yearDestr >= 0.85 * request.yearDestr)
                map.get(s).approachFields += 1;

            if (map.get(s).matherial == "...") {
                map.get(s).approachFields += 1;
            } else {
                if (map.get(s).matherial == request.matherial)
                    map.get(s).approachFields += 1;
            }

            if (def.get(map.get(s).armorClass) == def.get(request.armorClass) || def.get(map.get(s).armorClass) == request.nameShort) {
                map.get(s).approachFields += 1;
            }


            if (map.get(s).approachFields >= requestNumber * 0.75) {
                result.put(map.get(s).approachFields, "Наиболее вероятный: " + map.get(s).nameShort);// + ":" + " совпадений " + String.valueOf(map.get(s).approachFields));
            }
            if (map.get(s).approachFields < requestNumber * 0.75 && map.get(s).approachFields > requestNumber * 0.5) {
                result.put(map.get(s).approachFields, "Вероятный: " + map.get(s).nameShort);// + ":" + " совпадений " + String.valueOf(map.get(s).approachFields));

            }
            if (map.get(s).approachFields <= requestNumber * 0.5 && map.get(s).approachFields >= requestNumber * 0.25) {
                result.put(map.get(s).approachFields, "Наименее вероятный: " + map.get(s).nameShort);// + ":" + " совпадений " + String.valueOf(map.get(s).approachFields));

            }
            i += 1;
        }

        TreeMap sortedResult = new TreeMap(result);
        for (Object j : sortedResult.keySet()) {
            testResult.setText(testResult.getText() + "  " + sortedResult.get(j) + "\n");
        }
    }


    public void clearFields() {
        ImageIcon startPage = new ImageIcon(getClass().getResource("/imgs/startPage.jpg"));
        specialTypeBox.setSelectedIndex(0);
        defenceBox.setSelectedIndex(0);
        matherialBox.setSelectedIndex(0);
        armorTypeBox.setSelectedIndex(0);
        weightMaxVal.setText("");
        weightMinVal.setText("");
        armorAreaVal.setText("");
        yearDestribVal.setText("");
        setPicture(startPage);
    }


    public String getTrueAnswer(int i, Vest v) {

        HashMap def = new HashMap();
        def.put("1", "осколки");
        def.put("2", "пистолет Токарева");
        def.put("3", "пистолет Токарева");
        def.put("4", "автомат АК-74");
        def.put("5", "автомат АК-74");
        def.put("5а", "автомат АК-74");
        def.put("6", "винтовка СВД");
        def.put("6а", "винтовка СВД");

        switch (i) {
            case 0:
                return v.specialType;
            case 1:
                return (String) def.get(v.armorClass);
            case 2:
                return v.matherial;
            case 3:
                return v.armorClass;
            case 4:
                return String.valueOf(v.weightMax);
            case 5:
                return String.valueOf(v.weightMin);
            case 6:
                return String.valueOf(v.armorArea);
            case 7:
                return String.valueOf(v.yearDestr);
        }

        return null;
    }

    public String getUserAnswer(int i) {

        switch (i) {
            case 0:
                return (String) specialTypeBox.getSelectedItem();
            case 1:
                return (String) defenceBox.getSelectedItem();
            case 2:
                return (String) matherialBox.getSelectedItem();
            case 3:
                return (String) armorTypeBox.getSelectedItem();
            case 4:
                return weightMaxVal.getText();
            case 5:
                return weightMinVal.getText();
            case 6:
                return armorAreaVal.getText();
            case 7:
                return yearDestribVal.getText();
        }

        return null;
    }


    public static void main(String[] args) {
        ExpertWindow w = new ExpertWindow();
    }
}