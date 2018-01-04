/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class QMuP
extends DirU {
    boolean GRax = false;

    public QMuP() {
        super((String)QMuP.lL(nJPf$sILv.G("\u719a\ucf4b\u68f5\u1be5\u1db8\ubdf2\u0f46\u15fd\u261c\u8511\ub7e8\u3b73\uc3cb\ud226\u383c\uf456\u4f80\u6a9a\u8de6\u6138\ue791\u6e81\u726f\u00dc\uc4e5\u6b65\uf8c7\ucf18\u3ff6\uc19c\u12e7\uced1\ud8e3")));
    }

    @Override
    public boolean OPgL() {
        boolean bl = false;
        double d = 1000000.0;
        double d2 = QMuP.lL((FWER)o.a((TEqA)o.k(911295720), 1286751627), QMuP.lL((biRJ)((Object)o.k(711152348)))).getValue() * 1000000.0;
        double d3 = QMuP.lL((FWER)o.a((TEqA)o.k(911295720), 1286751627), QMuP.lL((biRJ)((Object)o.k(-1092463922)))).getValue();
        Object object = QMuP.lL(d2 * (Double)o.k(1158568138) + (double)((Long)o.k(-840738757)).longValue(), (Long)o.k(-125216707), (Long)o.k(-1501669316));
        if (d3 > object && d3 / 1000000.0 - object / 1000000.0 > (Double)o.k(1219516617)) {
            bl = true;
        }
        if (bl != (Boolean)o.a(this, -1400809494)) {
            o.v(this, -1400809494, bl);
            new QMuP$1(this);
        }
        return bl;
    }

    @Override
    public void NxWm() {
        if (!((Boolean)o.k(-1129817914)).booleanValue()) {
            return;
        }
        if ((Long)o.k(-619556004) % 5 == 0) {
            Player player;
            Object object = QMuP.lL((YLuU)o.a((TEqA)o.k(911295720), -1625533873));
            Object object2 = QMuP.lL((YLuU)o.a((TEqA)o.k(911295720), -1625533873));
            TNku tNku = new TNku();
            int n = 0;
            Object object3 = QMuP.lL(QMuP.lL(object));
            while (object3.hasNext()) {
                player = (Player)object3.next();
                QMuP.lL(tNku, player, (Integer)QMuP.lL(object, player));
                n += QMuP.lL((Integer)QMuP.lL(object, player));
            }
            object3 = QMuP.lL(QMuP.lL(object2));
            while (object3.hasNext()) {
                player = (Plugin)object3.next();
                QMuP.lL(tNku, player, (Integer)QMuP.lL(object2, player));
                n += QMuP.lL((Integer)QMuP.lL(object2, player));
            }
            QMuP.lL(tNku, QMuP.lL(QMuP.lL(QMuP.lL(new StringBuilder(), (psKX)((Object)o.k(2144817739))), nJPf$sILv.G("\uda6c\u9439\u5324\ud70d\ue56b\u75ed"))), QMuP.lL(QMuP.lL((YLuU)o.a((TEqA)o.k(911295720), -1625533873))));
            int n2 = n += QMuP.lL((YLuU)o.a((TEqA)o.k(911295720), -1625533873));
            Object object4 = QMuP.lL(QMuP.lL(tNku));
            while (object4.hasNext()) {
                object3 = object4.next();
                if (!(object3 instanceof Player)) continue;
                if ((Object)QMuP.lL((Integer)QMuP.lL(tNku, object3)) / (double)n2 <= 0.56) continue;
                new QMuP$2(this, object3);
                return;
            }
        }
    }

    private static Object lL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

