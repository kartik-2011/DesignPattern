package com.kartik.designpatterns.BuilderOptimized.Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Kartik");
//        builder.setAge(26);
//        builder.setBatch("Batch2025");
//        builder.setPsp(90.0);
//        builder.setPhoneNumber("8197592405");
//        builder.setGradYear(2022);
//
//        Student student = builder.build();
        Student student = Student.getBuilder()
                        .setName("Kartik")
                                .setAge(26)
                                        .setBatch("Batch2025")
                                                .setPsp(90.0)
                                                        .setPhoneNumber("8197592405")
                                                                .setGradYear(2022)
                                                                        .build();

        System.out.println("Debug");

    }
}
