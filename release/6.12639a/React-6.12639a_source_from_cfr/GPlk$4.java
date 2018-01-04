/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class GPlk$4
extends JJHM {
    final /* synthetic */ GPlk DbLk;
    private final /* synthetic */ xynF gFNH;
    private final /* synthetic */ yJSB uqWq;
    private final /* synthetic */ yJSB Ipxq;

    GPlk$4(GPlk gPlk, String string, int n, xynF xynF2, yJSB yJSB2, yJSB yJSB3) {
        this.DbLk = gPlk;
        this.gFNH = xynF2;
        this.uqWq = yJSB2;
        this.Ipxq = yJSB3;
        super(string, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (GPlk$4.Bn() - GPlk$4.Bn((GPlk)o.a(this, -1035975433)) <= 100) return;
        if (GPlk$4.Bn(GPlk$4.Bn((GPlk)o.a(this, -1035975433)), (ooQj)o.k(1731151092)) == false) return;
        this.cancel();
        GPlk$4.Bn((GPlk)o.a(this, -1035975433));
        if (GPlk$4.Bn((yJSB)o.a(this, -1746975520)) > true) ** GOTO lbl-1000
        if (GPlk$4.Bn((yJSB)o.a(this, -1746975520)) == false) lbl-1000: // 2 sources:
        {
            v0 = mrFx$WjFM.d("\u5980");
        } else {
            v0 = "";
        }
        ((xynF)o.a(this, -916241182)).biLo((String)GPlk$4.Bn(GPlk$4.Bn(GPlk$4.Bn(GPlk$4.Bn(GPlk$4.Bn(GPlk$4.Bn(new StringBuilder((String)GPlk$4.Bn(GPlk$4.Bn(mrFx$WjFM.d("\u5992\uf750\ud9f3\u4180\u963b\u9f8b\u43b0\ue7db\u3d0a\u1d9b\u305d\u1a8d\u7488\u7947\u2a7c\u8b5e\ub408\u1677\ub45d\u7438\u5425\u479e\uda8e\u35eb\u2468\u5855\u7e5a")))), GPlk$4.Bn(GPlk$4.Bn((yJSB)o.a(this, 447497441)))), GPlk$4.Bn(mrFx$WjFM.d("\u5992\uf750\ud9f3\u4180\u963b\u9f8b\u43b0\ue7db\u3d0a\u1d9b\u305d\u1a8d\u7488\u7947\u2a7c\u8b5e\ub408\u1677\ub45d\u7438\u5425\u4798\uda95\u35f3\u246d\u5844\u7e57\u098f\u3ac2\u2492\u183e\u5834"))), GPlk$4.Bn(GPlk$4.Bn((yJSB)o.a(this, -1746975520)))), GPlk$4.Bn(mrFx$WjFM.d("\u5992\uf750\ud9f3\u4180\u963b\u9f8b\u43b0\ue7db\u3d0a\u1d9b\u305d\u1a8d\u7488\u7947\u2a7c\u8b5e\ub408\u1677\ub45d\u7438\u5425\u479e\uda93\u35f2\u246a\u585b"))), v0)));
    }

    private static Object Bn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

