/*
 * Decompiled with CFR 0_123.
 */
public abstract class UJLY
extends dMfa {
    public UJLY() {
        this.start();
    }

    public abstract void UtIU(long var1, double var3);

    @Override
    public void stop() {
        super.stop();
        this.UtIU(this.getTime(), (double)this.getTime() / 1000000.0);
    }
}

