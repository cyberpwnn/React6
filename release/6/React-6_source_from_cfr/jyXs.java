/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class jyXs
extends OPXm {
    public jyXs() {
        super(Chunk.class, (GHaL)((Object)cv.e(1197936249)));
    }

    public void IWSm(Chunk chunk) {
        jyXs.Tl(this.mXMK(), chunk);
    }

    public void ssNb(Chunk chunk, int n) {
        jyXs.Tl(this.mXMK(), jyXs.Tl(chunk, n));
    }

    public void ssNb(World world) {
        for (Chunk chunk : world.getLoadedChunks()) {
            this.IWSm(chunk);
        }
    }

    public void HKcf() {
        Iterator iterator = jyXs.Tl().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            this.ssNb(world);
        }
    }

    @Override
    public int jhSt(CommandSender commandSender, String string) throws kYwm {
        QyFw qyFw = new QyFw();
        if (jyXs.Tl(string, rgig$AWxc.r("\u5689\uff0e")) != false) {
            throw new kYwm(rgig$AWxc.r("\u56ec\uff49\uaad4\u3219\u9ee4\ub710\uafbb\ua819\ub69e\u7589\u29f6\ue5d3\udf95\uebe8\u1ecd\u86a0\u9e8c\u9009\u170a\u9a9d\uf4bc\u1df4\ub568\u3067\ue989\ua016\ub5dd\ubc84\u842e\uaa78\u02e5\u3640\u3444\u01f0"));
        }
        if (jyXs.Tl(string, rgig$AWxc.r("\u5689")) != false) {
            for (String string2 : (String[])jyXs.Tl(string, rgig$AWxc.r("\u5689"))) {
                Object object = jyXs.Tl(string2, rgig$AWxc.r("\u568e"));
                Object object2 = jyXs.Tl(this.lCdp(commandSender, (String)(object != false ? jyXs.Tl(string2, true) : string2)));
                while (object2.hasNext()) {
                    Chunk chunk = (Chunk)object2.next();
                    if (object != false) {
                        jyXs.Tl(qyFw, chunk);
                        continue;
                    }
                    jyXs.Tl(qyFw, chunk);
                }
            }
        } else {
            if (jyXs.Tl(string, rgig$AWxc.r("\u568e")) != false) {
                throw new kYwm(rgig$AWxc.r("\u56ec\uff49\uaad4\u3219\u9ee4\ub710\uafbb\ua802\ub688\u758b\u29b7\ue585\udfd6\uebee\u1e89\u86fc\u9ec3\u9030\u1742\u9a9a\uf4a0\u1da0\ub569\u307d\ue989\ua005\ub5d3\ubcce\u841a\uaa7d\u02e1\u3640\u3442\u01d3\u35c0F\ud1fc\u2040\ue63a\u8bbf\ueacc\uef99\ube12\u8bf4\u56b8\u5eb7\u7fc8\ue914\u9e39\u7e07\u2527\u73e1\u6276\uef54\u11a3\ua98f\u915c\u07db\u72d7\u7992"));
            }
            Object object = jyXs.Tl(this.lCdp(commandSender, string));
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                jyXs.Tl(qyFw, chunk);
            }
        }
        jyXs.Tl(this.mXMK(), qyFw);
        return (int)jyXs.Tl(qyFw);
    }

    public QyFw<Chunk> lCdp(CommandSender commandSender, String string) throws kYwm {
        QyFw<Chunk> qyFw = new QyFw<Chunk>();
        if (jyXs.Tl(string, KUXS$dwji.S("\ue4f2\ubaa0\ua6fe\u9124")) != false) {
            Object object = 0;
            Object object2 = null;
            if (!(commandSender instanceof Player)) {
                throw new kYwm(KUXS$dwji.S("\ue4c9\ubaa6\ua6fb\u912e\uef2e\uf089\ud031\u1e22\ud939\u2ae4\u8464\u94da\u3dd0\ua728\uc95a\u414c\uaadc\uff2f\ubddf\u0cbb\u301e\u7554\uf5b9\u131f\u991e\ub0d6\ueb7c\uf93d\uf5d0\u09bc\uc9ab\u56ad\uafc5\ue010\u7d03\u732c\u20b6\u60b2\u6623\u0bbb\u2213\u9c36\uff0c\ufdc6\u0d5d\u57bf\u187e\uc4b2\ufbd1\u7c69\u922b\u6a0f\u2654\ud05f\u9907\ufacf\uea43\ucf26\u0fd0\uc74b\u4a3e\u75b6\ub042\u7206\u9dd3\u2cdf\ua0ef\ud438\u23ff"));
            }
            object2 = jyXs.Tl(((Player)commandSender).getLocation());
            if (jyXs.Tl(string, KUXS$dwji.S("\ue4ad")) != false) {
                try {
                    object = jyXs.Tl(jyXs.Tl(((String[])jyXs.Tl(string, KUXS$dwji.S("\ue4da\ubae3")))[1]));
                }
                catch (NumberFormatException numberFormatException) {
                    throw new kYwm((String)jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4d3\ubaa6\ua6f6\u9135\uef62\uf09c\ud07d\u1e37\ud92f\u2aa1\u8466\u94c8\u3d82\ua738\uc95e\u4102\uaa95\uff34\ubdd8\u0cbb\u3059\u7545\uf5a3\u1340\u991e")), ((String[])jyXs.Tl(string, KUXS$dwji.S("\ue4ad")))[1])));
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    jyXs.Tl(exception);
                    throw new kYwm((String)jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4d3\ubaa6\ua6f6\u9135\uef62\uf09c\ud07d\u1e37\ud92f\u2aa1\u8466\u94c8\u3d82\ua738\uc95e\u4118\uaadc")), string)));
                }
            }
            if (object != 0) {
                if (object < 0) {
                    throw new kYwm((String)jyXs.Tl(jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4c5\ubaa0\ua6e2\u9139\uef65\uf0d9\ud00f\u1e22\ud924\u2ae8\u8463\u94da\u3dd0\ua726\uc94e\u4151\uaa88\uff7a\ubdce\u0cbb\u301e\u7550\uf5be\u1309\u9957\ub080\ueb61\uf923\uf5dc\u09ef\uc9a1")), string), KUXS$dwji.S("\ue4af"))));
                }
                Object object3 = jyXs.Tl(jyXs.Tl(object2, object));
                while (object3.hasNext()) {
                    Chunk chunk = (Chunk)object3.next();
                    jyXs.Tl(qyFw, chunk);
                }
            } else {
                jyXs.Tl(qyFw, object2);
            }
        } else if (jyXs.Tl(string, KUXS$dwji.S("\ue4ac")) != false) {
            Iterator iterator = jyXs.Tl().iterator();
            while (iterator.hasNext()) {
                World world = (World)iterator.next();
                for (Chunk chunk : world.getLoadedChunks()) {
                    jyXs.Tl(qyFw, chunk);
                }
            }
        } else if (jyXs.Tl(string, KUXS$dwji.S("\ue4a8\ubae2")) != false) {
            Object object = jyXs.Tl(string, false, jyXs.Tl(string) - 2);
            boolean bl = false;
            Iterator iterator = jyXs.Tl().iterator();
            while (iterator.hasNext()) {
                World world = (World)iterator.next();
                if (jyXs.Tl(world.getName(), object) == false) continue;
                bl = true;
                for (Chunk chunk : world.getLoadedChunks()) {
                    jyXs.Tl(qyFw, chunk);
                }
            }
            if (!bl) {
                throw new kYwm((String)jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4d3\ubaa6\ua6f6\u9135\uef62\uf09c\ud07d\u1e37\ud92f\u2aa1\u847a\u94c6\u3d93\ua72a\uc94f\u4147\uaadc\uff2d\ubdc3\u0cac\u3052\u7544\uf5f1")), object)));
            }
        } else if (jyXs.Tl(string, KUXS$dwji.S("\ue4a8")) != false) {
            if (jyXs.Tl(string, KUXS$dwji.S("\ue4aa")) != false) {
                String string2 = ((String[])jyXs.Tl(string, KUXS$dwji.S("\ue4da\ubae6")))[0];
                boolean bl = false;
                Iterator iterator = jyXs.Tl().iterator();
                while (iterator.hasNext()) {
                    Object object;
                    Object object4;
                    World world = (World)iterator.next();
                    if (jyXs.Tl(world.getName(), string2) == false) continue;
                    bl = true;
                    String string3 = ((String[])jyXs.Tl(string, KUXS$dwji.S("\ue4da\ubae6")))[1];
                    String string4 = null;
                    if (jyXs.Tl(string3, KUXS$dwji.S("\ue4ad")) != false) {
                        string4 = ((String[])jyXs.Tl(string3, KUXS$dwji.S("\ue4da\ubae3")))[1];
                        string3 = ((String[])jyXs.Tl(string3, KUXS$dwji.S("\ue4da\ubae3")))[0];
                    }
                    if (jyXs.Tl(string3, KUXS$dwji.S("\ue4aa")) == false) {
                        throw new kYwm((String)jyXs.Tl(jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4c5\ubaa9\ua6f9\u9139\uef61\uf08d\ud07d\u1e2a\ud924\u2ae4\u8478\u94dd\u3d99\ua72d\uc942\u4102\uaa9f\uff32\ubdd9\u0cb0\u3055\u7500\uf5b2\u1315\u9951\ub086\ueb6c\uf926\uf599\u09a9\uc9e6\u56ff\uaf8e\ue057")), string3), KUXS$dwji.S("\ue4a4\ubae8\ua6c4\u913f\uef61\uf08c\ud031\u1e27\ud960\u2ae3\u8473\u9489\u3dcc\ua733\uc905\u410e\uaac0\uff20\ubd92"))));
                    }
                    try {
                        object4 = jyXs.Tl(jyXs.Tl(((String[])jyXs.Tl(string3, KUXS$dwji.S("\ue4aa")))[0]));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new kYwm((String)jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4c5\ubaa9\ua6f9\u9139\uef61\uf08d\ud07d\u1e2a\ud924\u2ae4\u8478\u94dd\u3d99\ua72d\uc942\u4102\uaa84\uff7a\ubdda\u0cbf\u3052\u7555\uf5b4\u135a\u9958\ub09b\ueb7a\uf975\uf5da\u09a7\uc9fc\u56e3\uafc5\ue055\u7d09\u733e\u20b5\u60a5\u6624\u0be1\u225c\u9c13\uff53\ufdc6")), ((String[])jyXs.Tl(string3, KUXS$dwji.S("\ue4aa")))[0])));
                    }
                    try {
                        object = jyXs.Tl(jyXs.Tl(((String[])jyXs.Tl(string3, KUXS$dwji.S("\ue4aa")))[1]));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new kYwm((String)jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4c5\ubaa9\ua6f9\u9139\uef61\uf08d\ud07d\u1e2a\ud924\u2ae4\u8478\u94dd\u3d99\ua72d\uc942\u4102\uaa86\uff7a\ubdda\u0cbf\u3052\u7555\uf5b4\u135a\u9958\ub09b\ueb7a\uf975\uf5da\u09a7\uc9fc\u56e3\uafc5\ue055\u7d09\u733e\u20b5\u60a5\u6624\u0be1\u225c\u9c13\uff53\ufdc6")), ((String[])jyXs.Tl(string3, KUXS$dwji.S("\ue4aa")))[1])));
                    }
                    if (!world.isChunkLoaded((int)object4, (int)object)) break;
                    Chunk chunk = world.getChunkAt((int)object4, (int)object);
                    if (string4 != null) {
                        try {
                            Object object5 = jyXs.Tl(jyXs.Tl(string4, true));
                            if (jyXs.Tl(object5) <= 0) {
                                throw new kYwm(KUXS$dwji.S("\ue4c5\ubaa0\ua6e2\u9139\uef65\uf0d9\ud00f\u1e22\ud924\u2ae8\u8463\u94da\u3dd0\ua726\uc94e\u4151\uaa88\uff7a\ubdce\u0cbb\u301e\u7511\uf5f1\u1315\u994c\ub0d4\ueb60\uf93c\uf5de\u09a7\uc9ec\u56ff"));
                            }
                            jyXs.Tl(qyFw, jyXs.Tl(chunk, jyXs.Tl(object5)));
                            break;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new kYwm((String)jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4d3\ubaa6\ua6f6\u9135\uef62\uf09c\ud07d\u1e37\ud92f\u2aa1\u8466\u94c8\u3d82\ua738\uc95e\u4102\uaa8e\uff3b\ubdc8\u0cb7\u304b\u7553\uf5f1\u131c\u9951\ub086\ueb28\uf936\uf5d1\u09ba\uc9e7\u56e6\uaf8e\ue006\u7d16\u733e\u20ba\u60b4\u6628\u0be7\u2209\u9c41")), jyXs.Tl(string4, true))));
                        }
                    }
                    jyXs.Tl(qyFw, chunk);
                    break;
                }
                if (!bl) {
                    throw new kYwm((String)jyXs.Tl(jyXs.Tl(new StringBuilder(KUXS$dwji.S("\ue4d3\ubaa6\ua6f6\u9135\uef62\uf09c\ud07d\u1e37\ud92f\u2aa1\u847a\u94c6\u3d93\ua72a\uc94f\u4147\uaadc\uff2d\ubdc3\u0cac\u3052\u7544\uf5f1")), string2)));
                }
            }
        }
        return qyFw;
    }

    @Override
    public String getName() {
        return KUXS$dwji.S("\uec18\u60bd\u8efd\u5644\u0b74\uc5d4\uc34f\uf1d7");
    }

    private static Object Tl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

