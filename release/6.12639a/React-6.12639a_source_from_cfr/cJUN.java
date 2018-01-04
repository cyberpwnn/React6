/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.player.PlayerJoinEvent
 */
import java.awt.Color;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class cJUN
extends ggmf {
    private TNku<biRJ, MAfd> vuPO;
    private TNku<Player, Yfkr> uWxu;

    @Override
    public void start() {
        cJUN.yZ(this);
        o.v(this, 1404721620, new TNku());
        o.v(this, 1365400019, new TNku());
        biRJ[] arrbiRJ = (biRJ[])cJUN.yZ();
        int n = arrbiRJ.length;
        int n2 = 0;
        while (n2 < n) {
            biRJ biRJ2 = arrbiRJ[n2];
            MAfd mAfd = new MAfd((NwfF)cJUN.yZ(biRJ2), cJUN.yZ(biRJ2).xynF(), 20000);
            Object object = cJUN.yZ(cJUN.yZ(cJUN.yZ(cJUN.yZ(cJUN.yZ(biRJ2).aLXV()))));
            cJUN.yZ(mAfd, cJUN.yZ(new Color((int)object)));
            cJUN.yZ((TNku)o.a(this, 1365400019), biRJ2, mAfd);
            ++n2;
        }
        new cJUN$1(this, FMkR$WjFM.a("\ud07c\udf58\ua90f\u12dd\u883a\uc916\u27a9"));
    }

    @Override
    public void stop() {
        cJUN.yZ(this);
        Object object = cJUN.yZ(cJUN.yZ((TNku)o.a(this, 1404721620)));
        while (object.hasNext()) {
            Player player = (Player)object.next();
            cJUN.yZ((Yfkr)cJUN.yZ((TNku)o.a(this, 1404721620), player));
        }
    }

    @Override
    public void tick() {
        new cJUN$2(this);
    }

    @EventHandler
    public void yJLS(PlayerJoinEvent playerJoinEvent) {
        new cJUN$3(this, mrFx$WjFM.d("\u473d\ua7a5\u8b4e\u0a61\u91b1\u9d7b\u8cec"), playerJoinEvent);
    }

    public void GPlk(Player player) {
        if (cJUN.yZ((JIWX)o.k(-918600437)) == false) {
            cJUN.yZ((JIWX)o.k(-918600437), player);
            return;
        }
        if (cJUN.yZ((TNku)o.a(this, 1404721620), player) == false) {
            feCR feCR2 = new feCR();
            cJUN.yZ((TNku)o.a(this, 1404721620), player, new Yfkr(player));
            cJUN.yZ(feCR2, new ogNr(new Cwnv((String)cJUN.yZ(FMkR$WjFM.a("\ue82c\u30d0\uc61d\ue267\u0d1f\u43e8\u6dd7\u4b7c\u4bf6\u463e\uae09\ud6bd\u1ac7\u941e\u1359\u725c\uca02\uda80\ue0f0")), (byte)cJUN.yZ((MAfd)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(711152348))))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(711152348))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-1955441954))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-1235725590))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr(new Cwnv((String)cJUN.yZ(FMkR$WjFM.a("\ue82c\u30d0\uc61d\ue267\u0d1f\u43e8\u6dd7\u4b7c\u4bf6\u463e\uae09\ud6bd\u1ac7\u941e\u1359\u7245\uca0e\uda8e\ue0f4\u10e2\uad41")), (byte)cJUN.yZ((MAfd)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(737891048))))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(737891048))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-659533104))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-51227950))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr(new Cwnv((String)cJUN.yZ(FMkR$WjFM.a("\ue82c\u30d0\uc61d\ue267\u0d1f\u43e8\u6dd7\u4b7c\u4bf6\u463e\uae09\ud6bd\u1ac7\u941e\u1359\u7258\uca03\uda9a\ue0e8\u10f9\uad5b\u417c")), (byte)cJUN.yZ((MAfd)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-1952623888))))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-1952623888))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-529313032))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(459035360))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-1092463922))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(781996670))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(1264538316))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(652628604))), (JcRS)((Object)o.k(-1776330296))));
            cJUN.yZ(feCR2, new ogNr(new Cwnv((String)cJUN.yZ(FMkR$WjFM.a("\ue82c\u30d0\uc61d\ue267\u0d1f\u43e8\u6dd7\u4b7c\u4bf6\u463e\uae09\ud6bd\u1ac7\u941e\u1359\u725a\uca0e\uda82\ue0f8\u10e4")), (byte)cJUN.yZ((MAfd)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(1032082136))))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(1032082136))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ(feCR2, new ogNr((xyxr)cJUN.yZ((TNku)o.a(this, 1365400019), (biRJ)((Object)o.k(-917482794))), (JcRS)((Object)o.k(-19506743))));
            cJUN.yZ((Yfkr)cJUN.yZ((TNku)o.a(this, 1404721620), player), feCR2);
            cJUN.yZ((Yfkr)cJUN.yZ((TNku)o.a(this, 1404721620), player));
        }
        cJUN.yZ((Yfkr)cJUN.yZ((TNku)o.a(this, 1404721620), player));
    }

    public TNku<biRJ, MAfd> oxLO() {
        return (TNku)o.a(this, 1365400019);
    }

    public TNku<Player, Yfkr> WiUt() {
        return (TNku)o.a(this, 1404721620);
    }

    static /* synthetic */ TNku yJLS(cJUN cJUN2) {
        return (TNku)o.a(cJUN2, 1404721620);
    }

    static /* synthetic */ TNku UtIU(cJUN cJUN2) {
        return (TNku)o.a(cJUN2, 1365400019);
    }

    private static Object yZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

