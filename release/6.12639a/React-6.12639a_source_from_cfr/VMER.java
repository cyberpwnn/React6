/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class VMER
extends IqTB {
    public VMER(String string) {
        super(string);
    }

    public String nextToken() throws gggG {
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            c = this.next();
        } while (VMER.vn(c) != false);
        if (c == '\"' || c == '\'') {
            char c2 = c;
            do {
                if ((c = this.next()) < ' ') {
                    throw this.STSP(mrFx$WjFM.d("\u4a55\u0a5d\u8591\ue789\u466f\ud447\u3bff\ua41c\u9c41\uc46a\u6829\u68ff\uc9c0\u6bc9\u947a\ufd7e\u5ba1\u630a\u3890\u3081"));
                }
                if (c == c2) {
                    return VMER.vn(stringBuilder);
                }
                VMER.vn(stringBuilder, c);
            } while (true);
        }
        do {
            block10 : {
                block9 : {
                    if (c == '\u0000') break block9;
                    if (VMER.vn(c) == false) break block10;
                }
                return VMER.vn(stringBuilder);
            }
            VMER.vn(stringBuilder, c);
            c = this.next();
        } while (true);
    }

    private static Object vn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

