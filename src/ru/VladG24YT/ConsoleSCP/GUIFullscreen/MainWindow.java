/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.VladG24YT.ConsoleSCP.GUIFullscreen;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author VlaDOS
 */
public class MainWindow extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private String username;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        this.ticks = new Timer(60, (ActionEvent e) -> {
            loggerArea.setText(loggerArea.getText() + "\nUser@active");
            this.revalidate();
        });
        initComponents();
        username = JOptionPane.showInputDialog(null, "Введите имя пользователя:", "Вход", JOptionPane.OK_CANCEL_OPTION);
    }

    Timer ticks;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainDesktopPane = new javax.swing.JDesktopPane();
        consoleInternalFrame = new javax.swing.JInternalFrame();
        consolePanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameView = new javax.swing.JTextField();
        accessLabel = new javax.swing.JLabel();
        accessView = new javax.swing.JTextField();
        msgButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        mainNavigationPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        subNavigationPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        outputPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        loggerPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        loggerArea = new javax.swing.JTextArea();
        controlPanel = new javax.swing.JPanel();
        pathField = new javax.swing.JTextField();
        commandInputField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCP Console");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainDesktopPane.setBackground(new java.awt.Color(0, 0, 0));
        mainDesktopPane.setName("mainDesktopPane"); // NOI18N

        consoleInternalFrame.setTitle("Console");
        consoleInternalFrame.setAutoscrolls(true);
        consoleInternalFrame.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.jpg"))); // NOI18N
        consoleInternalFrame.setName("consoleInternalFrame"); // NOI18N
        consoleInternalFrame.setVisible(true);

        consolePanel.setBackground(new java.awt.Color(0, 0, 0));
        consolePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        consolePanel.setName(""); // NOI18N
        consolePanel.setPreferredSize(new java.awt.Dimension(900, 600));
        ticks.start();

        userPanel.setBackground(new java.awt.Color(0, 0, 0));
        userPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        userPanel.setName("userPanel"); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Имя пользователя:");
        usernameLabel.setName("usernameLabel"); // NOI18N

        usernameView.setEditable(false);
        usernameView.setBackground(new java.awt.Color(0, 0, 0));
        usernameView.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        usernameView.setForeground(new java.awt.Color(255, 255, 255));
        usernameView.setName("usernameView"); // NOI18N

        accessLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        accessLabel.setForeground(new java.awt.Color(255, 255, 255));
        accessLabel.setText("Уровень доступа:");
        accessLabel.setName("accessLabel"); // NOI18N

        accessView.setEditable(false);
        accessView.setBackground(new java.awt.Color(0, 0, 0));
        accessView.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        accessView.setForeground(new java.awt.Color(255, 255, 255));
        accessView.setText("Класс C");
        accessView.setName("accessView"); // NOI18N

        msgButton.setBackground(new java.awt.Color(0, 0, 0));
        msgButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        msgButton.setForeground(new java.awt.Color(255, 255, 255));
        msgButton.setText("📧");
        msgButton.setActionCommand("msg");
        msgButton.setName("msgButton"); // NOI18N
        msgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgButtonmsg(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(0, 0, 0));
        helpButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        helpButton.setForeground(new java.awt.Color(255, 255, 255));
        helpButton.setText("!");
        helpButton.setActionCommand("help");
        helpButton.setAlignmentY(0.0F);
        helpButton.setName("helpButton"); // NOI18N
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel)
                    .addComponent(accessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameView)
                    .addComponent(accessView, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(msgButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accessView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accessLabel)
                    .addComponent(helpButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        mainNavigationPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainNavigationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        mainNavigationPanel.setName("mainNavigationPanel"); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FILE");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FILE");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FILE");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FILE");
        jLabel10.setName("jLabel10"); // NOI18N

        javax.swing.GroupLayout mainNavigationPanelLayout = new javax.swing.GroupLayout(mainNavigationPanel);
        mainNavigationPanel.setLayout(mainNavigationPanelLayout);
        mainNavigationPanelLayout.setHorizontalGroup(
            mainNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainNavigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainNavigationPanelLayout.setVerticalGroup(
            mainNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainNavigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subNavigationPanel.setBackground(new java.awt.Color(0, 0, 0));
        subNavigationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        subNavigationPanel.setName("subNavigationPanel"); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FILE");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FILE");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EXE");
        jLabel5.setName("jLabel5"); // NOI18N

        javax.swing.GroupLayout subNavigationPanelLayout = new javax.swing.GroupLayout(subNavigationPanel);
        subNavigationPanel.setLayout(subNavigationPanelLayout);
        subNavigationPanelLayout.setHorizontalGroup(
            subNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subNavigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subNavigationPanelLayout.setVerticalGroup(
            subNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subNavigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputPanel.setBackground(new java.awt.Color(0, 0, 0));
        outputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        outputPanel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        outputPanel.setName("outputPanel"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        outputArea.setEditable(false);
        outputArea.setBackground(new java.awt.Color(0, 0, 0));
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        outputArea.setForeground(new java.awt.Color(255, 255, 255));
        outputArea.setRows(5);
        outputArea.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        outputArea.setName("outputArea"); // NOI18N
        jScrollPane3.setViewportView(outputArea);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        loggerPanel.setBackground(new java.awt.Color(0, 0, 0));
        loggerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        loggerPanel.setName("loggerPanel"); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        loggerArea.setEditable(false);
        loggerArea.setBackground(new java.awt.Color(0, 0, 0));
        loggerArea.setColumns(20);
        loggerArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        loggerArea.setForeground(new java.awt.Color(0, 255, 0));
        loggerArea.setRows(5);
        loggerArea.setText("User@active");
        loggerArea.setAutoscrolls(false);
        loggerArea.setDisabledTextColor(new java.awt.Color(102, 255, 102));
        loggerArea.setName("loggerArea"); // NOI18N
        jScrollPane4.setViewportView(loggerArea);

        javax.swing.GroupLayout loggerPanelLayout = new javax.swing.GroupLayout(loggerPanel);
        loggerPanel.setLayout(loggerPanelLayout);
        loggerPanelLayout.setHorizontalGroup(
            loggerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loggerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        loggerPanelLayout.setVerticalGroup(
            loggerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loggerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        controlPanel.setBackground(new java.awt.Color(0, 0, 0));
        controlPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        controlPanel.setName("controlPanel"); // NOI18N

        pathField.setEditable(false);
        pathField.setBackground(new java.awt.Color(0, 0, 0));
        pathField.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        pathField.setForeground(new java.awt.Color(255, 255, 255));
        pathField.setText("C:/Users/Default/Desktop/");
        pathField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pathField.setName("pathField"); // NOI18N

        commandInputField.setBackground(new java.awt.Color(0, 0, 0));
        commandInputField.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        commandInputField.setForeground(new java.awt.Color(255, 255, 255));
        commandInputField.setToolTipText("Поле ввода команд");
        commandInputField.setName("commandInputField"); // NOI18N

        enterButton.setBackground(new java.awt.Color(0, 0, 0));
        enterButton.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        enterButton.setForeground(new java.awt.Color(255, 255, 255));
        enterButton.setText("Ввод");
        enterButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        enterButton.setName("enterButton"); // NOI18N
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pathField)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(commandInputField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commandInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scp_logo.jpg"))); // NOI18N
        logoLabel.setMinimumSize(new java.awt.Dimension(10, 10));
        logoLabel.setName("logoLabel"); // NOI18N

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scp.jpg"))); // NOI18N
        titleLabel.setMinimumSize(new java.awt.Dimension(10, 10));
        titleLabel.setName("titleLabel"); // NOI18N

        javax.swing.GroupLayout consolePanelLayout = new javax.swing.GroupLayout(consolePanel);
        consolePanel.setLayout(consolePanelLayout);
        consolePanelLayout.setHorizontalGroup(
            consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(consolePanelLayout.createSequentialGroup()
                        .addGroup(consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainNavigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subNavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(consolePanelLayout.createSequentialGroup()
                                .addGap(0, 159, Short.MAX_VALUE)
                                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loggerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        consolePanelLayout.setVerticalGroup(
            consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(consolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loggerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainNavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subNavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        outputArea.setText("С возвращением, "+username+"!\nТекущая дата: "+new SimpleDateFormat("E dd.MM.yyyy").format(new Date()) + "\n------------------------------");
        usernameView.setText(username);

        javax.swing.GroupLayout consoleInternalFrameLayout = new javax.swing.GroupLayout(consoleInternalFrame.getContentPane());
        consoleInternalFrame.getContentPane().setLayout(consoleInternalFrameLayout);
        consoleInternalFrameLayout.setHorizontalGroup(
            consoleInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consolePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        consoleInternalFrameLayout.setVerticalGroup(
            consoleInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consolePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        usernameView.setText(username);

        mainDesktopPane.setLayer(consoleInternalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDesktopPaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(consoleInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDesktopPaneLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(consoleInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDesktopPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void msgButtonmsg(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgButtonmsg
        if (evt.getActionCommand().equals("msg")) {
            loggerArea.setText(loggerArea.getText() + "\nMail@Open");
            JOptionPane.showInternalMessageDialog(mainDesktopPane, "ОТ: Администратор\nКОМУ: " + usernameView.getText() + "\n\nПоздравляем с приёмом на работу в класс C.\nВоспользуётесь командой \'tutorial\', чтобы ознакомиться с интерфейсом\nвашего нового рабочего места и ожидайте дальнейших инструкций", "ПИСЬМО ОТ administrator@scpfoundation.org", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_msgButtonmsg

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        if (evt.getActionCommand().equals("help")) {
            loggerArea.setText(loggerArea.getText() + "\nCommandHelp@open");
            JOptionPane.showInternalMessageDialog(mainDesktopPane, "Список доступных команд:\n\nexit (quit) - завершить сеанс\nhelp - вывод этого окна\ntutorial - просмотреть обучение", "Справка по командам", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_helpButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        if (evt.getActionCommand().equals("enter")) {
            String command = commandInputField.getText();
            commandInputField.setText("");
            if (command.equals("quit") || command.equals("exit")) {
                System.exit(0);
            } else if (command.equals("tutorial")) {
                //1st stage
                loggerArea.setText(loggerArea.getText() + "\nTutorial@Start");
                outputArea.setBackground(Color.GREEN);
                loggerArea.setText(loggerArea.getText() + "\nTutorial@Stage1");
                if (JOptionPane.showInternalConfirmDialog(mainDesktopPane, "Добро пожаловать в Терминал!\nЭтот гид поможет вам разобраться в базовом управлении.\n\nВыделенная область - поле вывода результатов\nкомманд", "Обучение 1/10", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {
                    //2nd stage
                    loggerArea.setText(loggerArea.getText() + "\nTutorial@Stage2");
                } else {
                    loggerArea.setText(loggerArea.getText() + "\nTutorial@Terminate");
                }
            } else if (command.equals("help")) {
                helpButtonActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
    }//GEN-LAST:event_formWindowOpened

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel accessLabel;
    private static javax.swing.JTextField accessView;
    private static javax.swing.JTextField commandInputField;
    javax.swing.JInternalFrame consoleInternalFrame;
    javax.swing.JPanel consolePanel;
    javax.swing.JPanel controlPanel;
    private static javax.swing.JButton enterButton;
    javax.swing.JButton helpButton;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    private static javax.swing.JTextArea loggerArea;
    javax.swing.JPanel loggerPanel;
    javax.swing.JLabel logoLabel;
    javax.swing.JDesktopPane mainDesktopPane;
    javax.swing.JPanel mainNavigationPanel;
    javax.swing.JButton msgButton;
    private static javax.swing.JTextArea outputArea;
    javax.swing.JPanel outputPanel;
    private static javax.swing.JTextField pathField;
    javax.swing.JPanel subNavigationPanel;
    javax.swing.JLabel titleLabel;
    javax.swing.JPanel userPanel;
    javax.swing.JLabel usernameLabel;
    javax.swing.JTextField usernameView;
    // End of variables declaration//GEN-END:variables
}
