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
import java.lang.reflect.Method;
import java.util.Set;
import org.bukkit.Chunk;
import org.bukkit.World;

public abstract class IFQY
implements jNbl {
    private String name;
    private String description;
    private String GYte;
    private String[] uGGj;
    private sQJh ColC;
    private ooQj UJLY;
    private IpeM BKFT;
    private WOYg XRsy;
    private xynF dMfa;
    private double XKDx;
    private TNku<Class<?>, nceQ<GjaJ>> FNbH;

    public IFQY(WOYg wOYg) {
        this((String)IFQY.ym(wOYg), (String)IFQY.ym(wOYg), (sQJh)((Object)IFQY.ym(wOYg)), (IpeM)((Object)IFQY.ym(wOYg)), wOYg);
    }

    public IFQY(String string, String string2, sQJh sQJh2, IpeM ipeM, WOYg wOYg) {
        this.name = string;
        this.description = string2;
        this.ColC = sQJh2;
        this.GYte = "";
        this.XKDx = 0.0;
        this.UJLY = (ooQj)((Object)o.k(-2068033710));
        this.BKFT = ipeM;
        this.XRsy = wOYg;
        this.FNbH = new TNku();
        this.dMfa = null;
        this.uGGj = new String[0];
    }

    @Override
    public /* varargs */ GjaJ[] yJLS(GjaJ ... arrgjaJ) {
        feCR<GjaJ> feCR2 = new feCR<GjaJ>(arrgjaJ);
        Object object = IFQY.ym(IFQY.ym(this.CoVI()));
        block0 : while (object.hasNext()) {
            Class class_ = (Class)object.next();
            GjaJ[] arrgjaJ2 = arrgjaJ;
            int n = arrgjaJ2.length;
            int n2 = 0;
            while (n2 < n) {
                GjaJ gjaJ = arrgjaJ2[n2];
                if (IFQY.ym(gjaJ.getType(), class_) != false) continue block0;
                ++n2;
            }
            IFQY.ym(feCR2, (GjaJ)((nceQ)IFQY.ym(this.CoVI(), class_)).get());
        }
        return (GjaJ[])((Object[])IFQY.ym(feCR2, new GjaJ[IFQY.ym(feCR2)]));
    }

    @Override
    public void yJLS(Class<?> class_, nceQ<GjaJ> nceQ2) {
        IFQY.ym((TNku)o.a(this, 1636454219), class_, nceQ2);
    }

    @Override
    public String getName() {
        return (String)o.a(this, -990359719);
    }

    @Override
    public String getDescription() {
        return (String)o.a(this, 664883032);
    }

    @Override
    public sQJh Ipep() {
        return (sQJh)((Object)o.a(this, -1267970217));
    }

    @Override
    public ooQj qcvH() {
        return (ooQj)((Object)o.a(this, 1078546262));
    }

    @Override
    public String getStatus() {
        return (String)o.a(this, 534400853);
    }

    @Override
    public void yJLS(String string) {
        o.v(this, 534400853, string);
    }

    @Override
    public double getProgress() {
        return (Double)o.a(this, -79933612);
    }

    @Override
    public void setProgress(double d) {
        o.v(this, -79933612, d);
    }

    @Override
    public IpeM UQfI() {
        return (IpeM)((Object)o.a(this, 915558227));
    }

    @Override
    public WOYg Mkpo() {
        return (WOYg)((Object)o.a(this, 1553286338));
    }

    @Override
    public TNku<Class<?>, nceQ<GjaJ>> CoVI() {
        return (TNku)o.a(this, 1636454219);
    }

    @Override
    public /* varargs */ void UtIU(xynF xynF2, GjaJ ... arrgjaJ) throws uVol {
        if (IFQY.ym(this.qcvH(), (ooQj)((Object)o.k(1731151092))) != false) {
            throw new uVol();
        }
        o.v(this, 1078546262, (Object)((ooQj)((Object)o.k(1731151092))));
        o.v(this, -1667808063, xynF2);
        int n = 0;
        GjaJ[] arrgjaJ2 = this.yJLS(arrgjaJ);
        int n2 = arrgjaJ2.length;
        int n3 = 0;
        while (n3 < n2) {
            GjaJ gjaJ = arrgjaJ2[n3];
            if (IFQY.ym(gjaJ.getType(), Chunk.class) != false) {
                Rapb rapb = (Rapb)gjaJ;
                Object object = IFQY.ym(new feCR(IFQY.ym(rapb)));
                while (object.hasNext()) {
                    Object e = object.next();
                    Chunk chunk = (Chunk)e;
                    if (((Boolean)o.a(IFQY.ym(chunk.getWorld()), 1208173758)).booleanValue()) continue;
                    ++n;
                    IFQY.ym(IFQY.ym(rapb), chunk);
                }
                if (IFQY.ym(gjaJ.IFSe()) != false) {
                    xynF2.VwLY(FMkR$WjFM.a("\u65ad\u62ed\u04dd\ud7b9\u0d6f\u8b95\u86ec\u047c\u4402\u995c\ubbea\u771c\u2794\uf8b1\uc92e\u5aa2\uc1ff\ub46d\ud6ac\ua5d7\u2a01\uf65c\ubeb1\u4198\ud28e\u79e2\uc9b7\ub9f7\u6b9e\u9f57\u64b0\ufe2d\u46ae\u768d"));
                    this.wKtV();
                    return;
                }
            }
            ++n3;
        }
        if (n > 0) {
            xynF2.TEqA((String)IFQY.ym(IFQY.ym(IFQY.ym(new StringBuilder(FMkR$WjFM.a("\u65be\u62eb\u04c4\ud7bf\u0d76\u8b9e\u86a8\u043a")), n), FMkR$WjFM.a("\u65cc\u62ed\u04c1\ud7a5\u0d6e\u8b90\u86e4\u0469\u444a\u9915\ubbe0\u770b\u279f\uf8f2\uc92e\u5a9f\uc1f5\ub421\ud6aa\ua5dc\u2a00\uf65b\ubeb5\u4185\ud28e\u79b9\uc9b0\ub9f7\u6b94\u9f57\u64af\ufe2d\u46ae\u768a"))));
        }
        this.yJLS(xynF2, this.yJLS(arrgjaJ));
    }

    @Override
    public void wKtV() {
        o.v(this, 1078546262, (Object)((ooQj)((Object)o.k(-2068033710))));
    }

    @Override
    public xynF xykf() {
        return (xynF)o.a(this, -1667808063);
    }

    @Override
    public String[] IFQY() {
        return (String[])o.a(this, 342705339);
    }

    @Override
    public /* varargs */ void yJLS(String ... arrstring) {
        o.v(this, 342705339, arrstring);
    }

    @Override
    public /* varargs */ abstract void yJLS(xynF var1, GjaJ ... var2);

    private static Object ym(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

