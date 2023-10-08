/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trytable;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author humam.daas
 */
public class frame1 extends javax.swing.JFrame {
    
    private int i = 0, j = 0 ,SizeOfDatai;
    private static int temp_counter = 0;
    public String AllData[][] = new String[1000][4];

//      get :   
    public int get_sizeOfDatai(){
        return SizeOfDatai;
    }
//    set :
    public void set_sizeOfDatai(int s){
        this.SizeOfDatai = s;
    }
    public String[][] SendDataForSave(){
        return AllData;
    }
   
    public frame1() {
        initComponents();
        auto_laod();
        setIconImage(putIconToFrame().getImage());
        txtName.setBackground(new java.awt.Color(255,204,255));
    }
    
//  
    private ImageIcon putIconToFrame(){
        ImageIcon logo = new ImageIcon("E:\\codejava\\tryTable\\OIP.jpg");
        return logo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtFather = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        noteLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        score = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addData = new javax.swing.JButton();
        DelData = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students_Registration");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 16)); // NOI18N
        jLabel2.setText("Student's name:");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 16)); // NOI18N
        jLabel3.setText("Fanther's name:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 16)); // NOI18N
        jLabel4.setText("Phone number :");

        txtName.setBackground(new java.awt.Color(204, 153, 255));
        txtName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtFather.setBackground(new java.awt.Color(204, 153, 255));
        txtFather.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtFather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFatherMouseClicked(evt);
            }
        });
        txtFather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherActionPerformed(evt);
            }
        });
        txtFather.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFatherKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFatherKeyTyped(evt);
            }
        });

        txtPhone.setBackground(new java.awt.Color(204, 153, 255));
        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhoneMouseClicked(evt);
            }
        });
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 204, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        noteLabel.setBackground(new java.awt.Color(255, 51, 51));
        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noteLabel.setText(" the number should be contain only 10 digits with zero ");
        noteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noteLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noteLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setForeground(new java.awt.Color(255, 255, 102));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Candara", 3, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("   NOTE :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 16)); // NOI18N
        jLabel5.setText("Total Score :");

        score.setBackground(new java.awt.Color(204, 153, 255));
        score.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        score.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreMouseClicked(evt);
            }
        });
        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });
        score.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scoreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scoreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFather, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addComponent(score, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFather, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Students information");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(101, 98, 98));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Father", "Phone", "Total Score"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search.setForeground(new java.awt.Color(102, 102, 102));
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trytable/search.jpg"))); // NOI18N
        jLabel8.setText("Search :");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
        );

        addData.setBackground(new java.awt.Color(255, 204, 204));
        addData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addData.setText("Add Data");
        addData.setFocusPainted(false);
        addData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addDataMouseExited(evt);
            }
        });
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });

        DelData.setBackground(new java.awt.Color(255, 204, 204));
        DelData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DelData.setText("Delete");
        DelData.setFocusPainted(false);
        DelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DelDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DelDataMouseExited(evt);
            }
        });
        DelData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelDataActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 204, 204));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UpDate");
        update.setFocusPainted(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("Clear");
        clear.setFocusPainted(false);
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        deleteData.setBackground(new java.awt.Color(255, 204, 204));
        deleteData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteData.setText("Delete Data");
        deleteData.setFocusPainted(false);
        deleteData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteDataMouseExited(evt);
            }
        });
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 255));

        jMenu1.setBackground(new java.awt.Color(255, 204, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuExit.setForeground(new java.awt.Color(255, 0, 0));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trytable/exit.jpg"))); // NOI18N
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        String str = txtName.getText();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
      
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtFatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherActionPerformed
        
    }//GEN-LAST:event_txtFatherActionPerformed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '+' || c == '=' || c == '*' || c == '/' || c == '\\' || c == '|' || c == '-' || c == ','){
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
        int tempAdd = get_sizeOfDatai();
        if(txtName.getText().equals("") || txtFather.getText().equals("")
            || txtPhone.getText().equals("") || score.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter all data... !");
        }
        else {
            tempAdd++;
            set_sizeOfDatai(tempAdd);
            String data[] = {txtName.getText(), txtFather.getText(),  txtPhone.getText(),score.getText()};
            DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
            tbl.addRow(data);
            AllData[i][j] = txtName.getText() + ","; 
            j++;
            AllData[i][j] = txtFather.getText() + ","; 
            j++;
            AllData[i][j] = txtPhone.getText() + ","; 
            j++;
            AllData[i][j] = score.getText();
            j = 0; i++;
            txtName.setText("");
            txtFather.setText("");
            txtPhone.setText("");
            score.setText("");
                
            auto_saveForAdd();
//            
            }
            txtPhone.setBackground(new java.awt.Color(204,153,255));
            txtFather.setBackground(new java.awt.Color(204,153,255));
            txtName.setBackground(new java.awt.Color(204,153,255));
            score.setBackground(new java.awt.Color(204,153,255));
        
    }//GEN-LAST:event_addDataActionPerformed

    private void txtFatherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFatherKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '+' || c == '=' || c == '*' || c == '/' || c == '\\' || c == '|' ){
            evt.consume();
        }
    }//GEN-LAST:event_txtFatherKeyTyped

    private void DelDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelDataActionPerformed
        int tempDelete = get_sizeOfDatai();
        //get jTable first :
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
       //delete row :
       if(jTable1.getSelectedRowCount() == 1){
           tbl.removeRow(jTable1.getSelectedRow());
           tempDelete--;
           set_sizeOfDatai(tempDelete);
            try {
                //           auto_save();
                auto_saveForDelete();
            } catch (IOException ex) {
                Logger.getLogger(frame1.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtName.setText("");
            txtFather.setText("");
            txtPhone.setText("");
            score.setText("");
       }
       //if table is empty :
       else if(jTable1.getRowCount() == 0){
           JOptionPane.showMessageDialog(this, "Table is empty");
       }
       //if table is not empty but row is not selected or multuple is selected :
       else {
           JOptionPane.showMessageDialog(this, "Please select Single row for delete");
       }
    }//GEN-LAST:event_DelDataActionPerformed
       
//    prevent user to update directly on tabel
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        boolean a = jTable1.isEditing();
        if(a == false){
            JOptionPane.showMessageDialog(this, "You can not edit...");
        }
        DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
        String name = tbl.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String father = tbl.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String phone = tbl.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String Score = tbl.getValueAt(jTable1.getSelectedRow(), 3).toString();
//        put names in the fields after selection
        txtName.setText(name); 
        txtFather.setText(father);
        txtPhone.setText(phone);
        score.setText(Score);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
//        get table model : 
        DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1){
            
//            get data in textfiled after update :
            String name = txtName.getText();
            String father = txtFather.getText();
            String phone = txtPhone.getText();
            String Score = score.getText();

            // put new data in table : 
            tbl.setValueAt(name, jTable1.getSelectedRow(), 0);
            tbl.setValueAt(father, jTable1.getSelectedRow(), 1);
            tbl.setValueAt(phone, jTable1.getSelectedRow(), 2);
            tbl.setValueAt(Score, jTable1.getSelectedRow(), 3);
//            
            txtName.setText("");
            txtFather.setText("");
            txtPhone.setText("");
            score.setText("");
            
            // show pane 
            JOptionPane.showMessageDialog(this, "UpDate Successfully..");
            
//           save data after update
            int rowCount = jTable1.getRowCount();
            int columnCount = jTable1.getColumnCount();
            String strAfterUpdate[][] = new String [10000][4];
            for (int row = 0; row < rowCount; row++) {
                for (int column = 0; column < columnCount; column++) {
                    Object value = jTable1.getValueAt(row, column);
                    strAfterUpdate[row][column] = value + ",";
                }
            }
            clear_file(strAfterUpdate);
            }
            else{
                if(jTable1.getRowCount() == 0){
                    JOptionPane.showMessageDialog(this, "Table is Empty..");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please select single row For update... ");
                }
            }
    }//GEN-LAST:event_updateActionPerformed

    private void auto_saveForAdd() {
        //save data
        try{
            FileWriter fileWriter = new FileWriter("data.txt", true);
            
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
//            PrintWriter PrintInFile = new PrintWriter("data.txt");
            String newLine = System.getProperty("line.separator");
            for(int i = temp_counter; i < get_sizeOfDatai() + 1; i++)
            {   
                for(int j = 0; j < 4; j++)
                {
                    if(AllData[i][j] != null ){
                        bufferedWriter.write(AllData[i][j]);
                        
                        if(j == 3){
                            bufferedWriter.write(newLine);
                        }                   
                    }
                    else
                    {
                        int sizeOfData = get_sizeOfDatai();
//                        System.out.println("size after save is :" + sizeOfData) ;
//                    save size of data
                        try{
                            String st = String.valueOf(sizeOfData);
                            BufferedWriter write = new BufferedWriter(new FileWriter("size.txt"));
                            write.write(st);
                            write.close();
//                            PrintInFile.close();
                        }catch(IOException e){}
                
//                        System.out.println("sizeofdata:" + SizeOfDatai);
                         bufferedWriter.close();
                        j = 4;
                        i = AllData.length;
                    }
                }                
            }
            temp_counter++;
        
        }catch(Exception e){}
    }
    
