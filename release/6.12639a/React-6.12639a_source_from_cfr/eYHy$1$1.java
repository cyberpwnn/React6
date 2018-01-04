/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;

class eYHy$1$1
extends xGOy {
    final /* synthetic */ eYHy.1 Aaca;
    private final /* synthetic */ CommandSender USIc;
    private final /* synthetic */ String VgQK;
    private final /* synthetic */ TNku Vwpp;
    private final /* synthetic */ int TaKL;

    eYHy$1$1(eYHy.1 var1_1, CommandSender commandSender, String string, TNku tNku, int n) {
        this.Aaca = var1_1;
        this.USIc = commandSender;
        this.VgQK = string;
        this.Vwpp = tNku;
        this.TaKL = n;
    }

    @Override
    public void run() {
        eYHy$1$1.Ov((CommandSender)o.a(this, 1605456483), eYHy$1$1.Ov(eYHy$1$1.Ov(eYHy$1$1.Ov(eYHy$1$1.Ov(eYHy$1$1.Ov(new StringBuilder((String)eYHy$1$1.Ov((String)o.a(this, 1951945298))), (psKX)((Object)o.k(692209039))), (psKX)((Object)o.k(-23312902))), FMkR$WjFM.a("\u5d45\u6e9c")), eYHy$1$1.Ov((Object)eYHy$1$1.Ov((Integer)eYHy$1$1.Ov((TNku)o.a(this, 502223441), (String)o.a(this, 1951945298))) / (double)((Integer)o.a(this, -1202433456)).intValue(), true))));
    }

    private static Object Ov(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

