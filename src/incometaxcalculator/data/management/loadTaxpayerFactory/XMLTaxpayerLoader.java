package incometaxcalculator.data.management.loadTaxpayerFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileReader;
import incometaxcalculator.data.io.XMLFileReader;
import incometaxcalculator.exceptions.WrongFileFormatException;
import incometaxcalculator.exceptions.WrongReceiptDateException;
import incometaxcalculator.exceptions.WrongReceiptKindException;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

public class XMLTaxpayerLoader implements TaxpayerLoader
{
    @Override
    public void readTaxpayer (String fileName) throws NumberFormatException, IOException, WrongTaxpayerStatusException, WrongFileFormatException, WrongReceiptKindException, WrongReceiptDateException
    {
        new XMLFileReader().readFile(fileName);
        return;
    }
}