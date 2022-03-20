package FilEksempler;

public class heapSort <E extends Comparable<E>> {
    /** Heap sort method */
    public  <E extends Comparable<E>> void heapSort(E[] list) {
        // Create a Heap of integers
        Heap<E> heap = new Heap<>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }

    public static void main(String[] args) {
      /*  Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

        String [] tabel={"Bent","Anne","Anna","Peter","Jens","Bodil"};
        heapSort(tabel);
        for (int i = 0; i < tabel.length; i++)
            System.out.print(tabel[i] + " ");*/


      /*  Student[] tabel1=new Student[6];
        tabel1[0]=(new Student(1,"Bent",17));
        tabel1[1]=(new Student(2,"Anne",20));
        tabel1[2]=(new Student(3,"Anna",20));
        tabel1[3]=(new Student(4,"Peter",22));
        tabel1[4]=(new Student(5,"Jens",25));
        tabel1[5]=(new Student(6,"Bodil",22));
        heapSort.heapSort(tabel1);
        System.out.println();
        for (int i = 0; i < tabel1.length; i++)
            System.out.print(tabel1[i]);*/
    }


}
