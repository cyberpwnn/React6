/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatColor
 *  org.bukkit.ChatColor
 *  org.bukkit.Color
 *  org.bukkit.DyeColor
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.DyeColor;

public class psKX
extends Enum<psKX> {
    public static final /* enum */ psKX NXNA;
    public static final /* enum */ psKX xsek;
    public static final /* enum */ psKX wgrO;
    public static final /* enum */ psKX JnCw;
    public static final /* enum */ psKX VhTv;
    public static final /* enum */ psKX hcwI;
    public static final /* enum */ psKX mtGS;
    public static final /* enum */ psKX Udoi;
    public static final /* enum */ psKX UmaT;
    public static final /* enum */ psKX dhkR;
    public static final /* enum */ psKX msfV;
    public static final /* enum */ psKX ExDw;
    public static final /* enum */ psKX VxtS;
    public static final /* enum */ psKX EMPs;
    public static final /* enum */ psKX cviX;
    public static final /* enum */ psKX wWPk;
    public static final /* enum */ psKX oOYV;
    public static final /* enum */ psKX EEAT;
    public static final /* enum */ psKX BKwy;
    public static final /* enum */ psKX QGcK;
    public static final /* enum */ psKX xHqM;
    public static final /* enum */ psKX VgsU;
    public static final char COLOR_CHAR = '\u00a7';
    private static final Pattern STRIP_COLOR_PATTERN;
    private final int veNi;
    private final char NiMl;
    private final boolean xkXa;
    private final String gHEO;
    private static final Map<Integer, psKX> grYC;
    private static final Map<Character, psKX> uPmB;
    private static final Map<DyeColor, psKX> LYxV;
    private static final Map<psKX, String> vvTR;
    private static final Map<DyeColor, String> hcyW;
    private static /* synthetic */ int[] sdYg;
    private static final /* synthetic */ psKX[] Vxvx;

    static {
        o.w(968906774, (Object)new psKX$1(FMkR$WjFM.a("\u2fa9\u2034\u7fc9\uda92\uae90"), 0, '0', 0));
        o.w(-1483982084, (Object)new psKX$12(FMkR$WjFM.a("\u2faf\u2039\u7fda\uda9a\uae84\uc32e\u35b0\u1403\u6fc1"), 1, '1', 1));
        o.w(-1737868549, (Object)new psKX$16(FMkR$WjFM.a("\u2faf\u2039\u7fda\uda9a\uae84\uc32b\u35ae\u1413\u6fc1\ua055"), 2, '2', 2));
        o.w(-1434167280, (Object)new psKX$17(FMkR$WjFM.a("\u2faf\u2039\u7fda\uda9a\uae84\uc32d\u35ad\u1403\u6fc5"), 3, '3', 3));
        o.w(-334480758, (Object)new psKX$18(FMkR$WjFM.a("\u2faf\u2039\u7fda\uda9a\uae84\uc33e\u35b9\u1412"), 4, '4', 4));
        o.w(-1638843767, (Object)new psKX$19(FMkR$WjFM.a("\u2faf\u2039\u7fda\uda9a\uae84\uc33c\u35a9\u1404\u6fd4\ua057\ud993"), 5, '5', 5));
        o.w(1742689159, (Object)new psKX$20(FMkR$WjFM.a("\u2fac\u2037\u7fc4\uda95"), 6, '6', 6));
        o.w(-23312902, (Object)new psKX$21(FMkR$WjFM.a("\u2fac\u202a\u7fc9\uda88"), 7, '7', 7));
        o.w(1251758875, (Object)new psKX$22(FMkR$WjFM.a("\u2faf\u2039\u7fda\uda9a\uae84\uc32b\u35ae\u1417\u6fdd"), 8, '8', 8));
        o.w(-78824824, (Object)new psKX$2(FMkR$WjFM.a("\u2fa9\u2034\u7fdd\uda94"), 9, '9', 9));
        o.w(-1868409976, (Object)new psKX$3(FMkR$WjFM.a("\u2fac\u202a\u7fcd\uda94\uae95"), 10, 'a', 10));
        o.w(-1118678018, (Object)new psKX$4(FMkR$WjFM.a("\u2faa\u2029\u7fdd\uda90"), 11, 'b', 11));
        o.w(568215020, (Object)new psKX$5(FMkR$WjFM.a("\u2fb9\u203d\u7fcc"), 12, 'c', 12));
        o.w(-857517477, (Object)new psKX$6(FMkR$WjFM.a("\u2fa7\u2031\u7fcf\uda99\uae8f\uc333\u35ac\u1403\u6fd6\ua04b\ud99a\u2470"), 13, 'd', 13));
        o.w(2144817739, (Object)new psKX$7(FMkR$WjFM.a("\u2fb2\u203d\u7fc4\uda9d\uae94\uc33b"), 14, 'e', 14));
        o.w(-1880078855, (Object)new psKX$8(FMkR$WjFM.a("\u2fbc\u2030\u7fc1\uda85\uae9e"), 15, 'f', 15));
        o.w(-1175635321, (Object)new psKX$9(FMkR$WjFM.a("\u2fa6\u2039\u7fcf\uda98\uae98"), 16, 'k', 16, true));
        o.w(-1489545201, (Object)new psKX$10(FMkR$WjFM.a("\u2fa9\u2037\u7fc4\uda95"), 17, 'l', 17, true));
        o.w(1944140422, (Object)new psKX$11(FMkR$WjFM.a("\u2fb8\u202c\u7fda\uda98\uae90\uc329\u35a8\u141e\u6fd6\ua054\ud983\u2472\ucdfa"), 18, 'm', 18, true));
        o.w(-911320963, (Object)new psKX$13(FMkR$WjFM.a("\u2fbe\u2036\u7fcc\uda94\uae89\uc320\u35b5\u1418\u6fc1"), 19, 'n', 19, true));
        o.w(1753241614, (Object)new psKX$14(FMkR$WjFM.a("\u2fa2\u202c\u7fc9\uda9d\uae92\uc32f"), 20, 'o', 20, true));
        o.w(692209039, (Object)new psKX$15(FMkR$WjFM.a("\u2fb9\u203d\u7fdb\uda94\uae8f"), 21, 'r', 21));
        o.w(-2012005755, new psKX[]{(psKX)((Object)o.k(968906774)), (psKX)((Object)o.k(-1483982084)), (psKX)((Object)o.k(-1737868549)), (psKX)((Object)o.k(-1434167280)), (psKX)((Object)o.k(-334480758)), (psKX)((Object)o.k(-1638843767)), (psKX)((Object)o.k(1742689159)), (psKX)((Object)o.k(-23312902)), (psKX)((Object)o.k(1251758875)), (psKX)((Object)o.k(-78824824)), (psKX)((Object)o.k(-1868409976)), (psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(2144817739)), (psKX)((Object)o.k(-1880078855)), (psKX)((Object)o.k(-1175635321)), (psKX)((Object)o.k(-1489545201)), (psKX)((Object)o.k(1944140422)), (psKX)((Object)o.k(-911320963)), (psKX)((Object)o.k(1753241614)), (psKX)((Object)o.k(692209039))});
        o.w(1796553347, psKX.ji(psKX.ji(psKX.ji(psKX.ji(new StringBuilder(FMkR$WjFM.a("\u2fc3\u2047\u7fe1\udaf8")), FMkR$WjFM.a("\u2f4c")), FMkR$WjFM.a("\u2fb0\u2048\u7fa5\udae8\uae9a\uc341\u35ba\u141d\u6fa9\ua054\ud984\u2468")))));
        o.w(-1625014926, new HashMap());
        o.w(1647590769, new HashMap());
        o.w(581451120, new HashMap());
        o.w(610221423, new HashMap());
        o.w(732380526, new HashMap());
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(968906774)), FMkR$WjFM.a("\u2fc8\u2048\u7fb8\udae1"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-1483982084)), FMkR$WjFM.a("\u2fc8\u2048\u7fb8\udab0"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-1737868549)), FMkR$WjFM.a("\u2fc8\u2048\u7fe9\udae1"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-1434167280)), FMkR$WjFM.a("\u2fc8\u2048\u7fe9\udab0"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-334480758)), FMkR$WjFM.a("\u2fc8\u2019\u7fb8\udae1"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-1638843767)), FMkR$WjFM.a("\u2fc8\u2019\u7fb8\udab0"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(1742689159)), FMkR$WjFM.a("\u2fc8\u201e\u7fe9\udae1"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-23312902)), FMkR$WjFM.a("\u2fc8\u2041\u7fb1\udae8"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(1251758875)), FMkR$WjFM.a("\u2fc8\u204d\u7fbd\udae4"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-78824824)), FMkR$WjFM.a("\u2fc8\u204d\u7fbd\udab7"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-1868409976)), FMkR$WjFM.a("\u2fc8\u204d\u7feb\udae4"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-1118678018)), FMkR$WjFM.a("\u2fc8\u204d\u7feb\udab2"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(568215020)), FMkR$WjFM.a("\u2fc8\u201e\u7fbd\udae4"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-857517477)), FMkR$WjFM.a("\u2fc8\u201e\u7fbd\udab7"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(2144817739)), FMkR$WjFM.a("\u2fc8\u201b\u7feb\udae4"));
        ((Map)o.k(610221423)).put((psKX)((Object)o.k(-1880078855)), FMkR$WjFM.a("\u2fc8\u2019\u7fe9\udab0"));
        ((Map)o.k(581451120)).put((DyeColor)o.k(1456487789), (psKX)((Object)o.k(1251758875)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-1829356180), (psKX)((Object)o.k(-1483982084)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-331530901), (psKX)((Object)o.k(1742689159)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(927618874), (psKX)((Object)o.k(-1118678018)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(323501434), (psKX)((Object)o.k(-23312902)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(1817204536), (psKX)((Object)o.k(-1737868549)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-1568588423), (psKX)((Object)o.k(-78824824)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(749419896), (psKX)((Object)o.k(-1868409976)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-1680130697), (psKX)((Object)o.k(-857517477)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(497761654), (psKX)((Object)o.k(1742689159)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-663339659), (psKX)((Object)o.k(-857517477)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(1392006967), (psKX)((Object)o.k(-1638843767)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-678668487), (psKX)((Object)o.k(568215020)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-90161804), (psKX)((Object)o.k(-23312902)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-1389675149), (psKX)((Object)o.k(-1880078855)));
        ((Map)o.k(581451120)).put((DyeColor)o.k(-1761985182), (psKX)((Object)o.k(2144817739)));
        ((Map)o.k(732380526)).put((DyeColor)o.k(1456487789), FMkR$WjFM.a("\u2fc8\u2049\u7fb0\udae0\uaeef\uc35d\u35c8"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-1829356180), FMkR$WjFM.a("\u2fc8\u204a\u7fbd\udae2\uaeea\uc355\u35cf"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-331530901), FMkR$WjFM.a("\u2fc8\u204d\u7fbe\udae2\uaee8\uc35d\u359f"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(927618874), FMkR$WjFM.a("\u2fc8\u204a\u7fbe\udae6\uaeea\uc355\u35cd"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(323501434), FMkR$WjFM.a("\u2fc8\u204c\u7fb9\udae5\uaeea\uc358\u35cd"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(1817204536), FMkR$WjFM.a("\u2fc8\u204b\u7fbe\udae5\uaeb9\uc35d\u35c4"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-1568588423), FMkR$WjFM.a("\u2fc8\u204e\u7fbb\udae9\uaeec\uc308\u35ce"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(749419896), FMkR$WjFM.a("\u2fc8\u204b\u7fb1\udab3\uaeba\uc35e\u3599"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-1680130697), FMkR$WjFM.a("\u2fc8\u201a\u7fed\udae5\uaee2\uc30f\u35c5"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(497761654), FMkR$WjFM.a("\u2fc8\u201d\u7fe9\udae6\uaebe\uc35f\u35c9"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-663339659), FMkR$WjFM.a("\u2fc8\u201c\u7fb1\udae9\uaeea\uc355\u35c5"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(1392006967), FMkR$WjFM.a("\u2fc8\u204f\u7fed\udae2\uaeef\uc30e\u359a"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-678668487), FMkR$WjFM.a("\u2fc8\u2041\u7fed\udae3\uaeb9\uc35e\u35cb"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-90161804), FMkR$WjFM.a("\u2fc8\u2019\u7fb8\udab0\uaeec\uc30d\u35cb"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-1389675149), FMkR$WjFM.a("\u2fc8\u2019\u7fbc\udab0\uaeef\uc30d\u35c8"));
        ((Map)o.k(732380526)).put((DyeColor)o.k(-1761985182), FMkR$WjFM.a("\u2fc8\u201b\u7fba\udab3\uaeee\uc35d\u359f"));
        psKX[] arrpsKX = psKX.values();
        int n = arrpsKX.length;
        int n2 = 0;
        while (n2 < n) {
            psKX psKX2 = arrpsKX[n2];
            ((Map)o.k(-1625014926)).put(psKX.ji((Integer)o.a((Object)psKX2, 1031683425)), psKX2);
            ((Map)o.k(1647590769)).put(psKX.ji(((Character)o.a((Object)psKX2, 320486752)).charValue()), psKX2);
            ++n2;
        }
    }

    private psKX(String string2, int n2, char c, int n3) {
        this(string, n, (char)string2, n2, false);
    }

    private psKX(String string2, int n2, char c, int n3, boolean bl) {
        this.NiMl = string2;
        this.veNi = n2;
        this.xkXa = c;
        this.gHEO = new String(new char[]{'\u00a7', string2});
    }

    public ChatColor asBungee() {
        return (ChatColor)o.k(1911437972);
    }

    public char getChar() {
        return ((Character)o.a((Object)this, 320486752)).charValue();
    }

    public String toString() {
        return (String)o.a((Object)this, 638401886);
    }

    public DyeColor Edqb() {
        return psKX.yJLS(this.eQKy());
    }

    public String wgAV() {
        return psKX.UtIU(this.eQKy());
    }

    public boolean isFormat() {
        return (Boolean)o.a((Object)this, 265502045);
    }

    public boolean isColor() {
        if (!((Boolean)o.a((Object)this, 265502045)).booleanValue() && this != (psKX)((Object)o.k(692209039))) {
            return true;
        }
        return false;
    }

    public static psKX ktHX(char c) {
        try {
            return (psKX)((Object)((Map)o.k(1647590769)).get(psKX.ji(c)));
        }
        catch (Exception exception) {
            return (psKX)((Object)o.k(-1880078855));
        }
    }

    public static psKX HCPo(String string) {
        try {
            psKX.ji(string, mrFx$WjFM.d("\ud5db\u0f71\ueb30\u5114\ucf7c\u2cb1\ufeae\u942f\u2f57\uc056\u2270\ub206\uc263\u464f\uc7c0\ucbde\ud59c\u069c\uab48"));
            psKX.ji(psKX.ji(string) > 0, mrFx$WjFM.d("\ud5db\u0f71\ueb30\u5114\ucf7c\u2cbf\ufeba\u9432\u2f4d\uc019\u226c\ub247\uc277\u464f\uc7c0\ucbd1\ud59d\u06d0\uab48\uc617\u0499\u19e7\ue69f\u63f1\ub120\u30c5\uef2f\ue99e\u809d\u7569\uf488\udf43"));
            return (psKX)((Object)((Map)o.k(1647590769)).get(psKX.ji(psKX.ji(string, false))));
        }
        catch (Exception exception) {
            return (psKX)((Object)o.k(-1880078855));
        }
    }

    public static String stripColor(String string) {
        if (string == null) {
            return null;
        }
        return psKX.ji(psKX.ji((Pattern)o.k(1796553347), string), "");
    }

    public static psKX UtIU(DyeColor dyeColor) {
        if (((Map)o.k(581451120)).containsKey((Object)dyeColor)) {
            return (psKX)((Object)((Map)o.k(581451120)).get((Object)dyeColor));
        }
        return (psKX)((Object)o.k(-1175635321));
    }

    public static DyeColor yJLS(org.bukkit.ChatColor chatColor) {
        for (DyeColor dyeColor : ((Map)o.k(581451120)).keySet()) {
            if (psKX.ji(((psKX)((Object)((Map)o.k(581451120)).get((Object)dyeColor))).toString(), psKX.ji(chatColor)) == false) continue;
            return dyeColor;
        }
        return (DyeColor)o.k(1456487789);
    }

    public static String UtIU(org.bukkit.ChatColor chatColor) {
        if (((Map)o.k(610221423)).containsKey((Object)chatColor)) {
            return (String)((Map)o.k(610221423)).get((Object)chatColor);
        }
        return nJPf$sILv.G("\u2ed2\ucb24\u3710\u390f");
    }

    public static String biLo(DyeColor dyeColor) {
        if (((Map)o.k(732380526)).containsKey((Object)dyeColor)) {
            return (String)((Map)o.k(732380526)).get((Object)dyeColor);
        }
        return FMkR$WjFM.a("\u6816\ud5f2\uccf3\u4518");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color OihG(String object) {
        if (psKX.ji(object, nJPf$sILv.G("\u490f")) != false) {
            object = psKX.ji(object, true);
        }
        if (psKX.ji(object, nJPf$sILv.G("\u4954")) != -1) {
            object = psKX.ji(object, psKX.ji(object, nJPf$sILv.G("\u4954")));
        }
        if (psKX.ji(object) != 6) {
            if (psKX.ji(object) != 3) {
                return null;
            }
        }
        reference var1_1 = psKX.ji(object) / 3;
        int n = 1 << (2 - var1_1 << 2);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < psKX.ji(object)) {
            n2 |= n * psKX.ji(psKX.ji(object, n4, n4 + var1_1), 16) << (n3 << 3);
            ++n3;
            n4 += var1_1;
        }
        return psKX.ji(n2 & 16777215);
    }

    public static Color uWRY(String string) {
        String[] arrstring = (String[])psKX.ji(string, mrFx$WjFM.d("\udb4c\u736f\u63a1\udd8e\ubf06\u3718\ud198"));
        if (arrstring.length < 3) {
            return null;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < 3) {
            n |= psKX.ji(arrstring[n2]) << (n2 << 3);
            ++n2;
        }
        return psKX.ji(n & 16777215);
    }

    public static String oVXW() {
        StringBuilder stringBuilder = new StringBuilder();
        psKX.ji(stringBuilder, nJPf$sILv.G("\u8a34\u9476\uf774\u09d7\u133c\ue1f5\uc0c9\u7c27\uf99a\uc293\u8c30\u2c5a\u452b\u90b1\u1046\u1519\ubda2\u83ba\u11ec\u2953\ucac2\u9d04\uc7ac\u92c9\u0c3f\u5ae7\u0f51\u67e9\u9f90\u3910\ub7bf\u9ef2\ued23\u8d2d\uf567\u7f3c\u9e15\ud16a\u6c8c\u5d0c\u728c\u7ed3\u51ba\udaca\ub804\u507a\u49bc\u1763\ud986"));
        for (Map.Entry entry : ((Map)o.k(610221423)).entrySet()) {
            psKX.ji(stringBuilder, psKX.ji(nJPf$sILv.G("\u8a34\u9476\uf767\u098b\u136c\ue1e4\uc093\u7c3b\uf99d\uc295\u8c77\u2c0a\u453a\u90e8\u105f\u1539\ubda5\u83b7\u11f7\u2901\ucabb\u9d4b\uc7e5\u9294\u0c69\u5aa8\u0f45\u67ba\u9fca\u390b\ub7b2\u9ea2\ued34\u8d2f\uf50b\u7f27\u9e1d\ud13b\u6cc2\u5d44\u72c7\u7e87\u51ad\uda80\ub841\u5039\u49ad\u172c\ud99f\u06cd\u6eab\ue5c8\ud061\u5fb2\ub28f\u645f\u5df4\u9359\u095a\uf86e\uf48a\u443a\u2ed9\u385a\ud5ad\u11f6\ue041\uffab\uac6c\u6846\u0187\u5713\u8bf5\ue98f\u027b\u8d7b\u9ef0\u339b\u68f7\uf09f\u2b07\uc4e4\ue650\u6136"), new Object[]{((psKX)((Object)entry.getKey())).name(), entry.getValue()}));
        }
        psKX.ji(stringBuilder, nJPf$sILv.G("\u8a34\u942d\uf761\u09d4\u1332\ue1fc\uc092\u7c25"));
        psKX.ji(stringBuilder, nJPf$sILv.G("\u8a34\u9476\uf774\u09d7\u133c\ue1f5\uc0c9\u7c27\uf99a\uc293\u8c30\u2c5a\u452b\u90b1\u1046\u151e\ubdb3\u83be\u11b8\u2930\ucaee\u9d07\uc7af\u92d4\u0c71\u5af4\u0f0a\u67f9\u9fca\u3912\ub7f7\u9ee2\ued79\u8d50\uf54b\u7f3f\u9e16\ud177\u6cc2\u5d1f\u72d7\u7ec3\u51e0\udac8\ub817\u5021\u49ba\u172f"));
        for (Map.Entry entry : ((Map)o.k(732380526)).entrySet()) {
            Object[] arrobject = new Object[2];
            arrobject[0] = psKX.ji((DyeColor)entry.getKey());
            arrobject[1] = entry.getValue();
            psKX.ji(stringBuilder, psKX.ji(nJPf$sILv.G("\u8a34\u9476\uf767\u098b\u136c\ue1e4\uc093\u7c3b\uf99d\uc295\u8c77\u2c0a\u453a\u90e8\u105f\u1539\ubda5\u83b7\u11f7\u2901\ucabb\u9d4b\uc7e5\u9294\u0c69\u5aa8\u0f45\u67ba\u9fca\u390b\ub7b2\u9ea2\ued34\u8d2f\uf50b\u7f27\u9e1d\ud13b\u6cc2\u5d44\u72c7\u7e87\u51ad\uda80\ub841\u5039\u49ad\u172c\ud99f\u06cd\u6eab\ue5c8\ud061\u5fb2\ub28f\u645f\u5df4\u9359\u095a\uf86e\uf48a\u443a\u2ed9\u385a\ud5ad\u11f6\ue041\uffab\uac6c\u6846\u0187\u5713\u8bf5\ue98f\u027b\u8d7b\u9ef0\u339b\u68f7\uf09f\u2b07\uc4e4\ue650\u6136"), arrobject));
        }
        psKX.ji(stringBuilder, nJPf$sILv.G("\u8a34\u942d\uf761\u09d4\u1332\ue1fc\uc092\u7c25"));
        return psKX.ji(stringBuilder);
    }

    public org.bukkit.ChatColor eQKy() {
        return psKX.ji(((Character)o.a((Object)this, 320486752)).charValue());
    }

    public static String translateAlternateColorCodes(char c, String string) {
        char[] arrc = (char[])psKX.ji(string);
        int n = 0;
        while (n < arrc.length - 1) {
            if (arrc[n] == c) {
                if (psKX.ji(nJPf$sILv.G("\uf809\uca14\uc52e\u6fee\u2f70\u0f90\u5329\u5651\u7d72\u95a0\u8f82\uf493\u42b8\u26a8\u0496\u1084\u794d\uc806\u7dec\uf05f\ub0f1\ue1f5\uea0a\u3fea\u7b60\uc274\uc7ec\ub7e6\ucb02\uca0a\u1d3a\u4959\u40e1\uac3b"), arrc[n + 1]) >= 0) {
                    arrc[n] = 167;
                    arrc[n + 1] = psKX.ji(arrc[n + 1]);
                }
            }
            ++n;
        }
        return new String(arrc);
    }

    public static psKX GPlk(byte by) {
        psKX[] arrpsKX = psKX.values();
        int n = arrpsKX.length;
        int n2 = 0;
        while (n2 < n) {
            psKX psKX2 = arrpsKX[n2];
            if (psKX2.AXet() == by) {
                return psKX2;
            }
            ++n2;
        }
        return null;
    }

    public byte AXet() {
        switch (psKX.ryTY()[this.ordinal()]) {
            case 12: {
                return 9;
            }
            case 1: {
                return 15;
            }
            case 10: {
                return 3;
            }
            case 18: {
                return -1;
            }
            case 4: {
                return 9;
            }
            case 2: {
                return 11;
            }
            case 9: {
                return 7;
            }
            case 3: {
                return 13;
            }
            case 6: {
                return 10;
            }
            case 5: {
                return 14;
            }
            case 7: {
                return 4;
            }
            case 8: {
                return 8;
            }
            case 11: {
                return 5;
            }
            case 21: {
                return -1;
            }
            case 14: {
                return 2;
            }
            case 17: {
                return -1;
            }
            case 13: {
                return 14;
            }
            case 22: {
                return -1;
            }
            case 19: {
                return -1;
            }
            case 20: {
                return -1;
            }
            case 16: {
                return 0;
            }
            case 15: {
                return 4;
            }
        }
        return -1;
    }

    public static String getLastColors(String string) {
        Object object = "";
        Object object2 = psKX.ji(string);
        reference var3_3 = object2 - true;
        while (var3_3 >= 0) {
            Object object3 = psKX.ji(string, var3_3);
            if (object3 == 167 && var3_3 < object2 - true) {
                Object object4 = psKX.ji(string, var3_3 + true);
                psKX psKX2 = psKX.ktHX((char)object4);
                if (psKX2 != null) {
                    object = psKX.ji(psKX.ji(new StringBuilder((String)psKX.ji(psKX2.toString())), object));
                    if (psKX2.isColor() || psKX2.equals((Object)((psKX)((Object)o.k(692209039))))) break;
                }
            }
            --var3_3;
        }
        return object;
    }

    public static psKX[] values() {
        psKX[] arrpsKX = (psKX[])o.k(-2012005755);
        int n = arrpsKX.length;
        psKX[] arrpsKX2 = new psKX[n];
        psKX.ji(arrpsKX, false, arrpsKX2, false, n);
        return arrpsKX2;
    }

    public static psKX valueOf(String string) {
        return (psKX)((Object)psKX.ji(psKX.class, string));
    }

    /* synthetic */ psKX(String string, int n, char c, int n2, psKX psKX2) {
        this(string, n, c, n2);
    }

    /* synthetic */ psKX(String string, int n, char c, int n2, boolean bl, psKX psKX2) {
        this(string, n, c, n2, bl);
    }

    static /* synthetic */ int[] ryTY() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(1833712974);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[psKX.values().length];
        try {
            arrn[((psKX)o.k((int)-1118678018)).ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)968906774)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-78824824)).ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1489545201)).ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1434167280)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1483982084)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)1251758875)).ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1737868549)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1638843767)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-334480758)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)1742689159)).ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-23312902)).ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1868409976)).ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)1753241614)).ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-857517477)).ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1175635321)).ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)568215020)).ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)692209039)).ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)1944140422)).ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-911320963)).ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)-1880078855)).ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((psKX)o.k((int)2144817739)).ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(1833712974, arrn3);
        return arrn3;
    }

    private static Object ji(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

