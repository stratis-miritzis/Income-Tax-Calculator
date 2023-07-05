package incometaxcalculator.data.management.loadTaxpayerFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileReader;
import incometaxcalculator.exceptions.WrongFileFormatException;
import incometaxcalculator.exceptions.WrongReceiptDateException;
import incometaxcalculator.exceptions.WrongReceiptKindException;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

public interface TaxpayerLoader
{
    void readTaxpayer (String fileName) throws NumberFormatException, IOException, WrongTaxpayerStatusException, WrongFileFormatException, WrongReceiptKindException, WrongReceiptDateException;
}