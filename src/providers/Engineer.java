package providers;

public class Engineer implements Provider{
    private double salaryPerHour; // заплата на час
    private double hours; // колко часове е работил

    public Engineer(double salaryPerHour, double hours) {
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return "Engineer{" +
                "salaryPerHour=" + salaryPerHour +
                ", hours=" + hours +
                '}';
    }

    @Override
    public double earnings() {
        return this.getSalaryPerHour()*this.getHours();
    }
}
