/*
 * Decompiled with CFR 0_123.
 */
import java.util.List;

public abstract class ePQp<FROM, TO> {
    public List<TO> ksfs(List<FROM> list) {
        PBUD pBUD = new PBUD();
        for (FROM FROM : list) {
            TO TO = this.ksfs(FROM);
            if (TO == null) continue;
            pBUD.add(this.ksfs(FROM));
        }
        return pBUD;
    }

    public abstract TO ksfs(FROM var1);
}

