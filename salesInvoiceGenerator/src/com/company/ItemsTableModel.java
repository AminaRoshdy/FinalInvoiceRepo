package com.company;

import InvoiceData.InvoiceFile;
import InvoiceData.InvoiceItems;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ItemsTableModel extends DefaultTableModel {

    private final String[] columnNames = { "Invoice ID", "Item Name", "Item Price", "Count" , "Item Total"};

    private ArrayList<InvoiceItems> rows ;

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
        InvoiceItems item= rows.get(row);
        switch (col)
        {
            case 0:
                return item.getInvoiceID();
            case 1:
                return item.getCustomerName();
            case 2:
                return item.getDate();
        }
        return  null;
    }
}
