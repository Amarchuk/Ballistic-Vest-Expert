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
    public int armorClass;
    public float weightMin;
    public float weightMax;
    public float armorArea;
    public int yearDestr;
    public String matherial;
    public String url;
    public String image;
    public int approachFields;

    public Vest(String nameS, String nameF, String specT, int armorC, float weightMin, float weightMax, float armorArea, int yearDestr, String matherial, String url, String image) {
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
    }
}