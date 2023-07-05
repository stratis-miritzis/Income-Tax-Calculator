package incometaxcalculator.data.management.TaxpayerInterface;

import incometaxcalculator.data.management.MarriedFilingJointlyTaxpayer;
import incometaxcalculator.data.management.Taxpayer;

public class  MarriedFilingJointlyCreation implements TaxpayerCreation
{
  @Override
  public Taxpayer generateTaxpayer(String fullname, int taxRegistrationNumber, String status,float income)
  {
    return new MarriedFilingJointlyTaxpayer(fullname, taxRegistrationNumber, income);
  }
}