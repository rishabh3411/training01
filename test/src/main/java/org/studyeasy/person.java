package org.studyeasy;

public class person {
    private String name;
    private int age;
    private String gender;

    public person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
       this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age=age;
            return true;
        }else {
            return false;
        }

    }

    public void setGender(String gender) {
        this.gender = gender;
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
