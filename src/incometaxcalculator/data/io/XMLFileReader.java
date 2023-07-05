package incometaxcalculator.data.io;

import java.io.BufferedReader;
import java.io.IOException;

public class XMLFileReader extends FileReader {
  
  
  public String getValues(String fieldsLine) 
  {
    String valueWithTail[] = fieldsLine.split(" ", 2);
    String valueReversed[] = new StringBuilder(valueWithTail[1]).reverse().toString().trim()
        .split(" ", 2);
    return new StringBuilder(valueReversed[1]).reverse().toString();
  }


  public int checkForReceipt(BufferedReader inputStream)
      throws NumberFormatException, IOException {
    String line;
    while (!isEmpty(line = inputStream.readLine())) {
      String values[] = line.split(" ", 3);
      if (values[0].equals("<ReceiptID>")) {
        int receiptId = Integer.parseInt(values[1].trim());
        return receiptId;
      }
    }
    return -1;
  }


}
