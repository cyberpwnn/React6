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

@bqhA
public class avqL
extends qloI
implements wncc {
    public static int AGaX;
    private pOsy tnTk = new pOsy();
    private aKuV<Player, Integer> Orji = new aKuV();

    @Override
    public void start() {
        this.rorh();
        avqL.QH(this);
        avqL.QH(this);
        Iterator iterator = avqL.QH().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (!this.JRFt(player)) continue;
            avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player);
        }
    }

    public void qdWJ(Player player) {
        if (!this.JRFt(player)) {
            return;
        }
        if (this.halY(player)) {
            this.yIkI(player);
            avqL.QH(player, (String)yy.p(1411442959));
            return;
        }
        this.ssMm(player);
        avqL.QH(player, (String)yy.p(983361808));
    }

    @Override
    public void stop() {
        avqL.QH(this);
        avqL.QH(this);
    }

    public void rorh() {
        DGgy dGgy = new DGgy((String)yy.p(32762334), (FpQi)avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(1606551326)))));
        avqL.QH(dGgy, avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(155911972)))));
        avqL.QH(dGgy, avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-1720121566)))));
        DGgy dGgy2 = new DGgy((String)yy.p(1426581986), (FpQi)avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-1501100200)))));
        avqL.QH(dGgy2, avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-1485961440)))));
        DGgy dGgy3 = new DGgy((String)yy.p(-1242240745), (FpQi)avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-1433401490)))));
        avqL.QH(dGgy3, avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-1588983948)))));
        DGgy dGgy4 = new DGgy((String)yy.p(285534488), (FpQi)avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-1372846222)))));
        avqL.QH(dGgy4, avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-1890449560)))));
        avqL.QH(dGgy4, avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(1479542646)))));
        avqL.QH(dGgy4, avqL.QH((HKdb)yy.h((CLqw)yy.p(1998252577), -873920753), avqL.QH((qSYN)((Object)yy.p(-595392644)))));
        avqL.QH((pOsy)yy.h(this, -23795219), dGgy);
        avqL.QH((pOsy)yy.h(this, -23795219), dGgy2);
        avqL.QH((pOsy)yy.h(this, -23795219), dGgy3);
        avqL.QH((pOsy)yy.h(this, -23795219), dGgy4);
    }

    public float mXJp(Cnvn cnvn) {
        avqL.QH(cnvn, avqL.QH(cnvn) > 20 ? 20 : (Object)avqL.QH(cnvn));
        float f = 0.5f;
        Object object = avqL.QH(avqL.QH(cnvn), 0.0, 20.0);
        f = 0.5f - (Object)object / 20.0f * 0.49f;
        return f;
    }

    public boolean JRFt(Player player) {
        block4 : {
            block3 : {
                block2 : {
                    if (avqL.QH((nSBH)((Object)yy.p(1531250457)), player) == false) break block2;
                    if (avqL.QH((nSBH)((Object)yy.p(494667757)), player) != false) break block3;
                }
                if (!player.isOp()) break block4;
            }
            return true;
        }
        return false;
    }

    public boolean halY(Player player) {
        if (this.JRFt(player)) {
            return (boolean)avqL.QH(avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player));
        }
        return false;
    }

    public void ssMm(Player player) {
        if (this.JRFt(player) && !this.halY(player)) {
            avqL.QH(avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), true);
        }
    }

    public void yIkI(Player player) {
        if (this.JRFt(player) && this.halY(player)) {
            avqL.QH(avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), false);
            avqL.QH(player, BkvY$LhxG.I("\u851d\uc7d5\u53a3\u68f7"));
        }
        if (avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player) != false && !this.JRFt(player)) {
            avqL.QH(avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), false);
            avqL.QH(player, BkvY$LhxG.I("\u851d\uc7d5\u53a3\u68f7"));
        }
    }

    @Override
    public void tick() {
    }

    private void ksfs(Cnvn cnvn) {
        avqL.QH(cnvn, avqL.QH(cnvn) == false);
        avqL.QH(new leqD((Sound)avqL.QH((Jsrc)((Object)yy.p(2109204787))), (Float)avqL.QH(this.mXJp(cnvn)), (Float)avqL.QH(1.9f)), avqL.QH(cnvn));
        avqL.QH(cnvn, avqL.QH(cnvn) + 3);
    }

    private void yJLL(Cnvn cnvn) {
        if (!this.halY((Player)avqL.QH(cnvn))) {
            return;
        }
        this.halY(cnvn);
        this.JRFt(cnvn);
        this.qdWJ(cnvn);
        this.SnBs(cnvn);
    }

    private void SnBs(Cnvn cnvn) {
        if (avqL.QH(cnvn) != false) {
            pOsy pOsy2 = ((avqL)yy.h((CLqw)yy.p(1998252577), -1200101154)).ssVr();
            Object object = avqL.QH(cnvn);
            if (avqL.QH(cnvn) == true) {
                object = avqL.QH(pOsy2, object);
            }
            if (avqL.QH(cnvn) == -1) {
                object = avqL.QH(pOsy2, object);
            }
            if (avqL.QH(cnvn) != object) {
                avqL.QH(cnvn, (Integer)yy.p(1210706236));
                avqL.QH(new leqD((Sound)avqL.QH((Jsrc)((Object)yy.p(1003546938))), (Float)avqL.QH(this.mXJp(cnvn)), (Float)avqL.QH(1.9f)), avqL.QH(cnvn));
                avqL.QH(cnvn, avqL.QH(cnvn) + 3);
            }
            avqL.QH(cnvn, object);
        }
    }

    private void qdWJ(Cnvn cnvn) {
        reference var5_5;
        Object object = avqL.QH(cnvn);
        int n = avqL.QH(cnvn).getInventory().getHeldItemSlot();
        int n2 = n - object;
        if (n2 != (var5_5 = object - n) && n2 != 0 && var5_5 != false) {
            if (n2 == -8) {
                avqL.QH(cnvn, true);
            } else if (var5_5 == -8) {
                avqL.QH(cnvn, -1);
            } else if (n2 == avqL.QH(var5_5, n2)) {
                avqL.QH(cnvn, true);
            } else if (var5_5 == avqL.QH(var5_5, n2)) {
                avqL.QH(cnvn, -1);
            } else {
                avqL.QH(cnvn, false);
            }
        } else {
            avqL.QH(cnvn, false);
        }
        avqL.QH(cnvn, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void JRFt(Cnvn var1_1) {
        block5 : {
            var2_2 = avqL.QH(avqL.QH(var1_1).getLocation());
            var4_3 = avqL.QH(var1_1);
            avqL.QH(var1_1, avqL.QH(var4_3 - var2_2) > 0.001);
            avqL.QH(var1_1, var2_2);
            if (!avqL.QH(var1_1).isSneaking()) break block5;
            if (avqL.QH(var1_1) == false) ** GOTO lbl-1000
            if (!avqL.QH(var1_1).isFlying()) ** GOTO lbl-1000
        }
        if (avqL.QH(var1_1) != false) lbl-1000: // 3 sources:
        {
            v0 = true;
        } else {
            v0 = false;
        }
        var6_4 = v0;
        var7_5 = avqL.QH(var1_1);
        if (var6_4 != var7_5) {
            if (var6_4) {
                avqL.QH(var1_1, avqL.QH(var1_1));
                avqL.QH(var1_1, (Integer)yy.p(1210706236));
                avqL.QH(new leqD((Sound)avqL.QH((Jsrc)yy.p(928377094)), (Float)avqL.QH(this.mXJp(var1_1)), (Float)avqL.QH(1.9f)), avqL.QH(var1_1));
                avqL.QH(var1_1, avqL.QH(var1_1) + 3);
            } else {
                avqL.QH(var1_1, avqL.QH(var1_1));
                avqL.QH(var1_1, -1);
                avqL.QH(new leqD((Sound)avqL.QH((Jsrc)yy.p(-2110920436)), (Float)avqL.QH(this.mXJp(var1_1)), (Float)avqL.QH(1.5f)), avqL.QH(var1_1));
                avqL.QH(var1_1, avqL.QH(var1_1) + 3);
            }
        }
        avqL.QH(var1_1, avqL.QH(var1_1) > 0 ? (Object)(avqL.QH(var1_1) - true) : 0);
        avqL.QH(var1_1, var6_4);
    }

    private void halY(Cnvn cnvn) {
        if (avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(cnvn)) == false) {
            return;
        }
        if (!this.halY((Player)avqL.QH(cnvn))) {
            return;
        }
        avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(cnvn), avqL.QH(avqL.QH((Integer)avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(cnvn))) - true));
        if (avqL.QH((Integer)avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(cnvn))) >= 11) {
            avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(cnvn));
            this.ksfs(cnvn);
            return;
        }
        if (avqL.QH((Integer)avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(cnvn))) < 0) {
            avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(cnvn));
        }
    }

    public String mXJp(Cnvn cnvn, int n, int n2) {
        if (n == -1) {
            return "";
        }
        double d = (double)n2 / (double)((Integer)yy.p(1210706236)).intValue();
        Object object = avqL.QH(avqL.QH(new StringBuilder(), avqL.QH(avqL.QH((pOsy)yy.h(this, -23795219), n)).UtMF()));
        if (d > 0.6) {
            return avqL.QH(avqL.QH(avqL.QH(new StringBuilder(), object), (ydHl)((Object)yy.p(1358555477))));
        }
        if (d > 0.3) {
            return object;
        }
        return avqL.QH(avqL.QH(new StringBuilder(), (ydHl)((Object)yy.p(-20248912))));
    }

    public String mXJp(Cnvn cnvn, ydHl ydHl2, int n) {
        double d = (double)n / (double)((Integer)yy.p(1210706236)).intValue();
        d = 1.0 - d;
        Object object = avqL.QH(avqL.QH(new StringBuilder(), ydHl2));
        if (d > 0.6) {
            return object;
        }
        if (d > 0.3) {
            return avqL.QH(avqL.QH(avqL.QH(new StringBuilder(), object), (ydHl)((Object)yy.p(1358555477))));
        }
        return avqL.QH(avqL.QH(avqL.QH(new StringBuilder(), (ydHl)((Object)yy.p(-20248912))), (ydHl)((Object)yy.p(1358555477))));
    }

    public void ssMm(Cnvn cnvn) {
        Object object = avqL.QH(cnvn);
        Object object2 = avqL.QH(cnvn);
        avqL.QH(object, avqL.QH((pOsy)yy.h(this, -23795219), object2, avqL.QH(cnvn)));
        Object object3 = avqL.QH((pOsy)yy.h(this, -23795219), object2, avqL.QH(cnvn), this, cnvn, avqL.QH(cnvn));
        String string = this.mXJp(cnvn, (int)object2, (int)avqL.QH(cnvn));
        String string2 = object2 != -1 ? (avqL.QH(cnvn) > 0 ? avqL.QH(avqL.QH(avqL.QH(new StringBuilder(), string), avqL.QH(avqL.QH((pOsy)yy.h(this, -23795219), object2)))) : BkvY$LhxG.I("\ua0fe\ue2e1")) : BkvY$LhxG.I("\ua0fe\ue2e1");
        avqL.QH(object, avqL.QH(false), avqL.QH(5), avqL.QH(false), string2, object3);
    }

    public pOsy ssVr() {
        return (pOsy)yy.h(this, -23795219);
    }

    @EventHandler
    public void mXJp(PlayerJoinEvent playerJoinEvent) {
        if (this.JRFt((Player)avqL.QH(playerJoinEvent))) {
            avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), avqL.QH(playerJoinEvent));
        }
    }

    @EventHandler
    public void mXJp(PlayerToggleSneakEvent playerToggleSneakEvent) {
        if (this.JRFt((Player)avqL.QH(playerToggleSneakEvent))) {
            if (this.halY((Player)avqL.QH(playerToggleSneakEvent))) {
                if (avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(playerToggleSneakEvent)) == false) {
                    avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(playerToggleSneakEvent), avqL.QH(false));
                }
                avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(playerToggleSneakEvent), avqL.QH(avqL.QH((Integer)avqL.QH((aKuV)yy.h(this, 1441065215), avqL.QH(playerToggleSneakEvent))) + 5));
            }
        }
    }

    @Override
    public void AWsr() {
        Object object = avqL.QH(avqL.QH((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366)));
        while (object.hasNext()) {
            Cnvn cnvn = (Cnvn)object.next();
            this.yJLL(cnvn);
            if (avqL.QH(cnvn) != false) {
                this.ssMm(cnvn);
            }
            avqL.QH(cnvn, avqL.QH(cnvn) > 0 ? (Object)(avqL.QH(cnvn) - true) : 0);
        }
    }

    @Override
    public String LrGi() {
        return NVIs$JbpD.H("\ubcd1\ub57b\uea5a\uc15f\u60c3\u1489\u4ea1");
    }

    static {
        yy.K(1210706236, 4);
    }

    private static Object QH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

