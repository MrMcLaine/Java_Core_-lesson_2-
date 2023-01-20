package lesson14.first;

public class CustomClass implements Comparable<CustomClass> {
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

    @Override
    public int compareTo(CustomClass o) {
        return this.someInteger.compareTo(o.getSomeInteger());
    }
}
