package com.company;

import com.company.hobby.Hobby;
import com.company.hobby.SkiHobby;

public class Main {
    public static void main( String[] args ) {
        SkiHobby man1 = new SkiHobby();
        man1.setnYearBirthday((short) 1968);
        man1.setnMonthBirthday(3);
        man1.setnDayBirthday((byte) 24);
        man1.setcSkiDifficulty('E'); ////Blue - (L)ight, red - (S)imple,  black - (E)xperts.
        man1.setnDayDistance(36.500f);
        man1.setnTotalDistance(115.400);
        man1.setnLong(15);
        man1.setLboolean(false);

        //Hobby man2 = new Hobby(20,(byte)21,'B',(short) 24,25,26,27,true);
        // Hobby( short nYearBirthday, int  nMonthBirthday, byte nDayBirthday, char cSkiDifficulty);
        Hobby man2 = new SkiHobby( (short) 1997, (int) 9, (byte) 2, 'S');
        Hobby aHb[] = {man1, man2};

        for ( Hobby oElem : aHb  ) {
            System.out.println( oElem.tellAboutHobby() );
        }

        /*for ( Hobby oElem : aHb  ) {
            System.out.println( oElem.toString() );
        }*/

    }

}
