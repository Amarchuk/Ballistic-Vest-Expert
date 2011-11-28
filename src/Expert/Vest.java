/*
 *  Date: 11/26/11
 *   Time: 20:13
 *   Author: 
 *      Alexander Marchuk
 *      aamarchuk@gmail.com
 */

package Expert;

public class Vest {
    public String nameShort;
    public String nameFull;
    public String specialType;
    public String armorClass;
    public double weightMin;
    public double weightMax;
    public double armorArea;
    public int yearDestr;
    public String matherial;
    public String url;
    public String image;
    public String Description;
    public int approachFields;

    public Vest(String nameS, String nameF, String specT, String armorC, double weightMin, double weightMax, double armorArea, int yearDestr, String matherial, String url, String image, String description) {
        this.nameShort = nameS;
        this.nameFull = nameF;
        this.specialType = specT;
        this.armorClass = armorC;
        this.weightMin = weightMin;
        this.weightMax = weightMax;
        this.armorArea = armorArea;
        this.yearDestr = yearDestr;
        this.matherial = matherial;
        this.url = url;
        this.image = image;
        this.approachFields = 0;
        this.Description = description;
    }

    public Vest(String nameS,String image ){
        this.nameShort = nameS;
        this.image = image;

    }
}