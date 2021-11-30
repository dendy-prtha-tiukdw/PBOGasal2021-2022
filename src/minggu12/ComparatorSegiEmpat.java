package minggu12;

import java.util.Comparator;

public class ComparatorSegiEmpat implements Comparator<BangunDatar> {

    @Override
    public int compare(BangunDatar o1, BangunDatar o2) {
        if (o1.getLuas() == o2.getLuas()) {
            return 0;
        } else if (o1.getLuas() > o2.getLuas()) {
            return 1;
        }else{
            return -1;
        }
    }
}
