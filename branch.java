import java.util.*;

class branch {
    private String branchname;
    private String location;
    private String email;
    private int listacc;

    // first constructor
    public branch() {

    }

    // second constructor
    public branch(String branchname, String location, int listacc, String email) {
        this.branchname = branchname;
        this.location = location;
        this.listacc = listacc;
        this.email = email;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        // Scanner branch=new Scanner(Systrem.in);
        this.branchname = branchname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getListacc() {
        return listacc;
    }

    public void setListacc(int listacc) {
        this.listacc = listacc;
    }

    @Override
    public String toString() {
        return " Branch name is : " + branchname + "\n Its location=" + location + " Branch contact info is : " + email + "\n All account available on our branch is : "
                + listacc ;
    }

}
