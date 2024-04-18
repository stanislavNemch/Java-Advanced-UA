package Lesson_5.Exercise_3;

class MyClass {
    private int field1;
    public String field2;
    protected double field3;

    public MyClass(int field1, String field2, double field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public MyClass(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField1() {
        return this.field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField2() {
        return this.field2;
    }

    public void setField3(double field3) {
        this.field3 = field3;
    }

    public double getField3() {
        return this.field3;
    }
}
