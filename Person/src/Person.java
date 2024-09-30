public class Person {
    String HoTen;
    int NamSinh;
    public Person() {}

    public Person(String HoTen, int NamSinh) {
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    public int getNamSinh() {
        return NamSinh;
    }
    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }
}
