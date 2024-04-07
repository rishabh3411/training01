package org.studyeasy;

public class person {
    private String name;
    private double age;
    private String gender;

    public person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(double age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
