/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Vector;

/**
 *
 * @author Akash
 */
public class report extends javax.swing.JFrame {

    /**
     * Creates new form report
     */private String id,proname,procat1,Date,proqty,proprice,tdate,cat,total_qty="0",total_sales="0";
    
    Connection conn;
    public report() {
        conn = db.dbconnect();
        initComponents();
        getcat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void getcat()
    {
            try{
            Connection con= db.dbconnect();
            PreparedStatement pst = con.prepareStatement("select * from categories");
            ResultSet r=pst.executeQuery();
            while(r.next()){
                String mycat = r.getString("catname");
                procat.addItem(mycat);
            }
            }
            catch(Exception e)
            {
                
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        monthreport = new javax.swing.JTextArea();
        billdate2 = new com.toedter.calendar.JDateChooser();
        billdate1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        procat = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jPanel3.setBackground(new java.awt.Color(243, 182, 82));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/business-report.png"))); // NOI18N
        jLabel5.setText(" REPORT");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("TO");

        jButton6.setBackground(new java.awt.Color(243, 182, 82));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/submit(1).png"))); // NOI18N
        jButton6.setText("Submit");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(243, 182, 82));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/printing(1).png"))); // NOI18N
        jButton7.setText("Print");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        monthreport.setColumns(20);
        monthreport.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        monthreport.setRows(5);
        monthreport.setText("\n");
        jScrollPane2.setViewportView(monthreport);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("FROM");

        jButton8.setBackground(new java.awt.Color(243, 182, 82));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/system-update.png"))); // NOI18N
        jButton8.setText("ReFresh");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/close Jframe.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        procat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                procatItemStateChanged(evt);
            }
        });
        procat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procatMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Sort By");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(billdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(procat, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(procat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(billdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(billdate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        //String cat =(String)procat.getSelectedItem();
        Date crdate1=(billdate1.getCalendar().getTime());
       
       Calendar calendar1 = Calendar.getInstance();
       calendar1.setTime(crdate1);

    int day = calendar1.get(Calendar.DAY_OF_MONTH);
    int month = calendar1.get(Calendar.MONTH) + 1; // Months are zero-based
    int year = calendar1.get(Calendar.YEAR);
    
    Date crdate2=(billdate2.getCalendar().getTime());
       
       Calendar calendar2 = Calendar.getInstance();
       calendar2.setTime(crdate2);

    int day2 = calendar2.get(Calendar.DAY_OF_MONTH);
    int month2 = calendar2.get(Calendar.MONTH) + 1; // Months are zero-based
    int year2 = calendar2.get(Calendar.YEAR);
    
    
    String extractedDate1 = String.format("%d-%02d-%02d", year, month, day);
    String extractedDate2 = String.format("%d-%02d-%02d", year2, month2, day2);
    int count;
    try{
        PreparedStatement prst = conn.prepareStatement("SELECT *, DATE(date) AS Date FROM sales WHERE DATE(date) >= DATE('" + extractedDate1 + "') AND DATE(date) <= DATE('" + extractedDate2 + "')  LIMIT 0, 1000");            
        ResultSet rs = prst.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        count = rss.getColumnCount();
        monthreport.setText(monthreport.getText()+" "+"==========================          Emart SuperMarket        ===================\n");
        monthreport.setText(monthreport.getText()+" "+"\n");
        monthreport.setText(monthreport.getText()+" "+"==========================           SALES REPORT          ======================\n");
        monthreport.setText(monthreport.getText()+" "+"\n");
        monthreport.setText(monthreport.getText()+" "+"=====================================================================\n");
        monthreport.setText(monthreport.getText()+" "+"Date   "+"\t"+"ID"+"\t"+"   PRODUCT    "+"\t"+"CATEGORY"+"\t"+"QUANTITY"+"\t"+"  AMOUNT"+"\n");
        monthreport.setText(monthreport.getText()+" "+"=====================================================================\n");
        
        
         while(rs.next()){
                   
            id=rs.getString("id");
            proname=rs.getString("proname");
            procat1=rs.getString("procat");
            proqty=rs.getString("proqty");
            proprice=rs.getString("proprice");
           
                
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        
            Date tdate = rs.getTimestamp("Date");
            
            String formattedDate = dateFormat.format(tdate);
          
          monthreport.setText(monthreport.getText()+" "+formattedDate+"\t"+id+"\t"+proname+"\t"+procat1+"\t"+proqty+" \t "+proprice+" \t \n");
          monthreport.setText(monthreport.getText()+" "+"---------------------------------------------------------------------------------------------------------------------------\n");
          
          total_qty=String.valueOf((Double.parseDouble(total_qty))+(Double.parseDouble(proqty)));
          total_sales=String.valueOf((Double.parseDouble(total_sales))+(Double.parseDouble(proprice)));
        }
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+"\t\t\tTOTAL Quantity            :  "+total_qty+"\n");
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+"\t\t\tTOTAL AMOUNT (Rs)           :  "+total_sales+"\n");
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+" "+"===============================REPORT END===================================\n");
         
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e); 
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        try{
            monthreport.print();
            
        }
        catch(Exception e){
            
        }
       
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
       
        String cat =(String)procat.getSelectedItem();
        Date crdate1=(billdate1.getCalendar().getTime());
       
       Calendar calendar1 = Calendar.getInstance();
       calendar1.setTime(crdate1);

    int day = calendar1.get(Calendar.DAY_OF_MONTH);
    int month = calendar1.get(Calendar.MONTH) + 1; // Months are zero-based
    int year = calendar1.get(Calendar.YEAR);
    
    Date crdate2=(billdate2.getCalendar().getTime());
       
       Calendar calendar2 = Calendar.getInstance();
       calendar2.setTime(crdate2);

    int day2 = calendar2.get(Calendar.DAY_OF_MONTH);
    int month2 = calendar2.get(Calendar.MONTH) + 1; // Months are zero-based
    int year2 = calendar2.get(Calendar.YEAR);
    
    
    String extractedDate1 = String.format("%d-%02d-%02d", year, month, day);
    String extractedDate2 = String.format("%d-%02d-%02d", year2, month2, day2);
    
    
    int count;
    try{
        PreparedStatement prst = conn.prepareStatement("SELECT *, DATE(date) AS Date FROM sales WHERE DATE(date) >= DATE('" + extractedDate1 + "') AND DATE(date) <= DATE('" + extractedDate2 + "')  AND procat = '"+(String)procat.getSelectedItem()+"' LIMIT 0, 1000");            
        ResultSet rs = prst.executeQuery();
        ResultSetMetaData rss = rs.getMetaData();
        count = rss.getColumnCount();
        monthreport.setText(monthreport.getText()+" "+"==========================          Emart SuperMarket        ===================\n");
        monthreport.setText(monthreport.getText()+" "+"\n");
        monthreport.setText(monthreport.getText()+" "+"==========================           SALES REPORT          ======================\n");
        monthreport.setText(monthreport.getText()+" "+"\n");
        monthreport.setText(monthreport.getText()+" "+"=====================================================================\n");
        monthreport.setText(monthreport.getText()+" "+"Date   "+"\t"+"ID"+"\t"+"   PRODUCT    "+"\t"+"CATEGORY"+"\t"+"QUANTITY"+"\t"+"  AMOUNT"+"\n");
        monthreport.setText(monthreport.getText()+" "+"=====================================================================\n");
        
        
         while(rs.next()){
                   
            id=rs.getString("id");
            proname=rs.getString("proname");
            procat1=rs.getString("procat");
            proqty=rs.getString("proqty");
            proprice=rs.getString("proprice");
           
                
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        
            Date tdate = rs.getTimestamp("Date");
            
            String formattedDate = dateFormat.format(tdate);
          
          monthreport.setText(monthreport.getText()+" "+formattedDate+"\t"+id+"\t"+proname+"\t"+procat1+"\t"+proqty+" \t "+proprice+" \t \n");
          monthreport.setText(monthreport.getText()+" "+"---------------------------------------------------------------------------------------------------------------------------\n");
          
          total_qty=String.valueOf((Double.parseDouble(total_qty))+(Double.parseDouble(proqty)));
          total_sales=String.valueOf((Double.parseDouble(total_sales))+(Double.parseDouble(proprice)));
        }
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+"\t\t\t\tTOTAL Quantity            :  "+total_qty+"\n");
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+"\t\t\tTOTAL AMOUNT (Rs)           :  "+total_sales+"\n");
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+" "+"===============================REPORT END===================================\n");
         
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e); 
        }
        
    }//GEN-LAST:event_jButton8MouseClicked

    private void procatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_procatItemStateChanged
     /*   // TODO add your handling code here:
        int count;
        try{
            PreparedStatement pst = conn.prepareStatement("select * from products where procat='"+procat.getSelectedItem()+"'");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            count = rss.getColumnCount();
           // DefaultTableModel df = (DefaultTableModel)protable.getModel();
          //  df.setRowCount(0);
            while(rs.next()){
                Vector  v = new Vector();
                for(int a=1;a<=count;a++){
                    v.add(rs.getInt("proid"));
                    v.add(rs.getString("proname"));
                    v.add(rs.getString("procat"));
                    v.add(rs.getString("proprice"));
                    v.add(rs.getString("proqty"));

                }
               // df.addRow(v);
            }

        } catch(SQLException e){
            System.out.println(e);
        } */
    }//GEN-LAST:event_procatItemStateChanged

    private void procatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_procatMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser billdate1;
    private com.toedter.calendar.JDateChooser billdate2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea monthreport;
    private javax.swing.JComboBox<String> procat;
    // End of variables declaration//GEN-END:variables
}