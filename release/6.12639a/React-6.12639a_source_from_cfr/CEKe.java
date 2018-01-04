/*
 * Decompiled with CFR 0_123.
 */
import java.util.List;

public abstract class CEKe<FROM, TO> {
    public List<TO> UtIU(List<FROM> list) {
        feCR feCR2 = new feCR();
        for (FROM FROM : list) {
            TO TO = this.GPlk(FROM);
            if (TO == null) continue;
            feCR2.add(this.GPlk(FROM));
        }
        return feCR2;
    }

    public abstract TO GPlk(FROM var1);
}

