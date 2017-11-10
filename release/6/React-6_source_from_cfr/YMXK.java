/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class YMXK
implements wncc {
    private aKuV<File, Long> tKvE = new aKuV();
    private aKuV<File, Long> brXB = new aKuV();
    private aKuV<File, Runnable> VMRM = new aKuV();

    public void mXJp(File file, Runnable runnable) {
        YMXK.eE((aKuV)yy.h(this, 1882515695), file, YMXK.eE(YMXK.eE(file)));
        YMXK.eE((aKuV)yy.h(this, -1441994555), file, YMXK.eE(YMXK.eE(file)));
        YMXK.eE((aKuV)yy.h(this, 435873987), file, runnable);
        YMXK.eE(YMXK.eE(YMXK.eE(new StringBuilder(KDGY$JAHk.Y("\u1638\uf671\uc84a\udf89\ufb96\uaf1d\u9617\u181c\u8169\u00db\u4f6b\ua480\ud51f\u6abd\ua41b\ud520\ub3db\u7f5d\ufa2a\u9a4e\ub6bc\u542d\ubc6d\u68dd\u4d73\u7074\u61b7")), YMXK.eE(file))));
    }

    public void ksfs(File file) {
        YMXK.eE((aKuV)yy.h(this, 1882515695), file);
        YMXK.eE((aKuV)yy.h(this, -1441994555), file);
        YMXK.eE((aKuV)yy.h(this, 435873987), file);
    }

    public void LhxG() {
        YMXK.eE((aKuV)yy.h(this, 1882515695));
        YMXK.eE((aKuV)yy.h(this, -1441994555));
        YMXK.eE((aKuV)yy.h(this, 435873987));
    }

    @Override
    public void AWsr() {
        Object object = YMXK.eE(YMXK.eE((aKuV)yy.h(this, 1882515695)));
        while (object.hasNext()) {
            File file = (File)object.next();
            try {
                block7 : {
                    block8 : {
                        if (YMXK.eE(file) == false) break block7;
                        if (YMXK.eE(file) != YMXK.eE((Long)YMXK.eE((aKuV)yy.h(this, 1882515695), file))) break block8;
                        if (YMXK.eE(file) == YMXK.eE((Long)YMXK.eE((aKuV)yy.h(this, -1441994555), file))) break block7;
                    }
                    YMXK.eE(YMXK.eE(YMXK.eE(new StringBuilder((String)YMXK.eE(YMXK.eE(file))), KDGY$JAHk.Y("\u4584\uedfa\uc5b3\uc3f8\u2f36\u536f\uca71\u1e28\ubce3"))));
                    ((Runnable)YMXK.eE((aKuV)yy.h(this, 435873987), file)).run();
                    YMXK.eE((aKuV)yy.h(this, 1882515695), file, YMXK.eE(YMXK.eE(file)));
                    YMXK.eE((aKuV)yy.h(this, -1441994555), file, YMXK.eE(YMXK.eE(file)));
                }
                if (YMXK.eE(file) != false) {
                    if (YMXK.eE(file) == false) continue;
                }
                YMXK.eE(YMXK.eE(YMXK.eE(new StringBuilder((String)YMXK.eE(YMXK.eE(file))), KDGY$JAHk.Y("\u4584\uedf3\uc5b9\uc3f0\u2f3a\u537d\uca7d\u1e29\ubcab\u0577\u22c9\u0a25\ucf31\ue332\ua1ed\u6311\ud99c\u92a1\ue864\u3838\u9516"))));
                this.ksfs(file);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public String LrGi() {
        return BkvY$LhxG.I("\ud1f8\ud0f0\ubbf5\u1709\u53cb\u1f0b\ua607\u45f3\u3f86\ue495");
    }

    private static Object eE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

