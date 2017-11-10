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

public class RjaO {
    private long Ynto;
    private boolean eof;
    private long uFRK;
    private long Lhol;
    private char LFmP;
    private Reader reader;
    private boolean SCOk;

    public RjaO(Reader reader) {
        this.reader = RjaO.bM(reader) != false ? reader : new BufferedReader(reader);
        this.eof = false;
        this.SCOk = false;
        this.LFmP = '\u0000';
        this.uFRK = 0;
        this.Ynto = 1;
        this.Lhol = 1;
    }

    public RjaO(InputStream inputStream) throws Bkpl {
        this(new InputStreamReader(inputStream));
    }

    public RjaO(String string) {
        this(new StringReader(string));
    }

    public void VfLY() throws Bkpl {
        if (((Boolean)yy.h(this, -1167589551)).booleanValue() || (Long)yy.h(this, -852885670) <= 0) {
            throw new Bkpl(NVIs$JbpD.H("\u9e4d\u454e\u2262\ua773\ufa32\u6f16\u11de\uf1ce\u09d9\uf99e\u2172\u6155\u1e93\uf8fd\ud0f3\udeb2\u8a83\u6e81\u0e39\u0ba5\u5d1d\u1753\u027c\ueab0\uc02f\u246b\u6971\uf6d3\ub7a7\ub2f9\u981f\u33d3\u58b6\u6a30\u0668\u057c\u2d8d\uef87\u7eb3\u05c7"));
        }
        RjaO rjaO = this;
        yy.E(rjaO, -852885670, (Long)yy.h(rjaO, -852885670) - 1);
        RjaO rjaO2 = this;
        yy.E(rjaO2, 208797519, (Long)yy.h(rjaO2, 208797519) - 1);
        yy.E(this, -1167589551, true);
        yy.E(this, -2054029488, false);
    }

