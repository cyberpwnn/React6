/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.java.JavaPlugin
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Set;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class NxWm
extends JavaPlugin
implements ksyX,
qSgW {
    private feCR<yAmM> YOLo;
    private Lqeo OAOR;
    private fSgy JvFL;

    public NxWm() {
        try {
            this.oVTn();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            NxWm.BF(exception);
            return;
        }
        this.YOLo = new feCR();
        this.OAOR = new NxWm$1(this, mrFx$WjFM.d("\uae2b\u12ad\ua0d7\u81a4\ue43c\ub827\ue8e9\u4163"), this.getThreadCount(), (gxcp)((Object)o.k(-2042803064)));
        this.JvFL = new fSgy();
        this.NpJL();
        this.Kwaa();
    }

    public abstract void oVTn() throws IOException, ClassNotFoundException;

    public abstract long psKX();

    public abstract int getThreadCount();

    public void onLoad() {
        this.dgVt();
        NxWm.BF((Lqeo)o.a(this, -1215345529));
        o.w(-382707289, (Lqeo)o.a(this, -1215345529));
        o.w(-1334555515, (Lqeo)o.a(this, -1215345529));
        NxWm.BF((fSgy)o.a(this, -444183420));
    }

    public void onEnable() {
        NxWm.BF(NxWm.BF(this));
        Object object = NxWm.BF(this.eHVp());
        while (object.hasNext()) {
            yAmM yAmM2 = (yAmM)object.next();
            yAmM2.start();
        }
        this.yJLS((eHVp)((Object)NxWm.BF()));
        NxWm.BF(this);
    }

    public void onDisable() {
        Object object = NxWm.BF(this.eHVp());
        while (object.hasNext()) {
            yAmM yAmM2 = (yAmM)object.next();
            yAmM2.stop();
        }
        this.SKsf();
        NxWm.BF((Lqeo)o.a(this, -1215345529));
        NxWm.BF((fSgy)o.a(this, -444183420));
        o.v((fSgy)o.a(this, -444183420), 1859865738, false);
        NxWm.BF(NxWm.BF());
        this.uWeE();
    }

    @Override
    public feCR<yAmM> eHVp() {
        return (feCR)o.a(this, 782391149);
    }

    @Override
    public void yJLS(yAmM yAmM2) {
        NxWm.BF(this.eHVp(), yAmM2);
    }

    @Override
    public void owir() {
        if (NxWm.BF() == false) {
            return;
        }
        Object object = NxWm.BF(this.eHVp());
        while (object.hasNext()) {
            yAmM yAmM2 = (yAmM)object.next();
            yAmM2.tick();
        }
        NxWm.BF((Lqeo)o.a(this, -1215345529));
    }

    @Override
    public String YMWq() {
        return NxWm.BF(NxWm.BF(new StringBuilder((String)NxWm.BF(this.getName())), FMkR$WjFM.a("\u88b7\u491b\u5daf\u2bbd\uaf34")));
    }

    @Override
    public Lqeo owvU() {
        return (Lqeo)o.a(this, -1215345529);
    }

    public void uWeE() {
        Thread thread;
        feCR<T> feCR2 = new feCR<T>();
        Object object = NxWm.BF(new feCR<K>(NxWm.BF().keySet()));
        while (object.hasNext()) {
            thread = (Thread)object.next();
            if (NxWm.BF(NxWm.BF(thread), mrFx$WjFM.d("\u2e9f\u83c7\u9864\u6fd2\u80bc\u47db")) == false) continue;
            NxWm.BF(feCR2, thread);
            NxWm.BF(NxWm.BF(NxWm.BF(new StringBuilder(mrFx$WjFM.d("\u2e9f\u83da\u9863\u6fc1\u80ad\u4792\u8191\u50e6\u8e7f\ub2fa\ua7bb\u6192\u7f4c\u6bd1\u997c")), NxWm.BF(thread))));
        }
        if (NxWm.BF(feCR2) == false) {
            thread = new Thread(new NxWm$2(this));
            NxWm.BF(thread, mrFx$WjFM.d("\u2e9f\u83c7\u9864\u6fd2\u80bc\u47db\u81ab\u50e9\u8e2d\ub2db\ua7b5\u6181\u7f02\u6ba6\u9933\u0713\u8fbe\uaff1\u7010\uf8e3"));
            NxWm.BF(thread, 10);
            NxWm.BF(thread);
        }
    }

    @Override
    public abstract void NpJL();

    @Override
    public abstract void yJLS(eHVp var1);

    @Override
    public abstract void SKsf();

    @Override
    public abstract void dgVt();

    @Override
    public abstract void Kwaa();

    private static Object BF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

