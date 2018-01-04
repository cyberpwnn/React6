/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Rapb
extends UtLV {
    public Rapb() {
        super(Chunk.class, (yuDM)((Object)o.k(1956463743)));
    }

    public void UtIU(Chunk chunk) {
        Rapb.nP(this.IFSe(), chunk);
    }

    public void yJLS(Chunk chunk, int n) {
        Rapb.nP(this.IFSe(), Rapb.nP(chunk, n));
    }

    public void ktHX(World world) {
        Chunk[] arrchunk = world.getLoadedChunks();
        int n = arrchunk.length;
        int n2 = 0;
        while (n2 < n) {
            Chunk chunk = arrchunk[n2];
            this.UtIU(chunk);
            ++n2;
        }
    }

    public void ThWp() {
        Iterator iterator = Rapb.nP().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            this.ktHX(world);
        }
    }

    @Override
    public int KTiK(CommandSender commandSender, String string) throws JYyP {
        Lhwj lhwj = new Lhwj();
        if (Rapb.nP(string, nJPf$sILv.G("\uedf0\u3223")) != false) {
            throw new JYyP(nJPf$sILv.G("\ued95\u3264\u9deb\u8abc\u2141\ude20\uc0f8\u6305\ua205\u63da\u1666\u8605\u10e7\u52a9\ub8d6\u5ef6\u9d4a\u84cf\u6258\uf083\u0515\u167a\u9b86\u7210\ueebb\ue6a5\u362b\u1c95\uebaa\uca52\ude10\u62f3\u6252\u9d09"));
        }
        if (Rapb.nP(string, nJPf$sILv.G("\uedf0")) != false) {
            String[] arrstring = (String[])Rapb.nP(string, nJPf$sILv.G("\uedf0"));
            int n = arrstring.length;
            int n2 = 0;
            while (n2 < n) {
                String string2 = arrstring[n2];
                Object object = Rapb.nP(string2, nJPf$sILv.G("\uedf7"));
                Object object2 = Rapb.nP(this.ktHX(commandSender, (String)(object != false ? Rapb.nP(string2, true) : string2)));
                while (object2.hasNext()) {
                    Chunk chunk = (Chunk)object2.next();
                    if (object != false) {
                        Rapb.nP(lhwj, chunk);
                        continue;
                    }
                    Rapb.nP(lhwj, chunk);
                }
                ++n2;
            }
        } else {
            if (Rapb.nP(string, nJPf$sILv.G("\uedf7")) != false) {
                throw new JYyP(nJPf$sILv.G("\ued95\u3264\u9deb\u8abc\u2141\ude20\uc0f8\u631e\ua213\u63d8\u1627\u8653\u10a4\u52af\ub892\u5eaa\u9d05\u84f6\u6210\uf084\u0509\u162e\u9b87\u720a\ueebb\ue6b6\u3625\u1cdf\ueb9e\uca57\ude14\u62f3\u6254\u9d2a\u2a58\u67d8\ude50\u8123\u4f92\uc186\uca2e\u8847\u4802\u5566\u08a4\u47db\ucba8\u4217\u0cad\u4b36\uc806\u3053\u5f0e\u0e3e\uedeb\u6438\u86bc\u40ed\u4363\u957c"));
            }
            Object object = Rapb.nP(this.ktHX(commandSender, string));
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                Rapb.nP(lhwj, chunk);
            }
        }
        Rapb.nP(this.IFSe(), lhwj);
        return (int)Rapb.nP(lhwj);
    }

    public Lhwj<Chunk> ktHX(CommandSender commandSender, String string) throws JYyP {
        Iterator iterator;
        Chunk chunk;
        Exception exception;
        Object object;
        Lhwj<Chunk> lhwj = new Lhwj<Chunk>();
        if (Rapb.nP(string, mrFx$WjFM.d("\u5b23\ub077\u5fea\ubfff")) != false) {
            object = 0;
            chunk = null;
            if (!(commandSender instanceof Player)) {
                throw new JYyP(mrFx$WjFM.d("\u5b18\ub071\u5fef\ubff5\u204a\u09ef\ubee9\u74f6\u2e68\u2dc5\ub15d\uee8a\u7ab3\ued08\u3194\ue50f\u5e4d\u1ed3\ueb77\u0e83\u8823\u5a41\ubec5\ud507\uf330\udec1\u1251\u040f\u6ea9\ucfa1\u03f9\ub343\ue72b\uc87f\u310e\ub66c\u6cd8\uf52a\u95a8\u5eb4\u711b\ue47f\uaedd\ue6ce\u9281\u36ba\ub460\u4580\u4d69\u1f85\ub4c8\u461b\u8ea8\u4288\u12b5\u5b5d\u20af\uceef\u110e\u0d3d\uc195\ue9cf\u9312\u678e\u3d47\u251a\uf37e\u9cd7\u4286"));
            }
            chunk = Rapb.nP(((Player)commandSender).getLocation());
            if (Rapb.nP(string, mrFx$WjFM.d("\u5b7c")) != false) {
                try {
                    object = Rapb.nP(Rapb.nP(((String[])Rapb.nP(string, mrFx$WjFM.d("\u5b0b\ub034")))[1]));
                }
                catch (NumberFormatException numberFormatException) {
                    throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b02\ub071\u5fe2\ubfee\u2006\u09fa\ubea5\u74e3\u2e7e\u2d80\ub15f\uee98\u7ae1\ued18\u3190\ue541\u5e04\u1ec8\ueb70\u0e83\u8864\u5a50\ubedf\ud558\uf330")), ((String[])Rapb.nP(string, mrFx$WjFM.d("\u5b7c")))[1])));
                }
                catch (Exception exception2) {
                    Exception exception3 = exception2;
                    Rapb.nP(exception2);
                    throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b02\ub071\u5fe2\ubfee\u2006\u09fa\ubea5\u74e3\u2e7e\u2d80\ub15f\uee98\u7ae1\ued18\u3190\ue55b\u5e4d")), string)));
                }
            }
            if (object != 0) {
                if (object < 0) {
                    throw new JYyP((String)Rapb.nP(Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b14\ub077\u5ff6\ubfe2\u2001\u09bf\ubed7\u74f6\u2e75\u2dc9\ub15a\uee8a\u7ab3\ued06\u3180\ue512\u5e19\u1e86\ueb66\u0e83\u8823\u5a45\ubec2\ud511\uf379\ude97\u124c\u0411\u6ea5\ucff2\u03f3")), string), mrFx$WjFM.d("\u5b7e"))));
                }
                iterator = Rapb.nP(Rapb.nP(chunk, object));
                while (iterator.hasNext()) {
                    exception = (Chunk)iterator.next();
                    Rapb.nP(lhwj, exception);
                }
            } else {
                Rapb.nP(lhwj, chunk);
            }
        }
        if (Rapb.nP(string, mrFx$WjFM.d("\u5b3b\ub070\u5fec\ubfe7")) != false) {
            object = 0;
            chunk = null;
            if (!(commandSender instanceof Player)) {
                throw new JYyP(mrFx$WjFM.d("\u5b18\ub071\u5fef\ubff5\u204a\u09ef\ubee9\u74f6\u2e68\u2dc5\ub15d\uee8a\u7ab3\ued08\u3194\ue50f\u5e4d\u1ed3\ueb77\u0e83\u8823\u5a41\ubec5\ud507\uf330\udec1\u1249\u0408\u6eaf\ucfb9\u03f9\ub343\ue72b\uc87f\u310e\ub66c\u6cd8\uf52a\u95a8\u5eb4\u711b\ue47f\uaedd\ue6ce\u9281\u36ba\ub460\u4580\u4d69\u1f85\ub4c8\u461b\u8ea8\u4288\u12b5\u5b5d\u20af\uceef\u110e\u0d3d\uc195\ue9cf\u9312\u678e\u3d47\u251a\uf37e\u9cd7\u4286"));
            }
            chunk = ((Player)commandSender).getTargetBlock(null, 512).getChunk();
            if (Rapb.nP(string, mrFx$WjFM.d("\u5b7c")) != false) {
                try {
                    object = Rapb.nP(Rapb.nP(((String[])Rapb.nP(string, mrFx$WjFM.d("\u5b0b\ub034")))[1]));
                }
                catch (NumberFormatException numberFormatException) {
                    throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b02\ub071\u5fe2\ubfee\u2006\u09fa\ubea5\u74e3\u2e7e\u2d80\ub15f\uee98\u7ae1\ued18\u3190\ue541\u5e04\u1ec8\ueb70\u0e83\u8864\u5a50\ubedf\ud558\uf330")), ((String[])Rapb.nP(string, mrFx$WjFM.d("\u5b7c")))[1])));
                }
                catch (Exception exception4) {
                    exception = exception4;
                    Rapb.nP(exception4);
                    throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b02\ub071\u5fe2\ubfee\u2006\u09fa\ubea5\u74e3\u2e7e\u2d80\ub15f\uee98\u7ae1\ued18\u3190\ue55b\u5e4d")), string)));
                }
            }
            if (object != 0) {
                if (object < 0) {
                    throw new JYyP((String)Rapb.nP(Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b14\ub077\u5ff6\ubfe2\u2001\u09bf\ubed7\u74f6\u2e75\u2dc9\ub15a\uee8a\u7ab3\ued06\u3180\ue512\u5e19\u1e86\ueb66\u0e83\u8823\u5a45\ubec2\ud511\uf379\ude97\u124c\u0411\u6ea5\ucff2\u03f3")), string), mrFx$WjFM.d("\u5b7e"))));
                }
                iterator = Rapb.nP(Rapb.nP(chunk, object));
                while (iterator.hasNext()) {
                    exception = (Chunk)iterator.next();
                    Rapb.nP(lhwj, exception);
                }
            } else {
                Rapb.nP(lhwj, chunk);
            }
        } else if (Rapb.nP(string, mrFx$WjFM.d("\u5b7d")) != false) {
            chunk = Rapb.nP().iterator();
            while (chunk.hasNext()) {
                World world = (World)chunk.next();
                Chunk[] arrchunk = world.getLoadedChunks();
                int n = arrchunk.length;
                int n2 = 0;
                while (n2 < n) {
                    exception = arrchunk[n2];
                    Rapb.nP(lhwj, exception);
                    ++n2;
                }
            }
        } else if (Rapb.nP(string, mrFx$WjFM.d("\u5b79\ub035")) != false) {
            Object object2 = Rapb.nP(string, false, Rapb.nP(string) - 2);
            boolean bl = false;
            iterator = Rapb.nP().iterator();
            while (iterator.hasNext()) {
                exception = (World)iterator.next();
                if (Rapb.nP(exception.getName(), object2) == false) continue;
                bl = true;
                Chunk[] arrchunk = exception.getLoadedChunks();
                int n = arrchunk.length;
                int n3 = 0;
                while (n3 < n) {
                    Chunk chunk2 = arrchunk[n3];
                    Rapb.nP(lhwj, chunk2);
                    ++n3;
                }
                break block16;
            }
            if (!bl) {
                throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b02\ub071\u5fe2\ubfee\u2006\u09fa\ubea5\u74e3\u2e7e\u2d80\ub143\uee96\u7af0\ued0a\u3181\ue504\u5e4d\u1ed1\ueb6b\u0e94\u886f\u5a51\ube8d")), object2)));
            }
        } else if (Rapb.nP(string, mrFx$WjFM.d("\u5b79")) != false) {
            if (Rapb.nP(string, mrFx$WjFM.d("\u5b7b")) != false) {
                String string2 = ((String[])Rapb.nP(string, mrFx$WjFM.d("\u5b0b\ub031")))[0];
                boolean bl = false;
                iterator = Rapb.nP().iterator();
                while (iterator.hasNext()) {
                    Object object3;
                    Object object4;
                    exception = (World)iterator.next();
                    if (Rapb.nP(exception.getName(), string2) == false) continue;
                    bl = true;
                    String string3 = ((String[])Rapb.nP(string, mrFx$WjFM.d("\u5b0b\ub031")))[1];
                    String string4 = null;
                    if (Rapb.nP(string3, mrFx$WjFM.d("\u5b7c")) != false) {
                        string4 = ((String[])Rapb.nP(string3, mrFx$WjFM.d("\u5b0b\ub034")))[1];
                        string3 = ((String[])Rapb.nP(string3, mrFx$WjFM.d("\u5b0b\ub034")))[0];
                    }
                    if (Rapb.nP(string3, mrFx$WjFM.d("\u5b7b")) == false) {
                        throw new JYyP((String)Rapb.nP(Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b14\ub07e\u5fed\ubfe2\u2005\u09eb\ubea5\u74fe\u2e75\u2dc5\ub141\uee8d\u7afa\ued0d\u318c\ue541\u5e0e\u1ece\ueb71\u0e88\u8868\u5a15\ubece\ud50d\uf37f\ude91\u1241\u0414\u6ee0\ucfb4\u03b4\ub311\ue760\uc838")), string3), mrFx$WjFM.d("\u5b75\ub03f\u5fd0\ubfe4\u2005\u09ea\ubee9\u74f3\u2e31\u2dc2\ub14a\ueed9\u7aaf\ued13\u31cb\ue54d\u5e51\u1edc\ueb3a"))));
                    }
                    try {
                        object4 = Rapb.nP(Rapb.nP(((String[])Rapb.nP(string3, mrFx$WjFM.d("\u5b7b")))[0]));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b14\ub07e\u5fed\ubfe2\u2005\u09eb\ubea5\u74fe\u2e75\u2dc5\ub141\uee8d\u7afa\ued0d\u318c\ue541\u5e15\u1e86\ueb72\u0e87\u886f\u5a40\ubec8\ud542\uf376\ude8c\u1257\u0447\u6ea3\ucfba\u03ae\ub30d\ue72b\uc83a\u3104\ub67e\u6cdb\uf53d\u95af\u5eee\u7154\ue45a\uae82\ue6ce")), ((String[])Rapb.nP(string3, mrFx$WjFM.d("\u5b7b")))[0])));
                    }
                    try {
                        object3 = Rapb.nP(Rapb.nP(((String[])Rapb.nP(string3, mrFx$WjFM.d("\u5b7b")))[1]));
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b14\ub07e\u5fed\ubfe2\u2005\u09eb\ubea5\u74fe\u2e75\u2dc5\ub141\uee8d\u7afa\ued0d\u318c\ue541\u5e17\u1e86\ueb72\u0e87\u886f\u5a40\ubec8\ud542\uf376\ude8c\u1257\u0447\u6ea3\ucfba\u03ae\ub30d\ue72b\uc83a\u3104\ub67e\u6cdb\uf53d\u95af\u5eee\u7154\ue45a\uae82\ue6ce")), ((String[])Rapb.nP(string3, mrFx$WjFM.d("\u5b7b")))[1])));
                    }
                    if (!exception.isChunkLoaded((int)object4, (int)object3)) break;
                    Chunk chunk3 = exception.getChunkAt((int)object4, (int)object3);
                    if (string4 != null) {
                        try {
                            Object object5 = Rapb.nP(Rapb.nP(string4, true));
                            if (Rapb.nP(object5) <= 0) {
                                throw new JYyP(mrFx$WjFM.d("\u5b14\ub077\u5ff6\ubfe2\u2001\u09bf\ubed7\u74f6\u2e75\u2dc9\ub15a\uee8a\u7ab3\ued06\u3180\ue512\u5e19\u1e86\ueb66\u0e83\u8823\u5a04\ube8d\ud50d\uf362\udec3\u124d\u040e\u6ea7\ucfba\u03be\ub311"));
                            }
                            Rapb.nP(lhwj, Rapb.nP(chunk3, Rapb.nP(object5)));
                            break;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b02\ub071\u5fe2\ubfee\u2006\u09fa\ubea5\u74e3\u2e7e\u2d80\ub15f\uee98\u7ae1\ued18\u3190\ue541\u5e1f\u1ec7\ueb60\u0e8f\u8876\u5a46\ube8d\ud504\uf37f\ude91\u1205\u0404\u6ea8\ucfa7\u03b5\ub308\ue760\uc869\u311b\ub67e\u6cd4\uf52c\u95a3\u5ee8\u7101\ue408")), Rapb.nP(string4, true))));
                        }
                    }
                    Rapb.nP(lhwj, chunk3);
                    break;
                }
                if (!bl) {
                    throw new JYyP((String)Rapb.nP(Rapb.nP(new StringBuilder(mrFx$WjFM.d("\u5b02\ub071\u5fe2\ubfee\u2006\u09fa\ubea5\u74e3\u2e7e\u2d80\ub143\uee96\u7af0\ued0a\u3181\ue504\u5e4d\u1ed1\ueb6b\u0e94\u886f\u5a51\ube8d")), string2)));
                }
            }
        }
        return lhwj;
    }

    @Override
    public String getName() {
        return FMkR$WjFM.a("\u6a68\u2d8c\u61ff\u654a\u0816\ucfd4\uac02\u0e8b");
    }

    private static Object nP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

