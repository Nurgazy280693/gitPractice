package com.digital.utils;

import com.digital.models.Student;
import com.github.javafaker.Faker;
import com.digital.models.UserToRegister;

public class FakeDataProvider {

    static Faker faiker = new Faker();

    public static String generateFakeFullName() {
        return faiker.name().fullName();
    }
    public static String generateFakeFirstName(){return faiker.name().firstName();}
    public static String generateFakeLustName(){return faiker.name().lastName();}
    public static String generateFakePhoneNumber(){return faiker.number().digits(10);}
    public static String generateFakeEmail() {return faiker.internet().emailAddress();}
    public static String generateFakeUserName(){return faiker.name().username();}
    public static String generateFakeCurrentAddress() {return faiker.address().fullAddress();}

    public static String generateFakePermanentAddress() {
        return faiker.address().streetName() + " " + faiker.address().streetAddressNumber();
    }

    public Student createFakeStudent(){
        Student student = new Student();
        student.setFirsName(generateFakeFirstName());
        student.setLastName(generateFakeLustName());
        student.setEmail(generateFakeEmail());
        student.setPhoneNumber(generateFakePhoneNumber());
        student.setCurrentAddress(generateFakeCurrentAddress());
        return student;
    }
    public UserToRegister createFakeUser(){
        UserToRegister user1 = new UserToRegister();
        user1.setFirsName(generateFakeFirstName());
        user1.setLastName(generateFakeLustName());
        user1.setUserName(generateFakeUserName());
        user1.setPassword("WordHello!1");
        return user1;
    }
}