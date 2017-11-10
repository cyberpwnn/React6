/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

class Jsoe$1
extends ksfs {
    final /* synthetic */ aKuV hcCR;
    final /* synthetic */ Jsoe XldY;

    Jsoe$1(Jsoe jsoe, aKuV aKuV2) {
        this.XldY = jsoe;
        this.hcCR = aKuV2;
    }

    @Override
    public void run() {
        Object object = Jsoe$1.xp(Jsoe$1.xp((aKuV)yy.h(this, -577311760)));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            if (((Boolean)yy.p(-1780814728)).booleanValue()) {
                Jsoe$1.xp((OGmN)((Object)yy.p(244902853)), new OGmN$SnBs((Color)Jsoe$1.xp((aKuV)yy.h(this, -577311760), location)), location, Jsoe$1.xp((Jsoe)yy.h(this, 958393278)));
            }
            if (!((Boolean)yy.p(2010377335)).booleanValue()) continue;
            Object object2 = Jsoe$1.xp((Color)Jsoe$1.xp((aKuV)yy.h(this, -577311760), location));
            try {
                Object object3 = Jsoe$1.xp(Jsoe$1.xp((Jsoe)yy.h(this, 958393278)));
                while (object3.hasNext()) {
                    Player player = (Player)object3.next();
                    player.sendBlockChange(location, (Material)yy.p(889449410), (byte)Jsoe$1.xp(object2));
                    new Jsoe$1$1(this, KDGY$JAHk.Y("\u4c8f\ud32b\u13ee\u17a2\u6171\u4a06\ub2f9\ud3aa\uc7e6\ub71b\u801c\u2306\uc6a6\uab91\u2267\uf256\u9dbd"), 2, 88, location, player);
                }
            }
            catch (Exception exception) {
            }
        }
    }

    private static Object xp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

