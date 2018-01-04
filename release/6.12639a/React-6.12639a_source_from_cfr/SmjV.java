/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class SmjV
extends ggmf {
    private Lhwj<STSP> HMEb;
    private Lhwj<STSP> Fybs;
    private TNku<OPWR, Integer> jrIw;

    @Override
    public void start() {
        o.v(this, 1870420159, new Lhwj());
        o.v(this, 1153194174, new Lhwj());
        o.v(this, -1491248963, new TNku());
        this.eilm();
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    public void eilm() {
        SmjV.JW((TNku)o.a(this, -1491248963));
        SmjV.JW((Lhwj)o.a(this, 1870420159));
        SmjV.JW((Lhwj)o.a(this, 1153194174));
        Object object = SmjV.JW((feCR)o.k(-1233626917));
        while (object.hasNext()) {
            int n;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            String string = (String)object.next();
            if (SmjV.JW(string, FMkR$WjFM.a("\uafe6\u879d\uf3d6\ueb28\uf0c4\u7825\u1f44\uf1fb")) != false) {
                object3 = SmjV.JW(SmjV.JW(string, FMkR$WjFM.a("\uafe6\u879d\uf3d6\ueb28\uf0c4\u7825\u1f44\uf1fb"), ""));
                object4 = (STSP[])SmjV.JW();
                object2 = object4.length;
                n = 0;
                while (n < object2) {
                    object5 = object4[n];
                    if (SmjV.JW(SmjV.JW(object5), object3) != false) {
                        if (SmjV.JW((Lhwj)o.a(this, 1870420159), object5) != false) {
                            SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e80\u33e4\u5f68\ud185\uffad\u8f05\u3da5\u9bd3\u688c\ud385\u7b75\u9660\u3c6d\u56a2\ub54a\u8d0e")))), string), FMkR$WjFM.a("\uaf8f"))));
                        }
                        SmjV.JW((Lhwj)o.a(this, 1870420159), object5);
                    }
                    ++n;
                }
                continue;
            }
            if (SmjV.JW(string, FMkR$WjFM.a("\uafe6\u878b\uf3d6\ueb28\uf0d4\u7824\u1f01")) != false) {
                object3 = SmjV.JW(SmjV.JW(string, FMkR$WjFM.a("\uafe6\u878b\uf3d6\ueb28\uf0d4\u7824\u1f01"), ""));
                object4 = (STSP[])SmjV.JW();
                object2 = object4.length;
                n = 0;
                while (n < object2) {
                    object5 = object4[n];
                    if (SmjV.JW(SmjV.JW(object5), object3) != false) {
                        if (SmjV.JW((Lhwj)o.a(this, 1153194174), object5) != false) {
                            SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e80\u33e4\u5f68\ud185\uffad\u8f05\u3da5\u9bd3\u688c\ud385\u7b63\u9660\u3c6d\u56b2\ub54b")))), string), FMkR$WjFM.a("\uaf8f"))));
                        }
                        if (SmjV.JW((Lhwj)o.a(this, 1870420159), object5) != false) {
                            SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e87\u33f0\u5f76\ud187\uffab\u8f12\u3de9\u9bc3\u688c\ud3ce\u7b62\u9677\u3c26\u56a5\ub55c\u8d0d\u5727\u1e58\u7121\u53d1")))), string), FMkR$WjFM.a("\uaf8f"))));
                        } else {
                            SmjV.JW((Lhwj)o.a(this, 1153194174), object5);
                        }
                    }
                    ++n;
                }
                continue;
            }
            if (SmjV.JW(string, FMkR$WjFM.a("\uafe6\u879d\uf3d6\ueb3d\uf0c5\u7824\u1f48\uf1b8\u2806\u5794")) != false) {
                if (SmjV.JW(string, FMkR$WjFM.a("\uaf9b")) != false) {
                    object3 = SmjV.JW(SmjV.JW(string, FMkR$WjFM.a("\uafe6\u879d\uf3d6\ueb3d\uf0c5\u7824\u1f48\uf1b8\u2806\u5794"), ""));
                    object5 = SmjV.JW(((String[])SmjV.JW(object3, FMkR$WjFM.a("\uaf9b")))[0]);
                    Object object6 = SmjV.JW(((String[])SmjV.JW(object3, FMkR$WjFM.a("\uaf9b")))[1]);
                    try {
                        Object object7;
                        Object object8;
                        object2 = SmjV.JW(SmjV.JW(object6));
                        object4 = new feCR();
                        if (SmjV.JW(object5, FMkR$WjFM.a("\uaf8a")) != false) {
                            object8 = (String[])SmjV.JW(object5, FMkR$WjFM.a("\uaf8a"));
                            int n2 = object8.length;
                            int n3 = 0;
                            while (n3 < n2) {
                                object7 = object8[n3];
                                SmjV.JW(object4, SmjV.JW(object7));
                                ++n3;
                            }
                        } else {
                            SmjV.JW(object4, object5);
                        }
                        object7 = new OPWR();
                        Object object9 = SmjV.JW(object4);
                        block6 : while (object9.hasNext()) {
                            String string2 = (String)object9.next();
                            Object object10 = SmjV.JW((feCR)o.k(1147164894));
                            while (object10.hasNext()) {
                                object8 = (String)object10.next();
                                if (SmjV.JW(SmjV.JW(object8, FMkR$WjFM.a("\uaff9"), FMkR$WjFM.a("\uaf86")), string2) == false) continue;
                                EntityType[] arrentityType = (EntityType[])SmjV.JW();
                                int n4 = arrentityType.length;
                                int n5 = 0;
                                while (n5 < n4) {
                                    EntityType entityType = arrentityType[n5];
                                    if (SmjV.JW(SmjV.JW(entityType), object8) != false) {
                                        SmjV.JW(SmjV.JW(object7), entityType);
                                        continue block6;
                                    }
                                    ++n5;
                                }
                                SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e87\u33f0\u5f76\ud187\uffab\u8f12\u3de9\u9bc1\u6880\ud3c6\u7b63\u9628\u3c6e\u56b9\ub54d\u8d02\u5726\u1e52\u7169\u53c1\ud366\u1935\u9de2")))), string2), FMkR$WjFM.a("\uaf86\u87e7")), string), FMkR$WjFM.a("\uaf8f"))));
                            }
                        }
                        if (SmjV.JW(SmjV.JW(object7)) != false) {
                            SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e87\u33fe\u5f6d\ud185\uffa0\u8f4b\u3daa\u9bc8\u689d\ud385\u7b77\u9664\u3c79\u56a4\ub55c\u8d46\u5733\u1e45\u713d")))), string)));
                            continue;
                        }
                        SmjV.JW((TNku)o.a(this, -1491248963), object7, SmjV.JW(object2));
                    }
                    catch (NumberFormatException numberFormatException) {
                        SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e91\u33ff\u5f79\ud18b\uffa8\u8f03\u3de9\u9bd3\u6886\ud385\u7b77\u9664\u3c79\u56a4\ub55c\u8d46\u573b\u1e45\u7130")))), string)));
                    }
                    continue;
                }
            }
            SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e91\u33ff\u5f79\ud18b\uffa8\u8f03\u3de9\u9bd3\u6886\ud385\u7b77\u9664\u3c79\u56a4\ub55c")))), string)));
            SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e89\u33e4\u5f6b\ud19d\uffe9\u8f15\u3db0\u9bc6\u689b\ud3dc\u7b2a\u9672\u3c62\u56a3\ub551\u8d46\u5720\u1e4e\u7137\u53c1\ud36d\u192c\u9de4\u5797")));
        }
        SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e86\u33e4\u5f71\ud185\uffb0")))), SmjV.JW((Lhwj)o.a(this, 1870420159))), SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e96\u33f4\u5f7e\ud19c\uffb7\u8f07\u3da8\u9bd4")))));
        SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e86\u33e4\u5f71\ud185\uffb0")))), SmjV.JW((Lhwj)o.a(this, 1153194174))), SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e80\u33f4\u5f7e\ud18c\uffb6\u8f15")))));
        SmjV.JW(SmjV.JW(SmjV.JW(SmjV.JW(new StringBuilder((String)SmjV.JW(SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e86\u33e4\u5f71\ud185\uffb0")))), SmjV.JW((TNku)o.a(this, -1491248963))), SmjV.JW(FMkR$WjFM.a("\uafc5\u87a0\uf3dd\ueb3a\uf0c3\u7839\u1f4d\uf1b7\u2817\u57c6\ue2be\u1dd2\u7e60\u7f92\u3104\u55ba\u1d0a\u222f\u5013\uda50\ua1fa\ud362\uedc9\u8da8\u1593\u3e82\u33f8\u5f74\ud19d\uffa1\u8f14\u3db7")))));
    }

    public int biLo(Chunk chunk) {
        int n;
        int n2 = 0;
        while ((n = this.VwLY(chunk)) > 0) {
            n2 += n;
        }
        return n2;
    }

    private int VwLY(Chunk chunk) {
        feCR feCR2;
        Object object;
        Object object2;
        EntityType entityType;
        ivSs ivSs2 = new ivSs();
        ivSs ivSs3 = new ivSs();
        ivSs ivSs4 = new ivSs();
        TNku tNku = new TNku();
        Object object3 = new Lhwj();
        int n = 0;
        EntityType entityType2 = chunk.getEntities();
        int n2 = entityType2.length;
        int n3 = 0;
        while (n3 < n2) {
            block13 : {
                object2 = entityType2[n3];
                if (!object2.isDead()) {
                    object3 = SmjV.JW(object2);
                    feCR2 = SmjV.JW(object3);
                    while (feCR2.hasNext()) {
                        object = (STSP)((Object)feCR2.next());
                        if (SmjV.JW((Lhwj)o.a(this, 1870420159), object) == false) {
                            continue;
                        }
                        break block13;
                    }
                    feCR2 = SmjV.JW(object3);
                    while (feCR2.hasNext()) {
                        object = (STSP)((Object)feCR2.next());
                        if (SmjV.JW((Lhwj)o.a(this, 1153194174), object) == false) continue;
                        SmjV.JW(ivSs3, object2);
                        SmjV.JW(ivSs4, object2);
                        break block13;
                    }
                    SmjV.JW(ivSs3, object2);
                    SmjV.JW(ivSs2, object2);
                }
            }
            ++n3;
        }
        Object object4 = SmjV.JW(SmjV.JW((TNku)o.a(this, -1491248963)));
        while (object4.hasNext()) {
            object2 = (OPWR)object4.next();
            n2 = 0;
            object = SmjV.JW(SmjV.JW(object2));
            while (object.hasNext()) {
                entityType2 = (EntityType)object.next();
                n2 += SmjV.JW(ivSs3, entityType2);
            }
            if (n2 <= SmjV.JW((Integer)SmjV.JW((TNku)o.a(this, -1491248963), object2))) continue;
            SmjV.JW(tNku, object2, SmjV.JW(n2 - SmjV.JW((Integer)SmjV.JW((TNku)o.a(this, -1491248963), object2))));
        }
        if (SmjV.JW(SmjV.JW(tNku)) != false) {
            return 0;
        }
        object2 = (OPWR)SmjV.JW(SmjV.JW(tNku));
        Object object5 = SmjV.JW((Integer)SmjV.JW(tNku, object2));
        n2 = 0;
        Object object6 = false;
        Object object7 = false;
        feCR feCR3 = SmjV.JW(SmjV.JW(object2));
        while (feCR3.hasNext()) {
            feCR2 = (EntityType)feCR3.next();
            n2 += SmjV.JW(ivSs2, feCR2);
        }
        Object object8 = n2 >= object5 ? object5 : (Object)n2;
        object6 = object8;
        object7 = object8 < object5 ? (Object)(object5 - object6) : 0;
        feCR2 = new feCR();
        feCR3 = new feCR();
        Object object9 = SmjV.JW(SmjV.JW(object2));
        while (object9.hasNext()) {
            entityType = (EntityType)object9.next();
            SmjV.JW(feCR2, SmjV.JW(ivSs2, entityType));
        }
        object9 = SmjV.JW(SmjV.JW(object2));
        while (object9.hasNext()) {
            entityType = (EntityType)object9.next();
            SmjV.JW(feCR3, SmjV.JW(ivSs4, entityType));
        }
        object7 = SmjV.JW(feCR3) < object7 ? (Object)SmjV.JW(feCR3) : object7;
        object6 = SmjV.JW(feCR2) < object6 ? SmjV.JW(feCR2) : object6;
        int n4 = 0;
        while (n4 < object6) {
            SmjV.JW((Entity)SmjV.JW(feCR2));
            ++n;
            ++n4;
        }
        n4 = 0;
        while (n4 < object7) {
            SmjV.JW((Entity)SmjV.JW(feCR3));
            ++n;
            ++n4;
        }
        return n;
    }

    private static Object JW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

