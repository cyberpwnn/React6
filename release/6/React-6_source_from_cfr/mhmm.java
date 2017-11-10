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

public class mhmm {
    private static final int GapC = 200;
    private boolean vsgc = false;
    protected char erWK = 105;
    private final jhSC[] MIoJ = new jhSC[200];
    private int top = 0;
    protected Writer writer;

    public mhmm(Writer writer) {
        this.writer = writer;
    }

    private mhmm aKuV(String string) throws Bkpl {
        if (string == null) {
            throw new Bkpl(BkvY$LhxG.I("\ue197\u72df\u7908\u70aa\ud497\u47f7\uc93e\u1bdc\ufce7\u9e38\ucf2e\ud494"));
        }
        if (((Character)yy.h(this, -1429799080)).charValue() == 'o' || ((Character)yy.h(this, -1429799080)).charValue() == 'a') {
            try {
                if (((Boolean)yy.h(this, -2105213139)).booleanValue() && ((Character)yy.h(this, -1429799080)).charValue() == 'a') {
                    mhmm.ca((Writer)yy.h(this, -1176633562), 44);
                }
                mhmm.ca((Writer)yy.h(this, -1176633562), string);
            }
            catch (IOException iOException) {
                throw new Bkpl(iOException);
            }
            if (((Character)yy.h(this, -1429799080)).charValue() == 'o') {
                yy.E(this, -1429799080, Character.valueOf('k'));
            }
            yy.E(this, -2105213139, true);
            return this;
        }
        throw new Bkpl(BkvY$LhxG.I("\ue18f\u72cb\u7908\u70b3\ud4d2\u47a7\uc93e\u1bc0\ufcfd\u9e6c\ucf24\ud480\ua5d8\u1773\ucdfe\u5f85\u0c99\u8261\u70c9\ubeea\u3e1d\uc899"));
    }

    public mhmm YoUO() throws Bkpl {
        if (((Character)yy.h(this, -1429799080)).charValue() == 'i' || ((Character)yy.h(this, -1429799080)).charValue() == 'o' || ((Character)yy.h(this, -1429799080)).charValue() == 'a') {
            this.yJLL(null);
            this.aKuV(BkvY$LhxG.I("\u284f"));
            yy.E(this, -2105213139, false);
            return this;
        }
        throw new Bkpl(BkvY$LhxG.I("\u2859\u7bec\u9a01\u7eda\u81e5\ud168\u267b\u03fc\u737f\u43c6\ua1f6\u9f50\ub02f\udd59\u8576\u87c8"));
    }

    private mhmm mXJp(char c, char c2) throws Bkpl {
        if (((Character)yy.h(this, -1429799080)).charValue() != c) {
            throw new Bkpl(c == 'a' ? NVIs$JbpD.H("\uf349\u4932\u3a56\u4e73\u1a4f\u7008\u4db0\u4dd1\u5fa3\u5ce5\u1866\u5897\ua970\u370b\u2f4a\uea06\ucf89\ueb22\u6a56") : NVIs$JbpD.H("\uf349\u4932\u3a56\u4e73\u1a4f\u7008\u4db0\u4dd1\u5fa3\u5ce5\u1866\u5897\ua970\u3705\u2f5a\uea1e\ucf8d\ueb38\u6a0c\u506d"));
        }
        this.JRFt(c);
        try {
            mhmm.ca((Writer)yy.h(this, -1176633562), c2);
        }
        catch (IOException iOException) {
            throw new Bkpl(iOException);
        }
        yy.E(this, -2105213139, true);
        return this;
    }

    public mhmm kITa() throws Bkpl {
        return this.mXJp('a', ']');
    }

    public mhmm WWmD() throws Bkpl {
        return this.mXJp('k', '}');
    }

