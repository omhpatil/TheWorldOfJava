package AddressBookSystemUsingJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private static AddressBook instance = null; // Singleton instance
    private List<Contact> contacts;

    private AddressBook() {
        this.contacts = new ArrayList<>();
    }

    // Thread-safe Singleton
    public static synchronized AddressBook getInstance() {
        if (instance == null) {
            instance = new AddressBook();
        }
        return instance;
    }

    // Add contact
    public void addContact(Contact contact) {
        String query = "INSERT INTO contacts (first_name, last_name, city, state, email, phone_number, pin_code) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                    preparedStatement.setString(1, contact.getFirstName());
                    preparedStatement.setString(2, contact.getLastName());
                    preparedStatement.setString(3, contact.getCity());
                    preparedStatement.setString(4, contact.getState());
                    preparedStatement.setString(5, contact.getEmail());
                    preparedStatement.setLong(6, contact.getPhoneNumber());
                    preparedStatement.setInt(7, contact.getPinCode());

                    preparedStatement.executeUpdate();
                    System.out.println("Contact added successfully!");
                }
            } else {
                System.out.println("Database connection failed. Cannot add contact.");
            }
        } catch (SQLException e) {
            System.out.println("Error adding contact: " + e.getMessage());
        }
    }

    // View all contacts
    public void viewContacts() {
        String query = "SELECT * FROM contacts";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
                System.out.println("City: " + resultSet.getString("city"));
                System.out.println("State: " + resultSet.getString("state"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("Phone: " + resultSet.getLong("phone_number"));
                System.out.println("Pincode: " + resultSet.getInt("pin_code"));
                System.out.println("------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Error fetching contacts: " + e.getMessage());
        }
    }

    // Edit contact
    public void editContacts(Contact contact) {
        String query = "UPDATE contacts SET city = ?, state = ?, email = ?, phone_number = ?, pin_code = ? WHERE first_name = ? AND last_name = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, contact.getCity());
            preparedStatement.setString(2, contact.getState());
            preparedStatement.setString(3, contact.getEmail());
            preparedStatement.setLong(4, contact.getPhoneNumber());
            preparedStatement.setInt(5, contact.getPinCode());
            preparedStatement.setString(6, contact.getFirstName());
            preparedStatement.setString(7, contact.getLastName());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Contact updated successfully!");
            } else {
                System.out.println("Contact not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating contact: " + e.getMessage());
        }
    }

    // Delete contact
    public boolean deleteContactByName(String firstName, String lastName) {
        String query = "DELETE FROM contacts WHERE first_name = ? AND last_name = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Contact deleted successfully!");
            } else {
                System.out.println("Contact not found.");
            }
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error deleting contact: " + e.getMessage());
            return false;
        }
    }
}
