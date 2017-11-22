/*
 * Decompiled with CFR 0_123.
 */
public final class JbuU$IWSm
extends JbuU$YoSa {
    private final int note;

    public JbuU$IWSm(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(rgig$AWxc.r("\u1ca6\u1840\uddbf\u31d6\u343a\uc07b\u47d6\u42d0\u2cc2\u8717\u751f\ua283\u514b\ueaa6\u5ad3\u4930\u3dca\ube6c\u0f4a\uf595\u1fb0\uc111\u9c27\u87f4\u33e7\u8041\u814a\ufb44\ue148\u860d"));
        }
        if (n > 24) {
            throw new IllegalArgumentException(rgig$AWxc.r("\u1ca6\u1840\uddbf\u31d6\u343a\uc07b\u47d6\u42d0\u2cc2\u8717\u751f\ua283\u514b\ueaa6\u5ad3\u4930\u3dca\ube6c\u0f4e\uf593\u1fa0\uc11c\u9c30\u87a6\u33b3\u805d\u8143\ufb4b\ue106\u861d\u3912\u79d8"));
        }
        this.note = n;
    }

    @Override
    public float uOTo() {
        return (float)((Integer)cv.b(this, 282589113)).intValue() / 24.0f;
    }

    @Override
    public float ogUp() {
        return 0.0f;
    }

    @Override
    public float jGEc() {
        return 0.0f;
    }
}

