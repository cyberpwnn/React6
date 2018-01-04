/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class xqdv$yJLS {
    private feCR<ogNr> ptEC = new feCR();

    public void yJLS(xyxr xyxr2, JcRS jcRS) {
        xqdv$yJLS.Ck((feCR)o.a(this, -1942268260), new ogNr(xyxr2, jcRS));
    }

    public xqdv NwrX() {
        ogNr ogNr2;
        int n = 1000;
        xqdv xqdv2 = new xqdv();
        VLbG vLbG = new VLbG();
        TNku tNku = new TNku();
        Object object = xqdv$yJLS.Ck(xqdv$yJLS.Ck((feCR)o.a(this, -1942268260)));
        while (object.hasNext()) {
            ogNr2 = (ogNr)object.next();
            xqdv$yJLS.Ck(tNku, ogNr2, xqdv$yJLS.Ck(n));
            xqdv$yJLS.Ck(vLbG, xqdv$yJLS.Ck(ogNr2), n);
            ++n;
        }
        object = xqdv$yJLS.Ck(xqdv$yJLS.Ck(tNku));
        while (object.hasNext()) {
            ogNr2 = (ogNr)object.next();
            Object object2 = xqdv$yJLS.Ck(vLbG, xqdv$yJLS.Ck((Integer)xqdv$yJLS.Ck(tNku, ogNr2)));
            Object object3 = xqdv$yJLS.Ck(xqdv$yJLS.Ck(ogNr2));
            xqdv$yJLS.Ck(xqdv2, object2, object3, xqdv$yJLS.Ck(ogNr2));
        }
        xqdv$yJLS.Ck(xqdv2);
        return xqdv2;
    }

    private static Object Ck(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

