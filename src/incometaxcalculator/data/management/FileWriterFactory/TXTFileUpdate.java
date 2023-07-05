package incometaxcalculator.data.management.FileWriterFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileWriter;
import incometaxcalculator.data.io.TXTInfoWriter;

public class TXTFileUpdate implements FileUpdate
{
    @Override
    public FileWriter renewFiles (int taxRegistrationNumber)  throws IOException
    {
        new TXTInfoWriter().generateFile(taxRegistrationNumber);
        return null;
    }
}