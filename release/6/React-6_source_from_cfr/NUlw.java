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

public class NUlw {
    private String title;
    private String FqPw;
    private String action;
    private Integer mHLW;
    private Integer vJUc;
    private Integer DPxE;

    public NUlw() {
        this.mHLW = NUlw.rg(false);
        this.vJUc = NUlw.rg(false);
        this.DPxE = NUlw.rg(5);
    }

    public NUlw(String string, String string2, String string3, Integer n, Integer n2, Integer n3) {
        this.title = string;
        this.FqPw = string2;
        this.action = string3;
        this.mHLW = n;
        this.vJUc = n2;
        this.DPxE = n3;
    }

    public NUlw(String string, String string2, Integer n, Integer n2, Integer n3) {
        this.title = string;
        this.FqPw = string2;
        this.mHLW = n;
        this.vJUc = n2;
        this.DPxE = n3;
    }

    public NUlw(String string, Integer n, Integer n2, Integer n3) {
        this.action = string;
        this.mHLW = n;
        this.vJUc = n2;
        this.DPxE = n3;
    }

    public void rwyd(Player player) {
        try {
            NUlw.rg(player, (Integer)cv.b(this, 1609430174), (Integer)cv.b(this, 345961625), (Integer)cv.b(this, 395637976), (String)cv.b(this, -734399269), (String)cv.b(this, 509736154));
            NUlw.rg(player, (String)cv.b(this, -2038827836));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            NUlw.rg(exception);
            return;
        }
    }

    public String getTitle() {
        return (String)cv.b(this, -734399269);
    }

    public void setTitle(String string) {
        cv.e(this, -734399269, string);
    }

    public String APKB() {
        return (String)cv.b(this, 509736154);
    }

    public void GsQl(String string) {
        cv.e(this, 509736154, string);
    }

    public String getAction() {
        return (String)cv.b(this, -2038827836);
    }

    public void setAction(String string) {
        cv.e(this, -2038827836, string);
    }

    public Integer kstv() {
        return (Integer)cv.b(this, 1609430174);
    }

    public void ssNb(Integer n) {
        cv.e(this, 1609430174, n);
    }

    public Integer uNna() {
        return (Integer)cv.b(this, 395637976);
    }

    public void DYFV(Integer n) {
        cv.e(this, 395637976, n);
    }

    public Integer loHn() {
        return (Integer)cv.b(this, 345961625);
    }

    public void IWSm(Integer n) {
        cv.e(this, 345961625, n);
    }

    private static Object rg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

