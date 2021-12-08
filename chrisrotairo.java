import java.util.Scanner;

public class chrisrotairo {
    public static void main(String[] args) {
        Scanner d =new Scanner (System.in);
        System.out.print("Annual Salary: ");
        float c = d.nextFloat();

        if(c < 250000){

            float Months_rate = c / 12;
            float Days_rate = Months_rate / 22;
            float Hour_rate = Days_rate / 8;
            Double Yearly_Tax_Deduction = 0.00;
            Double Month_Tax_Deduction = 0.00;
            Double net_pay = Months_rate - Month_Tax_Deduction;

            System.out.println("Monthly Rate: " + String.format("%.2f", Months_rate));
            System.out.println("Daily Rate: " + String.format("%.2f", Days_rate));
            System.out.println("Hourly Rate: " + String.format("%.2f", Hour_rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Yearly_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Month_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", net_pay));

        }
        else if(c >= 250000 && c < 400000){

            Double tax_deduction = c - 250000 * .20;

            float Months_rate = c / 12;
            float Days_rate = Months_rate / 22;
            float Hour_rate = Days_rate / 8;
            Double Yearly_Tax_Deduction = tax_deduction;
            Double Month_Tax_Deduction = tax_deduction / 12;
            Double net_pay = Months_rate - Month_Tax_Deduction;

            System.out.println("Monthly Rate: " + String.format("%.2f", Months_rate));
            System.out.println("Daily Rate: " + String.format("%.2f", Days_rate));
            System.out.println("Hourly Rate: " + String.format("%.2f", Hour_rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Yearly_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Month_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", net_pay));

        }
        else if(c >= 400000 && c < 800000){

            float tax_excess = c - 400000;
            Double tax_deduction =30000 + 0.25 * tax_excess;

            float Months_rate = c / 12;
            float Days_rate = Months_rate / 22;
            float Hour_rate = Days_rate / 8;
            Double Yearly_Tax_Deduction = tax_deduction;
            Double Month_Tax_Deduction = tax_deduction / 12;
            Double net_pay = Months_rate - Month_Tax_Deduction;

            System.out.println("Monthly Rate: " + String.format("%.2f", Months_rate));
            System.out.println("Daily Rate: " + String.format("%.2f", Days_rate));
            System.out.println("Hourly Rate: " + String.format("%.2f", Hour_rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Yearly_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Month_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", net_pay));

        }
        else if(c >= 800000 && c < 2000000){

            float tax_excess = c - 800000;
            Double tax_deduction = 0.30 * tax_excess + 130000;

            float Months_rate = c / 12;
            float Days_rate = Months_rate / 22;
            float Hour_rate = Days_rate / 8;
            Double Yearly_Tax_Deduction = tax_deduction;
            Double Month_Tax_Deduction = tax_deduction / 12;
            Double net_pay = Months_rate - Month_Tax_Deduction;

            System.out.println("Monthly Rate: " + String.format("%.2f", Months_rate));
            System.out.println("Daily Rate: " + String.format("%.2f", Days_rate));
            System.out.println("Hourly Rate: " + String.format("%.2f", Hour_rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Yearly_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Month_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", net_pay));

        }
        else if(c >= 2000000 && c < 8000000){

            float tax_excess = c - 2000000;
            Double tax_deduction = 0.32 * tax_excess + 490000;

            float Months_rate = c / 12;
            float Days_rate = Months_rate / 22;
            float Hour_rate = Days_rate / 8;
            Double Yearly_Tax_Deduction = tax_deduction;
            Double Month_Tax_Deduction = tax_deduction / 12;
            Double net_pay = Months_rate - Month_Tax_Deduction;

            System.out.println("Monthly Rate: " + String.format("%.2f", Months_rate));
            System.out.println("Daily Rate: " + String.format("%.2f", Days_rate));
            System.out.println("Hourly Rate: " + String.format("%.2f", Hour_rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Yearly_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Month_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", net_pay));

        }
        else if(c >= 8000000){

            float tax_excess = c - 8000000;
            Double tax_deduction = 0.35 * tax_excess + 2410000;

            float Months_rate = c / 12;
            float Days_rate = Months_rate / 22;
            float Hour_rate = Days_rate / 8;
            Double Yearly_Tax_Deduction = tax_deduction;
            Double Month_Tax_Deduction = Yearly_Tax_Deduction / 12;
            Double net_pay = Months_rate - Month_Tax_Deduction;

            System.out.println("Monthly Rate: " + String.format("%.2f", Months_rate));
            System.out.println("Daily Rate: " + String.format("%.2f", Days_rate));
            System.out.println("Hourly Rate: " + String.format("%.2f", Hour_rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Yearly_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Month_Tax_Deduction));
            System.out.println("Net Pay: " + String.format("%.2f", net_pay));

        }
    }

    
}
