package FilEksempler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
          SorteringsAlgortimer sa=new SorteringsAlgortimer();
          String [] tabelnavne={"Bent","Anne","Anna","Peter","Jens","Bodil"};
          sa.selectionSort(tabelnavne);
       // mergeSort(tabel);
        // quickSort(tabel,0,5);
         System.out.println(sa.binarySearch(tabelnavne,"Jens"));
      /*  String []a=new String[2];
        heapSort hs=new heapSort();
        hs.main(a);*/

        Student[] tabel1=new Student[6];
        tabel1[0]=(new Student(1,"Bent",17));
        tabel1[1]=(new Student(2,"Anne",20));
        tabel1[2]=(new Student(3,"Anna",20));
        tabel1[3]=(new Student(4,"Peter",22));
        tabel1[4]=(new Student(5,"Jens",25));
        tabel1[5]=(new Student(6,"Bodil",22));
        heapSort hs=new heapSort();
        hs.heapSort(tabel1);
      //  heapSort.heapSort(tabel1);
        System.out.println();
        for (int i = 0; i < tabel1.length; i++)
            System.out.print(tabel1[i]);

        String [] tabel={"Bent","Anne","Anna","Peter","Jens","Bodil"};
        heapSort hs1=new heapSort();
        hs1.heapSort(tabel);
        for (int i = 0; i < tabel.length; i++)
            System.out.print(tabel[i]);

        Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort hs2=new heapSort();
        hs2.heapSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");



    }




}
