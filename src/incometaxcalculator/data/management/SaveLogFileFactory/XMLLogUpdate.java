package incometaxcalculator.data.management.SaveLogFileFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileWriter;
import incometaxcalculator.data.io.XMLLogWriter;
import incometaxcalculator.data.management.FileWriterFactory.FileUpdate;

public class XMLLogUpdate implements LogUpdate
{
    @Override
    public void renewLogs (int taxRegistrationNumber) throws IOException
    {
        new XMLLogWriter().generateFile(taxRegistrationNumber);
        return;
    }
}