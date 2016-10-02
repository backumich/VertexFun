package ua.com.vertex.generics.unbound.wildcard;

/**
 * Created by sweet_home on 01.10.16.
 */
public class CaptureConversion {
    static <T> void f1(Wildcards.Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Wildcards.Holder<?> holder) {
        f1(holder); // Call with captured type
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Wildcards.Holder raw = new Wildcards.Holder<Integer>(1);
        // f1(raw); // Produces warnings
        f2(raw); // No warnings
        Wildcards.Holder rawBasic = new Wildcards.Holder();
        rawBasic.set(new Object()); // Warning
        f2(rawBasic); // No warnings
        // Upcast to Holder<?>, still figures it out:
        Wildcards.Holder<?> wildcarded = new Wildcards.Holder<Double>(1.0);
        f2(wildcarded);
    }

}
