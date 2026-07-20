package com.kartik.designpatterns.BuilderOptimized.Builder;

public class  Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;
    public static Builder getBuilder(){
        return new Builder( );
    }

    private Student(Builder builder){
             this.name = builder.getName();
             this.age = builder.getAge();
             this.univName = builder.getUnivName();
             this.batch = builder.getBatch();
             this.psp = builder.getPsp();
             this.gradYear = builder.getGradYear();
             this.phoneNumber = builder.getPhoneNumber();
    }
    public static class Builder  {//inner class
        String name;
        int age;
        String univName;
        double psp;
        String batch;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name ) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build(){
            if(this.getAge() < 20)
                throw new RuntimeException("Age shouldn't be less than 20");
            if(this.getGradYear() > 2023) {
                throw new RuntimeException("Grad Year shouldn't be more than 2023");
            }
            return new Student(this);
        }
    }

}
