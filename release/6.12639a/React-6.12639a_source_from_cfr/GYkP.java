/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class GYkP {
    private static final int MSnJ = 200;
    private boolean HLoU = false;
    protected char wfxC = 105;
    private final vbpi[] QGId = new vbpi[200];
    private int top = 0;
    protected Writer writer;

    public GYkP(Writer writer) {
        this.writer = writer;
    }

    private GYkP OPWR(String string) throws gggG {
        if (string == null) {
            throw new gggG(FMkR$WjFM.a("\u2c9e\ue77a\ua59d\ub3ca\u41ea\u279f\u8376\uac60\u6e31\udbf0\u4228\ub87f"));
        }
        if (((Character)o.a(this, 475938888)).charValue() == 'o' || ((Character)o.a(this, 475938888)).charValue() == 'a') {
            try {
                if (((Boolean)o.a(this, -2094579641)).booleanValue() && ((Character)o.a(this, 475938888)).charValue() == 'a') {
                    GYkP.OU((Writer)o.a(this, -1810284474), 44);
                }
                GYkP.OU((Writer)o.a(this, -1810284474), string);
            }
            catch (IOException iOException) {
                throw new gggG(iOException);
            }
            if (((Character)o.a(this, 475938888)).charValue() == 'o') {
                o.v(this, 475938888, Character.valueOf('k'));
            }
            o.v(this, -2094579641, true);
            return this;
        }
        throw new gggG(FMkR$WjFM.a("\u2c86\ue76e\ua59d\ub3d3\u41af\u27cf\u8376\uac7c\u6e2b\udba4\u4222\ub86b\u9c4f\u1735\u462a\ufd45\u1262\ufb81\ue761\u5e9e\u327f\u32cc"));
    }

    public GYkP rxke() throws gggG {
        if (((Character)o.a(this, 475938888)).charValue() == 'i' || ((Character)o.a(this, 475938888)).charValue() == 'o' || ((Character)o.a(this, 475938888)).charValue() == 'a') {
            this.VwLY(null);
            this.OPWR(FMkR$WjFM.a("\ubd20"));
            o.v(this, -2094579641, false);
            return this;
        }
        throw new gggG(FMkR$WjFM.a("\ubd36\uff19\u49ee\u25fa\ud743\u701f\u4f2b\u2d24\u1318\u0ab9\uc476\u8abe\u6e14\u2657\ue216\u5790"));
    }

    private GYkP yJLS(char c, char c2) throws gggG {
        if (((Character)o.a(this, 475938888)).charValue() != c) {
            throw new gggG(c == 'a' ? nJPf$sILv.G("\u6a3b\u12cf\u2d6c\ua499\ufadf\u2170\u703e\u2b34\ueb14\u7e50\u4ffe\u8ee9\u49fe\u4ac6\u1d16\uc1e5\u9be3\u0016\u7478") : nJPf$sILv.G("\u6a3b\u12cf\u2d6c\ua499\ufadf\u2170\u703e\u2b34\ueb14\u7e50\u4ffe\u8ee9\u49fe\u4ac8\u1d06\uc1fd\u9be7\f\u7422\u0505"));
        }
        this.KTiK(c);
        try {
            GYkP.OU((Writer)o.a(this, -1810284474), c2);
        }
        catch (IOException iOException) {
            throw new gggG(iOException);
        }
        o.v(this, -2094579641, true);
        return this;
    }

    public GYkP jOQr() throws gggG {
        return this.yJLS('a', ']');
    }

    public GYkP ktXW() throws gggG {
        return this.yJLS('k', '}');
    }

    public GYkP ivSs(String string) throws gggG {
        if (string == null) {
            throw new gggG(nJPf$sILv.G("\u4802\u43c6\u5ada\u64fa\u4623\u580e\ua1a9\u6d94\ua374"));
        }
        if (((Character)o.a(this, 475938888)).charValue() == 'k') {
            try {
                GYkP.OU(((vbpi[])o.a(this, -220643259))[(Integer)o.a(this, -694861756) - 1], string, (Boolean)o.k(-316456551));
                if (((Boolean)o.a(this, -2094579641)).booleanValue()) {
                    GYkP.OU((Writer)o.a(this, -1810284474), 44);
                }
                GYkP.OU((Writer)o.a(this, -1810284474), GYkP.OU(string));
                GYkP.OU((Writer)o.a(this, -1810284474), 58);
                o.v(this, -2094579641, false);
                o.v(this, 475938888, Character.valueOf('o'));
                return this;
            }
            catch (IOException iOException) {
                throw new gggG(iOException);
            }
        }
        throw new gggG(nJPf$sILv.G("\u4801\u43da\u5ac5\u64e6\u466f\u5804\ua1af\u6d88\ua33e\u729e\ubb2d\ucc50\u485e\u88e5"));
    }

    public GYkP MAmw() throws gggG {
        if (((Character)o.a(this, 475938888)).charValue() == 'i') {
            o.v(this, 475938888, Character.valueOf('o'));
        }
        if (((Character)o.a(this, 475938888)).charValue() == 'o' || ((Character)o.a(this, 475938888)).charValue() == 'a') {
            this.OPWR(nJPf$sILv.G("\u47ee"));
            this.VwLY(new vbpi());
            o.v(this, -2094579641, false);
            return this;
        }
        throw new gggG(nJPf$sILv.G("\u47d8\ub971\ue8b4\u64a5\u0826\ue099\u8d37\u2425\u8994\u4226\u0a46\u52c9\uab67\u5b4f\ub916\u302c\ue785"));
    }

    private void KTiK(char c) throws gggG {
        if ((Integer)o.a(this, -694861756) <= 0) {
            throw new gggG(FMkR$WjFM.a("\ufed3\u8d70\ub8d5\u27b7\u3852\u7605\ud027\u498c\u2be3\uba2a\ueee7\u5ced\u4c7c\uefb9"));
        }
        char c2 = ((vbpi[])o.a(this, -220643259))[(Integer)o.a(this, -694861756) - 1] == null ? 'a' : 'k';
        if (c2 != c) {
            throw new gggG(FMkR$WjFM.a("\ufed3\u8d70\ub8d5\u27b7\u3852\u7605\ud027\u498c\u2be3\uba2a\ueee7\u5ced\u4c7c\uefb9"));
        }
        GYkP gYkP = this;
        o.v(gYkP, -694861756, (Integer)o.a(gYkP, -694861756) - 1);
        o.v(this, 475938888, Character.valueOf((char)((Integer)o.a(this, -694861756) == 0 ? 100 : (((vbpi[])o.a(this, -220643259))[(Integer)o.a(this, -694861756) - 1] == null ? 97 : 107))));
    }

    private void VwLY(vbpi vbpi2) throws gggG {
        if ((Integer)o.a(this, -694861756) >= 200) {
            throw new gggG(mrFx$WjFM.d("\ubde8\uc7ef\u8ed7\u8099\ud437\u1ab3\u7bd1\uc497\ue665\ue3d4\ua5ae\u68a9\ue932\u81d9\u5390\u3073\u167b"));
        }
        ((vbpi[])o.a((Object)this, (int)-220643259))[((Integer)o.a((Object)this, (int)-694861756)).intValue()] = vbpi2;
        o.v(this, 475938888, Character.valueOf(vbpi2 == null ? 'a' : 'k'));
        GYkP gYkP = this;
        o.v(gYkP, -694861756, (Integer)o.a(gYkP, -694861756) + 1);
    }

    public GYkP CoVI(boolean bl) throws gggG {
        return this.OPWR(bl ? nJPf$sILv.G("\uc564\ubb2f\uf719\u07cc") : nJPf$sILv.G("\uc576\ubb3c\uf700\u07da\uc9d5"));
    }

    public GYkP ooQj(double d) throws gggG {
        return this.sQJh(new Double(d));
    }

    public GYkP ooQj(long l) throws gggG {
        return this.OPWR((String)GYkP.OU(l));
    }

    public GYkP sQJh(Object object) throws gggG {
        return this.OPWR((String)GYkP.OU(object));
    }

    private static Object OU(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

