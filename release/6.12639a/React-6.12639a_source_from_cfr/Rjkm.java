/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Rjkm
extends IqTB {
    public static final HashMap<String, Character> wVYx;

    static {
        HashMap hashMap = new HashMap(8);
        o.w(1108295212, hashMap);
        Rjkm.OJ(hashMap, nJPf$sILv.G("\ufb4a\u2d2e\uc602"), (Character)o.k(-578011599));
        Rjkm.OJ((HashMap)o.k(1108295212), nJPf$sILv.G("\ufb4a\u2d33\uc61d\ub982"), (Character)o.k(2116304432));
        Rjkm.OJ((HashMap)o.k(1108295212), nJPf$sILv.G("\ufb4c\u2d37"), (Character)o.k(1974878318));
        Rjkm.OJ((HashMap)o.k(1108295212), nJPf$sILv.G("\ufb47\u2d37"), (Character)o.k(-441827215));
        Rjkm.OJ((HashMap)o.k(1108295212), nJPf$sILv.G("\ufb5a\u2d36\uc61d\ub985"), (Character)o.k(-1963639249));
    }

    public Rjkm(String string) {
        super(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String ghLV() throws gggG {
        var3_1 = new StringBuilder();
        do lbl-1000: // 5 sources:
        {
            var1_2 = this.next();
            if (this.XSNy()) {
                throw this.STSP(FMkR$WjFM.a("\u0b21\u695c\ua96d\uc434\u3889\u395e\u41bb\ub651\ubcc2\uad49\uf01e\u08b8\u472d\ubd38"));
            }
            Rjkm.OJ(var3_1, var1_2);
            var2_3 = Rjkm.OJ(var3_1) - 3;
            if (var2_3 < 0) ** GOTO lbl-1000
            if (Rjkm.OJ(var3_1, var2_3) != 93) ** GOTO lbl-1000
            if (Rjkm.OJ(var3_1, var2_3 + true) != 93) ** GOTO lbl-1000
        } while (Rjkm.OJ(var3_1, var2_3 + 2) != 62);
        Rjkm.OJ(var3_1, var2_3);
        return Rjkm.OJ(var3_1);
    }

    public Object SmsU() throws gggG {
        char c;
        do {
            c = this.next();
        } while (Rjkm.OJ(c) != false);
        if (c == '\u0000') {
            return null;
        }
        if (c == '<') {
            return (Character)o.k(-441827215);
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            if (c == '<' || c == '\u0000') {
                this.wTwT();
                return Rjkm.OJ(Rjkm.OJ(stringBuilder));
            }
            if (c == '&') {
                Rjkm.OJ(stringBuilder, this.GPlk(c));
            } else {
                Rjkm.OJ(stringBuilder, c);
            }
            c = this.next();
        } while (true);
    }

    public Object GPlk(char c) throws gggG {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            c2 = this.next();
            if (Rjkm.OJ(c2) == false && c2 != '#') break;
            Rjkm.OJ(stringBuilder, Rjkm.OJ(c2));
        } while (true);
        if (c2 != ';') {
            throw this.STSP((String)Rjkm.OJ(Rjkm.OJ(new StringBuilder(mrFx$WjFM.d("\uafe3\ua0f1\u9c67\u4cd3\u475d\\\u4949\ufc85\u30a3\u0861\u487a\uaf15\u8fbc\u2c76\u53df\u7e92\uc561\u0ed3\uacdd\u5470\u85f8\u955d\ua43a\ua944\uab2f\u6545\ud297\ud64e")), stringBuilder)));
        }
        Object object = Rjkm.OJ(stringBuilder);
        Object object2 = Rjkm.OJ((HashMap)o.k(1108295212), object);
        if (object2 != null) {
            return object2;
        }
        return Rjkm.OJ(Rjkm.OJ(Rjkm.OJ(new StringBuilder((String)Rjkm.OJ(c)), object), mrFx$WjFM.d("\uaf95")));
    }

    public Object VMIf() throws gggG {
        char c;
        do {
            c = this.next();
        } while (Rjkm.OJ(c) != false);
        switch (c) {
            case '\u0000': {
                throw this.STSP(mrFx$WjFM.d("\ua398\u26cd\u882e\u89d4\u79f8\ub866\uda82\ueae3\u76b6\u2022\uca18\ucfa0\u2348\ue540\u5b0a\u5916\u2267\u7556"));
            }
            case '<': {
                return (Character)o.k(-441827215);
            }
            case '>': {
                return (Character)o.k(1974878318);
            }
            case '/': {
                return (Character)o.k(1588609135);
            }
            case '=': {
                return (Character)o.k(1374634102);
            }
            case '!': {
                return (Character)o.k(31080557);
            }
            case '?': {
                return (Character)o.k(-1910488969);
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                do {
                    if ((c = this.next()) != '\u0000') continue;
                    throw this.STSP(mrFx$WjFM.d("\ua380\u26ca\u8829\u89c2\u79e2\ub86a\uda9b\ueae8\u76b3\u2076\uca10\ucfa1\u231c\ue552\u5b5e\u5910\u226f\u755f\uef4c"));
                } while (c != c2);
                return (Boolean)o.k(-316456551);
            }
        }
        do {
            c = this.next();
            if (Rjkm.OJ(c) != false) {
                return (Boolean)o.k(-316456551);
            }
            switch (c) {
                case '\u0000': 
                case '!': 
                case '\"': 
                case '\'': 
                case '/': 
                case '<': 
                case '=': 
                case '>': 
                case '?': {
                    this.wTwT();
                    return (Boolean)o.k(-316456551);
                }
            }
        } while (true);
    }

    public Object FhMR() throws gggG {
        char c;
        do {
            c = this.next();
        } while (Rjkm.OJ(c) != false);
        switch (c) {
            case '\u0000': {
                throw this.STSP(mrFx$WjFM.d("\ue359\ud230\ud959\uc711\u3df3\u109a\u98c8\ue471\u7048\u549d\u9ec8\uee20\u5c0a\u6dcd\u2bb5\u6f85\uee37"));
            }
            case '<': {
                throw this.STSP(mrFx$WjFM.d("\ue359\ud230\ud959\uc712\u3df7\u109a\u98db\ue471\u7048\u549d\u9e8a\uee70\u5c48"));
            }
            case '>': {
                return (Character)o.k(1974878318);
            }
            case '/': {
                return (Character)o.k(1588609135);
            }
            case '=': {
                return (Character)o.k(1374634102);
            }
            case '!': {
                return (Character)o.k(31080557);
            }
            case '?': {
                return (Character)o.k(-1910488969);
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                StringBuilder stringBuilder = new StringBuilder();
                do {
                    if ((c = this.next()) == '\u0000') {
                        throw this.STSP(mrFx$WjFM.d("\ue341\ud237\ud95e\uc707\u3de9\u1096\u98d1\ue47a\u704d\u54c9\u9ec8\uee28\u5c4f\u6dd3\u2ba4\u6f99\uee2a\u454a\u8cef"));
                    }
                    if (c == c2) {
                        return Rjkm.OJ(stringBuilder);
                    }
                    if (c == '&') {
                        Rjkm.OJ(stringBuilder, this.GPlk(c));
                        continue;
                    }
                    Rjkm.OJ(stringBuilder, c);
                } while (true);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            Rjkm.OJ(stringBuilder, c);
            c = this.next();
            if (Rjkm.OJ(c) != false) {
                return Rjkm.OJ(stringBuilder);
            }
            switch (c) {
                case '\u0000': {
                    return Rjkm.OJ(stringBuilder);
                }
                case '!': 
                case '/': 
                case '=': 
                case '>': 
                case '?': 
                case '[': 
                case ']': {
                    this.wTwT();
                    return Rjkm.OJ(stringBuilder);
                }
                case '\"': 
                case '\'': 
                case '<': {
                    throw this.STSP(mrFx$WjFM.d("\ue356\ud238\ud94e\uc742\u3df8\u1093\u98d9\ue466\u704d\u54de\u9ed9\uee29\u5c1d\u6d80\u2bb9\u6f85\uee63\u4545\u8ca8\u018a\u0fab\uf2ca\uaea7"));
                }
            }
        } while (true);
    }

    public boolean jxuv(String string) throws gggG {
        char c;
        int n = 0;
        Object object = Rjkm.OJ(string);
        char[] arrc = new char[object];
        int n2 = 0;
        while (n2 < object) {
            c = this.next();
            if (c == '\u0000') {
                return false;
            }
            arrc[n2] = c;
            ++n2;
        }
        do {
            int n3 = n;
            boolean bl = true;
            n2 = 0;
            while (n2 < object) {
                if (arrc[n3] != Rjkm.OJ(string, n2)) {
                    bl = false;
                    break;
                }
                if (++n3 >= object) {
                    n3 -= object;
                }
                ++n2;
            }
            if (bl) {
                return true;
            }
            c = this.next();
            if (c == '\u0000') {
                return false;
            }
            arrc[n] = c;
            if (++n < object) continue;
            n -= object;
        } while (true);
    }

    private static Object OJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

