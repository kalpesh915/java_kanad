class EncapsulationDemo{
    private int roll;
    private String fname, lname;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "EncapsulationDemo{" +
                "roll=" + roll +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}

public class pro36 {
    public static void main(String[] args) {
        EncapsulationDemo ed = new EncapsulationDemo();

        ed.setRoll(11);
        ed.setFname("Kanad");
        ed.setLname("Joshi");

        System.out.println(ed);
    }
}
