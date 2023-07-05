package incometaxcalculator.data.management.TaxpayerInterface;

import incometaxcalculator.data.management.MarriedFilingSeparatelyTaxpayer;
import incometaxcalculator.data.management.Taxpayer;

public class  MarriedFilingSeparatelyCreation implements TaxpayerCreation
{
  @Override
  public  Taxpayer generateTaxpayer(String fullname, int taxRegistrationNumber, String status,float income)
  {
    return new MarriedFilingSeparatelyTaxpayer(fullname, taxRegistrationNumber, income);
  }
}