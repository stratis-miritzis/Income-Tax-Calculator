package incometaxcalculator.data.management.SaveLogFileFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileWriter;
import incometaxcalculator.data.io.TXTLogWriter;
import incometaxcalculator.data.management.FileWriterFactory.FileUpdate;

public class TXTLogUpdate implements LogUpdate
{
    @Override
    public void renewLogs (int taxRegistrationNumber) throws IOException
    {
        new TXTLogWriter().generateFile(taxRegistrationNumber);
        return;
    }
}