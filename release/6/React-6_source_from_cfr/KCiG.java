/*
 * Decompiled with CFR 0_123.
 */
import java.util.Random;

public class KCiG
extends dntE {
    public KCiG(long l, int n) {
        this(new Random(l), n);
    }

    public KCiG(Random random, int n) {
        super(KCiG.ssNb(random, n));
    }

    private static tvRU[] ssNb(Random random, int n) {
        tvRU[] arrtvRU = new tvRU[n];
        for (int i = 0; i < n; ++i) {
            arrtvRU[i] = new RbOr(random);
        }
        return arrtvRU;
    }
}

