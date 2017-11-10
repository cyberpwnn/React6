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

public class UlAU {
    private upkX IXJf;
    private boolean connected;
    private int hIRK;

    public UlAU(upkX upkX2) {
        this.IXJf = upkX2;
        this.connected = false;
    }

    public upkX Wyua() {
        return (upkX)yy.h(this, -1114110347);
    }

    public boolean isConnected() {
        return (Boolean)yy.h(this, -1760885138);
    }

    public void connect() {
        yy.E(this, -1760885138, true);
        yy.K(-438434189, this);
        UlAU.CG(UlAU.CG(), UlAU.CG(), new UlAU$1(this));
        yy.E(this, -689437079, this.mXJp(0, 0, new UlAU$2(this)));
    }

    private void STXE() {
        if (!this.isConnected()) {
            this.MtdI((Integer)yy.h(this, -689437079));
        }
        yy.K(291695492, (Long)yy.p(291695492) + 1);
        UlAU.CG();
        Object object = UlAU.CG(UlAU.CG(UlAU.CG()));
        while (object.hasNext()) {
            wncc wncc2 = (wncc)object.next();
            wncc2.AWsr();
        }
    }

    public void disconnect() {
        yy.E(this, -1760885138, false);
        this.MtdI((Integer)yy.h(this, -689437079));
        UlAU.CG();
        UlAU.CG(UlAU.CG());
    }

    public int mXJp(int n, Runnable runnable) {
        if (this.isConnected()) {
            return UlAU.CG().scheduleSyncDelayedTask((Plugin)this.Wyua(), runnable, (long)n);
        }
        UlAU.CG(BkvY$LhxG.I("\uab9e\u4266\u10d5\u995c\u5afa\u6c3b\u12b1\uf4c0\u5d34\u021a\ufe71\uf136\ubb5c\u277c\ua55d\u5ade\ueccb\u26f2\u01fd\u91b7"));
        return -1;
    }

    public int mXJp(int n, int n2, Runnable runnable) {
        if (this.isConnected()) {
            return UlAU.CG().scheduleSyncRepeatingTask((Plugin)this.Wyua(), runnable, (long)n, (long)n2);
        }
        UlAU.CG(KDGY$JAHk.Y("\u4bf7\u3fad\u097b\u7077\uff38\u525e\u264d\u9978\ue041\ud5f7\u63fa\u2049\u9bb1\ucaaf\u62aa\u8846\u1b31\u159c\u9681\ubd06\uea26\u6ea2\u1ff2\u7720\uac5d\u3270\u36de\uaa99\u82ad\u2ebe"));
        return -1;
    }

    public void MtdI(int n) {
        UlAU.CG().cancelTask(n);
    }

    static /* synthetic */ void mXJp(UlAU ulAU) {
        ulAU.STXE();
    }

    private static Object CG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

