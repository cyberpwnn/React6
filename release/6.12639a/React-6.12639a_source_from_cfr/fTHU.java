/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;

public class fTHU {
    private NxWm XCUV;
    private boolean connected;
    private int LbVA;

    public fTHU(NxWm nxWm) {
        this.XCUV = nxWm;
        this.connected = false;
    }

    public NxWm WaQx() {
        return (NxWm)o.a(this, 1524911381);
    }

    public boolean isConnected() {
        return (Boolean)o.a(this, -2053616364);
    }

    public void connect() {
        o.v(this, -2053616364, true);
        o.w(-1384559341, this);
        fTHU.KE(fTHU.KE(), fTHU.KE(), new fTHU$1(this));
        o.v(this, -1966387838, this.yJLS(0, 0, new fTHU$2(this)));
    }

    private void YEUY() {
        if (!this.isConnected()) {
            this.NwfF((Integer)o.a(this, -1966387838));
        }
        o.w(-619556004, (Long)o.k(-619556004) + 1);
        fTHU.KE();
        Object object = fTHU.KE(fTHU.KE(fTHU.KE()));
        while (object.hasNext()) {
            qSgW qSgW2 = (qSgW)object.next();
            qSgW2.owir();
        }
    }

    public void disconnect() {
        o.v(this, -2053616364, false);
        this.NwfF((Integer)o.a(this, -1966387838));
        fTHU.KE();
        fTHU.KE(fTHU.KE());
    }

    public int yJLS(int n, Runnable runnable) {
        if (this.isConnected()) {
            return fTHU.KE().scheduleSyncDelayedTask((Plugin)this.WaQx(), runnable, (long)n);
        }
        fTHU.KE(mrFx$WjFM.d("\u1963\ub6ac\uba2f\udcb8\u8a00\u6deb\ue8ca\u077e\ub2f3\u3b47\ue6ab\uf484\udbef\u5243\ue59b\u702e\u3da3\ubf90\u3383\uc8fd"));
        return -1;
    }

    public int yJLS(int n, int n2, Runnable runnable) {
        if (this.isConnected()) {
            return fTHU.KE().scheduleSyncRepeatingTask((Plugin)this.WaQx(), runnable, (long)n, (long)n2);
        }
        fTHU.KE(mrFx$WjFM.d("\u1963\ub6ac\uba2f\udcb8\u8a00\u6deb\ue8ca\u077e\ub2f3\u3b47\ue6ab\uf484\udbef\u5243\ue59b\u702e\u3da5\ubf94\u3380\uc8f3\udea7\u4a40\u42dd\uc319\u3c14\ud2d0\u52fd\u4fad\ucf58\u6aba"));
        return -1;
    }

    public void NwfF(int n) {
        fTHU.KE().cancelTask(n);
    }

    static /* synthetic */ void yJLS(fTHU fTHU2) {
        fTHU2.YEUY();
    }

    private static Object KE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

