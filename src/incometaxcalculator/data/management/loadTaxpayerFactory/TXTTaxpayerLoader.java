package incometaxcalculator.data.management.loadTaxpayerFactory;

import java.io.IOException;

import incometaxcalculator.data.io.TXTFileReader;
import incometaxcalculator.exceptions.WrongFileFormatException;
import incometaxcalculator.exceptions.WrongReceiptDateException;
import incometaxcalculator.exceptions.WrongReceiptKindException;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

public class TXTTaxpayerLoader implements TaxpayerLoader
{
    @Override
    public void readTaxpayer (String fileName) throws NumberFormatException, IOException, WrongTaxpayerStatusException, WrongFileFormatException, WrongReceiptKindException, WrongReceiptDateException
    {
        new TXTFileReader().readFile(fileName);
        return;
    }
}