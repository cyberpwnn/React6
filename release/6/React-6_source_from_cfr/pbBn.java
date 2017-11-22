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

public final class pbBn
extends Enum<pbBn> {
    public static final /* enum */ pbBn aMlN;
    public static final /* enum */ pbBn AbSM;
    public static final /* enum */ pbBn GktW;
    public static final /* enum */ pbBn DQie;
    public static final /* enum */ pbBn dEsY;
    public static final /* enum */ pbBn SoWi;
    private int x;
    private int y;
    private int z;
    private gWIG$ssNb qfMV;
    private static /* synthetic */ int[] EvpJ;
    private static final /* synthetic */ pbBn[] BvVu;

    static {
        cv.V(2144335517, (Object)new pbBn(rgig$AWxc.r("\ub2ef"), 0, 0, 1, 0, (gWIG$ssNb)((Object)cv.e(196670467))));
        cv.V(1486091932, (Object)new pbBn(rgig$AWxc.r("\ub2fe"), 1, 0, -1, 0, (gWIG$ssNb)((Object)cv.e(-714542078))));
        cv.V(-525732193, (Object)new pbBn(rgig$AWxc.r("\ub2f4"), 2, 0, 0, -1, (gWIG$ssNb)((Object)cv.e(-1984433145))));
        cv.V(-510658914, (Object)new pbBn(rgig$AWxc.r("\ub2e9"), 3, 0, 0, 1, (gWIG$ssNb)((Object)cv.e(-285543423))));
        cv.V(1202058905, (Object)new pbBn(rgig$AWxc.r("\ub2ff"), 4, 1, 0, 0, (gWIG$ssNb)((Object)cv.e(1237775366))));
        cv.V(-1786382632, (Object)new pbBn(rgig$AWxc.r("\ub2ed"), 5, -1, 0, 0, (gWIG$ssNb)((Object)cv.e(-1350634496))));
        cv.V(1968043739, new pbBn[]{(pbBn)((Object)cv.e(2144335517)), (pbBn)((Object)cv.e(1486091932)), (pbBn)((Object)cv.e(-525732193)), (pbBn)((Object)cv.e(-510658914)), (pbBn)((Object)cv.e(1202058905)), (pbBn)((Object)cv.e(-1786382632))});
    }

    private pbBn(String string2, int n2, int n3, int n4, int n5, gWIG$ssNb gWIG$ssNb) {
        this.x = string2;
        this.y = n2;
        this.z = n3;
        this.qfMV = (gWIG$ssNb)n4;
    }

    public pbBn LaRg() {
        switch (pbBn.OsLy()[this.ordinal()]) {
            case 2: {
                return (pbBn)((Object)cv.e(2144335517));
            }
            case 5: {
                return (pbBn)((Object)cv.e(-1786382632));
            }
            case 3: {
                return (pbBn)((Object)cv.e(-510658914));
            }
            case 4: {
                return (pbBn)((Object)cv.e(-525732193));
            }
            case 1: {
                return (pbBn)((Object)cv.e(1486091932));
            }
            case 6: {
                return (pbBn)((Object)cv.e(1202058905));
            }
        }
        return null;
    }

    public int qBiS() {
        return (Integer)cv.b((Object)this, 952104666);
    }

    public int Vnoo() {
        return (Integer)cv.b((Object)this, 833025733);
    }

    public int z() {
        return (Integer)cv.b((Object)this, -1517357372);
    }

    public gWIG$ssNb MBST() {
        return (gWIG$ssNb)((Object)cv.b((Object)this, -619317561));
    }

    public static wfPa<pbBn> ifEk() {
        return pbBn.KY(pbBn.KY(pbBn.KY(pbBn.KY(new wfPa(), (pbBn)((Object)cv.e(-525732193))), (pbBn)((Object)cv.e(1202058905))), (pbBn)((Object)cv.e(-1786382632))), (pbBn)((Object)cv.e(-510658914)));
    }

    public static wfPa<pbBn> BSSn() {
        return pbBn.KY(pbBn.KY(pbBn.KY(pbBn.KY(pbBn.KY(pbBn.KY(new wfPa(), (pbBn)((Object)cv.e(2144335517))), (pbBn)((Object)cv.e(1486091932))), (pbBn)((Object)cv.e(-525732193))), (pbBn)((Object)cv.e(1202058905))), (pbBn)((Object)cv.e(-1786382632))), (pbBn)((Object)cv.e(-510658914)));
    }

    public static pbBn hHYn(Player player) {
        Object object = pbBn.KY(pbBn.KY(player.getLocation()));
        Object object2 = pbBn.KY(pbBn.BSSn());
        while (object2.hasNext()) {
            pbBn pbBn2 = (pbBn)((Object)object2.next());
            if (pbBn.KY(object) != ((Integer)cv.b((Object)pbBn2, 952104666)).intValue()) continue;
            if (pbBn.KY(object) != ((Integer)cv.b((Object)pbBn2, 833025733)).intValue()) continue;
            if (pbBn.KY(object) != ((Integer)cv.b((Object)pbBn2, -1517357372)).intValue()) continue;
            return pbBn2;
        }
        return (pbBn)((Object)cv.e(1486091932));
    }

    public static pbBn IWSm(byte by) {
        if (by > 5 || by < 0) {
            return null;
        }
        if (by == 0) {
            return (pbBn)((Object)cv.e(1486091932));
        }
        if (by == 1) {
            return (pbBn)((Object)cv.e(2144335517));
        }
        if (by == 2) {
            return (pbBn)((Object)cv.e(-525732193));
        }
        if (by == 3) {
            return (pbBn)((Object)cv.e(-510658914));
        }
        if (by == 4) {
            return (pbBn)((Object)cv.e(-1786382632));
        }
        return (pbBn)((Object)cv.e(1202058905));
    }

    public byte byteValue() {
        switch (pbBn.OsLy()[this.ordinal()]) {
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

    public static pbBn[] values() {
        pbBn[] arrpbBn = (pbBn[])cv.e(1968043739);
        int n = arrpbBn.length;
        pbBn[] arrpbBn2 = new pbBn[n];
        pbBn.KY(arrpbBn, false, arrpbBn2, false, n);
        return arrpbBn2;
    }

    public static pbBn valueOf(String string) {
        return (pbBn)((Object)pbBn.KY(pbBn.class, string));
    }

    static /* synthetic */ int[] OsLy() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(-1819609395);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[pbBn.values().length];
        try {
            arrn[((pbBn)cv.e((int)1486091932)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((pbBn)cv.e((int)1202058905)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((pbBn)cv.e((int)-525732193)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((pbBn)cv.e((int)-510658914)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((pbBn)cv.e((int)2144335517)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((pbBn)cv.e((int)-1786382632)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(-1819609395, arrn3);
        return arrn3;
    }

    private static Object KY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

