/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 *  org.bukkit.Location
 *  org.bukkit.block.Block
 *  org.bukkit.block.Hopper
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.block.BlockBurnEvent
 *  org.bukkit.event.block.BlockFadeEvent
 *  org.bukkit.event.block.BlockFormEvent
 *  org.bukkit.event.block.BlockFromToEvent
 *  org.bukkit.event.block.BlockPhysicsEvent
 *  org.bukkit.event.inventory.InventoryMoveItemEvent
 *  org.bukkit.inventory.InventoryHolder
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.Hopper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.InventoryHolder;

public class Jsoe
extends qloI {
    private aKuV<Location, Color> cdTn;
    private PBUD<Player> mrQw;

    @Override
    public void start() {
        Jsoe.RF(this);
        yy.E(this, -1870337032, new PBUD());
        yy.E(this, 1519905741, new aKuV());
    }

    @Override
    public void stop() {
        Jsoe.RF(this);
    }

    @Override
    public void tick() {
        Cnvn cnvn;
        PBUD pBUD = new PBUD();
        Object object = Jsoe.RF(Jsoe.RF((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366)));
        while (object.hasNext()) {
            cnvn = (Cnvn)object.next();
            if (Jsoe.RF(cnvn) == false) continue;
            Jsoe.RF(pBUD, Jsoe.RF(cnvn));
        }
        yy.E(this, -1870337032, pBUD);
        object = Jsoe.RF((aKuV)yy.h(this, 1519905741));
        do {
            if (Jsoe.RF(object) <= 200) break;
            cnvn = (Location)Jsoe.RF(Jsoe.RF(object));
            Jsoe.RF((aKuV)yy.h(this, 1519905741), cnvn, Jsoe.RF(object, cnvn));
            Jsoe.RF(object, cnvn);
        } while (true);
        Jsoe.RF((aKuV)yy.h(this, 1519905741));
        new Jsoe$1(this, (aKuV)object);
    }

    public boolean ksfs(Player player) {
        if (this.yJLL(player)) {
            if (((Boolean)yy.h(Jsoe.RF((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), -1210513664)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean yJLL(Player player) {
        return (boolean)Jsoe.RF((nSBH)((Object)yy.p(-1120008225)), player);
    }

    public void SnBs(Player player) {
        if (this.yJLL(player)) {
            yy.E(Jsoe.RF((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), -1210513664, (Boolean)yy.h(Jsoe.RF((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), -1210513664) == false);
            Jsoe.RF(player, (Boolean)yy.h(Jsoe.RF((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), -1210513664) != false ? (String)yy.p(-103552064) : (String)yy.p(513992981));
            return;
        }
        if (this.ksfs(player)) {
            yy.E(Jsoe.RF((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), -1210513664, false);
            Jsoe.RF(player, (Boolean)yy.h(Jsoe.RF((HSvh)yy.h((CLqw)yy.p(1998252577), 1050471366), player), -1210513664) != false ? (String)yy.p(-103552064) : (String)yy.p(513992981));
            return;
        }
        Jsoe.RF(player, (String)yy.p(-956765086));
    }

    @EventHandler
    public void mXJp(BlockPhysicsEvent blockPhysicsEvent) {
        if (Jsoe.RF((PBUD)yy.h(this, -1870337032)) > 0) {
            Object object = Jsoe.RF(Jsoe.RF(Jsoe.RF(blockPhysicsEvent).getLocation()), 0.5, 0.5, 0.5);
            Jsoe.RF((aKuV)yy.h(this, 1519905741), object, (Color)yy.p(-612767469));
        }
    }

    @EventHandler
    public void mXJp(BlockFromToEvent blockFromToEvent) {
        if (Jsoe.RF((PBUD)yy.h(this, -1870337032)) > 0) {
            Object object = Jsoe.RF(Jsoe.RF(Jsoe.RF(blockFromToEvent).getLocation()), 0.5, 0.5, 0.5);
            Jsoe.RF((aKuV)yy.h(this, 1519905741), object, (Color)yy.p(-513611511));
        }
    }

    @EventHandler
    public void mXJp(BlockBurnEvent blockBurnEvent) {
        if (Jsoe.RF((PBUD)yy.h(this, -1870337032)) > 0) {
            Object object = Jsoe.RF(Jsoe.RF(Jsoe.RF(blockBurnEvent).getLocation()), 0.5, 0.5, 0.5);
            Jsoe.RF((aKuV)yy.h(this, 1519905741), object, (Color)yy.p(710469906));
        }
    }

    @EventHandler
    public void mXJp(BlockFormEvent blockFormEvent) {
        if (Jsoe.RF((PBUD)yy.h(this, -1870337032)) > 0) {
            Object object = Jsoe.RF(Jsoe.RF(Jsoe.RF(blockFormEvent).getLocation()), 0.5, 0.5, 0.5);
            Jsoe.RF((aKuV)yy.h(this, 1519905741), object, (Color)yy.p(417851656));
        }
    }

    @EventHandler
    public void mXJp(BlockFadeEvent blockFadeEvent) {
        if (Jsoe.RF((PBUD)yy.h(this, -1870337032)) > 0) {
            Object object = Jsoe.RF(Jsoe.RF(Jsoe.RF(blockFadeEvent).getLocation()), 0.5, 0.5, 0.5);
            Jsoe.RF((aKuV)yy.h(this, 1519905741), object, (Color)yy.p(758311190));
        }
    }

    @EventHandler
    public void mXJp(InventoryMoveItemEvent inventoryMoveItemEvent) {
        if (Jsoe.RF((PBUD)yy.h(this, -1870337032)) > 0) {
            Object object = Jsoe.RF(inventoryMoveItemEvent);
            Object object2 = Jsoe.RF(inventoryMoveItemEvent);
            if (object.getHolder() instanceof Hopper && object2.getHolder() instanceof Hopper) {
                Hopper hopper = (Hopper)object2.getHolder();
                Object object3 = Jsoe.RF(Jsoe.RF(hopper.getBlock().getLocation()), 0.5, 0.5, 0.5);
                Jsoe.RF((aKuV)yy.h(this, 1519905741), object3, (Color)yy.p(1279781137));
            }
        }
    }

    static /* synthetic */ PBUD mXJp(Jsoe jsoe) {
        return (PBUD)yy.h(jsoe, -1870337032);
    }

    private static Object RF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

