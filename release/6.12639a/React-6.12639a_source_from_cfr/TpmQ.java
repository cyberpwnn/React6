/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.block.BlockBreakEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;

public class TpmQ
extends ggmf {
    @Override
    public void start() {
        TpmQ.GK(this);
    }

    @Override
    public void stop() {
        TpmQ.GK(this);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(BlockBreakEvent blockBreakEvent) {
        if (!((Boolean)o.k(509761784)).booleanValue()) {
            return;
        }
        this.biLo((Block)TpmQ.GK(blockBreakEvent));
    }

    public void biLo(Block block) {
        block6 : {
            block5 : {
                if (!((Boolean)o.k(509761784)).booleanValue()) {
                    return;
                }
                if (!((Boolean)o.a(TpmQ.GK(block.getWorld()), 1579374872)).booleanValue()) {
                    return;
                }
                if (TpmQ.GK(block.getType(), (Material)o.k(23746831)) != false) break block5;
                if (TpmQ.GK(block.getType(), (Material)o.k(-1966581490)) != false) break block5;
                if (TpmQ.GK(block.getType(), (Material)o.k(-1696376559)) != false) break block5;
                if (TpmQ.GK(block.getType(), (Material)o.k(1018255632)) == false) break block6;
            }
            TNku tNku = new TNku();
            new TpmQ$1(this, 5, 5, block.getLocation(), tNku);
        }
    }

    public void VwLY(Block block) {
        new TpmQ$2(this, block);
    }

    @Override
    public void tick() {
    }

    private static Object GK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

