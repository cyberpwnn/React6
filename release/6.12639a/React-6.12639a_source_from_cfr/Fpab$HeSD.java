/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public final class Fpab$HeSD {
    private static int version;
    private static Class<?> bAYW;
    private static Constructor<?> OBRs;
    private static Method pdSd;
    private static Field mQxW;
    private static Method UnWy;
    private static boolean initialized;
    private final Fpab Xnov;
    private float YicQ;
    private final float YPQV;
    private final float Uefs;
    private final float eJbV;
    private final int xreq;
    private final boolean kvgF;
    private final Fpab$GPlk YjCb;
    private Object lhhX;

    public Fpab$HeSD(Fpab fpab, float f, float f2, float f3, float f4, int n, boolean bl, Fpab$GPlk fpab$GPlk) throws IllegalArgumentException {
        Fpab$HeSD.initialize();
        if (f4 < 0.0f) {
            throw new IllegalArgumentException(nJPf$sILv.G("\udcf6\u5471\u29b2\ucc47\u808c\uf62e\ucc3e\u860a\ud503\u5996\uc97a\u89ec\u28ad\u9869\ud2e5\u923c\u4333\u5f29\u2072\u1f4d\u12da\u9292\ub6de\ue67c\u5a66"));
        }
        if (n < 0) {
            throw new IllegalArgumentException(nJPf$sILv.G("\udcf6\u5471\u29b2\ucc47\u809e\uf633\ucc34\u861a\ud509\u59c2\uc933\u89f6\u28fe\u9825\ud2e6\u9224\u4321\u5f3e\u2020\u1f19\u12c6\u929b\ub6d1\ue632\u5a76\u5930"));
        }
        this.Xnov = fpab;
        this.YicQ = f;
        this.YPQV = f2;
        this.Uefs = f3;
        this.eJbV = f4;
        this.xreq = n;
        this.kvgF = bl;
        this.YjCb = fpab$GPlk;
    }

    public Fpab$HeSD(Fpab fpab, Vector vector, float f, boolean bl, Fpab$GPlk fpab$GPlk) throws IllegalArgumentException {
        this(fpab, (float)Fpab$HeSD.XB(vector), (float)Fpab$HeSD.XB(vector), (float)Fpab$HeSD.XB(vector), f, 0, bl, fpab$GPlk);
    }

    public Fpab$HeSD(Fpab fpab, Fpab$TEqA fpab$TEqA, boolean bl) {
        this(fpab, (float)Fpab$HeSD.XB(fpab$TEqA), (float)Fpab$HeSD.XB(fpab$TEqA), (float)Fpab$HeSD.XB(fpab$TEqA), 1.0f, 0, bl, null);
        if (fpab == (Fpab)((Object)o.k(575946975)) && fpab$TEqA instanceof Fpab$VwLY) {
            if (Fpab$HeSD.XB((Fpab$VwLY)fpab$TEqA) == false) {
                this.YicQ = Float.MIN_NORMAL;
            }
        }
    }

    public static void initialize() throws Fpab$HeSD$biLo {
        if (((Boolean)o.k(1971601629)).booleanValue()) {
            return;
        }
        try {
            Object object = Fpab$HeSD.XB();
            reference var1_2 = Fpab$HeSD.XB(object, mrFx$WjFM.d("\u7b2a")) + true;
            Object object2 = Fpab$HeSD.XB(object, mrFx$WjFM.d("\u7b2a"));
            Object object3 = Fpab$HeSD.XB(Fpab$HeSD.XB(object, var1_2, object2));
            o.w(-1648738085, (int)object3);
            if (object3 > 7) {
                o.w(-165068568, Fpab$HeSD.XB((NgWw$UtIU)((Object)o.k(-1790689046)), mrFx$WjFM.d("\u7b30\u9702\u497f\u3d0b\u2bf1\u29e3\uc0a4\u4dd1\ub67c\ue438\u7906\u459d")));
            }
            Object object4 = Fpab$HeSD.XB((NgWw$UtIU)((Object)o.k(-1790689046)), (Integer)o.k(-1648738085) < 7 ? mrFx$WjFM.d("\u7b25\u970d\u4969\u3d0d\u2bc4\u29f6\uc0e0\u4d96\ub642\ue434\u7918\u4594\u1711\u5a0f\uf2a4\u9ed9\u44cb\u75aa\ud6e5\u77ce\uc56a\u6c08") : mrFx$WjFM.d("\u7b25\u970d\u4969\u3d0d\u2bc4\u29f6\uc086\u4dc9\ub674\ue422\u7925\u458d\u1701\u5a08\uf2aa\u9ed9\u44d3\u75a7\ud6d6\u77c3\uc57d\u6c0f\u9315\u91b9\u0248\u6448\u83bb"));
            o.w(-244498202, Fpab$HeSD.XB(object4, new Class[0]));
            o.w(-1786953501, Fpab$HeSD.XB(mrFx$WjFM.d("\u7b36\u971e\u496b\u3d00\u2bd5\u29d2\uc0ba\u4dc4\ub66c\ue43e\u7918"), (NgWw$UtIU)((Object)o.k(-1555480347)), mrFx$WjFM.d("\u7b12\u9709\u497e\u3d2e\u2bc0\u29ec\uc0b2\u4dc9\ub670"), new Class[0]));
            Object object5 = Fpab$HeSD.XB(mrFx$WjFM.d("\u7b30\u9702\u497e\u3d0f\u2bd5\u29fb\uc086\u4dc9\ub674\ue422\u790f\u458a"), (NgWw$UtIU)((Object)o.k(-1790689046)), false, mrFx$WjFM.d("\u7b05\u9700\u496b\u3d1f\u2bc4\u29f0\uc095\u4dca\ub67b\ue435\u790f\u459b\u1701\u5a36\uf2aa\u9ec5"));
            o.w(1756446929, object5);
            Class[] arrclass = new Class[1];
            arrclass[0] = Fpab$HeSD.XB((NgWw$UtIU)((Object)o.k(-1790689046)), mrFx$WjFM.d("\u7b25\u970d\u4969\u3d0d\u2bc4\u29f6"));
            o.w(1331183823, Fpab$HeSD.XB(Fpab$HeSD.XB(object5), mrFx$WjFM.d("\u7b06\u9709\u4964\u3d02\u2bf1\u29e3\uc0b5\u4dce\ub670\ue42f"), arrclass));
        }
        catch (Exception exception) {
            // empty catch block
        }
        o.w(1971601629, true);
        if (true) {
            return;
        }
    }

    public static int getVersion() {
        if (!((Boolean)o.k(1971601629)).booleanValue()) {
            Fpab$HeSD.initialize();
        }
        return (Integer)o.k(-1648738085);
    }

    public static boolean isInitialized() {
        return (Boolean)o.k(1971601629);
    }

    private void Mkpo(Location location) throws Fpab$HeSD$yJLS {
        if (o.a(this, 1504133326) != null) {
            return;
        }
        try {
            o.v(this, 1504133326, Fpab$HeSD.XB((Constructor)o.k(-244498202), new Object[0]));
            if ((Integer)o.k(-1648738085) < 8) {
                Object object = Fpab$HeSD.XB((Fpab)((Object)o.a(this, 2089828557)));
                if ((Fpab$GPlk)o.a(this, -2211637) != null) {
                    object = Fpab$HeSD.XB(Fpab$HeSD.XB(new StringBuilder((String)Fpab$HeSD.XB(object)), Fpab$HeSD.XB((Fpab$GPlk)o.a(this, -2211637))));
                }
                Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7eff"), object);
            } else {
                Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7eff"), ((Object[])Fpab$HeSD.XB((Class)o.k(-165068568)))[Fpab$HeSD.XB((Fpab)((Object)o.a(this, 2089828557)))]);
                Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7ef4"), Fpab$HeSD.XB((Boolean)o.a(this, 1199653078)));
                if ((Fpab$GPlk)o.a(this, -2211637) != null) {
                    int[] arrn;
                    int[] arrn2 = (int[])Fpab$HeSD.XB((Fpab$GPlk)o.a(this, -2211637));
                    if ((Fpab)((Object)o.a(this, 2089828557)) == (Fpab)((Object)o.k(-2735916))) {
                        arrn = arrn2;
                    } else {
                        int[] arrn3 = new int[1];
                        arrn = arrn3;
                        arrn3[0] = arrn2[0] | arrn2[1] << 12;
                    }
                    Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7ef5"), arrn);
                }
            }
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7efc"), Fpab$HeSD.XB(Fpab$HeSD.XB(location)));
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7efd"), Fpab$HeSD.XB(Fpab$HeSD.XB(location)));
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7efa"), Fpab$HeSD.XB(Fpab$HeSD.XB(location)));
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7efb"), Fpab$HeSD.XB(((Float)o.a(this, 641810643)).floatValue()));
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7ef8"), Fpab$HeSD.XB(((Float)o.a(this, -1663549374)).floatValue()));
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7ef9"), Fpab$HeSD.XB(((Float)o.a(this, 681525313)).floatValue()));
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7ef6"), Fpab$HeSD.XB(((Float)o.a(this, 176767040)).floatValue()));
            Fpab$HeSD.XB(o.a(this, 1504133326), true, mrFx$WjFM.d("\u7ef7"), Fpab$HeSD.XB((Integer)o.a(this, -98615233)));
            return;
        }
        catch (Exception exception) {
            throw new Fpab$HeSD$yJLS(mrFx$WjFM.d("\u7ece\u76b6\ua40f\uc899\u7aeb\ub9ee\ucf75\uacfc\u016c\ud9d1\ue061\u7ae2\uf86c\u339f\u9c67\u4f8c\ud233\uea8d\u45bf\u5d7e\u983b\u3e92\u8b85\u4f75\ub145\u5b70\ub852"), exception);
        }
    }

    public void yJLS(Location location, Player player) throws Fpab$HeSD$yJLS, Fpab$HeSD$UtIU {
        this.Mkpo(location);
        try {
            Fpab$HeSD.XB((Method)o.k(1331183823), Fpab$HeSD.XB((Field)o.k(1756446929), Fpab$HeSD.XB((Method)o.k(-1786953501), player, new Object[0])), new Object[]{o.a(this, 1504133326)});
            return;
        }
        catch (Exception exception) {
            throw new Fpab$HeSD$UtIU((String)Fpab$HeSD.XB(Fpab$HeSD.XB(Fpab$HeSD.XB(new StringBuilder(nJPf$sILv.G("\ud265\u4f19\uaf9f\ub3cb\u71d1\u5c9c\u6072\u7b5a\u02d8\u4c4a\u639a\u4d84\u11f3\u7fd7\ud303\u69ee\u385f\u3c82\u3e8a\uae06\u777d\u120f\ucd0e\udc29\u79a5\udc77\u5628\uf0ce\u8d09\ufaae\u95fa\ue951\u7f52\ueca3\u44ee\u9f5a\u1307")), player.getName()), nJPf$sILv.G("\ud204"))), exception);
        }
    }

    public void UtIU(Location location, List<Player> list) throws IllegalArgumentException {
        if (list.isEmpty()) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u4ff8\u42fd\u5871\u352c\uddc6\u0931\u62d6\ub20a\u0ff1\u9e79\ue5cf\u2f5b\u1ac7\u8c7f\u3ae1\u5905\u0850\ub2ab\ucc2f\uabd3\ue845\uf2a0\u5bbb\ue995"));
        }
        for (Player player : list) {
            this.yJLS(location, player);
        }
    }

    public void UtIU(Location location, double d) throws IllegalArgumentException {
        if (d < 1.0) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u4ff8\u42fd\u5871\u352c\uddc4\u093c\u62d9\ub214\u0ff1\u9e2b\ue586\u2f44\u1a8e\u8c60\u3afa\u5952\u085c\ub2aa\ucc2f\uabc2\ue840\uf2b1\u5ba1\ue9cc\ucc20"));
        }
        String string = Fpab$HeSD.XB(location).getName();
        double d2 = d * d;
        Iterator iterator = Fpab$HeSD.XB().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (Fpab$HeSD.XB(player.getWorld().getName(), string) == false) continue;
            if (Fpab$HeSD.XB(player.getLocation(), location) > d2) continue;
            this.yJLS(location, player);
        }
    }

    private static Object XB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

