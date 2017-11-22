/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Sound
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerToggleSneakEvent
 *  org.bukkit.inventory.PlayerInventory
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.PlayerInventory;

@lDTo
public class GIDW
extends jqQR
implements XSJd {
    public static int mYEM;
    private BBAa IXMc = new BBAa();
    private ktOu<Player, Integer> fCNW = new ktOu();

    static {
        cv.V(-627838336, 4);
    }

    @Override
    public void start() {
        this.TOJM();
        GIDW.SD(this);
        GIDW.SD(this);
        Iterator iterator = GIDW.SD().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (!this.BkpW(player)) continue;
            GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player);
        }
    }

    public void jhSt(Player player) {
        if (!this.BkpW(player)) {
            return;
        }
        if (this.lCdp(player)) {
            this.vtFs(player);
            GIDW.SD(player, (String)cv.e(1209528962));
            return;
        }
        this.nJLQ(player);
        GIDW.SD(player, (String)cv.e(-2090667379));
    }

    @Override
    public void stop() {
        GIDW.SD(this);
        GIDW.SD(this);
    }

    public void TOJM() {
        gEXv gEXv2 = new gEXv((String)cv.e(327152271), (DXfX)GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(-310243155)))));
        GIDW.SD(gEXv2, GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(1212616879)))));
        GIDW.SD(gEXv2, GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(987041961)))));
        gEXv gEXv3 = new gEXv((String)cv.e(1739715209), (DXfX)GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(-1615195989)))));
        GIDW.SD(gEXv3, GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(1040388243)))));
        gEXv gEXv4 = new gEXv((String)cv.e(2095510152), (DXfX)GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(-893710179)))));
        GIDW.SD(gEXv4, GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(-405860193)))));
        gEXv gEXv5 = new gEXv((String)cv.e(-532483445), (DXfX)GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(-412938087)))));
        GIDW.SD(gEXv5, GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(1928990939)))));
        GIDW.SD(gEXv5, GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(-2043277115)))));
        GIDW.SD(gEXv5, GIDW.SD((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), GIDW.SD((pqxh)((Object)cv.e(-1238232889)))));
        GIDW.SD((BBAa)cv.b(this, 1347744394), gEXv2);
        GIDW.SD((BBAa)cv.b(this, 1347744394), gEXv3);
        GIDW.SD((BBAa)cv.b(this, 1347744394), gEXv4);
        GIDW.SD((BBAa)cv.b(this, 1347744394), gEXv5);
    }

    public float ssNb(bXOh bXOh2) {
        GIDW.SD(bXOh2, GIDW.SD(bXOh2) > 20 ? 20 : (Object)GIDW.SD(bXOh2));
        float f = 0.5f;
        Object object = GIDW.SD(GIDW.SD(bXOh2), 0.0, 20.0);
        f = 0.5f - (Object)object / 20.0f * 0.49f;
        return f;
    }

    public boolean BkpW(Player player) {
        block5 : {
            block4 : {
                if (GIDW.SD((tdpC)((Object)cv.e(242159151)), player) == false) break block4;
                if (GIDW.SD((tdpC)((Object)cv.e(1889406507)), player) != false) break block5;
            }
            if (!player.isOp()) {
                return false;
            }
        }
        return true;
    }

    public boolean lCdp(Player player) {
        if (this.BkpW(player)) {
            return (boolean)GIDW.SD(GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player));
        }
        return false;
    }

    public void nJLQ(Player player) {
        if (this.BkpW(player) && !this.lCdp(player)) {
            GIDW.SD(GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), true);
        }
    }

    public void vtFs(Player player) {
        if (this.BkpW(player) && this.lCdp(player)) {
            GIDW.SD(GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), false);
            GIDW.SD(player, YEBy$TyVf.W("\u2ad4\ubf39\u00db\ufa4f"));
        }
        if (GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player) != false && !this.BkpW(player)) {
            GIDW.SD(GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), false);
            GIDW.SD(player, YEBy$TyVf.W("\u2ad4\ubf39\u00db\ufa4f"));
        }
    }

    @Override
    public void tick() {
    }

    private void DYFV(bXOh bXOh2) {
        GIDW.SD(bXOh2, GIDW.SD(bXOh2) == false);
        GIDW.SD(new KMEw((Sound)GIDW.SD((gowu)((Object)cv.e(-2011958660))), (Float)GIDW.SD(this.ssNb(bXOh2)), (Float)GIDW.SD(1.9f)), GIDW.SD(bXOh2));
        GIDW.SD(bXOh2, GIDW.SD(bXOh2) + 3);
    }

    private void IWSm(bXOh bXOh2) {
        if (!this.lCdp((Player)GIDW.SD(bXOh2))) {
            return;
        }
        this.BkpW(bXOh2);
        this.jhSt(bXOh2);
        this.YoSa(bXOh2);
        this.OXeK(bXOh2);
    }

    private void OXeK(bXOh bXOh2) {
        if (GIDW.SD(bXOh2) != false) {
            BBAa bBAa = ((GIDW)cv.b((YoSa)cv.e(239341894), 272634100)).uOFv();
            Object object = GIDW.SD(bXOh2);
            if (GIDW.SD(bXOh2) == true) {
                object = GIDW.SD(bBAa, object);
            }
            if (GIDW.SD(bXOh2) == -1) {
                object = GIDW.SD(bBAa, object);
            }
            if (GIDW.SD(bXOh2) != object) {
                GIDW.SD(bXOh2, (Integer)cv.e(-627838336));
                GIDW.SD(new KMEw((Sound)GIDW.SD((gowu)((Object)cv.e(-1425476314))), (Float)GIDW.SD(this.ssNb(bXOh2)), (Float)GIDW.SD(1.9f)), GIDW.SD(bXOh2));
                GIDW.SD(bXOh2, GIDW.SD(bXOh2) + 3);
            }
            GIDW.SD(bXOh2, object);
        }
    }

    private void YoSa(bXOh bXOh2) {
        reference var5_5;
        Object object = GIDW.SD(bXOh2);
        int n = GIDW.SD(bXOh2).getInventory().getHeldItemSlot();
        int n2 = n - object;
        if (n2 != (var5_5 = object - n) && n2 != 0 && var5_5 != false) {
            if (n2 == -8) {
                GIDW.SD(bXOh2, true);
            } else if (var5_5 == -8) {
                GIDW.SD(bXOh2, -1);
            } else if (n2 == GIDW.SD(var5_5, n2)) {
                GIDW.SD(bXOh2, true);
            } else if (var5_5 == GIDW.SD(var5_5, n2)) {
                GIDW.SD(bXOh2, -1);
            } else {
                GIDW.SD(bXOh2, false);
            }
        } else {
            GIDW.SD(bXOh2, false);
        }
        GIDW.SD(bXOh2, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void jhSt(bXOh var1_1) {
        block5 : {
            var2_2 = GIDW.SD(GIDW.SD(var1_1).getLocation());
            var4_3 = GIDW.SD(var1_1);
            GIDW.SD(var1_1, GIDW.SD(var4_3 - var2_2) > 0.001);
            GIDW.SD(var1_1, var2_2);
            if (!GIDW.SD(var1_1).isSneaking()) break block5;
            if (GIDW.SD(var1_1) == false) ** GOTO lbl-1000
            if (!GIDW.SD(var1_1).isFlying()) ** GOTO lbl-1000
        }
        if (GIDW.SD(var1_1) == false) {
            v0 = false;
        } else lbl-1000: // 3 sources:
        {
            v0 = true;
        }
        var6_4 = v0;
        var7_5 = GIDW.SD(var1_1);
        if (var6_4 != var7_5) {
            if (var6_4) {
                GIDW.SD(var1_1, GIDW.SD(var1_1));
                GIDW.SD(var1_1, (Integer)cv.e(-627838336));
                GIDW.SD(new KMEw((Sound)GIDW.SD((gowu)cv.e(-1567951574)), (Float)GIDW.SD(this.ssNb(var1_1)), (Float)GIDW.SD(1.9f)), GIDW.SD(var1_1));
                GIDW.SD(var1_1, GIDW.SD(var1_1) + 3);
            } else {
                GIDW.SD(var1_1, GIDW.SD(var1_1));
                GIDW.SD(var1_1, -1);
                GIDW.SD(new KMEw((Sound)GIDW.SD((gowu)cv.e(1997337876)), (Float)GIDW.SD(this.ssNb(var1_1)), (Float)GIDW.SD(1.5f)), GIDW.SD(var1_1));
                GIDW.SD(var1_1, GIDW.SD(var1_1) + 3);
            }
        }
        GIDW.SD(var1_1, GIDW.SD(var1_1) > 0 ? (Object)(GIDW.SD(var1_1) - true) : 0);
        GIDW.SD(var1_1, var6_4);
    }

    private void BkpW(bXOh bXOh2) {
        if (GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(bXOh2)) == false) {
            return;
        }
        if (!this.lCdp((Player)GIDW.SD(bXOh2))) {
            return;
        }
        GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(bXOh2), GIDW.SD(GIDW.SD((Integer)GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(bXOh2))) - true));
        if (GIDW.SD((Integer)GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(bXOh2))) >= 11) {
            GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(bXOh2));
            this.DYFV(bXOh2);
            return;
        }
        if (GIDW.SD((Integer)GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(bXOh2))) < 0) {
            GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(bXOh2));
        }
    }

    public String ssNb(bXOh bXOh2, int n, int n2) {
        if (n == -1) {
            return "";
        }
        double d = (double)n2 / (double)((Integer)cv.e(-627838336)).intValue();
        Object object = GIDW.SD(GIDW.SD(new StringBuilder(), GIDW.SD(GIDW.SD((BBAa)cv.b(this, 1347744394), n)).KwOT()));
        if (d > 0.6) {
            return GIDW.SD(GIDW.SD(new StringBuilder((String)GIDW.SD(object)), (APKB)((Object)cv.e(-1164766813))));
        }
        if (d > 0.3) {
            return object;
        }
        return GIDW.SD(GIDW.SD(new StringBuilder(), (APKB)((Object)cv.e(416543530))));
    }

    public String ssNb(bXOh bXOh2, APKB aPKB, int n) {
        double d = (double)n / (double)((Integer)cv.e(-627838336)).intValue();
        d = 1.0 - d;
        Object object = GIDW.SD(aPKB);
        if (d > 0.6) {
            return object;
        }
        if (d > 0.3) {
            return GIDW.SD(GIDW.SD(new StringBuilder((String)GIDW.SD(object)), (APKB)((Object)cv.e(-1164766813))));
        }
        return GIDW.SD(GIDW.SD(GIDW.SD(new StringBuilder(), (APKB)((Object)cv.e(416543530))), (APKB)((Object)cv.e(-1164766813))));
    }

    public void lCdp(bXOh bXOh2) {
        Object object = GIDW.SD(bXOh2);
        Object object2 = GIDW.SD(bXOh2);
        GIDW.SD(object, GIDW.SD((BBAa)cv.b(this, 1347744394), object2, GIDW.SD(bXOh2)));
        Object object3 = GIDW.SD((BBAa)cv.b(this, 1347744394), object2, GIDW.SD(bXOh2), this, bXOh2, GIDW.SD(bXOh2));
        String string = this.ssNb(bXOh2, (int)object2, (int)GIDW.SD(bXOh2));
        String string2 = object2 != -1 ? (GIDW.SD(bXOh2) > 0 ? GIDW.SD(GIDW.SD(new StringBuilder((String)GIDW.SD(string)), GIDW.SD(GIDW.SD((BBAa)cv.b(this, 1347744394), object2)))) : KUXS$dwji.S("\u182e\u8fc7")) : KUXS$dwji.S("\u182e\u8fc7");
        GIDW.SD(object, GIDW.SD(false), GIDW.SD(5), GIDW.SD(false), string2, object3);
    }

    public BBAa uOFv() {
        return (BBAa)cv.b(this, 1347744394);
    }

    @EventHandler
    public void ssNb(PlayerJoinEvent playerJoinEvent) {
        if (this.BkpW((Player)GIDW.SD(playerJoinEvent))) {
            GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943), GIDW.SD(playerJoinEvent));
        }
    }

    @EventHandler
    public void ssNb(PlayerToggleSneakEvent playerToggleSneakEvent) {
        if (this.BkpW((Player)GIDW.SD(playerToggleSneakEvent))) {
            if (this.lCdp((Player)GIDW.SD(playerToggleSneakEvent))) {
                if (GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(playerToggleSneakEvent)) == false) {
                    GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(playerToggleSneakEvent), GIDW.SD(false));
                }
                GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(playerToggleSneakEvent), GIDW.SD(GIDW.SD((Integer)GIDW.SD((ktOu)cv.b(this, 1385624849), GIDW.SD(playerToggleSneakEvent))) + 5));
            }
        }
    }

    @Override
    public void FFBA() {
        Object object = GIDW.SD(GIDW.SD((YDey)cv.b((YoSa)cv.e(239341894), 240906943)));
        while (object.hasNext()) {
            bXOh bXOh2 = (bXOh)object.next();
            this.IWSm(bXOh2);
            if (GIDW.SD(bXOh2) != false) {
                this.lCdp(bXOh2);
            }
            GIDW.SD(bXOh2, GIDW.SD(bXOh2) > 0 ? (Object)(GIDW.SD(bXOh2) - true) : 0);
        }
    }

    @Override
    public String BuHU() {
        return KUXS$dwji.S("\ue8fe\u883c\ub4f1\u6820\u31e4\ub935\u29b1");
    }

    private static Object SD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