    public mhmm KDGY(String string) throws Bkpl {
        if (string == null) {
            throw new Bkpl(KDGY$JAHk.Y("\u352b\u5c20\u2a70\uc29e\u86db\u2fb2\uccc1\uf5a0\ueb36"));
        }
        if (((Character)yy.h(this, -1429799080)).charValue() == 'k') {
            try {
                mhmm.ca(((jhSC[])yy.h(this, 799342379))[(Integer)yy.h(this, -123273428) - 1], string, (Boolean)yy.p(-203750976));
                if (((Boolean)yy.h(this, -2105213139)).booleanValue()) {
                    mhmm.ca((Writer)yy.h(this, -1176633562), 44);
                }
                mhmm.ca((Writer)yy.h(this, -1176633562), mhmm.ca(string));
                mhmm.ca((Writer)yy.h(this, -1176633562), 58);
                yy.E(this, -2105213139, false);
                yy.E(this, -1429799080, Character.valueOf('o'));
                return this;
            }
            catch (IOException iOException) {
                throw new Bkpl(iOException);
            }
        }
        throw new Bkpl(KDGY$JAHk.Y("\u3528\u5c3c\u2a6f\uc282\u8697\u2fb8\uccc7\uf5bc\ueb7c\u5423\uf7cc\u640d\u56a0\u765b"));
    }

    public mhmm LFlN() throws Bkpl {
        if (((Character)yy.h(this, -1429799080)).charValue() == 'i') {
            yy.E(this, -1429799080, Character.valueOf('o'));
        }
        if (((Character)yy.h(this, -1429799080)).charValue() == 'o' || ((Character)yy.h(this, -1429799080)).charValue() == 'a') {
            this.aKuV(KDGY$JAHk.Y("\u7e93"));
            this.yJLL(new jhSC());
            yy.E(this, -2105213139, false);
            return this;
        }
        throw new Bkpl(KDGY$JAHk.Y("\u7ea5\ufe40\u684a\u7149\u99ed\ude46\u449c\u5406\u5dd8\ubf5a\u0557\u9d10\udb52\ue45e\u5cb9\u2d05\ub446"));
    }

    private void JRFt(char c) throws Bkpl {
        if ((Integer)yy.h(this, -123273428) <= 0) {
            throw new Bkpl(BkvY$LhxG.I("\u539e\u9e46\u6462\uda3e\u8f68\ud9b0\u8b56\ucd8e\u3c5a\u1fec\u56fc\u80fd\u917d\u253a"));
        }
        char c2 = ((jhSC[])yy.h(this, 799342379))[(Integer)yy.h(this, -123273428) - 1] == null ? 'a' : 'k';
        if (c2 != c) {
            throw new Bkpl(BkvY$LhxG.I("\u539e\u9e46\u6462\uda3e\u8f68\ud9b0\u8b56\ucd8e\u3c5a\u1fec\u56fc\u80fd\u917d\u253a"));
        }
        mhmm mhmm2 = this;
        yy.E(mhmm2, -123273428, (Integer)yy.h(mhmm2, -123273428) - 1);
        yy.E(this, -1429799080, Character.valueOf((char)((Integer)yy.h(this, -123273428) == 0 ? 100 : (((jhSC[])yy.h(this, 799342379))[(Integer)yy.h(this, -123273428) - 1] == null ? 97 : 107))));
    }

    private void yJLL(jhSC jhSC2) throws Bkpl {
        if ((Integer)yy.h(this, -123273428) >= 200) {
            throw new Bkpl(NVIs$JbpD.H("\ub20b\udd93\udecd\u0800\u261a\u719c\ucbbe\u67bf\u646f\ua2da\udfde\u80a0\u72bb\u965a\u7166\u6f2f\ub14a"));
        }
        ((jhSC[])yy.h((Object)this, (int)799342379))[((Integer)yy.h((Object)this, (int)-123273428)).intValue()] = jhSC2;
        yy.E(this, -1429799080, Character.valueOf(jhSC2 == null ? 'a' : 'k'));
        mhmm mhmm2 = this;
        yy.E(mhmm2, -123273428, (Integer)yy.h(mhmm2, -123273428) + 1);
    }

    public mhmm yJLL(boolean bl) throws Bkpl {
        return this.aKuV(bl ? BkvY$LhxG.I("\u8765\u7d79\ub2a6\u5fff") : BkvY$LhxG.I("\u8777\u7d6a\ub2bf\u5fe9\u16ff"));
    }

    public mhmm qAsQ(double d) throws Bkpl {
        return this.Ralc(new Double(d));
    }

    public mhmm yIkA(long l) throws Bkpl {
        return this.aKuV((String)mhmm.ca(l));
    }

    public mhmm Ralc(Object object) throws Bkpl {
        return this.aKuV((String)mhmm.ca(object));
    }

    private static Object ca(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

