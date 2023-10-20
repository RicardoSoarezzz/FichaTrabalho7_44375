package Ex3;

public class Mark {



    private int numStudent;
    private double mark;

    private CU cu;

    public Mark(int numStudent, double mark, CU cu) {
        this.mark = mark;
        this.numStudent = numStudent;
    }


    public void insertMarkCU(int numStudent, double mark){


    }


    public void searchStudent(int numStudend){

    }


    public void averageCU(){

    }

    public void isApproved(int numStudent){

    }

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public CU getCu() {
        return cu;
    }

    public void setCu(CU cu) {
        this.cu = cu;
    }
}
