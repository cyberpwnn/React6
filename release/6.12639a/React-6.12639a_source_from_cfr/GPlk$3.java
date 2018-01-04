/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class GPlk$3
implements Runnable {
    final /* synthetic */ GPlk DbLk;
    private final /* synthetic */ yJSB GQbv;
    private final /* synthetic */ yJSB rxpT;
    private final /* synthetic */ yJSB uqWq;
    private final /* synthetic */ yJSB Ipxq;
    private final /* synthetic */ xynF gFNH;

    GPlk$3(GPlk gPlk, yJSB yJSB2, yJSB yJSB3, yJSB yJSB4, yJSB yJSB5, xynF xynF2) {
        this.DbLk = gPlk;
        this.GQbv = yJSB2;
        this.rxpT = yJSB3;
        this.uqWq = yJSB4;
        this.Ipxq = yJSB5;
        this.gFNH = xynF2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        GPlk$3.Gf((yJSB)o.a(this, -1740290948), true);
        var1_1 = (String)o.k(-602323958);
        GPlk$3.Gf((GPlk)o.a(this, 2093827081), (Object)GPlk$3.Gf((yJSB)o.a(this, -1740290948)) / (Object)GPlk$3.Gf((yJSB)o.a(this, -359119865)));
        var1_1 = GPlk$3.Gf(var1_1, mrFx$WjFM.d("\u5c50\u5d41"), GPlk$3.Gf(GPlk$3.Gf((yJSB)o.a(this, -1740290948))));
        var1_1 = GPlk$3.Gf(var1_1, mrFx$WjFM.d("\u5c50\u5d56"), GPlk$3.Gf(GPlk$3.Gf((yJSB)o.a(this, -359119865))));
        var1_1 = GPlk$3.Gf(var1_1, mrFx$WjFM.d("\u5c50\u5d52"), GPlk$3.Gf(GPlk$3.Gf((GPlk)o.a(this, 2093827081)), false));
        GPlk$3.Gf((GPlk)o.a(this, 2093827081), var1_1);
        GPlk$3.Gf((GPlk)o.a(this, 2093827081), GPlk$3.Gf());
        GPlk$3.Gf((yJSB)o.a(this, 1169442030), GPlk$3.Gf((GPlk)o.a(this, 2093827081)));
        if (GPlk$3.Gf((GPlk)o.a(this, 2093827081)) > 0) {
            GPlk$3.Gf((yJSB)o.a(this, 1546142956), true);
        }
        if (GPlk$3.Gf((yJSB)o.a(this, -1740290948)) != GPlk$3.Gf((yJSB)o.a(this, -359119865))) return;
        GPlk$3.Gf((GPlk)o.a(this, 2093827081));
        if (GPlk$3.Gf((yJSB)o.a(this, 1546142956)) > true) ** GOTO lbl-1000
        if (GPlk$3.Gf((yJSB)o.a(this, 1546142956)) == false) lbl-1000: // 2 sources:
        {
            v0 = mrFx$WjFM.d("\u5c07");
        } else {
            v0 = "";
        }
        ((xynF)o.a(this, 1544176890)).biLo((String)GPlk$3.Gf(GPlk$3.Gf(GPlk$3.Gf(GPlk$3.Gf(GPlk$3.Gf(GPlk$3.Gf(new StringBuilder((String)GPlk$3.Gf(GPlk$3.Gf(mrFx$WjFM.d("\u5c15\u5d41\u5406\u534e\uef6b\u47ab\u5bf2\ue326\ue290\u355a\u86ca\ucc42\u1408\u7af6\uc3f0\ucb9f\u926f\u1ace\u80a3\u99cc\u7dfc\u6eee\uc528\uff73\uddc0\uded3\ue7ae")))), GPlk$3.Gf(GPlk$3.Gf((yJSB)o.a(this, 1169442030)))), GPlk$3.Gf(mrFx$WjFM.d("\u5c15\u5d41\u5406\u534e\uef6b\u47ab\u5bf2\ue326\ue290\u355a\u86ca\ucc42\u1408\u7af6\uc3f0\ucb9f\u926f\u1ace\u80a3\u99cc\u7dfc\u6ee8\uc533\uff6b\uddc5\udec2\ue7a3\u0670\u56fb\uca3d\uc65a\u67b7"))), GPlk$3.Gf(GPlk$3.Gf((yJSB)o.a(this, 1546142956)))), GPlk$3.Gf(mrFx$WjFM.d("\u5c15\u5d41\u5406\u534e\uef6b\u47ab\u5bf2\ue326\ue290\u355a\u86ca\ucc42\u1408\u7af6\uc3f0\ucb9f\u926f\u1ace\u80a3\u99cc\u7dfc\u6eee\uc535\uff6a\uddc2\udedd"))), v0)));
    }

    private static Object Gf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

