package lesson16;

import old.lesson9.second.Methods;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class Main16 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
// 1

        Casino casino = new Casino("Victory", 150);

        Class<Casino> pc = Casino.class;

        String nameOfClass = pc.getName();
        System.out.println("Name of class ---" + nameOfClass);

        String simpleNameOfClass = pc.getSimpleName();
        System.out.println("Simple name of class ---" + simpleNameOfClass);

        int modifier = pc.getModifiers();
        String modifierText = Modifier.toString(modifier);
        System.out.println("Class modifier ----" + modifierText);

        Package classPackage = pc.getPackage();
        System.out.println("Class package is " + classPackage);

        Constructor<?>[] casinoConstructors = pc.getConstructors();

        for (int i = 0; i < casinoConstructors.length; i++) {
            System.out.println("Constructor #" + i + " - " + casinoConstructors[i]);
        }

        Field[] fields = pc.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            System.out.println("Field #" + i + " - " + fields[i]);
        }

//2

        Constructor<Casino> constructorWithName = pc.getConstructor(String.class, int.class);
        Casino newInstanceCasino = constructorWithName.newInstance("New Casino", 100);

        System.out.println(newInstanceCasino);

        Field moneyFondUpdated = pc.getField("moneyFond");
        moneyFondUpdated.set(newInstanceCasino, 99);

        System.out.println(newInstanceCasino);

//3

        Method[] methods = pc.getMethods();

        List<Method> toPrint = new ArrayList<>();

        for (Method method : methods) {
            System.out.println(method);
            if (method.getName().equalsIgnoreCase("myMethod")) {
                toPrint.add(method);
            }
        }

        System.out.println(toPrint.get(0).invoke(newInstanceCasino, "*", 1));
        System.out.println(toPrint.get(1).invoke(newInstanceCasino, "*"));

    }
}
