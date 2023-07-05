package incometaxcalculator.data.management.SaveLogFileFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileWriter;

public interface LogUpdate 
{
    void renewLogs (int taxRegistrationNumber) throws IOException;
}