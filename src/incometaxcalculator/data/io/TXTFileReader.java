package incometaxcalculator.data.io;

import java.io.BufferedReader;
import java.io.IOException;

public class TXTFileReader extends FileReader {
  
  public String getValues(String fieldsLine) 
  {
    String values[] = fieldsLine.split(" ", 2);
    String val = values[1].trim();
    return val;
    
  }

  
  public int checkForReceipt(BufferedReader inputStream)
      throws NumberFormatException, IOException {
    String line;
    while (!isEmpty(line = inputStream.readLine())) {
      String values[] = line.split(" ", 3);
      if (values[0].equals("Receipt")) {
        if (values[1].equals("ID:")) {
          int receiptId = Integer.parseInt(values[2].trim());
          return receiptId;
        }
      }
    }
    return -1;
  }


}