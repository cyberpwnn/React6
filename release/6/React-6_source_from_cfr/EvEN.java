/*
 * Decompiled with CFR 0_123.
 */
import java.util.List;

public abstract class EvEN<FROM, TO> {
    public List<TO> DYFV(List<FROM> list) {
        wfPa wfPa2 = new wfPa();
        for (FROM FROM : list) {
            TO TO = this.jhSt(FROM);
            if (TO == null) continue;
            wfPa2.add(this.jhSt(FROM));
        }
        return wfPa2;
    }

    public abstract TO jhSt(FROM var1);
}

