public class Main {
    public static void main(String[] args) {
        MyArraylist<Integer> myArraylist = new MyArraylist<>();
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        myArraylist.add(5);
        myArraylist.add(6);
        myArraylist.add(6);
        myArraylist.add(7);

        System.out.println("element at the index of 4 -> " + myArraylist.get(4));
        System.out.println("element at the index of 2 -> " + myArraylist.get(2));
        System.out.println("Before removing 2 elements of arraylist");
        System.out.println("size of myArrayList -> " + myArraylist.size());
        System.out.println(myArraylist);
        myArraylist.remove(3);
        myArraylist.remove(5);
        System.out.println("After removing 2 elements of arraylist");
        System.out.println("size of myArrayList -> " + myArraylist.size());
        System.out.println(myArraylist);
    }
}