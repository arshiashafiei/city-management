package Main;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String birthCity;
    private String job;
    private String gender;
    private double salary;

    public Person(String firstName, String lastName, int birthYear, String birthCity, String job, String gender, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthCity = birthCity;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "firstName: " + firstName + '\n' +
                "lastName: " + lastName + '\n' +
                "birthYear: " + birthYear + '\n' +
                "birthCity: " + birthCity + '\n' +
                "job: " + job + '\n' +
                "gender: " + gender + '\n' +
                "salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (birthYear != person.birthYear) return false;
        if (Double.compare(person.salary, salary) != 0) return false;
        if (!Objects.equals(firstName, person.firstName)) return false;
        if (!Objects.equals(lastName, person.lastName)) return false;
        if (!Objects.equals(birthCity, person.birthCity)) return false;
        if (!Objects.equals(job, person.job)) return false;
        return Objects.equals(gender, person.gender);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthCity() {
        return this.birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
