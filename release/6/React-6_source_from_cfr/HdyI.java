/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class HdyI
implements Iterable<Object> {
    private final ArrayList<Object> ChCU = new ArrayList();

    public HdyI() {
    }

    public HdyI(FouE fouE) throws TOKE {
        this();
        if (HdyI.Xm(fouE) != 91) {
            throw HdyI.Xm(fouE, YEBy$TyVf.W("\ua281\ua053\u5ce6\ub2b3\u53a6\uc99a\ubb5f\u4728\u8161\u2b50\u84e9\ucde5\u4591\u1942\u322a\u2db7\u63ba\ufd36\uc2c2\ubac6\u5cc3\u8036\u6f8f\u85d8\ua4be\u6e1a\uf424\u08db\u4527\u5d67\u56fa\u2e98\ucebf\u7aed\u2f4b\u5ec7"));
        }
        if (HdyI.Xm(fouE) != 93) {
            HdyI.Xm(fouE);
            block4 : do {
                if (HdyI.Xm(fouE) == 44) {
                    HdyI.Xm(fouE);
                    HdyI.Xm((ArrayList)cv.b(this, 768801611), cv.e(-335152310));
                } else {
                    HdyI.Xm(fouE);
                    HdyI.Xm((ArrayList)cv.b(this, 768801611), HdyI.Xm(fouE));
                }
                switch (HdyI.Xm(fouE)) {
                    case 44: {
                        if (HdyI.Xm(fouE) == 93) {
                            return;
                        }
                        HdyI.Xm(fouE);
                        continue block4;
                    }
                    case 93: {
                        return;
                    }
                }
                break;
            } while (true);
            throw HdyI.Xm(fouE, YEBy$TyVf.W("\ua285\ua00b\u5cdc\ub285\u538a\uc9a0\ubb7b\u473e\u8133\u2b50\u84b0\ucde2\u45c9\u1900\u3272\u2dac\u63e8\ufd7b\uc290\ubae8\u5c90"));
        }
    }

    public HdyI(String string) throws TOKE {
        this(new FouE(string));
    }

    public HdyI(Collection<Object> collection) {
        if (collection != null) {
            Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                HdyI.Xm((ArrayList)cv.b(this, 768801611), HdyI.Xm(iterator.next()));
            }
        }
    }

    public HdyI(Object object) throws TOKE {
        this();
        if (HdyI.Xm(HdyI.Xm(object)) != false) {
            Object object2 = HdyI.Xm(object);
            for (int i = 0; i < object2; ++i) {
                this.ykmX(HdyI.Xm(HdyI.Xm(object, i)));
            }
            return;
        }
        throw new TOKE(rgig$AWxc.r("\u3d87\u7ebc\uf4f4\ue41a\ucaea\u5305\u39c2\ue5f8\u3828\ub47d\u0853\u329b\u9c61\uf442\ub1f4\uf9e8\uc98e\u50aa\u7b7c\ub482\udbd9\uaeee\u251c\u3552\u8abf\u5cf4\u42cf\ua3c9\u81d3\uf57c\u81ef\u475a\u37aa\ueaee\u0c1b\u9e78\ua858\u500e\u0acc\uf20f\u8fb3\u56b9\ub00b\u2b5b\uf56b\u1dbf\ua00c\ub6ce\u0fb4\u803e\u54cc\u7ced\u345b\u1ef8\u72c2\u9545\u8e75\ua7a0\ubbf3\u0c28\u1d31\u87db\ue2fb\u23e0\u8237\ub809"));
    }

    @Override
    public Iterator<Object> iterator() {
        return HdyI.Xm((ArrayList)cv.b(this, 768801611));
    }

    public Object get(int n) throws TOKE {
        Object object = this.oVCY(n);
        if (object == null) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(YEBy$TyVf.W("\ucb15\uf184\u8483\u196f\u2fd6\u50a9\uf524\ud78c\ucf92\uc74e")), n), YEBy$TyVf.W("\ucb02\uf1f7\u84a2\u194e\u2fe3\u50fb\uf530\ud782\ucf9e\uc77b\u1afc\uc91a"))));
        }
        return object;
    }

    public boolean getBoolean(int n) throws TOKE {
        block7 : {
            block6 : {
                Object object;
                block5 : {
                    block4 : {
                        object = this.get(n);
                        if (HdyI.Xm(object, (Boolean)cv.e(-1234961614)) != false) break block4;
                        if (!(object instanceof String)) break block5;
                        if (HdyI.Xm((String)object, rgig$AWxc.r("\u233d\u988f\udea8\u1271\u57f2")) == false) break block5;
                    }
                    return false;
                }
                if (HdyI.Xm(object, (Boolean)cv.e(-811926723)) != false) break block6;
                if (!(object instanceof String)) break block7;
                if (HdyI.Xm((String)object, rgig$AWxc.r("\u232f\u989c\udeb1\u1267")) == false) break block7;
            }
            return true;
        }
        throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(rgig$AWxc.r("\u2311\u98bd\ude8b\u124c\u57d6\u6afb\u7428\uc906\u4ba8\uad78")), n), rgig$AWxc.r("\u2306\u98ce\udead\u1271\u57b7\u6ae7\u7435\uc913\u4bf1\uad42\ue020\ua36d\u29a8\u0fec\u2433\u71b8\u3590\u24d9\u3825"))));
    }

    public double getDouble(int n) throws TOKE {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (double)HdyI.Xm((Number)object);
            }
            return (double)HdyI.Xm((String)object);
        }
        catch (Exception exception) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(rgig$AWxc.r("\u0fb1\ub2b9\u52ad\u3989\u7efe\u7194\u95fb\u434d\u0cda\u829e")), n), rgig$AWxc.r("\u0fa6\ub2ca\u528b\u39b4\u7e9f\u7188\u95e6\u4358\u0c83\u82a4\u27b8\uf9e3\u1ace\ua589\ue292\u6fe8\u8699\u0345"))));
        }
    }

    public <E extends Enum<E>> E ssNb(Class<E> class_, int n) throws TOKE {
        E e = this.DYFV(class_, n);
        if (e == null) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(YEBy$TyVf.W("\u215e\uea7e\u3d47\uf43b\uf570\u6b8b\ufc94\u9c39\u5b80\u5c3c\u91dc")), HdyI.Xm(HdyI.Xm(n))), YEBy$TyVf.W("\u2149\uea0d\u3d61\uf406\uf51f\u6b87\ufc91\u9c28\u5bc3\u5c29\u91e9\u0b60\u2211\u39dc\u7eab\ua381\uff23\u4237\u760e\u8e9c\u5861\u8e69\ub5b7\ue8aa\u9bb9")), HdyI.Xm(HdyI.Xm(class_))), YEBy$TyVf.W("\u213a"))));
        }
        return e;
    }

    public BigDecimal getBigDecimal(int n) throws TOKE {
        Object object = this.get(n);
        try {
            return new BigDecimal((String)HdyI.Xm(object));
        }
        catch (Exception exception) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(KUXS$dwji.S("\u3a65\ubd55\u29e3\uc8fa\ufdd2\ua35b\u4389\u5a2b\uef0d\u29b4")), n), KUXS$dwji.S("\u3a72\ubd26\u29cf\uc8db\ufde6\ua345\u439f\u5a6a\uef1a\u2980\ua773\uab88\uccec\u9fb0\u59eb\ubd65\u2a30\u2e5f\u5974\uc550\u3bdc\u1616\u2479\u555f\ua7c8\u2c14\u380b\u7ee8\u5bfa\u2221\u0fea\u186d\ubc8f\uc8c5"))));
        }
    }

    public BigInteger OOtu(int n) throws TOKE {
        Object object = this.get(n);
        try {
            return new BigInteger((String)HdyI.Xm(object));
        }
        catch (Exception exception) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(KUXS$dwji.S("\u9b0a\ufa6c\u05fb\u9777\u57cd\u6f30\udf6d\ud29e\ub529\ub7f7")), n), KUXS$dwji.S("\u9b1d\ufa1f\u05d7\u9756\u57f9\u6f2e\udf7b\ud2df\ub53e\ub7c3\u7f16\u1a41\u6e01\u0e17\u6d26\ub13f\u494d\u22a0\ucdc0\u08f6\u0cf8\uab67\ufa68\u30c9\u1164\u09a4\u7b9f\uff49\uac9f\ua1a5\ufc4f\u319c\uc11e\ubc1b"))));
        }
    }

    public int getInt(int n) throws TOKE {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (int)HdyI.Xm((Number)object);
            }
            return (int)HdyI.Xm((String)object);
        }
        catch (Exception exception) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(KUXS$dwji.S("\u4488\uc7e1\u31b9\u4d29\u0879\ub80a\u6edf\u856c\ub68b\u5c10")), n), KUXS$dwji.S("\u449f\uc792\u319f\u4d14\u0818\ub816\u6ec2\u8579\ub6d2\u5c2a\u9662\ud758\uf71a\u0c77\uc03d\ub999\ue622\ud928"))));
        }
    }

    public HdyI aLYV(int n) throws TOKE {
        Object object = this.get(n);
        if (object instanceof HdyI) {
            return (HdyI)object;
        }
        throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(KUXS$dwji.S("\uc9d0\uf471\u34b5\u550a\ue5c8\uf9c8\u1836\uf2f2\u5768\u075e")), n), KUXS$dwji.S("\uc9c7\uf402\u3493\u5537\ue5a9\uf9d4\u182b\uf2e7\u5731\u0764\udf71\uee20\u2293\u766f\u387c\ub824\u6842\u0c9f\u6e61\u6ff8\u4535"))));
    }

    public vslr Smci(int n) throws TOKE {
        Object object = this.get(n);
        if (object instanceof vslr) {
            return (vslr)object;
        }
        throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(KUXS$dwji.S("\uaf1a\ue96e\u8afe\ud300\ue93d\u2034\uc8c8\u81e7\u1926\u1bc5")), n), KUXS$dwji.S("\uaf0d\ue91d\u8ad8\ud33d\ue95c\u2028\uc8d5\u81f2\u197f\u1bff\u5509\u98e6\uf516\u3a88\u4405\ubef9\u2b21\ua33b\u60c4\ud2dc\ufe6a\uea7a"))));
    }

    public long getLong(int n) throws TOKE {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (long)HdyI.Xm((Number)object);
            }
            return (long)HdyI.Xm((String)object);
        }
        catch (Exception exception) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(YEBy$TyVf.W("\u0e1e\ua552\u799f\u82a4\ub2ac\u2fc5\ubaa0\u1367\uc3ba\ub1c5")), n), YEBy$TyVf.W("\u0e09\ua521\u79b9\u8299\ub2cd\u2fd9\ubabd\u1372\uc3e3\ub1ff\u0ec7\u8446\uef44\u4e8d\ua6e8\u547e\ub7dd\uca21"))));
        }
    }

    public String getString(int n) throws TOKE {
        Object object = this.get(n);
        if (object instanceof String) {
            return (String)object;
        }
        throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(KUXS$dwji.S("\u7ff5\ucaf1\u9a53\u491b\u58fd\u2758\u3b5b\u79a9\ue02d\ufd96")), n), KUXS$dwji.S("\u7fe2\uca82\u9a72\u493a\u58c8\u270a\u3b48\u79e8\ue027\ufdb9\uf40f\ua2be\u1763\ue0fa\u25e8"))));
    }

    public boolean isNull(int n) {
        return (boolean)HdyI.Xm(cv.e(-335152310), this.oVCY(n));
    }

    public String EmLA(String string) throws TOKE {
        int n = this.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                HdyI.Xm(stringBuilder, string);
            }
            HdyI.Xm(stringBuilder, HdyI.Xm(HdyI.Xm((ArrayList)cv.b(this, 768801611), i)));
        }
        return HdyI.Xm(stringBuilder);
    }

    public int length() {
        return (int)HdyI.Xm((ArrayList)cv.b(this, 768801611));
    }

    public Object oVCY(int n) {
        if (n < 0 || n >= this.length()) {
            return null;
        }
        return HdyI.Xm((ArrayList)cv.b(this, 768801611), n);
    }

    public boolean nImU(int n) {
        return this.DYFV(n, false);
    }

    public boolean DYFV(int n, boolean bl) {
        try {
            return this.getBoolean(n);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public double KwOT(int n) {
        return this.ssNb(n, Double.NaN);
    }

    public double ssNb(int n, double d) {
        try {
            return this.getDouble(n);
        }
        catch (Exception exception) {
            return d;
        }
    }

    public int KUKx(int n) {
        return this.OXeK(n, 0);
    }

    public int OXeK(int n, int n2) {
        try {
            return this.getInt(n);
        }
        catch (Exception exception) {
            return n2;
        }
    }

    public <E extends Enum<E>> E DYFV(Class<E> class_, int n) {
        return this.ssNb(class_, n, null);
    }

    public <E extends Enum<E>> E ssNb(Class<E> class_, int n, E e) {
        try {
            Object object = this.oVCY(n);
            if (HdyI.Xm(cv.e(-335152310), object) != false) {
                return e;
            }
            if (HdyI.Xm(class_, HdyI.Xm(object)) != false) {
                Enum enum_ = (Enum)object;
                return (E)enum_;
            }
            return (E)HdyI.Xm(class_, HdyI.Xm(object));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return e;
        }
        catch (NullPointerException nullPointerException) {
            return e;
        }
    }

    public BigInteger ssNb(int n, BigInteger bigInteger) {
        try {
            return this.OOtu(n);
        }
        catch (Exception exception) {
            return bigInteger;
        }
    }

    public BigDecimal ssNb(int n, BigDecimal bigDecimal) {
        try {
            return this.getBigDecimal(n);
        }
        catch (Exception exception) {
            return bigDecimal;
        }
    }

    public HdyI avmQ(int n) {
        Object object = this.oVCY(n);
        if (object instanceof HdyI) {
            return (HdyI)object;
        }
        return null;
    }

    public vslr CMSR(int n) {
        Object object = this.oVCY(n);
        if (object instanceof vslr) {
            return (vslr)object;
        }
        return null;
    }

    public long CoXE(int n) {
        return this.ssNb(n, 0);
    }

    public long ssNb(int n, long l) {
        try {
            return this.getLong(n);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public String ftyu(int n) {
        return this.ssNb(n, "");
    }

    public String ssNb(int n, String string) {
        Object object = this.oVCY(n);
        if (HdyI.Xm(cv.e(-335152310), object) != false) {
            return string;
        }
        return HdyI.Xm(object);
    }

    public HdyI vtFs(boolean bl) {
        this.ykmX(bl ? (Boolean)cv.e(-811926723) : (Boolean)cv.e(-1234961614));
        return this;
    }

    public HdyI ssNb(Collection<Object> collection) {
        this.ykmX(new HdyI(collection));
        return this;
    }

    public HdyI kQcX(double d) throws TOKE {
        Double d2 = new Double(d);
        HdyI.Xm(d2);
        this.ykmX(d2);
        return this;
    }

    public HdyI mXMK(int n) {
        this.ykmX(new Integer(n));
        return this;
    }

    public HdyI LGKl(long l) {
        this.ykmX(new Long(l));
        return this;
    }

    public HdyI ssNb(Map<String, Object> map) {
        this.ykmX(new vslr(map));
        return this;
    }

    public HdyI ykmX(Object object) {
        HdyI.Xm((ArrayList)cv.b(this, 768801611), object);
        return this;
    }

    public HdyI IWSm(int n, boolean bl) throws TOKE {
        this.ssNb(n, bl ? (Boolean)cv.e(-811926723) : (Boolean)cv.e(-1234961614));
        return this;
    }

    public HdyI ssNb(int n, Collection<Object> collection) throws TOKE {
        this.ssNb(n, new HdyI(collection));
        return this;
    }

    public HdyI DYFV(int n, double d) throws TOKE {
        this.ssNb(n, new Double(d));
        return this;
    }

    public HdyI YoSa(int n, int n2) throws TOKE {
        this.ssNb(n, new Integer(n2));
        return this;
    }

    public HdyI DYFV(int n, long l) throws TOKE {
        this.ssNb(n, new Long(l));
        return this;
    }

    public HdyI ssNb(int n, Map<String, Object> map) throws TOKE {
        this.ssNb(n, new vslr(map));
        return this;
    }

    public HdyI ssNb(int n, Object object) throws TOKE {
        HdyI.Xm(object);
        if (n < 0) {
            throw new TOKE((String)HdyI.Xm(HdyI.Xm(HdyI.Xm(new StringBuilder(rgig$AWxc.r("\u5b5f\u21ed\ua8ee\ue6d0\u75e1\ub1f6\u444e\uc140\u1af9\ua62b")), n), rgig$AWxc.r("\u5b48\u219e\ua8cf\ue6f1\u75d4\ub1a4\u445a\uc14e\u1af5\ua61e\u2f3f\u3d41"))));
        }
        if (n < this.length()) {
            HdyI.Xm((ArrayList)cv.b(this, 768801611), n, object);
        } else {
            while (n != this.length()) {
                this.ykmX(cv.e(-335152310));
            }
            this.ykmX(object);
        }
        return this;
    }

    public Object remove(int n) {
        if (n >= 0 && n < this.length()) {
            return HdyI.Xm((ArrayList)cv.b(this, 768801611), n);
        }
        return null;
    }

    public boolean rwyd(Object object) {
        if (!(object instanceof HdyI)) {
            return false;
        }
        int n = this.length();
        if (n != ((HdyI)object).length()) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            Object object2 = this.get(i);
            Object object3 = ((HdyI)object).get(i);
            if (object2 instanceof vslr) {
                if (HdyI.Xm((vslr)object2, object3) != false) continue;
                return false;
            }
            if (object2 instanceof HdyI) {
                if (((HdyI)object2).rwyd(object3)) continue;
                return false;
            }
            if (HdyI.Xm(object2, object3) != false) continue;
            return false;
        }
        return true;
    }

    public vslr ssNb(HdyI hdyI) throws TOKE {
        if (hdyI == null || hdyI.length() == 0 || this.length() == 0) {
            return null;
        }
        vslr vslr2 = new vslr();
        for (int i = 0; i < hdyI.length(); ++i) {
            HdyI.Xm(vslr2, hdyI.getString(i), this.oVCY(i));
        }
        return vslr2;
    }

    public String toString() {
        try {
            return this.toString(0);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString(int n) throws TOKE {
        StringWriter stringWriter = new StringWriter();
        Object object = HdyI.Xm(stringWriter);
        synchronized (object) {
            return HdyI.Xm(this.ssNb(stringWriter, n, 0));
        }
    }

    public Writer ssNb(Writer writer) throws TOKE {
        return this.ssNb(writer, 0, 0);
    }

    Writer ssNb(Writer writer, int n, int n2) throws TOKE {
        try {
            boolean bl = false;
            int n3 = this.length();
            HdyI.Xm(writer, 91);
            if (n3 == 1) {
                HdyI.Xm(writer, HdyI.Xm((ArrayList)cv.b(this, 768801611), false), n, n2);
            } else if (n3 != 0) {
                int n4 = n2 + n;
                for (int i = 0; i < n3; ++i) {
                    if (bl) {
                        HdyI.Xm(writer, 44);
                    }
                    if (n > 0) {
                        HdyI.Xm(writer, 10);
                    }
                    HdyI.Xm(writer, n4);
                    HdyI.Xm(writer, HdyI.Xm((ArrayList)cv.b(this, 768801611), i), n, n4);
                    bl = true;
                }
                if (n > 0) {
                    HdyI.Xm(writer, 10);
                }
                HdyI.Xm(writer, n2);
            }
            HdyI.Xm(writer, 93);
            return writer;
        }
        catch (IOException iOException) {
            throw new TOKE(iOException);
        }
    }

    private static Object Xm(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

