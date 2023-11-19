import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileToTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flight and Passenger Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Attribute");
        tableModel.addColumn("Value");

        try (BufferedReader reader = new BufferedReader(new FileReader("bookings.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                for (String datum : data) {
                    tableModel.addRow(new Object[]{null, datum.trim()});
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        JTable table = new JTable(tableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
