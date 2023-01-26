package lesson17;

import java.util.ArrayList;
import java.util.List;

public interface Iterator {
    boolean hasNext();

    Object next();
}

class Collection {
    private static Number[] arr;

    public Collection(Number[] arr) {
        Collection.arr = arr;
    }

    public class Forward implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < arr.length;
        }

        @Override
        public Number next() {
            Integer current = (Integer) arr[count++];
            int result = current % 2 == 0 ? current : 0;
            return result;
        }
    }

    public Collection.Forward createForward() {
        return new Collection.Forward();
    }

    public class Backward implements Iterator {
        private int count = arr.length % 2 == 0 ? arr.length - 1 : arr.length - 2;

        @Override
        public boolean hasNext() {
            return count >= 1;
        }

        @Override
        public Object next() {
            Number n = arr[count--];
            count--;
            return n;
        }
    }

    public Collection.Backward createBackward() {
        return new Collection.Backward();
    }

    public Print createPrint() {
        return new Print() {
            @Override
            public void print() {
                for (Number n : analyzeArray()) {
                    System.out.println(n);
                }
            }

            @Override
            public List<Number> analyzeArray() {
                List<Number> result = new ArrayList<>();
                int counter = 0;
                for (int i = arr.length - 1; i > 0; i--) {
                    int numCurrent = (Integer) arr[i];
                    if (counter == 2 && numCurrent % 2 == 0) {
                        result.add(arr[i]);
                        counter = 0;
                    } else if (counter < 2) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }
                return result;
            }
        };
    }

    public Print someLocal() {
        class LocalCustom implements Print {

            @Override
            public void print() {
                for (Number n : analyzeArray()) {
                    System.out.println(n);
                }
            }

            @Override
            public List<Number> analyzeArray() {
                List<Number> result = new ArrayList<>();
                int counter = 0;
                for (int i = arr.length - 1; i > 0; i--) {
                    int numCurrent = (Integer) arr[i];
                    if (counter == 4 && numCurrent % 2 == 0) {
                        int current = (Integer) arr[i] - 100;
                        result.add(current);
                        counter = 0;
                    } else if (counter < 4) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }
                return result;
            }
        }
        return new LocalCustom();
    }

    private static class SomeStatic implements Print {

        @Override
        public void print() {
            for (Number n : analyzeArray()) {
                System.out.println(n);
            }
        }

        @Override
        public List<Number> analyzeArray() {
            List<Number> result = new ArrayList<>();
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                int numCurrent = (Integer) arr[i];
                if (counter == 1 && numCurrent % 2 == 0) {
                    int current = (Integer) arr[i] - 1;
                    result.add(current);
                    counter = 0;
                } else if (counter == 0) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
            return result;
        }
    }

    public static SomeStatic createSomeStatic() {
        return new SomeStatic();
    }
}
