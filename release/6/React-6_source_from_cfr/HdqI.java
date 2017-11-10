/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class HdqI
extends RjaO {
    public HdqI(String string) {
        super(string);
    }

    public String nextToken() throws Bkpl {
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            c = this.next();
        } while (HdqI.BC(c) != false);
        if (c == '\"' || c == '\'') {
            char c2 = c;
            do {
                if ((c = this.next()) < ' ') {
                    throw this.ePQp(NVIs$JbpD.H("\u1300\uda6b\ued7e\ufbdb\u384d\ub851\u900d\uc8e9\ue36f\u880e\u5e5d\u82b1\ued6c\ubd62\udf0d\u3c2e\u1bed\u3684\u124b\u93bf"));
                }
                if (c == c2) {
                    return HdqI.BC(stringBuilder);
                }
                HdqI.BC(stringBuilder, c);
            } while (true);
        }
        do {
            block10 : {
                block9 : {
                    if (c == '\u0000') break block9;
                    if (HdqI.BC(c) == false) break block10;
                }
                return HdqI.BC(stringBuilder);
            }
            HdqI.BC(stringBuilder, c);
            c = this.next();
        } while (true);
    }

    private static Object BC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

