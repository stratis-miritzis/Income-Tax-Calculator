package incometaxcalculator.data.management.TaxpayerInterface;

import incometaxcalculator.data.management.HeadOfHouseholdTaxpayer;
import incometaxcalculator.data.management.Taxpayer;

public class HeadOfHouseHoldCreation implements TaxpayerCreation
{
  @Override
  public Taxpayer generateTaxpayer(String fullname, int taxRegistrationNumber, String status,float income)
  {
    return new HeadOfHouseholdTaxpayer(fullname, taxRegistrationNumber, income);
  }
}