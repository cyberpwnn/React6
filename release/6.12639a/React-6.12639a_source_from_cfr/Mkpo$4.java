/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class Mkpo$4
extends JJHM {
    final /* synthetic */ Mkpo uWeE;
    private final /* synthetic */ xynF gFNH;
    private final /* synthetic */ yJSB uqWq;
    private final /* synthetic */ yJSB Ipxq;

    Mkpo$4(Mkpo mkpo, String string, int n, xynF xynF2, yJSB yJSB2, yJSB yJSB3) {
        this.uWeE = mkpo;
        this.gFNH = xynF2;
        this.uqWq = yJSB2;
        this.Ipxq = yJSB3;
        super(string, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (Mkpo$4.ke() - Mkpo$4.ke((Mkpo)o.a(this, -1550826364)) <= 100) return;
        if (Mkpo$4.ke(Mkpo$4.ke((Mkpo)o.a(this, -1550826364)), (ooQj)o.k(1731151092)) == false) return;
        this.cancel();
        Mkpo$4.ke((Mkpo)o.a(this, -1550826364));
        if (Mkpo$4.ke((yJSB)o.a(this, -1147252881)) > true) ** GOTO lbl-1000
        if (Mkpo$4.ke((yJSB)o.a(this, -1147252881)) == false) lbl-1000: // 2 sources:
        {
            v0 = FMkR$WjFM.a("\udb23");
        } else {
            v0 = "";
        }
        ((xynF)o.a(this, -499888271)).biLo((String)Mkpo$4.ke(Mkpo$4.ke(Mkpo$4.ke(Mkpo$4.ke(Mkpo$4.ke(Mkpo$4.ke(new StringBuilder((String)Mkpo$4.ke(Mkpo$4.ke(FMkR$WjFM.a("\udb31\u74b1\uf251\uf8b7\uf35d\u5203\ue412\ua0ff\u5397\uc045\u67ca\u3e24\u5a47\u5221\ua2eb\u59c4\uf5c7\u0330\u8cae\u8f0c\u2d61\ufbe1\u0305\u33e4\u3836\u83fa\u7aa7\u87e6")))), Mkpo$4.ke(Mkpo$4.ke((yJSB)o.a(this, 335695728)))), Mkpo$4.ke(FMkR$WjFM.a("\udb31\u74b1\uf251\uf8b7\uf35d\u5203\ue412\ua0ff\u5397\uc045\u67ca\u3e24\u5a47\u5221\ua2eb\u59c4\uf5c7\u0330\u8cae\u8f0c\u2d61\ufbe1\u0310\u33ff\u3830\u83f4\u7ab6\u87eb\u5e31\u8ed7\u1b84\u079a\u954f"))), Mkpo$4.ke(Mkpo$4.ke((yJSB)o.a(this, -1147252881)))), Mkpo$4.ke(FMkR$WjFM.a("\udb31\u74b1\uf251\uf8b7\uf35d\u5203\ue412\ua0ff\u5397\uc045\u67ca\u3e24\u5a47\u5221\ua2eb\u59c4\uf5c7\u0330\u8cae\u8f0c\u2d61\ufbe1\u0316\u33f9\u3831\u83f3\u7aa9"))), v0)));
    }

    private static Object ke(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

