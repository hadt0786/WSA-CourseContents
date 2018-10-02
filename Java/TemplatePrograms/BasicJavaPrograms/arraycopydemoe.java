package hello;
class ArrayCopyDemoe {
    public static void main(String[] args) {
        char[] copyFrom = { 'f', 'a', 'r', 'e', 'e', 'h',
			    'a', 's', 'a', 'n', 'g', 'e','t','a' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 5, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}