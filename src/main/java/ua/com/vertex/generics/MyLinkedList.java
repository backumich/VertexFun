package ua.com.vertex.generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.com.vertex.util.Apple;
import ua.com.vertex.util.Jonathan;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by sweet_home on 04.03.17.
 */
public class MyLinkedList<T> {

    private Holder head;
    private Holder current;

    public static void main(String[] args) {
//        MyLinkedList.Holder holder =
//                new MyLinkedList<String>().new Holder("", null);

        MyLinkedList<Apple> apples = new MyLinkedList<>();
//        apples.add(new Apple());
//        apples.add(new Jonathan());
        System.out.println(apples.get().orElse(new Apple()));

        List<Jonathan> toAdd = Collections.singletonList(new Jonathan());
//        apples.addAll(toAdd);
    }


//    public void add(T newElement){
//        Holder newHolder = new Holder(newElement, head);
//        head=newHolder;
//    }

//    public <U extends T> void addAll(Collection<U> toAdd){
//        toAdd.forEach(this::add);
//    }

    public Optional<T> get() {
        Optional<Holder> holderOptional = Optional.of(head);
//        head = holderOptional.map(Holder::getNext).orElse(null);
//        return holderOptional.map(Holder::getInstance);
        return null;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Holder {
        private T instance;
        private Holder next;

        public void myMethod(Class<T> clazz) {

            Class<?> aClass = instance.getClass();
            clazz.isInstance(instance);
            try {
                T newT = (T) aClass.newInstance();
//                newT.toString();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        public void superMethod(List<? super T> toConsume, List<? extends T> toProduce) {
            toConsume.add(instance);
//            toProduce.add(instance);

            instance = (T) toConsume.get(0);
            T t = toProduce.get(0);
        }
    }
}
