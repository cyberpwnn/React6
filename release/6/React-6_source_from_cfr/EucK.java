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

public class EucK {
    private static final int lLri = 200;
    private boolean hQhU = false;
    protected char uGML = 105;
    private final vslr[] GcLY = new vslr[200];
    private int top = 0;
    protected Writer writer;

    public EucK(Writer writer) {
        this.writer = writer;
    }

    private EucK Smci(String string) throws TOKE {
        if (string == null) {
            throw new TOKE(YEBy$TyVf.W("\u90c8\u9a96\uccdf\u7034\ue8a9\ube48\udc04\u1c07\u3f02\u8ddc\u6c7a\ufa4e"));
        }
        if (((Character)cv.b(this, 1273297320)).charValue() == 'o' || ((Character)cv.b(this, 1273297320)).charValue() == 'a') {
            try {
                if (((Boolean)cv.b(this, 301463979)).booleanValue() && ((Character)cv.b(this, 1273297320)).charValue() == 'a') {
                    EucK.vg((Writer)cv.b(this, -151520854), 44);
                }
                EucK.vg((Writer)cv.b(this, -151520854), string);
            }
            catch (IOException iOException) {
                throw new TOKE(iOException);
            }
            if (((Character)cv.b(this, 1273297320)).charValue() == 'o') {
                cv.e(this, 1273297320, Character.valueOf('k'));
            }
            cv.e(this, 301463979, true);
            return this;
        }
        throw new TOKE(YEBy$TyVf.W("\u90d0\u9a82\uccdf\u702d\ue8ec\ube18\udc04\u1c1b\u3f18\u8d88\u6c70\ufa5a\u53aa\u3b2d\u36e8\u3299\ucabc\u7fb4\u6172\uc6d6\u24cf\uc59a"));
    }

    public EucK Diox() throws TOKE {
        if (((Character)cv.b(this, 1273297320)).charValue() == 'i' || ((Character)cv.b(this, 1273297320)).charValue() == 'o' || ((Character)cv.b(this, 1273297320)).charValue() == 'a') {
            this.OXeK(null);
            this.Smci(KUXS$dwji.S("\u3f6a"));
            cv.e(this, 301463979, false);
            return this;
        }
        throw new TOKE(KUXS$dwji.S("\u3f7c\u6ddb\u99ab\u4cff\ub452\u9a65\ub7dc\u2ce4\u7a1d\u8d9a\u1193\u3b9c\ue0d2\u5cfa\u8bbd\ubdc8"));
    }

    private EucK ssNb(char c, char c2) throws TOKE {
        if (((Character)cv.b(this, 1273297320)).charValue() != c) {
            throw new TOKE(c == 'a' ? KUXS$dwji.S("\uc3a1\u033a\u01f5 \u5b0d\uaa9a\uc54d\u36c4\ua3c1\u5245\ue59e\u59c6\ue80b\u38d5\uf3f8\u5a11\u2a14\uad73\uaa4a") : KUXS$dwji.S("\uc3a1\u033a\u01f5 \u5b0d\uaa9a\uc54d\u36c4\ua3c1\u5245\ue59e\u59c6\ue80b\u38db\uf3e8\u5a09\u2a10\uad69\uaa10\u5c42"));
        }
        this.jhSt(c);
        try {
            EucK.vg((Writer)cv.b(this, -151520854), c2);
        }
        catch (IOException iOException) {
            throw new TOKE(iOException);
        }
        cv.e(this, 301463979, true);
        return this;
    }

    public EucK nchO() throws TOKE {
        return this.ssNb('a', ']');
    }

    public EucK gFBb() throws TOKE {
        return this.ssNb('k', '}');
    }

