package incometaxcalculator.data.management.SaveLogFileFactory;

import java.io.IOException;

import incometaxcalculator.exceptions.WrongFileFormatException;

public class LogUpdateFactory
{
    public static void LogUpdateFactoryManager(int taxRegistrationNumber, String fileFormat) throws IOException, WrongFileFormatException
    {
        if (fileFormat.equals("txt"))
        {
          new TXTLogUpdate().renewLogs (taxRegistrationNumber);
        }
        else if (fileFormat.equals("xml"))
        {
          new XMLLogUpdate().renewLogs (taxRegistrationNumber);
        }
        else
        {
            throw new WrongFileFormatException();
        }
    }


}