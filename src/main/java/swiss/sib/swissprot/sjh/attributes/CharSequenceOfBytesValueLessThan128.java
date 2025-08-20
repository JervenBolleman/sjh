package swiss.sib.swissprot.sjh.attributes;

import static java.nio.charset.StandardCharsets.UTF_8;

final class CharSequenceOfBytesValueLessThan128 implements CharSequence {
    private final byte[] attributeName;

    CharSequenceOfBytesValueLessThan128(byte[] attributeName) {
        super();
        this.attributeName = attributeName;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new String(attributeName, UTF_8).subSequence(start, end);
    }

    @Override
    public int length() {
        return attributeName.length;
    }

    @Override
    public char charAt(int index) {
        return (char) attributeName[index];
    }

    @Override
    public String toString() {
        return new String(attributeName, UTF_8);
    }

}
