package com.company;

import InvoiceData.InvoiceFile;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TableModel extends DefaultTableModel {

    private final String[] columnNames = { "Invoice ID", "Date", "Amount", "Total" };
    //private ArrayList<String[]> Data = new ArrayList<String[]>();
    //private  String [][] Data = {{"" , "", " ","",""},{"" , "", " ","",""},{"" , " ", " ","",""},{"" , "", " ","",""}};
    private ArrayList<InvoiceFile> rows ;

    public ArrayList<InvoiceFile> getRows() {
        return rows;
    }

    public void setRows(ArrayList<InvoiceFile> rows) {
        this.rows = rows;
    }

    @Override
    public int getRowCount() {
        return super.getRowCount();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

   @Override
    public Object getValueAt(int row, int col) {
        InvoiceFile INV= rows.get(row);
        switch (col)
        {
            case 0:
                return INV.getInvoiceID();
            case 1:
                return INV.getCustomerName();
            case 2:
                return INV.getDate();
        }
        return  null;
    }

}
