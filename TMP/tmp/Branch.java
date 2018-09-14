import java.util.ArrayList;
import java.util.List;

public class Branch {


    private List<ArrayList<Branch>> branches;

    public Branch() {
        branches = new ArrayList<>();
        int numOfBranches = (int) (Math.random() * 3);
        for (int i = 0; i < numOfBranches; i++) {
            branches.add(new ArrayList<Branch>()) ;
        }

    }


    public List<ArrayList<Branch>> getBranches() {
        return branches;
    }

    public void setBranches(List<ArrayList<Branch>> branches) {
        this.branches = branches;
    }

}
