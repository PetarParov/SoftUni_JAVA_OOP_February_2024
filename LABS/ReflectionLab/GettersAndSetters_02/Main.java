package ReflectionLab.GettersAndSetters_02;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflectionClass = Reflection.class;

        Method[] declaredMethods = reflectionClass.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method declaredMethod : declaredMethods) {
            boolean isGetter = declaredMethod.getName().startsWith("get");
            boolean hasZeroParam = declaredMethod.getParameterTypes().length == 0;
            boolean hasReturnType = declaredMethod.getReturnType()
                    .getSimpleName().equalsIgnoreCase("void");
            boolean isSetter = declaredMethod.getName().startsWith("set");
            boolean hasOneParam = declaredMethod.getParameterTypes().length == 1;

            if (isGetter && hasZeroParam && !hasReturnType) {
                getters.add(declaredMethod);
            } else if (isSetter && hasOneParam && hasReturnType) {
                setters.add(declaredMethod);
            }
        }

        getters.stream().sorted(Comparator.comparing(Method::getName))
                .forEach(m -> {
                    String format = "%s will return class %s";
                    System.out.println(String.format(format, m.getName(), m.getReturnType().getName()));
                });


        setters.stream().sorted(Comparator.comparing(Method::getName))
                .forEach(m -> {
                    String format = "%s and will set field of class %s";
                    System.out.println(String.format(format, m.getName(),
                            m.getParameterTypes()[0].getName()));
                });

    }

}