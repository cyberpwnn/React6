/*
 * Decompiled with CFR 0_123.
 */
import java.util.Random;

public class uWRY
extends HCPo {
    public uWRY(long l, int n) {
        this(new Random(l), n);
    }

    public uWRY(Random random, int n) {
        super(uWRY.yJLS(random, n));
    }

    private static qlgl[] yJLS(Random random, int n) {
        qlgl[] arrqlgl = new qlgl[n];
        int n2 = 0;
        while (n2 < n) {
            arrqlgl[n2] = new OihG(random);
            ++n2;
        }
        return arrqlgl;
    }
}

