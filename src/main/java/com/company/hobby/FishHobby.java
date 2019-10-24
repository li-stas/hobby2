package com.company.hobby;

public class FishHobby extends Hobby {
    private float nDayWeightFish;
    private double nTotalWeightFish;
    private long  nLong;
    private boolean lboolean;


    public int getnMonthBirthday() {        return nMonthBirthday;    }
    public void setnMonthBirthday(int nMonthBirthday) {        this.nMonthBirthday = nMonthBirthday;    }

    public byte getnDayBirthday() {        return nDayBirthday;    }
    public void setnDayBirthday(byte nDayBirthday) {        this.nDayBirthday = nDayBirthday;    }

    public short getnYearBirthday() {        return nYearBirthday;    }
    public void setnYearBirthday(short nYearBirthday) {        this.nYearBirthday = nYearBirthday;    }

    public float getnDayWeightFish() {            return nDayWeightFish;        }
    public void setnDayWeightFish(float nDayWeightFish) {            this.nDayWeightFish = nDayWeightFish;        }

    public double getnTotalWeightFish() {            return nTotalWeightFish;        }
    public void setnTotalWeightFish(double nTotalWeightFish) {            this.nTotalWeightFish = nTotalWeightFish;}

    public long getnLong() {        return nLong;    }
    public void setnLong(long nLong) {        this.nLong = nLong;    }


    public boolean isLboolean() {        return lboolean;    }
    public void setLboolean(boolean lboolean) {        this.lboolean = lboolean;    }

    //  конструктор


    public FishHobby(short i, int i1, byte b, int i2, int i3)  {
    }

    public FishHobby(short nYearBirthday, int nMonthBirthday, byte nDayBirthday, float nDayWeightFish, double nTotalWeightFish) {
        super(nYearBirthday, nMonthBirthday, nDayBirthday);
        this.nDayWeightFish = nDayWeightFish;
        this.nTotalWeightFish = nTotalWeightFish;
    }

    public FishHobby(float nDayWeightFish, double nTotalWeightFish) {
        this.nDayWeightFish = nDayWeightFish;
        this.nTotalWeightFish = nTotalWeightFish;
    }

    public String tellAboutHobby(){
        String str = String.format(
                "nYearBirthday=%d, nMonthBirthday=%d, nDayBirthday=%d,  nTotalWeightFish=%.3f, nDayWeightFish=%.3f, nLong=%d, boolean=%s",
                nYearBirthday,    nMonthBirthday,    nDayBirthday, nTotalWeightFish, nDayWeightFish, nLong, lboolean ? "TRUE" : "FALSE" );
        return str;
    }

    @Override
    public String toString() {
        return tellAboutHobby(); //super.toString();

    }

}


