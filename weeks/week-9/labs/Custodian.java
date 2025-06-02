public class Custodian extends Employee{

    @Override
    public int getHours(){
        return super.getHours() * 2; // 80 hours/week
    }

    @Override
    public double getSalary(){
        return super.getSalary() - 10000.0; // $30,000.00
    }

    @Override
    public int getVacationDays(){
        return super.getVacationDays() / 2; // 5 days
    }

    // Additional method unique to Custodians
    public String clean(){
        return "Workin' for the man.";
    }

}
