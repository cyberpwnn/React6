/*
 * Decompiled with CFR 0_123.
 */
public abstract class BclT
extends DrcY {
    public BclT() {
        this.start();
    }

    public abstract void mXJp(long var1, double var3);

    @Override
    public void stop() {
        super.stop();
        this.mXJp(this.getTime(), (double)this.getTime() / 1000000.0);
    }
}

