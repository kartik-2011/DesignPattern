package com.kartik.designpatterns.Builder;

public class Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;
    public static Builder getBuilder(){
        return new Builder();
    }

    public  Student(Builder builder){
        if(builder.getAge() < 20)
            throw new RuntimeException("Age shouldn't be less than 20");
         if(builder.getGradYear() > 2023) {
             throw new RuntimeException("Grad Year shouldn't be more than 2023");
         }
             this.name = builder.getName();
             this.age = builder.getAge();
             this.univName = builder.getUnivName();
             this.batch = builder.getBatch();
             this.psp = builder.getPsp();
             this.gradYear = builder.getGradYear();
             this.phoneNumber = builder.getPhoneNumber();
    }
}
