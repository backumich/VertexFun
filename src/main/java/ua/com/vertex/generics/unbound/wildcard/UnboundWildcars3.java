package ua.com.vertex.generics.unbound.wildcard;

/**
 * Created by sweet_home on 04.03.17.
 */
public class UnboundWildcars3 {

    public static void main(String[] args) {
        Wildcards.Holder<?> holder1 = new Wildcards.Holder();
        Wildcards.Holder<? extends Object> holder2 = new Wildcards.Holder<Integer>();

        System.out.println(holder1 instanceof Wildcards.Holder<?>);
        System.out.println(holder1 instanceof Wildcards.Holder);

        System.out.println(holder1.getClass());
        System.out.println(holder2.getClass());

        holder1.set(null);
        holder2.set(null);

        Object o = holder1.get();
        Object o1 = holder2.get();

    }
}
