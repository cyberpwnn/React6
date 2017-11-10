/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hdte
extends fJhK {
    public Hdte() {
        super(Chunk.class, (DijM)((Object)yy.p(-751310334)));
    }

    public void yJLL(Chunk chunk) {
        Hdte.Fa(this.aela(), chunk);
    }

    public void mXJp(Chunk chunk, int n) {
        Hdte.Fa(this.aela(), Hdte.Fa(chunk, n));
    }

    public void mXJp(World world) {
        for (Chunk chunk : world.getLoadedChunks()) {
            this.yJLL(chunk);
        }
    }

    public void Nwie() {
        Iterator iterator = Hdte.Fa().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            this.mXJp(world);
        }
    }

    @Override
    public int qdWJ(CommandSender commandSender, String string) throws Foor {
        hGxw hGxw2 = new hGxw();
        if (Hdte.Fa(string, BkvY$LhxG.I("\udd29\u7180")) != false) {
            throw new Foor(BkvY$LhxG.I("\udd4c\u71c7\u709d\u96e2\u2d14\u81e9\u5b01\u0797\u95cc\u0a67\uc0b9\uadea\uc0c4\u3a07\u1f67\u103b\u440a\ufcf4\u8367\u9e68\ud405\ube58\u0877\u2960\u3b3d\u5bd9\ud3ac\udfb1\uabdb\u51e0\udc8c\u403e\uf40a\uaaaa"));
        }
        if (Hdte.Fa(string, BkvY$LhxG.I("\udd29")) != false) {
            for (String string2 : (String[])Hdte.Fa(string, BkvY$LhxG.I("\udd29"))) {
                Object object = Hdte.Fa(string2, BkvY$LhxG.I("\udd2e"));
                Object object2 = Hdte.Fa(this.halY(commandSender, (String)(object != false ? Hdte.Fa(string2, true) : string2)));
                while (object2.hasNext()) {
                    Chunk chunk = (Chunk)object2.next();
                    if (object != false) {
                        Hdte.Fa(hGxw2, chunk);
                        continue;
                    }
                    Hdte.Fa(hGxw2, chunk);
                }
            }
        } else {
            if (Hdte.Fa(string, BkvY$LhxG.I("\udd2e")) != false) {
                throw new Foor(BkvY$LhxG.I("\udd4c\u71c7\u709d\u96e2\u2d14\u81e9\u5b01\u078c\u95da\u0a65\uc0f8\uadbc\uc087\u3a01\u1f23\u1067\u4445\ufccd\u832f\u9e6f\ud419\ube0c\u0876\u297a\u3b3d\u5bca\ud3a2\udffb\uabef\u51e5\udc88\u403e\uf40c\uaa89\uf7fd\ufb39\u29b7\u44d3\u2800\ue328\u9317\u96d4\uaf36\u9237\u5949\ue646\u04ce\u45b3\u4719\u06bc\u3df5\u9843\ub93f\uf905\ud67d\u6a38\u53de\u9199\u0684\uee5b"));
            }
            Object object = Hdte.Fa(this.halY(commandSender, string));
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                Hdte.Fa(hGxw2, chunk);
            }
        }
        Hdte.Fa(this.aela(), hGxw2);
        return (int)Hdte.Fa(hGxw2);
    }

    public hGxw<Chunk> halY(CommandSender commandSender, String string) throws Foor {
        hGxw<Chunk> hGxw2 = new hGxw<Chunk>();
        if (Hdte.Fa(string, BkvY$LhxG.I("\u9309\u7e57\u8e68\u78cb")) != false) {
            Object object = 0;
            Object object2 = null;
            if (!(commandSender instanceof Player)) {
                throw new Foor(BkvY$LhxG.I("\u9332\u7e51\u8e6d\u78c1\ua95c\u9191\u9530\u9a30\u959a\ubc56\ub4bb\ubc09\uea76\u3a20\u5d65\ub803\ubdac\u5cc5\uff68\u06d6\u0c9e\ue729\u4705\u4e08\u59c4\ud61c\uac89\u35cf\u1d55\ub440\u8f05\uc299\udf39\u575c\ua370\u84c6\u9a8d\ufdef\uc3f1\ud647\u5873\u3f3f\u44b5\u851a\u2b87\uac0e\u95ec\u283d\u698b\u5822\u52cb\u8eba\ude79\u6dc4\ubcde\u1f73\u8c6c\u14e9\u5d21\u1e27\u37b8\u6c7e\u6a84\u0faa\u58a1\ue5fd\u666e\u11d4\ud8e9"));
            }
            object2 = Hdte.Fa(((Player)commandSender).getLocation());
            if (Hdte.Fa(string, BkvY$LhxG.I("\u9356")) != false) {
                try {
                    object = Hdte.Fa(Hdte.Fa(((String[])Hdte.Fa(string, BkvY$LhxG.I("\u9321\u7e14")))[1]));
                }
                catch (NumberFormatException numberFormatException) {
                    throw new Foor((String)Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u9328\u7e51\u8e60\u78da\ua910\u9184\u957c\u9a25\u958c\ubc13\ub4b9\ubc1b\uea24\u3a30\u5d61\ub84d\ubde5\u5cde\uff6f\u06d6\u0cd9\ue738\u471f\u4e57\u59c4")), ((String[])Hdte.Fa(string, BkvY$LhxG.I("\u9356")))[1])));
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    Hdte.Fa(exception);
                    throw new Foor((String)Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u9328\u7e51\u8e60\u78da\ua910\u9184\u957c\u9a25\u958c\ubc13\ub4b9\ubc1b\uea24\u3a30\u5d61\ub857\ubdac")), string)));
                }
            }
            if (object != 0) {
                if (object < 0) {
                    throw new Foor((String)Hdte.Fa(Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u933e\u7e57\u8e74\u78d6\ua917\u91c1\u950e\u9a30\u9587\ubc5a\ub4bc\ubc09\uea76\u3a2e\u5d71\ub81e\ubdf8\u5c90\uff79\u06d6\u0c9e\ue72d\u4702\u4e1e\u598d\ud64a\uac94\u35d1\u1d59\ub413\u8f0f")), string), BkvY$LhxG.I("\u9354"))));
                }
                Object object3 = Hdte.Fa(Hdte.Fa(object2, object));
                while (object3.hasNext()) {
                    Chunk chunk = (Chunk)object3.next();
                    Hdte.Fa(hGxw2, chunk);
                }
            } else {
                Hdte.Fa(hGxw2, object2);
            }
        } else if (Hdte.Fa(string, BkvY$LhxG.I("\u9357")) != false) {
            Iterator iterator = Hdte.Fa().iterator();
            while (iterator.hasNext()) {
                World world = (World)iterator.next();
                for (Chunk chunk : world.getLoadedChunks()) {
                    Hdte.Fa(hGxw2, chunk);
                }
            }
        } else if (Hdte.Fa(string, BkvY$LhxG.I("\u9353\u7e15")) != false) {
            Object object = Hdte.Fa(string, false, Hdte.Fa(string) - 2);
            boolean bl = false;
            Iterator iterator = Hdte.Fa().iterator();
            while (iterator.hasNext()) {
                World world = (World)iterator.next();
                if (Hdte.Fa(world.getName(), object) == false) continue;
                bl = true;
                for (Chunk chunk : world.getLoadedChunks()) {
                    Hdte.Fa(hGxw2, chunk);
                }
            }
            if (!bl) {
                throw new Foor((String)Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u9328\u7e51\u8e60\u78da\ua910\u9184\u957c\u9a25\u958c\ubc13\ub4a5\ubc15\uea35\u3a22\u5d70\ub808\ubdac\u5cc7\uff74\u06c1\u0cd2\ue739\u474d")), object)));
            }
        } else if (Hdte.Fa(string, BkvY$LhxG.I("\u9353")) != false) {
            if (Hdte.Fa(string, BkvY$LhxG.I("\u9351")) != false) {
                String string2 = ((String[])Hdte.Fa(string, BkvY$LhxG.I("\u9321\u7e11")))[0];
                boolean bl = false;
                Iterator iterator = Hdte.Fa().iterator();
                while (iterator.hasNext()) {
                    Object object;
                    Object object4;
                    World world = (World)iterator.next();
                    if (Hdte.Fa(world.getName(), string2) == false) continue;
                    bl = true;
                    String string3 = ((String[])Hdte.Fa(string, BkvY$LhxG.I("\u9321\u7e11")))[1];
                    String string4 = null;
                    if (Hdte.Fa(string3, BkvY$LhxG.I("\u9356")) != false) {
                        string4 = ((String[])Hdte.Fa(string3, BkvY$LhxG.I("\u9321\u7e14")))[1];
                        string3 = ((String[])Hdte.Fa(string3, BkvY$LhxG.I("\u9321\u7e14")))[0];
                    }
                    if (Hdte.Fa(string3, BkvY$LhxG.I("\u9351")) == false) {
                        throw new Foor((String)Hdte.Fa(Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u933e\u7e5e\u8e6f\u78d6\ua913\u9195\u957c\u9a38\u9587\ubc56\ub4a7\ubc0e\uea3f\u3a25\u5d7d\ub84d\ubdef\u5cd8\uff6e\u06dd\u0cd5\ue77d\u470e\u4e02\u598b\ud64c\uac99\u35d4\u1d1c\ub455\u8f48\uc2cb\udf72\u571b")), string3), BkvY$LhxG.I("\u935f\u7e1f\u8e52\u78d0\ua913\u9194\u9530\u9a35\u95c3\ubc51\ub4ac\ubc5a\uea6a\u3a3b\u5d3a\ub841\ubdb0\u5cca\uff25"))));
                    }
                    try {
                        object4 = Hdte.Fa(Hdte.Fa(((String[])Hdte.Fa(string3, BkvY$LhxG.I("\u9351")))[0]));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new Foor((String)Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u933e\u7e5e\u8e6f\u78d6\ua913\u9195\u957c\u9a38\u9587\ubc56\ub4a7\ubc0e\uea3f\u3a25\u5d7d\ub84d\ubdf4\u5c90\uff6d\u06d2\u0cd2\ue728\u4708\u4e4d\u5982\ud651\uac8f\u3587\u1d5f\ub45b\u8f52\uc2d7\udf39\u5719\ua37a\u84d4\u9a8e\ufdf8\uc3f6\ud61d\u583c\u3f1a\u44ea\u851a")), ((String[])Hdte.Fa(string3, BkvY$LhxG.I("\u9351")))[0])));
                    }
                    try {
                        object = Hdte.Fa(Hdte.Fa(((String[])Hdte.Fa(string3, BkvY$LhxG.I("\u9351")))[1]));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new Foor((String)Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u933e\u7e5e\u8e6f\u78d6\ua913\u9195\u957c\u9a38\u9587\ubc56\ub4a7\ubc0e\uea3f\u3a25\u5d7d\ub84d\ubdf6\u5c90\uff6d\u06d2\u0cd2\ue728\u4708\u4e4d\u5982\ud651\uac8f\u3587\u1d5f\ub45b\u8f52\uc2d7\udf39\u5719\ua37a\u84d4\u9a8e\ufdf8\uc3f6\ud61d\u583c\u3f1a\u44ea\u851a")), ((String[])Hdte.Fa(string3, BkvY$LhxG.I("\u9351")))[1])));
                    }
                    if (!world.isChunkLoaded((int)object4, (int)object)) break;
                    Chunk chunk = world.getChunkAt((int)object4, (int)object);
                    if (string4 != null) {
                        try {
                            Object object5 = Hdte.Fa(Hdte.Fa(string4, true));
                            if (Hdte.Fa(object5) <= 0) {
                                throw new Foor(BkvY$LhxG.I("\u933e\u7e57\u8e74\u78d6\ua917\u91c1\u950e\u9a30\u9587\ubc5a\ub4bc\ubc09\uea76\u3a2e\u5d71\ub81e\ubdf8\u5c90\uff79\u06d6\u0c9e\ue76c\u474d\u4e02\u5996\ud61e\uac95\u35ce\u1d5b\ub45b\u8f42\uc2cb"));
                            }
                            Hdte.Fa(hGxw2, Hdte.Fa(chunk, Hdte.Fa(object5)));
                            break;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new Foor((String)Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u9328\u7e51\u8e60\u78da\ua910\u9184\u957c\u9a25\u958c\ubc13\ub4b9\ubc1b\uea24\u3a30\u5d61\ub84d\ubdfe\u5cd1\uff7f\u06da\u0ccb\ue72e\u474d\u4e0b\u598b\ud64c\uacdd\u35c4\u1d54\ub446\u8f49\uc2d2\udf72\u574a\ua365\u84d4\u9a81\ufde9\uc3fa\ud61b\u5869\u3f48")), Hdte.Fa(string4, true))));
                        }
                    }
                    Hdte.Fa(hGxw2, chunk);
                    break;
                }
                if (!bl) {
                    throw new Foor((String)Hdte.Fa(Hdte.Fa(new StringBuilder(BkvY$LhxG.I("\u9328\u7e51\u8e60\u78da\ua910\u9184\u957c\u9a25\u958c\ubc13\ub4a5\ubc15\uea35\u3a22\u5d70\ub808\ubdac\u5cc7\uff74\u06c1\u0cd2\ue739\u474d")), string2)));
                }
            }
        }
        return hGxw2;
    }

    @Override
    public String getName() {
        return NVIs$JbpD.H("\u8ab8\u7504\u3bba\u5f55\u423f\ua26e\u396a\u0e05");
    }

    private static Object Fa(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

