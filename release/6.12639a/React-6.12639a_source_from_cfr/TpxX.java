/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;

public class TpxX {
    private String title;
    private String lpXQ;
    private String action;
    private Integer Qhxv;
    private Integer xIFW;
    private Integer UTDV;

    public TpxX() {
        this.Qhxv = TpxX.Em(false);
        this.xIFW = TpxX.Em(false);
        this.UTDV = TpxX.Em(5);
    }

    public TpxX(String string, String string2, String string3, Integer n, Integer n2, Integer n3) {
        this.title = string;
        this.lpXQ = string2;
        this.action = string3;
        this.Qhxv = n;
        this.xIFW = n2;
        this.UTDV = n3;
    }

    public TpxX(String string, String string2, Integer n, Integer n2, Integer n3) {
        this.title = string;
        this.lpXQ = string2;
        this.Qhxv = n;
        this.xIFW = n2;
        this.UTDV = n3;
    }

    public TpxX(String string, Integer n, Integer n2, Integer n3) {
        this.action = string;
        this.Qhxv = n;
        this.xIFW = n2;
        this.UTDV = n3;
    }

    public void bhlC(Player player) {
        try {
            TpxX.Em(player, (Integer)o.a(this, 1710574887), (Integer)o.a(this, -2133897946), (Integer)o.a(this, -2062987995), (String)o.a(this, -1535029980), (String)o.a(this, 1744915747));
            TpxX.Em(player, (String)o.a(this, 1844792593));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            TpxX.Em(exception);
            return;
        }
    }

    public String getTitle() {
        return (String)o.a(this, -1535029980);
    }

    public void setTitle(String string) {
        o.v(this, -1535029980, string);
    }

    public String iKuC() {
        return (String)o.a(this, 1744915747);
    }

    public void Kvlx(String string) {
        o.v(this, 1744915747, string);
    }

    public String getAction() {
        return (String)o.a(this, 1844792593);
    }

    public void setAction(String string) {
        o.v(this, 1844792593, string);
    }

    public Integer nuWa() {
        return (Integer)o.a(this, 1710574887);
    }

    public void biLo(Integer n) {
        o.v(this, 1710574887, n);
    }

    public Integer GYte() {
        return (Integer)o.a(this, -2062987995);
    }

    public void VwLY(Integer n) {
        o.v(this, -2062987995, n);
    }

    public Integer uGGj() {
        return (Integer)o.a(this, -2133897946);
    }

    public void TEqA(Integer n) {
        o.v(this, -2133897946, n);
    }

    private static Object Em(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

