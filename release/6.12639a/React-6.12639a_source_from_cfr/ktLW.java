/*
 * Decompiled with CFR 0_123.
 */
public abstract class ktLW<T>
implements IgvC<T> {
    private String pbQb;
    private long DkFY;
    protected T object;

    public ktLW(long l, String string) {
        this.DkFY = l;
        this.pbQb = string;
    }

    public ktLW(long l, T t, String string) {
        this(l, string);
        this.object = t;
    }

    @Override
    public String STSP() {
        return (String)o.a(this, -529837541);
    }

    @Override
    public long OPWR() {
        return (Long)o.a(this, 1718637098);
    }

    @Override
    public T YoVV() {
        return (T)o.a(this, -1724427735);
    }

    @Override
    public abstract vbpi ivSs();

    @Override
    public abstract void yJLS(vbpi var1);
}

