package c.util;

public class FinalVariable {
    final int instanceVariable = 1;
    final static int classVariable = 1;

    public void method(final int parameter){
        final int localVariable;
        localVariable = 1;
        System.out.println(localVariable);

        // Error
        // localVariable = 2;
        // parameter = 2;
    }
}
