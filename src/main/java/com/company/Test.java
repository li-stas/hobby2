package com.company;
import com.company.hobby.FishHobby;
import com.company.hobby.Hobby;
import com.company.hobby.SkiHobby;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите чз пробел  (год месяц день сложность_трасс[LSE] ) ГГГГ ММ ДД SkyDiff");
        /*
        short nYearBirthday = scan.nextShort();
        int nMonthBirthday = scan.nextInt();
        byte nDayBirthday = scan.nextByte();
        String sSkiDifficulty = scan.next();

        char cSkiDifficulty = sSkiDifficulty.charAt(0);
        Hobby man3 = new SkiHobby(nYearBirthday, nMonthBirthday, nDayBirthday, cSkiDifficulty);
         */
        Hobby man3 = new SkiHobby();
        try {
            man3 = new SkiHobby(scan);
        } catch (InputMismatchException e) {
            System.out.println("Введенные данные не соответвуют требованиям");
        } catch (NoSuchElementException e) {
            System.out.println("Введенны не все значения");
        } finally {
            //
        }


        SkiHobby man1 = new SkiHobby();
        man1.setnYearBirthday((short) 1968);
        man1.setnMonthBirthday(3);
        man1.setnDayBirthday((byte) 24);
        man1.setcSkiDifficulty('E'); ////Blue - (L)ight, red - (S)imple,  black - (E)xperts.
        man1.setnDayDistance(36.500f);
        man1.setnTotalDistance(115.400);
        man1.setnLong(15);
        man1.setLboolean(false);

        // Hobby( short nYearBirthday, int  nMonthBirthday, byte nDayBirthday, char cSkiDifficulty);
        Hobby man2 = new FishHobby((short) 1997, (int) 9, (byte) 2, 15.100f, 56.400);

        Hobby[] aHb = {man1, man2, man3};

        for (Hobby oElem : aHb) {
            System.out.println(oElem.tellAboutHobby());
        }
    }
    /**
     * This method will add elements to an array and return the resulting array
     * @param arr
     * @param elements
     * @return
     */
    /*
    public static Object[] add(Object[] arr, Object... elements){
        Object[] tempArr = new Object[arr.length+elements.length];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);

        for(int i=0; i < elements.length; i++)
            tempArr[arr.length+i] = elements[i];
        return tempArr;
        }
     */
}
