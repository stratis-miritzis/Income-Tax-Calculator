package incometaxcalculator.data.management;

public class HeadOfHouseholdTaxpayer extends Taxpayer {

  public HeadOfHouseholdTaxpayer(String fullname, int taxRegistrationNumber, float income) {
    super(fullname, taxRegistrationNumber, income);
    
    double taxRanges[] = {203390,122110,90000,30390,0};
    super.calculateBasicTaxRanges= taxRanges;
    
    double  taxAddends[] = {14472.61,8092.13,5828.38,1625.87 ,0.0};
    super.calculateBasicTaxAddends= taxAddends;
    
    double  taxFactors[] = {0.0985,0.0785,0.0705,0.0705,0.0535};
    super.calculateBasicTaxFactors=taxFactors;
    
    double taxSubtrahends[] = {203390,122110,90000,30390,0.0};
    super.calculateBasicTaxSubtrahends=taxSubtrahends;
  }
}