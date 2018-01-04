/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class vbvg$1
implements Runnable {
    final /* synthetic */ vbvg JeGo;

    vbvg$1(vbvg vbvg2) {
        this.JeGo = vbvg2;
    }

    @Override
    public void run() {
        vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761)));
        vbvg$1.Bi((vbvg)o.a(this, -1355657761));
        vbvg vbvg2 = (vbvg)o.a(this, -1355657761);
        o.v(vbvg2, 169496028, (Integer)o.a(vbvg2, 169496028) + 1);
        vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761)));
        vbvg$1.Bi((vbvg)o.a(this, -1355657761), vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761))));
        vbvg vbvg3 = (vbvg)o.a(this, -1355657761);
        vbvg$1.Bi(vbvg3, vbvg$1.Bi(vbvg3) + vbvg$1.Bi((vbvg)o.a(this, -1355657761)));
        vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761)));
        vbvg vbvg4 = (vbvg)o.a(this, -1355657761);
        vbvg$1.Bi(vbvg4, vbvg$1.Bi(vbvg4) + vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761))));
        vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761)));
        vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761)));
        vbvg$1.Bi(vbvg$1.Bi((vbvg)o.a(this, -1355657761)));
    }

    private static Object Bi(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