    public EucK oVCY(String string) throws TOKE {
        if (string == null) {
            throw new TOKE(KUXS$dwji.S("\ud93b\ud910\u8425\u3212\u7b00\uf658\u54f8\u6664\u6dc3"));
        }
        if (((Character)cv.b(this, 1273297320)).charValue() == 'k') {
            try {
                EucK.vg(((vslr[])cv.b(this, 1355807125))[(Integer)cv.b(this, -1148651116) - 1], string, (Boolean)cv.e(-811926723));
                if (((Boolean)cv.b(this, 301463979)).booleanValue()) {
                    EucK.vg((Writer)cv.b(this, -151520854), 44);
                }
                EucK.vg((Writer)cv.b(this, -151520854), EucK.vg(string));
                EucK.vg((Writer)cv.b(this, -151520854), 58);
                cv.e(this, 301463979, false);
                cv.e(this, 1273297320, Character.valueOf('o'));
                return this;
            }
            catch (IOException iOException) {
                throw new TOKE(iOException);
            }
        }
        throw new TOKE(KUXS$dwji.S("\ud938\ud90c\u843a\u320e\u7b4c\uf652\u54fe\u6678\u6d89\uc568\uf3c9\u4562\u7d97\u0bd0"));
    }

    public EucK Yfkw() throws TOKE {
        if (((Character)cv.b(this, 1273297320)).charValue() == 'i') {
            cv.e(this, 1273297320, Character.valueOf('o'));
        }
        if (((Character)cv.b(this, 1273297320)).charValue() == 'o' || ((Character)cv.b(this, 1273297320)).charValue() == 'a') {
            this.Smci(rgig$AWxc.r("\ucd0a"));
            this.OXeK(new vslr());
            cv.e(this, 301463979, false);
            return this;
        }
        throw new TOKE(rgig$AWxc.r("\ucd3c\u8ae9\ue369\ud30e\u91d4\uc124\u6b5a\u11c3\uc7a9\u45d5\uf2e9\u89a9\u2187\u950d\u1ec1\u2049\u4f0d"));
    }

    private void jhSt(char c) throws TOKE {
        if ((Integer)cv.b(this, -1148651116) <= 0) {
            throw new TOKE(YEBy$TyVf.W("\u5e99\uc2a9\ub70b\ud32f\u02b2\u5d2c\ucab1\uf374\u9bce\ue4f8\u10cf\ub9e8\ua3eb\u7d88"));
        }
        char c2 = ((vslr[])cv.b(this, 1355807125))[(Integer)cv.b(this, -1148651116) - 1] == null ? 'a' : 'k';
        if (c2 != c) {
            throw new TOKE(YEBy$TyVf.W("\u5e99\uc2a9\ub70b\ud32f\u02b2\u5d2c\ucab1\uf374\u9bce\ue4f8\u10cf\ub9e8\ua3eb\u7d88"));
        }
        EucK eucK = this;
        cv.e(eucK, -1148651116, (Integer)cv.b(eucK, -1148651116) - 1);
        cv.e(this, 1273297320, Character.valueOf((char)((Integer)cv.b(this, -1148651116) == 0 ? 100 : (((vslr[])cv.b(this, 1355807125))[(Integer)cv.b(this, -1148651116) - 1] == null ? 97 : 107))));
    }

    private void OXeK(vslr vslr2) throws TOKE {
        if ((Integer)cv.b(this, -1148651116) >= 200) {
            throw new TOKE(KUXS$dwji.S("\u3d88\u7427\u44b6\u3ba0\u0c38\ubaaf\u8299\ub7fe\ucdb4\u7fb6\u7aa8\uf8a0\uf254\u2085\uf3af\ue23b\u14ca"));
        }
        ((vslr[])cv.b((Object)this, (int)1355807125))[((Integer)cv.b((Object)this, (int)-1148651116)).intValue()] = vslr2;
        cv.e(this, 1273297320, Character.valueOf(vslr2 == null ? 'a' : 'k'));
        EucK eucK = this;
        cv.e(eucK, -1148651116, (Integer)cv.b(eucK, -1148651116) + 1);
    }

    public EucK EmLA(boolean bl) throws TOKE {
        return this.Smci(bl ? rgig$AWxc.r("\uad5c\ub776\u82e4\u63a0") : rgig$AWxc.r("\uad4e\ub765\u82fd\u63b6\uc995"));
    }

    public EucK cIji(double d) throws TOKE {
        return this.cIji(new Double(d));
    }

    public EucK ykmX(long l) throws TOKE {
        return this.Smci((String)EucK.vg(l));
    }

    public EucK cIji(Object object) throws TOKE {
        return this.Smci((String)EucK.vg(object));
    }

    private static Object vg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

