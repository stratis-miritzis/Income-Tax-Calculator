package incometaxcalculator.data.management.FileWriterFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileWriter;
import incometaxcalculator.data.io.XMLInfoWriter;

public class XMLFileUpdate implements FileUpdate
{
    @Override
    public FileWriter renewFiles (int taxRegistrationNumber) throws IOException
    {
        new XMLInfoWriter().generateFile(taxRegistrationNumber);
        return null;
    }
}