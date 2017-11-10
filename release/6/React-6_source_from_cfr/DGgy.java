/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class DGgy {
    private FpQi eGpJ;
    private PBUD<FpQi> MRlW;
    private String name;

    public DGgy(String string, FpQi fpQi) {
        this.name = string;
        this.eGpJ = fpQi;
        this.MRlW = new PBUD();
    }

    public void mXJp(FpQi fpQi) {
        DGgy.hQ((PBUD)yy.h(this, 1535903517), fpQi);
    }

    public FpQi bWml() {
        return (FpQi)yy.h(this, 255854358);
    }

    public void ksfs(FpQi fpQi) {
        yy.E(this, 255854358, fpQi);
    }

    public PBUD<FpQi> hbQB() {
        return (PBUD)yy.h(this, 1535903517);
    }

    public String SeWl() {
        return DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(new StringBuilder(), this.bWml().UtMF()), this.bWml().get()), (ydHl)((Object)yy.p(-1628960997))), this.bWml().UtMF()), NVIs$JbpD.H("\ud54c")), this.bWml().getID()));
    }

    public String JtPF() {
        Object object = "";
        Object object2 = DGgy.hQ(this.hbQB());
        while (object2.hasNext()) {
            FpQi fpQi = (FpQi)object2.next();
            Object object3 = DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(new StringBuilder(), fpQi.UtMF()), fpQi.get()), (ydHl)((Object)yy.p(-1628960997))), fpQi.UtMF()), NVIs$JbpD.H("\ue538")), fpQi.getID()));
            object = DGgy.hQ(DGgy.hQ(DGgy.hQ(DGgy.hQ(new StringBuilder(), object), NVIs$JbpD.H("\ue538")), object3));
        }
        if (DGgy.hQ(object) < 2) {
            return object;
        }
        return DGgy.hQ(object, true);
    }

    public String getName() {
        return (String)yy.h(this, -615905510);
    }

    public void setName(String string) {
        yy.E(this, -615905510, string);
    }

    public void ksfs(PBUD<FpQi> pBUD) {
        yy.E(this, 1535903517, pBUD);
    }

    private static Object hQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

