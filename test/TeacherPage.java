



import ClientServer.ClientServer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Paint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import sun.swing.table.DefaultTableCellHeaderRenderer;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class TeacherPage extends javax.swing.JFrame {

    ArrayList<ClientServer>DisplayList=new ArrayList<ClientServer>();

 

    /**
     * Creates new form MainFrame
     */
    public TeacherPage() throws IOException, ClassNotFoundException {
        initComponents();
         this.setTitle("Online Aptitude Test");
         displaymarks();
    }

     public void displaymarks() throws IOException, ClassNotFoundException
    {
        DisplayList=(ArrayList<ClientServer>) MainFrame.oin.readObject();
        
         DefaultTableModel Model=new DefaultTableModel(new String[]{"ExamId","Quantitative","Logical","Personality Marks"},0);
         int marks_quantitative;
         int marks_logical;
         int marks_personality;
         int examId;
         Iterator<ClientServer>itr=DisplayList.iterator();
         
         while(itr.hasNext())
         {
              ClientServer obj=itr.next();
              examId=obj.examId;
              marks_quantitative=obj.marks_quantitative;
              marks_logical=obj.marks_logical;
              marks_personality=obj.marks_personality;
              System.out.println("TeacherPage.displaymarks()");
           
              Model.addRow(new Object[]{examId,marks_quantitative,marks_logical,marks_personality});
               
         }
           jTable2.setModel(Model); 
           
            
        TableColumn col=jTable2.getColumnModel().getColumn(0);
        DefaultTableCellRenderer obj1=new DefaultTableCellHeaderRenderer();
        obj1.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        jTable2.getColumnModel().getColumn(0).setHeaderRenderer(obj1);
        col.setCellRenderer(obj1);
        
        TableColumn col1=jTable2.getColumnModel().getColumn(1);
        DefaultTableCellRenderer obj3=new DefaultTableCellHeaderRenderer();
        obj3.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        jTable2.getColumnModel().getColumn(1).setHeaderRenderer(obj3);
        col1.setCellRenderer(obj3);
        
        TableColumn col2=jTable2.getColumnModel().getColumn(2);
        DefaultTableCellRenderer obj4=new DefaultTableCellHeaderRenderer();
        obj4.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        jTable2.getColumnModel().getColumn(2).setHeaderRenderer(obj4);
        col2.setCellRenderer(obj4);
        
        TableColumn col3=jTable2.getColumnModel().getColumn(3);
        DefaultTableCellRenderer obj5=new DefaultTableCellHeaderRenderer();
        obj5.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
        jTable2.getColumnModel().getColumn(3).setHeaderRenderer(obj5);
        col3.setCellRenderer(obj5);
    }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        TabPanel = new javax.swing.JPanel();
        TeacherLoginLabel = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        CheckMarksTab = new javax.swing.JPanel();
        CheckMarksLabel = new javax.swing.JLabel();
        arrow = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        AnalysisTab = new javax.swing.JPanel();
        AnalysisLabel = new javax.swing.JLabel();
        arrow1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        SignoutButton1 = new javax.swing.JButton();
        LayeredPanel = new javax.swing.JLayeredPane();
        CheckMarksPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        AnalysisPanel = new javax.swing.JPanel();
        SubjectList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        chartPanel = new javax.swing.JPanel();
        ViewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        TabPanel.setBackground(new java.awt.Color(0, 0, 51));

        TeacherLoginLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        TeacherLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        TeacherLoginLabel.setText("TEACHER LOGIN");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/businessman-64.png"))); // NOI18N

        CheckMarksTab.setBackground(new java.awt.Color(0, 0, 102));
        CheckMarksTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CheckMarksTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckMarksTabMousePressed(evt);
            }
        });

        CheckMarksLabel.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        CheckMarksLabel.setForeground(new java.awt.Color(255, 255, 255));
        CheckMarksLabel.setText("Detailed Result");
        CheckMarksLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckMarksLabelMousePressed(evt);
            }
        });

        arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-24-16.png"))); // NOI18N

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/businessman-16 (1).png"))); // NOI18N

        javax.swing.GroupLayout CheckMarksTabLayout = new javax.swing.GroupLayout(CheckMarksTab);
        CheckMarksTab.setLayout(CheckMarksTabLayout);
        CheckMarksTabLayout.setHorizontalGroup(
            CheckMarksTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckMarksTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon1)
                .addGap(35, 35, 35)
                .addComponent(CheckMarksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(arrow)
                .addContainerGap())
        );
        CheckMarksTabLayout.setVerticalGroup(
            CheckMarksTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckMarksTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckMarksTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckMarksLabel)
                    .addComponent(arrow)
                    .addComponent(icon1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AnalysisTab.setBackground(new java.awt.Color(0, 0, 51));
        AnalysisTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AnalysisTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AnalysisTabMousePressed(evt);
            }
        });

        AnalysisLabel.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        AnalysisLabel.setForeground(new java.awt.Color(255, 255, 255));
        AnalysisLabel.setText("Overall Analysis");

        arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-24-16.png"))); // NOI18N
        arrow1.setToolTipText("");

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/businessman-16 (1).png"))); // NOI18N

        javax.swing.GroupLayout AnalysisTabLayout = new javax.swing.GroupLayout(AnalysisTab);
        AnalysisTab.setLayout(AnalysisTabLayout);
        AnalysisTabLayout.setHorizontalGroup(
            AnalysisTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnalysisTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon2)
                .addGap(35, 35, 35)
                .addComponent(AnalysisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(arrow1)
                .addContainerGap())
        );
        AnalysisTabLayout.setVerticalGroup(
            AnalysisTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnalysisTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnalysisTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnalysisLabel)
                    .addComponent(arrow1)
                    .addComponent(icon2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SignoutButton1.setBackground(new java.awt.Color(255, 255, 255));
        SignoutButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        SignoutButton1.setForeground(new java.awt.Color(0, 0, 51));
        SignoutButton1.setText("Signout");
        SignoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabPanelLayout = new javax.swing.GroupLayout(TabPanel);
        TabPanel.setLayout(TabPanelLayout);
        TabPanelLayout.setHorizontalGroup(
            TabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CheckMarksTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TabPanelLayout.createSequentialGroup()
                .addGroup(TabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(TeacherLoginLabel))
                    .addGroup(TabPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(SignoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(TabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AnalysisTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabPanelLayout.setVerticalGroup(
            TabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(TeacherLoginLabel)
                .addGap(18, 18, 18)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(CheckMarksTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(SignoutButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(117, 117, 117))
            .addGroup(TabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TabPanelLayout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(AnalysisTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );

        CheckMarksPanel.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam ID", "Quantitative ", "LogicalReasoning", "Personality"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Personality");
        }

        javax.swing.GroupLayout CheckMarksPanelLayout = new javax.swing.GroupLayout(CheckMarksPanel);
        CheckMarksPanel.setLayout(CheckMarksPanelLayout);
        CheckMarksPanelLayout.setHorizontalGroup(
            CheckMarksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckMarksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
        );
        CheckMarksPanelLayout.setVerticalGroup(
            CheckMarksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckMarksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        AnalysisPanel.setBackground(new java.awt.Color(255, 255, 255));

        SubjectList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantitative Aptitude", "Logical Reasoning", "Personality Aptitude" }));
        SubjectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectListActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Subject :");

        chartPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        ViewButton.setBackground(new java.awt.Color(0, 0, 51));
        ViewButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AnalysisPanelLayout = new javax.swing.GroupLayout(AnalysisPanel);
        AnalysisPanel.setLayout(AnalysisPanelLayout);
        AnalysisPanelLayout.setHorizontalGroup(
            AnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AnalysisPanelLayout.createSequentialGroup()
                .addGroup(AnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AnalysisPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(SubjectList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AnalysisPanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(ViewButton)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        AnalysisPanelLayout.setVerticalGroup(
            AnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnalysisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubjectList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewButton)
                .addGap(18, 18, 18)
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LayeredPanel.setLayer(CheckMarksPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayeredPanel.setLayer(AnalysisPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredPanelLayout = new javax.swing.GroupLayout(LayeredPanel);
        LayeredPanel.setLayout(LayeredPanelLayout);
        LayeredPanelLayout.setHorizontalGroup(
            LayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayeredPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckMarksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LayeredPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AnalysisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        LayeredPanelLayout.setVerticalGroup(
            LayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayeredPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckMarksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(LayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LayeredPanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(AnalysisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LayeredPanel))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LayeredPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckMarksLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckMarksLabelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckMarksLabelMousePressed

    private void CheckMarksTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckMarksTabMousePressed
        // TODO add your handling code here:
        CheckMarksTab.setBackground(new Color(0,0,102));
        AnalysisTab.setBackground(new Color(0,0,51));
        AnalysisPanel.setVisible(false);
        CheckMarksPanel.setVisible(true);
      
    }//GEN-LAST:event_CheckMarksTabMousePressed

    private void AnalysisTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalysisTabMousePressed
        // TODO add your handling code here:
         CheckMarksTab.setBackground(new Color(0,0,51));
         AnalysisTab.setBackground(new Color(0,0,102));
        AnalysisPanel.setVisible(true);
        CheckMarksPanel.setVisible(false);
      
    }//GEN-LAST:event_AnalysisTabMousePressed

    private void SignoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame start;
        
        try {
            start = new MainFrame();
            start.setVisible(true);
        setVisible(false);
        dispose();
        } catch (IOException ex) {
            Logger.getLogger(TeacherPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SignoutButton1ActionPerformed

    private void SubjectListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectListActionPerformed
        // TODO add your handling code here:
        
     /*   chartPanel.setVisible(true);
        DefaultCategoryDataset barchart=new DefaultCategoryDataset();
        barchart.setValue(2000,"Marks","Lowest");
        barchart.setValue(2000, "Marks","Average");
        barchart.setValue(2000,"Marks","Highest");
        
        JFreeChart chartobj=ChartFactory.createBarChart(""+SubjectList.getSelectedItem(),"Marks Analysis","Marks",barchart,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot categoryobj=chartobj.getCategoryPlot();
        categoryobj.setRangeGridlinePaint(Color.BLACK);
        ChartPanel barpanel=new ChartPanel(chartobj);
        chartPanel.removeAll();
        chartPanel.add(barpanel,BorderLayout.CENTER);
        chartPanel.validate();*/
    }//GEN-LAST:event_SubjectListActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        try {
            // TODO add your handling code here:

            MainFrame.dout.writeUTF("Displaying Graph");
            MainFrame.dout.writeUTF((String) SubjectList.getSelectedItem());
            ClientServer data=(ClientServer) MainFrame.oin.readObject();
            chartPanel.setVisible(true);
            DefaultCategoryDataset barchart=new DefaultCategoryDataset();
            barchart.setValue(data.minimum,"Marks","Lowest");
            barchart.setValue(data.avg, "Marks","Average");
            barchart.setValue(data.maximum,"Marks","Highest");

            JFreeChart chartobj=ChartFactory.createBarChart(""+SubjectList.getSelectedItem(),"Marks Analysis","Marks",barchart,PlotOrientation.VERTICAL,false,true,false);
            CategoryPlot categoryobj=chartobj.getCategoryPlot();
            categoryobj.getRenderer().setSeriesPaint(0,new Color(51,153,255));
            categoryobj.getRenderer().setSeriesPaint(1,new Color(0,102,204));
            categoryobj.getRenderer().setSeriesPaint(2, new Color(0,76,153));
            
            CategoryItemRenderer barColor = new CustomRenderer(new Paint[]{});
            categoryobj.setRenderer(barColor);
            
            categoryobj.setRangeGridlinePaint(Color.BLACK);
            ChartPanel barpanel=new ChartPanel(chartobj);
            barpanel.setVisible(true);
            chartPanel.removeAll();
            chartPanel.setLayout(new java.awt.BorderLayout());
            chartPanel.add(barpanel,BorderLayout.CENTER);
            chartPanel.validate();
            chartPanel.setVisible(true);
            //this.getContentPane().add(barpanel);
            chartPanel.add(barpanel);
        } catch (IOException ex) {
            Logger.getLogger(TeacherPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TeacherPage().setVisible(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(TeacherPage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TeacherPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnalysisLabel;
    private javax.swing.JPanel AnalysisPanel;
    private javax.swing.JPanel AnalysisTab;
    private javax.swing.JLabel CheckMarksLabel;
    private javax.swing.JPanel CheckMarksPanel;
    private javax.swing.JPanel CheckMarksTab;
    private javax.swing.JLayeredPane LayeredPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton SignoutButton1;
    private javax.swing.JComboBox<String> SubjectList;
    private javax.swing.JPanel TabPanel;
    private javax.swing.JLabel TeacherLoginLabel;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel arrow;
    private javax.swing.JLabel arrow1;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

