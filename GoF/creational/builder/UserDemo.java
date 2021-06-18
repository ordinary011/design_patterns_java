package com.patterns.GoF.creational.builder;

public class UserDemo {
    public static void main(String[] args) {
        User mainUser = new User.UserBuilder().withName("john").withLastName("white").withAge(44).build();
        System.out.println(mainUser);
    }
}

class User {
    private String name;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder {
        private String name;
        private String lastName;
        private int age;

        public UserBuilder() {
        }

        public UserBuilder withName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withAge(int age){
            this.age = age;
            return this;
        }

        public User build(){
            User user = new User();
            user.name = this.name;
            user.lastName = this.lastName;
            user.age = this.age;
            return user;
        }
    }

    private User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}