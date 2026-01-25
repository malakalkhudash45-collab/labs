package student_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class StudentForm extends JFrame {

    // UI Components
    private JTextField txtId;
    private JTextArea area;
    private JButton btnAdd;

    // Linked List
    private SinglyLinkedList studentList;

    // Constructor
    public StudentForm() {

        studentList = new SinglyLinkedList();

        setTitle("Student Form - Linked List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel
        JPanel top = new JPanel();
        top.add(new JLabel("Student ID:"));

        txtId = new JTextField(10);
        top.add(txtId);

        btnAdd = new JButton("Add Student");
        top.add(btnAdd);

        add(top, BorderLayout.NORTH);

        // Text Area
        area = new JTextArea();
        area.setEditable(false);
        add(new JScrollPane(area), BorderLayout.CENTER);

        // Button Action
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });
    }

    // =====================
    // Add Student Method
    // =====================
    void addStudent() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Student ID");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(txtId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be a number");
            return;
        }

        studentList.add(id);
        area.append("Student added using Linked List: " + id + "\n");

        studentList.display(); // Console display
        txtId.setText("");
    }

    // Main
    public static void main(String[] args) {
        new StudentForm().setVisible(true);
    }
}
