package unit_26;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.table.*;

class Exam_02_sub extends JFrame implements CellEditorListener,
        TableColumnModelListener, TableModelListener{

    private JRootPane jrp;
    private Container con;
    private DefaultTableModel  dtm = new DefaultTableModel(3, 4);
    private DefaultTableColumnModel dtcm = new DefaultTableColumnModel();
    private DefaultListSelectionModel dlsm = new DefaultListSelectionModel();
    private JTable jt = new JTable(dtm, dtcm, dlsm);
    private JScrollPane jsp = new JScrollPane(jt);

    private TableColumn tc, tc1, tc2, tc3;
    private DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
    private DefaultCellEditor dce = new DefaultCellEditor(new JTextField());

    private JTableHeader jth = new JTableHeader(dtcm);

    public Exam_02_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new BorderLayout(5,5));
        con.add("North", new JLabel("JTable Event", JLabel.CENTER));
        con.add("South", new JButton("Check"));
        con.add("Center", jsp);

        tc = new TableColumn(0, 75);
        tc1 = new TableColumn(1, 75);
        tc2= new TableColumn(2, 75);
        tc3= new TableColumn(3, 75, dtcr, dce);

        tc.setHeaderValue("0");
        tc1.setHeaderValue("1");
        tc2.setHeaderValue("2");
        tc3.setHeaderValue("3");

        dtcm.addColumn(tc);
        dtcm.addColumn(tc1);
        dtcm.addColumn(tc2);
        dtcm.addColumn(tc3);
        jt.setTableHeader(jth);
        con.add("Center", jsp);

    }

    private void start() {
        dce.addCellEditorListener(this);
        dtcm.addColumnModelListener(this);
        dtm.addTableModelListener(this);
    }


    @Override
    public void editingStopped(ChangeEvent e) {
        System.out.println("Editing completed.");
    }

    @Override
    public void editingCanceled(ChangeEvent e) {

    }

    //TableColumnModelListener
    @Override
    public void columnAdded(TableColumnModelEvent e) {

    }

    @Override
    public void columnRemoved(TableColumnModelEvent e) {

    }

    @Override
    public void columnMoved(TableColumnModelEvent e) {
        System.out.println("Moving");
    }

    @Override
    public void columnMarginChanged(ChangeEvent e) {
        System.out.println("size changing.");
    }

    @Override
    public void columnSelectionChanged(ListSelectionEvent e) {
        System.out.println(e.getFirstIndex() + " -> " + e.getLastIndex() );
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        System.out.println("changed " + e.getColumn() + " : " +  e.getFirstRow());
    }
}

public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub runRun = new Exam_02_sub();
    }

}
