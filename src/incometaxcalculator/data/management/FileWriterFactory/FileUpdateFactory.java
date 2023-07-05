package incometaxcalculator.data.management.FileWriterFactory;

import java.io.File;
import java.io.IOException;

public class FileUpdateFactory
{
    public static void FileUpdateFactoryManager(int taxRegistrationNumber) throws IOException
    {
        if (new File(taxRegistrationNumber + "_INFO.xml").exists())
        {
          new XMLFileUpdate().renewFiles (taxRegistrationNumber);
          new TXTFileUpdate().renewFiles (taxRegistrationNumber);
        }
        else
        {
          new TXTFileUpdate().renewFiles (taxRegistrationNumber);
        }
        return;
    }
}