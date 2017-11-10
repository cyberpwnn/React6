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

public class ydHl
extends Enum<ydHl> {
    public static final /* enum */ ydHl hIca;
    public static final /* enum */ ydHl YhLW;
    public static final /* enum */ ydHl lDmW;
    public static final /* enum */ ydHl EKnx;
    public static final /* enum */ ydHl rprX;
    public static final /* enum */ ydHl GAUK;
    public static final /* enum */ ydHl CFIO;
    public static final /* enum */ ydHl RtYG;
    public static final /* enum */ ydHl mXrL;
    public static final /* enum */ ydHl AHRk;
    public static final /* enum */ ydHl DING;
    public static final /* enum */ ydHl apCB;
    public static final /* enum */ ydHl KDmy;
    public static final /* enum */ ydHl KUoo;
    public static final /* enum */ ydHl doxs;
    public static final /* enum */ ydHl XJsf;
    public static final /* enum */ ydHl uOgg;
    public static final /* enum */ ydHl UtoU;
    public static final /* enum */ ydHl XKUH;
    public static final /* enum */ ydHl OYku;
    public static final /* enum */ ydHl HMHU;
    public static final /* enum */ ydHl fnPR;
    public static final char COLOR_CHAR = '\u00a7';
    private static final Pattern STRIP_COLOR_PATTERN;
    private final int FFdD;
    private final char Xdif;
    private final boolean ceJS;
    private final String APfN;
    private static final Map<Integer, ydHl> hsyH;
    private static final Map<Character, ydHl> etAU;
    private static final Map<DyeColor, ydHl> GIgU;
    private static final Map<ydHl, String> RRXL;
    private static final Map<DyeColor, String> Nxnu;
    private static /* synthetic */ int[] fmqq;
    private static final /* synthetic */ ydHl[] YhMn;

    static {
        yy.K(-1233190183, (Object)new ydHl$1(NVIs$JbpD.H("\ucde5\udbe7\u4aab\ua581\u4ec7"), 0, '0', 0));
        yy.K(-1141112158, (Object)new ydHl$12(NVIs$JbpD.H("\ucde3\udbea\u4ab8\ua589\u4ed3\u2e8c\u759e\u2620\ua361"), 1, '1', 1));
        yy.K(1508639447, (Object)new ydHl$16(NVIs$JbpD.H("\ucde3\udbea\u4ab8\ua589\u4ed3\u2e89\u7580\u2630\ua361\uf165"), 2, '2', 2));
        yy.K(-935197992, (Object)new ydHl$17(NVIs$JbpD.H("\ucde3\udbea\u4ab8\ua589\u4ed3\u2e8f\u7583\u2620\ua365"), 3, '3', 3));
        yy.K(1063912109, (Object)new ydHl$18(NVIs$JbpD.H("\ucde3\udbea\u4ab8\ua589\u4ed3\u2e9c\u7597\u2631"), 4, '4', 4));
        yy.K(1507721894, (Object)new ydHl$19(NVIs$JbpD.H("\ucde3\udbea\u4ab8\ua589\u4ed3\u2e9e\u7587\u2627\ua374\uf167\u4b85"), 5, '5', 5));
        yy.K(-278730615, (Object)new ydHl$20(NVIs$JbpD.H("\ucde0\udbe4\u4aa6\ua586"), 6, '6', 6));
        yy.K(-1912346475, (Object)new ydHl$21(NVIs$JbpD.H("\ucde0\udbf9\u4aab\ua59b"), 7, '7', 7));
        yy.K(-20248912, (Object)new ydHl$22(NVIs$JbpD.H("\ucde3\udbea\u4ab8\ua589\u4ed3\u2e89\u7580\u2634\ua37d"), 8, '8', 8));
        yy.K(1000669867, (Object)new ydHl$2(NVIs$JbpD.H("\ucde5\udbe7\u4abf\ua587"), 9, '9', 9));
        yy.K(1274341524, (Object)new ydHl$3(NVIs$JbpD.H("\ucde0\udbf9\u4aaf\ua587\u4ec2"), 10, 'a', 10));
        yy.K(-1388378419, (Object)new ydHl$4(NVIs$JbpD.H("\ucde6\udbfa\u4abf\ua583"), 11, 'b', 11));
        yy.K(-329382161, (Object)new ydHl$5(NVIs$JbpD.H("\ucdf5\udbee\u4aae"), 12, 'c', 12));
        yy.K(2001267044, (Object)new ydHl$6(NVIs$JbpD.H("\ucdeb\udbe2\u4aad\ua58a\u4ed8\u2e91\u7582\u2620\ua376\uf17b\u4b8c\ub2e2"), 13, 'd', 13));
        yy.K(1030554284, (Object)new ydHl$7(NVIs$JbpD.H("\ucdfe\udbee\u4aa6\ua58e\u4ec3\u2e99"), 14, 'e', 14));
        yy.K(390916569, (Object)new ydHl$8(NVIs$JbpD.H("\ucdf0\udbe3\u4aa3\ua596\u4ec9"), 15, 'f', 15));
        yy.K(-1340865887, (Object)new ydHl$9(NVIs$JbpD.H("\ucdea\udbea\u4aad\ua58b\u4ecf"), 16, 'k', 16, true));
        yy.K(1358555477, (Object)new ydHl$10(NVIs$JbpD.H("\ucde5\udbe4\u4aa6\ua586"), 17, 'l', 17, true));
        yy.K(-510852438, (Object)new ydHl$11(NVIs$JbpD.H("\ucdf4\udbff\u4ab8\ua58b\u4ec7\u2e8b\u7586\u263d\ua376\uf164\u4b95\ub2e0\ub8e6"), 18, 'm', 18, true));
        yy.K(2047279775, (Object)new ydHl$13(NVIs$JbpD.H("\ucdf2\udbe5\u4aae\ua587\u4ede\u2e82\u759b\u263b\ua361"), 19, 'n', 19, true));
        yy.K(46400160, (Object)new ydHl$14(NVIs$JbpD.H("\ucdee\udbff\u4aab\ua58e\u4ec5\u2e8d"), 20, 'o', 20, true));
        yy.K(-1628960997, (Object)new ydHl$15(NVIs$JbpD.H("\ucdf5\udbee\u4ab9\ua587\u4ed8"), 21, 'r', 21));
        yy.K(1150026485, new ydHl[]{(ydHl)((Object)yy.p(-1233190183)), (ydHl)((Object)yy.p(-1141112158)), (ydHl)((Object)yy.p(1508639447)), (ydHl)((Object)yy.p(-935197992)), (ydHl)((Object)yy.p(1063912109)), (ydHl)((Object)yy.p(1507721894)), (ydHl)((Object)yy.p(-278730615)), (ydHl)((Object)yy.p(-1912346475)), (ydHl)((Object)yy.p(-20248912)), (ydHl)((Object)yy.p(1000669867)), (ydHl)((Object)yy.p(1274341524)), (ydHl)((Object)yy.p(-1388378419)), (ydHl)((Object)yy.p(-329382161)), (ydHl)((Object)yy.p(2001267044)), (ydHl)((Object)yy.p(1030554284)), (ydHl)((Object)yy.p(390916569)), (ydHl)((Object)yy.p(-1340865887)), (ydHl)((Object)yy.p(1358555477)), (ydHl)((Object)yy.p(-510852438)), (ydHl)((Object)yy.p(2047279775)), (ydHl)((Object)yy.p(46400160)), (ydHl)((Object)yy.p(-1628960997))});
        yy.K(205062899, ydHl.OY(ydHl.OY(ydHl.OY(ydHl.OY(new StringBuilder(NVIs$JbpD.H("\ucd8f\udb94\u4a83\ua5eb")), NVIs$JbpD.H("\ucd00")), NVIs$JbpD.H("\ucdfc\udb9b\u4ac7\ua5fb\u4ecd\u2ee3\u7594\u263e\ua309\uf164\u4b92\ub2fa")))));
        yy.K(406455028, new HashMap());
        yy.K(1811088105, new HashMap());
        yy.K(1453327090, new HashMap());
        yy.K(-1705311513, new HashMap());
        yy.K(-213843224, new HashMap());
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-1233190183)), NVIs$JbpD.H("\ucd84\udb9b\u4ada\ua5f2"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-1141112158)), NVIs$JbpD.H("\ucd84\udb9b\u4ada\ua5a3"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(1508639447)), NVIs$JbpD.H("\ucd84\udb9b\u4a8b\ua5f2"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-935197992)), NVIs$JbpD.H("\ucd84\udb9b\u4a8b\ua5a3"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(1063912109)), NVIs$JbpD.H("\ucd84\udbca\u4ada\ua5f2"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(1507721894)), NVIs$JbpD.H("\ucd84\udbca\u4ada\ua5a3"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-278730615)), NVIs$JbpD.H("\ucd84\udbcd\u4a8b\ua5f2"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-1912346475)), NVIs$JbpD.H("\ucd84\udb92\u4ad3\ua5fb"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-20248912)), NVIs$JbpD.H("\ucd84\udb9e\u4adf\ua5f7"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(1000669867)), NVIs$JbpD.H("\ucd84\udb9e\u4adf\ua5a4"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(1274341524)), NVIs$JbpD.H("\ucd84\udb9e\u4a89\ua5f7"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-1388378419)), NVIs$JbpD.H("\ucd84\udb9e\u4a89\ua5a1"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(-329382161)), NVIs$JbpD.H("\ucd84\udbcd\u4adf\ua5f7"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(2001267044)), NVIs$JbpD.H("\ucd84\udbcd\u4adf\ua5a4"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(1030554284)), NVIs$JbpD.H("\ucd84\udbc8\u4a89\ua5f7"));
        ((Map)yy.p(-1705311513)).put((ydHl)((Object)yy.p(390916569)), NVIs$JbpD.H("\ucd84\udbca\u4a8b\ua5a3"));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(141361917), (ydHl)((Object)yy.p(-20248912)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-484965642), (ydHl)((Object)yy.p(-1141112158)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(1773994747), (ydHl)((Object)yy.p(-278730615)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-2047022954), (ydHl)((Object)yy.p(-1388378419)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-170786052), (ydHl)((Object)yy.p(-1912346475)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-300816239), (ydHl)((Object)yy.p(1508639447)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-2137128207), (ydHl)((Object)yy.p(1000669867)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-1658060038), (ydHl)((Object)yy.p(1274341524)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(548209391), (ydHl)((Object)yy.p(2001267044)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-1678507280), (ydHl)((Object)yy.p(-278730615)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-671219003), (ydHl)((Object)yy.p(2001267044)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(442886298), (ydHl)((Object)yy.p(1507721894)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(600631452), (ydHl)((Object)yy.p(-329382161)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(187892414), (ydHl)((Object)yy.p(-1912346475)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-1487535421), (ydHl)((Object)yy.p(390916569)));
        ((Map)yy.p(1453327090)).put((DyeColor)yy.p(-442432828), (ydHl)((Object)yy.p(1030554284)));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(141361917), NVIs$JbpD.H("\ucd84\udb9a\u4ad2\ua5f3\u4eb8\u2eff\u75e6"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-484965642), NVIs$JbpD.H("\ucd84\udb99\u4adf\ua5f1\u4ebd\u2ef7\u75e1"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(1773994747), NVIs$JbpD.H("\ucd84\udb9e\u4adc\ua5f1\u4ebf\u2eff\u75b1"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-2047022954), NVIs$JbpD.H("\ucd84\udb99\u4adc\ua5f5\u4ebd\u2ef7\u75e3"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-170786052), NVIs$JbpD.H("\ucd84\udb9f\u4adb\ua5f6\u4ebd\u2efa\u75e3"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-300816239), NVIs$JbpD.H("\ucd84\udb98\u4adc\ua5f6\u4eee\u2eff\u75ea"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-2137128207), NVIs$JbpD.H("\ucd84\udb9d\u4ad9\ua5fa\u4ebb\u2eaa\u75e0"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-1658060038), NVIs$JbpD.H("\ucd84\udb98\u4ad3\ua5a0\u4eed\u2efc\u75b7"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(548209391), NVIs$JbpD.H("\ucd84\udbc9\u4a8f\ua5f6\u4eb5\u2ead\u75eb"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-1678507280), NVIs$JbpD.H("\ucd84\udbce\u4a8b\ua5f5\u4ee9\u2efd\u75e7"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-671219003), NVIs$JbpD.H("\ucd84\udbcf\u4ad3\ua5fa\u4ebd\u2ef7\u75eb"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(442886298), NVIs$JbpD.H("\ucd84\udb9c\u4a8f\ua5f1\u4eb8\u2eac\u75b4"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(600631452), NVIs$JbpD.H("\ucd84\udb92\u4a8f\ua5f0\u4eee\u2efc\u75e5"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(187892414), NVIs$JbpD.H("\ucd84\udbca\u4ada\ua5a3\u4ebb\u2eaf\u75e5"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-1487535421), NVIs$JbpD.H("\ucd84\udbca\u4ade\ua5a3\u4eb8\u2eaf\u75e6"));
        ((Map)yy.p(-213843224)).put((DyeColor)yy.p(-442432828), NVIs$JbpD.H("\ucd84\udbc8\u4ad8\ua5a0\u4eb9\u2eff\u75b1"));
        ydHl[] arrydHl = ydHl.values();
        int n = arrydHl.length;
        int n2 = 0;
        while (n2 < n) {
            ydHl ydHl2 = arrydHl[n2];
            ((Map)yy.p(406455028)).put(ydHl.OY((Integer)yy.h((Object)ydHl2, -2007956743)), ydHl2);
            ((Map)yy.p(1811088105)).put(ydHl.OY(((Character)yy.h((Object)ydHl2, -2121006398)).charValue()), ydHl2);
            ++n2;
        }
    }

    private ydHl(String string2, int n2, char c, int n3) {
        this(string, n, (char)string2, n2, false);
    }

    private ydHl(String string2, int n2, char c, int n3, boolean bl) {
        this.Xdif = string2;
        this.FFdD = n2;
        this.ceJS = c;
        this.APfN = new String(new char[]{'\u00a7', string2});
    }

    public ChatColor asBungee() {
        return (ChatColor)yy.p(-1905261871);
    }

    public char getChar() {
        return ((Character)yy.h((Object)this, -2121006398)).charValue();
    }

    public String toString() {
        return (String)yy.h((Object)this, 187826936);
    }

    public DyeColor xrLK() {
        return ydHl.mXJp(this.OsFn());
    }

    public String xWxN() {
        return ydHl.ksfs(this.OsFn());
    }

    public boolean isFormat() {
        return (Boolean)yy.h((Object)this, 1602618061);
    }

    public boolean isColor() {
        if (!((Boolean)yy.h((Object)this, 1602618061)).booleanValue() && this != (ydHl)((Object)yy.p(-1628960997))) {
            return true;
        }
        return false;
    }

    public static ydHl ssMm(char c) {
        try {
            return (ydHl)((Object)((Map)yy.p(1811088105)).get(ydHl.OY(c)));
        }
        catch (Exception exception) {
            return (ydHl)((Object)yy.p(390916569));
        }
    }

    public static ydHl WXMo(String string) {
        try {
            ydHl.OY(string, BkvY$LhxG.I("\u433f\u930f\u377e\ube68\u14e3\ue9b5\u941b\u32cd\uc1d3\u3503\u5b56\u239f\u122f\u2488\ubd86\u43d3\u0dc7\ucfbb\u7554"));
            ydHl.OY(ydHl.OY(string) > 0, BkvY$LhxG.I("\u433f\u930f\u377e\ube68\u14e3\ue9bb\u940f\u32d0\uc1c9\u354c\u5b4a\u23de\u123b\u2488\ubd86\u43dc\u0dc6\ucff7\u7554\u3bd5\u412e\u6547\u8ca5\uaf1b\ufd16\uacc8\uad67\u5d29\uce84\u8a37\u8aca\u90ff"));
            return (ydHl)((Object)((Map)yy.p(1811088105)).get(ydHl.OY(ydHl.OY(string, false))));
        }
        catch (Exception exception) {
            return (ydHl)((Object)yy.p(390916569));
        }
    }

    public static String stripColor(String string) {
        if (string == null) {
            return null;
        }
        return ydHl.OY(ydHl.OY((Pattern)yy.p(205062899), string), "");
    }

    public static ydHl ksfs(DyeColor dyeColor) {
        if (((Map)yy.p(1453327090)).containsKey((Object)dyeColor)) {
            return (ydHl)((Object)((Map)yy.p(1453327090)).get((Object)dyeColor));
        }
        return (ydHl)((Object)yy.p(-1340865887));
    }

    public static DyeColor mXJp(org.bukkit.ChatColor chatColor) {
        for (DyeColor dyeColor : ((Map)yy.p(1453327090)).keySet()) {
            if (ydHl.OY(((ydHl)((Object)((Map)yy.p(1453327090)).get((Object)dyeColor))).toString(), ydHl.OY(chatColor)) == false) continue;
            return dyeColor;
        }
        return (DyeColor)yy.p(141361917);
    }

    public static String ksfs(org.bukkit.ChatColor chatColor) {
        if (((Map)yy.p(-1705311513)).containsKey((Object)chatColor)) {
            return (String)((Map)yy.p(-1705311513)).get((Object)chatColor);
        }
        return KDGY$JAHk.Y("\uf2da\uf59b\u1188\u707f");
    }

    public static String yJLL(DyeColor dyeColor) {
        if (((Map)yy.p(-213843224)).containsKey((Object)dyeColor)) {
            return (String)((Map)yy.p(-213843224)).get((Object)dyeColor);
        }
        return KDGY$JAHk.Y("\u9624\u61a1\uc3fc\u540e");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color NLsD(String object) {
        if (ydHl.OY(object, NVIs$JbpD.H("\uff5b")) != false) {
            object = ydHl.OY(object, true);
        }
        if (ydHl.OY(object, NVIs$JbpD.H("\uff00")) != -1) {
            object = ydHl.OY(object, ydHl.OY(object, NVIs$JbpD.H("\uff00")));
        }
        if (ydHl.OY(object) != 6) {
            if (ydHl.OY(object) != 3) {
                return null;
            }
        }
        reference var1_1 = ydHl.OY(object) / 3;
        int n = 1 << (2 - var1_1 << 2);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < ydHl.OY(object)) {
            n2 |= n * ydHl.OY(ydHl.OY(object, n4, n4 + var1_1), 16) << (n3 << 3);
            ++n3;
            n4 += var1_1;
        }
        return ydHl.OY(n2 & 16777215);
    }

    public static Color CLqw(String string) {
        String[] arrstring = (String[])ydHl.OY(string, KDGY$JAHk.Y("\u4500\ufdb7\u470e\u3a21\u0a0d\u7312\u27a0"));
        if (arrstring.length < 3) {
            return null;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < 3) {
            n |= ydHl.OY(arrstring[n2]) << (n2 << 3);
            ++n2;
        }
        return ydHl.OY(n & 16777215);
    }

    public static String pacH() {
        StringBuilder stringBuilder = new StringBuilder();
        ydHl.OY(stringBuilder, KDGY$JAHk.Y("\ua9ef\u064a\ucd15\uc3c2\u7766\u74e8\u9359\u3c61\u769c\u1814\u80f6\ua6cd\ucdb8\u2e86\u8253\u50ee\u069f\u250f\u082f\u99c5\uf389\u4280\u2631\u42c3\u950e\ud0f6\u9889\u2561\ud93c\u021c\ucfa5\u113e\ua8a3\u011d\u8c8b\u9f86\uf044\uccd4\u8d5a\udfe0\u9231\u88f1\u50ca\u8467\ud0f1\u380b\ua7e6\u83bf\u0d91"));
        for (Map.Entry entry : ((Map)yy.p(-1705311513)).entrySet()) {
            ydHl.OY(stringBuilder, ydHl.OY(KDGY$JAHk.Y("\ua9ef\u064a\ucd06\uc39e\u7736\u74f9\u9303\u3c7d\u769b\u1812\u80b1\ua69d\ucda9\u2edf\u824a\u50ce\u0698\u2502\u0834\u9997\uf3f0\u42cf\u2678\u429e\u9558\ud0b9\u989d\u2532\ud966\u0207\ucfa8\u116e\ua8b4\u011f\u8ce7\u9f9d\uf04c\ucc85\u8d14\udfa8\u927a\u88a5\u50dd\u842d\ud0b4\u3848\ua7f7\u83f0\u0d88\u11bb\u4309\ufa0c\u6b54\ud713\udfbd\uc801\u8aaf\u2977\uacec\u4bef\u29de\ubb81\u1e40\u3de5\u37fd\u4de2\u8ccd\ud042\ubacd\ue69c\u40d7\ub15b\uab3e\u0614\u8474\ua74a\u4c77\u00c1\u9d9b\u4cba\ue9d1\ud5a6\u778f\u64c7"), new Object[]{((ydHl)((Object)entry.getKey())).name(), entry.getValue()}));
        }
        ydHl.OY(stringBuilder, KDGY$JAHk.Y("\ua9ef\u0611\ucd00\uc3c1\u7768\u74e1\u9302\u3c63"));
        ydHl.OY(stringBuilder, KDGY$JAHk.Y("\ua9ef\u064a\ucd15\uc3c2\u7766\u74e8\u9359\u3c61\u769c\u1814\u80f6\ua6cd\ucdb8\u2e86\u8253\u50e9\u068e\u250b\u087b\u99a6\uf3a5\u4283\u2632\u42de\u9540\ud0e5\u98d2\u2571\ud966\u021e\ucfed\u112e\ua8f9\u0160\u8ca7\u9f85\uf047\uccc9\u8d14\udff3\u926a\u88e1\u5090\u8465\ud0e2\u3850\ua7e0\u83f3"));
        for (Map.Entry entry : ((Map)yy.p(-213843224)).entrySet()) {
            Object[] arrobject = new Object[2];
            arrobject[0] = ydHl.OY((DyeColor)entry.getKey());
            arrobject[1] = entry.getValue();
            ydHl.OY(stringBuilder, ydHl.OY(KDGY$JAHk.Y("\ua9ef\u064a\ucd06\uc39e\u7736\u74f9\u9303\u3c7d\u769b\u1812\u80b1\ua69d\ucda9\u2edf\u824a\u50ce\u0698\u2502\u0834\u9997\uf3f0\u42cf\u2678\u429e\u9558\ud0b9\u989d\u2532\ud966\u0207\ucfa8\u116e\ua8b4\u011f\u8ce7\u9f9d\uf04c\ucc85\u8d14\udfa8\u927a\u88a5\u50dd\u842d\ud0b4\u3848\ua7f7\u83f0\u0d88\u11bb\u4309\ufa0c\u6b54\ud713\udfbd\uc801\u8aaf\u2977\uacec\u4bef\u29de\ubb81\u1e40\u3de5\u37fd\u4de2\u8ccd\ud042\ubacd\ue69c\u40d7\ub15b\uab3e\u0614\u8474\ua74a\u4c77\u00c1\u9d9b\u4cba\ue9d1\ud5a6\u778f\u64c7"), arrobject));
        }
        ydHl.OY(stringBuilder, KDGY$JAHk.Y("\ua9ef\u0611\ucd00\uc3c1\u7768\u74e1\u9302\u3c63"));
        return ydHl.OY(stringBuilder);
    }

    public org.bukkit.ChatColor OsFn() {
        return ydHl.OY(((Character)yy.h((Object)this, -2121006398)).charValue());
    }

    public static String translateAlternateColorCodes(char c, String string) {
        char[] arrc = (char[])ydHl.OY(string);
        int n = 0;
        while (n < arrc.length - 1) {
            if (arrc[n] == c) {
                if (ydHl.OY(NVIs$JbpD.H("\uc7d8\uae66\u2c84\u165b\u6b8f\ufdbe\uaf67\ued02\u6af6\u9eb9\u75b5\u00d3\u6064\ud793\u524f\u7af4\uc11e\ud31c\uc329\u5d8f\u4717\u54bd\u4020\u55c6\u3357\u592c\u2bfe\ud2ad\u6f30\u8703\ua064\ua8a4\uf9c9\uafdb"), arrc[n + 1]) >= 0) {
                    arrc[n] = 167;
                    arrc[n + 1] = ydHl.OY(arrc[n + 1]);
                }
            }
            ++n;
        }
        return new String(arrc);
    }

    public static ydHl mXJp(byte by) {
        ydHl[] arrydHl = ydHl.values();
        int n = arrydHl.length;
        int n2 = 0;
        while (n2 < n) {
            ydHl ydHl2 = arrydHl[n2];
            if (ydHl2.rNVu() == by) {
                return ydHl2;
            }
            ++n2;
        }
        return null;
    }

    public byte rNVu() {
        switch (ydHl.LPKY()[this.ordinal()]) {
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
        Object object2 = ydHl.OY(string);
        reference var3_3 = object2 - true;
        while (var3_3 >= 0) {
            Object object3 = ydHl.OY(string, var3_3);
            if (object3 == 167 && var3_3 < object2 - true) {
                Object object4 = ydHl.OY(string, var3_3 + true);
                ydHl ydHl2 = ydHl.ssMm((char)object4);
                if (ydHl2 != null) {
                    object = ydHl.OY(ydHl.OY(new StringBuilder((String)ydHl.OY(ydHl2.toString())), object));
                    if (ydHl2.isColor() || ydHl2.equals((Object)((ydHl)((Object)yy.p(-1628960997))))) break;
                }
            }
            --var3_3;
        }
        return object;
    }

    public static ydHl[] values() {
        ydHl[] arrydHl = (ydHl[])yy.p(1150026485);
        int n = arrydHl.length;
        ydHl[] arrydHl2 = new ydHl[n];
        ydHl.OY(arrydHl, false, arrydHl2, false, n);
        return arrydHl2;
    }

    public static ydHl valueOf(String string) {
        return (ydHl)((Object)ydHl.OY(ydHl.class, string));
    }

    /* synthetic */ ydHl(String string, int n, char c, int n2, ydHl ydHl2) {
        this(string, n, c, n2);
    }

    /* synthetic */ ydHl(String string, int n, char c, int n2, boolean bl, ydHl ydHl2) {
        this(string, n, c, n2, bl);
    }

    static /* synthetic */ int[] LPKY() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(-707983338);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[ydHl.values().length];
        try {
            arrn[((ydHl)yy.p((int)-1388378419)).ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-1233190183)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)1000669867)).ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)1358555477)).ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-935197992)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-1141112158)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-20248912)).ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)1508639447)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)1507721894)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)1063912109)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-278730615)).ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-1912346475)).ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)1274341524)).ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)46400160)).ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)2001267044)).ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-1340865887)).ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-329382161)).ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-1628960997)).ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)-510852438)).ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)2047279775)).ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)390916569)).ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((ydHl)yy.p((int)1030554284)).ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(-707983338, arrn3);
        return arrn3;
    }

    private static Object OY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

