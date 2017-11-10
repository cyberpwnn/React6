/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class BIwj
implements wncc {
    private PBUD<FNTl> IiPh = new PBUD();
    private aKuV<String, VetS> LHGG = new aKuV();

    @Override
    public void AWsr() {
        Object object = BIwj.Du(BIwj.Du((PBUD)yy.h(this, -2094004835)));
        while (object.hasNext()) {
            FNTl fNTl = (FNTl)object.next();
            this.ksfs(fNTl);
            if (!fNTl.tBtv()) continue;
            this.mXJp(fNTl);
            BIwj.Du((PBUD)yy.h(this, -2094004835), fNTl);
        }
    }

    private void mXJp(FNTl fNTl) {
        BIwj.Du((aKuV)yy.h(this, -2082601578), fNTl.getName());
    }

    private void ksfs(FNTl fNTl) {
        if (BIwj.Du((aKuV)yy.h(this, -2082601578), fNTl.getName()) == false) {
            BIwj.Du((aKuV)yy.h(this, -2082601578), fNTl.getName(), new VetS());
        }
        VetS vetS = (VetS)BIwj.Du((aKuV)yy.h(this, -2082601578), fNTl.getName());
        BIwj.Du(vetS, fNTl.fvDH());
        BIwj.Du(vetS, fNTl.yBDs());
        BIwj.Du(vetS, fNTl.Xchh());
    }

    @Override
    public String LrGi() {
        return KDGY$JAHk.Y("\u1f46\uc895\u5ff0\ue8de\ue5bf\uc5cd\ue7fa");
    }

    private static Object Du(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

