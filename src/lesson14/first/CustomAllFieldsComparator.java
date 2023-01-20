package lesson14.first;

import java.util.Comparator;

public class CustomAllFieldsComparator implements Comparator<CustomClass> {
    @Override
    public int compare(CustomClass o1, CustomClass o2) {
        if(o1.getSomeString().compareTo(o2.getSomeString()) > 0 ) {
            return 1;
        } else if (o1.getSomeString().compareTo(o2.getSomeString()) < 0){
            return -1;
        } else {
            if(o1.getSomeInteger() > o2.getSomeInteger()) {
                return 1;
            } else if (o1.getSomeInteger() < o2.getSomeInteger()) {
                return -1;
            }
        }
        return 0;
    }
}
