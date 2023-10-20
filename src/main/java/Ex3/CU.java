package Ex3;

public class CU {

    private String nameCU;
    Mark[] marks;
    private int totalStudends;


    public CU(String nameCU, Mark[] marks, int totalStudends) {
        this.nameCU = nameCU;
        this.marks = marks;
        this.totalStudends = totalStudends;
    }






    public String getNameCU() {
        return nameCU;
    }

    public void setNameCU(String nameCU) {
        this.nameCU = nameCU;
    }



    public int getTotalStudends() {
        return totalStudends;
    }

    public void setTotalStudends(int totalStudends) {
        this.totalStudends = totalStudends;
    }



}
