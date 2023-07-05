package incometaxcalculator.data.management.FileWriterFactory;

import java.io.IOException;

import incometaxcalculator.data.io.FileWriter;

public interface FileUpdate
{
    FileWriter renewFiles (int taxRegistrationNumber) throws IOException;
}