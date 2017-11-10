/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.block.BlockBreakEvent
 *  org.bukkit.event.block.BlockBurnEvent
 *  org.bukkit.event.block.LeavesDecayEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.LeavesDecayEvent;

public class nteg
extends qloI {
    @Override
    public void start() {
        nteg.IZ(this);
    }

    @Override
    public void stop() {
        nteg.IZ(this);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void mXJp(BlockBreakEvent blockBreakEvent) {
        if (!((Boolean)yy.p(-760419217)).booleanValue()) {
            return;
        }
        this.mXJp((Block)nteg.IZ(blockBreakEvent));
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void mXJp(BlockBurnEvent blockBurnEvent) {
        if (!((Boolean)yy.p(-760419217)).booleanValue()) {
            return;
        }
        this.mXJp((Block)nteg.IZ(blockBurnEvent));
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void mXJp(LeavesDecayEvent leavesDecayEvent) {
        if (!((Boolean)yy.p(-760419217)).booleanValue()) {
            return;
        }
        this.mXJp((Block)nteg.IZ(leavesDecayEvent));
    }

    public void mXJp(Block block) {
        block5 : {
            block4 : {
                if (!((Boolean)yy.p(-760419217)).booleanValue()) {
                    return;
                }
                if (nteg.IZ(block.getType(), (Material)yy.p(-908530700)) != false) break block4;
                if (nteg.IZ(block.getType(), (Material)yy.p(1316940777)) != false) break block4;
                if (nteg.IZ(block.getType(), (Material)yy.p(1547037685)) != false) break block4;
                if (nteg.IZ(block.getType(), (Material)yy.p(2136271859)) == false) break block5;
            }
            aKuV aKuV2 = new aKuV();
            new nteg$1(this, 5, 5, block.getLocation(), aKuV2);
        }
    }

    @Override
    public void tick() {
    }

    private static Object IZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

