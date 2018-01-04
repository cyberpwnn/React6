/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;

class TpmQ$1$1
extends JJHM {
    final /* synthetic */ TpmQ$1 CNWy;
    private final /* synthetic */ TNku QXAC;
    private final /* synthetic */ int htTJ;

    TpmQ$1$1(TpmQ$1 var1_1, String string, int n, int n2, TNku tNku, int n3) {
        this.CNWy = var1_1;
        this.QXAC = tNku;
        this.htTJ = n3;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if ((Integer)o.a(this, 388323624) == 1) {
            Object object = TpmQ$1$1.Zz((feCR)TpmQ$1$1.Zz((TNku)o.a(this, -1315022553), TpmQ$1$1.Zz((Integer)o.a(this, 1795709222))));
            while (object.hasNext()) {
                Location location = (Location)object.next();
                if (TpmQ$1$1.Zz((TpmQ$1)o.a(this, -152282843), location) == false) continue;
                TpmQ$1$1.Zz(TpmQ$1$1.Zz((TpmQ$1)o.a(this, -152282843)), TpmQ$1$1.Zz(location));
            }
        }
    }

    private static Object Zz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

