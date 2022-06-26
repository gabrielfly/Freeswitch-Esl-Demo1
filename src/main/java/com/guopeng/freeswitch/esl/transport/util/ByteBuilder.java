package com.guopeng.freeswitch.esl.transport.util;

public class ByteBuilder {

    private byte[] b = new byte[128];
    private int index = 0;

    private ByteBuilder() {
    }

    /**
     * <p>newBuilder.</p>
     *
     * @return a {@link com.guopeng.freeswitch.esl.transport.util.ByteBuilder} object.
     */
    public static ByteBuilder newBuilder() {
        return new ByteBuilder();
    }

    /**
     * <p>append.</p>
     *
     * @param byte0 a byte.
     * @return a {@link com.guopeng.freeswitch.esl.transport.util.ByteBuilder} object.
     */
    public ByteBuilder append(byte byte0) {
        if (this.b.length <= (index + 1)) {
            byte[] newB = new byte[this.b.length * 2];
            System.arraycopy(this.b, 0, newB, 0, this.b.length);
            this.b = newB;
        }
        this.b[index] = byte0;
        index++;
        return this;
    }

    /**
     * <p>length.</p>
     *
     * @return a int.
     */
    public int length() {
        return index;
    }

    /**
     * <p>build.</p>
     *
     * @return an array of {@link byte} objects.
     */
    public byte[] build() {
        return b;
    }

    /**
     * <p>string.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String string() {
        return new String(b, 0, index);
    }
}
