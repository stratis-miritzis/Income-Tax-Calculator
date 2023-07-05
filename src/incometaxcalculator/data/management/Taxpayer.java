package incometaxcalculator.data.management;

import java.util.HashMap;

import incometaxcalculator.exceptions.WrongReceiptKindException;

public abstract class Taxpayer {

  protected final String fullname;
  protected final int taxRegistrationNumber;
  protected final float income;
  private float amountPerReceiptsKind[] = new float[5];
  private int totalReceiptsGathered = 0;
  private HashMap<Integer, Receipt> receiptHashMap = new HashMap<Integer, Receipt>(0);
  private static final String[] CATEGORIES = {"Entertainment", "Basic", "Travel", "Health","Other"};
  private static final double[] AMOUNTCATEGORIES = {0.6,0.4,0.2,0};
  private static final double[] TAXMULTIPLIER = {-0.3,-0.15,0.04,0.08};
  public double  calculateBasicTaxRanges[] = new double[5];
  public double  calculateBasicTaxAddends[] = new double[5];
  public double  calculateBasicTaxFactors[] = new double[5];
  public double calculateBasicTaxSubtrahends[] = new double[5];

  public double calculateBasicTax() {
  
      for(int i=0;i<calculateBasicTaxRanges.length;i++) 
      {
        if(income>=calculateBasicTaxRanges[i]) 
        {
          return (calculateBasicTaxAddends[i]+calculateBasicTaxFactors[i]*(income-calculateBasicTaxSubtrahends[i]));
        }
      }
      return -1;
    } 

  protected Taxpayer(String fullname, int taxRegistrationNumber, float income) {
    this.fullname = fullname;
    this.taxRegistrationNumber = taxRegistrationNumber;
    this.income = income;
  }

  public void addReceipt(Receipt receipt) throws WrongReceiptKindException {
    
    
    for (int i = 0;i < CATEGORIES.length;i++) {
      if (receipt.getKind().equals(CATEGORIES[i])) {
        amountPerReceiptsKind[i] += receipt.getAmount();
        break;
      }
    }
    
    receiptHashMap.put(receipt.getId(), receipt);
    totalReceiptsGathered++;
  }

  public void removeReceipt(int receiptId) throws WrongReceiptKindException {
    Receipt receipt = receiptHashMap.get(receiptId);
    
    
    for (int i = 0;i < CATEGORIES.length;i++) {
      if (receipt.getKind().equals(CATEGORIES[i])) {
        amountPerReceiptsKind[i] -= receipt.getAmount();
        break;
      }
    }
    
    totalReceiptsGathered--;
    receiptHashMap.remove(receiptId);
  }

  public String getFullname() {
    return fullname;
  }

  public int getTaxRegistrationNumber() {
    return taxRegistrationNumber;
  }

  public float getIncome() {
    return income;
  }

  public HashMap<Integer, Receipt> getReceiptHashMap() {
    return receiptHashMap;
  }

  public double getVariationTaxOnReceipts() {
    float totalAmountOfReceipts = getTotalAmountOfReceipts();

    
    for (int i = 0;i < AMOUNTCATEGORIES.length; i++) {
      if (totalAmountOfReceipts >= AMOUNTCATEGORIES[i] * income) {
        return calculateBasicTax() * TAXMULTIPLIER[i];
      }
    }
    return -1;
  }

  private float getTotalAmountOfReceipts() {
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += amountPerReceiptsKind[i];
    }
    return sum;
  }

  public int getTotalReceiptsGathered() {
    return totalReceiptsGathered;
  }

  public float getAmountOfReceiptKind(short kind) {
    return amountPerReceiptsKind[kind];
  }

  public double getTotalTax() {
    return calculateBasicTax() + getVariationTaxOnReceipts();
  }

  public double getBasicTax() {
    return calculateBasicTax();
  }

}