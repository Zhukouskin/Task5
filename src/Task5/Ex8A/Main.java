package Task5.Ex8A;
/*
Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PatientManager patientManager = new PatientManager();

        Scanner sc = new Scanner(System.in);

       System.out.println("Выберите критерий поиска пациентов: " + "\n" + "1. По диагнозу." + "\n" + "2. По номеру медицинской карты, находящейся в заданном диапазоне.");
       int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Введите диагноз , по которому хотите отсортировать пациентов: ");
            String diagnosis = sc.next();
            System.out.println("Список пациентов c данным диагнозом: ");
            patientManager.findPatientsByDiagnosis(diagnosis);
       }
        if (choice == 2){
            System.out.println("Введите значение начала диапазона поиска: ");
            int a = sc.nextInt();
            System.out.println("Введите значение конца диапазона поиска: ");
            int b = sc.nextInt();
            System.out.println("Список пациентов , чьи номера карт находятся в заданном диапазоне: ");
            patientManager.findPatientsByNumberCard(a,b);

        }

    }
}
