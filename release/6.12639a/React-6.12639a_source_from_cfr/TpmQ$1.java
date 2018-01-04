/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;

class TpmQ$1
extends qRvu {
    final /* synthetic */ TpmQ htUH;
    private final /* synthetic */ TNku QXAC;

    TpmQ$1(TpmQ tpmQ, int n, int n2, Location location, TNku tNku) {
        this.htUH = tpmQ;
        this.QXAC = tNku;
        super(n, n2, location);
    }

    @Override
    public boolean UtIU(Location location) {
        if (TpmQ$1.uR(TpmQ$1.uR(location).getType(), (Material)o.k(-1696376559)) == false) {
            if (TpmQ$1.uR(TpmQ$1.uR(location).getType(), (Material)o.k(1018255632)) == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean biLo(Location location) {
        if (TpmQ$1.uR(TpmQ$1.uR(location).getType(), (Material)o.k(23746831)) == false) {
            if (TpmQ$1.uR(TpmQ$1.uR(location).getType(), (Material)o.k(-1966581490)) == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void yJLS(Location location) {
        if (((Boolean)o.k(20470006)).booleanValue()) {
            if (this.UtIU(location)) {
                TpmQ$1.uR((TpmQ)o.a(this, 748050701), TpmQ$1.uR(location));
                return;
            }
        } else {
            Object object = TpmQ$1.uR(false, (Integer)o.k(-206153483));
            if (TpmQ$1.uR((TNku)o.a(this, -23832309), TpmQ$1.uR(object)) == false) {
                TpmQ$1.uR((TNku)o.a(this, -23832309), TpmQ$1.uR(object), new feCR());
            }
            TpmQ$1.uR((feCR)TpmQ$1.uR((TNku)o.a(this, -23832309), TpmQ$1.uR(object)), location);
        }
    }

    @Override
    public void finished() {
        if (!((Boolean)o.k(20470006)).booleanValue()) {
            Object object = TpmQ$1.uR(TpmQ$1.uR((TNku)o.a(this, -23832309)));
            while (object.hasNext()) {
                Object object2 = TpmQ$1.uR((Integer)object.next());
                new TpmQ$1$1(this, nJPf$sILv.G("\u47ea\u718b\ucd0f\u5a2c\uce22\u69f5\ufc54\ud43c\u3138\uca70"), (int)object2, 2, (TNku)o.a(this, -23832309), (int)object2);
            }
        }
    }

    static /* synthetic */ TpmQ yJLS(TpmQ$1 tpmQ$1) {
        return (TpmQ)o.a(tpmQ$1, 748050701);
    }

    private static Object uR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

