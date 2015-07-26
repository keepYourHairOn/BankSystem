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
     * @param name is name of the branch
     * @param address postal address of the branch
     * @return added branch
     */
    public Branch createBranch(String name, String address){
        branchesCount++;
        return null;
    }

    /**
     * method for deletion of the branch
     * @param id of branch to delete
     * @return deleted branch
     */
    public Branch deleteBranch(Integer id){
        return null;
    }

    /**
     * getter for the branch by id
     * @param id of branch to find
     * @return finded branch
     */
    public Branch getBranchById(Integer id){
        return null;
    }
}
