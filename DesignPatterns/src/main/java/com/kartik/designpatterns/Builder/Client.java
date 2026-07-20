package com.kartik.designpatterns.Builder;

public class Client {
    public static void main(String[] args){
        Builder builder = Student.getBuilder();
        builder.setName("Kartik");
        builder.setAge(26 );
        builder.setBatch("Batch2025");
        builder.setPsp(90.0);
        builder.setPhoneNumber("8197592405");
        builder.setGradYear(2022);

        Student st = new Student(builder);
        System.out.println("Debug");

    }
}
