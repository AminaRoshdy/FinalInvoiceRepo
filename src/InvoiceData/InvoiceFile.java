package InvoiceData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class InvoiceFile {

    private int invoiceID;
    private  String customerName;
    private  String  Date;
    private  double Total;
    private ArrayList<InvoiceItems> item;

    public ArrayList<InvoiceItems> getItem() {
        return item;
    }

    public void setItem(ArrayList<InvoiceItems> item) {
        this.item = item;
    }


    public  InvoiceFile()
    {

    }
    public InvoiceFile(int invoiceID) {
        this.invoiceID = invoiceID;
    }


    public InvoiceFile(int invoiceID, String date, String customerName ) {
        this.invoiceID = invoiceID;
        this.customerName = customerName;
        this.Date = date;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}
