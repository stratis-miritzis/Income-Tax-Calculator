package incometaxcalculator.data.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

import incometaxcalculator.data.management.Receipt;
import incometaxcalculator.data.management.TaxpayerManager;

public abstract class InfoWriter implements FileWriter{
  public abstract PrintWriter printFileTags(int taxRegistrationNumber) throws IOException;
  public abstract void printReceiptTags(PrintWriter outputStream,Receipt receipt);
  
  private TaxpayerManager manager = new TaxpayerManager();

  public void generateFile(int taxRegistrationNumber) throws IOException {

    PrintWriter outputStream = printFileTags(taxRegistrationNumber);
    generateTaxpayerReceipts(taxRegistrationNumber, outputStream);
    outputStream.close();
  }
  
  public void generateTaxpayerReceipts(int taxRegistrationNumber, PrintWriter outputStream) {

    HashMap<Integer, Receipt> receiptsHashMap = manager.getReceiptHashMap(taxRegistrationNumber);
    Iterator<HashMap.Entry<Integer, Receipt>> iterator = receiptsHashMap.entrySet().iterator();
    while (iterator.hasNext()) {
      HashMap.Entry<Integer, Receipt> entry = iterator.next();
      Receipt receipt = entry.getValue();
      printReceiptTags(outputStream,receipt);}
  }
  
}
