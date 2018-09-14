import java.util.ArrayList;
import java.util.List;

public class Branch {

    private List<Branch> branches = new ArrayList<>();

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
