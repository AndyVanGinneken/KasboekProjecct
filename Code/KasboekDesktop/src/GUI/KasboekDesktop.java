/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Date;
import BLL.*;
import DAL.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Andy
 */
public class KasboekDesktop extends javax.swing.JFrame {

    /**
     * Creates new form KasboekDesktop
     */
    public KasboekDesktop() {
        initComponents();
        setLastKasboek();
        
    }
    
    private void newKasboek()
    {   
        kasboek = new Kasboek();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        kasboek.setDatum(new Date());
        lblDate.setText(sdf.format(kasboek.getDatum()));
    }
    private void setLastKasboek()
    {
        service= new KasboekService();
        kasboek = service.getLastRecord();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        txtAV.setText(kasboek.getAv());
        txtComment.setText(kasboek.getCommentaar());
        lblDate.setText(sdf.format(kasboek.getDatum()));
        txtVoor.setText(String.valueOf(kasboek.totaalBegin()));
        if(kasboek.getEindKas()!= null)
        {
        txtNa.setText(String.valueOf(kasboek.totaalEind()));
        txtOmzet.setText(String.valueOf(kasboek.omzet()));
        }
        
        
        if(kasboek.getBeginKas()!= null)
        {
        Kas kas = kasboek.getBeginKas();
        txtOneCentB.setText(String.valueOf(kas.getEenCenten()));
        txtTwoCentB.setText(String.valueOf(kas.getTweeCenten()));
        txtFiveCentB.setText(String.valueOf(kas.getVijfCenten()));
        txtTenCentB.setText(String.valueOf(kas.getTienCenten()));
        txtTwentyCentB.setText(String.valueOf(kas.getTwintigCenten()));
        txtFiftyCentB.setText(String.valueOf(kas.getVijftigCenten()));
        txtOneEuroB.setText(String.valueOf(kas.getEenEuros()));
        txtTwoEuroB.setText(String.valueOf(kas.getTweeEuros()));
        txtFiveEuroB.setText(String.valueOf(kas.getVijfEuros()));
        txtTenEuroB.setText(String.valueOf(kas.getTienEuros()));
        txtTwentyEuroB.setText(String.valueOf(kas.getTwintigEuros()));
        txtFiftyEuroB.setText(String.valueOf(kas.getVijftigEuro()));
        txtHundredEuroB.setText(String.valueOf(kas.getHonderdEuros()));
        }
        if(kasboek.getEindKas()!= null)
        {
            Kas kas = kasboek.getEindKas();
        txtOneCentE.setText(String.valueOf(kas.getEenCenten()));
        txtTwoCentE.setText(String.valueOf(kas.getTweeCenten()));
        txtFiveCentE.setText(String.valueOf(kas.getVijfCenten()));
        txtTenCentE.setText(String.valueOf(kas.getTienCenten()));
        txtTwentyCentE.setText(String.valueOf(kas.getTwintigCenten()));
        txtFiftyCentE.setText(String.valueOf(kas.getVijftigCenten()));
        txtOneEuroE.setText(String.valueOf(kas.getEenEuros()));
        txtTwoEuroE.setText(String.valueOf(kas.getTweeEuros()));
        txtFiveEuroE.setText(String.valueOf(kas.getVijfEuros()));
        txtTenEuroE.setText(String.valueOf(kas.getTienEuros()));
        txtTwentyEuroE.setText(String.valueOf(kas.getTwintigEuros()));
        txtFiftyEuroE.setText(String.valueOf(kas.getVijftigEuro()));
        txtHundredEuroE.setText(String.valueOf(kas.getHonderdEuros()));
        }

        if(kasboek.getRolletjes()!= null)
        {
            Rol rol = kasboek.getRolletjes();
            txtOneCentR.setText(String.valueOf(rol.getEenCent()));
            txtTwoCentR.setText(String.valueOf(rol.getTweeCent()));
            txtFiveCentR.setText(String.valueOf(rol.getVijfCent()));
            txtTenCentR.setText(String.valueOf(rol.getTienCent()));
            txtTwentyCentR.setText(String.valueOf(rol.getTwintigCent()));
            txtFiftyCentR.setText(String.valueOf(rol.getVijftigCent()));
            txtOneEuroR.setText(String.valueOf(rol.getEenEuro()));
            txtTwoEuroR.setText(String.valueOf(rol.getTweeEuro()));
        }
        
        if(kasboek.getUitKas() != null)
        {
            Kas kas = kasboek.getUitKas();
            txtOneCentU.setText(String.valueOf(kas.getEenCenten()));
            txtTwoCentU.setText(String.valueOf(kas.getTweeCenten()));
            txtFiveCentU.setText(String.valueOf(kas.getVijfCenten()));
            txtTenCentU.setText(String.valueOf(kas.getTienCenten()));
            txtTwentyCentU.setText(String.valueOf(kas.getTwintigCenten()));
            txtFiftyCentU.setText(String.valueOf(kas.getVijftigCenten()));
            txtOneEuroU.setText(String.valueOf(kas.getEenEuros()));
            txtTwoEuroU.setText(String.valueOf(kas.getTweeEuros()));
            txtFiveEuroU.setText(String.valueOf(kas.getVijfEuros()));
            txtTenEuroU.setText(String.valueOf(kas.getTienEuros()));
            txtTwentyEuroU.setText(String.valueOf(kas.getTwintigEuros()));
            txtFiftyEuroU.setText(String.valueOf(kas.getVijftigEuro()));
            txtHundredEuroU.setText(String.valueOf(kas.getHonderdEuros()));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAV = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOmzet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVoor = new javax.swing.JTextField();
        txtNa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BeginkasPanel = new javax.swing.JPanel();
        lblKasType = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOneCentB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTwoCentB = new javax.swing.JTextField();
        txtFiveCentB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTenCentB = new javax.swing.JTextField();
        txtTwentyCentB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtHundredEuroB = new javax.swing.JTextField();
        txtTwentyEuroB = new javax.swing.JTextField();
        txtFiftyEuroB = new javax.swing.JTextField();
        txtTenEuroB = new javax.swing.JTextField();
        txtFiveEuroB = new javax.swing.JTextField();
        txtTwoEuroB = new javax.swing.JTextField();
        txtOneEuroB = new javax.swing.JTextField();
        txtFiftyCentB = new javax.swing.JTextField();
        btnSaveBegin = new javax.swing.JButton();
        EindKasPanel = new javax.swing.JPanel();
        lblKasType1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtOneCentE = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTwoCentE = new javax.swing.JTextField();
        txtFiveCentE = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTenCentE = new javax.swing.JTextField();
        txtTwentyCentE = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtHundredEuroE = new javax.swing.JTextField();
        txtTwentyEuroE = new javax.swing.JTextField();
        txtFiftyEuroE = new javax.swing.JTextField();
        txtTenEuroE = new javax.swing.JTextField();
        txtFiveEuroE = new javax.swing.JTextField();
        txtTwoEuroE = new javax.swing.JTextField();
        txtOneEuroE = new javax.swing.JTextField();
        txtFiftyCentE = new javax.swing.JTextField();
        btnSaveEind = new javax.swing.JButton();
        UitKasPanel = new javax.swing.JPanel();
        lblKasType2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtOneCentU = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtTwoCentU = new javax.swing.JTextField();
        txtFiveCentU = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTenCentU = new javax.swing.JTextField();
        txtTwentyCentU = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtHundredEuroU = new javax.swing.JTextField();
        txtTwentyEuroU = new javax.swing.JTextField();
        txtFiftyEuroU = new javax.swing.JTextField();
        txtTenEuroU = new javax.swing.JTextField();
        txtFiveEuroU = new javax.swing.JTextField();
        txtTwoEuroU = new javax.swing.JTextField();
        txtOneEuroU = new javax.swing.JTextField();
        txtFiftyCentU = new javax.swing.JTextField();
        btnSaveUit = new javax.swing.JButton();
        RolPanel = new javax.swing.JPanel();
        lblKasType3 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtOneCentR = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtTwoCentR = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtFiveCentR = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtTenCentR = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtTwentyCentR = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtFiftyCentR = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtOneEuroR = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtTwoEuroR = new javax.swing.JTextField();
        btnSaveRol = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mniNewKasboek = new javax.swing.JMenu();
        mniNewkasboek = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AV:");

        lblDate.setText("Datum N/A");

        jLabel2.setText("Omzet: ");

        jLabel3.setText("Commentaar:");

        txtOmzet.setEnabled(false);

        jLabel4.setText("Voor:");

        txtVoor.setEnabled(false);

        txtNa.setEnabled(false);

        jLabel5.setText("na:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVoor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAV, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOmzet, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtComment)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAV)
                    .addComponent(lblDate)
                    .addComponent(jLabel2)
                    .addComponent(txtOmzet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVoor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblKasType.setText("Begin Kas");

        jLabel15.setText("Aantal");

        jLabel6.setText("€ 0,01:");

        jLabel7.setText("€ 0,02:");

        jLabel8.setText("€ 0,05:");

        jLabel9.setText("€ 0,10:");

        jLabel10.setText("€ 0,20:");

        jLabel11.setText("€ 0,50:");

        jLabel12.setText("€ 1,00:");

        jLabel13.setText("€ 2,00:");

        jLabel14.setText("€ 5,00:");

        jLabel16.setText("€ 10,00:");

        jLabel17.setText("€ 20,00:");

        jLabel18.setText("€ 50,00:");

        jLabel19.setText("€ 100,00:");

        btnSaveBegin.setText("Opslaan");
        btnSaveBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBeginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BeginkasPanelLayout = new javax.swing.GroupLayout(BeginkasPanel);
        BeginkasPanel.setLayout(BeginkasPanelLayout);
        BeginkasPanelLayout.setHorizontalGroup(
            BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeginkasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiveCentB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenCentB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtTwentyCentB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiftyCentB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtOneEuroB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtTwoEuroB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiveEuroB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenEuroB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTwentyEuroB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiftyEuroB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHundredEuroB))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTwoCentB)
                            .addComponent(txtOneCentB)))
                    .addGroup(BeginkasPanelLayout.createSequentialGroup()
                        .addComponent(lblKasType)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeginkasPanelLayout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveBegin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        BeginkasPanelLayout.setVerticalGroup(
            BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeginkasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKasType)
                .addGap(1, 1, 1)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtOneCentB, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTwoCentB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFiveCentB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTenCentB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTwentyCentB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFiftyCentB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtOneEuroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTwoEuroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtFiveEuroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTenEuroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTwentyEuroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtFiftyEuroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BeginkasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtHundredEuroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveBegin)
                .addContainerGap())
        );

        lblKasType1.setText("Eind kas");

        jLabel20.setText("Aantal");

        jLabel21.setText("€ 0,01:");

        jLabel22.setText("€ 0,02:");

        jLabel23.setText("€ 0,05:");

        jLabel24.setText("€ 0,10:");

        jLabel25.setText("€ 0,20:");

        jLabel26.setText("€ 0,50:");

        jLabel27.setText("€ 1,00:");

        jLabel28.setText("€ 2,00:");

        jLabel29.setText("€ 5,00:");

        jLabel30.setText("€ 10,00:");

        jLabel31.setText("€ 20,00:");

        jLabel32.setText("€ 50,00:");

        jLabel33.setText("€ 100,00:");

        btnSaveEind.setText("Opslaan");
        btnSaveEind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EindKasPanelLayout = new javax.swing.GroupLayout(EindKasPanel);
        EindKasPanel.setLayout(EindKasPanelLayout);
        EindKasPanelLayout.setHorizontalGroup(
            EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EindKasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiveCentE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenCentE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtTwentyCentE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiftyCentE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(txtOneEuroE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(txtTwoEuroE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiveEuroE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenEuroE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTwentyEuroE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiftyEuroE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHundredEuroE))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTwoCentE)
                            .addComponent(txtOneCentE)))
                    .addGroup(EindKasPanelLayout.createSequentialGroup()
                        .addComponent(lblKasType1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EindKasPanelLayout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveEind, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        EindKasPanelLayout.setVerticalGroup(
            EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EindKasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKasType1)
                .addGap(1, 1, 1)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtOneCentE, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtTwoCentE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtFiveCentE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtTenCentE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtTwentyCentE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtFiftyCentE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtOneEuroE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtTwoEuroE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtFiveEuroE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtTenEuroE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtTwentyEuroE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtFiftyEuroE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EindKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtHundredEuroE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveEind)
                .addContainerGap())
        );

        lblKasType2.setText("Uit Kas");

        jLabel34.setText("Aantal");

        jLabel35.setText("€ 0,01:");

        jLabel36.setText("€ 0,02:");

        jLabel37.setText("€ 0,05:");

        jLabel38.setText("€ 0,10:");

        jLabel39.setText("€ 0,20:");

        jLabel40.setText("€ 0,50:");

        jLabel41.setText("€ 1,00:");

        jLabel42.setText("€ 2,00:");

        jLabel43.setText("€ 5,00:");

        jLabel44.setText("€ 10,00:");

        jLabel45.setText("€ 20,00:");

        jLabel46.setText("€ 50,00:");

        jLabel47.setText("€ 100,00:");

        btnSaveUit.setText("Opslaan");
        btnSaveUit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UitKasPanelLayout = new javax.swing.GroupLayout(UitKasPanel);
        UitKasPanel.setLayout(UitKasPanelLayout);
        UitKasPanelLayout.setHorizontalGroup(
            UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UitKasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiveCentU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenCentU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(txtTwentyCentU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiftyCentU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(txtOneEuroU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(txtTwoEuroU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiveEuroU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenEuroU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTwentyEuroU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiftyEuroU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHundredEuroU))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTwoCentU)
                            .addComponent(txtOneCentU)))
                    .addGroup(UitKasPanelLayout.createSequentialGroup()
                        .addComponent(lblKasType2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UitKasPanelLayout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveUit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        UitKasPanelLayout.setVerticalGroup(
            UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UitKasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKasType2)
                .addGap(1, 1, 1)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(txtOneCentU, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtTwoCentU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtFiveCentU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtTenCentU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtTwentyCentU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtFiftyCentU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtOneEuroU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtTwoEuroU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtFiveEuroU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtTenEuroU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtTwentyEuroU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtFiftyEuroU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UitKasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtHundredEuroU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveUit)
                .addContainerGap())
        );

        lblKasType3.setText("Rollen");

        jLabel48.setText("Aantal");

        jLabel49.setText("€ 0,01:");

        jLabel50.setText("€ 0,02:");

        jLabel51.setText("€ 0,05:");

        jLabel52.setText("€ 0,10:");

        jLabel53.setText("€ 0,20:");

        jLabel54.setText("€ 0,50:");

        jLabel55.setText("€ 1,00:");

        jLabel56.setText("€ 2,00:");

        btnSaveRol.setText("Opslaan");
        btnSaveRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RolPanelLayout = new javax.swing.GroupLayout(RolPanel);
        RolPanel.setLayout(RolPanelLayout);
        RolPanelLayout.setHorizontalGroup(
            RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RolPanelLayout.createSequentialGroup()
                        .addComponent(lblKasType3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RolPanelLayout.createSequentialGroup()
                        .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSaveRol)
                            .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(RolPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel56)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTwoEuroR, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                .addGroup(RolPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel55)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtOneEuroR))
                                .addGroup(RolPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel54)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFiftyCentR))
                                .addGroup(RolPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel53)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTwentyCentR))
                                .addGroup(RolPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel52)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTenCentR))
                                .addGroup(RolPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel51)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFiveCentR))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RolPanelLayout.createSequentialGroup()
                                    .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel50)
                                        .addComponent(jLabel49))
                                    .addGap(18, 18, 18)
                                    .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtOneCentR, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(txtTwoCentR)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RolPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addContainerGap())
        );
        RolPanelLayout.setVerticalGroup(
            RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKasType3)
                .addGap(1, 1, 1)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(txtOneCentR, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtTwoCentR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtFiveCentR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtTenCentR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtTwentyCentR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtFiftyCentR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtOneEuroR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtTwoEuroR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveRol)
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BeginkasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EindKasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UitKasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeginkasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EindKasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UitKasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mniNewKasboek.setText("File");

        mniNewkasboek.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mniNewkasboek.setText("nieuw kasboek");
        mniNewkasboek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewkasboekActionPerformed(evt);
            }
        });
        mniNewKasboek.add(mniNewkasboek);

        jMenuBar1.add(mniNewKasboek);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSaveBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBeginActionPerformed
        // TODO add your handling code here:
        
        kasboek.setAv(txtAV.getText());
        kasboek.setCommentaar(txtComment.getText());
        Kas beginKas = setKasData(txtOneCentB, txtTwoCentB, txtFiveCentB, txtTenCentB, txtTwentyCentB, txtFiftyCentB, txtOneEuroB, txtTwoEuroB, txtFiveEuroB, txtTenEuroB, txtTwentyEuroB, txtFiftyEuroB, txtHundredEuroB);
        kasboek.setBeginKas(beginKas);
        service = new KasboekService();
        if(kasboek.getAv().equals("")){
            JOptionPane.showMessageDialog(this, "gelieve het AV veld eerst in te vullen",
            "AV veld is leeg!",
            JOptionPane.ERROR_MESSAGE);
        }
        else{
        service.saveKas(beginKas);
        service.saveKasboek(kasboek);
        txtVoor.setText(String.valueOf(kasboek.totaalBegin()));
        }
    }//GEN-LAST:event_btnSaveBeginActionPerformed

    private void btnSaveEindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEindActionPerformed
        // TODO add your handling code here:
        kasboek.setCommentaar(txtComment.getText());
        Kas eindKas = setKasData(txtOneCentE, txtTwoCentE, txtFiveCentE, txtTenCentE, txtTwentyCentE, txtFiftyCentE, txtOneEuroE, txtTwoEuroE, txtFiveEuroE, txtTenEuroE, txtTwentyEuroE, txtFiftyEuroE, txtHundredEuroE);
        kasboek.setEindKas(eindKas);
        if(kasboek.getBeginKas() != null)
        {
            service = new KasboekService();
            service.saveKas(eindKas);
            service.saveKasboek(kasboek);
            txtNa.setText(String.valueOf(kasboek.totaalEind()));
            txtOmzet.setText(String.valueOf(kasboek.omzet()));
        }
        else{
            JOptionPane.showMessageDialog(this, "gelieve de begin kas eerst in te vullen",
            "Begin kas leeg!",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveEindActionPerformed

    private void btnSaveUitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUitActionPerformed
        // TODO add your handling code here:
        kasboek.setCommentaar(txtComment.getText());
        Kas uitKas= setKasData(txtOneCentU, txtTwoCentU, txtFiveCentU, txtTenCentU, txtTwentyCentU, txtFiftyCentU, txtOneEuroU, txtTwoEuroU, txtFiveEuroU, txtTenEuroU, txtTwentyEuroU, txtFiftyEuroU, txtHundredEuroU);
        kasboek.setUitKas(uitKas);

        if(kasboek.getBeginKas() != null)
        {        
        service = new KasboekService();
        service.saveKas(uitKas);
        service.saveKasboek(kasboek);
            if(kasboek.getEindKas() != null)
            {
                txtNa.setText(String.valueOf(kasboek.totaalEind()));
                txtOmzet.setText(String.valueOf(kasboek.omzet()));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "gelieve de begin kas eerst in te vullen",
            "Begin kas leeg!",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveUitActionPerformed
    
    // Deze methode is puur uit luiheid (DRY principe)
    private Kas setKasData(JTextField oneCent, JTextField twoCent, JTextField fiveCent, JTextField tenCent, JTextField twentyCent, JTextField fiftyCent, JTextField oneEuro, JTextField twoEuro, JTextField fiveEuro, JTextField tenEuro, JTextField twentyEuro, JTextField fiftyEuro, JTextField hundredEuro){
        Kas kas = new Kas();
        if(oneCent.getText().equals(""))
        {
            kas.setEenCenten(0);
        }
        else{
        kas.setEenCenten(Integer.parseInt(oneCent.getText()));
        }
        if(twoCent.getText().equals(""))
        {
            kas.setTweeCenten(0);
        }
        else{
        kas.setTweeCenten(Integer.parseInt(twoCent.getText()));
        }
        if(fiveCent.getText().equals(""))
        {
            kas.setVijfCenten(0);
        }
        else{
            kas.setVijfCenten(Integer.parseInt(fiveCent.getText()));
        }
        if(tenCent.getText().equals(""))
        {
            kas.setTienCenten(0);
        }
        else{
        kas.setTienCenten(Integer.parseInt(tenCent.getText()));
        }
        if(twentyCent.getText().equals(""))
        {
            kas.setTwintigCenten(0);
        }
        else{
            kas.setTwintigCenten(Integer.parseInt(twentyCent.getText()));
        }
        
        if(fiftyCent.getText().equals(""))
        {
            kas.setVijftigCenten(0);
        }
        else{
            kas.setVijftigCenten(Integer.parseInt(fiftyCent.getText()));
        }
        if(oneEuro.getText().equals(""))
        {
            kas.setEenEuros(0);
        }
        else{
            kas.setEenEuros(Integer.parseInt(oneEuro.getText()));
        }
        if(twoEuro.getText().equals(""))
        {
            kas.setTweeEuros(0);
        }
        else{
            kas.setTweeEuros(Integer.parseInt(twoEuro.getText()));
        }
        if(fiveEuro.getText().equals(""))
        {
            kas.setVijfEuros(0);
        }
        else{
            kas.setVijfEuros(Integer.parseInt(fiveEuro.getText()));
        }
        if(tenEuro.getText().equals(""))
        {
            kas.setTienEuros(0);
        }
        else{
            kas.setTienEuros(Integer.parseInt(tenEuro.getText()));
        }
        if(twentyEuro.getText().equals(""))
        {
            kas.setTwintigEuros(0);
        }
        else{
            kas.setTwintigEuros(Integer.parseInt(twentyEuro.getText()));
        }
        if(fiftyEuro.getText().equals(""))
        {
            kas.setVijftigEuro(0);
        }
        else{
            kas.setVijftigEuro(Integer.parseInt(fiftyEuro.getText()));
        }
        if(hundredEuro.getText().equals(""))
        {
            kas.setHonderdEuros(0);
        }
        else{
            kas.setHonderdEuros(Integer.parseInt(hundredEuro.getText()));
        }
    return kas;
}
    
    private void btnSaveRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRolActionPerformed
        // TODO add your handling code here:
        kasboek.setCommentaar(txtComment.getText());
        Rol rollen = new Rol();
        if(!txtOneCentR.getText().equals(""))
        {
            rollen.setEenCent(Integer.parseInt(txtOneCentR.getText()));
        }
        else{
        rollen.setEenCent(0);
        }
        if(!txtTwoCentR.getText().equals(""))
        {
            rollen.setTweeCent(Integer.parseInt(txtTwoCentR.getText()));
        }
        else{
        rollen.setTweeCent(0);
        }
        if(!txtFiveCentR.getText().equals(""))
        {
            rollen.setVijfCent(Integer.parseInt(txtFiveCentR.getText()));
        }
        else{
        rollen.setVijfCent(0);
        }
        if(!txtTenCentR.getText().equals(""))
        {
            rollen.setTienCent(Integer.parseInt(txtTenCentR.getText()));
        }
        else{
        rollen.setTienCent(0);
        }
        if(!txtTwentyCentR.getText().equals(""))
        {
            rollen.setTwintigCent(Integer.parseInt(txtTwentyCentR.getText()));
        }
        else{
        rollen.setTwintigCent(0);
        }
        if(!txtFiftyCentR.getText().equals(""))
        {
            rollen.setVijftigCent(Integer.parseInt(txtFiftyCentR.getText()));
        }
        else{
        rollen.setVijftigCent(0);
        }
        if(!txtOneEuroR.getText().equals(""))
        {
            rollen.setEenEuro(Integer.parseInt(txtOneEuroR.getText()));
        }
        else{
        rollen.setEenEuro(0);
        }
        if(!txtTwoEuroR.getText().equals(""))
        {
            rollen.setTweeEuro(Integer.parseInt(txtTwoEuroR.getText()));
        }
        else{
        rollen.setTweeEuro(0);
        }
        kasboek.setRolletjes(rollen);
        

        if(kasboek.getBeginKas() != null)
        {
        service = new KasboekService();        
        service.saveRol(rollen);
        service.saveKasboek(kasboek);
        txtVoor.setText(String.valueOf(kasboek.totaalBegin()));
        }
        else{
            JOptionPane.showMessageDialog(this, "gelieve de begin kas eerst in te vullen",
            "Begin kas leeg!",
            JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSaveRolActionPerformed

    private void mniNewkasboekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewkasboekActionPerformed
        // TODO add your handling code here:
        newKasboek();
        clearKasboekTxt();
        
    }//GEN-LAST:event_mniNewkasboekActionPerformed
    
    private void clearKasboekTxt()
    {
        txtAV.setText("");
        txtComment.setText("");
        txtNa.setText("");
        txtOmzet.setText("");
        txtVoor.setText("");
        txtOneCentB.setText("");
        txtOneCentE.setText("");
        txtOneCentR.setText("");
        txtOneCentU.setText("");
        txtTwoCentB.setText("");
        txtTwoCentE.setText("");
        txtTwoCentR.setText("");
        txtTwoCentU.setText("");
        txtFiveCentB.setText("");
        txtFiveCentE.setText("");
        txtFiveCentR.setText("");
        txtFiveCentU.setText("");
        txtTenCentB.setText("");
        txtTenCentE.setText("");
        txtTenCentR.setText("");
        txtTenCentU.setText("");
        txtTwentyCentB.setText("");
        txtTwentyCentE.setText("");
        txtTwentyCentR.setText("");
        txtTwentyCentU.setText("");
        txtFiftyCentB.setText("");
        txtFiftyCentE.setText("");
        txtFiftyCentR.setText("");
        txtFiftyCentU.setText("");
        txtOneEuroB.setText("");
        txtOneEuroE.setText("");
        txtOneEuroR.setText("");
        txtOneEuroU.setText("");
        txtTwoEuroB.setText("");
        txtTwoEuroE.setText("");
        txtTwoEuroR.setText("");
        txtTwoEuroU.setText("");
        txtFiveEuroB.setText("");
        txtFiveEuroE.setText("");
        txtFiveEuroU.setText("");
        txtTenEuroB.setText("");
        txtTenEuroE.setText("");
        txtTenEuroU.setText("");
        txtTwentyEuroB.setText("");
        txtTwentyEuroE.setText("");
        txtTwentyEuroU.setText("");
        txtFiftyEuroB.setText("");
        txtFiftyEuroE.setText("");
        txtFiftyEuroU.setText("");
        txtHundredEuroB.setText("");
        txtHundredEuroE.setText("");
        txtHundredEuroU.setText("");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KasboekDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasboekDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasboekDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasboekDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasboekDesktop().setVisible(true);
                
            }
        });
    }
    
    private KasboekService service;
    private Kasboek kasboek;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BeginkasPanel;
    private javax.swing.JPanel EindKasPanel;
    private javax.swing.JPanel RolPanel;
    private javax.swing.JPanel UitKasPanel;
    private javax.swing.JButton btnSaveBegin;
    private javax.swing.JButton btnSaveEind;
    private javax.swing.JButton btnSaveRol;
    private javax.swing.JButton btnSaveUit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblKasType;
    private javax.swing.JLabel lblKasType1;
    private javax.swing.JLabel lblKasType2;
    private javax.swing.JLabel lblKasType3;
    private javax.swing.JMenu mniNewKasboek;
    private javax.swing.JMenuItem mniNewkasboek;
    private javax.swing.JTextField txtAV;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtFiftyCentB;
    private javax.swing.JTextField txtFiftyCentE;
    private javax.swing.JTextField txtFiftyCentR;
    private javax.swing.JTextField txtFiftyCentU;
    private javax.swing.JTextField txtFiftyEuroB;
    private javax.swing.JTextField txtFiftyEuroE;
    private javax.swing.JTextField txtFiftyEuroU;
    private javax.swing.JTextField txtFiveCentB;
    private javax.swing.JTextField txtFiveCentE;
    private javax.swing.JTextField txtFiveCentR;
    private javax.swing.JTextField txtFiveCentU;
    private javax.swing.JTextField txtFiveEuroB;
    private javax.swing.JTextField txtFiveEuroE;
    private javax.swing.JTextField txtFiveEuroU;
    private javax.swing.JTextField txtHundredEuroB;
    private javax.swing.JTextField txtHundredEuroE;
    private javax.swing.JTextField txtHundredEuroU;
    private javax.swing.JTextField txtNa;
    private javax.swing.JTextField txtOmzet;
    private javax.swing.JTextField txtOneCentB;
    private javax.swing.JTextField txtOneCentE;
    private javax.swing.JTextField txtOneCentR;
    private javax.swing.JTextField txtOneCentU;
    private javax.swing.JTextField txtOneEuroB;
    private javax.swing.JTextField txtOneEuroE;
    private javax.swing.JTextField txtOneEuroR;
    private javax.swing.JTextField txtOneEuroU;
    private javax.swing.JTextField txtTenCentB;
    private javax.swing.JTextField txtTenCentE;
    private javax.swing.JTextField txtTenCentR;
    private javax.swing.JTextField txtTenCentU;
    private javax.swing.JTextField txtTenEuroB;
    private javax.swing.JTextField txtTenEuroE;
    private javax.swing.JTextField txtTenEuroU;
    private javax.swing.JTextField txtTwentyCentB;
    private javax.swing.JTextField txtTwentyCentE;
    private javax.swing.JTextField txtTwentyCentR;
    private javax.swing.JTextField txtTwentyCentU;
    private javax.swing.JTextField txtTwentyEuroB;
    private javax.swing.JTextField txtTwentyEuroE;
    private javax.swing.JTextField txtTwentyEuroU;
    private javax.swing.JTextField txtTwoCentB;
    private javax.swing.JTextField txtTwoCentE;
    private javax.swing.JTextField txtTwoCentR;
    private javax.swing.JTextField txtTwoCentU;
    private javax.swing.JTextField txtTwoEuroB;
    private javax.swing.JTextField txtTwoEuroE;
    private javax.swing.JTextField txtTwoEuroR;
    private javax.swing.JTextField txtTwoEuroU;
    private javax.swing.JTextField txtVoor;
    // End of variables declaration//GEN-END:variables
}
