/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class WWtP$2
extends xGOy {
    final /* synthetic */ WWtP eHiM;

    WWtP$2(WWtP wWtP) {
        this.eHiM = wWtP;
    }

    @Override
    public void run() {
        if (WWtP$2.Na((WWtP)o.a(this, 1620531592)) == false) {
            return;
        }
        WWtP$2.Na(WWtP$2.Na((WWtP)o.a(this, 1620531592)));
        WWtP$2.Na(WWtP$2.Na((WWtP)o.a(this, 1620531592)), WWtP$2.Na(WWtP$2.Na(new StringBuilder((String)WWtP$2.Na(WWtP$2.Na(FMkR$WjFM.a("\u8b83\ud1a0\u02bc\u1849\ud486\uccc3\u78fe\ua733\u7983\uc0d0\u18f0\u266a\u51e6\ufdd7\uc315\u0a42\u00ed\u0c2b\u0702\ue434\udd48\u909f\u5ae7\u63f5\u0abd\u8d45\u683b")))), WWtP$2.Na((TNku)o.a((wwNq)o.a((TEqA)o.k(911295720), 1729188757), 1594841251)))));
        Object object = WWtP$2.Na((feCR)o.a((wwNq)o.a((TEqA)o.k(911295720), 1729188757), -701867868));
        while (object.hasNext()) {
            String string = (String)object.next();
            WWtP$2.Na(WWtP$2.Na((WWtP)o.a(this, 1620531592)), string);
        }
        WWtP$2.Na(WWtP$2.Na((WWtP)o.a(this, 1620531592)));
    }

    private static Object Na(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

