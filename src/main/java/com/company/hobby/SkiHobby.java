package com.company.hobby;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SkiHobby extends Hobby {
    private char cSkiDifficulty; //Blue - light, red - simple,  black - for experts.
    private float nDayDistance;
    private double nTotalDistance;
    private long  nLong;
    private boolean lboolean;


    public int getnMonthBirthday() {        return nMonthBirthday;    }
    public void setnMonthBirthday(int nMonthBirthday) {        this.nMonthBirthday = nMonthBirthday;    }

    public byte getnDayBirthday() {        return nDayBirthday;    }
    public void setnDayBirthday(byte nDayBirthday) {        this.nDayBirthday = nDayBirthday;    }

    public char getcSkiDifficulty() {        return cSkiDifficulty;    }
    public void setcSkiDifficulty(char cSkiDifficulty) {        this.cSkiDifficulty = cSkiDifficulty;    }

    public short getnYearBirthday() {        return nYearBirthday;    }
    public void setnYearBirthday(short nYearBirthday) {        this.nYearBirthday = nYearBirthday;    }

    public long getnLong() {        return nLong;    }
    public void setnLong(long nLong) {        this.nLong = nLong;    }

    public double getnTotalDistance() {        return nTotalDistance;    }
    public void setnTotalDistance(double nTotalDistance) {        this.nTotalDistance = nTotalDistance;    }

    public float getnDayDistance() {        return nDayDistance;    }
    public void setnDayDistance(float nDayDistance) {        this.nDayDistance = nDayDistance;    }

    public boolean isLboolean() {        return lboolean;    }
    public void setLboolean(boolean lboolean) {        this.lboolean = lboolean;    }

    //  конструктор
    /*public Hobby( int  nMonthBirthday, byte nDayBirthday, char cSkiDifficulty, short nYearBirthday,
                  long  nLong, double nTotalDistance, float nDayDistance, boolean lboolean)     {
        this.nMonthBirthday = nMonthBirthday;
        this.nDayBirthday = nDayBirthday;
        this.nYearBirthday = nYearBirthday;
        this.cSkiDifficulty = cSkiDifficulty;
        this.nLong = nLong;
        this.nTotalDistance = nTotalDistance;
        this.nDayDistance = nDayDistance;
        this.lboolean = lboolean;
    }*/

    public SkiHobby()  {
    }

    public SkiHobby(short nYearBirthday, int nMonthBirthday, byte nDayBirthday, char cSkiDifficulty) {
        super(nYearBirthday, nMonthBirthday, nDayBirthday );
        this.cSkiDifficulty = cSkiDifficulty;
    }
    public SkiHobby(Scanner scan) throws InputMismatchException, NoSuchElementException {
        super((short) 0, (int) 0, (byte) 0 );

        String cLine = scan.nextLine();
        String[] aLine = cLine.split(" ");
        if (aLine.length != 4) {
            throw new NoSuchElementException(); // количество элемнтов #4
        }
        short nYYYY;
        try {
            nYYYY = Short.parseShort(aLine[0]); //1
        } catch (NumberFormatException e) {
            nYYYY = 0;
        }
        int nMM;
        try {
            nMM = Integer.parseInt(aLine[1]); //2
        } catch (NumberFormatException e) {
            nMM = 0;
        }
        byte nDD;
        try {
            nDD = Byte.parseByte(aLine[2]); //3
        } catch (NumberFormatException e) {
            nDD = 0;
        }
        if (nYYYY != 0 & nMM != 0 & nDD != 0) {
            //
        } else {
            throw new InputMismatchException();
        }
        if ( !(nYYYY >= 2019 - 100 & (nMM >=1 & nMM <=12) & (nDD >=1 & nDD<=31))) {
            throw new InputMismatchException();
        }
        // sSkiDifficulty
        String sSkiDifficulty = aLine[3]; //4
        if ( sSkiDifficulty.length() != 1 ) {
            throw new InputMismatchException();
        }
        if (!(sSkiDifficulty.contains("L") || sSkiDifficulty.contains("S") || sSkiDifficulty.contains("E"))) { // вторго = M || F
            throw new InputMismatchException();
        }
        this.nMonthBirthday = nMM;
        this.nDayBirthday = nDD;
        this.nYearBirthday = nYYYY;
        this.cSkiDifficulty = cSkiDifficulty;
    }

    public String tellAboutHobby(){
        String str = String.format(
                "nYearBirthday=%d, nMonthBirthday=%d, nDayBirthday=%d, cSkiDifficulty=%c, nTotalDistance=%.3f, nDayDistance=%.2f, nLong=%d, boolean=%s",
                nYearBirthday,    nMonthBirthday,    nDayBirthday, cSkiDifficulty, nTotalDistance, nDayDistance, nLong, lboolean ? "TRUE" : "FALSE" );
        return str;
    }

    @Override
    public String toString() {
        return tellAboutHobby(); //super.toString();

    }

}
