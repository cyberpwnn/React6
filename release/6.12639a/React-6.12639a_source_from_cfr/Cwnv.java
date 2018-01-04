/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=127)
public class Cwnv
extends FVgY
implements xyxr {
    private String text;
    private byte Dsek;
    private byte gWfi;
    private boolean FNwf = false;

    public Cwnv(String string, byte by) {
        super((String)Cwnv.be(Cwnv.be(new StringBuilder(nJPf$sILv.G("\u3615\u5ed6\ue228\u1e14\u7f4e\ubaa2\u07ea\u444c\u0eb3\ued07\u1215\u66ef")), string)), 1000);
        this.text = string;
        this.Dsek = by;
        this.gWfi = Cwnv.be(Cwnv.be(Cwnv.be(Cwnv.be(Cwnv.be(by)))));
    }

    @Override
    public void yJLS(UQqm uQqm) {
        if (!((Boolean)o.a(this, -1968548162)).booleanValue()) {
            reference var2_2 = Cwnv.be(uQqm) / 2;
            reference var3_3 = Cwnv.be(uQqm) / 2;
            Object object = Cwnv.be((pbAB)((Object)o.k(-366126761)), (String)o.a(this, 362632893)) + 6;
            Object object2 = Cwnv.be((pbAB)((Object)o.k(-366126761))) + 6;
            Object object3 = new UQqm((int)object, (int)object2);
            Cwnv.be(object3, ((Byte)o.a(this, -512731461)).byteValue());
            Cwnv.be(object3, 3, 3, (pbAB)((Object)o.k(-366126761)), Cwnv.be(false, false, false), (String)o.a(this, 362632893));
            Cwnv.be(object3, 2, 2, (pbAB)((Object)o.k(-366126761)), ((Byte)o.a(this, 311318858)).byteValue(), (String)o.a(this, 362632893));
            object3 = Cwnv.be(object3, 2.0, 2.0, true);
            object3 = Cwnv.be(object3, 1.5, 1.5, 2);
            object = Cwnv.be(object3);
            object2 = Cwnv.be(object3);
            Cwnv.be(uQqm, ((Byte)o.a(this, -512731461)).byteValue());
            Cwnv.be(uQqm, object3, var2_2 - object / 2, var3_3 - object2 / 2);
            o.v(this, -1968548162, true);
        }
    }

    public String getText() {
        return (String)o.a(this, 362632893);
    }

    public void setText(String string) {
        o.v(this, 362632893, string);
    }

    public byte IiDT() {
        return ((Byte)o.a(this, 311318858)).byteValue();
    }

    public void TEqA(byte by) {
        o.v(this, 311318858, Byte.valueOf(by));
    }

    public byte sjkR() {
        return ((Byte)o.a(this, -512731461)).byteValue();
    }

    public void UtIU(byte by) {
        o.v(this, -512731461, Byte.valueOf(by));
    }

    private static Object be(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

