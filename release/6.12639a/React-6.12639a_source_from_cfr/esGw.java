/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.scoreboard.DisplaySlot
 *  org.bukkit.scoreboard.Objective
 *  org.bukkit.scoreboard.Score
 *  org.bukkit.scoreboard.Scoreboard
 *  org.bukkit.scoreboard.ScoreboardManager
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class esGw {
    public static ScoreboardManager nuUa() {
        return esGw.lt();
    }

    public static Scoreboard CMey() {
        return esGw.nuUa().getNewScoreboard();
    }

    public static Objective yJLS(Scoreboard scoreboard, String object) {
        Objective objective = scoreboard.registerNewObjective(FMkR$WjFM.a("\u431c\u473d\ub7c0\ub9a1\u1208"), FMkR$WjFM.a("\u430b\u4724\ub7cc\ub9b8\u1214"));
        if (esGw.lt(object) > 32) {
            object = esGw.lt(esGw.lt(new StringBuilder((String)esGw.lt(esGw.lt(object, false, 29))), FMkR$WjFM.a("\u4341\u477f\ub78f")));
        }
        objective.setDisplayName((String)object);
        objective.setDisplaySlot((DisplaySlot)o.k(-1195944379));
        return objective;
    }

    public static Objective UtIU(Scoreboard scoreboard, String object) {
        Objective objective = scoreboard.registerNewObjective(FMkR$WjFM.a("\u0a3e\uf241\u8910\uea96\u81a1"), FMkR$WjFM.a("\u0a29\uf258\u891c\uea8f\u81bd"));
        if (esGw.lt(object) > 32) {
            object = esGw.lt(esGw.lt(new StringBuilder((String)esGw.lt(esGw.lt(object, false, 29))), FMkR$WjFM.a("\u0a63\uf203\u895f")));
        }
        objective.setDisplayName((String)object);
        objective.setDisplaySlot((DisplaySlot)o.k(-1217964476));
        return objective;
    }

    public static Objective biLo(Scoreboard scoreboard, String object) {
        Objective objective = scoreboard.registerNewObjective(FMkR$WjFM.a("\uf131\u20cf\u8cea\u69fd\uec30"), FMkR$WjFM.a("\uf126\u20d6\u8ce6\u69e4\uec2c"));
        if (esGw.lt(object) > 32) {
            object = esGw.lt(esGw.lt(new StringBuilder((String)esGw.lt(esGw.lt(object, false, 29))), FMkR$WjFM.a("\uf16c\u208d\u8ca5")));
        }
        objective.setDisplayName((String)object);
        objective.setDisplaySlot((DisplaySlot)o.k(-375040445));
        return objective;
    }

    public static void yJLS(String object, int n, Objective objective) {
        if (esGw.lt(esGw.lt((eHVp)((Object)o.k(1666794880)), (eHVp)((Object)o.k(1817332786))), esGw.lt()) != false) {
            if (esGw.lt(object) > 15) {
                object = esGw.lt(object, false, 15);
            }
        }
        if (esGw.lt(object) > 40) {
            object = esGw.lt(esGw.lt(new StringBuilder((String)esGw.lt(esGw.lt(object, false, 37))), mrFx$WjFM.d("\u9895\u4a97\u8f14")));
        }
        objective.getScore((String)object).setScore(n);
    }

    public static Scoreboard yJLS(String string, feCR<String> feCR2) {
        Scoreboard scoreboard = esGw.CMey();
        Objective objective = esGw.yJLS(scoreboard, string);
        reference var4_4 = esGw.lt(feCR2);
        Object object = esGw.lt(feCR2);
        while (object.hasNext()) {
            String string2 = (String)object.next();
            esGw.yJLS(string2, (int)var4_4, objective);
            --var4_4;
        }
        return scoreboard;
    }

    public static Scoreboard UtIU(String string, feCR<String> feCR2) {
        Scoreboard scoreboard = esGw.CMey();
        Objective objective = esGw.biLo(scoreboard, string);
        reference var4_4 = esGw.lt(feCR2);
        Object object = esGw.lt(feCR2);
        while (object.hasNext()) {
            String string2 = (String)object.next();
            esGw.yJLS(string2, (int)var4_4, objective);
            --var4_4;
        }
        return scoreboard;
    }

    public static String Surr(String string) {
        if (string == null) {
            return null;
        }
        if (esGw.lt(string, FMkR$WjFM.a("\uc4a8")) != false) {
            if (esGw.lt(string, FMkR$WjFM.a("\uc4ae")) != false) {
                return string;
            }
        }
        return esGw.lt(FMkR$WjFM.a("\uc4a8\uf2fd\u8ac7\ue45d\u3d56\u6912\ub988\ufc1e\u41aa\u30a6\u204b\u2941\u441b"), new Object[]{string});
    }

    public static /* varargs */ String[] UtIU(String ... arrstring) {
        if (arrstring == null) {
            return null;
        }
        String[] arrstring2 = new String[arrstring.length];
        int n = 0;
        while (n < arrstring.length) {
            block5 : {
                block6 : {
                    if (n == 0) break block5;
                    if (esGw.lt(arrstring[n], nJPf$sILv.G("\ub243")) == false) break block6;
                    if (esGw.lt(arrstring[n], nJPf$sILv.G("\ub245")) != false) break block5;
                }
                arrstring[n] = esGw.lt(esGw.lt(new StringBuilder(nJPf$sILv.G("\ub264\u1372")), arrstring[n]));
            }
            arrstring2[n] = esGw.Surr(arrstring[n]);
            ++n;
        }
        return arrstring2;
    }

    public static void yJLS(Player player, String string, String string2) {
        esGw.lt(player, string, string2);
    }

    private static Object lt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

