/*
 * Decompiled with CFR 0_123.
 */
public abstract class rgig
extends aeww {
    public rgig() {
        this.start();
    }

    public abstract void ssNb(long var1, double var3);

    @Override
    public void stop() {
        super.stop();
        this.ssNb(this.getTime(), (double)this.getTime() / 1000000.0);
    }
}

