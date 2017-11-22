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

public abstract class OPXm
implements EmKi {
    private Class<?> oxTu;
    private GHaL xOnL;
    private QyFw<Object> SCcW;
    private QyFw<Object> VoQC;
    private static int vlLH;

    public OPXm(Class<?> class_, GHaL gHaL) {
        this.oxTu = class_;
        this.xOnL = gHaL;
        this.SCcW = new QyFw();
        this.VoQC = new QyFw();
    }

    @Override
    public GHaL CoXE() {
        return (GHaL)((Object)cv.b(this, -1388244792));
    }

    @Override
    public Class<?> getType() {
        return (Class)cv.b(this, 173019339);
    }

    @Override
    public boolean OXeK(Object object) {
        block4 : {
            block3 : {
                block2 : {
                    if (OPXm.Un(this.CoXE(), (GHaL)((Object)cv.e(1867452617))) == false) break block2;
                    if (OPXm.Un(this.ftyu(), object) != false) break block3;
                }
                if (OPXm.Un(this.CoXE(), (GHaL)((Object)cv.e(1197936249))) == false) break block4;
                if (OPXm.Un(this.ftyu(), object) != false) break block4;
            }
            return true;
        }
        return false;
    }

    @Override
    public QyFw<Object> ftyu() {
        return (QyFw)cv.b(this, 112595124);
    }

    @Override
    public QyFw<Object> mXMK() {
        return (QyFw)cv.b(this, 1256591543);
    }

    @Override
    public abstract int jhSt(CommandSender var1, String var2) throws kYwm;

    public static EmKi BkpW(CommandSender commandSender, String string) throws kYwm {
        if (OPXm.Un(string, YEBy$TyVf.W("\u8f1e")) == false) {
            throw new kYwm(YEBy$TyVf.W("\u8f13\u3b8e\u20b6\ufa5e\u6bc4\u7b94\u89bd\u7082\uf645\u8494\ue4a0\udf48\u38ff\ua8bc\uedef\u4c55\u877e\u0b8b\ued59\u4e04\u93eb\u8f49\u03a4\ueadb\u7a33\u2b47\u479d\u4bb2\ud116\u84af\u841a\u0918\ua34d\uc2a1\u9d93\uf155\ua9f5\u339a\u218d\u1eda\u7ec1\ufc72\u1377\u2f01\ub40d\u5591\u0df4\uf315\u4cfa\u4f1d\ue7b0\u51cb"));
        }
        if (OPXm.Un(string, YEBy$TyVf.W("\u8f64")) == false) {
            throw new kYwm(YEBy$TyVf.W("\u8f13\u3b8e\u20b6\ufa5e\u6bc4\u7b94\u89bd\u7082\uf645\u84ee\ue4a0\udf48\u38ff\ua8bc\uedef\u4c55\u877e\u0b8b\ued59\u4e04\u93eb\u8f49\u03a4\ueadb\u7a33\u2b47\u479d\u4bb2\ud116\u84af\u841a\u0918\ua34d\uc2a1\u9d93\uf155\ua9f5\u339a\u218d\u1eda\u7ec1\ufc72\u1377\u2f01\ub40d\u5591\u0df4\uf315\u4cfa\u4f1d\ue7b0\u51cb"));
        }
        Object object = OPXm.Un(((String[])OPXm.Un(string, YEBy$TyVf.W("\u8f64")))[0], true);
        String string2 = ((String[])OPXm.Un(string, YEBy$TyVf.W("\u8f64")))[1];
        OPXm oPXm = null;
        if (OPXm.Un(object, YEBy$TyVf.W("\u8f3d")) != false) {
            oPXm = new jyXs();
        } else if (OPXm.Un(object, YEBy$TyVf.W("\u8f2a")) != false) {
            oPXm = new uWVB();
        } else if (OPXm.Un(object, YEBy$TyVf.W("\u8f3b")) != false) {
            oPXm = new sapB((GHaL)((Object)cv.e(1867452617)));
        } else {
            throw new kYwm((String)OPXm.Un(OPXm.Un(OPXm.Un(new StringBuilder(YEBy$TyVf.W("\u8f17\u3b89\u20b3\ufa4c\u6bc1\u7b93\u89be\u7082\uf62c\u8491\ue4db\udf52\u389e\ua8f2")), object), YEBy$TyVf.W("\u8f7c"))));
        }
        cv.V(214110387, (Integer)cv.e(214110387) + oPXm.jhSt(commandSender, string2));
        return oPXm;
    }

    public static int pop() {
        int n = (Integer)cv.e(214110387);
        cv.V(214110387, 0);
        return n;
    }

    static {
        cv.V(214110387, 0);
    }

    private static Object Un(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