//  save after delete   
    public void auto_saveForDelete() throws IOException{
        int rowCount = jTable1.getRowCount();
        int columnCount = jTable1.getColumnCount();
        String strAfterDelete[][] = new String [10000][4];
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Object value = jTable1.getValueAt(row, column);
                strAfterDelete[row][column] = value + ",";
            }
        }
       
        clear_file(strAfterDelete);
        
    }
    
    private void clear_file(String arr[][]){
        
        try{
            PrintWriter writer = new PrintWriter("data.txt");
            
            String newLine = System.getProperty("line.separator");
            for(int i = 0; i < jTable1.getRowCount(); i++)
            {   
                for(int j = 0; j < 4; j++)
                {
                   
                    if(j == 3){
                        writer.print(arr[i][j]);
                        writer.println();
                    }
                    else{ 
//                            bufferedWriter.write(arr[i][j]);
                        writer.print(arr[i][j]);
                    }
                }                
            }
                    
//                    save size of data
                        try{
                            String st = String.valueOf(jTable1.getRowCount());
                            PrintWriter write = new PrintWriter("size.txt");
                            write.print(st);
                            write.close();
                        }catch(IOException e){}
                
                        writer.close();
                    
        }catch(Exception e){}
        

    }
//   load     
    private void auto_laod(){
       Scanner sc;
//        read size of data
        int size = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("size.txt"));
            size = Integer.parseInt(reader.readLine());
            reader.close();
        }
        catch(IOException e){}  
        catch(NumberFormatException e){}
        set_sizeOfDatai(size);
        if(size != 0){
            String str[][] = new String[size][4];
            
    //        read data from data file
            
            try {
                sc = new Scanner(new BufferedReader(new FileReader("data.txt")));  
                while(sc.hasNextLine()) {
                    for (int i = 0; i < size; i++) {
                        String[] line = sc.nextLine().trim().split(",");
                        for (int j = 0; j < 4; j++) {
                           str[i][j] = line[j];
//                           System.out.println("str is line :  " + line[j]);
                        }
                    }
                }
            }   catch( ArrayIndexOutOfBoundsException e){
                        System.out.println("errrror Index out.......");
                }
            catch (FileNotFoundException ex ) {
                System.out.println("error not foundv......");
            }
            DefaultTableModel mod = (DefaultTableModel)jTable1.getModel();
            String row [];

//          to move data from 2D array to simple arrary and add to table  
            for(int i = 0; i < size; i++){
                row = new String[4];
                for(int j = 0; j < 4; j++){
                    row[j] = str[i][j];
                }
                mod.addRow(row);
            }
            
        }
    }
   /*    */
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txtName.setText("");
        txtFather.setText("");
        txtPhone.setText("");
        score.setText("");
    }//GEN-LAST:event_clearActionPerformed
    /**/
    private void addDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataMouseEntered
        addData.setBackground(new java.awt.Color(204,153,255));
    }//GEN-LAST:event_addDataMouseEntered

    private void addDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataMouseExited
        addData.setBackground(new java.awt.Color(255, 204, 204));
    }//GEN-LAST:event_addDataMouseExited

    private void DelDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelDataMouseEntered
        DelData.setBackground(new java.awt.Color(204,153,255));
    }//GEN-LAST:event_DelDataMouseEntered

    private void DelDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelDataMouseExited
        DelData.setBackground(new java.awt.Color(255, 204, 204));
    }//GEN-LAST:event_DelDataMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(new java.awt.Color(204,153,255));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(new java.awt.Color(255, 204, 204));
    }//GEN-LAST:event_updateMouseExited

    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreActionPerformed

    private void scoreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || c == '+' || c == '=' || c == '*' || c == '/' || c == '\\' || c == '|' || c == '_'){
            evt.consume();
        }
    }//GEN-LAST:event_scoreKeyTyped

    private void DelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelDataMouseClicked
       
    }//GEN-LAST:event_DelDataMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        txtName.setBackground(new java.awt.Color(255,204,255));
        score.setBackground(new java.awt.Color(204,153,255));
        txtPhone.setBackground(new java.awt.Color(204,153,255));
        txtFather.setBackground(new java.awt.Color(204,153,255));
        txtName.setSelectedTextColor(Color.red);
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtFatherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFatherMouseClicked
        txtFather.setBackground(new java.awt.Color(255,204,255));
        txtFather.setSelectedTextColor(Color.red);
        txtName.setBackground(new java.awt.Color(204,153,255));
        score.setBackground(new java.awt.Color(204,153,255));
        txtPhone.setBackground(new java.awt.Color(204,153,255));
    }//GEN-LAST:event_txtFatherMouseClicked

    private void txtPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneMouseClicked
        txtPhone.setBackground(new java.awt.Color(255,204,255));
        txtFather.setBackground(new java.awt.Color(204,153,255));
        txtName.setBackground(new java.awt.Color(204,153,255));
        score.setBackground(new java.awt.Color(204,153,255));
        txtPhone.setSelectedTextColor(Color.red);
    }//GEN-LAST:event_txtPhoneMouseClicked

    private void scoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreMouseClicked
        score.setBackground(new java.awt.Color(255,204,255));
        txtPhone.setBackground(new java.awt.Color(204,153,255));
        txtFather.setBackground(new java.awt.Color(204,153,255));
        txtName.setBackground(new java.awt.Color(204,153,255));
        score.setSelectedTextColor(Color.red);
    }//GEN-LAST:event_scoreMouseClicked

    private void noteLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteLabelMouseEntered
       noteLabel.setForeground(new java.awt.Color(255,51,51));

    }//GEN-LAST:event_noteLabelMouseEntered

    private void noteLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteLabelMouseExited
       noteLabel.setForeground(new java.awt.Color(0));
    }//GEN-LAST:event_noteLabelMouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new java.awt.Color(0,153,153));
        jPanel5.setForeground(new java.awt.Color(70,50,100));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new java.awt.Color(255,204,255));
        jPanel5.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jPanel5MouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(new java.awt.Color(204,153,255));    
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(new java.awt.Color(255, 204, 204));
    }//GEN-LAST:event_clearMouseExited

    private void deleteDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteDataMouseEntered
        deleteData.setBackground(Color.red);
        deleteData.setFont(new java.awt.Font("Tahoma", 3, 14));
        deleteData.setForeground(Color.white);
    }//GEN-LAST:event_deleteDataMouseEntered

    private void deleteDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteDataMouseExited
        deleteData.setBackground(new java.awt.Color(255,204,204));
        deleteData.setFont(new java.awt.Font("Tahoma", 1, 11));
        deleteData.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_deleteDataMouseExited

    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed
        int i = jTable1.getRowCount();
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        for(int k = 0 ; k < jTable1.getRowCount() ;){
            tb.removeRow(k);
        }
        try {
            PrintWriter data = new PrintWriter("data.txt");
            PrintWriter size = new PrintWriter("size.txt");
            data.print("");
            size.print("");
            data.close();
            size.close();
            data.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtName.setText("");
        txtFather.setText("");
        txtPhone.setText("");
        score.setText("");
        set_sizeOfDatai(0);
    }//GEN-LAST:event_deleteDataActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tb1 = new TableRowSorter<>(tb);
        jTable1.setRowSorter(tb1);
        tb1.setRowFilter(RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_searchKeyReleased

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtFather.requestFocus();
            txtFather.setBackground(new java.awt.Color(255,204,255));
            txtFather.setSelectedTextColor(Color.red);
            txtPhone.setBackground(new java.awt.Color(204,153,255));
            txtName.setBackground(new java.awt.Color(204,153,255));
            score.setBackground(new java.awt.Color(204,153,255));
        
        }
        else if(evt.getKeyCode() == KeyEvent.VK_UP){
            score.requestFocus();
            score.setBackground(new java.awt.Color(255,204,255));
            score.setSelectedTextColor(Color.red);
            txtPhone.setBackground(new java.awt.Color(204,153,255));
            txtName.setBackground(new java.awt.Color(204,153,255));
            txtFather.setBackground(new java.awt.Color(204,153,255));
        
        }
        
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtFatherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFatherKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtName.requestFocus();
            txtName.setBackground(new java.awt.Color(255,204,255));
            txtName.setSelectedTextColor(Color.red);
            txtPhone.setBackground(new java.awt.Color(204,153,255));
            score.setBackground(new java.awt.Color(204,153,255));
            txtFather.setBackground(new java.awt.Color(204,153,255));
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtPhone.requestFocus();
            txtPhone.setBackground(new java.awt.Color(255,204,255));
            txtPhone.setSelectedTextColor(Color.red);
            score.setBackground(new java.awt.Color(204,153,255));
            txtName.setBackground(new java.awt.Color(204,153,255));
            txtFather.setBackground(new java.awt.Color(204,153,255));
        
        }
    }//GEN-LAST:event_txtFatherKeyPressed

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtFather.requestFocus();
            txtFather.setBackground(new java.awt.Color(255,204,255));
            txtFather.setSelectedTextColor(Color.red);
            txtPhone.setBackground(new java.awt.Color(204,153,255));
            txtName.setBackground(new java.awt.Color(204,153,255));
            score.setBackground(new java.awt.Color(204,153,255));
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            score.requestFocus();
            score.setBackground(new java.awt.Color(255,204,255));
            score.setSelectedTextColor(Color.red);
            txtPhone.setBackground(new java.awt.Color(204,153,255));
            txtName.setBackground(new java.awt.Color(204,153,255));
            txtFather.setBackground(new java.awt.Color(204,153,255));
        }
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void scoreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_UP){
            txtPhone.requestFocus();
            txtPhone.setBackground(new java.awt.Color(255,204,255));
            txtPhone.setSelectedTextColor(Color.red);
            score.setBackground(new java.awt.Color(204,153,255));
            txtName.setBackground(new java.awt.Color(204,153,255));
            txtFather.setBackground(new java.awt.Color(204,153,255));
        
        }
        else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            txtName.requestFocus();
            txtName.setBackground(new java.awt.Color(255,204,255));
            txtName.setSelectedTextColor(Color.red);
            txtPhone.setBackground(new java.awt.Color(204,153,255));
            score.setBackground(new java.awt.Color(204,153,255));
            txtFather.setBackground(new java.awt.Color(204,153,255));
        
        }
    }//GEN-LAST:event_scoreKeyPressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelData;
    private javax.swing.JButton addData;
    private javax.swing.JButton clear;
    private javax.swing.JButton deleteData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextField score;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txtFather;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
