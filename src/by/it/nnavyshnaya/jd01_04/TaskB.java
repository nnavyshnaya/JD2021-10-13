package by.it.nnavyshnaya.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        System.out.print("Введите количество человек: ");
        Scanner scan=new Scanner(System.in);
        int people=scan.nextInt();
        String [] surnames = new String[people];
        for (int i = 0; i < people; i++) {
            System.out.print("Введите фамилию:");
            surnames[i]= scan.next();
        }
        int [][] wages = new int[people][4];
        for (int i = 0; i < people; i++) {
            System.out.print("Введите зарплату для:"+" "+surnames[i]+" ");
            for (int j = 0; j < 4; j++) {
                wages[i][j]= scan.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Фамилия   Квартал1  Квартал2  Квартал3  Квартал4  Итого");
        System.out.println("-------------------------------------------------------");
        int total = 0;
        for (int i = 0; i < surnames.length; i++) {
            System.out.printf("%s: ", surnames[i]);
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-10d", wages[i][j]);
                sum += wages[i][j];
            }
            System.out.printf("%-4d\n", sum);
            total +=sum;
        }
        System.out.printf("Итого     %d\n",total);
        System.out.printf("Средняя   %7.4f\n", (double)total/people/4.0);
    }

}
  //  Введите с консоли число людей n (nextInt() в сканере).
   // Затем введите одномерный массив их фамилий (next() в сканере).
      //   Введите двумерный массив их зарплат за 4 квартала (N строк и 4 столбца).
        // Зарплаты имеют тип int.
      //   Нужно для каждой фамилии выводить подсказку
        // После подсказки можно через пробел вводить с консоли 4 цифры зарплат по кварталам (nextInt() в
       // сканере).

       //  Постройте в консоли таблицу доходов людей по кварталам с фамилиями и
        //итогом за год в последней колонке.