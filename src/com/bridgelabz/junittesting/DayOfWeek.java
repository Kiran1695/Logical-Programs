package com.bridgelabz.junittesting;

public class DayOfWeek {
    public static int dayOfWeek(int day, int month, int year) {
        int day0, month0, year0, x;
        year0 = year - (14 - month) / month;
        x = year0 + year0 / 4 - year0 / 100 + year0 / 400;
        month0 = month + 12 * ((14 - month) / 12) - 2;
        day0 = (day + x + 31 * month0 / 12) % 7;

        return day0;
    }

    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        int dayOfWeek = dayOfWeek(day, month, year);
        switch (dayOfWeek) {
            case 0:
                System.out.println("Day Of The Week For " + day + "/" + month + "/" + year + " is: SUNDAY");
                break;
            case 1:
                System.out.println("Day Of The Week For " + day + "/" + month + "/" + year + " is: MONDAY");
                break;
            case 2:
                System.out.println("Day Of The Week For " + day + "/" + month + "/" + year + " is: TUESDAY");
                break;
            case 3:
                System.out.println("Day Of The Week For " + day + "/" + month + "/" + year + " is: WEDNESDAY");
                break;
            case 4:
                System.out.println("Day Of The Week For " + day + "/" + month + "/" + year + " is: THURSDAY");
                break;
            case 5:
                System.out.println("Day Of The Week For " + day + "/" + month + "/" + year + " is: FRIDAY");
                break;
            case 6:
                System.out.println("Day Of The Week For " + day + "/" + month + "/" + year + " is: SATURDAY");
        }
    }
}
