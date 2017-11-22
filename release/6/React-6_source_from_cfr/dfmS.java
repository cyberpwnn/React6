/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class dfmS
implements XSJd {
    private ktOu<File, Long> eIDU = new ktOu();
    private ktOu<File, Long> jqdg = new ktOu();
    private ktOu<File, Runnable> Aioh = new ktOu();

    public void ssNb(File file, Runnable runnable) {
        dfmS.nN((ktOu)cv.b(this, -973540381), file, dfmS.nN(dfmS.nN(file)));
        dfmS.nN((ktOu)cv.b(this, 2083189741), file, dfmS.nN(dfmS.nN(file)));
        dfmS.nN((ktOu)cv.b(this, -1188826129), file, runnable);
        dfmS.nN(dfmS.nN(dfmS.nN(new StringBuilder(KUXS$dwji.S("\uef08\u31c0\u6091\u3c2c\u8e7e\ub736\ua16d\u288d\u5c96\u4418\u5aeb\ud74c\u1942\u0149\ue380\u2730\u7b4c\u31e3\u753e\uc3e5\u4188\ue825\ubf60\uc200\ue2e9\u17b6\u0728")), dfmS.nN(file))));
    }

    public void OXeK(File file) {
        dfmS.nN((ktOu)cv.b(this, -973540381), file);
        dfmS.nN((ktOu)cv.b(this, 2083189741), file);
        dfmS.nN((ktOu)cv.b(this, -1188826129), file);
    }

    public void gVhV() {
        dfmS.nN((ktOu)cv.b(this, -973540381));
        dfmS.nN((ktOu)cv.b(this, 2083189741));
        dfmS.nN((ktOu)cv.b(this, -1188826129));
    }

    @Override
    public void FFBA() {
        Object object = dfmS.nN(dfmS.nN((ktOu)cv.b(this, -973540381)));
        while (object.hasNext()) {
            File file = (File)object.next();
            try {
                block7 : {
                    block8 : {
                        if (dfmS.nN(file) == false) break block7;
                        if (dfmS.nN(file) != dfmS.nN((Long)dfmS.nN((ktOu)cv.b(this, -973540381), file))) break block8;
                        if (dfmS.nN(file) == dfmS.nN((Long)dfmS.nN((ktOu)cv.b(this, 2083189741), file))) break block7;
                    }
                    dfmS.nN(dfmS.nN(dfmS.nN(new StringBuilder((String)dfmS.nN(dfmS.nN(file))), YEBy$TyVf.W("\uedd0\u6196\ud3ba\u9cb6\u06e1\u3def\u8c1d\u249a\uce16"))));
                    ((Runnable)dfmS.nN((ktOu)cv.b(this, -1188826129), file)).run();
                    dfmS.nN((ktOu)cv.b(this, -973540381), file, dfmS.nN(dfmS.nN(file)));
                    dfmS.nN((ktOu)cv.b(this, 2083189741), file, dfmS.nN(dfmS.nN(file)));
                }
                if (dfmS.nN(file) != false) {
                    if (dfmS.nN(file) == false) continue;
                }
                dfmS.nN(dfmS.nN(dfmS.nN(new StringBuilder((String)dfmS.nN(dfmS.nN(file))), YEBy$TyVf.W("\uedd0\u619f\ud3b0\u9cbe\u06ed\u3dfd\u8c11\u249b\uce5e\ue157\u727d\ub0fd\u8ff0\u4cf5\u243b\u383e\u4c36\uaf13\u90e7\u4715\u701d"))));
                this.OXeK(file);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public String BuHU() {
        return KUXS$dwji.S("\u535a\u9a0a\u9026\uf144\u39bb\ue6cd\u4b3b\u3456\ufccb\u789b");
    }

    private static Object nN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

