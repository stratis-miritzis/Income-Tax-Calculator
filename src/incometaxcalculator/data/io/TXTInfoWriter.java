package incometaxcalculator.data.io;

import java.io.IOException;
import java.io.PrintWriter;


import incometaxcalculator.data.management.Receipt;
import incometaxcalculator.data.management.TaxpayerManager;

public class TXTInfoWriter extends InfoWriter {
  
  private TaxpayerManager manager = new TaxpayerManager();

  public PrintWriter printFileTags(int taxRegistrationNumber ) throws IOException 
  {
    PrintWriter outputStream = new PrintWriter(
            new java.io.FileWriter(taxRegistrationNumber + "_INFO.txt"));
	  
    outputStream.println("Name: " + manager.getTaxpayerName(taxRegistrationNumber));
    outputStream.println("AFM: " + taxRegistrationNumber);
    outputStream.println("Status: " + manager.getTaxpayerStatus(taxRegistrationNumber));
    outputStream.println("Income: " + manager.getTaxpayerIncome(taxRegistrationNumber));
    outputStream.println();
    outputStream.println("Receipts:");
    outputStream.println();
    return outputStream;
  }
  
  public void printReceiptTags(PrintWriter outputStream,Receipt receipt) 
  { 
    outputStream.println("Receipt ID: " + receipt.getId());
    outputStream.println("Date: " + receipt.getIssueDate());
    outputStream.println("Kind: " + receipt.getKind());
    outputStream.println("Amount: " + receipt.getAmount());
    outputStream.println("Company: " + receipt.getCompany().getName());
    outputStream.println("Country: " + receipt.getCompany().getCountry());
    outputStream.println("City: " + receipt.getCompany().getCity());
    outputStream.println("Street: " + receipt.getCompany().getStreet());
    outputStream.println("Number: " + receipt.getCompany().getNumber());
    outputStream.println();

      
  }

}