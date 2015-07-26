package com.company;

/**
 * Created by Admin on 25.07.2015.
 */
public class Bank {
    /**
     * variables for storing Bank's data
     */
    private static int branchesCount = 0;
    private Branch[] branches = new Branch[5];

    /**
     * method for adding new branch of the bank
     * @param branch is branch to add
     */
    public void addBranch(Branch branch) {
        if (branchesCount < 5) {
            branches[branchesCount] = branch;
            branchesCount++;
        }
    }

    /**
     * method for deletion of the branch
     * @param id of branch to delete
     * @return deleted branch
     */
    public Branch deleteBranch(Integer id){
        if (id <= branchesCount) {
            Branch branchToDelete = branches[id];
            branchesCount--;
            for (int i = id; i < branchesCount; i++) {
                branches[i] = branches[i + 1];
            }

            return branchToDelete;
        }
        return null;
    }

    /**
     * getter for the branch by id
     * @param id of branch to find
     * @return finded branch
     */
    public Branch getBranchById(Integer id){
        for (Branch branch : branches) {
            if (branch.getId() == id) {
                return branches[id];
            }
        }
        return null;
    }
}
