/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class VCnE
extends FouE {
    public VCnE(String string) {
        super(string);
    }

    public String nextToken() throws TOKE {
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            c = this.next();
        } while (VCnE.HQ(c) != false);
        if (c == '\"' || c == '\'') {
            char c2 = c;
            do {
                if ((c = this.next()) < ' ') {
                    throw this.aLYV(KUXS$dwji.S("\u9cc0\u2511\ubf6d\u5bd6\uc286\u660a\u8de2\u6590\u8a50\ucd78\u1538\u91ab\u70fa\u5906\u009c\u08f0\u10cb\u605e\ua821\u2650"));
                }
                if (c == c2) {
                    return VCnE.HQ(stringBuilder);
                }
                VCnE.HQ(stringBuilder, c);
            } while (true);
        }
        do {
            block10 : {
                block9 : {
                    if (c == '\u0000') break block9;
                    if (VCnE.HQ(c) == false) break block10;
                }
                return VCnE.HQ(stringBuilder);
            }
            VCnE.HQ(stringBuilder, c);
            c = this.next();
        } while (true);
    }

    private static Object HQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

