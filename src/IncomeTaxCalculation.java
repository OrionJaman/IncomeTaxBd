public class IncomeTaxCalculation {
    private double tax;
    private double income;
    private double mainIncome;
    public double getIncome() {
        return mainIncome;
    }
    public IncomeTaxCalculation( double income){
        this.income = income ;
        mainIncome  = income;
        calculateTax();

    }

    public double calculateTax(){
        if(income > 1650000){
            tax = tax + ( income - 1650000 ) * 0.25 ;
            income = 1650000;
        }
        if(income > 1150000){
            tax = tax + ( income - 1150000 ) * 0.20 ;
            income = 1150000 ;
        }
        if(income > 750000){
            tax = tax + ( income  - 750000 ) * 0.15 ;
            income = 750000 ;
        }
        if(income > 450000){
            tax = tax + ( income  - 450000 ) * 0.10 ;
            income = 450000 ;
        }
        if(income > 350000){
            tax = tax + ( income - 350000 ) * 0.05 ;
            income = 0 ;
        }
        return tax ;
    }


}
