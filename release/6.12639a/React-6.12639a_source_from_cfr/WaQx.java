/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public final class WaQx
extends Enum<WaQx> {
    public static final /* enum */ WaQx BfPS;
    public static final /* enum */ WaQx ELte;
    public static final /* enum */ WaQx MfOS;
    public static final /* enum */ WaQx ywMU;
    public static final /* enum */ WaQx XfMu;
    public static final /* enum */ WaQx FGhF;
    private int x;
    private int y;
    private int z;
    private Kwaa$yJLS jasM;
    private static /* synthetic */ int[] vKdC;
    private static final /* synthetic */ WaQx[] JnIe;

    static {
        o.w(-769311974, (Object)new WaQx(mrFx$WjFM.d("\u9247"), 0, 0, 1, 0, (Kwaa$yJLS)((Object)o.k(-901825857))));
        o.w(84163353, (Object)new WaQx(mrFx$WjFM.d("\u9256"), 1, 0, -1, 0, (Kwaa$yJLS)((Object)o.k(-1832699202))));
        o.w(-1803273448, (Object)new WaQx(mrFx$WjFM.d("\u925c"), 2, 0, 0, -1, (Kwaa$yJLS)((Object)o.k(1179139411))));
        o.w(-1192740073, (Object)new WaQx(mrFx$WjFM.d("\u9241"), 3, 0, 0, 1, (Kwaa$yJLS)((Object)o.k(1634220737))));
        o.w(-1557316842, (Object)new WaQx(mrFx$WjFM.d("\u9257"), 4, 1, 0, 0, (Kwaa$yJLS)((Object)o.k(1100757698))));
        o.w(-527484139, (Object)new WaQx(mrFx$WjFM.d("\u9245"), 5, -1, 0, 0, (Kwaa$yJLS)((Object)o.k(164182720))));
        o.w(1583627028, new WaQx[]{(WaQx)((Object)o.k(-769311974)), (WaQx)((Object)o.k(84163353)), (WaQx)((Object)o.k(-1803273448)), (WaQx)((Object)o.k(-1192740073)), (WaQx)((Object)o.k(-1557316842)), (WaQx)((Object)o.k(-527484139))});
    }

    private WaQx(String string2, int n2, int n3, int n4, int n5, Kwaa$yJLS kwaa$yJLS) {
        this.x = string2;
        this.y = n2;
        this.z = n3;
        this.jasM = (Kwaa$yJLS)n4;
    }

    public WaQx Svlw() {
        switch (WaQx.QqGy()[this.ordinal()]) {
            case 2: {
                return (WaQx)((Object)o.k(-769311974));
            }
            case 5: {
                return (WaQx)((Object)o.k(-527484139));
            }
            case 3: {
                return (WaQx)((Object)o.k(-1192740073));
            }
            case 4: {
                return (WaQx)((Object)o.k(-1803273448));
            }
            case 1: {
                return (WaQx)((Object)o.k(84163353));
            }
            case 6: {
                return (WaQx)((Object)o.k(-1557316842));
            }
        }
        return null;
    }

    public int pQNK() {
        return (Integer)o.a((Object)this, -1441580269);
    }

    public int loTp() {
        return (Integer)o.a((Object)this, 2097363842);
    }

    public int z() {
        return (Integer)o.a((Object)this, -1395115135);
    }

    public Kwaa$yJLS rVrU() {
        return (Kwaa$yJLS)((Object)o.a((Object)this, -878167168));
    }

    public static feCR<WaQx> SfLm() {
        return WaQx.FV(WaQx.FV(WaQx.FV(WaQx.FV(new feCR(), (WaQx)((Object)o.k(-1803273448))), (WaQx)((Object)o.k(-1557316842))), (WaQx)((Object)o.k(-527484139))), (WaQx)((Object)o.k(-1192740073)));
    }

    public static feCR<WaQx> IyqQ() {
        return WaQx.FV(WaQx.FV(WaQx.FV(WaQx.FV(WaQx.FV(WaQx.FV(new feCR(), (WaQx)((Object)o.k(-769311974))), (WaQx)((Object)o.k(84163353))), (WaQx)((Object)o.k(-1803273448))), (WaQx)((Object)o.k(-1557316842))), (WaQx)((Object)o.k(-527484139))), (WaQx)((Object)o.k(-1192740073)));
    }

    public static WaQx DaUw(Player player) {
        Object object = WaQx.FV(WaQx.FV(player.getLocation()));
        Object object2 = WaQx.FV(WaQx.IyqQ());
        while (object2.hasNext()) {
            WaQx waQx = (WaQx)((Object)object2.next());
            if (WaQx.FV(object) != ((Integer)o.a((Object)waQx, -1441580269)).intValue()) continue;
            if (WaQx.FV(object) != ((Integer)o.a((Object)waQx, 2097363842)).intValue()) continue;
            if (WaQx.FV(object) != ((Integer)o.a((Object)waQx, -1395115135)).intValue()) continue;
            return waQx;
        }
        return (WaQx)((Object)o.k(84163353));
    }

    public static WaQx ktHX(byte by) {
        if (by > 5 || by < 0) {
            return null;
        }
        if (by == 0) {
            return (WaQx)((Object)o.k(84163353));
        }
        if (by == 1) {
            return (WaQx)((Object)o.k(-769311974));
        }
        if (by == 2) {
            return (WaQx)((Object)o.k(-1803273448));
        }
        if (by == 3) {
            return (WaQx)((Object)o.k(-1192740073));
        }
        if (by == 4) {
            return (WaQx)((Object)o.k(-527484139));
        }
        return (WaQx)((Object)o.k(-1557316842));
    }

    public byte byteValue() {
        switch (WaQx.QqGy()[this.ordinal()]) {
            case 2: {
                return 0;
            }
            case 5: {
                return 5;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 1: {
                return 1;
            }
            case 6: {
                return 4;
            }
        }
        return -1;
    }

    public static WaQx[] values() {
        WaQx[] arrwaQx = (WaQx[])o.k(1583627028);
        int n = arrwaQx.length;
        WaQx[] arrwaQx2 = new WaQx[n];
        WaQx.FV(arrwaQx, false, arrwaQx2, false, n);
        return arrwaQx2;
    }

    public static WaQx valueOf(String string) {
        return (WaQx)((Object)WaQx.FV(WaQx.class, string));
    }

    static /* synthetic */ int[] QqGy() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(-575194245);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[WaQx.values().length];
        try {
            arrn[((WaQx)o.k((int)84163353)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((WaQx)o.k((int)-1557316842)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((WaQx)o.k((int)-1803273448)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((WaQx)o.k((int)-1192740073)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((WaQx)o.k((int)-769311974)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((WaQx)o.k((int)-527484139)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(-575194245, arrn3);
        return arrn3;
    }

    private static Object FV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

