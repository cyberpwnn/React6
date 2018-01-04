/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;

public abstract class UtLV
implements GjaJ {
    private Class<?> agKj;
    private yuDM ejgE;
    private Lhwj<Object> cKOJ;
    private Lhwj<Object> oWBw;
    private static int HoFQ;

    static {
        o.w(1586385582, 0);
    }

    public UtLV(Class<?> class_, yuDM yuDM2) {
        this.agKj = class_;
        this.ejgE = yuDM2;
        this.cKOJ = new Lhwj();
        this.oWBw = new Lhwj();
    }

    @Override
    public yuDM NwfF() {
        return (yuDM)((Object)o.a(this, 1190679213));
    }

    @Override
    public Class<?> getType() {
        return (Class)o.a(this, -333557076);
    }

    @Override
    public boolean TEqA(Object object) {
        block3 : {
            block4 : {
                block2 : {
                    if (UtLV.AZ(this.NwfF(), (yuDM)((Object)o.k(679629488))) == false) break block2;
                    if (UtLV.AZ(this.GjaJ(), object) != false) break block3;
                }
                if (UtLV.AZ(this.NwfF(), (yuDM)((Object)o.k(1956463743))) == false) break block4;
                if (UtLV.AZ(this.GjaJ(), object) == false) break block3;
            }
            return false;
        }
        return true;
    }

    @Override
    public Lhwj<Object> GjaJ() {
        return (Lhwj)o.a(this, 966611641);
    }

    @Override
    public Lhwj<Object> IFSe() {
        return (Lhwj)o.a(this, -1680846152);
    }

    @Override
    public abstract int KTiK(CommandSender var1, String var2) throws JYyP;

    public static GjaJ GPlk(CommandSender commandSender, String string) throws JYyP {
        if (UtLV.AZ(string, FMkR$WjFM.a("\ub760")) == false) {
            throw new JYyP(FMkR$WjFM.a("\ub76d\u08b0\u3213\u8d23\u615b\u5310\u2ad1\uef3b\ue1cd\u99ea\ub5bc\u19f6\u0335\u6374\ua241\u5252\uaaf1\u427a\ue143\u7f63\u8aec\u043b\uccfe\u835d\ua633\uf556\uce2e\u3a16\ucf74\ua84b\ucd91\u4ec0\u8fde\ufbbe\u6122\uf322\u9e8f\uabd4\u59b6\uee3a\uefe8\uf426\u1a10\u7b60\uae1b\u3660\u5b33\u6c1f\u8964\ud96e\ue889\u3ff7"));
        }
        if (UtLV.AZ(string, FMkR$WjFM.a("\ub71a")) == false) {
            throw new JYyP(FMkR$WjFM.a("\ub76d\u08b0\u3213\u8d23\u615b\u5310\u2ad1\uef3b\ue1cd\u9990\ub5bc\u19f6\u0335\u6374\ua241\u5252\uaaf1\u427a\ue143\u7f63\u8aec\u043b\uccfe\u835d\ua633\uf556\uce2e\u3a16\ucf74\ua84b\ucd91\u4ec0\u8fde\ufbbe\u6122\uf322\u9e8f\uabd4\u59b6\uee3a\uefe8\uf426\u1a10\u7b60\uae1b\u3660\u5b33\u6c1f\u8964\ud96e\ue889\u3ff7"));
        }
        Object object = UtLV.AZ(((String[])UtLV.AZ(string, FMkR$WjFM.a("\ub71a")))[0], true);
        String string2 = ((String[])UtLV.AZ(string, FMkR$WjFM.a("\ub71a")))[1];
        UtLV utLV = null;
        if (UtLV.AZ(object, FMkR$WjFM.a("\ub743")) != false) {
            utLV = new Rapb();
        } else if (UtLV.AZ(object, FMkR$WjFM.a("\ub754")) != false) {
            utLV = new CgHM();
        } else if (UtLV.AZ(object, FMkR$WjFM.a("\ub745")) != false) {
            utLV = new JYxj((yuDM)((Object)o.k(679629488)));
        } else {
            throw new JYyP((String)UtLV.AZ(UtLV.AZ(UtLV.AZ(new StringBuilder(FMkR$WjFM.a("\ub769\u08b7\u3216\u8d31\u615e\u5317\u2ad2\uef3b\ue1a4\u99ef\ub5c7\u19ec\u0354\u633a")), object), FMkR$WjFM.a("\ub702"))));
        }
        o.w(1586385582, (Integer)o.k(1586385582) + utLV.KTiK(commandSender, string2));
        return utLV;
    }

    public static int pop() {
        int n = (Integer)o.k(1586385582);
        o.w(1586385582, 0);
        return n;
    }

    private static Object AZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

