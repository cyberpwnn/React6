/*
 * Decompiled with CFR 0_123.
 */
public class YDfo {
    private byte[][] TXPg = new byte[128][128];

    public YDfo() {
        this.ssNb(0);
    }

    public void ssNb(byte by) {
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < 128; ++j) {
                this.ssNb(i, j, by);
            }
        }
    }

    public void ssNb(int n, int n2, byte by) {
        ((byte[][])cv.b((Object)this, (int)1042084768))[n][n2] = by;
    }

    public void ssNb(YDfo yDfo) {
        byte[][] arrby = yDfo.rxda();
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < 128; ++j) {
                if (arrby[i][j] == 0) continue;
                this.ssNb(i, j, arrby[i][j]);
            }
        }
    }

    public byte[][] rxda() {
        return (byte[][])cv.b(this, 1042084768);
    }
}

