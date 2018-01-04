/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class WOYg
extends Enum<WOYg> {
    public static final /* enum */ WOYg rEmh;
    public static final /* enum */ WOYg uNvj;
    public static final /* enum */ WOYg MAtX;
    public static final /* enum */ WOYg MSVh;
    public static final /* enum */ WOYg iDEW;
    public static final /* enum */ WOYg QEpT;
    public static final /* enum */ WOYg JuAt;
    public static final /* enum */ WOYg HvkY;
    public static final /* enum */ WOYg RcDy;
    public static final /* enum */ WOYg LqtU;
    public static final /* enum */ WOYg MBTF;
    private String name;
    private String description;
    private sQJh ColC;
    private IpeM BKFT;
    private static final /* synthetic */ WOYg[] KgAj;

    static {
        o.w(-1205320487, (Object)new WOYg(nJPf$sILv.G("\u9bf3\udb42\u2760\u2f61\u6d33\u8107\u783a\u702b\uc254\ua6a6\ue8ba\u6004"), 0, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(1555580208), (String)o.k(-945404625)));
        o.w(-581218462, (Object)new WOYg(nJPf$sILv.G("\u9be0\udb45\u2774\u2f71\u6d3c\u8105\u7822\u7025\uc24c\ua6ba\ue8bd\u6007"), 1, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(1738622254), (String)o.k(850478381)));
        o.w(1796686912, (Object)new WOYg(nJPf$sILv.G("\u9bf9\udb44\u277b\u2f75\u6d20\u8108\u7831\u7036\uc249\ua6ab"), 2, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(749225260), (String)o.k(-540588757)));
        o.w(1622626142, (Object)new WOYg(nJPf$sILv.G("\u9be0\udb45\u2774\u2f71\u6d3c\u8105\u7822\u702b\uc24f\ua6bf\ue8a4\u6006\u6123"), 3, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(1483621690), (String)o.k(193873209)));
        o.w(1206600904, (Object)new WOYg(nJPf$sILv.G("\u9bf9\udb44\u277b\u2f75\u6d20\u8106\u7832\u7033\uc250\ua6aa\ue8a6"), 4, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(952780088), (String)o.k(1791968567)));
        o.w(-2035593366, (Object)new WOYg(nJPf$sILv.G("\u9be0\udb45\u2774\u2f71\u6d3c\u8105\u7822\u7031\uc245\ua6ab\ue8a7\u6017\u613e\uaf4b\u56e6"), 5, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(-1542765258), (String)o.k(-261864139)));
        o.w(41239730, (Object)new WOYg(nJPf$sILv.G("\u9bf9\udb44\u277b\u2f75\u6d20\u811c\u7838\u7027\uc253\ua6bb\ue8bb\u600d\u6134"), 6, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(1522812212), (String)o.k(950814003)));
        o.w(-1259060001, (Object)new WOYg(nJPf$sILv.G("\u9bf6\udb5e\u2774\u2f72\u6d20\u810b\u7833\u7037\uc249\ua6bb\ue8bd\u6006\u6122"), 7, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(-704953054), (String)o.k(-1821096671)));
        o.w(16467074, (Object)new WOYg(nJPf$sILv.G("\u9bf6\udb44\u2774\u2f72\u6d3a\u810d\u7829\u703c\uc247\ua6ae\ue8a6\u6001\u6130\uaf42\u56e6"), 8, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(-1699461838)), (String)o.k(-915651296), (String)o.k(-143112929)));
        o.w(927158134, (Object)new WOYg(nJPf$sILv.G("\u9be5\udb5e\u276a\u2f79\u6d3a\u8111\u7838\u702d\uc254\ua6a6\ue8a0\u600a\u6134\uaf56"), 9, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(-1442429666), (String)o.k(1908950301)));
        o.w(-437042026, (Object)new WOYg(nJPf$sILv.G("\u9be5\udb5e\u276a\u2f79\u6d3a\u8111\u783e\u702b\uc255\ua6a1\ue8bf\u6010"), 10, (sQJh)((Object)o.k(-333885624)), (IpeM)((Object)o.k(459099971)), (String)o.k(1440892188), (String)o.k(-2081929957)));
        o.w(-1323547350, new WOYg[]{(WOYg)((Object)o.k(-1205320487)), (WOYg)((Object)o.k(-581218462)), (WOYg)((Object)o.k(1796686912)), (WOYg)((Object)o.k(1622626142)), (WOYg)((Object)o.k(1206600904)), (WOYg)((Object)o.k(-2035593366)), (WOYg)((Object)o.k(41239730)), (WOYg)((Object)o.k(-1259060001)), (WOYg)((Object)o.k(16467074)), (WOYg)((Object)o.k(927158134)), (WOYg)((Object)o.k(-437042026))});
    }

    private WOYg(String string2, int n2, sQJh sQJh2, IpeM ipeM, String string3, String string4) {
        this.name = sQJh2;
        this.description = ipeM;
        this.ColC = string2;
        this.BKFT = (IpeM)n2;
    }

    public String getName() {
        return (String)o.a((Object)this, -428522199);
    }

    public String getDescription() {
        return (String)o.a((Object)this, 404309288);
    }

    public sQJh uVol() {
        return (sQJh)((Object)o.a((Object)this, -1647360729));
    }

    public IpeM UQfI() {
        return (IpeM)((Object)o.a((Object)this, 1184384294));
    }

    public static WOYg[] values() {
        WOYg[] arrwOYg = (WOYg[])o.k(-1323547350);
        int n = arrwOYg.length;
        WOYg[] arrwOYg2 = new WOYg[n];
        WOYg.Ai(arrwOYg, false, arrwOYg2, false, n);
        return arrwOYg2;
    }

    public static WOYg valueOf(String string) {
        return (WOYg)((Object)WOYg.Ai(WOYg.class, string));
    }

    private static Object Ai(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

