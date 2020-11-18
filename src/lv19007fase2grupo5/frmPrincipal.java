package lv19007fase2grupo5;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RONALDMO
 */

public class frmPrincipal extends javax.swing.JFrame {
    private ListaJugadores plantilla = new ListaJugadores();
    private ListaJugadores equipoTitular = new ListaJugadores();
    private int maxPorteros=1, porteros=0,maxDefensas=4,defensas=0,maxVolantes=4,volantes=0,maxDelanteros=2,delanteros=0;
    private String posicion;
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlantilla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblPortero = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblDefensa_1 = new javax.swing.JLabel();
        lblDefensa_2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblDefensa_3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblDefensa_4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lblVolante_1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lblVolante_2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        lblVolante_3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        lblVolante_4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        lblDelantero_1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        lblDelantero_2 = new javax.swing.JLabel();
        btnAddPlayer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblPlantilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Posicion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPlantilla);

        jLabel1.setText("Plantilla");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblPortero.setText("...");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblDefensa_1.setText("...");

        lblDefensa_2.setText("...");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblDefensa_3.setText("...");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblDefensa_4.setText("...");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblVolante_1.setText("...");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblVolante_2.setText("...");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblVolante_3.setText("...");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblVolante_4.setText("...");

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblDelantero_1.setText("...");

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fpavatar.png"))); // NOI18N

        lblDelantero_2.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDefensa_1)
                            .addComponent(jButton2)
                            .addComponent(lblVolante_1)
                            .addComponent(jButton6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDefensa_2)
                                    .addComponent(jButton3)
                                    .addComponent(lblVolante_2)
                                    .addComponent(jButton7))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDefensa_3)
                                    .addComponent(jButton4)
                                    .addComponent(lblVolante_3)
                                    .addComponent(jButton8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVolante_4)
                                    .addComponent(jButton9)
                                    .addComponent(lblDefensa_4)
                                    .addComponent(jButton5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDelantero_1)
                                    .addComponent(jButton10))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDelantero_2)
                                    .addComponent(jButton11)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPortero)
                            .addComponent(jButton1))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPortero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDefensa_1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDefensa_2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDefensa_3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDefensa_4)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolante_1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolante_2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolante_3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolante_4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDelantero_1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDelantero_2)))
                .addContainerGap())
        );

        btnAddPlayer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAddPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flechad.png"))); // NOI18N
        btnAddPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlayerActionPerformed(evt);
            }
        });

        jMenu1.setText("Acciones");

        jMenuItem1.setText("Agregar Jugador");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPlayer)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlayerActionPerformed
        addJugadorTitular();
    }//GEN-LAST:event_btnAddPlayerActionPerformed
    private void addJugadorTitular(){
        //Verificamos si se ha seleccionado un jugador de la tabla
        if (tblPlantilla.getSelectedRowCount()>0) {
            int pos = tblPlantilla.getSelectedRow()+1;//Indice de tabla 0, Posicion en Lista 1 (Sumar 1 al indice de tabla)
            boolean aplicaTitular= true;   //Bandera si aplica a titular (Si no esta completa las posiciones)
            //Extraemos y eliminamos el jugador de la plantilla
            Jugador jugador = plantilla.extraer(pos);            
            //Verificar la posicion del jugador
            posicion = jugador.posicion;
            switch(posicion){
                case "Portero":
                    //Verificar la cantidad
                    if(porteros>= maxPorteros){
                        aplicaTitular = false;
                        JOptionPane.showMessageDialog( null, "No se puede alinear mas de un portero" );
                    }else{
                        aplicaTitular = true;                        
                        lblPortero.setText(jugador.nombre);
                        porteros ++;                        
                    }
                    break;
                case "Defensa":
                    break;
                case "Volante":
                    break;
                case "Delantero":
                    break;
            }
            if(aplicaTitular){
                setJugadorTitular(jugador,pos);
            }
            fillTblPlantilla();
            setAlineacion();
        }else{
            JOptionPane.showMessageDialog( null, "Seleccione un jugador de la tabla !!!" );
        }
    }
    private void setAlineacion(){
        //Recorrer la lista Titular
        int totTitulares = equipoTitular.cantidad();
        int posDefensa=1,posVolante=1,posDelantero=1;
        for(int i =1; i<=totTitulares;i++){
            //Obtener el jugador
            Jugador jugador = equipoTitular.extraer(i);
            //Verificar las posiciones
            posicion = jugador.posicion;
            switch(posicion){
                case "Portero":
                    lblPortero.setText(jugador.nombre);
                    break;
                case "Defensa":
                    switch(posDefensa){
                        case 1:
                            lblDefensa_1.setText(jugador.nombre);
                            break;
                        case 2:
                            lblDefensa_2.setText(jugador.nombre);
                            break;
                        case 3:
                            lblDefensa_3.setText(jugador.nombre);
                            break;
                        case 4:
                            lblDefensa_4.setText(jugador.nombre);
                            break;
                    }
                    posDefensa ++;
                    break;
                case "Volante":
                    switch(posVolante){
                        case 1:
                            lblVolante_1.setText(jugador.nombre);
                            break;
                        case 2:
                            lblVolante_2.setText(jugador.nombre);
                            break;
                        case 3:
                            lblVolante_3.setText(jugador.nombre);
                            break;
                        case 4:
                            lblVolante_4.setText(jugador.nombre);
                            break;
                    }
                    posVolante ++;
                    break;
                case "Delantero":
                    switch(posDelantero){
                        case 1:
                            lblDelantero_1.setText(jugador.nombre);
                            break;
                        case 2:
                            lblDelantero_2.setText(jugador.nombre);
                            break;                        
                    }
                    posDelantero ++;
                    break;
            }
        }
    }
    private void setJugadorTitular(Jugador jugador,int posPlantilla){
        //Eliminar el jugador de la plantilla
        plantilla.borrar(posPlantilla);
        //Insertar en el equipo titular
        equipoTitular.insertar(1, jugador);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.insertFakeData();
        fillTblPlantilla();
    }//GEN-LAST:event_formWindowOpened
    //Rellenar la tabla con los jugadores de la lista
    private void fillTblPlantilla(){                
        DefaultTableModel tableModel = plantilla.getTblJugadores();
        tblPlantilla.setModel(tableModel);
    }            
    //Prueba insertar fake data
    private void insertFakeData(){        
        Jugador jugador = new Jugador();
        jugador.numero=10;
        jugador.nombre = "Jose Ramos";
        jugador.posicion= Posicion.delantero;
        plantilla.insertar (1, jugador);
        
        Jugador jugador2 = new Jugador();
        jugador2.numero=1;
        jugador2.nombre = "Victor Campos";
        jugador2.posicion= Posicion.portero;
        plantilla.insertar (1, jugador2);
        
        Jugador jugador3 = new Jugador();
        jugador3.numero=7;
        jugador3.nombre = "Serre Siete";
        jugador3.posicion= Posicion.delantero;
        plantilla.insertar (1, jugador3);
        
        Jugador jugador4 = new Jugador();
        jugador4.numero=2;
        jugador4.nombre = "Sergio Ramos";
        jugador4.posicion= Posicion.defensa;
        plantilla.insertar (1, jugador4);
        
        Jugador jugador5 = new Jugador();
        jugador5.numero=3;
        jugador5.nombre = "Defensa 1";
        jugador5.posicion= Posicion.defensa;
        plantilla.insertar (1, jugador5);
        
        Jugador jugador6 = new Jugador();
        jugador6.numero=4;
        jugador6.nombre = "Defensa 2";
        jugador6.posicion= Posicion.defensa;
        plantilla.insertar (1, jugador6);
        
        Jugador jugador7 = new Jugador();
        jugador7.numero=5;
        jugador7.nombre = "Defensa 3";
        jugador7.posicion= Posicion.defensa;
        plantilla.insertar (1, jugador7);
        
        Jugador jugador8 = new Jugador();
        jugador8.numero=6;
        jugador8.nombre = "Volante 1";
        jugador8.posicion= Posicion.volante;
        plantilla.insertar (1, jugador8);
        
        Jugador jugador9 = new Jugador();
        jugador9.numero=7;
        jugador9.nombre = "Volante 2";
        jugador9.posicion= Posicion.volante;
        plantilla.insertar (1, jugador9);
        
        Jugador jugador10 = new Jugador();
        jugador10.numero=8;
        jugador10.nombre = "Volante 3";
        jugador10.posicion= Posicion.volante;
        plantilla.insertar (1, jugador10);
        
        Jugador jugador11 = new Jugador();
        jugador11.numero=9;
        jugador11.nombre = "Volante 4";
        jugador11.posicion= Posicion.volante;
        plantilla.insertar (1, jugador11);
    }
    //Prueba insertar fake data
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDefensa_1;
    private javax.swing.JLabel lblDefensa_2;
    private javax.swing.JLabel lblDefensa_3;
    private javax.swing.JLabel lblDefensa_4;
    private javax.swing.JLabel lblDelantero_1;
    private javax.swing.JLabel lblDelantero_2;
    private javax.swing.JLabel lblPortero;
    private javax.swing.JLabel lblVolante_1;
    private javax.swing.JLabel lblVolante_2;
    private javax.swing.JLabel lblVolante_3;
    private javax.swing.JLabel lblVolante_4;
    private javax.swing.JTable tblPlantilla;
    // End of variables declaration//GEN-END:variables
}
