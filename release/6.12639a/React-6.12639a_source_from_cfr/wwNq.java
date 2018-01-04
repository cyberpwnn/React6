/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.World
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import org.bukkit.Chunk;
import org.bukkit.World;

public class wwNq
extends ggmf {
    private static int SDTo;
    private TNku<WOYg, jNbl> JSLk;
    public TNku<Integer, nBGQ<WOYg, xynF, feCR<GjaJ>>> uGVa;
    public feCR<String> UtnT;

    static {
        o.w(-1086957403, 0);
    }

    @Override
    public void start() {
        o.v(this, -701867868, new feCR());
        o.v(this, 1594841251, new TNku());
        o.v(this, -1543022446, new TNku());
        Object object = wwNq.yV((feCR)wwNq.yV((TNku)o.k(278287122), wwNq.yV(true)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                this.yJLS((jNbl)wwNq.yV(wwNq.yV(class_, new Class[0]), new Object[0]));
            }
            catch (InstantiationException instantiationException) {
                InstantiationException instantiationException2 = instantiationException;
                wwNq.yV(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                wwNq.yV(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                wwNq.yV(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                InvocationTargetException invocationTargetException2 = invocationTargetException;
                wwNq.yV(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
                wwNq.yV(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                SecurityException securityException2 = securityException;
                wwNq.yV(securityException);
            }
        }
    }

    public /* varargs */ void yJLS(WOYg wOYg, xynF xynF2, GjaJ ... arrgjaJ) {
        int n = (Integer)o.k(-1086957403);
        o.w(-1086957403, n + 1);
        wwNq.yV((TNku)o.a(this, 1594841251), wwNq.yV(n), new nBGQ<WOYg, xynF, feCR<GjaJ>>(wOYg, xynF2, new feCR<GjaJ>(arrgjaJ)));
    }

    private /* varargs */ boolean UtIU(WOYg wOYg, xynF xynF2, GjaJ ... arrgjaJ) throws dfaE {
        jNbl jNbl2 = this.yJLS(wOYg);
        boolean bl = false;
        if (wwNq.yV(jNbl2.qcvH(), (ooQj)((Object)o.k(-2068033710))) != false) {
            try {
                int n = 0;
                GjaJ[] arrgjaJ2 = arrgjaJ;
                int n2 = arrgjaJ2.length;
                int n3 = 0;
                while (n3 < n2) {
                    GjaJ gjaJ = arrgjaJ2[n3];
                    if (wwNq.yV(gjaJ.getType(), Chunk.class) != false) {
                        Rapb rapb = (Rapb)gjaJ;
                        Object object = wwNq.yV(new feCR(wwNq.yV(rapb)));
                        while (object.hasNext()) {
                            Object e = object.next();
                            Chunk chunk = (Chunk)e;
                            if (((Boolean)o.a(wwNq.yV(chunk.getWorld()), 1208173758)).booleanValue()) continue;
                            ++n;
                            wwNq.yV(wwNq.yV(rapb), chunk);
                        }
                        if (wwNq.yV(gjaJ.IFSe()) != false) {
                            xynF2.VwLY(nJPf$sILv.G("\uda61\ue656\u5a67\uc7f8\uf1c9\ue7e8\u8da7\u6e42\u81d9\ub8ce\u712b\ub34b\u07ef\u189e\u2141\ueb1d\ub7d9\ufe5c\ufbd6\u53c2\u9d87\u53d2\ua602\ue4f4\u43d4\u7854\ubefa\u4342\uce68\u7894\u50b7\uf58e\u0a4e\u3806"));
                            throw new dfaE();
                        }
                    }
                    ++n3;
                }
                if (n > 0) {
                    xynF2.TEqA((String)wwNq.yV(wwNq.yV(wwNq.yV(new StringBuilder(nJPf$sILv.G("\uda72\ue650\u5a7e\uc7fe\uf1d0\ue7e3\u8de3\u6e04")), n), nJPf$sILv.G("\uda00\ue656\u5a7b\uc7e4\uf1c8\ue7ed\u8daf\u6e57\u8191\ub887\u7121\ub35c\u07e4\u18dd\u2141\ueb20\ub7d3\ufe10\ufbd0\u53c9\u9d86\u53d5\ua606\ue4e9\u43d4\u780f\ubefd\u4342\uce62\u7894\u50a8\uf58e\u0a4e\u3801"))));
                }
                jNbl2.UtIU(xynF2, arrgjaJ);
            }
            catch (uVol uVol2) {
                bl = true;
            }
        } else {
            bl = true;
        }
        if (bl) {
            return false;
        }
        return true;
    }

    public jNbl yJLS(WOYg wOYg) {
        return (jNbl)wwNq.yV((TNku)o.a(this, -1543022446), wOYg);
    }

    public void yJLS(jNbl jNbl2) {
        wwNq.yV((TNku)o.a(this, -1543022446), jNbl2.Mkpo(), jNbl2);
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
        Object object;
        Object object2;
        TNku tNku = new TNku();
        TNku tNku2 = new TNku();
        Object object3 = wwNq.yV(wwNq.yV((TNku)o.a(this, 1594841251)));
        while (object3.hasNext()) {
            object2 = wwNq.yV((Integer)object3.next());
            nBGQ nBGQ2 = (nBGQ)wwNq.yV((TNku)o.a(this, 1594841251), wwNq.yV(object2));
            object = this.yJLS((WOYg)((Object)wwNq.yV(nBGQ2)));
            xynF xynF2 = (xynF)wwNq.yV(nBGQ2);
            GjaJ[] arrgjaJ = (GjaJ[])((Object[])wwNq.yV((feCR)wwNq.yV(nBGQ2), new GjaJ[wwNq.yV((feCR)wwNq.yV(nBGQ2))]));
            Object object4 = wwNq.yV(object.qcvH(), (ooQj)((Object)o.k(-2068033710)));
            try {
                boolean bl;
                boolean bl2 = object4 != false ? this.UtIU((WOYg)((Object)wwNq.yV(nBGQ2)), xynF2, arrgjaJ) : (bl = false);
                if (bl2) {
                    wwNq.yV((TNku)o.a(this, 1594841251), wwNq.yV(object2));
                }
                if (wwNq.yV(tNku, wwNq.yV(nBGQ2)) == false) {
                    wwNq.yV(tNku, (WOYg)((Object)wwNq.yV(nBGQ2)), wwNq.yV(false));
                }
                wwNq.yV(tNku, (WOYg)((Object)wwNq.yV(nBGQ2)), wwNq.yV(wwNq.yV((Integer)wwNq.yV(tNku, wwNq.yV(nBGQ2))) + true));
            }
            catch (dfaE dfaE2) {
                wwNq.yV((TNku)o.a(this, 1594841251), wwNq.yV(object2));
            }
        }
        object = (WOYg[])wwNq.yV();
        int n = object.length;
        int n2 = 0;
        while (n2 < n) {
            object2 = object[n2];
            try {
                if (wwNq.yV(this.yJLS((WOYg)((Object)object2)).qcvH(), (ooQj)((Object)o.k(1731151092))) != false) {
                    if (wwNq.yV(tNku, object2) == false) {
                        wwNq.yV(tNku, object2, wwNq.yV(false));
                    }
                    wwNq.yV(tNku, object2, wwNq.yV(wwNq.yV((Integer)wwNq.yV(tNku, object2)) + true));
                    wwNq.yV(tNku2, object2, this.yJLS((WOYg)((Object)object2)).getStatus());
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++n2;
        }
        wwNq.yV((feCR)o.a(this, -701867868));
        Object object5 = wwNq.yV(wwNq.yV(tNku));
        while (object5.hasNext()) {
            object2 = (WOYg)((Object)object5.next());
            Object object6 = wwNq.yV((Integer)wwNq.yV(tNku, object2)) > true ? wwNq.yV(wwNq.yV(wwNq.yV(new StringBuilder(), wwNq.yV(tNku, object2)), nJPf$sILv.G("\u3078\u8201"))) : "";
            object6 = wwNq.yV(this.yJLS((WOYg)((Object)object2)).qcvH(), (ooQj)((Object)o.k(1731151092))) != false ? wwNq.yV(wwNq.yV(new StringBuilder((String)wwNq.yV(object6)), this.yJLS((WOYg)((Object)object2)).getStatus())) : wwNq.yV(wwNq.yV(new StringBuilder((String)wwNq.yV(object6)), wwNq.yV(object2)));
            wwNq.yV((feCR)o.a(this, -701867868), object6);
        }
    }

    public feCR<jNbl> NLvB() {
        return wwNq.yV((TNku)o.a(this, -1543022446));
    }

    public feCR<String> UcMX() {
        feCR<String> feCR2 = new feCR<String>();
        Object object = wwNq.yV(this.NLvB());
        while (object.hasNext()) {
            jNbl jNbl2 = (jNbl)object.next();
            wwNq.yV(feCR2, jNbl2.getName());
        }
        return feCR2;
    }

    private static Object yV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

