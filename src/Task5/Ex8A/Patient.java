package Task5.Ex8A;

public class Patient {
    private int id;
    private String surName;
    private String name;
    private String midName;
    private String address;
    private String phoneNumber;
    private int medCard;
    private String diagnosis;

    public Patient(int id, String surName, String name, String midName, String address, String phoneNumber, int medCard, String diagnosis) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.midName = midName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medCard = medCard;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void show() {
        System.out.printf("%2s %10s %14s %16s %35s %15s %15s %11s", getId(), getSurName(), getName(), getMidName(), getAddress(), getPhoneNumber(), getMedCard(), getDiagnosis());
        System.out.println();
    }

}
