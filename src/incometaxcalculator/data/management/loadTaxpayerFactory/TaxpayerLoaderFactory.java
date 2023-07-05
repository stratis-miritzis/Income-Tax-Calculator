package incometaxcalculator.data.management.loadTaxpayerFactory;

import java.io.IOException;

import incometaxcalculator.exceptions.WrongFileFormatException;
import incometaxcalculator.exceptions.WrongReceiptDateException;
import incometaxcalculator.exceptions.WrongReceiptKindException;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

public class TaxpayerLoaderFactory 
{
    public static void TaxpayerLoaderFactoryManager(String fileName) throws NumberFormatException, IOException, WrongTaxpayerStatusException, WrongFileFormatException, WrongReceiptKindException, WrongReceiptDateException
    {
        String ending[] = fileName.split("\\.");
        
        if  (ending[1].equals("txt")) 
        {
          new TXTTaxpayerLoader().readTaxpayer(fileName);
        }
        else if (ending[1].equals("xml"))
        {
          new XMLTaxpayerLoader().readTaxpayer(fileName);
        }
        else
        {
            throw new WrongFileFormatException();
        }
    }
}