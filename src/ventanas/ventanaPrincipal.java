package ventanas;

import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ventanaPrincipal extends javax.swing.JFrame {
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz[][] = new int[3][3];
    private String usuario1, usuario2;
    private int veces1=0, veces2=0, vecesEmp=0;
    
    
    public ventanaPrincipal(String usuario1, String usuario2) {
        this.usuario1=usuario1;
        this.usuario2=usuario2;
        
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
    }
    
    private void llenarCasillas(){
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j]=true;
            }
        }
    }
    
    private void llenarMatriz(){
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=0;
            }
        }
    }
    
    private void dibX(JButton btn) {
        ImageIcon imgX=new ImageIcon(getClass().getResource("/imagenes/x.png"));
        btn.setIcon(new ImageIcon(imgX.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
    }
    
    private void dibO(JButton btn) {
        ImageIcon imgO=new ImageIcon(getClass().getResource("/imagenes/o.png"));
        btn.setIcon(new ImageIcon(imgO.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnUL = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnUR = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnDL = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnDR = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        btnUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULActionPerformed(evt);
            }
        });
        panel.add(btnUL);

        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        panel.add(btnU);

        btnUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURActionPerformed(evt);
            }
        });
        panel.add(btnUR);

        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        panel.add(btnL);

        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        panel.add(btnC);

        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        panel.add(btnR);

        btnDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDLActionPerformed(evt);
            }
        });
        panel.add(btnDL);

        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        panel.add(btnD);

        btnDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDRActionPerformed(evt);
            }
        });
        panel.add(btnDR);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comenzarNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reset.png"))); // NOI18N
        comenzarNuevo.setText("Comenzar de nuevo");
        comenzarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzarNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tabla.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarNuevoActionPerformed
        veces1=0; veces2=0; vecesEmp=0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzarNuevoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
    
    //Botón 1
    private void btnULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULActionPerformed
        if(casilla[0][0]==true){
            if (turno.equals("usuario1")) {
                dibX(btnUL);
                matriz[0][0]=1;
                turno="usuario2";
            } else {
                dibO(btnUL);
                matriz[0][0]=2;
                turno="usuario1";
            }
            casilla[0][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnULActionPerformed

    //Botón 2
    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        if(casilla[0][1]==true){
            if (turno.equals("usuario1")) {
                dibX(btnU);
                matriz[0][1]=1;
                turno="usuario2";
            } else {
                dibO(btnU);
                matriz[0][1]=2;
                turno="usuario1";
            }
            casilla[0][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnUActionPerformed
    
    //Botón 3
    private void btnURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURActionPerformed
        if(casilla[0][2]==true){
            if (turno.equals("usuario1")) {
                dibX(btnUR);
                matriz[0][2]=1;
                turno="usuario2";
            } else {
                dibO(btnUR);
                matriz[0][2]=2;
                turno="usuario1";
            }
            casilla[0][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnURActionPerformed
    
    //Boton 4
    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        if(casilla[1][0]==true){
            if (turno.equals("usuario1")) {
                dibX(btnL);
                matriz[1][0]=1;
                turno="usuario2";
            } else {
                dibO(btnL);
                matriz[1][0]=2;
                turno="usuario1";
            }
            casilla[1][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnLActionPerformed
    
    //Boton 5
    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        if(casilla[1][1]==true){
            if (turno.equals("usuario1")) {
                dibX(btnC);
                matriz[1][1]=1;
                turno="usuario2";
            } else {
                dibO(btnC);
                matriz[1][1]=2;
                turno="usuario1";
            }
            casilla[1][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnCActionPerformed
    
    //Boton 6
    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        if(casilla[1][2]==true){
            if (turno.equals("usuario1")) {
                dibX(btnR);
                matriz[1][2]=1;
                turno="usuario2";
            } else {
                dibO(btnR);
                matriz[1][2]=2;
                turno="usuario1";
            }
            casilla[1][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnRActionPerformed
    
    //Boton 7
    private void btnDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDLActionPerformed
        if(casilla[2][0]==true){
            if (turno.equals("usuario1")) {
                dibX(btnDL);
                matriz[2][0]=1;
                turno="usuario2";
            } else {
                dibO(btnDL);
                matriz[2][0]=2;
                turno="usuario1";
            }
            casilla[2][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnDLActionPerformed

    //Boton 8
    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        if(casilla[2][1]==true){
            if (turno.equals("usuario1")) {
                dibX(btnD);
                matriz[2][1]=1;
                turno="usuario2";
            } else {
                dibO(btnD);
                matriz[2][1]=2;
                turno="usuario1";
            }
            casilla[2][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnDActionPerformed

    private void btnDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDRActionPerformed
        if(casilla[2][2]==true){
            if (turno.equals("usuario1")) {
                dibX(btnDR);
                matriz[2][2]=1;
                turno="usuario2";
            } else {
                dibO(btnDR);
                matriz[2][2]=2;
                turno="usuario1";
            }
            casilla[2][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnDRActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        VentanaMostrarResultados ventRes = new VentanaMostrarResultados(this, true, usuario1, usuario2, veces1, veces2, vecesEmp);
        ventRes.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mundodeportivo.com/uncomo/ocio/articulo/como-jugar-al-tres-en-raya-2442.html"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked
    
    private void comprobarGanador() {
        boolean ganador1, ganador2;
        int casillaEmpate = 0;
        
        //Comprueba ganador
        ganador1=comprobar(1);
        ganador2=comprobar(2);
        
        if (ganador1==true) {
            veces1++;
            VentanaGanador ventG = new VentanaGanador(this, true, usuario1);
            ventG.setVisible(true);
            reiniciarJuego();
            
        } else if (ganador2==true) {
            veces2++;
            VentanaGanador ventG = new VentanaGanador(this, true, usuario2);
            ventG.setVisible(true);
            reiniciarJuego();
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(matriz[i][j]!=0) {
                        casillaEmpate++;
                    }
                }
            }
            if (casillaEmpate==9) {
                vecesEmp++;
                VentanaEmpate ventanaE = new VentanaEmpate(this, true);
                ventanaE.setVisible(true);
                reiniciarJuego();
            } else {
                casillaEmpate=0;
            }
        }  
    }
    
    private boolean comprobar(int num){
        boolean ganador=false;
        
        if (matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num) {
            ganador=true;
        } else if (matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num) {
            ganador=true;
        } else if (matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num) {
            ganador=true;
        } else if (matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num) {
            ganador=true;
        } else if (matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num) {
            ganador=true;
        } else if (matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num) {
            ganador=true;
        } else if (matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num) {
            ganador=true;
        } else if (matriz[0][2]==num && matriz[1][1]==num && matriz[2][0]==num) {
            ganador=true;
        }
        
        return ganador;
    }
    
    private void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        
        btnUL.setIcon(null);
        btnU.setIcon(null);
        btnUR.setIcon(null);
        btnL.setIcon(null);
        btnC.setIcon(null);
        btnR.setIcon(null);
        btnDL.setIcon(null);
        btnD.setIcon(null);
        btnDR.setIcon(null);
        
        quienJuegaPrimero();
    }
    
    private void quienJuegaPrimero() {
        VentanaTurno venTurno = new VentanaTurno(this, true, usuario1, usuario2);
        venTurno.setVisible(true);
        turno=venTurno.getTurno();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDL;
    private javax.swing.JButton btnDR;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnUL;
    private javax.swing.JButton btnUR;
    private javax.swing.JMenuItem comenzarNuevo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
