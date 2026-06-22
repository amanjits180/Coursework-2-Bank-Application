import java.awt.Color;

import javax.swing.*;

public class BankApplicationsForm {

            //Sequential account number counter
            private static int accountCounter = 1;

    public static void main(String [] args){
            JFrame frame = new JFrame();
    
            frame.setTitle("First Bank Uganda Account Opening Form");
            frame.setSize(900, 700);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
    
            JLabel lblFirstName = new JLabel("First Name");
            lblFirstName.setBounds(20,20,100,25);
            frame.add(lblFirstName);
    
            JTextField txtFirstName = new JTextField();
            txtFirstName.setBounds(130,20,200,25);
            frame.add(txtFirstName);

                    // First Name Error Message

            JLabel errFirstName = new JLabel("");
            errFirstName.setBounds(340,20,250,25);
            errFirstName.setForeground(Color.RED);
            frame.add(errFirstName);
    
            JLabel lblLastName = new JLabel("Last Name");
            lblLastName.setBounds(20,60,100,25);
            frame.add(lblLastName);
    
            JTextField txtLastName = new JTextField();
            txtLastName.setBounds(130,60,200,25);
            frame.add(txtLastName);

                    // Last Name Error Message

            JLabel errLastName = new JLabel("");
            errLastName.setBounds(340,60,250,25);
            errLastName.setForeground(Color.RED);
            frame.add(errLastName);
            
            JLabel lblNIN = new JLabel("National ID (NIN)");
            lblNIN.setBounds(20,100,100,25);
            frame.add(lblNIN);
    
            JTextField txtNIN = new JTextField();
            txtNIN.setBounds(130,100,200,25);
            frame.add(txtNIN);

                    //NIN Error Message

            JLabel errNIN = new JLabel("");
            errNIN.setBounds(340,100,250,25);
            errNIN.setForeground(Color.RED);
            frame.add(errNIN);
    
            JLabel lblEmail = new JLabel("Email");
            lblEmail.setBounds(20,140,100,25);
            frame.add(lblEmail);
    
            JTextField txtEmail = new JTextField();
            txtEmail.setBounds(130,140,200,25);
            frame.add(txtEmail);

                    //Email Error Message

            JLabel errEmail = new JLabel("");
            errEmail.setBounds(340,140,250,25);
            errLastName.setForeground(Color.RED);
            frame.add(errEmail);
    
            JLabel lblConfirmEmail = new JLabel("Confirm Email");
            lblConfirmEmail.setBounds(20,180,100,25);
            frame.add(lblConfirmEmail);
    
            JTextField txtConfirmEmail = new JTextField();
            txtConfirmEmail.setBounds(130,180,200,25);
            frame.add(txtConfirmEmail);
    
            JLabel lblPhoneNumber = new JLabel("Phone Number");
            lblPhoneNumber.setBounds(20,220,100,25);
            frame.add(lblPhoneNumber);
    
            JTextField txtPhoneNumber = new JTextField();
            txtPhoneNumber.setBounds(130,220,200,25);
            frame.add(txtPhoneNumber);

                    //Phone Number Error Message

            JLabel errPhoneNumber = new JLabel("");
            errPhoneNumber.setBounds(340,220,250,25);
            errPhoneNumber.setForeground(Color.RED);
            frame.add(errPhoneNumber);
    
            JLabel lblPIN = new JLabel("PIN");
            lblPIN.setBounds(20,260,100,25);
            frame.add(lblPIN);
    
            JPasswordField txtPIN = new JPasswordField();
            txtPIN.setBounds(130,260,200,25);
            frame.add(txtPIN);

                    //PIN Error Message

            JLabel errPIN = new JLabel("");
            errPIN.setBounds(340,260,250,25);
            errPIN.setForeground(Color.RED);
            frame.add(errPIN);
    
            JLabel lblConfirmPIN = new JLabel("Confirm PIN");
            lblConfirmPIN.setBounds(20,300,100,25);
            frame.add(lblConfirmPIN);
    
            JPasswordField txtConfirmPIN = new JPasswordField();
            txtConfirmPIN.setBounds(130,300,200,25);
            frame.add(txtConfirmPIN);
    
            JLabel lblDOB = new JLabel("Date of Birth");
            lblDOB.setBounds(20,340,100,25);
            frame.add(lblDOB);
    
            String[] years = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007"};
            JComboBox<String> cmbYear = new JComboBox<>(years);
            cmbYear.setBounds(130,340,80,25);
            frame.add(cmbYear);
    
           String[] months = {"January", "February", "March", "April","May", "June", "July", "August", "September", "October", "November", "December"};
            JComboBox<String> cmbMonth = new JComboBox<>(months);
            cmbMonth.setBounds(220,340,100,25);
            frame.add(cmbMonth);
    
            String[] days = {"1", "2", "3", "4","5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
            JComboBox<String> cmbDay = new JComboBox<>(days);
            cmbDay.setBounds(330,340,80,25);
            frame.add(cmbDay);

            //Date of Birth Validation and Auto Update

            cmbMonth.addActionListener(e -> {

    int year = Integer.parseInt((String) cmbYear.getSelectedItem());
    String month = (String) cmbMonth.getSelectedItem();

    int daysInMonth = 31;

    if(month.equals("April") ||
       month.equals("June") ||
       month.equals("September") ||
       month.equals("November")) {

        daysInMonth = 30;
    }

    else if(month.equals("February")) {

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth = 29;
        }
        else {
            daysInMonth = 28;
        }
    }

    cmbDay.removeAllItems();

    for(int i = 1; i <= daysInMonth; i++) {
        cmbDay.addItem(String.valueOf(i));
    }
});
    
            JLabel lblAccountType = new JLabel("Account Type");
            lblAccountType.setBounds(20,380,100,25);
            frame.add(lblAccountType);
    
            String[] accountTypes = {"Savings Account",
                                    "Current Account",
                                    "Fixed Deposit Account",
                                    "Student Account",
                                    "Joint Account"};
            JComboBox<String> cmbAccountType = new JComboBox<>(accountTypes);
            cmbAccountType.setBounds(130,380,200,25);
            frame.add(cmbAccountType);
    
            JLabel lblBranch = new JLabel("Branch");
            lblBranch.setBounds(20,420,100,25);
            frame.add(lblBranch);
    
            String[] branches = {"Kampala", "Gulu", "Mbarara", "Jinja", "Mbale"};
            JComboBox<String> cmbBranch = new JComboBox<>(branches);
            cmbBranch.setBounds(130,420,200,25);
            frame.add(cmbBranch);
    
            JLabel lblDeposit = new JLabel("Opening Deposit");
            lblDeposit.setBounds(20,460,100,25);
            frame.add(lblDeposit);
    
            JTextField txtDeposit = new JTextField();
            txtDeposit.setBounds(130,460,200,25);
            frame.add(txtDeposit);

                        //Opening Deposit Error Message

            JLabel errDeposit = new JLabel("");
            errDeposit.setBounds(340,460,250,25);
            errDeposit.setForeground(Color.RED);
            frame.add(errDeposit);
    
            JButton btnSubmit = new JButton("Submit");
            btnSubmit.setBounds(20, 500, 100, 30);
            frame.add(btnSubmit);
    
            JButton btnReset = new JButton("Reset");
            btnReset.setBounds(140, 500, 100, 30);
            frame.add(btnReset);

            JLabel lblSummary = new JLabel("Account Summary is Below:");
            lblSummary.setBounds(20, 550, 250, 25);
            frame.add(lblSummary);
    
            JTextArea txtSummary = new JTextArea();
            txtSummary.setBounds(20, 580, 850, 600);
            txtSummary.setEditable(false);
            frame.add(txtSummary);

                        // Reset Button Function

btnReset.addActionListener(e -> {

    txtFirstName.setText("");
    txtLastName.setText("");
    txtNIN.setText("");
    txtEmail.setText("");
    txtConfirmEmail.setText("");
    txtPhoneNumber.setText("");
    txtPIN.setText("");
    txtConfirmPIN.setText("");
    txtDeposit.setText("");

    cmbYear.setSelectedIndex(0);
    cmbMonth.setSelectedIndex(0);
    cmbDay.setSelectedIndex(0);
    cmbAccountType.setSelectedIndex(0);
    cmbBranch.setSelectedIndex(0);

    txtSummary.setText("");
});
    
            btnSubmit.addActionListener(e -> {

                //Clear Previous Error Messages

        errFirstName.setText("");
errLastName.setText("");
errNIN.setText("");
errEmail.setText("");
errPhoneNumber.setText("");
errPIN.setText("");
errDeposit.setText("");

                // Store All Validation Errors
            String errors = "";


                // First Name and last Name Validation
                String firstName = txtFirstName.getText().trim();
String lastName = txtLastName.getText().trim();

if(firstName.length() < 2 || firstName.length() > 30){

    errFirstName.setText("2-30 characters required");

    errors += "• First Name must be between 2 and 30 characters\n";
}

if(lastName.length() < 2 || lastName.length() > 30){

    errLastName.setText("2-30 characters required");

    errors += "• Last Name must be between 2 and 30 characters\n";
}

if(!firstName.matches("[a-zA-Z]+")){

    errFirstName.setText("Letters only");

    errors += "• First Name must contain letters only\n";
}

if(!lastName.matches("[a-zA-Z]+")){

    errLastName.setText("Letters only");

    errors += "• Last Name must contain letters only\n";
}

                // NIN Validation 
String nin = txtNIN.getText().trim();

if(nin.isEmpty()){

    errNIN.setText("NIN required");

    errors += "• NIN is required\n";
}

if(nin.length() != 14){

    errNIN.setText("Must be 14 characters");

    errors += "• NIN must contain exactly 14 characters\n";
}

if(!nin.matches("[A-Z0-9]{14}")){

    errNIN.setText("Uppercase letters & numbers only");

    errors += "• NIN must be uppercase letters and numbers only\n";
}

                // Email Validation

String email = txtEmail.getText().trim();
String confirmEmail = txtConfirmEmail.getText().trim();

if(email.isEmpty()){

    errEmail.setText("Email required");

    errors += "• Email is required\n";
}

if(!email.contains("@") || !email.contains(".")){

    errEmail.setText("Invalid email");

    errors += "• Enter a valid email address\n";
}

if(!email.equals(confirmEmail)){

    errEmail.setText("Emails do not match");

    errors += "• Email and Confirm Email do not match\n";
}

                // Phone Number Validation

String phoneNumber = txtPhoneNumber.getText().trim();

if(phoneNumber.isEmpty()){

    errPhoneNumber.setText("Phone required");

    errors += "• Phone Number is required\n";
}

if(!phoneNumber.matches("\\+256\\d{9}")){

    errPhoneNumber.setText("Use +256XXXXXXXXX");

    errors += "• Phone Number must be in the format +256XXXXXXXXX\n";
}

                    // PIN Validation

String pin = new String(txtPIN.getPassword());
String confirmPin = new String(txtConfirmPIN.getPassword());

if(pin.isEmpty() || confirmPin.isEmpty()){

    errPIN.setText("PIN required");

    errors += "• PIN and Confirm PIN are required\n";
}

if(!pin.matches("\\d{4,6}")){

    errPIN.setText("4-6 digits only");

    errors += "• PIN must contain 4 to 6 digits only\n";
}

if(!pin.equals(confirmPin)){

    errPIN.setText("PINs do not match");

    errors += "• PIN and Confirm PIN do not match\n";
}

if(pin.matches("(\\d)\\1+")){

    errPIN.setText("Identical digits not allowed");

    errors += "• PIN cannot contain identical digits only\n";
}

                    // Age Validation

int birthYear = Integer.parseInt((String) cmbYear.getSelectedItem());

int age = 2026 - birthYear;

if(age < 18 || age > 75){
    JOptionPane.showMessageDialog(frame,
            "Applicant age must be between 18 and 75 years");
    return;
}

String accountType = (String) cmbAccountType.getSelectedItem();

if(accountType.equals("Student Account") && (age < 18 || age > 25)){
    JOptionPane.showMessageDialog(frame,
            "Student Account holders must be between 18 and 25 years");
    return;
}
        
    
        // Opening Deposit Validation

String depositText = txtDeposit.getText().trim();

if(depositText.isEmpty()){

    errDeposit.setText("Deposit required");

    errors += "• Opening Deposit is required\n";
}

if(!depositText.matches("\\d+")){

    errDeposit.setText("Numbers only");

    errors += "• Opening Deposit must contain numbers only\n";
}

double deposit = Double.parseDouble(depositText);

            // Display All Validation Errors

if(!errors.isEmpty()){

    JOptionPane.showMessageDialog(frame,
            "Please correct the following errors:\n\n" + errors);

    return;
}


       // Account Object Creation Using Polymorphism

Account account = null;

if(accountType.equals("Savings Account")){
    account = new SavingsAccount();
}

else if(accountType.equals("Current Account")){
    account = new CurrentAccount();
}

else if(accountType.equals("Fixed Deposit Account")){
    account = new FixedDepositAccount();
}

else if(accountType.equals("Student Account")){
    account = new StudentAccount();
}

else if(accountType.equals("Joint Account")){
    account = new JointAccount();
}

double minimumDeposit = account.minimumDeposit();

        if(deposit >= minimumDeposit){

            // Part D - Account Number Generation and Summary

String branch = (String) cmbBranch.getSelectedItem();

String branchCode = "";

if(branch.equals("Kampala")){
    branchCode = "KLA";
}
else if(branch.equals("Gulu")){
    branchCode = "GUL";
}
else if(branch.equals("Mbarara")){
    branchCode = "MBR";
}
else if(branch.equals("Jinja")){
    branchCode = "JIN";
}
else if(branch.equals("Mbale")){
    branchCode = "MBA";
}

        // Generate Sequential Account Number

String accountNumber = branchCode + "-2026-" +
        String.format("%06d", accountCounter);

accountCounter++;

String dob =
        cmbYear.getSelectedItem() + "-" +
        cmbMonth.getSelectedItem() + "-" +
        cmbDay.getSelectedItem();

String summary =
        "ACC: " + accountNumber +
        "\nName: " + firstName + " " + lastName +
        "\nAccount Type: " + accountType +
        "\nBranch: " + branch +
        "\nDate of Birth: " + dob +
        "\nPhone Number: " + phoneNumber +
        "\nOpening Deposit: UGX " + deposit +
        "\nEmail: " + email;

txtSummary.setText(summary);

try {

    java.sql.Connection conn = DatabaseConnection.getConnection();
    if(conn == null){
        JOptionPane.showMessageDialog(frame,
             "Database connection failed");
             return;
    }

    String sql = "INSERT INTO Accounts "
            + "(AccountNumber, FirstName, LastName, NIN, Email, "
            + "PhoneNumber, DateOfBirth, AccountType, Branch, Deposit) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    java.sql.PreparedStatement pst = conn.prepareStatement(sql);

    pst.setString(1, accountNumber);
    pst.setString(2, firstName);
    pst.setString(3, lastName);
    pst.setString(4, nin);
    pst.setString(5, email);
    pst.setString(6, phoneNumber);
    pst.setString(7, dob);
    pst.setString(8, accountType);
    pst.setString(9, branch);
    pst.setDouble(10, deposit);

    pst.executeUpdate();

    pst.close();
    conn.close();

}
catch(Exception ex) {
    ex.printStackTrace();
}

            String message = "";

            if(accountType.equals("Savings Account")){
                message = "Deposit Accepted\nSpecial Rule: Earns interest, no overdraft";
            }

            else if (accountType.equals("Current Account")){
                message = "Deposit Accepted\nSpecial Rule: Overdraft allowed, no interest";
            }

            else if(accountType.equals("Fixed Deposit Account")) {
                message = "Deposit Accepted\nSpecial Rule: Locked term, highest interest";
            }

            else if(accountType.equals("Student Account")){
                message ="Deposit Accepted\nSpecial Rule: Applicant age must be 18-25";
            }

            else if(accountType.equals("Joint Account")) {
                message = "Deposit Accepted\nSpecial Rule: Requires a second NIN";
            }

            JOptionPane.showMessageDialog(frame, message);
        }

        else{
            JOptionPane.showMessageDialog(frame,
                "Deposit is below minimum requirement");
        }

    });

            frame.setVisible(true);
    }
}

  
