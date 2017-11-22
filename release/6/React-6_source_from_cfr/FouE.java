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

public class FouE {
    private long gEtl;
    private boolean eof;
    private long bYId;
    private long NyCr;
    private char xrYW;
    private Reader reader;
    private boolean IaBL;

    public FouE(Reader reader) {
        this.reader = FouE.CW(reader) != false ? reader : new BufferedReader(reader);
        this.eof = false;
        this.IaBL = false;
        this.xrYW = '\u0000';
        this.bYId = 0;
        this.gEtl = 1;
        this.NyCr = 1;
    }

    public FouE(InputStream inputStream) throws TOKE {
        this(new InputStreamReader(inputStream));
    }

    public FouE(String string) {
        this(new StringReader(string));
    }

    public void yReg() throws TOKE {
        if (((Boolean)cv.b(this, 996866470)).booleanValue() || (Long)cv.b(this, -1928005215) <= 0) {
            throw new TOKE(KUXS$dwji.S("\u2897\ud026\u7cfd\uc911\u9b48\u3576\ud54b\ud87d\u4c29\u7777\udc7c\u62ef\uad33\u8818\uf8d9\u2f4f\u3feb\u572e\u2434\u59f3\ue39e\uca04\udb4f\u33ef\u0760\u784f\u2b15\ud698\u180c\ue10d\u61ca\u4e0e\ua585\u2cd2\u511a\u7882\u2830\u4ca5\u8dc8\ubcff"));
        }
        FouE fouE = this;
        cv.e(fouE, -1928005215, (Long)cv.b(fouE, -1928005215) - 1);
        FouE fouE2 = this;
        cv.e(fouE2, 1190918560, (Long)cv.b(fouE2, 1190918560) - 1);
        cv.e(this, 996866470, true);
        cv.e(this, -1334642269, false);
    }

