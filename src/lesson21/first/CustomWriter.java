package lesson21.first;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CustomWriter {


    public static void main(String[] args) {

        File file = new File("newCustomFile");
        List<Field> listToWrite = getAnnotationValue(Purchase.class);
        writeUsingSS(file, listToWrite);
    }

    public static void writeUsingSS(File file, List<Field> fields) {
        try {
            Writer wr = new FileWriter(file);
            for (Field field : fields) {
                wr.write(String.valueOf(field));
            }
            wr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Field> getAnnotationValue(Class<?> customClass) {
        List<Field> listToWrite = new ArrayList<>();
        Field[] fields = customClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(CustomAnnotation.class) != null) {
                listToWrite.add(field);
            }
        }
        return listToWrite;
    }
}
