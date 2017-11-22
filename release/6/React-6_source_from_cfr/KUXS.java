/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class KUXS {
    private FMwy YyKt = new FMwy();
    private FMwy APeP;

    public KUXS(APKB aPKB, APKB aPKB2, APKB aPKB3) {
        String[] arrstring = new String[8];
        arrstring[0] = KUXS.tl(aPKB);
        arrstring[1] = KUXS.tl(aPKB);
        arrstring[2] = KUXS.tl(aPKB);
        arrstring[3] = KUXS.tl(aPKB2);
        arrstring[4] = KUXS.tl(aPKB3);
        arrstring[5] = KUXS.tl(aPKB3);
        arrstring[6] = KUXS.tl(aPKB3);
        arrstring[7] = KUXS.tl(aPKB2);
        this.APeP = new FMwy(arrstring);
    }

    public String toString() {
        return KUXS.tl(KUXS.tl(new StringBuilder((String)KUXS.tl(KUXS.tl((FMwy)cv.b(this, 1251079941)))), KUXS.tl((FMwy)cv.b(this, -2137655545))));
    }

    private static Object tl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

