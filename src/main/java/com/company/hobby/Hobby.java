package com.company.hobby;

public abstract class Hobby {
    protected byte nDayBirthday;
    protected int  nMonthBirthday;
    protected short nYearBirthday;

    public short getnYearBirthday() {
        return nYearBirthday;
    }
    public void setnYearBirthday(short nYearBirthday) {
        this.nYearBirthday = nYearBirthday;
    }

    public int getnMonthBirthday() {
        return nMonthBirthday;
    }
    public void setnMonthBirthday(int nMonthBirthday) {
        this.nMonthBirthday = nMonthBirthday;
    }

    public byte getnDayBirthday() {
        return nDayBirthday;
    }
    public void setnDayBirthday(byte nDayBirthday) {
        this.nDayBirthday = nDayBirthday;
    }

    public Hobby( short nYearBirthday, int  nMonthBirthday, byte nDayBirthday)  {
        this.nMonthBirthday = nMonthBirthday;
        this.nDayBirthday = nDayBirthday;
        this.nYearBirthday = nYearBirthday;

    }
    public Hobby()  {
    }

    public abstract String tellAboutHobby();

    @Override
    public String toString() {
        return tellAboutHobby(); //super.toString();

    }
}
