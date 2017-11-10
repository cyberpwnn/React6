/*
 * Decompiled with CFR 0_123.
 */
public class qArm {
    private double Bkpl;

    public qArm(double d) {
        this.Bkpl = d;
    }

    public double get() {
        return (Double)yy.h(this, -1274085679);
    }

    public void set(double d) {
        yy.E(this, -1274085679, d);
    }

    public void add(double d) {
        qArm qArm2 = this;
        yy.E(qArm2, -1274085679, (Double)yy.h(qArm2, -1274085679) + d);
    }

    public void halY(double d) {
        qArm qArm2 = this;
        yy.E(qArm2, -1274085679, (Double)yy.h(qArm2, -1274085679) - d);
    }
}