    public static int ssNb(char c) {
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

    public boolean MAeq() {
        if (((Boolean)cv.b(this, -1334642269)).booleanValue() && !((Boolean)cv.b(this, 996866470)).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean gotc() throws TOKE {
        this.next();
        if (this.MAeq()) {
            return false;
        }
        this.yReg();
        return true;
    }

    public char next() throws TOKE {
        Object object;
        if (((Boolean)cv.b(this, 996866470)).booleanValue()) {
            cv.e(this, 996866470, false);
            object = ((Character)cv.b(this, 132905378)).charValue();
        } else {
            try {
                object = FouE.CW((Reader)cv.b(this, 230816173));
            }
            catch (IOException iOException) {
                throw new TOKE(iOException);
            }
            if (object <= 0) {
                cv.e(this, -1334642269, true);
                object = false;
            }
        }
        FouE fouE = this;
        cv.e(fouE, -1928005215, (Long)cv.b(fouE, -1928005215) + 1);
        if (((Character)cv.b(this, 132905378)).charValue() == '\r') {
            FouE fouE2 = this;
            cv.e(fouE2, -765003348, (Long)cv.b(fouE2, -765003348) + 1);
            cv.e(this, 1190918560, object == 10 ? 0 : 1);
        } else if (object == 10) {
            FouE fouE3 = this;
            cv.e(fouE3, -765003348, (Long)cv.b(fouE3, -765003348) + 1);
            cv.e(this, 1190918560, 0);
        } else {
            FouE fouE4 = this;
            cv.e(fouE4, 1190918560, (Long)cv.b(fouE4, 1190918560) + 1);
        }
        cv.e(this, 132905378, Character.valueOf((char)object));
        return ((Character)cv.b(this, 132905378)).charValue();
    }

    public char DYFV(char c) throws TOKE {
        char c2 = this.next();
        if (c2 != c) {
            throw this.aLYV((String)FouE.CW(FouE.CW(FouE.CW(FouE.CW(FouE.CW(new StringBuilder(KUXS$dwji.S("\u0cc4\u81fb\u5cfc\ube8d\uda20\ud27d\ucf20\u16e0\u139a\u2247")), c), KUXS$dwji.S("\u0ca6\u81a3\u5ced\ube86\uda27\ud229\ucf2c\u16ea\u13c9\u2214\ud1f0\u6aed\ue01c\u37fd\u0216\u344c\ubb17\u52e8\u4301")), c2), KUXS$dwji.S("\u0ca6"))));
        }
        return c2;
    }

    public String HBqU(int n) throws TOKE {
        if (n == 0) {
            return "";
        }
        char[] arrc = new char[n];
        for (int i = 0; i < n; ++i) {
            arrc[i] = this.next();
            if (!this.MAeq()) continue;
            throw this.aLYV(YEBy$TyVf.W("\u6f64\ue1ad\uabd6\ucd89\u26d9\ub447\u1986\u0518\u6c4c\uba2a\ua250\u1d51\uab67\u095d\u4d1e\u701f\uf34a\u9269\u83bb\u7f3a\uc67b\uc6a7"));
        }
        return new String(arrc);
    }

    public char JtRs() throws TOKE {
        char c;
        while ((c = this.next()) != '\u0000' && c <= ' ') {
        }
        return c;
    }

    public String IWSm(char c) throws TOKE {
        StringBuilder stringBuilder = new StringBuilder();
        block13 : do {
            char c2 = this.next();
            switch (c2) {
                case '\u0000': 
                case '\n': 
                case '\r': {
                    throw this.aLYV(KUXS$dwji.S("\u13ea\uad93\u3a70\u4a95\uc4a2\uce33\ub636\u6f41\ua70a\u51f1\u7f55\u2f93\u3e30\uc1d5\uff7a\u9849\u1d4b\u3833\u37ef"));
                }
                case '\\': {
                    c2 = this.next();
                    switch (c2) {
                        case 'b': {
                            FouE.CW(stringBuilder, 8);
                            continue block13;
                        }
                        case 't': {
                            FouE.CW(stringBuilder, 9);
                            continue block13;
                        }
                        case 'n': {
                            FouE.CW(stringBuilder, 10);
                            continue block13;
                        }
                        case 'f': {
                            FouE.CW(stringBuilder, 12);
                            continue block13;
                        }
                        case 'r': {
                            FouE.CW(stringBuilder, 13);
                            continue block13;
                        }
                        case 'u': {
                            FouE.CW(stringBuilder, FouE.CW(this.HBqU(4), 16));
                            continue block13;
                        }
                        case '\"': 
                        case '\'': 
                        case '/': 
                        case '\\': {
                            FouE.CW(stringBuilder, c2);
                            continue block13;
                        }
                    }
                    throw this.aLYV(KUXS$dwji.S("\u13f6\uad91\u3a68\u4a95\uc4b7\uce3f\ub633\u6f0f\ua70e\u51f6\u7f53\u2f96\u3e60\uc1c3\uff20"));
                }
            }
            if (c2 == c) {
                return FouE.CW(stringBuilder);
            }
            FouE.CW(stringBuilder, c2);
        } while (true);
    }

    public String OXeK(char c) throws TOKE {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            char c2;
            if ((c2 = this.next()) == c || c2 == '\u0000' || c2 == '\n' || c2 == '\r') {
                if (c2 != '\u0000') {
                    this.yReg();
                }
                return FouE.CW(FouE.CW(stringBuilder));
            }
            FouE.CW(stringBuilder, c2);
        } while (true);
    }

    public String OOtu(String string) throws TOKE {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            char c = this.next();
            if (FouE.CW(string, c) >= 0 || c == '\u0000' || c == '\n' || c == '\r') {
                if (c != '\u0000') {
                    this.yReg();
                }
                return FouE.CW(FouE.CW(stringBuilder));
            }
            FouE.CW(stringBuilder, c);
        } while (true);
    }

    public Object GbYK() throws TOKE {
        char c = this.JtRs();
        switch (c) {
            case '\"': 
            case '\'': {
                return this.IWSm(c);
            }
            case '{': {
                this.yReg();
                return new vslr(this);
            }
            case '[': {
                this.yReg();
                return new HdyI(this);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (c >= ' ') {
            if (FouE.CW(KUXS$dwji.S("\u36f0\u394e\ubd59\u4799\uf2ee\ud112\uf07c\ufcc7\uee90\ua25f\u757c\ub23f"), c) >= 0) break;
            FouE.CW(stringBuilder, c);
            c = this.next();
        }
        this.yReg();
        Object object = FouE.CW(FouE.CW(stringBuilder));
        if (FouE.CW("", object) != false) {
            throw this.aLYV(KUXS$dwji.S("\u3691\u391d\ubd77\u4797\uf2a8\ud120\uf039\ufcbc\uee9d\ua205\u752d\ub269\u84fe"));
        }
        return FouE.CW(object);
    }

    public char YoSa(char c) throws TOKE {
        char c2;
        try {
            long l = (Long)cv.b(this, -1928005215);
            long l2 = (Long)cv.b(this, 1190918560);
            long l3 = (Long)cv.b(this, -765003348);
            FouE.CW((Reader)cv.b(this, 230816173), 1000000);
            do {
                if ((c2 = this.next()) != '\u0000') continue;
                FouE.CW((Reader)cv.b(this, 230816173));
                cv.e(this, -1928005215, l);
                cv.e(this, 1190918560, l2);
                cv.e(this, -765003348, l3);
                return c2;
            } while (c2 != c);
        }
        catch (IOException iOException) {
            throw new TOKE(iOException);
        }
        this.yReg();
        return c2;
    }

    public TOKE aLYV(String string) {
        return new TOKE((String)FouE.CW(FouE.CW(FouE.CW(new StringBuilder(), string), this.toString())));
    }

    public String toString() {
        return FouE.CW(FouE.CW(FouE.CW(FouE.CW(FouE.CW(FouE.CW(FouE.CW(new StringBuilder(YEBy$TyVf.W("\ua2e7\ubf75\u37cf\u768d")), (Long)cv.b(this, -1928005215)), YEBy$TyVf.W("\ua2e7\ubf4f\u37d8\u76c5\u42de\ucfb2\ub5cb\u4f95\u1833\u34f1\ua806\u21ea")), (Long)cv.b(this, 1190918560)), YEBy$TyVf.W("\ua2e7\ubf78\u37d2\u76c3\u42da\ucfe0")), (Long)cv.b(this, -765003348)), YEBy$TyVf.W("\ua29a")));
    }

    private static Object CW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

