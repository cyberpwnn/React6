/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class UQfI$3
extends JJHM {
    final /* synthetic */ UQfI oDqt;
    private final /* synthetic */ xynF gFNH;
    private final /* synthetic */ yJSB PJyi;

    UQfI$3(UQfI uQfI, String string, int n, xynF xynF2, yJSB yJSB2) {
        this.oDqt = uQfI;
        this.gFNH = xynF2;
        this.PJyi = yJSB2;
        super(string, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (UQfI$3.ut() - UQfI$3.ut((UQfI)o.a(this, -2146745200)) <= 1000) return;
        if (UQfI$3.ut(UQfI$3.ut((UQfI)o.a(this, -2146745200)), (ooQj)o.k(1731151092)) == false) return;
        this.cancel();
        UQfI$3.ut((UQfI)o.a(this, -2146745200));
        if (UQfI$3.ut((yJSB)o.a(this, -1910422388)) > true) ** GOTO lbl-1000
        if (UQfI$3.ut((yJSB)o.a(this, -1910422388)) == false) lbl-1000: // 2 sources:
        {
            v0 = mrFx$WjFM.d("\ua242");
        } else {
            v0 = "";
        }
        ((xynF)o.a(this, -647019379)).biLo((String)UQfI$3.ut(UQfI$3.ut(UQfI$3.ut(UQfI$3.ut(new StringBuilder((String)UQfI$3.ut(UQfI$3.ut(mrFx$WjFM.d("\ua250\u48f1\uf8fe\u790e\u08d5\uc06d\u2d94\u4163\u3a4c\u24b5\u829c\u7fd0\uf062\ucda8\ub45d\u5435\u3e0b\u0896\uf8a7\u12af\u1811\u5672\u89d3\u80e1\u78d3\udea1")))), UQfI$3.ut(UQfI$3.ut((yJSB)o.a(this, -1910422388)))), UQfI$3.ut(mrFx$WjFM.d("\ua250\u48f1\uf8fe\u790e\u08d5\uc06d\u2d94\u4163\u3a4c\u24b5\u829c\u7fd0\uf062\ucda8\ub45d\u5435\u3e0b\u0896\uf8a7\u12af\u1802\u566f\u89d4\u80e8\u78dd"))), v0)));
    }

    private static Object ut(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

