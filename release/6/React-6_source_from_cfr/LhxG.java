/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class LhxG {
    private qTAY gEwU = new qTAY();
    private qTAY kuGc;

    public LhxG(ydHl ydHl2, ydHl ydHl3, ydHl ydHl4) {
        String[] arrstring = new String[8];
        arrstring[0] = LhxG.Yp(ydHl2);
        arrstring[1] = LhxG.Yp(ydHl2);
        arrstring[2] = LhxG.Yp(ydHl2);
        arrstring[3] = LhxG.Yp(ydHl3);
        arrstring[4] = LhxG.Yp(ydHl4);
        arrstring[5] = LhxG.Yp(ydHl4);
        arrstring[6] = LhxG.Yp(ydHl4);
        arrstring[7] = LhxG.Yp(ydHl3);
        this.kuGc = new qTAY(arrstring);
    }

    public String toString() {
        return LhxG.Yp(LhxG.Yp(new StringBuilder((String)LhxG.Yp(LhxG.Yp((qTAY)yy.h(this, 2102133519)))), LhxG.Yp((qTAY)yy.h(this, -1154087963))));
    }

    private static Object Yp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

