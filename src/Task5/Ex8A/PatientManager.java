package Task5.Ex8A;


public class PatientManager {

    Patient patient1 = new Patient(1, "Дятлов", "Андрей", "Сергеевич", "Минск ул.Некрасова д.14 кв.12", "+375291456885", 1251, "Гастрит");
    Patient patient2 = new Patient(2, "Зимин", "Сергей", "Геннадьевич", "Минск ул.Жукова д.45 кв.112", "+375294355666", 231, "Язва");
    Patient patient3 = new Patient(3, "Шляпа", "Виталий", "Иванович", "Минск ул.Лещнского д.6 кв.8", "+375297889562", 133, "Грипп");
    Patient patient4 = new Patient(4, "Кислица", "Анна", "Владимировна", "Минск ул.Рафиева д.1 кв.45", "+375293695271", 761, "Отравление");
    Patient patient5 = new Patient(5, "Заяц", "Евгений", "Олегович", "Минск пр-т.Победителей д.22 кв.160", "+375297745623", 23, "Грипп");
    Patient patient6 = new Patient(6, "Карпова", "Инна", "Викторовна", "Минск ул.Козлова д.2 кв.4", "+375292215678", 69, "Грипп");

    Patient[] patients = {patient1, patient2, patient3, patient4, patient5, patient6,};



    public void findPatientsByDiagnosis(String diagnosis) {
        System.out.printf("%2s %10s %14s %16s %35s %15s %15s %11s", "No", "Фамилия", "Имя", "Отчество", "Адрес", "Телефон", "Номер карты", "Диагноз");
        System.out.println();
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getDiagnosis().equalsIgnoreCase(diagnosis)) {
                patients[i].show();
            }
        }
    }
    public void findPatientsByNumberCard(int a,int b){
        System.out.printf("%2s %10s %14s %16s %35s %15s %15s %11s", "No", "Фамилия", "Имя", "Отчество", "Адрес", "Телефон", "Номер карты", "Диагноз");
        System.out.println();
        for (int i = 0; i < patients.length; i++){
            if (patients[i].getMedCard() >= a && patients[i].getMedCard() <= b){
                patients[i].show();
            }
        }
    }


}

