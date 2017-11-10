/*
 * Decompiled with CFR 0_123.
 */
public final class OGmN$yJLL
extends OGmN$qdWJ {
    private final int note;

    public OGmN$yJLL(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException(KDGY$JAHk.Y("\u5586\ue340\u26ac\u5ca3\u9802\u0937\u53b9\u7c18\u38b6\u3b95\ua30e\u4437\uf66b\ude13\u66ac\u6e5c\uecd9\u55a3\u6aae\u7007\uad99\u644a\u775c\u9144\u368d\u312e\u27b9\u663d\udb58\ud39d"));
        }
        if (n > 24) {
            throw new IllegalArgumentException(KDGY$JAHk.Y("\u5586\ue340\u26ac\u5ca3\u9802\u0937\u53b9\u7c18\u38b6\u3b95\ua30e\u4437\uf66b\ude13\u66ac\u6e5c\uecd9\u55a3\u6aaa\u7001\uad89\u6447\u774b\u9116\u36d9\u3132\u27b0\u6632\udb16\ud38d\u2c8f\u36a7"));
        }
        this.note = n;
    }

    @Override
    public float rVgx() {
        return (float)((Integer)yy.h(this, -181861044)).intValue() / 24.0f;
    }

    @Override
    public float qCDb() {
        return 0.0f;
    }

    @Override
    public float cAju() {
        return 0.0f;
    }
}

