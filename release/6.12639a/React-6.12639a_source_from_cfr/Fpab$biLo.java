/*
 * Decompiled with CFR 0_123.
 */
public final class Fpab$biLo
extends Fpab$TEqA {
    private final int note;

    public Fpab$biLo(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\ub528\u46b2\u9b44\ub1ac\u359f\u41b8\u6f19\u5fde\u5442\u06c6\ude80\u6ab9\u3a09\u3796\ueb19\ub584\u4ff1\u803e\uae3d\u7e74\u01c5\u403d\ueb66\u28ba\ueb09\uaafc\u23a4\uf341\u2b58\u45d7"));
        }
        if (n > 24) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\ub528\u46b2\u9b44\ub1ac\u359f\u41b8\u6f19\u5fde\u5442\u06c6\ude80\u6ab9\u3a09\u3796\ueb19\ub584\u4ff1\u803e\uae39\u7e72\u01d5\u4030\ueb71\u28e8\ueb5d\uaae0\u23ad\uf34e\u2b16\u45c7\uf6b3\u15a9"));
        }
        this.note = n;
    }

    @Override
    public float bijP() {
        return (float)((Integer)o.a(this, 1507606765)).intValue() / 24.0f;
    }

    @Override
    public float paqR() {
        return 0.0f;
    }

    @Override
    public float xiiW() {
        return 0.0f;
    }
}

