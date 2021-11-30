package minggu12;

public class SegiEmpat implements BangunDatar{
    private int panjang;
    private int lebar;

    public SegiEmpat(int panjang, int lebar) {
        this.setLebar(lebar);
        this.setPanjang(panjang);
    }

    public float getLuas() {
        return getPanjang() * getLebar();
    }

//    @Override
//    public int compareTo(SegiEmpat segiEmpat) {
//        if (this.getPanjang() == segiEmpat.getPanjang()) {
//            return 0;
//        } else if (this.getPanjang() > segiEmpat.getPanjang()) {
//            return 1;
//        }else{
//            return -1;
//        }
//    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
}
