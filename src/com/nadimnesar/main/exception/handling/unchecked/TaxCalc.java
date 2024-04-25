package com.nadimnesar.main.exception.handling.unchecked;

//Handling excepting for a specific purpose method

public class TaxCalc {
    public static void main(String[] args) {
        Employee e1 = new Employee(50000, 0, 2);
        try{
            System.out.println(e1.taxCalculation());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

class Employee {
    private Integer salary;
    private Integer taxRatio;
    private Integer taxRebate;

    public Employee(Integer salary, Integer taxRatio, Integer taxRebate) {
        this.salary = salary;
        this.taxRatio = taxRatio;
        this.taxRebate = taxRebate;
    }

    public Double taxCalculation() throws Exception {
        try{
            return (double) (salary / taxRatio) * taxRebate;
        }
        catch (ArithmeticException ex){
            throw new ArithmeticException("Invalid Salary");
        }
        catch (Exception ex){
            throw new Exception();
        }
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getTaxRatio() {
        return taxRatio;
    }

    public void setTaxRatio(Integer taxRatio) {
        this.taxRatio = taxRatio;
    }

    public Integer getTaxRebate() {
        return taxRebate;
    }

    public void setTaxRebate(Integer taxRebate) {
        this.taxRebate = taxRebate;
    }
}