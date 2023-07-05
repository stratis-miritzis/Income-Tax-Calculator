package incometaxcalculator.data.management;

public class SingleTaxpayer extends Taxpayer {

  public SingleTaxpayer(String fullname, int taxRegistrationNumber, float income) {
    super(fullname, taxRegistrationNumber, income);
    
    double taxRanges[] = {152540,90000,81080,24680,0};
    super.calculateBasicTaxRanges= taxRanges;
    
    double  taxAddends[] = {10906.19,5996.80,5296.58,1320.38 ,0.0};
    super.calculateBasicTaxAddends= taxAddends;
    
    double  taxFactors[] = {0.0985,0.0785,0.0785,0.0705,0.0535};
    super.calculateBasicTaxFactors=taxFactors;
    
    double taxSubtrahends[] = {152540,90000,81080,24680,0.0};
    super.calculateBasicTaxSubtrahends=taxSubtrahends;
   }
}