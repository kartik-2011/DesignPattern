package com.kartik.designpatterns.prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String Batch;
    private double avgBatchPsp;
    private double psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        Batch = student.Batch;
        this.avgBatchPsp = student.avgBatchPsp;
        this.psp = student.psp;
    }
    public Student(){
     }

    @Override
    public Student  clone() {
        return new Student(this);
    }
}
