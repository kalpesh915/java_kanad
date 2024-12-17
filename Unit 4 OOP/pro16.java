class Address{
    String line1, line2;
    int zipcode;

    Address(String line1, String line2, int zipcode){
        this.line1 = line1;
        this.line2 = line2;
        this.zipcode = zipcode;
    }

    public String getAddress(){
        return "Your Address is "+line1+" "+line2+" "+zipcode;
    }
}

class Bank{
    int branchcode;
    String name;
    Address address;

    public Bank(int branchcode, String name, Address address) {
        this.branchcode = branchcode;
        this.name = name;
        this.address = address;
    }

    public void printDetails(){
        System.out.println("Welcome to "+name+" Code is "+branchcode+ " Address "+address.getAddress());
    }
}

public class pro16 {
    public static void main(String[] args) {
        Address add = new Address("Kalawad Road", "Rajkot", 360005);
        Bank bank = new Bank(91155, "SBI", add);
        bank.printDetails();
    }
}
