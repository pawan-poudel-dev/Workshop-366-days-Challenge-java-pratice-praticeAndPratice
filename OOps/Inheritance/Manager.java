class Manager extends Employee {

    @Override
    int getSalary() {
        int baseSalary = super.getSalary(); // call parent method
        return baseSalary + 10000;          // add manager bonus
    }
}