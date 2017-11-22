/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class kbqG
implements XSJd {
    private wfPa<kkap> QXAc = new wfPa();
    private ktOu<String, AWxc> bHPg = new ktOu();

    @Override
    public void FFBA() {
        Object object = kbqG.gH(kbqG.gH((wfPa)cv.b(this, 1807742032)));
        while (object.hasNext()) {
            kkap kkap2 = (kkap)object.next();
            this.DYFV(kkap2);
            if (!kkap2.pbBn()) continue;
            this.ssNb(kkap2);
            kbqG.gH((wfPa)cv.b(this, 1807742032), kkap2);
        }
    }

    private void ssNb(kkap kkap2) {
        kbqG.gH((ktOu)cv.b(this, -1334250413), kkap2.getName());
    }

    private void DYFV(kkap kkap2) {
        if (kbqG.gH((ktOu)cv.b(this, -1334250413), kkap2.getName()) == false) {
            kbqG.gH((ktOu)cv.b(this, -1334250413), kkap2.getName(), new AWxc());
        }
        AWxc aWxc = (AWxc)kbqG.gH((ktOu)cv.b(this, -1334250413), kkap2.getName());
        kbqG.gH(aWxc, kkap2.maJO());
        kbqG.gH(aWxc, kkap2.vJAb());
        kbqG.gH(aWxc, kkap2.GHjQ());
    }

    @Override
    public String BuHU() {
        return YEBy$TyVf.W("\ud3a5\u6221\u9488\ua1e1\u7109\u2bae\ud956");
    }

    private static Object gH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