    public static int mXJp(char c) {
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

    public boolean BIor() {
        if (((Boolean)yy.h(this, -2054029488)).booleanValue() && !((Boolean)yy.h(this, -1167589551)).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean SvTc() throws Bkpl {
        this.next();
        if (this.BIor()) {
            return false;
        }
        this.VfLY();
        return true;
    }

    public char next() throws Bkpl {
        Object object;
        if (((Boolean)yy.h(this, -1167589551)).booleanValue()) {
            yy.E(this, -1167589551, false);
            object = ((Character)yy.h(this, 1695219493)).charValue();
        } else {
            try {
                object = RjaO.bM((Reader)yy.h(this, -1674641634));
            }
            catch (IOException iOException) {
                throw new Bkpl(iOException);
            }
            if (object <= 0) {
                yy.E(this, -2054029488, true);
                object = false;
            }
        }
        RjaO rjaO = this;
        yy.E(rjaO, -852885670, (Long)yy.h(rjaO, -852885670) + 1);
        if (((Character)yy.h(this, 1695219493)).charValue() == '\r') {
            RjaO rjaO2 = this;
            yy.E(rjaO2, 1037958947, (Long)yy.h(rjaO2, 1037958947) + 1);
            yy.E(this, 208797519, object == 10 ? 0 : 1);
        } else if (object == 10) {
            RjaO rjaO3 = this;
            yy.E(rjaO3, 1037958947, (Long)yy.h(rjaO3, 1037958947) + 1);
            yy.E(this, 208797519, 0);
        } else {
            RjaO rjaO4 = this;
            yy.E(rjaO4, 208797519, (Long)yy.h(rjaO4, 208797519) + 1);
        }
        yy.E(this, 1695219493, Character.valueOf((char)object));
        return ((Character)yy.h(this, 1695219493)).charValue();
    }

    public char ksfs(char c) throws Bkpl {
        char c2 = this.next();
        if (c2 != c) {
            throw this.ePQp((String)RjaO.bM(RjaO.bM(RjaO.bM(RjaO.bM(RjaO.bM(new StringBuilder(NVIs$JbpD.H("\ubca0\u17b2\ucbf4\u4770\u4db3\udac6\ue5d4\u7ef3\u5bd6\u7c19")), c), NVIs$JbpD.H("\ubcc2\u17ea\ucbe5\u477b\u4db4\uda92\ue5d8\u7ef9\u5b85\u7c4a\u1372\ub6da\uf746\u7b54\u7cda\u8ee6\uac05\uc9d6\u2280")), c2), NVIs$JbpD.H("\ubcc2"))));
        }
        return c2;
    }

    public String hGxw(int n) throws Bkpl {
        if (n == 0) {
            return "";
        }
        char[] arrc = new char[n];
        for (int i = 0; i < n; ++i) {
            arrc[i] = this.next();
            if (!this.BIor()) continue;
            throw this.ePQp(KDGY$JAHk.Y("\u2398\u5f96\u6e3c\u052d\u76f9\ua314\ue6de\u8b39\ua582\u2e4e\u7d47\ud56f\u9c86\ue792\u7102\uba9f\u51d1\u2a3e\u0eba\u0f80\uad4d\uaa7c"));
        }
        return new String(arrc);
    }

    public char PJgj() throws Bkpl {
        char c;
        while ((c = this.next()) != '\u0000' && c <= ' ') {
        }
        return c;
    }

    public String yJLL(char c) throws Bkpl {
        StringBuilder stringBuilder = new StringBuilder();
        block13 : do {
            char c2 = this.next();
            switch (c2) {
                case '\u0000': 
                case '\n': 
                case '\r': {
                    throw this.ePQp(KDGY$JAHk.Y("\u0229\u5a34\u6b60\u275f\u487f\u9fae\u8153\ud5cc\ua817\u7e02\u083c\u244f\u84f8\u210a\u9e8d\u62eb\u366e\u3e0e\ud45d"));
                }
                case '\\': {
                    c2 = this.next();
                    switch (c2) {
                        case 'b': {
                            RjaO.bM(stringBuilder, 8);
                            continue block13;
                        }
                        case 't': {
                            RjaO.bM(stringBuilder, 9);
                            continue block13;
                        }
                        case 'n': {
                            RjaO.bM(stringBuilder, 10);
                            continue block13;
                        }
                        case 'f': {
                            RjaO.bM(stringBuilder, 12);
                            continue block13;
                        }
                        case 'r': {
                            RjaO.bM(stringBuilder, 13);
                            continue block13;
                        }
                        case 'u': {
                            RjaO.bM(stringBuilder, RjaO.bM(this.hGxw(4), 16));
                            continue block13;
                        }
                        case '\"': 
                        case '\'': 
                        case '/': 
                        case '\\': {
                            RjaO.bM(stringBuilder, c2);
                            continue block13;
                        }
                    }
                    throw this.ePQp(KDGY$JAHk.Y("\u0235\u5a36\u6b78\u275f\u486a\u9fa2\u8156\ud582\ua813\u7e05\u083a\u244a\u84a8\u211c\u9ed7"));
                }
            }
            if (c2 == c) {
                return RjaO.bM(stringBuilder);
            }
            RjaO.bM(stringBuilder, c2);
        } while (true);
    }

    public String SnBs(char c) throws Bkpl {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            char c2;
            if ((c2 = this.next()) == c || c2 == '\u0000' || c2 == '\n' || c2 == '\r') {
                if (c2 != '\u0000') {
                    this.VfLY();
                }
                return RjaO.bM(RjaO.bM(stringBuilder));
            }
            RjaO.bM(stringBuilder, c2);
        } while (true);
    }

    public String PBUD(String string) throws Bkpl {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            char c = this.next();
            if (RjaO.bM(string, c) >= 0 || c == '\u0000' || c == '\n' || c == '\r') {
                if (c != '\u0000') {
                    this.VfLY();
                }
                return RjaO.bM(RjaO.bM(stringBuilder));
            }
            RjaO.bM(stringBuilder, c);
        } while (true);
    }

    public Object kYtq() throws Bkpl {
        char c = this.PJgj();
        switch (c) {
            case '\"': 
            case '\'': {
                return this.yJLL(c);
            }
            case '{': {
                this.VfLY();
                return new jhSC(this);
            }
            case '[': {
                this.VfLY();
                return new vHqM(this);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (c >= ' ') {
            if (RjaO.bM(NVIs$JbpD.H("\u2691\u1672\u8ad7\u5662\uf5e8\u80ca\uc6d6\ub06f\u12e8\u1fbe\u359b\u4927"), c) >= 0) break;
            RjaO.bM(stringBuilder, c);
            c = this.next();
        }
        this.VfLY();
        Object object = RjaO.bM(RjaO.bM(stringBuilder));
        if (RjaO.bM("", object) != false) {
            throw this.ePQp(NVIs$JbpD.H("\u26f0\u1621\u8af9\u566c\uf5ae\u80f8\uc693\ub014\u12e5\u1fe4\u35ca\u4971\ua32f"));
        }
        return RjaO.bM(object);
    }

    public char qdWJ(char c) throws Bkpl {
        char c2;
        try {
            long l = (Long)yy.h(this, -852885670);
            long l2 = (Long)yy.h(this, 208797519);
            long l3 = (Long)yy.h(this, 1037958947);
            RjaO.bM((Reader)yy.h(this, -1674641634), 1000000);
            do {
                if ((c2 = this.next()) != '\u0000') continue;
                RjaO.bM((Reader)yy.h(this, -1674641634));
                yy.E(this, -852885670, l);
                yy.E(this, 208797519, l2);
                yy.E(this, 1037958947, l3);
                return c2;
            } while (c2 != c);
        }
        catch (IOException iOException) {
            throw new Bkpl(iOException);
        }
        this.VfLY();
        return c2;
    }

    public Bkpl ePQp(String string) {
        return new Bkpl((String)RjaO.bM(RjaO.bM(RjaO.bM(new StringBuilder(), string), this.toString())));
    }

    public String toString() {
        return RjaO.bM(RjaO.bM(RjaO.bM(RjaO.bM(RjaO.bM(RjaO.bM(RjaO.bM(new StringBuilder(KDGY$JAHk.Y("\u7b37\u44d5\u9fc7\u3fad")), (Long)yy.h(this, -852885670)), KDGY$JAHk.Y("\u7b37\u44ef\u9fd0\u3fe5\ub0b5\u1fba\u238a\u8de5\ue4c0\ub437\ub3a2\ud072")), (Long)yy.h(this, 208797519)), KDGY$JAHk.Y("\u7b37\u44d8\u9fda\u3fe3\ub0b1\u1fe8")), (Long)yy.h(this, 1037958947)), KDGY$JAHk.Y("\u7b4a")));
    }

    private static Object bM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

