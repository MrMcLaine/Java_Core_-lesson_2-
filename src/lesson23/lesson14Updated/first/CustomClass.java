package lesson23.lesson14Updated.first;

public class CustomClass {
    private String someString;
    private Integer someInteger;

    public CustomClass(String someString, Integer someInteger) {
        this.someString = someString;
        this.someInteger = someInteger;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public Integer getSomeInteger() {
        return someInteger;
    }

    public void setSomeInteger(Integer someInteger) {
        this.someInteger = someInteger;
    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "someString='" + someString + '\'' +
                ", someInteger=" + someInteger +
                '}';
    }

}
