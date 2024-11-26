public class Admin extends Person implements Viewable{
    private final String[] roles = {"ceo", "hr", "pr", "vp", "gm"};
    private double working_hours;
    private String role;

    Admin(String username, String password, String role, double working_hours){
        super(username,password);
        role = role.toLowerCase();
        for(int i = 0 ; i < roles.length; i++){
            if(role.equals(roles[i])){
                this.role = role;
            }
        }
    }

    public double getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(double working_hours) {
        this.working_hours = working_hours;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        role = role.toLowerCase();
        for(int i = 0 ; i < roles.length; i++) {
            if (role.equals(roles[i])) {
                this.role = role;
            }
        }
    }

    public void viewAllProducts(){};

    @Override
    public void viewByCategory(String c) {

    }

    public void addSupplier(){};

    public void viewSuppliers(){};

    public void viewOrders(){};

    public void viewCustomers(){};
}