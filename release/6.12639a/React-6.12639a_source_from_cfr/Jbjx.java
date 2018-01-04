/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.UUID;
import org.bukkit.entity.Player;

public class Jbjx
implements hHjO {
    @SvcY
    public static TNku<Integer, String> cKKR;
    @skNB(value=-175)
    public boolean monitoring = false;
    @skNB(value=-172)
    public boolean DYbo = false;
    @skNB(value=164)
    public boolean bijP = false;
    @skNB(value=234)
    public boolean paqR = false;
    @skNB(value=-885)
    public int xiiW = -1;
    @skNB(value=343)
    public int UJSK = 0;
    @skNB(value=765)
    public boolean bGgH = false;
    @skNB(value=-112)
    public int FWXs = 0;
    @skNB(value=-694)
    public int twPF = 0;
    @skNB(value=492)
    public int KVHP = 0;
    @skNB(value=117)
    public boolean ghWw = false;
    @skNB(value=-592)
    public int xYGl = 0;
    @skNB(value=841)
    public double MvAH = 0.0;
    @skNB(value=-413)
    public boolean MmPC = false;
    private Player XlkH;

    static {
        TNku tNku = new TNku();
        o.w(-1421261374, tNku);
        Jbjx.AU(tNku, Jbjx.AU(-175), (String)o.k(-1208465983));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(-172), (String)o.k(-519551552));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(234), (String)o.k(687293887));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(-885), (String)o.k(-1031715394));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(343), (String)o.k(-1872149059));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(765), (String)o.k(-1835186756));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(-112), (String)o.k(-1599781445));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(-694), (String)o.k(497697866));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(492), (String)o.k(1209484361));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(117), (String)o.k(-1995815864));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(-592), (String)o.k(584926279));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(841), (String)o.k(2140357702));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(-413), (String)o.k(580666437));
        Jbjx.AU((TNku)o.k(-1421261374), Jbjx.AU(164), (String)o.k(1864188996));
    }

    public Jbjx(Player player) {
        this.XlkH = player;
        this.load();
    }

    public void save() {
        try {
            Jbjx.AU(new ncmw(), this, new File((File)Jbjx.AU((String)o.k(-1397668797)), (String)Jbjx.AU(Jbjx.AU(new StringBuilder((String)Jbjx.AU(Jbjx.AU(((Player)o.a(this, 2105627185)).getUniqueId()))), (String)o.k(-195997137)))));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            Jbjx.AU(exception);
            return;
        }
    }

    public void load() {
        try {
            Jbjx.AU(new EShD(), this, new File((File)Jbjx.AU((String)o.k(-1397668797)), (String)Jbjx.AU(Jbjx.AU(new StringBuilder((String)Jbjx.AU(Jbjx.AU(((Player)o.a(this, 2105627185)).getUniqueId()))), (String)o.k(-195997137)))));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            Jbjx.AU(exception);
            return;
        }
    }

    public boolean TOGS() {
        return (Boolean)o.a(this, 2085966379);
    }

    public boolean TFUi() {
        return (Boolean)o.a(this, -991079878);
    }

    public Player nJPf() {
        return (Player)o.a(this, 2105627185);
    }

    public void UtIU(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, 2085966379, bl);
    }

    public void biLo(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -991079878, bl);
    }

    public int miQG() {
        return (Integer)o.a(this, 2097238583);
    }

    public void biLo(int n) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, 2097238583, n);
    }

    public int baAO() {
        return (Integer)o.a(this, -1792912842);
    }

    public void VwLY(int n) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -1792912842, n);
    }

    public boolean Jbjx() {
        return (Boolean)o.a(this, -207859147);
    }

    public void VwLY(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -207859147, bl);
    }

    public boolean ktLW() {
        return (Boolean)o.a(this, -207859147);
    }

    public void TEqA(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -207859147, bl);
    }

    public int XIpm() {
        return (Integer)o.a(this, 1973703220);
    }

    public void TEqA(int n) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, 1973703220, n);
    }

    public int jEtO() {
        return (Integer)o.a(this, -292531661);
    }

    public void KTiK(int n) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -292531661, n);
    }

    public void UtIU(Player player) {
        o.v(this, 2105627185, (Object)player);
    }

    public double Rjca() {
        return (Double)o.a(this, -1425911262);
    }

    public void yJLS(double d) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -1425911262, d);
    }

    public boolean biRJ() {
        return (Boolean)o.a(this, 1901023777);
    }

    public void KTiK(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, 1901023777, bl);
    }

    public int jVtl() {
        return (Integer)o.a(this, -272281056);
    }

    public void GPlk(int n) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -272281056, n);
    }

    public boolean bqai() {
        return (Boolean)o.a(this, 341529119);
    }

    public void GPlk(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, 341529119, bl);
    }

    public int AFmj() {
        return (Integer)o.a(this, 1303859742);
    }

    public void ktHX(int n) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, 1303859742, n);
    }

    public boolean yuDM() {
        return (Boolean)o.a(this, -39497187);
    }

    public void ktHX(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -39497187, bl);
    }

    public boolean UtLV() {
        return (Boolean)o.a(this, -1667149284);
    }

    public void HeSD(boolean bl) {
        Jbjx.AU((JkaV)o.a((TEqA)o.k(911295720), 1104499257), this.nJPf(), false);
        o.v(this, -1667149284, bl);
    }

    private static Object AU(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

