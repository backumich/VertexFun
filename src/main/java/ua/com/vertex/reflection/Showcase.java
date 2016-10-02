package ua.com.vertex.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Showcase {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> clazz = Class.forName("ua.com.vertex.collections.CollectionsShowcase", true, Showcase.class.getClassLoader());
//        Class<?> innerClazz = Class.forName("ua.com.vertex.collections.MethodsShowcase.IntWrapper", true, Showcase.class.getClassLoader());


        Field field = clazz.getDeclaredField("field");
        field.setAccessible(true);
        field.set(clazz, 2);

        System.out.println(field.get(clazz));


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

}
