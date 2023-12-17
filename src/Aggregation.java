

class Details {
    String name;
    String Address;

    public Details(String name, String address) {
        this.name = name;
        Address = address;
    }
}

    class EmployeD{
    int id;
    int Number;
    String State;

        public EmployeD(int id, int number, String state) {
            this.id = id;
            Number = number;
            State = state;
        }
    }

    public class Aggregation{
        public static void main(String[] args) {
            Details L1 = new Details("Dipak", "Somnath nagar");
            EmployeD L2 = new EmployeD(1232, 999999999, "State");

            System.out.println(L1.name+ " " +L1.Address+ " " +L2.State + " " +L2.id);
        }
}

