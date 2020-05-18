package Domains;

import java.sql.Date;

public class employee {
    private long id;
    private String name;
    private String surname;
    private Date birthday;
    private double salary;
    private String position;


    public employee() {

    }

    public employee(String name, String surname, Date birthday, Double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        this.position = position;
    }

    public employee(long id, String name, String surname, Date birthday, Double salary, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.birthday = birthday;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }

    public String getPosition() { return position; }

    public void setPosition(String position) { this.position = position; }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}
