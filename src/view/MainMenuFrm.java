package view;

import controller.RunClient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class MainMenuFrm extends javax.swing.JFrame {
    public Timer timer;
    private Timer timer1;
    private Vector<Integer> listIDRoom;
    private Vector<String> listNPlayer;
    private Thread thread;
    private boolean isPlayThread;
    DefaultTableModel defaultTableModel;

    public MainMenuFrm() {
        initComponents();
        this.setIconImage(new ImageIcon("src/assets/logoicon.png").getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Game Caro "+"("+RunClient.user.getUsername()+")");
        findingpan.setVisible(false);
        acceptpan.setVisible(false);
        defaultTableModel = (DefaultTableModel) jTable1.getModel();
        isPlayThread = true;
        thread = new Thread(){
            @Override
            public void run(){
                while (isPlayThread) {                    
                    try {
                        RunClient.socketHandle.write("view-room-list,");
                        Thread.sleep(500);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    }
                }
            }
        };
        thread.start();;    
    }
    public void updateRoomList(Vector<Integer> listData){
        this.listIDRoom = listData;
//        this.listNPlayer = listnumber;
        defaultTableModel.setRowCount(0);
        for(int i=0; i<listIDRoom.size(); i++)
        {
            defaultTableModel.addRow(new Object[]{
                listIDRoom.get(i),
                "1/2"
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_jPanel = new javax.swing.JPanel();
        logout_btt = new javax.swing.JButton();
        profile_btt = new javax.swing.JButton();
        frlist_btt = new javax.swing.JButton();
        rank_btt = new javax.swing.JButton();
        game_btt = new javax.swing.JPanel();
        swiftplay_btt = new javax.swing.JButton();
        createroom_btt = new javax.swing.JButton();
        findingpan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancel_btt = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        acceptpan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbTimerPairMatch = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Object[][] rows = {
        };
        String[] columns = {"ID Room","NPlayer"};
        DefaultTableModel model = new DefaultTableModel(rows, columns){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0: return Integer.class;
                    case 1: return String.class;
                    default: return Object.class;
                }
            }
        };
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logout_btt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        logout_btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_logout_rounded_left_24px.png"))); // NOI18N
        logout_btt.setText("Log out");
        logout_btt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_bttMouseClicked(evt);
            }
        });

        profile_btt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        profile_btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_contact_24px.png"))); // NOI18N
        profile_btt.setText("Profile");
        profile_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_bttActionPerformed(evt);
            }
        });

        frlist_btt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        frlist_btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/friend.png"))); // NOI18N
        frlist_btt.setText("Friend");
        frlist_btt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frlist_bttMouseClicked(evt);
            }
        });

        rank_btt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rank_btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Sword.png"))); // NOI18N
        rank_btt.setText("Charts");
        rank_btt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rank_bttMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout user_jPanelLayout = new javax.swing.GroupLayout(user_jPanel);
        user_jPanel.setLayout(user_jPanelLayout);
        user_jPanelLayout.setHorizontalGroup(
            user_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_jPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logout_btt)
                .addGap(15, 15, 15)
                .addComponent(profile_btt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frlist_btt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rank_btt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        user_jPanelLayout.setVerticalGroup(
            user_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frlist_btt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(rank_btt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(logout_btt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(profile_btt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        swiftplay_btt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        swiftplay_btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_circled_play_24px.png"))); // NOI18N
        swiftplay_btt.setText("Swift play");
        swiftplay_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swiftplay_bttActionPerformed(evt);
            }
        });

        createroom_btt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        createroom_btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_add_24px.png"))); // NOI18N
        createroom_btt.setText("Create room");
        createroom_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createroom_bttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout game_bttLayout = new javax.swing.GroupLayout(game_btt);
        game_btt.setLayout(game_bttLayout);
        game_bttLayout.setHorizontalGroup(
            game_bttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(game_bttLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(swiftplay_btt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createroom_btt)
                .addGap(69, 69, 69))
        );
        game_bttLayout.setVerticalGroup(
            game_bttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game_bttLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(game_bttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createroom_btt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(swiftplay_btt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Finding match");

        cancel_btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_cancel_24px.png"))); // NOI18N
        cancel_btt.setText("Cancel");
        cancel_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_bttActionPerformed(evt);
            }
        });

        jProgressBar2.setIndeterminate(true);

        javax.swing.GroupLayout findingpanLayout = new javax.swing.GroupLayout(findingpan);
        findingpan.setLayout(findingpanLayout);
        findingpanLayout.setHorizontalGroup(
            findingpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findingpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(findingpanLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(cancel_btt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(findingpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findingpanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        findingpanLayout.setVerticalGroup(
            findingpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findingpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(cancel_btt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(findingpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(findingpanLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Found room u can use :D. Accept ?");

        jButton1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_cancel_24px.png"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_ok_24px.png"))); // NOI18N
        jButton2.setText("Accept");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbTimerPairMatch.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lbTimerPairMatch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTimerPairMatch.setText("15s");

        javax.swing.GroupLayout acceptpanLayout = new javax.swing.GroupLayout(acceptpan);
        acceptpan.setLayout(acceptpanLayout);
        acceptpanLayout.setHorizontalGroup(
            acceptpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptpanLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(acceptpanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acceptpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTimerPairMatch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        acceptpanLayout.setVerticalGroup(
            acceptpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTimerPairMatch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(acceptpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(480, 312));
        jTabbedPane1.setRequestFocusEnabled(false);

        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_replay_24px.png"))); // NOI18N
        jButton3.setText("Refresh");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jButton3))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Room", jPanel3);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_contact_24px.png"))); // NOI18N
        jButton4.setText("Infomation");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 363, Short.MAX_VALUE)
                .addComponent(jButton4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Online player", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(findingpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(game_btt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceptpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(game_btt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findingpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceptpan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void logout_bttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_bttMouseClicked
        try {
            RunClient.socketHandle.write("offline,"+RunClient.user.getID());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        RunClient.closeView(RunClient.View.HOME);
        RunClient.openView(RunClient.View.LOGIN);        
    }//GEN-LAST:event_logout_bttMouseClicked

    private void rank_bttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rank_bttMouseClicked
        RunClient.openView(RunClient.View.RANK);
    }//GEN-LAST:event_rank_bttMouseClicked

    private void frlist_bttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frlist_bttMouseClicked
        RunClient.openView(RunClient.View.FRIENDLIST);
    }//GEN-LAST:event_frlist_bttMouseClicked

    private void profile_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_bttActionPerformed
        RunClient.openView(RunClient.View.PROFILE);
    }//GEN-LAST:event_profile_bttActionPerformed

    private void cancel_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_bttActionPerformed
        try {
            RunClient.socketHandle.write("cancel-room,");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        findingpan.setVisible(false);
    }//GEN-LAST:event_cancel_bttActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        if(jTable1.getSelectedRow()==-1){      
//        }else{
//            try {
//                isPlayThread = false;
//                int index = jTable1.getSelectedRow();
//                int room = Integer.parseInt(listRoom.get(index).split(" ")[1]);
//                String password = listPassword.get(index);
//                if(password.equals(" ")){
//                    Client.socketHandle.write("join-room,"+room);
//                    Client.closeView(Client.View.ROOMLIST);
//                }
//                else{
//                    Client.closeView(Client.View.ROOMLIST);
//                    Client.openView(Client.View.JOINROOMPASSWORD, room, password);
//                }
//            } catch (IOException ex) {
//                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
//            }
//        }
    }//GEN-LAST:event_jTable1MouseClicked
    
    //xử lý chấp nhận vào phòng
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            RunClient.socketHandle.write("accept-room,");
            timer.stop();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void createroom_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createroom_bttActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đặt mật khẩu cho phòng không?", "Tạo phòng", JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION){
            RunClient.openView(RunClient.View.CREATEROOMPASSWORD);
        }
        else if(res==JOptionPane.NO_OPTION){
            try {
                RunClient.socketHandle.write("create-room,");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } 
    }//GEN-LAST:event_createroom_bttActionPerformed

    private void swiftplay_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swiftplay_bttActionPerformed
        findingpan.setVisible(true);
        if(timer!=null){
            timer.stop();
        }
        //phòng trường hợp nếu nhấn lại swiftplay 1 lần nữa thì nó sẽ tắt cái cũ
        acceptpan.setVisible(false);
        sendFindRequest();
    }//GEN-LAST:event_swiftplay_bttActionPerformed
    
    public void setAllVisibleFalse(){
        acceptpan.setVisible(false);
        findingpan.setVisible(false);
    }
    //xử lý hủy chấp nhận phòng
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            RunClient.socketHandle.write("cancel-room,");
            timer.stop();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        acceptpan.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void sendFindRequest(){
        try {
            RunClient.socketHandle.write("quick-room,");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    public void showFindedRoom(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi khi sleep thread");
        }
        findingpan.setVisible(false);
        acceptpan.setVisible(true);
        startCount();
    }
    public void stopAllThread(){
        timer.stop();
    }
    public void startCount(){
        timer = new Timer(1000, new ActionListener() {
            int count = 15;

            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                if (count >= 0) {
                   lbTimerPairMatch.setText(count+"s");
                } else {
                    ((Timer) (e.getSource())).stop();
                    try {
                        RunClient.socketHandle.write("cancel-room,");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    }
                    int res = JOptionPane.showConfirmDialog(rootPane, "Đã quá thời gian chờ, lời chấp nhận đã bị hủy, bạn có muốn tìm trận lại?");
                    if (res==JOptionPane.YES_OPTION){
                        findingpan.setVisible(true);
                        acceptpan.setVisible(false);
                        sendFindRequest();
                    }
                    else{
                        //Có thể hỏi chơi với máy không
                        findingpan.setVisible(false);
                        acceptpan.setVisible(false);
                    }
                }
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acceptpan;
    private javax.swing.JButton cancel_btt;
    private javax.swing.JButton createroom_btt;
    private javax.swing.JPanel findingpan;
    private javax.swing.JButton frlist_btt;
    private javax.swing.JPanel game_btt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbTimerPairMatch;
    private javax.swing.JButton logout_btt;
    private javax.swing.JButton profile_btt;
    private javax.swing.JButton rank_btt;
    private javax.swing.JButton swiftplay_btt;
    private javax.swing.JPanel user_jPanel;
    // End of variables declaration//GEN-END:variables
}