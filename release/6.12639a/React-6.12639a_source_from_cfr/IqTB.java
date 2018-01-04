/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class IqTB {
    private long dVqO;
    private boolean eof;
    private long vSTM;
    private long WGyS;
    private char JtxN;
    private Reader reader;
    private boolean USTy;

    public IqTB(Reader reader) {
        this.reader = IqTB.Vo(reader) != false ? reader : new BufferedReader(reader);
        this.eof = false;
        this.USTy = false;
        this.JtxN = '\u0000';
        this.vSTM = 0;
        this.dVqO = 1;
        this.WGyS = 1;
    }

    public IqTB(InputStream inputStream) throws gggG {
        this(new InputStreamReader(inputStream));
    }

    public IqTB(String string) {
        this(new StringReader(string));
    }

    public void wTwT() throws gggG {
        if (((Boolean)o.a(this, -1731706430)).booleanValue() || (Long)o.a(this, -1607056959) <= 0) {
            throw new gggG(FMkR$WjFM.a("\ua14f\u7982\u68a3\u729c\ud4e7\ufb1f\u5c84\uffa7\u80fa\uaefa\ue4e0\uff50\u1e84\ucf49\u5546\uac75\u7b10\uf7cf\ue5c2\u5ff0\ub3e1\uea6b\u3719\ube59\u2eaa\uac2f\ub172\ue4f9\u7d0e\u9999\u734f\u3a97\u0d8b\uf776\u4e9f\uc352\u76ec\u06f1\u5d40\u7fdc"));
        }
        IqTB iqTB = this;
        o.v(iqTB, -1607056959, (Long)o.a(iqTB, -1607056959) - 1);
        IqTB iqTB2 = this;
        o.v(iqTB2, -1978056256, (Long)o.a(iqTB2, -1978056256) - 1);
        o.v(this, -1731706430, true);
        o.v(this, 418464191, false);
    }

    public static int yJLS(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 55;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 87;
        }
        return -1;
    }

    public boolean XSNy() {
        if (((Boolean)o.a(this, 418464191)).booleanValue() && !((Boolean)o.a(this, -1731706430)).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean esGw() throws gggG {
        this.next();
        if (this.XSNy()) {
            return false;
        }
        this.wTwT();
        return true;
    }

    public char next() throws gggG {
        Object object;
        if (((Boolean)o.a(this, -1731706430)).booleanValue()) {
            o.v(this, -1731706430, false);
            object = ((Character)o.a(this, -1700773442)).charValue();
        } else {
            try {
                object = IqTB.Vo((Reader)o.a(this, 1352090045));
            }
            catch (IOException iOException) {
                throw new gggG(iOException);
            }
            if (object <= 0) {
                o.v(this, 418464191, true);
                object = false;
            }
        }
        IqTB iqTB = this;
        o.v(iqTB, -1607056959, (Long)o.a(iqTB, -1607056959) + 1);
        if (((Character)o.a(this, -1700773442)).charValue() == '\r') {
            IqTB iqTB2 = this;
            o.v(iqTB2, 1338720700, (Long)o.a(iqTB2, 1338720700) + 1);
            o.v(this, -1978056256, (long)(object != 10) ? 1 : 0);
        } else if (object == 10) {
            IqTB iqTB3 = this;
            o.v(iqTB3, 1338720700, (Long)o.a(iqTB3, 1338720700) + 1);
            o.v(this, -1978056256, 0);
        } else {
            IqTB iqTB4 = this;
            o.v(iqTB4, -1978056256, (Long)o.a(iqTB4, -1978056256) + 1);
        }
        o.v(this, -1700773442, Character.valueOf((char)object));
        return ((Character)o.a(this, -1700773442)).charValue();
    }

    public char UtIU(char c) throws gggG {
        char c2 = this.next();
        if (c2 != c) {
            throw this.STSP((String)IqTB.Vo(IqTB.Vo(IqTB.Vo(IqTB.Vo(IqTB.Vo(new StringBuilder(mrFx$WjFM.d("\uf6c9\uafe2\u68a2\uf9c4\u0a6d\ud6fd\u17ca\u32ba\u89d5\u1ff0")), c), mrFx$WjFM.d("\uf6ab\uafba\u68b3\uf9cf\u0a6a\ud6a9\u17c6\u32b0\u8986\u1fa3\u737a\u08da\ue455\ua453\u167b\u107a\uf88b\ua6bd\u15c1")), c2), mrFx$WjFM.d("\uf6ab"))));
        }
        return c2;
    }

    public String IgvC(int n) throws gggG {
        if (n == 0) {
            return "";
        }
        char[] arrc = new char[n];
        int n2 = 0;
        while (n2 < n) {
            arrc[n2] = this.next();
            if (this.XSNy()) {
                throw this.STSP(FMkR$WjFM.a("\u4e63\u1dd0\uaca4\ub77a\u96f8\u5693\ue887\ubcd9\u0c15\u08e3\u5122\u9119\u3845\u60c3\u2400\u3ad7\u9613\ub120\uddff\u0c3b\u31cd\u2041"));
            }
            ++n2;
        }
        return new String(arrc);
    }

    public char cmAt() throws gggG {
        char c;
        while ((c = this.next()) != '\u0000' && c <= ' ') {
        }
        return c;
    }

    public String biLo(char c) throws gggG {
        StringBuilder stringBuilder = new StringBuilder();
        block13 : do {
            char c2 = this.next();
            switch (c2) {
                case '\u0000': 
                case '\n': 
                case '\r': {
                    throw this.STSP(mrFx$WjFM.d("\ud937\u9a6d\ue508\u3830\ud9ac\u953c\u44a3\u8d6a\u2144\ue753\u9a55\u3444\u9ddf\udf2a\u9438\u60a7\u3503\u273e\u3373"));
                }
                case '\\': {
                    c2 = this.next();
                    switch (c2) {
                        case 'b': {
                            IqTB.Vo(stringBuilder, 8);
                            continue block13;
                        }
                        case 't': {
                            IqTB.Vo(stringBuilder, 9);
                            continue block13;
                        }
                        case 'n': {
                            IqTB.Vo(stringBuilder, 10);
                            continue block13;
                        }
                        case 'f': {
                            IqTB.Vo(stringBuilder, 12);
                            continue block13;
                        }
                        case 'r': {
                            IqTB.Vo(stringBuilder, 13);
                            continue block13;
                        }
                        case 'u': {
                            IqTB.Vo(stringBuilder, IqTB.Vo(this.IgvC(4), 16));
                            continue block13;
                        }
                        case '\"': 
                        case '\'': 
                        case '/': 
                        case '\\': {
                            IqTB.Vo(stringBuilder, c2);
                            continue block13;
                        }
                    }
                    throw this.STSP(mrFx$WjFM.d("\ud92b\u9a6f\ue510\u3830\ud9b9\u9530\u44a6\u8d24\u2140\ue754\u9a53\u3441\u9d8f\udf3c\u9462"));
                }
            }
            if (c2 == c) {
                return IqTB.Vo(stringBuilder);
            }
            IqTB.Vo(stringBuilder, c2);
        } while (true);
    }

    public String VwLY(char c) throws gggG {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            char c2;
            if ((c2 = this.next()) == c || c2 == '\u0000' || c2 == '\n' || c2 == '\r') {
                if (c2 != '\u0000') {
                    this.wTwT();
                }
                return IqTB.Vo(IqTB.Vo(stringBuilder));
            }
            IqTB.Vo(stringBuilder, c2);
        } while (true);
    }

    public String erXb(String string) throws gggG {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            char c = this.next();
            if (IqTB.Vo(string, c) >= 0 || c == '\u0000' || c == '\n' || c == '\r') {
                if (c != '\u0000') {
                    this.wTwT();
                }
                return IqTB.Vo(IqTB.Vo(stringBuilder));
            }
            IqTB.Vo(stringBuilder, c);
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Object fTHU() throws gggG {
        var1_1 = this.cmAt();
        switch (var1_1) {
            case '\"': 
            case '\'': {
                return this.biLo(var1_1);
            }
            case '{': {
                this.wTwT();
                return new vbpi(this);
            }
            case '[': {
                this.wTwT();
                return new JRRx(this);
            }
        }
        var3_2 = new StringBuilder();
        ** GOTO lbl15
lbl-1000: // 1 sources:
        {
            IqTB.Vo(var3_2, var1_1);
            var1_1 = this.next();
lbl15: // 2 sources:
            if (var1_1 < ' ') break;
            ** while (IqTB.Vo(mrFx$WjFM.d((Object)"\u2d3e\uf064\udd39\u3e8b\u22f5\u9c13\uc668\u992a\ud20a\u7a50\u3dd4\u861d"), var1_1) < 0)
        }
lbl19: // 2 sources:
        this.wTwT();
        var2_3 = IqTB.Vo(IqTB.Vo(var3_2));
        if (IqTB.Vo("", var2_3) == false) return IqTB.Vo(var2_3);
        throw this.STSP(mrFx$WjFM.d("\u2d5f\uf037\udd17\u3e85\u22b3\u9c21\uc62d\u9951\ud207\u7a0a\u3d85\u864b\u0db4"));
    }

    public char TEqA(char c) throws gggG {
        char c2;
        try {
            long l = (Long)o.a(this, -1607056959);
            long l2 = (Long)o.a(this, -1978056256);
            long l3 = (Long)o.a(this, 1338720700);
            IqTB.Vo((Reader)o.a(this, 1352090045), 1000000);
            do {
                if ((c2 = this.next()) != '\u0000') continue;
                IqTB.Vo((Reader)o.a(this, 1352090045));
                o.v(this, -1607056959, l);
                o.v(this, -1978056256, l2);
                o.v(this, 1338720700, l3);
                return c2;
            } while (c2 != c);
        }
        catch (IOException iOException) {
            throw new gggG(iOException);
        }
        this.wTwT();
        return c2;
    }

    public gggG STSP(String string) {
        return new gggG((String)IqTB.Vo(IqTB.Vo(new StringBuilder((String)IqTB.Vo(string)), this.toString())));
    }

    public String toString() {
        return IqTB.Vo(IqTB.Vo(IqTB.Vo(IqTB.Vo(IqTB.Vo(IqTB.Vo(IqTB.Vo(new StringBuilder(mrFx$WjFM.d("\u7f39\u9862\u3598\u2e14")), (Long)o.a(this, -1607056959)), mrFx$WjFM.d("\u7f39\u9858\u358f\u2e5c\ub275\uad53\u6f57\u3c34\u50a5\u13de\ud0a3\ucec0")), (Long)o.a(this, -1978056256)), mrFx$WjFM.d("\u7f39\u986f\u3585\u2e5a\ub271\uad01")), (Long)o.a(this, 1338720700)), mrFx$WjFM.d("\u7f44")));
    }

    private static Object Vo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

