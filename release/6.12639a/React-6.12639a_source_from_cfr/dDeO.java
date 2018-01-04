/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.World
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bukkit.World;

public class dDeO
implements hHjO {
    @mWxx(value="allow.rai")
    public boolean ooui = true;
    @mWxx(value="allow.actions")
    public boolean IrKD = true;
    @mWxx(value="allow.relighting")
    public boolean tfTV = true;
    @mWxx(value="allow.tile-throttling")
    public boolean DQXn = true;
    @mWxx(value="allow.entity-throttling")
    public boolean kBHE = true;
    @mWxx(value="allow.fast-leaf-decay")
    public boolean Kwoh = true;
    @mWxx(value="entities.assume-no-side-effects")
    public List<String> LYQO = new ArrayList<String>((Collection<String>)dDeO.DQ(new feCR(), FMkR$WjFM.a("\u8980\u8f4e\uef33\u84a9\u24d0\u646c\ua3b6\u73c9\uf472\u18d6\u1d20")));

    public File HeSD(World world) {
        return new File((File)dDeO.DQ((String)o.k(257184551)), (String)dDeO.DQ(dDeO.DQ(dDeO.DQ(dDeO.DQ(new StringBuilder((String)dDeO.DQ(world.getName())), FMkR$WjFM.a("\uf6fb")), world.getSeed()), (String)o.k(-195997137))));
    }

    public void Ipep(World world) {
        if (!((Boolean)o.k(-965979355)).booleanValue()) {
            return;
        }
        try {
            dDeO.DQ(new ncmw(), this, this.HeSD(world));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            dDeO.DQ(exception);
            return;
        }
    }

    public void qcvH(World world) {
        if (!((Boolean)o.k(-965979355)).booleanValue()) {
            return;
        }
        try {
            dDeO.DQ(new EShD(), this, this.HeSD(world));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            dDeO.DQ(exception);
            return;
        }
    }

    private static Object DQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

