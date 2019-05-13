/**
 * TLS-Attacker-BurpExtension
 * 
 * Copyright 2018 Ruhr University Bochum / Hackmanit GmbH
 * 
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0/
 */
package de.rub.nds.burp.tlsattacker.gui;

import burp.IContextMenuFactory;
import burp.IContextMenuInvocation;
import de.rub.nds.burp.utilities.SiteReportPrinter;
import de.rub.nds.tlsattacker.core.config.delegate.GeneralDelegate;
import de.rub.nds.tlsattacker.core.constants.StarttlsType;
import de.rub.nds.tlsscanner.TlsScanner;
import de.rub.nds.tlsscanner.config.ScannerConfig;
import de.rub.nds.tlsscanner.constants.ScannerDetail;
import de.rub.nds.tlsscanner.report.SiteReport;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.SwingWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * TLS-Scanner.
 * 
 * @author Nurullah Erinola
 */
public class UIScanner extends javax.swing.JPanel implements IContextMenuFactory {
    
    private static final Logger LOGGER = LogManager.getLogger(UIScanner.class.getName());
    private UIScanHistory scanHistory;
    
    /**
     * Creates new form UIScanner.
     */
    public UIScanner(UIScanHistory scanHistory) {
        initComponents();       
        initJComboBoxes();
        this.scanHistory = scanHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonScan = new javax.swing.JButton();
        jTextFieldHost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCopy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldThreads = new javax.swing.JTextField();
        jTextFieldAggroLevel = new javax.swing.JTextField();
        jComboBoxDangerLevel = new javax.swing.JComboBox<>();
        jComboBoxReportDetail = new javax.swing.JComboBox<>();
        jComboBoxScanDetail = new javax.swing.JComboBox<>();
        jCheckBoxNoColor = new javax.swing.JCheckBox();
        jCheckBoxDefaultSetting = new javax.swing.JCheckBox();
        jScrollPaneResult = new javax.swing.JScrollPane();
        jTextPaneResult = new javax.swing.JTextPane();
        jCheckBoxStarTls = new javax.swing.JCheckBox();
        jComboBoxStarTLS = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTimeout = new javax.swing.JTextField();

        jButtonScan.setText("Scan");
        jButtonScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScanActionPerformed(evt);
            }
        });

        jTextFieldHost.setText("localhost:4433");
        jTextFieldHost.setToolTipText("Who to connect to. Syntax: localhost:4433");

        jLabel1.setText("Host:");

        jLabel3.setText("Result:");

        jButtonCopy.setText("Copy");
        jButtonCopy.setToolTipText("Copy report to clipboard.");
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });

        jLabel2.setText("Parallel Probes:");
        jLabel2.setToolTipText("Defines the number of threads responsible for different TLS probes. If set to 1, only one specific TLS probe (e.g., TLS version scan) can be run in time.");

        jLabel4.setText("Overall Threads:");
        jLabel4.setToolTipText("The maximum number of threads used to execute TLS probes located in the scanning queue. This is also the maximum number of threads communicating with the analyzed server.");

        jLabel5.setText("Danger Level:");
        jLabel5.setToolTipText("How aggressive the Scanner should test");

        jLabel6.setText("Scan Detail:");
        jLabel6.setToolTipText("How detailed do you want to scan.");

        jLabel7.setText("Report Detail:");
        jLabel7.setToolTipText("How detailed do you want the report to be.");

        jTextFieldThreads.setText("4");
        jTextFieldThreads.setToolTipText("Enter only numbers.");
        jTextFieldThreads.setEnabled(false);

        jTextFieldAggroLevel.setText("100");
        jTextFieldAggroLevel.setToolTipText("Enter only numbers.");
        jTextFieldAggroLevel.setEnabled(false);

        jComboBoxDangerLevel.setEnabled(false);

        jComboBoxReportDetail.setEnabled(false);

        jComboBoxScanDetail.setEnabled(false);

        jCheckBoxNoColor.setText("No color");
        jCheckBoxNoColor.setToolTipText("If you don't want colored text.");

        jCheckBoxDefaultSetting.setSelected(true);
        jCheckBoxDefaultSetting.setText("Use default settings");
        jCheckBoxDefaultSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDefaultSettingActionPerformed(evt);
            }
        });

        jTextPaneResult.setEditable(false);
        jTextPaneResult.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPaneResult.setViewportView(jTextPaneResult);

        jCheckBoxStarTls.setText("Scan STARTTLS:");
        jCheckBoxStarTls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxStarTlsActionPerformed(evt);
            }
        });

        jComboBoxStarTLS.setEnabled(false);

        jLabel8.setText("Timeout:");
        jLabel8.setToolTipText("The timeout used for the scans in ms.");

        jTextFieldTimeout.setText("1000");
        jTextFieldTimeout.setToolTipText("Enter only numbers.");
        jTextFieldTimeout.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneResult, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCopy))
                            .addComponent(jButtonScan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxScanDetail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxDangerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldThreads, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldTimeout, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxReportDetail, 0, 118, Short.MAX_VALUE)
                                            .addComponent(jTextFieldAggroLevel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxDefaultSetting)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxNoColor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxStarTls)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxStarTLS, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDefaultSetting)
                    .addComponent(jCheckBoxNoColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxStarTls)
                    .addComponent(jComboBoxStarTLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAggroLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxScanDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxReportDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDangerLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButtonScan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonCopy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneResult, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void initJComboBoxes() {
        // Init jComboBox for STARTLS protocol selection
        ArrayList<String> list = new ArrayList<>();
        list.add(StarttlsType.FTP.toString());
        list.add(StarttlsType.IMAP.toString());
        list.add(StarttlsType.POP3.toString());
        list.add(StarttlsType.SMTP.toString());
        jComboBoxStarTLS.setModel(new DefaultComboBoxModel(list.toArray()));
        // Init jComboBox for Scan Detail and Report Detail
        list = new ArrayList<>();
        list.add(ScannerDetail.ALL.toString());
        list.add(ScannerDetail.DETAILED.toString());
        list.add(ScannerDetail.NORMAL.toString());
        list.add(ScannerDetail.QUICK.toString());
        jComboBoxScanDetail.setModel(new DefaultComboBoxModel(list.toArray())); 
        jComboBoxScanDetail.setSelectedIndex(2); 
        jComboBoxReportDetail.setModel(new DefaultComboBoxModel(list.toArray())); 
        jComboBoxReportDetail.setSelectedIndex(2);
        // Init jComboBox for Danger Level
        list = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            list.add(String.valueOf(i));
        }
        jComboBoxDangerLevel.setModel(new DefaultComboBoxModel(list.toArray())); 
        jComboBoxDangerLevel.setSelectedIndex(9); 
    }
    
    /**
     * Add new menu item to context menu.
     */
    @Override
    public List<JMenuItem> createMenuItems(IContextMenuInvocation contextMenuInvocation) {
        List<JMenuItem> menuList = new ArrayList<>();
        JMenuItem jMenuItemSendToScanner = new JCheckBoxMenuItem("Send to TLS-Scanner");
        jMenuItemSendToScanner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Set selected Host
                jTextFieldHost.setText(contextMenuInvocation.getSelectedMessages()[0].getHttpService().getHost());
            }
        });
        menuList.add(jMenuItemSendToScanner);
        return menuList;
    }
      
    private void jButtonScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScanActionPerformed
        // Check inputs
        if(!jTextFieldThreads.getText().matches("[0-9]+") || !jTextFieldAggroLevel.getText().matches("[0-9]+") || !jTextFieldTimeout.getText().matches("[0-9]+")) {
            jTextPaneResult.setText("Parallel Probes, Overall Threads or Timeout input is not a number or empty. Please enter only numbers!");
            return;
        }
        // Create config
        ScannerConfig config = new ScannerConfig(new GeneralDelegate());
        config.getClientDelegate().setHost(jTextFieldHost.getText());
        config.setNoColor(jCheckBoxNoColor.isSelected());
        config.setThreads(4);
        config.setAggroLevel(100);
        config.setTimeout(1000);
        if(!jCheckBoxDefaultSetting.isSelected()) {
            config.setDangerLevel(Integer.parseInt((String) jComboBoxDangerLevel.getSelectedItem()));
            config.setThreads(Integer.parseInt(jTextFieldThreads.getText()));
            config.setAggroLevel(Integer.parseInt(jTextFieldAggroLevel.getText()));
            config.setTimeout(Integer.parseInt(jTextFieldTimeout.getText()));
            config.setReportDetail(ScannerDetail.valueOf((String) jComboBoxReportDetail.getSelectedItem()));
            config.setScanDetail(ScannerDetail.valueOf((String) jComboBoxScanDetail.getSelectedItem()));
        }
        if(jCheckBoxStarTls.isSelected()) {
            config.getStarttlsDelegate().setStarttlsType(StarttlsType.valueOf((String) jComboBoxStarTLS.getSelectedItem()));
        }
        // Clarify scan start
        jTextPaneResult.setText("Scanning " + config.getClientDelegate().getHost() + " - please be patient...");
        jButtonScan.setEnabled(false); 
        // Use SwingWorker to execute scan in backround
        SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>() {           
            SiteReport report;
            
            @Override
            protected Boolean doInBackground() throws Exception {
                LOGGER.info("---------- Start scanning of {} ----------", config.getClientDelegate().getHost());
                // Init scanner and start scan
                TlsScanner scanner = new TlsScanner(config);
                report = scanner.scan();             
                return true;
            }
            @Override
            protected void done() {
                LOGGER.info("---------- Scan of {} finished ----------", config.getClientDelegate().getHost());
                jButtonScan.setEnabled(true);  
                // Print scan result
                SiteReportPrinter printer = new SiteReportPrinter(jTextPaneResult, report, config.getReportDetail());
                printer.printFullReport();
                jTextPaneResult.setCaretPosition(0);
                // Send config and report to scan history
                if(report.getServerIsAlive()) {
                    scanHistory.add(config, report);
                }
            }
        };
        worker.execute();
    }//GEN-LAST:event_jButtonScanActionPerformed

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyActionPerformed
        String toCopy = jTextPaneResult.getText();
        StringSelection stringSelection = new StringSelection(toCopy);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_jButtonCopyActionPerformed

    private void jCheckBoxDefaultSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDefaultSettingActionPerformed
        if(jCheckBoxDefaultSetting.isSelected()) {
            jComboBoxDangerLevel.setEnabled(false);
            jComboBoxReportDetail.setEnabled(false);
            jComboBoxScanDetail.setEnabled(false);
            jTextFieldAggroLevel.setEnabled(false);
            jTextFieldThreads.setEnabled(false);
            jTextFieldTimeout.setEnabled(false);
        } else {
            jComboBoxDangerLevel.setEnabled(true);
            jComboBoxReportDetail.setEnabled(true);
            jComboBoxScanDetail.setEnabled(true);
            jTextFieldAggroLevel.setEnabled(true);
            jTextFieldThreads.setEnabled(true);
            jTextFieldTimeout.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxDefaultSettingActionPerformed

    private void jCheckBoxStarTlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxStarTlsActionPerformed
        if(jCheckBoxStarTls.isSelected()) {
            jComboBoxStarTLS.setEnabled(true);
        } else {
            jComboBoxStarTLS.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxStarTlsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonScan;
    private javax.swing.JCheckBox jCheckBoxDefaultSetting;
    private javax.swing.JCheckBox jCheckBoxNoColor;
    private javax.swing.JCheckBox jCheckBoxStarTls;
    private javax.swing.JComboBox<String> jComboBoxDangerLevel;
    private javax.swing.JComboBox<String> jComboBoxReportDetail;
    private javax.swing.JComboBox<String> jComboBoxScanDetail;
    private javax.swing.JComboBox<String> jComboBoxStarTLS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPaneResult;
    private javax.swing.JTextField jTextFieldAggroLevel;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldThreads;
    private javax.swing.JTextField jTextFieldTimeout;
    private javax.swing.JTextPane jTextPaneResult;
    // End of variables declaration//GEN-END:variables
}
