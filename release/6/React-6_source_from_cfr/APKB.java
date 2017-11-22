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

public class APKB
extends Enum<APKB> {
    public static final /* enum */ APKB ydmy;
    public static final /* enum */ APKB rylJ;
    public static final /* enum */ APKB Evkp;
    public static final /* enum */ APKB JAtw;
    public static final /* enum */ APKB kBSe;
    public static final /* enum */ APKB XeQX;
    public static final /* enum */ APKB AkAV;
    public static final /* enum */ APKB BmcV;
    public static final /* enum */ APKB RlNu;
    public static final /* enum */ APKB GkoS;
    public static final /* enum */ APKB riKR;
    public static final /* enum */ APKB uibk;
    public static final /* enum */ APKB OHsC;
    public static final /* enum */ APKB lUwM;
    public static final /* enum */ APKB PwKL;
    public static final /* enum */ APKB fCeG;
    public static final /* enum */ APKB YpdF;
    public static final /* enum */ APKB gGIE;
    public static final /* enum */ APKB SoRh;
    public static final /* enum */ APKB wNEp;
    public static final /* enum */ APKB WQKp;
    public static final /* enum */ APKB dhSG;
    public static final char COLOR_CHAR = '\u00a7';
    private static final Pattern STRIP_COLOR_PATTERN;
    private final int AQMc;
    private final char OYuJ;
    private final boolean mrkn;
    private final String vtvD;
    private static final Map<Integer, APKB> FynU;
    private static final Map<Character, APKB> QOYt;
    private static final Map<DyeColor, APKB> kKFv;
    private static final Map<APKB, String> jXeG;
    private static final Map<DyeColor, String> PCgx;
    private static /* synthetic */ int[] qCgJ;
    private static final /* synthetic */ APKB[] FGLm;

    static {
        cv.V(456069525, (Object)new APKB$1(KUXS$dwji.S("\uac27\u67aa\uaf7f\ubd95\u8549"), 0, '0', 0));
        cv.V(371979328, (Object)new APKB$12(KUXS$dwji.S("\uac21\u67a7\uaf6c\ubd9d\u855d\uf409\ue90a\ufefd\u36ea"), 1, '1', 1));
        cv.V(-1099959229, (Object)new APKB$16(KUXS$dwji.S("\uac21\u67a7\uaf6c\ubd9d\u855d\uf40c\ue914\ufeed\u36ea\ub9a3"), 2, '2', 2));
        cv.V(-121302624, (Object)new APKB$17(KUXS$dwji.S("\uac21\u67a7\uaf6c\ubd9d\u855d\uf40a\ue917\ufefd\u36ee"), 3, '3', 3));
        cv.V(-281086910, (Object)new APKB$18(KUXS$dwji.S("\uac21\u67a7\uaf6c\ubd9d\u855d\uf419\ue903\ufeec"), 4, '4', 4));
        cv.V(362673229, (Object)new APKB$19(KUXS$dwji.S("\uac21\u67a7\uaf6c\ubd9d\u855d\uf41b\ue913\ufefa\u36ff\ub9a1\uaad1"), 5, '5', 5));
        cv.V(-1207700747, (Object)new APKB$20(KUXS$dwji.S("\uac22\u67a9\uaf72\ubd92"), 6, '6', 6));
        cv.V(-1071443542, (Object)new APKB$21(KUXS$dwji.S("\uac22\u67b4\uaf7f\ubd8f"), 7, '7', 7));
        cv.V(416543530, (Object)new APKB$22(KUXS$dwji.S("\uac21\u67a7\uaf6c\ubd9d\u855d\uf40c\ue914\ufee9\u36f6"), 8, '8', 8));
        cv.V(2048062540, (Object)new APKB$2(KUXS$dwji.S("\uac27\u67aa\uaf6b\ubd93"), 9, '9', 9));
        cv.V(1489703379, (Object)new APKB$3(KUXS$dwji.S("\uac22\u67b4\uaf7b\ubd93\u854c"), 10, 'a', 10));
        cv.V(1197215955, (Object)new APKB$4(KUXS$dwji.S("\uac24\u67b7\uaf6b\ubd97"), 11, 'b', 11));
        cv.V(-314502936, (Object)new APKB$5(KUXS$dwji.S("\uac37\u67a3\uaf7a"), 12, 'c', 12));
        cv.V(1129452014, (Object)new APKB$6(KUXS$dwji.S("\uac29\u67af\uaf79\ubd9e\u8556\uf414\ue916\ufefd\u36fd\ub9bd\uaad8\u4ca6"), 13, 'd', 13));
        cv.V(-1154812849, (Object)new APKB$7(KUXS$dwji.S("\uac3c\u67a3\uaf72\ubd9a\u854d\uf41c"), 14, 'e', 14));
        cv.V(653004664, (Object)new APKB$8(KUXS$dwji.S("\uac32\u67ae\uaf77\ubd82\u8547"), 15, 'f', 15));
        cv.V(-1643842482, (Object)new APKB$9(KUXS$dwji.S("\uac28\u67a7\uaf79\ubd9f\u8541"), 16, 'k', 16, true));
        cv.V(-1164766813, (Object)new APKB$10(KUXS$dwji.S("\uac27\u67a9\uaf72\ubd92"), 17, 'l', 17, true));
        cv.V(-1538722743, (Object)new APKB$11(KUXS$dwji.S("\uac36\u67b2\uaf6c\ubd9f\u8549\uf40e\ue912\ufee0\u36fd\ub9a2\uaac1\u4ca4\ube71"), 18, 'm', 18, true));
        cv.V(223736904, (Object)new APKB$13(KUXS$dwji.S("\uac30\u67a8\uaf7a\ubd93\u8550\uf407\ue90f\ufee6\u36ea"), 19, 'n', 19, true));
        cv.V(-352841310, (Object)new APKB$14(KUXS$dwji.S("\uac2c\u67b2\uaf7f\ubd9a\u854b\uf408"), 20, 'o', 20, true));
        cv.V(1712131958, (Object)new APKB$15(KUXS$dwji.S("\uac37\u67a3\uaf6d\ubd93\u8556"), 21, 'r', 21));
        cv.V(1628632139, new APKB[]{(APKB)((Object)cv.e(456069525)), (APKB)((Object)cv.e(371979328)), (APKB)((Object)cv.e(-1099959229)), (APKB)((Object)cv.e(-121302624)), (APKB)((Object)cv.e(-281086910)), (APKB)((Object)cv.e(362673229)), (APKB)((Object)cv.e(-1207700747)), (APKB)((Object)cv.e(-1071443542)), (APKB)((Object)cv.e(416543530)), (APKB)((Object)cv.e(2048062540)), (APKB)((Object)cv.e(1489703379)), (APKB)((Object)cv.e(1197215955)), (APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(1129452014)), (APKB)((Object)cv.e(-1154812849)), (APKB)((Object)cv.e(653004664)), (APKB)((Object)cv.e(-1643842482)), (APKB)((Object)cv.e(-1164766813)), (APKB)((Object)cv.e(-1538722743)), (APKB)((Object)cv.e(223736904)), (APKB)((Object)cv.e(-352841310)), (APKB)((Object)cv.e(1712131958))});
        cv.V(-478350283, APKB.yA(APKB.yA(APKB.yA(APKB.yA(new StringBuilder(KUXS$dwji.S("\uac4d\u67d9\uaf57\ubdff")), KUXS$dwji.S("\uacc2")), KUXS$dwji.S("\uac3e\u67d6\uaf13\ubdef\u8543\uf466\ue900\ufee3\u3682\ub9a2\uaac6\u4cbe")))));
        cv.V(-1284705228, new HashMap());
        cv.V(-1143344073, new HashMap());
        cv.V(-1302924234, new HashMap());
        cv.V(-1894910927, new HashMap());
        cv.V(-1733495760, new HashMap());
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(456069525)), KUXS$dwji.S("\uac46\u67d6\uaf0e\ubde6"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(371979328)), KUXS$dwji.S("\uac46\u67d6\uaf0e\ubdb7"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(-1099959229)), KUXS$dwji.S("\uac46\u67d6\uaf5f\ubde6"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(-121302624)), KUXS$dwji.S("\uac46\u67d6\uaf5f\ubdb7"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(-281086910)), KUXS$dwji.S("\uac46\u6787\uaf0e\ubde6"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(362673229)), KUXS$dwji.S("\uac46\u6787\uaf0e\ubdb7"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(-1207700747)), KUXS$dwji.S("\uac46\u6780\uaf5f\ubde6"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(-1071443542)), KUXS$dwji.S("\uac46\u67df\uaf07\ubdef"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(416543530)), KUXS$dwji.S("\uac46\u67d3\uaf0b\ubde3"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(2048062540)), KUXS$dwji.S("\uac46\u67d3\uaf0b\ubdb0"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(1489703379)), KUXS$dwji.S("\uac46\u67d3\uaf5d\ubde3"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(1197215955)), KUXS$dwji.S("\uac46\u67d3\uaf5d\ubdb5"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(-314502936)), KUXS$dwji.S("\uac46\u6780\uaf0b\ubde3"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(1129452014)), KUXS$dwji.S("\uac46\u6780\uaf0b\ubdb0"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(-1154812849)), KUXS$dwji.S("\uac46\u6785\uaf5d\ubde3"));
        ((Map)cv.e(-1894910927)).put((APKB)((Object)cv.e(653004664)), KUXS$dwji.S("\uac46\u6787\uaf5f\ubdb7"));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(40825907), (APKB)((Object)cv.e(416543530)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-1368853454), (APKB)((Object)cv.e(371979328)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-172821443), (APKB)((Object)cv.e(-1207700747)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(1968698111), (APKB)((Object)cv.e(1197215955)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(655422524), (APKB)((Object)cv.e(-1071443542)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-584322120), (APKB)((Object)cv.e(-1099959229)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(252965951), (APKB)((Object)cv.e(2048062540)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-121179074), (APKB)((Object)cv.e(1489703379)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(545715257), (APKB)((Object)cv.e(1129452014)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(1188165112), (APKB)((Object)cv.e(-1207700747)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(2052650491), (APKB)((Object)cv.e(1129452014)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-473173061), (APKB)((Object)cv.e(362673229)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-259198215), (APKB)((Object)cv.e(-314502936)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(224982522), (APKB)((Object)cv.e(-1071443542)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-1621297691), (APKB)((Object)cv.e(653004664)));
        ((Map)cv.e(-1302924234)).put((DyeColor)cv.e(-1078725148), (APKB)((Object)cv.e(-1154812849)));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(40825907), KUXS$dwji.S("\uac46\u67d7\uaf06\ubde7\u8536\uf47a\ue972"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-1368853454), KUXS$dwji.S("\uac46\u67d4\uaf0b\ubde5\u8533\uf472\ue975"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-172821443), KUXS$dwji.S("\uac46\u67d3\uaf08\ubde5\u8531\uf47a\ue925"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(1968698111), KUXS$dwji.S("\uac46\u67d4\uaf08\ubde1\u8533\uf472\ue977"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(655422524), KUXS$dwji.S("\uac46\u67d2\uaf0f\ubde2\u8533\uf47f\ue977"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-584322120), KUXS$dwji.S("\uac46\u67d5\uaf08\ubde2\u8560\uf47a\ue97e"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(252965951), KUXS$dwji.S("\uac46\u67d0\uaf0d\ubdee\u8535\uf42f\ue974"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-121179074), KUXS$dwji.S("\uac46\u67d5\uaf07\ubdb4\u8563\uf479\ue923"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(545715257), KUXS$dwji.S("\uac46\u6784\uaf5b\ubde2\u853b\uf428\ue97f"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(1188165112), KUXS$dwji.S("\uac46\u6783\uaf5f\ubde1\u8567\uf478\ue973"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(2052650491), KUXS$dwji.S("\uac46\u6782\uaf07\ubdee\u8533\uf472\ue97f"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-473173061), KUXS$dwji.S("\uac46\u67d1\uaf5b\ubde5\u8536\uf429\ue920"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-259198215), KUXS$dwji.S("\uac46\u67df\uaf5b\ubde4\u8560\uf479\ue971"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(224982522), KUXS$dwji.S("\uac46\u6787\uaf0e\ubdb7\u8535\uf42a\ue971"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-1621297691), KUXS$dwji.S("\uac46\u6787\uaf0a\ubdb7\u8536\uf42a\ue972"));
        ((Map)cv.e(-1733495760)).put((DyeColor)cv.e(-1078725148), KUXS$dwji.S("\uac46\u6785\uaf0c\ubdb4\u8537\uf47a\ue925"));
        APKB[] arraPKB = APKB.values();
        int n = arraPKB.length;
        int n2 = 0;
        while (n2 < n) {
            APKB aPKB = arraPKB[n2];
            ((Map)cv.e(-1284705228)).put(APKB.yA((Integer)cv.b((Object)aPKB, -1261308441)), aPKB);
            ((Map)cv.e(-1143344073)).put(APKB.yA(((Character)cv.b((Object)aPKB, -1649805850)).charValue()), aPKB);
            ++n2;
        }
    }

    private APKB(String string2, int n2, char c, int n3) {
        this(string, n, (char)string2, n2, false);
    }

    private APKB(String string2, int n2, char c, int n3, boolean bl) {
        this.OYuJ = string2;
        this.AQMc = n2;
        this.mrkn = c;
        this.vtvD = new String(new char[]{'\u00a7', string2});
    }

    public ChatColor asBungee() {
        return (ChatColor)cv.e(135394392);
    }

    public char getChar() {
        return ((Character)cv.b((Object)this, -1649805850)).charValue();
    }

    public String toString() {
        return (String)cv.b((Object)this, 1840641504);
    }

    public DyeColor dVTX() {
        return APKB.ssNb(this.DajI());
    }

    public String BAnt() {
        return APKB.DYFV(this.DajI());
    }

    public boolean isFormat() {
        return (Boolean)cv.b((Object)this, -2086930973);
    }

    public boolean isColor() {
        if (!((Boolean)cv.b((Object)this, -2086930973)).booleanValue() && this != (APKB)((Object)cv.e(1712131958))) {
            return true;
        }
        return false;
    }

    public static APKB lCdp(char c) {
        try {
            return (APKB)((Object)((Map)cv.e(-1143344073)).get(APKB.yA(c)));
        }
        catch (Exception exception) {
            return (APKB)((Object)cv.e(653004664));
        }
    }

    public static APKB EmKi(String string) {
        try {
            APKB.yA(string, KUXS$dwji.S("\u1aaa\u2336\u0f62\uef77\ufdb9\u445d\u3ec5\ueaee\ubd1a\ue44b\u28bb\ubf63\u39fd\ud806\ua62e\u8218\u61ec\ua7c9\u1594"));
            APKB.yA(APKB.yA(string) > 0, KUXS$dwji.S("\u1aaa\u2336\u0f62\uef77\ufdb9\u4453\u3ed1\ueaf3\ubd00\ue404\u28a7\ubf22\u39e9\ud806\ua62e\u8217\u61ed\ua785\u1594\u4e03\u0b90\u21be\udd9e\ub7ba\u73ac\u6848\u8fd4\u0ce7\ud546\ub765\udcef\u729d"));
            return (APKB)((Object)((Map)cv.e(-1143344073)).get(APKB.yA(APKB.yA(string, false))));
        }
        catch (Exception exception) {
            return (APKB)((Object)cv.e(653004664));
        }
    }

    public static String stripColor(String string) {
        if (string == null) {
            return null;
        }
        return APKB.yA(APKB.yA((Pattern)cv.e(-478350283), string), "");
    }

    public static APKB DYFV(DyeColor dyeColor) {
        if (((Map)cv.e(-1302924234)).containsKey((Object)dyeColor)) {
            return (APKB)((Object)((Map)cv.e(-1302924234)).get((Object)dyeColor));
        }
        return (APKB)((Object)cv.e(-1643842482));
    }

    public static DyeColor ssNb(org.bukkit.ChatColor chatColor) {
        for (DyeColor dyeColor : ((Map)cv.e(-1302924234)).keySet()) {
            if (APKB.yA(((APKB)((Object)((Map)cv.e(-1302924234)).get((Object)dyeColor))).toString(), APKB.yA(chatColor)) == false) continue;
            return dyeColor;
        }
        return (DyeColor)cv.e(40825907);
    }

    public static String DYFV(org.bukkit.ChatColor chatColor) {
        if (((Map)cv.e(-1894910927)).containsKey((Object)chatColor)) {
            return (String)((Map)cv.e(-1894910927)).get((Object)chatColor);
        }
        return YEBy$TyVf.W("\uc6c9\ucf7f\u3782\u1eeb");
    }

    public static String IWSm(DyeColor dyeColor) {
        if (((Map)cv.e(-1733495760)).containsKey((Object)dyeColor)) {
            return (String)((Map)cv.e(-1733495760)).get((Object)dyeColor);
        }
        return rgig$AWxc.r("\ua977\u7bb7\ua988\u4c20");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color ejGG(String object) {
        if (APKB.yA(object, KUXS$dwji.S("\u16e3")) != false) {
            object = APKB.yA(object, true);
        }
        if (APKB.yA(object, KUXS$dwji.S("\u16b8")) != -1) {
            object = APKB.yA(object, APKB.yA(object, KUXS$dwji.S("\u16b8")));
        }
        if (APKB.yA(object) != 6) {
            if (APKB.yA(object) != 3) {
                return null;
            }
        }
        reference var1_1 = APKB.yA(object) / 3;
        int n = 1 << (2 - var1_1 << 2);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < APKB.yA(object)) {
            n2 |= n * APKB.yA(APKB.yA(object, n4, n4 + var1_1), 16) << (n3 << 3);
            ++n3;
            n4 += var1_1;
        }
        return APKB.yA(n2 & 16777215);
    }

    public static Color TNcV(String string) {
        String[] arrstring = (String[])APKB.yA(string, KUXS$dwji.S("\u050b\u8097\u66c6\u2145\u6014\u03de\ua10f"));
        if (arrstring.length < 3) {
            return null;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < 3) {
            n |= APKB.yA(arrstring[n2]) << (n2 << 3);
            ++n2;
        }
        return APKB.yA(n & 16777215);
    }

    public static String qKWl() {
        StringBuilder stringBuilder = new StringBuilder();
        APKB.yA(stringBuilder, rgig$AWxc.r("\u064b\ud2d1\u9fec\udcd5\u2338\u323f\u27cb\u7b85\ucdb2\u3a81\u67e6\ue951\u10e8\uf93f\u4d50\u4d94\uc25e\uc193\u1e51\u8724\u4787\u78af\u02b0\uda3e\ub4a1\u726a\u39e9\ua96b\ubf83\u2459\u7308\uee73\uc969\u2a87\ub87f\u9684\u2852\ua6e3\u9060\ue66d\u212f\u9382\uabcc\u37e1\uce6b\uec98\uef86\ud130\ubc3c"));
        for (Map.Entry entry : ((Map)cv.e(-1894910927)).entrySet()) {
            APKB.yA(stringBuilder, APKB.yA(rgig$AWxc.r("\u064b\ud2d1\u9fff\udc89\u2368\u322e\u2791\u7b99\ucdb5\u3a87\u67a1\ue901\u10f9\uf966\u4d49\u4db4\uc259\uc19e\u1e4a\u8776\u47fe\u78e0\u02f9\uda63\ub4f7\u7225\u39fd\ua938\ubfd9\u2442\u7305\uee23\uc97e\u2a85\ub813\u969f\u285a\ua6b2\u902e\ue625\u2164\u93d6\uabdb\u37ab\uce2e\uecdb\uef97\ud17f\ubc25\ube61\u5637\u6437\ufe63\ufc4f\u1eaf\uff3f\u9d91\u6495\u7359\ue318\ubf86\uad01\u0d39\u95ec\u6778\uaaaf\u5950\u75de\u354b\u9bb9\u1900\u9eb2\u3982\uf210\ud4a4\u9297\u52d0\u885f\ud76d\u1c97\ub481\ua324\u4086\ucd81"), new Object[]{((APKB)((Object)entry.getKey())).name(), entry.getValue()}));
        }
        APKB.yA(stringBuilder, rgig$AWxc.r("\u064b\ud28a\u9ff9\udcd6\u2336\u3236\u2790\u7b87"));
        APKB.yA(stringBuilder, rgig$AWxc.r("\u064b\ud2d1\u9fec\udcd5\u2338\u323f\u27cb\u7b85\ucdb2\u3a81\u67e6\ue951\u10e8\uf93f\u4d50\u4d93\uc24f\uc197\u1e05\u8747\u47ab\u78ac\u02b3\uda23\ub4ef\u7279\u39b2\ua97b\ubfd9\u245b\u7340\uee63\uc933\u2afa\ub853\u9687\u2851\ua6fe\u902e\ue67e\u2174\u9392\uab96\u37e3\uce78\uecc3\uef80\ud17c"));
        for (Map.Entry entry : ((Map)cv.e(-1733495760)).entrySet()) {
            Object[] arrobject = new Object[2];
            arrobject[0] = APKB.yA((DyeColor)entry.getKey());
            arrobject[1] = entry.getValue();
            APKB.yA(stringBuilder, APKB.yA(rgig$AWxc.r("\u064b\ud2d1\u9fff\udc89\u2368\u322e\u2791\u7b99\ucdb5\u3a87\u67a1\ue901\u10f9\uf966\u4d49\u4db4\uc259\uc19e\u1e4a\u8776\u47fe\u78e0\u02f9\uda63\ub4f7\u7225\u39fd\ua938\ubfd9\u2442\u7305\uee23\uc97e\u2a85\ub813\u969f\u285a\ua6b2\u902e\ue625\u2164\u93d6\uabdb\u37ab\uce2e\uecdb\uef97\ud17f\ubc25\ube61\u5637\u6437\ufe63\ufc4f\u1eaf\uff3f\u9d91\u6495\u7359\ue318\ubf86\uad01\u0d39\u95ec\u6778\uaaaf\u5950\u75de\u354b\u9bb9\u1900\u9eb2\u3982\uf210\ud4a4\u9297\u52d0\u885f\ud76d\u1c97\ub481\ua324\u4086\ucd81"), arrobject));
        }
        APKB.yA(stringBuilder, rgig$AWxc.r("\u064b\ud28a\u9ff9\udcd6\u2336\u3236\u2790\u7b87"));
        return APKB.yA(stringBuilder);
    }

    public org.bukkit.ChatColor DajI() {
        return APKB.yA(((Character)cv.b((Object)this, -1649805850)).charValue());
    }

    public static String translateAlternateColorCodes(char c, String string) {
        char[] arrc = (char[])APKB.yA(string);
        int n = 0;
        while (n < arrc.length - 1) {
            if (arrc[n] == c) {
                if (APKB.yA(rgig$AWxc.r("\ue96d\u2ce4\uc7a5\ua0ef\u2e10\u2d1a\u736a\uc5b1\uf5ff\uf564\uec3d\u281a\ufd23\udaf9\u7919\ub6f9\u92cf\u0246\ue293\u8247\ub8e3\u6c41\u85a0\u0cf6\u81fb\ub4fd\u0d5f\uadab\ub4d2\ud32d\ub908\u1302\uec0e\u1a5a"), arrc[n + 1]) >= 0) {
                    arrc[n] = 167;
                    arrc[n + 1] = APKB.yA(arrc[n + 1]);
                }
            }
            ++n;
        }
        return new String(arrc);
    }

    public static APKB DYFV(byte by) {
        APKB[] arraPKB = APKB.values();
        int n = arraPKB.length;
        int n2 = 0;
        while (n2 < n) {
            APKB aPKB = arraPKB[n2];
            if (aPKB.ePfK() == by) {
                return aPKB;
            }
            ++n2;
        }
        return null;
    }

    public byte ePfK() {
        switch (APKB.OiyY()[this.ordinal()]) {
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
        Object object2 = APKB.yA(string);
        reference var3_3 = object2 - true;
        while (var3_3 >= 0) {
            Object object3 = APKB.yA(string, var3_3);
            if (object3 == 167 && var3_3 < object2 - true) {
                Object object4 = APKB.yA(string, var3_3 + true);
                APKB aPKB = APKB.lCdp((char)object4);
                if (aPKB != null) {
                    object = APKB.yA(APKB.yA(new StringBuilder((String)APKB.yA(aPKB.toString())), object));
                    if (aPKB.isColor() || aPKB.equals((Object)((APKB)((Object)cv.e(1712131958))))) break;
                }
            }
            --var3_3;
        }
        return object;
    }

    public static APKB[] values() {
        APKB[] arraPKB = (APKB[])cv.e(1628632139);
        int n = arraPKB.length;
        APKB[] arraPKB2 = new APKB[n];
        APKB.yA(arraPKB, false, arraPKB2, false, n);
        return arraPKB2;
    }

    public static APKB valueOf(String string) {
        return (APKB)((Object)APKB.yA(APKB.class, string));
    }

    /* synthetic */ APKB(String string, int n, char c, int n2, APKB aPKB) {
        this(string, n, c, n2);
    }

    /* synthetic */ APKB(String string, int n, char c, int n2, boolean bl, APKB aPKB) {
        this(string, n, c, n2, bl);
    }

    static /* synthetic */ int[] OiyY() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(992998866);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[APKB.values().length];
        try {
            arrn[((APKB)cv.e((int)1197215955)).ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)456069525)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)2048062540)).ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-1164766813)).ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-121302624)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)371979328)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)416543530)).ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-1099959229)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)362673229)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-281086910)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-1207700747)).ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-1071443542)).ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)1489703379)).ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-352841310)).ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)1129452014)).ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-1643842482)).ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-314502936)).ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)1712131958)).ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-1538722743)).ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)223736904)).ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)653004664)).ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((APKB)cv.e((int)-1154812849)).ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(992998866, arrn3);
        return arrn3;
    }

    private static Object yA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

