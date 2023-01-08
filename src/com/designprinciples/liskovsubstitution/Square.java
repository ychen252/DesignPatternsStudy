package com.designprinciples.liskovsubstitution;

public class Square implements IQuadrangle {
    private long side;

    public void setSide ( long side ) {
        this.side = side;
    }

    public long getSide () {
        return side;
    }

    @Override
    public long getWidth () {
        return side;
    }

    @Override
    public long getLength () {
        return side;
    }
}
