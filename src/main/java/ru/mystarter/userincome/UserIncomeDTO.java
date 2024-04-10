package ru.mystarter.userincome;

public class UserIncomeDTO {
    private long id;
    private double income;

    public UserIncomeDTO() {
    }

    public UserIncomeDTO(long id, double income) {
        this.id = id;
        this.income = income;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
