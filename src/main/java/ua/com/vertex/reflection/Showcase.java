package ua.com.vertex.reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Showcase {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        myMethod();


//        Class<?> clazz = Class.forName("ua.com.vertex.collections.CollectionsShowcase", true, Showcase.class.getClassLoader());
//        Class<?> innerClazz = Class.forName("ua.com.vertex.collections.MethodsShowcase.IntWrapper", true, Showcase.class.getClassLoader());


//        Field field = clazz.getDeclaredField("field");
//        field.setAccessible(true);
//        field.set(clazz, 2);

//        System.out.println(field.get(clazz));


//        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
//
//        Arrays.stream(declaredConstructors).forEach(System.out::println);

//        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        Object o1 = declaredConstructor.newInstance();
//
//        System.out.println( o1);
//        Object o = clazz.newInstance();

//        Arrays.stream(clazz.getSigners()).forEach(System.out::println);


//        System.out.println(clazz.getEnclosingClass());

//        Arrays.stream(clazz.getDeclaredClasses()).forEach(System.out::println);
//        System.out.println();
//        Arrays.stream(clazz.getDeclaredClasses()).map(Class::getDeclaringClass).forEach(System.out::println);
//
//        System.out.println("Canonical name: " + clazz.getCanonicalName());
//        System.out.println("name: " + clazz.getName());
//        System.out.println("Simple name: " + clazz.getSimpleName());


// MethodsShowcase methodsShowcase = new MethodsShowcase();

//        Class<MethodsShowcase> methodsShowcaseClass = MethodsShowcase.class;
//
//        Class<? extends MethodsShowcase> aClass = methodsShowcase.getClass();

//        Arrays.stream(clazz.getMethods()).forEach(System.out::println);

//        System.out.println(clazz == aClass);
    }

    public static void myMethod() throws ClassNotFoundException {
        System.out.println(Arrays.toString(void.class.getDeclaredMethods()));

        //fixme: fix lombok

//        MyClass myObject = new MyClass(1, "Vasiliy", "Putin");
//        Class<? extends MyClass> aClass = myObject.getClass();

//        System.out.println(myObject);

//        Arrays.stream(aClass.getDeclaredFields())
//                .filter(field -> field.getName().contains("id") ||
//                        field.getName().contains("Id") ||
//                field.getName().contains("ID"))
//                .forEach(field -> {
//                    try {
//                        field.setAccessible(true);
//                        field.set(myObject,
//                                Integer.valueOf(field.get(myObject).toString()) + 1);
//                        System.out.println("Field changed!");
//                    } catch (Exception ignored){
//                        System.out.println(ignored);
//                    }
//                });

//        System.out.println(myObject);


    }

    private static <U> void arrayOut(U[] array) {

        Arrays.stream(array)
                .forEach(System.out::println);
    }

}
