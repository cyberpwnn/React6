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

@tvby
public class WWtP
extends ggmf
implements qSgW {
    public static int oNVh;
    private eYJe sJBa = new eYJe();
    private TNku<Player, Integer> pIIa = new TNku();
    private wTwT cdel;
    private boolean GtXP = false;

    static {
        o.w(1694914674, 4);
    }

    @Override
    public void start() {
        WWtP.zg(this);
        WWtP.zg(this);
        this.Elpk();
        Iterator iterator = WWtP.zg().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (!this.Ipep(player) && !this.qcvH(player)) continue;
            WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player);
        }
        WWtP.zg(FMkR$WjFM.a("\u4b15\udb13\ue2b7\ua270\ue0a0\ueb2c\ue123\u89dd\u143b\u51ac\u25d1\uee4b\ub22f\u7708\uea3a\u08ba\u7b42\u0494\u84e4\u7afe\uee4a\u7848\u7e0c\u6075\u507e\u3a8b\u9f67\u8a3b"));
        new WWtP$1(this, FMkR$WjFM.a("\u4b31\udb17\ue2aa\ua271\ue0b5\ueb7e\ue143\u89c1\u1437"));
    }

    private wTwT SnJT() {
        return new wTwT((String)WWtP.zg(WWtP.zg(WWtP.zg(new StringBuilder(), (psKX)((Object)o.k(-857517477))), WWtP.zg(mrFx$WjFM.d("\ue841\u7ffd\u87fd\u29e7\u3d99\u17b5\u5885\u14e9\uc672\uba52\uf993\ubf67\ub5f4\u9665\uda54\uee87\ud138\u513b\u7c8d\u142b\u54eb\u8020\u14a6\u12fc\ud031\ue8e3\u74da\u5ad4\u9969\u31de\ubd63\u5c23\u2140\uf91f\u37f2\u8f4b\u4212")))));
    }

    public void ktHX(Player player) {
        if (!this.qcvH(player)) {
            return;
        }
        if (this.Mkpo(player)) {
            this.IFQY(player);
            WWtP.zg(player, (String)o.k(-687253392));
            WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player, false);
            return;
        }
        this.xykf(player);
        WWtP.zg(player, (String)o.k(-252749713));
        WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player, false);
    }

    public void HeSD(Player player) {
        if (!this.Ipep(player)) {
            return;
        }
        if (this.UQfI(player)) {
            this.wKtV(player);
            WWtP.zg(player, (String)o.k(1416779886));
            WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player, false);
            return;
        }
        this.CoVI(player);
        WWtP.zg(player, (String)o.k(1782339693));
        WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player, false);
    }

    @Override
    public void stop() {
        WWtP.zg(this);
        WWtP.zg(this);
        Iterator iterator = WWtP.zg().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (!this.Mkpo(player)) continue;
            WWtP.zg((wTwT)o.a(this, -1433577365), player);
        }
    }

    public void Elpk() {
        Kvlx kvlx = new Kvlx((String)o.k(-1928832903), (NwfF)WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(-1955441954)))));
        WWtP.zg(kvlx, WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(711152348)))));
        WWtP.zg(kvlx, WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(-1235725590)))));
        Kvlx kvlx2 = new Kvlx((String)o.k(2084132983), (NwfF)WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(737891048)))));
        WWtP.zg(kvlx2, WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(-659533104)))));
        Kvlx kvlx3 = new Kvlx((String)o.k(1608669302), (NwfF)WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(-864726310)))));
        WWtP.zg(kvlx3, WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(603673300)))));
        Kvlx kvlx4 = new Kvlx((String)o.k(2092521589), (NwfF)WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(-200322494)))));
        WWtP.zg(kvlx4, WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(1642156608)))));
        WWtP.zg(kvlx4, WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(-567520706)))));
        WWtP.zg(kvlx4, WWtP.zg((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWtP.zg((biRJ)((Object)o.k(1030509116)))));
        WWtP.zg((eYJe)o.a(this, -88844172), kvlx);
        WWtP.zg((eYJe)o.a(this, -88844172), kvlx2);
        WWtP.zg((eYJe)o.a(this, -88844172), kvlx3);
        WWtP.zg((eYJe)o.a(this, -88844172), kvlx4);
    }

    public float yJLS(Jbjx jbjx) {
        WWtP.zg(jbjx, WWtP.zg(jbjx) > 20 ? 20 : (Object)WWtP.zg(jbjx));
        float f = 0.5f;
        Object object = WWtP.zg(WWtP.zg(jbjx), 0.0, 20.0);
        f = 0.5f - (Object)object / 20.0f * 0.49f;
        return f;
    }

    public boolean Ipep(Player player) {
        block5 : {
            block4 : {
                if (WWtP.zg((aeiw)((Object)o.k(673269243)), player) == false) break block4;
                if (WWtP.zg((aeiw)((Object)o.k(-1903409785)), player) != false) break block5;
            }
            if (!player.isOp()) {
                return false;
            }
        }
        return true;
    }

    public boolean qcvH(Player player) {
        block5 : {
            block4 : {
                if (WWtP.zg((aeiw)((Object)o.k(673269243)), player) == false) break block4;
                if (WWtP.zg((aeiw)((Object)o.k(1848722822)), player) != false) break block5;
            }
            if (!player.isOp()) {
                return false;
            }
        }
        return true;
    }

    public boolean UQfI(Player player) {
        if (this.Ipep(player)) {
            return (boolean)WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player));
        }
        return false;
    }

    public boolean Mkpo(Player player) {
        if (this.qcvH(player)) {
            return (boolean)WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player));
        }
        return false;
    }

    public void CoVI(Player player) {
        if (this.Ipep(player) && !this.UQfI(player)) {
            WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), true);
        }
    }

    public void wKtV(Player player) {
        if (this.Ipep(player) && this.UQfI(player)) {
            WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), false);
            WWtP.zg(player, nJPf$sILv.G("\u9b2a\u02ba\uf95b\uf5b2"));
        }
        if (WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player) != false && !this.Ipep(player)) {
            WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), false);
            WWtP.zg(player, nJPf$sILv.G("\u9b2a\u02ba\uf95b\uf5b2"));
        }
    }

    public void xykf(Player player) {
        if (this.qcvH(player)) {
            WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), true);
            WWtP.zg((wTwT)o.a(this, -1433577365), player);
        }
    }

    public void IFQY(Player player) {
        if (this.qcvH(player) && this.Mkpo(player)) {
            WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), false);
            WWtP.zg((wTwT)o.a(this, -1433577365), player);
        }
        if (WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player) != false && !this.qcvH(player)) {
            WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), false);
            WWtP.zg((wTwT)o.a(this, -1433577365), player);
        }
    }

    @Override
    public void tick() {
    }

    private void UtIU(Jbjx jbjx) {
        WWtP.zg(jbjx, WWtP.zg(jbjx) == false);
        WWtP.zg(new OPgL((Sound)WWtP.zg((EBjP)((Object)o.k(-647735192))), (Float)WWtP.zg(this.yJLS(jbjx)), (Float)WWtP.zg(1.9f)), WWtP.zg(jbjx));
        WWtP.zg(jbjx, WWtP.zg(jbjx) + 3);
    }

    private void biLo(Jbjx jbjx) {
        if (this.Mkpo((Player)WWtP.zg(jbjx))) {
            this.uVol((Player)WWtP.zg(jbjx));
        }
        if (this.UQfI((Player)WWtP.zg(jbjx))) {
            this.GPlk(jbjx);
            this.KTiK(jbjx);
            this.TEqA(jbjx);
            this.VwLY(jbjx);
        }
    }

    private void uVol(Player player) {
    }

    private void VwLY(Jbjx jbjx) {
        if (WWtP.zg(jbjx) != false) {
            eYJe eYJe2 = ((WWtP)o.a((TEqA)o.k(911295720), -1632546189)).dLuw();
            Object object = WWtP.zg(jbjx);
            if (WWtP.zg(jbjx) == true) {
                object = WWtP.zg(eYJe2, object);
            }
            if (WWtP.zg(jbjx) == -1) {
                object = WWtP.zg(eYJe2, object);
            }
            if (WWtP.zg(jbjx) != object) {
                WWtP.zg(jbjx, (Integer)o.k(1694914674));
                WWtP.zg(new OPgL((Sound)WWtP.zg((EBjP)((Object)o.k(463231054))), (Float)WWtP.zg(this.yJLS(jbjx)), (Float)WWtP.zg(1.9f)), WWtP.zg(jbjx));
                WWtP.zg(jbjx, WWtP.zg(jbjx) + 3);
            }
            WWtP.zg(jbjx, object);
        }
    }

    private void TEqA(Jbjx jbjx) {
        reference var5_5;
        Object object = WWtP.zg(jbjx);
        int n = WWtP.zg(jbjx).getInventory().getHeldItemSlot();
        int n2 = n - object;
        if (n2 != (var5_5 = object - n) && n2 != 0 && var5_5 != false) {
            if (n2 == -8) {
                WWtP.zg(jbjx, true);
            } else if (var5_5 == -8) {
                WWtP.zg(jbjx, -1);
            } else if (n2 == WWtP.zg(var5_5, n2)) {
                WWtP.zg(jbjx, true);
            } else if (var5_5 == WWtP.zg(var5_5, n2)) {
                WWtP.zg(jbjx, -1);
            } else {
                WWtP.zg(jbjx, false);
            }
        } else {
            WWtP.zg(jbjx, false);
        }
        WWtP.zg(jbjx, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void KTiK(Jbjx var1_1) {
        block5 : {
            var2_2 = WWtP.zg(WWtP.zg(var1_1).getLocation());
            var4_3 = WWtP.zg(var1_1);
            WWtP.zg(var1_1, WWtP.zg(var4_3 - var2_2) > 0.001);
            WWtP.zg(var1_1, var2_2);
            if (!WWtP.zg(var1_1).isSneaking()) break block5;
            if (WWtP.zg(var1_1) == false) ** GOTO lbl-1000
            if (!WWtP.zg(var1_1).isFlying()) ** GOTO lbl-1000
        }
        if (WWtP.zg(var1_1) == false) {
            v0 = false;
        } else lbl-1000: // 3 sources:
        {
            v0 = true;
        }
        var6_4 = v0;
        var7_5 = WWtP.zg(var1_1);
        if (var6_4 != var7_5) {
            if (var6_4) {
                WWtP.zg(var1_1, WWtP.zg(var1_1));
                WWtP.zg(var1_1, (Integer)o.k(1694914674));
                WWtP.zg(new OPgL((Sound)WWtP.zg((EBjP)o.k(1636915284)), (Float)WWtP.zg(this.yJLS(var1_1)), (Float)WWtP.zg(1.9f)), WWtP.zg(var1_1));
                WWtP.zg(var1_1, WWtP.zg(var1_1) + 3);
            } else {
                WWtP.zg(var1_1, WWtP.zg(var1_1));
                WWtP.zg(var1_1, -1);
                WWtP.zg(new OPgL((Sound)WWtP.zg((EBjP)o.k(1295210946)), (Float)WWtP.zg(this.yJLS(var1_1)), (Float)WWtP.zg(1.5f)), WWtP.zg(var1_1));
                WWtP.zg(var1_1, WWtP.zg(var1_1) + 3);
            }
        }
        WWtP.zg(var1_1, WWtP.zg(var1_1) > 0 ? (Object)(WWtP.zg(var1_1) - true) : 0);
        WWtP.zg(var1_1, var6_4);
    }

    private void GPlk(Jbjx jbjx) {
        if (WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(jbjx)) == false) {
            return;
        }
        if (!this.UQfI((Player)WWtP.zg(jbjx))) {
            return;
        }
        WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(jbjx), WWtP.zg(WWtP.zg((Integer)WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(jbjx))) - true));
        if (WWtP.zg((Integer)WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(jbjx))) >= 11) {
            WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(jbjx));
            this.UtIU(jbjx);
            return;
        }
        if (WWtP.zg((Integer)WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(jbjx))) < 0) {
            WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(jbjx));
        }
    }

    public String yJLS(Jbjx jbjx, int n, int n2) {
        if (n == -1) {
            return "";
        }
        double d = (double)n2 / (double)((Integer)o.k(1694914674)).intValue();
        Object object = WWtP.zg(WWtP.zg(new StringBuilder(), WWtP.zg(WWtP.zg((eYJe)o.a(this, -88844172), n)).aLXV()));
        if (d > 0.6) {
            return WWtP.zg(WWtP.zg(new StringBuilder((String)WWtP.zg(object)), (psKX)((Object)o.k(-1489545201))));
        }
        if (d > 0.3) {
            return object;
        }
        return WWtP.zg(WWtP.zg(new StringBuilder(), (psKX)((Object)o.k(1251758875))));
    }

    public String yJLS(Jbjx jbjx, psKX psKX2, int n) {
        double d = (double)n / (double)((Integer)o.k(1694914674)).intValue();
        d = 1.0 - d;
        Object object = WWtP.zg(psKX2);
        if (d > 0.6) {
            return object;
        }
        if (d > 0.3) {
            return WWtP.zg(WWtP.zg(new StringBuilder((String)WWtP.zg(object)), (psKX)((Object)o.k(-1489545201))));
        }
        return WWtP.zg(WWtP.zg(WWtP.zg(new StringBuilder(), (psKX)((Object)o.k(1251758875))), (psKX)((Object)o.k(-1489545201))));
    }

    public void ktHX(Jbjx jbjx) {
        if (WWtP.zg((JIWX)o.k(621102355)) != false) {
            Object object = WWtP.zg(jbjx);
            Object object2 = WWtP.zg(jbjx);
            WWtP.zg(object, WWtP.zg((eYJe)o.a(this, -88844172), object2, WWtP.zg(jbjx)));
            Object object3 = WWtP.zg((eYJe)o.a(this, -88844172), object2, WWtP.zg(jbjx), this, jbjx, WWtP.zg(jbjx));
            String string = this.yJLS(jbjx, (int)object2, (int)WWtP.zg(jbjx));
            String string2 = object2 != -1 ? (WWtP.zg(jbjx) > 0 ? WWtP.zg(WWtP.zg(new StringBuilder((String)WWtP.zg(string)), WWtP.zg(WWtP.zg((eYJe)o.a(this, -88844172), object2)))) : FMkR$WjFM.a("\ucdfe\u69a6")) : FMkR$WjFM.a("\ucdfe\u69a6");
            WWtP.zg(object, WWtP.zg(false), WWtP.zg(5), WWtP.zg(false), string2, object3);
        }
    }

    public eYJe dLuw() {
        return (eYJe)o.a(this, -88844172);
    }

    @EventHandler
    public void yJLS(PlayerJoinEvent playerJoinEvent) {
        block5 : {
            block4 : {
                if (this.Ipep((Player)WWtP.zg(playerJoinEvent))) break block4;
                if (!this.qcvH((Player)WWtP.zg(playerJoinEvent))) break block5;
            }
            WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257), WWtP.zg(playerJoinEvent));
        }
        if (this.Mkpo((Player)WWtP.zg(playerJoinEvent))) {
            this.xykf((Player)WWtP.zg(playerJoinEvent));
        }
    }

    @EventHandler
    public void yJLS(PlayerToggleSneakEvent playerToggleSneakEvent) {
        if (this.Ipep((Player)WWtP.zg(playerToggleSneakEvent))) {
            if (this.UQfI((Player)WWtP.zg(playerToggleSneakEvent))) {
                if (WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(playerToggleSneakEvent)) == false) {
                    WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(playerToggleSneakEvent), WWtP.zg(false));
                }
                WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(playerToggleSneakEvent), WWtP.zg(WWtP.zg((Integer)WWtP.zg((TNku)o.a(this, -1458677313), WWtP.zg(playerToggleSneakEvent))) + 5));
            }
        }
    }

    @Override
    public void owir() {
        this.wClQ();
        Object object = WWtP.zg(WWtP.zg((JkaV)o.a((TEqA)o.k(911295720), 1104499257)));
        while (object.hasNext()) {
            Jbjx jbjx = (Jbjx)object.next();
            this.biLo(jbjx);
            if (WWtP.zg(jbjx) != false) {
                this.ktHX(jbjx);
            }
            WWtP.zg(jbjx, WWtP.zg(jbjx) > 0 ? (Object)(WWtP.zg(jbjx) - true) : 0);
        }
    }

    private void wClQ() {
        new WWtP$2(this);
    }

    @Override
    public String YMWq() {
        return WWtP.zg(FMkR$WjFM.a("\uda75\u9f48\u67b7\u61c7\u02a3\u8dde\u3559\ue1b2\uba0d\u70d5\u6ac6\ue1a2\u085e\ud6be\uaedb\u5856\u2c76\u0881\u2c24\u3408\uae4b\u3fde\u4ce4\uf196\uf1ce\ud245\u7109\u3d09\ue2dd"));
    }

    static /* synthetic */ wTwT yJLS(WWtP wWtP) {
        return wWtP.SnJT();
    }

    static /* synthetic */ void yJLS(WWtP wWtP, wTwT wTwT2) {
        o.v(wWtP, -1433577365, wTwT2);
    }

    static /* synthetic */ void yJLS(WWtP wWtP, boolean bl) {
        o.v(wWtP, 1072584775, bl);
    }

    static /* synthetic */ boolean UtIU(WWtP wWtP) {
        return (Boolean)o.a(wWtP, 1072584775);
    }

    static /* synthetic */ wTwT biLo(WWtP wWtP) {
        return (wTwT)o.a(wWtP, -1433577365);
    }

    private static Object zg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

