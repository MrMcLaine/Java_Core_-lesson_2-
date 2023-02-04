package lesson19;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        Employee em = new Employee("Jack", 120333412, 2500);

        serialize(new File("serializationEmployee"), em);
        deserialize(new File("deserializationEmployee"), em.toString());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vasil", 144333444, 600));
        employeeList.add(new Employee("Bogdan", 144333445, 3200));
        employeeList.add(new Employee("Andriy", 144333446, 1400));
        employeeList.add(new Employee("Ostap", 144333447, 1000));
        employeeList.add(new Employee("Solomiya", 144333448, 4500));

        serialize(new File("serializationList"), (Serializable) employeeList);
        deserialize(new File("deserializationList"), employeeList.toString());

    }
    public static void serialize(File file, Serializable ob) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(ob);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        InputStream is;
        try {
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(is);
            ob = (Serializable) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ob);
    }

    public static void deserialize(File file, String data) {
        OutputStream os;
        try {
            os = new FileOutputStream(file);
            os.write(data.getBytes());
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        InputStream is;
        StringBuilder builder = new StringBuilder();
        try {
            is = new FileInputStream(file);
            int information = is.read();
            char c;

            while (information != -1) {
                c = (char) information;
                builder.append(c);
                information = is.read();
            }
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(builder);
    }
}
