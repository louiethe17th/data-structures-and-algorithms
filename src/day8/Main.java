package day8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList kk = new LinkedList();
        LinkedList nn = new LinkedList();


        kk.prepend(1);
        kk.prepend(22);
        kk.prepend(12);

        kk.print();

        nn.prepend(8);
        nn.prepend(34);
        nn.prepend(13);

        nn.print();

        LinkedList mergyBoi = new LinkedList();

        mergyBoi = mergyBoi.mergeLists(kk, nn);
        mergyBoi.print();




    }
}


