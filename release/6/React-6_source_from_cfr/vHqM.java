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

public class vHqM
implements Iterable<Object> {
    private final ArrayList<Object> inDC = new ArrayList();

    public vHqM() {
    }

    public vHqM(RjaO rjaO) throws Bkpl {
        this();
        if (vHqM.hQ(rjaO) != 91) {
            throw vHqM.hQ(rjaO, BkvY$LhxG.I("\ub7ec\u23b3\ubbb1\u45f0\u2bc2\ufd08\u8296\uf30c\u4e66\ubfea\ub629\uf9a5\u5f7f\u180c\ubb96\u5358\u99f7\u4213\u6e24\ufc67\ub227\u0b79\u38e0\u0e02\u44c3\ufc63\uc139\u59bc\u0c36\uc11e\u5c6e\uf0f3\u471b\u761c\uad00\u1b80"));
        }
        if (vHqM.hQ(rjaO) != 93) {
            vHqM.hQ(rjaO);
            block4 : do {
                if (vHqM.hQ(rjaO) == 44) {
                    vHqM.hQ(rjaO);
                    vHqM.hQ((ArrayList)yy.h(this, 855900610), yy.p(-1977613833));
                } else {
                    vHqM.hQ(rjaO);
                    vHqM.hQ((ArrayList)yy.h(this, 855900610), vHqM.hQ(rjaO));
                }
                switch (vHqM.hQ(rjaO)) {
                    case 44: {
                        if (vHqM.hQ(rjaO) == 93) {
                            return;
                        }
                        vHqM.hQ(rjaO);
                        continue block4;
                    }
                    case 93: {
                        return;
                    }
                }
                break;
            } while (true);
            throw vHqM.hQ(rjaO, BkvY$LhxG.I("\ub7e8\u23eb\ubb8b\u45c6\u2bee\ufd32\u82b2\uf31a\u4e34\ubfea\ub670\uf9a2\u5f27\u184e\ubbce\u5343\u99a5\u425e\u6e76\ufc49\ub274"));
        }
    }

    public vHqM(String string) throws Bkpl {
        this(new RjaO(string));
    }

    public vHqM(Collection<Object> collection) {
        if (collection != null) {
            Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                vHqM.hQ((ArrayList)yy.h(this, 855900610), vHqM.hQ(iterator.next()));
            }
        }
    }

    public vHqM(Object object) throws Bkpl {
        this();
        if (vHqM.hQ(vHqM.hQ(object)) != false) {
            Object object2 = vHqM.hQ(object);
            for (int i = 0; i < object2; ++i) {
                this.qAsQ(vHqM.hQ(vHqM.hQ(object, i)));
            }
            return;
        }
        throw new Bkpl(BkvY$LhxG.I("\ub7e7\u23c0\ubbb4\u45ed\u2bcc\ufd34\u82a5\uf31f\u4e6d\ubfab\ub639\uf9eb\u5f62\u181d\ubb87\u534d\u99bb\u425e\u6e27\ufc75\ub23f\u0b2c\u38f6\u0e56\u44d1\ufc79\uc122\u59e9\u0c2d\uc113\u5c3a\uf0f9\u475e\u761b\uad3a\u1b87\ubf74\u94c9\u7015\ued29\u04e9\ue6a0\u4284\ua6bb\u9f1f\u9b0f\u2fdd\ud748\u0701\ue8af\u583d\ucfa2\uf008\u7d53\ue2ad\uaccc\u1366\udb37\u282f\uf817\u05df\u92f6\ua4ab\u55a8\u7bb9\ud0f6"));
    }

    @Override
    public Iterator<Object> iterator() {
        return vHqM.hQ((ArrayList)yy.h(this, 855900610));
    }

    public Object get(int n) throws Bkpl {
        Object object = this.Ralc(n);
        if (object == null) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(KDGY$JAHk.Y("\ub829\ucb6f\u677a\u37d0\udc67\u9e96\u246b\ucf0b\ud6d0\uff46")), n), KDGY$JAHk.Y("\ub83e\ucb1c\u675b\u37f1\udc52\u9ec4\u247f\ucf05\ud6dc\uff73\u9038\u5cd0"))));
        }
        return object;
    }

    public boolean getBoolean(int n) throws Bkpl {
        block7 : {
            block6 : {
                Object object;
                block5 : {
                    block4 : {
                        object = this.get(n);
                        if (vHqM.hQ(object, (Boolean)yy.p(1132200383)) != false) break block4;
                        if (!(object instanceof String)) break block5;
                        if (vHqM.hQ((String)object, KDGY$JAHk.Y("\u6dab\u20e0\ude6e\u5deb\u1068")) == false) break block5;
                    }
                    return false;
                }
                if (vHqM.hQ(object, (Boolean)yy.p(-203750976)) != false) break block6;
                if (!(object instanceof String)) break block7;
                if (vHqM.hQ((String)object, KDGY$JAHk.Y("\u6db9\u20f3\ude77\u5dfd")) == false) break block7;
            }
            return true;
        }
        throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(KDGY$JAHk.Y("\u6d87\u20d2\ude4d\u5dd6\u104c\u227a\u405e\uae48\u265a\ubde3")), n), KDGY$JAHk.Y("\u6d90\u20a1\ude6b\u5deb\u102d\u2266\u4043\uae5d\u2603\ubdd9\u39a2\u5fe7\u30d6\u9988\uffd2\uf722\u26d2\ub785\u2a60"))));
    }

    public double getDouble(int n) throws Bkpl {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (double)vHqM.hQ((Number)object);
            }
            return (double)vHqM.hQ((String)object);
        }
        catch (Exception exception) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(KDGY$JAHk.Y("\ua9a5\u9381\u4e12\u50e6\u55bf\uf359\u337a\u6ab4\u1ff9\ub953")), n), KDGY$JAHk.Y("\ua9b2\u93f2\u4e34\u50db\u55de\uf345\u3367\u6aa1\u1fa0\ub969\ucac1\u47bd\u2ace\uec4b\ud79d\u53be\u85d8\u8573"))));
        }
    }

    public <E extends Enum<E>> E mXJp(Class<E> class_, int n) throws Bkpl {
        E e = this.ksfs(class_, n);
        if (e == null) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(NVIs$JbpD.H("\u9ece\u3074\ucc09\ufd50\u7c5e\ud10b\ua634\u5205\ud09f\u3df6\uc60e")), vHqM.hQ(vHqM.hQ(n))), NVIs$JbpD.H("\u9ed9\u3007\ucc2f\ufd6d\u7c31\ud107\ua631\u5214\ud0dc\u3de3\uc63b\u4098\u1fe1\ue9dc\uf134\u03e7\ua691\u822e\u9207\u0704\u1642\u268e\u74b1\uead2\uf41d")), vHqM.hQ(vHqM.hQ(class_))), NVIs$JbpD.H("\u9eaa"))));
        }
        return e;
    }

    public BigDecimal getBigDecimal(int n) throws Bkpl {
        Object object = this.get(n);
        try {
            return new BigDecimal((String)vHqM.hQ(object));
        }
        catch (Exception exception) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(BkvY$LhxG.I("\ubb94\udcd7\u8b5e\u26b3\u9b37\u397d\u3d9c\ufa9e\uc8be\u193e")), n), BkvY$LhxG.I("\ubb83\udca4\u8b72\u2692\u9b03\u3963\u3d8a\ufadf\uc8a9\u190a\ue613\uf14f\u2d9f\u04d5\ue86d\u2b65\u0127\u4497\ub6f7\u48af\u883c\u8617\u75ef\u34e5\u0b34\u0324\u6f43\u1fa1\u01b4\uc9f1\uc70d\u7af3\uc1ca\uc599"))));
        }
    }

    public BigInteger yIkA(int n) throws Bkpl {
        Object object = this.get(n);
        try {
            return new BigInteger((String)vHqM.hQ(object));
        }
        catch (Exception exception) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(BkvY$LhxG.I("\u7f61\u9d58\uf2ed\u0f10\u0129\u5230\ufa2b\ucb1b\u1448\u6996")), n), BkvY$LhxG.I("\u7f76\u9d2b\uf2c1\u0f31\u011d\u522e\ufa3d\ucb5a\u145f\u69a2\u0e0f\u886f\uc243\u1479\u6a9f\ufd69\ucc45\u282c\ucc28\ub342\ue5e4\ua1c2\u2ee7\ufe84\u9c0d\u2264\ucbbc\u5e45\u6c6c\ud400\u2fd8\ub6f8\uac36\u907f"))));
        }
    }

    public int getInt(int n) throws Bkpl {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (int)vHqM.hQ((Number)object);
            }
            return (int)vHqM.hQ((String)object);
        }
        catch (Exception exception) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(NVIs$JbpD.H("\udc05\u0937\ue19b\u565a\u951b\uf543\u32c5\u0948\u9432\u8e46")), n), NVIs$JbpD.H("\udc12\u0944\ue1bd\u5667\u957a\uf55f\u32d8\u095d\u946b\u8e7c\u3aa2\ua973\u920a\uf34d\uc934\u876a\ue5c5\u6e50"))));
        }
    }

    public vHqM qArm(int n) throws Bkpl {
        Object object = this.get(n);
        if (object instanceof vHqM) {
            return (vHqM)object;
        }
        throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(KDGY$JAHk.Y("\u4acf\u9a46\u5aac\ufe51\u5663\u5385\u83bb\u2235\u9c3f\u35ab")), n), KDGY$JAHk.Y("\u4ad8\u9a35\u5a8a\ufe6c\u5602\u5399\u83a6\u2220\u9c66\u3591\ubfa1\ue4fc\u18c1\u2f57\udd5c\ud22c\u981a\u3370\ub3f3\u8eae\u144d"))));
    }

    public jhSC Fomb(int n) throws Bkpl {
        Object object = this.get(n);
        if (object instanceof jhSC) {
            return (jhSC)object;
        }
        throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(KDGY$JAHk.Y("\ud63d\ufa53\ufced\u17be\u8ab4\ueffb\uaf50\u87d1\u79c3\u2771")), n), KDGY$JAHk.Y("\ud62a\ufa20\ufccb\u1783\u8ad5\uefe7\uaf4d\u87c4\u799a\u274b\u316a\ua34c\u10e6\ufaf2\u201a\u6794\u7511\u91ea\uf9a0\u2ff8\u7575\u8c54"))));
    }

    public long getLong(int n) throws Bkpl {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (long)vHqM.hQ((Number)object);
            }
            return (long)vHqM.hQ((String)object);
        }
        catch (Exception exception) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(KDGY$JAHk.Y("\u1cd2\u2d8d\u5f43\u1efb\u9720\u1f71\u9bd2\u80f4\ua263\ub583")), n), KDGY$JAHk.Y("\u1cc5\u2dfe\u5f65\u1ec6\u9741\u1f6d\u9bcf\u80e1\ua23a\ub5b9\u5457\ua8f0\u733c\uba9d\u84e3\u496c\u9ff8\ub961"))));
        }
    }

    public String getString(int n) throws Bkpl {
        Object object = this.get(n);
        if (object instanceof String) {
            return (String)object;
        }
        throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(BkvY$LhxG.I("\ua809\u4abf\uf448\ufa4d\uf968\u31db\u5569\uf7dd\ue091\u68be")), n), BkvY$LhxG.I("\ua81e\u4acc\uf469\ufa6c\uf95d\u3189\u557a\uf79c\ue09b\u6891\ub1e6\u7ee2\u5a76\u531a\uf0f0"))));
    }

    public boolean isNull(int n) {
        return (boolean)vHqM.hQ(yy.p(-1977613833), this.Ralc(n));
    }

    public String qdWJ(String string) throws Bkpl {
        int n = this.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                vHqM.hQ(stringBuilder, string);
            }
            vHqM.hQ(stringBuilder, vHqM.hQ(vHqM.hQ((ArrayList)yy.h(this, 855900610), i)));
        }
        return vHqM.hQ(stringBuilder);
    }

    public int length() {
        return (int)vHqM.hQ((ArrayList)yy.h(this, 855900610));
    }

    public Object Ralc(int n) {
        if (n < 0 || n >= this.length()) {
            return null;
        }
        return vHqM.hQ((ArrayList)yy.h(this, 855900610), n);
    }

    public boolean SnAm(int n) {
        return this.mXJp(n, false);
    }

    public boolean mXJp(int n, boolean bl) {
        try {
            return this.getBoolean(n);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public double SBla(int n) {
        return this.mXJp(n, Double.NaN);
    }

    public double mXJp(int n, double d) {
        try {
            return this.getDouble(n);
        }
        catch (Exception exception) {
            return d;
        }
    }

    public int gois(int n) {
        return this.SnBs(n, 0);
    }

    public int SnBs(int n, int n2) {
        try {
            return this.getInt(n);
        }
        catch (Exception exception) {
            return n2;
        }
    }

    public <E extends Enum<E>> E ksfs(Class<E> class_, int n) {
        return this.mXJp(class_, n, null);
    }

    public <E extends Enum<E>> E mXJp(Class<E> class_, int n, E e) {
        try {
            Object object = this.Ralc(n);
            if (vHqM.hQ(yy.p(-1977613833), object) != false) {
                return e;
            }
            if (vHqM.hQ(class_, vHqM.hQ(object)) != false) {
                Enum enum_ = (Enum)object;
                return (E)enum_;
            }
            return (E)vHqM.hQ(class_, vHqM.hQ(object));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return e;
        }
        catch (NullPointerException nullPointerException) {
            return e;
        }
    }

    public BigInteger mXJp(int n, BigInteger bigInteger) {
        try {
            return this.yIkA(n);
        }
        catch (Exception exception) {
            return bigInteger;
        }
    }

    public BigDecimal mXJp(int n, BigDecimal bigDecimal) {
        try {
            return this.getBigDecimal(n);
        }
        catch (Exception exception) {
            return bigDecimal;
        }
    }

    public vHqM JjvV(int n) {
        Object object = this.Ralc(n);
        if (object instanceof vHqM) {
            return (vHqM)object;
        }
        return null;
    }

    public jhSC PBUD(int n) {
        Object object = this.Ralc(n);
        if (object instanceof jhSC) {
            return (jhSC)object;
        }
        return null;
    }

    public long ePQp(int n) {
        return this.mXJp(n, 0);
    }

    public long mXJp(int n, long l) {
        try {
            return this.getLong(n);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public String aKuV(int n) {
        return this.mXJp(n, "");
    }

    public String mXJp(int n, String string) {
        Object object = this.Ralc(n);
        if (vHqM.hQ(yy.p(-1977613833), object) != false) {
            return string;
        }
        return vHqM.hQ(object);
    }

    public vHqM ksfs(boolean bl) {
        this.qAsQ(bl ? (Boolean)yy.p(-203750976) : (Boolean)yy.p(1132200383));
        return this;
    }

    public vHqM mXJp(Collection<Object> collection) {
        this.qAsQ(new vHqM(collection));
        return this;
    }

    public vHqM yIkI(double d) throws Bkpl {
        Double d2 = new Double(d);
        vHqM.hQ(d2);
        this.qAsQ(d2);
        return this;
    }

    public vHqM KDGY(int n) {
        this.qAsQ(new Integer(n));
        return this;
    }

    public vHqM gUxV(long l) {
        this.qAsQ(new Long(l));
        return this;
    }

    public vHqM mXJp(Map<String, Object> map) {
        this.qAsQ(new jhSC(map));
        return this;
    }

    public vHqM qAsQ(Object object) {
        vHqM.hQ((ArrayList)yy.h(this, 855900610), object);
        return this;
    }

    public vHqM ksfs(int n, boolean bl) throws Bkpl {
        this.mXJp(n, bl ? (Boolean)yy.p(-203750976) : (Boolean)yy.p(1132200383));
        return this;
    }

    public vHqM mXJp(int n, Collection<Object> collection) throws Bkpl {
        this.mXJp(n, new vHqM(collection));
        return this;
    }

    public vHqM ksfs(int n, double d) throws Bkpl {
        this.mXJp(n, new Double(d));
        return this;
    }

    public vHqM qdWJ(int n, int n2) throws Bkpl {
        this.mXJp(n, new Integer(n2));
        return this;
    }

    public vHqM ksfs(int n, long l) throws Bkpl {
        this.mXJp(n, new Long(l));
        return this;
    }

    public vHqM mXJp(int n, Map<String, Object> map) throws Bkpl {
        this.mXJp(n, new jhSC(map));
        return this;
    }

    public vHqM mXJp(int n, Object object) throws Bkpl {
        vHqM.hQ(object);
        if (n < 0) {
            throw new Bkpl((String)vHqM.hQ(vHqM.hQ(vHqM.hQ(new StringBuilder(KDGY$JAHk.Y("\u5c18\uec73\u5209\u469f\ua7a1\ub2bc\ue2ce\ufe59\ua0d3\u88ab")), n), KDGY$JAHk.Y("\u5c0f\uec00\u5228\u46be\ua794\ub2ee\ue2da\ufe57\ua0df\u889e\u10c2\u5357"))));
        }
        if (n < this.length()) {
            vHqM.hQ((ArrayList)yy.h(this, 855900610), n, object);
        } else {
            while (n != this.length()) {
                this.qAsQ(yy.p(-1977613833));
            }
            this.qAsQ(object);
        }
        return this;
    }

    public Object remove(int n) {
        if (n >= 0 && n < this.length()) {
            return vHqM.hQ((ArrayList)yy.h(this, 855900610), n);
        }
        return null;
    }

    public boolean gUxV(Object object) {
        if (!(object instanceof vHqM)) {
            return false;
        }
        int n = this.length();
        if (n != ((vHqM)object).length()) {
            return false;
        }
        for (int i = 0; i < n; ++i) {
            Object object2 = this.get(i);
            Object object3 = ((vHqM)object).get(i);
            if (object2 instanceof jhSC) {
                if (vHqM.hQ((jhSC)object2, object3) != false) continue;
                return false;
            }
            if (object2 instanceof vHqM) {
                if (((vHqM)object2).gUxV(object3)) continue;
                return false;
            }
            if (vHqM.hQ(object2, object3) != false) continue;
            return false;
        }
        return true;
    }

    public jhSC mXJp(vHqM vHqM2) throws Bkpl {
        if (vHqM2 == null || vHqM2.length() == 0 || this.length() == 0) {
            return null;
        }
        jhSC jhSC2 = new jhSC();
        for (int i = 0; i < vHqM2.length(); ++i) {
            vHqM.hQ(jhSC2, vHqM2.getString(i), this.Ralc(i));
        }
        return jhSC2;
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
    public String toString(int n) throws Bkpl {
        StringWriter stringWriter = new StringWriter();
        Object object = vHqM.hQ(stringWriter);
        synchronized (object) {
            return vHqM.hQ(this.mXJp(stringWriter, n, 0));
        }
    }

    public Writer mXJp(Writer writer) throws Bkpl {
        return this.mXJp(writer, 0, 0);
    }

    Writer mXJp(Writer writer, int n, int n2) throws Bkpl {
        try {
            boolean bl = false;
            int n3 = this.length();
            vHqM.hQ(writer, 91);
            if (n3 == 1) {
                vHqM.hQ(writer, vHqM.hQ((ArrayList)yy.h(this, 855900610), false), n, n2);
            } else if (n3 != 0) {
                int n4 = n2 + n;
                for (int i = 0; i < n3; ++i) {
                    if (bl) {
                        vHqM.hQ(writer, 44);
                    }
                    if (n > 0) {
                        vHqM.hQ(writer, 10);
                    }
                    vHqM.hQ(writer, n4);
                    vHqM.hQ(writer, vHqM.hQ((ArrayList)yy.h(this, 855900610), i), n, n4);
                    bl = true;
                }
                if (n > 0) {
                    vHqM.hQ(writer, 10);
                }
                vHqM.hQ(writer, n2);
            }
            vHqM.hQ(writer, 93);
            return writer;
        }
        catch (IOException iOException) {
            throw new Bkpl(iOException);
        }
    }

    private static Object hQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

