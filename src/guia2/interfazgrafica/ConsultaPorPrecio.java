
package guia2.interfazgrafica;

import static guia2.interfazgrafica.DeTodoSA.productos;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;


public class ConsultaPorPrecio extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ConsultaPorPrecio() {
        initComponents();
        configurarTable();
        cargarProductos();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxDesde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxHasta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbArticulos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Listado por Precio");

        jLabel2.setText("Entre $");

        jtxDesde.setText("0.00");
        jtxDesde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxDesdeFocusGained(evt);
            }
        });
        jtxDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxDesdeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxDesdeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxDesdeKeyTyped(evt);
            }
        });

        jLabel3.setText("y");

        jtxHasta.setText("0.00");
        jtxHasta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxHastaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxHastaFocusLost(evt);
            }
        });
        jtxHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxHastaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxHastaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxHastaKeyTyped(evt);
            }
        });

        jtbArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbArticulos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtbArticulosFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtbArticulos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(153, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtxHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxDesdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxDesdeKeyTyped
        char caracter = evt.getKeyChar(); // Convierte la tecla precionada en un caracter y luego los compara con los que siquiero que se cargen!!
        if (((caracter < '0' || caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.' || jtxDesde.getText().contains("."))){
            evt.consume();
        }
    }//GEN-LAST:event_jtxDesdeKeyTyped

    private void jtxHastaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxHastaKeyTyped
        char caracter = evt.getKeyChar(); // Convierte la tecla precionada en un caracter y luego los compara con los que siquiero que se cargen!!
        if (((caracter < '0' || caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.' || jtxHasta.getText().contains("."))){
            evt.consume();
        }
    }//GEN-LAST:event_jtxHastaKeyTyped

    private void jtxHastaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxHastaFocusGained
        jtxHasta.selectAll();
    }//GEN-LAST:event_jtxHastaFocusGained

    private void jtxDesdeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxDesdeFocusGained
        jtxDesde.selectAll();
    }//GEN-LAST:event_jtxDesdeFocusGained

    private void jtbArticulosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtbArticulosFocusGained
        jtxDesde.requestFocus();
    }//GEN-LAST:event_jtbArticulosFocusGained

    private void jtxHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxHastaKeyPressed
        //filtrarTabla();
    }//GEN-LAST:event_jtxHastaKeyPressed

    private void jtxDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxDesdeKeyPressed
        //filtrarTabla();
    }//GEN-LAST:event_jtxDesdeKeyPressed

    private void jtxHastaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxHastaFocusLost
        //filtrarTabla();
    }//GEN-LAST:event_jtxHastaFocusLost

    private void jtxDesdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxDesdeKeyReleased
        filtrarTabla();
    }//GEN-LAST:event_jtxDesdeKeyReleased

    private void jtxHastaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxHastaKeyReleased
        filtrarTabla();
    }//GEN-LAST:event_jtxHastaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbArticulos;
    private javax.swing.JTextField jtxDesde;
    private javax.swing.JTextField jtxHasta;
    // End of variables declaration//GEN-END:variables
    private void configurarTable(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtbArticulos.setModel(modelo);
    }
    private void cargarProductos(){
        modelo.setRowCount(0); // Borra todas las filas
        for (Articulos producto : productos) {
            modelo.addRow(new Object[]{
                producto.getCodigo() + "",
                producto.getDescripcion(),
                producto.getPrecio() + "",
                producto.getStock() + ""});
        }
    }
    private void filtrarTabla() {
        if (!jtxDesde.getText().toString().isEmpty() && !jtxHasta.getText().toString().isEmpty()) {
            modelo.setRowCount(0); // Borra todas las filas
            for (Articulos producto : productos) {
                if (producto.getPrecio() >= Double.parseDouble(jtxDesde.getText()) && producto.getPrecio() <= Double.parseDouble(jtxHasta.getText())) {
                    modelo.addRow(new Object[]{
                        producto.getCodigo() + "",
                        producto.getDescripcion(),
                        producto.getPrecio() + "",
                        producto.getStock() + ""});
                }
            }
        }
    }

}
