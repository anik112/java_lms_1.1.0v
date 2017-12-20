/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.view;

import com.coderbd.lms.domain.Book;
import com.coderbd.lms.domain.BookReceive;
import com.coderbd.lms.domain.Student;
import com.coderbd.lms.service.BookReceiveService;
import com.coderbd.lms.service.BookService;
import com.coderbd.lms.service.StudentService;
import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rajail Islam
 */
public class LmsDashboard extends javax.swing.JFrame {

    /**
     * Creates new form LmsDashboard
     */
    public LmsDashboard() {
        initComponents();
        displayBookWithinTableBookList();
        displayDatasWithinTableStudent();
        displayDatasWithinTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblShowInstituteInformation = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblShowBookInformation = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        mnAuthor = new javax.swing.JMenuItem();
        mnBookCategory = new javax.swing.JMenuItem();
        mnPurchaseBook = new javax.swing.JMenuItem();
        mnBookIssue = new javax.swing.JMenuItem();
        mnBookReceive = new javax.swing.JMenuItem();
        mnBookSummary = new javax.swing.JMenuItem();
        mnDepartment = new javax.swing.JMenuItem();
        mnEdition = new javax.swing.JMenuItem();
        mnInstitute = new javax.swing.JMenuItem();
        mnPublisher = new javax.swing.JMenuItem();
        mnSesson = new javax.swing.JMenuItem();
        mnShift = new javax.swing.JMenuItem();
        mnStudent = new javax.swing.JMenuItem();
        mnUser = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        mnLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard | Library Management System");
        setBackground(new java.awt.Color(255, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Library Management System");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("2017-18 All Rights Reserved. Library Management System");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("[ Dash Bord ]");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Show All Book :");

        tblShowInstituteInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student Name", "Registration No", "Board Roll No", "Class Roll", "Department Id", "Shift Id", "House No", "Road No", "Block/Village", "Thana", "District", "Division", "Country"
            }
        ));
        tblShowInstituteInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowInstituteInformationMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblShowInstituteInformation);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Book Recive List :");

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book ID", "Student ID", "Return Date", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblDisplay);

        tblShowBookInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Book Code:", "Author Name:", "Publisler", "Edition", "Unit Price", "Qty", "Total Price", "Rack No", "Issu No", "Category", "Purchase date"
            }
        ));
        tblShowBookInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblShowBookInformationMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblShowBookInformation);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Student List :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(744, 744, 744)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(871, 871, 871)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2))
        );

        jMenu4.setText("File");

        mnAuthor.setText("Author");
        mnAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAuthorActionPerformed(evt);
            }
        });
        jMenu4.add(mnAuthor);

        mnBookCategory.setText("Book Category");
        mnBookCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBookCategoryActionPerformed(evt);
            }
        });
        jMenu4.add(mnBookCategory);

        mnPurchaseBook.setText("Purchase Book");
        mnPurchaseBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPurchaseBookActionPerformed(evt);
            }
        });
        jMenu4.add(mnPurchaseBook);

        mnBookIssue.setText("Book Issue ");
        mnBookIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBookIssueActionPerformed(evt);
            }
        });
        jMenu4.add(mnBookIssue);

        mnBookReceive.setText("Book Receive");
        mnBookReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBookReceiveActionPerformed(evt);
            }
        });
        jMenu4.add(mnBookReceive);

        mnBookSummary.setText("Book Summary");
        mnBookSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBookSummaryActionPerformed(evt);
            }
        });
        jMenu4.add(mnBookSummary);

        mnDepartment.setText("Department");
        mnDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDepartmentActionPerformed(evt);
            }
        });
        jMenu4.add(mnDepartment);

        mnEdition.setText("Edition");
        mnEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditionActionPerformed(evt);
            }
        });
        jMenu4.add(mnEdition);

        mnInstitute.setText("Institute");
        mnInstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInstituteActionPerformed(evt);
            }
        });
        jMenu4.add(mnInstitute);

        mnPublisher.setText("Publisher");
        mnPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPublisherActionPerformed(evt);
            }
        });
        jMenu4.add(mnPublisher);

        mnSesson.setText("Sesson");
        mnSesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSessonActionPerformed(evt);
            }
        });
        jMenu4.add(mnSesson);

        mnShift.setText("Shift");
        mnShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnShiftActionPerformed(evt);
            }
        });
        jMenu4.add(mnShift);

        mnStudent.setText("Student");
        mnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStudentActionPerformed(evt);
            }
        });
        jMenu4.add(mnStudent);

        mnUser.setText("User");
        mnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUserActionPerformed(evt);
            }
        });
        jMenu4.add(mnUser);

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu4.add(mnExit);

        menuBar.add(jMenu4);

        mnHelp.setText("Help");
        menuBar.add(mnHelp);

        mnLogout.setText("Logout");
        mnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLogoutMouseClicked(evt);
            }
        });
        menuBar.add(mnLogout);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnBookCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBookCategoryActionPerformed

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(true);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);

    }//GEN-LAST:event_mnBookCategoryActionPerformed

    private void mnAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAuthorActionPerformed
        this.setVisible(false);

        new LmsAuthor().setVisible(true);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);
    }//GEN-LAST:event_mnAuthorActionPerformed

    private void mnPurchaseBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPurchaseBookActionPerformed
        this.setVisible(false);

        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(true);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);
    }//GEN-LAST:event_mnPurchaseBookActionPerformed

    private void mnBookIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBookIssueActionPerformed

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(true);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);

    }//GEN-LAST:event_mnBookIssueActionPerformed

    private void mnBookReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBookReceiveActionPerformed

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(true);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);

    }//GEN-LAST:event_mnBookReceiveActionPerformed

    private void mnBookSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBookSummaryActionPerformed

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(true);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);

    }//GEN-LAST:event_mnBookSummaryActionPerformed

    private void mnDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDepartmentActionPerformed

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(true);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);

    }//GEN-LAST:event_mnDepartmentActionPerformed

    private void mnEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditionActionPerformed

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(true);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);

    }//GEN-LAST:event_mnEditionActionPerformed

    private void mnInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInstituteActionPerformed

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(true);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);

    }//GEN-LAST:event_mnInstituteActionPerformed

    private void mnPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPublisherActionPerformed
        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(true);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);
    }//GEN-LAST:event_mnPublisherActionPerformed

    private void mnSessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSessonActionPerformed
        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(true);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);
    }//GEN-LAST:event_mnSessonActionPerformed

    private void mnShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnShiftActionPerformed
        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(true);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);
    }//GEN-LAST:event_mnShiftActionPerformed

    private void mnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStudentActionPerformed
        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(true);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(false);
    }//GEN-LAST:event_mnStudentActionPerformed

    private void mnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUserActionPerformed
        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(true);

        new LoginForm().setVisible(false);
    }//GEN-LAST:event_mnUserActionPerformed

    private void tblShowBookInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowBookInformationMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblShowBookInformationMouseClicked

    private void tblShowInstituteInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblShowInstituteInformationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblShowInstituteInformationMouseClicked

    private void mnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLogoutMouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        new LmsAuthor().setVisible(false);
        new LmsBookCategory().setVisible(false);
        new LmsPurchaseBook().setVisible(false);
        new LmsBookIssue().setVisible(false);
        new LmsBookReceive().setVisible(false);
        new LmsBookSummary().setVisible(false);
        new LmsDepartment().setVisible(false);
        new LmsEdition().setVisible(false);
        new LmsInstitute().setVisible(false);
        new LmsPublisher().setVisible(false);
        new LmsSesson().setVisible(false);
        new LmsShift().setVisible(false);
        new LmsStudent().setVisible(false);
        new LmsUser().setVisible(false);

        new LoginForm().setVisible(true);

    }//GEN-LAST:event_mnLogoutMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    public void displayDatasWithinTable() {
        BookReceiveService bookReceiveService = new BookReceiveService();
        List<BookReceive> pList = bookReceiveService.getList();
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        Object[] row = new Object[6];

        for (int i = 0; i < pList.size(); i++) {

            row[0] = pList.get(i).getId();
            row[1] = pList.get(i).getBookId();
            row[2] = pList.get(i).getStudentId();
            row[3] = pList.get(i).getReturnDate();
            row[4] = pList.get(i).getQty();
            row[5] = pList.get(i).getStatus();

            model.addRow(row);
        }

    }

    public void displayDatasWithinTableStudent() {
        StudentService studentService = new StudentService();
        List<Student> pList = studentService.getList();
        DefaultTableModel model = (DefaultTableModel) tblShowInstituteInformation.getModel();
        Object[] row = new Object[14];

        for (int i = 0; i < pList.size(); i++) {
            row[0] = pList.get(i).getId();
            row[1] = pList.get(i).getName();
            row[2] = pList.get(i).getRegistrationNo();
            row[3] = pList.get(i).getBoardRollNo();
            row[4] = pList.get(i).getClassRoll();
            row[5] = pList.get(i).getDepartmentId();
            row[6] = pList.get(i).getShiftId();
            row[7] = pList.get(i).getHouseNo();
            row[8] = pList.get(i).getRoadNo();
            row[9] = pList.get(i).getBlockOrVillage();
            row[10] = pList.get(i).getThana();
            row[11] = pList.get(i).getDistrict();
            row[12] = pList.get(i).getDivision();
            row[13] = pList.get(i).getCountry();

            model.addRow(row);
        }

    }

    public void displayBookWithinTableBookList() {
        BookService bookService = new BookService();
        List<Book> pList = bookService.getList();
        DefaultTableModel model = (DefaultTableModel) tblShowBookInformation.getModel();
        Object[] row = new Object[13];

        for (int i = 0; i < pList.size(); i++) {
            row[0] = pList.get(i).getId();
            row[1] = pList.get(i).getName();
            row[2] = pList.get(i).getBookCode();
            row[3] = pList.get(i).getAuthor();
            row[4] = pList.get(i).getPublisher();
            row[5] = pList.get(i).getEdition();
            row[6] = pList.get(i).getUnitPrice();
            row[7] = pList.get(i).getQty();
            row[8] = pList.get(i).getTotalPrice();
            row[9] = pList.get(i).getRackNo();
            row[10] = pList.get(i).getIssnNo();
            row[11] = pList.get(i).getCategory();
            row[12] = pList.get(i).getPurchaseDate();

            model.addRow(row);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LmsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LmsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LmsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LmsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LmsDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnAuthor;
    private javax.swing.JMenuItem mnBookCategory;
    private javax.swing.JMenuItem mnBookIssue;
    private javax.swing.JMenuItem mnBookReceive;
    private javax.swing.JMenuItem mnBookSummary;
    private javax.swing.JMenuItem mnDepartment;
    private javax.swing.JMenuItem mnEdition;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenuItem mnInstitute;
    private javax.swing.JMenu mnLogout;
    private javax.swing.JMenuItem mnPublisher;
    private javax.swing.JMenuItem mnPurchaseBook;
    private javax.swing.JMenuItem mnSesson;
    private javax.swing.JMenuItem mnShift;
    private javax.swing.JMenuItem mnStudent;
    private javax.swing.JMenuItem mnUser;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTable tblShowBookInformation;
    private javax.swing.JTable tblShowInstituteInformation;
    // End of variables declaration//GEN-END:variables
}
