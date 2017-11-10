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

public class HBur {
    private String title;
    private String EnFj;
    private String action;
    private Integer gqHA;
    private Integer ivle;
    private Integer yBVM;

    public HBur() {
        this.gqHA = HBur.Pa(false);
        this.ivle = HBur.Pa(false);
        this.yBVM = HBur.Pa(5);
    }

    public HBur(String string, String string2, String string3, Integer n, Integer n2, Integer n3) {
        this.title = string;
        this.EnFj = string2;
        this.action = string3;
        this.gqHA = n;
        this.ivle = n2;
        this.yBVM = n3;
    }

    public HBur(String string, String string2, Integer n, Integer n2, Integer n3) {
        this.title = string;
        this.EnFj = string2;
        this.gqHA = n;
        this.ivle = n2;
        this.yBVM = n3;
    }

    public HBur(String string, Integer n, Integer n2, Integer n3) {
        this.action = string;
        this.gqHA = n;
        this.ivle = n2;
        this.yBVM = n3;
    }

    public void Fomb(Player player) {
        try {
            HBur.Pa(player, (Integer)yy.h(this, -1289222566), (Integer)yy.h(this, -1894775217), (Integer)yy.h(this, -616495536), (String)yy.h(this, 2083718693), (String)yy.h(this, -1495005666));
            HBur.Pa(player, (String)yy.h(this, -1419966940));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            HBur.Pa(exception);
            return;
        }
    }

    public String getTitle() {
        return (String)yy.h(this, 2083718693);
    }

    public void setTitle(String string) {
        yy.E(this, 2083718693, string);
    }

    public String AWvK() {
        return (String)yy.h(this, -1495005666);
    }

    public void lUIx(String string) {
        yy.E(this, -1495005666, string);
    }

    public String getAction() {
        return (String)yy.h(this, -1419966940);
    }

    public void setAction(String string) {
        yy.E(this, -1419966940, string);
    }

    public Integer tSwX() {
        return (Integer)yy.h(this, -1289222566);
    }

    public void mXJp(Integer n) {
        yy.E(this, -1289222566, n);
    }

    public Integer JlDW() {
        return (Integer)yy.h(this, -616495536);
    }

    public void ksfs(Integer n) {
        yy.E(this, -616495536, n);
    }

    public Integer ydHl() {
        return (Integer)yy.h(this, -1894775217);
    }

    public void yJLL(Integer n) {
        yy.E(this, -1894775217, n);
    }

    private static Object Pa(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

