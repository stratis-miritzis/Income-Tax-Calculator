package incometaxcalculator.data.management;

public class MarriedFilingJointlyTaxpayer extends Taxpayer {

  public MarriedFilingJointlyTaxpayer(String fullname, int taxRegistrationNumber, float income) {
    super(fullname, taxRegistrationNumber, income);
    
    double taxRanges[] = {254240,143350,90000,36080,0};
    super.calculateBasicTaxRanges= taxRanges;
    
    double  taxAddends[] = {18197.69,9492.82,5731.64,1930.28 ,0.0};
    super.calculateBasicTaxAddends= taxAddends;
    
    double  taxFactors[] = {0.0985,0.0785,0.0705,0.0705,0.0535};
    super.calculateBasicTaxFactors=taxFactors;
    
    double taxSubtrahends[] = {254240,143350,90000,36080,0.0};
    super.calculateBasicTaxSubtrahends=taxSubtrahends;
    }

}