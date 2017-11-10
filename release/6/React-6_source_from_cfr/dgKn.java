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

public final class dgKn
extends Enum<dgKn> {
    public static final /* enum */ dgKn XvNO;
    public static final /* enum */ dgKn DYps;
    public static final /* enum */ dgKn gWda;
    public static final /* enum */ dgKn iDXj;
    public static final /* enum */ dgKn fwHh;
    public static final /* enum */ dgKn wNFC;
    private int x;
    private int y;
    private int z;
    private FVfT$mXJp PwJF;
    private static /* synthetic */ int[] SoPu;
    private static final /* synthetic */ dgKn[] TaSU;

    static {
        yy.K(1998784593, (Object)new dgKn(BkvY$LhxG.I("\u33c2"), 0, 0, 1, 0, (FVfT$mXJp)((Object)yy.p(1790248166))));
        yy.K(1547307098, (Object)new dgKn(BkvY$LhxG.I("\u33d3"), 1, 0, -1, 0, (FVfT$mXJp)((Object)yy.p(-1776352021))));
        yy.K(1562052687, (Object)new dgKn(BkvY$LhxG.I("\u33d9"), 2, 0, 0, -1, (FVfT$mXJp)((Object)yy.p(-627768094))));
        yy.K(-1608382384, (Object)new dgKn(BkvY$LhxG.I("\u33c4"), 3, 0, 0, 1, (FVfT$mXJp)((Object)yy.p(552732696))));
        yy.K(332007461, (Object)new dgKn(BkvY$LhxG.I("\u33d2"), 4, 1, 0, 0, (FVfT$mXJp)((Object)yy.p(1948911639))));
        yy.K(97388574, (Object)new dgKn(BkvY$LhxG.I("\u33c0"), 5, -1, 0, 0, (FVfT$mXJp)((Object)yy.p(789120237))));
        yy.K(-1134753757, new dgKn[]{(dgKn)((Object)yy.p(1998784593)), (dgKn)((Object)yy.p(1547307098)), (dgKn)((Object)yy.p(1562052687)), (dgKn)((Object)yy.p(-1608382384)), (dgKn)((Object)yy.p(332007461)), (dgKn)((Object)yy.p(97388574))});
    }

    private dgKn(String string2, int n2, int n3, int n4, int n5, FVfT$mXJp fVfT$mXJp) {
        this.x = string2;
        this.y = n2;
        this.z = n3;
        this.PwJF = (FVfT$mXJp)n4;
    }

    public dgKn JJGJ() {
        switch (dgKn.imrM()[this.ordinal()]) {
            case 2: {
                return (dgKn)((Object)yy.p(1998784593));
            }
            case 5: {
                return (dgKn)((Object)yy.p(97388574));
            }
            case 3: {
                return (dgKn)((Object)yy.p(-1608382384));
            }
            case 4: {
                return (dgKn)((Object)yy.p(1562052687));
            }
            case 1: {
                return (dgKn)((Object)yy.p(1547307098));
            }
            case 6: {
                return (dgKn)((Object)yy.p(332007461));
            }
        }
        return null;
    }

    public int HUBV() {
        return (Integer)yy.h((Object)this, 52299812);
    }

    public int fKUx() {
        return (Integer)yy.h((Object)this, 720242777);
    }

    public int z() {
        return (Integer)yy.h((Object)this, -2089613278);
    }

    public FVfT$mXJp owtH() {
        return (FVfT$mXJp)((Object)yy.h((Object)this, 1426262103));
    }

    public static PBUD<dgKn> PeJa() {
        return dgKn.pL(dgKn.pL(dgKn.pL(dgKn.pL(new PBUD(), (dgKn)((Object)yy.p(1562052687))), (dgKn)((Object)yy.p(332007461))), (dgKn)((Object)yy.p(97388574))), (dgKn)((Object)yy.p(-1608382384)));
    }

    public static PBUD<dgKn> JJGR() {
        return dgKn.pL(dgKn.pL(dgKn.pL(dgKn.pL(dgKn.pL(dgKn.pL(new PBUD(), (dgKn)((Object)yy.p(1998784593))), (dgKn)((Object)yy.p(1547307098))), (dgKn)((Object)yy.p(1562052687))), (dgKn)((Object)yy.p(332007461))), (dgKn)((Object)yy.p(97388574))), (dgKn)((Object)yy.p(-1608382384)));
    }

    public static dgKn Ralc(Player player) {
        Object object = dgKn.pL(dgKn.pL(player.getLocation()));
        Object object2 = dgKn.pL(dgKn.JJGR());
        while (object2.hasNext()) {
            dgKn dgKn2 = (dgKn)((Object)object2.next());
            if (dgKn.pL(object) != ((Integer)yy.h((Object)dgKn2, 52299812)).intValue()) continue;
            if (dgKn.pL(object) != ((Integer)yy.h((Object)dgKn2, 720242777)).intValue()) continue;
            if (dgKn.pL(object) != ((Integer)yy.h((Object)dgKn2, -2089613278)).intValue()) continue;
            return dgKn2;
        }
        return (dgKn)((Object)yy.p(1547307098));
    }

    public static dgKn ksfs(byte by) {
        if (by > 5 || by < 0) {
            return null;
        }
        if (by == 0) {
            return (dgKn)((Object)yy.p(1547307098));
        }
        if (by == 1) {
            return (dgKn)((Object)yy.p(1998784593));
        }
        if (by == 2) {
            return (dgKn)((Object)yy.p(1562052687));
        }
        if (by == 3) {
            return (dgKn)((Object)yy.p(-1608382384));
        }
        if (by == 4) {
            return (dgKn)((Object)yy.p(97388574));
        }
        return (dgKn)((Object)yy.p(332007461));
    }

    public byte byteValue() {
        switch (dgKn.imrM()[this.ordinal()]) {
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

    public static dgKn[] values() {
        dgKn[] arrdgKn = (dgKn[])yy.p(-1134753757);
        int n = arrdgKn.length;
        dgKn[] arrdgKn2 = new dgKn[n];
        dgKn.pL(arrdgKn, false, arrdgKn2, false, n);
        return arrdgKn2;
    }

    public static dgKn valueOf(String string) {
        return (dgKn)((Object)dgKn.pL(dgKn.class, string));
    }

    static /* synthetic */ int[] imrM() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(-340588511);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[dgKn.values().length];
        try {
            arrn[((dgKn)yy.p((int)1547307098)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((dgKn)yy.p((int)332007461)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((dgKn)yy.p((int)1562052687)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((dgKn)yy.p((int)-1608382384)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((dgKn)yy.p((int)1998784593)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((dgKn)yy.p((int)97388574)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(-340588511, arrn3);
        return arrn3;
    }

    private static Object pL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

