package incometaxcalculator.data.management;

public class MarriedFilingSeparatelyTaxpayer extends Taxpayer {

  public MarriedFilingSeparatelyTaxpayer(String fullname, int taxRegistrationNumber, float income) {
    super(fullname, taxRegistrationNumber, income);
    
    double taxRanges[] = {127120,90000,71680,18040,0};
    super.calculateBasicTaxRanges= taxRanges;
    
    double  taxAddends[] = {9098.80,6184.88,4746.76,965.14 ,0.0};
    super.calculateBasicTaxAddends= taxAddends;
    
    double  taxFactors[] = {0.0985,0.0785,0.0785,0.0705,0.0535};
    super.calculateBasicTaxFactors=taxFactors;
    
    double taxSubtrahends[] = {127120,90000,71680,18040,0.0};
    super.calculateBasicTaxSubtrahends=taxSubtrahends;
    
    
  }
}