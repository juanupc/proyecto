
package formularios;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import logica.cls_servicio;

/**
 *
 * @author juana
 */
public class frm_servicios extends javax.swing.JFrame {

    int num = 0;
    
    private final cls_servicio CP;
    
    public frm_servicios() {
        initComponents();
           CP = new cls_servicio();
           listar();
           this.setLocationRelativeTo(null);
    }
    
    private void listar(){
        jtb_datos.setModel(CP.getDatos());
    }
    
    private void limpiar(){
        jtf_idconductor.setText("");
        jtf_nombreconductor.setText("");
        jtf_placavehiculo.setText("");
        jtf_codigoverificacion.setText("");
        jtf_idcliente.setText("");
        jtf_nombrecliente.setText("");
        jtf_valordelservicio.setText("");
        jtf_acumuladodeldia.setText("");
        jtf_dinerocliente.setText("");
        jtf_valordelservicio1.setText("");
    }
    
    private void guardar() {     
        String idcon = jtf_idconductor.getText();
        String ncon = jtf_nombreconductor.getText();
        String pveh = jtf_placavehiculo.getText();
        int cver = Integer.parseInt(jtf_codigoverificacion.getText());
        int idcl = Integer.parseInt(jtf_idcliente.getText());
        String ncl = jtf_nombrecliente.getText();
        int vser = Integer.parseInt(jtf_valordelservicio.getText());
        int adia = Integer.parseInt(jtf_acumuladodeldia.getText());
      
        if( num == 0 ){
            int respuesta = CP.insertDatos(idcon, ncon, pveh, cver, idcl, ncl, vser, adia);
               if (respuesta > 0){
                    listar();
                        limpiar();
        } 
        } else {
            int respuesta = CP.updateDatos(idcon, ncon, pveh, cver, idcl, ncl, vser, adia);
                     if (respuesta > 0){
                        listar();
                        limpiar();
                }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_idconductor = new javax.swing.JTextField();
        jtf_nombreconductor = new javax.swing.JTextField();
        jtf_placavehiculo = new javax.swing.JTextField();
        jtf_codigoverificacion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_idcliente = new javax.swing.JTextField();
        jtf_nombrecliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtf_valordelservicio = new javax.swing.JTextField();
        jtf_acumuladodeldia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_datos = new javax.swing.JTable();
        jbt_guardar = new javax.swing.JButton();
        jbt_eliminar = new javax.swing.JButton();
        jcb_buscar = new javax.swing.JComboBox<>();
        jtf_buscar = new javax.swing.JTextField();
        jbt_nuevo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtf_dinerocliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtf_valordelservicio1 = new javax.swing.JTextField();
        jtf_vueltos = new javax.swing.JTextField();
        jbt_vueltos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 180, 26));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Servicio de taxi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(244, 180, 26));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Datos conductor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID conductor");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre conductor");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Placa vehiculo");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Codigo verificacion");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));

        jtf_idconductor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jtf_idconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_idconductorActionPerformed(evt);
            }
        });

        jtf_nombreconductor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jtf_placavehiculo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jtf_codigoverificacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jtf_codigoverificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_codigoverificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_placavehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jtf_nombreconductor)
                    .addComponent(jtf_idconductor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_codigoverificacion))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_idconductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_nombreconductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_placavehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_codigoverificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(244, 180, 26));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Datos precio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("ID cliente");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText("Nombre cliente");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_nombrecliente, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jtf_idcliente))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(244, 180, 26));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Datos precio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setText("Valor del servicio");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel9.setText("Acumulado del dia");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_valordelservicio)
                    .addComponent(jtf_acumuladodeldia))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_valordelservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_acumuladodeldia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtb_datos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 61, 89)));
        jtb_datos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jtb_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtb_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_datos);

        jbt_guardar.setBackground(new java.awt.Color(244, 180, 26));
        jbt_guardar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jbt_guardar.setText("Guardar");
        jbt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_guardarActionPerformed(evt);
            }
        });

        jbt_eliminar.setBackground(new java.awt.Color(244, 180, 26));
        jbt_eliminar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jbt_eliminar.setText("Eliminar");
        jbt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_eliminarActionPerformed(evt);
            }
        });

        jcb_buscar.setBackground(new java.awt.Color(244, 180, 26));
        jcb_buscar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jcb_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Conductor", "Codigo de verificacion" }));

        jtf_buscar.setFont(new java.awt.Font("Lucida Bright", 2, 14)); // NOI18N
        jtf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_buscarKeyReleased(evt);
            }
        });

        jbt_nuevo.setBackground(new java.awt.Color(244, 180, 26));
        jbt_nuevo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jbt_nuevo.setText("Nuevo");
        jbt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_nuevoActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(244, 180, 26));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Calculadora", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel11.setText("Dinero cliente");
        jLabel11.setBorder(new javax.swing.border.MatteBorder(null));

        jtf_dinerocliente.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel12.setText("Valor del servicio");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        jtf_valordelservicio1.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jtf_valordelservicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_valordelservicio1ActionPerformed(evt);
            }
        });

        jtf_vueltos.setEditable(false);
        jtf_vueltos.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N

        jbt_vueltos.setBackground(new java.awt.Color(244, 180, 26));
        jbt_vueltos.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jbt_vueltos.setText("Vueltos");
        jbt_vueltos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbt_vueltosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbt_vueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_valordelservicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jtf_dinerocliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_vueltos))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_dinerocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_valordelservicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_vueltos)
                    .addComponent(jbt_vueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbt_guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt_eliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jcb_buscar, 0, 199, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.getAccessibleContext().setAccessibleName("Datos cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_idconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_idconductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_idconductorActionPerformed

    private void jbt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_jbt_guardarActionPerformed

    private void jtf_codigoverificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_codigoverificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_codigoverificacionActionPerformed

    private void jbt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_eliminarActionPerformed
        int fila = jtb_datos.getSelectedRowCount();
        if (fila < 1){
            JOptionPane.showMessageDialog(null,"Seleccione un registro de la tabla...");
        } else {
           if (CP.deleteDatos(jtb_datos.getValueAt(jtb_datos.getSelectedRow(), 0).toString()) > 0) {
            limpiar();
            listar();
        }}
    }//GEN-LAST:event_jbt_eliminarActionPerformed

    private void jtf_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarKeyReleased
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER){
            
            jtb_datos.setModel(CP.getDato(jcb_buscar.getSelectedIndex(), jtf_buscar.getText()));
        }
    }//GEN-LAST:event_jtf_buscarKeyReleased

    private void jtb_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_datosMouseClicked
    
        int row = jtb_datos.getSelectedRow();
        
        jtf_idconductor.setText(jtb_datos.getValueAt(row, 0).toString());
        jtf_nombreconductor.setText(jtb_datos.getValueAt(row, 1).toString());
        jtf_placavehiculo.setText(jtb_datos.getValueAt(row, 2).toString());
        jtf_codigoverificacion.setText(jtb_datos.getValueAt(row, 3).toString());
        jtf_idcliente.setText(jtb_datos.getValueAt(row, 4).toString());
        jtf_nombrecliente.setText(jtb_datos.getValueAt(row, 5).toString());
        jtf_valordelservicio.setText(jtb_datos.getValueAt(row, 6).toString());
        jtf_acumuladodeldia.setText(jtb_datos.getValueAt(row, 7).toString());
        
        num = 1;
        
    }//GEN-LAST:event_jtb_datosMouseClicked

    private void jbt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_nuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_jbt_nuevoActionPerformed

    private void jtf_valordelservicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_valordelservicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_valordelservicio1ActionPerformed

    private void jbt_vueltosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbt_vueltosMouseClicked
       
        int dcli,vser1,vueltos;
        
        dcli = Integer.parseInt(jtf_dinerocliente.getText());
        vser1 = Integer.parseInt(jtf_valordelservicio1.getText());
        
        vueltos = dcli - vser1;
        
        jtf_vueltos.setText(String.valueOf(vueltos));
        limpiar();
    }//GEN-LAST:event_jbt_vueltosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_eliminar;
    private javax.swing.JButton jbt_guardar;
    private javax.swing.JButton jbt_nuevo;
    private javax.swing.JButton jbt_vueltos;
    private javax.swing.JComboBox<String> jcb_buscar;
    private javax.swing.JTable jtb_datos;
    private javax.swing.JTextField jtf_acumuladodeldia;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_codigoverificacion;
    private javax.swing.JTextField jtf_dinerocliente;
    private javax.swing.JTextField jtf_idcliente;
    private javax.swing.JTextField jtf_idconductor;
    private javax.swing.JTextField jtf_nombrecliente;
    private javax.swing.JTextField jtf_nombreconductor;
    private javax.swing.JTextField jtf_placavehiculo;
    private javax.swing.JTextField jtf_valordelservicio;
    private javax.swing.JTextField jtf_valordelservicio1;
    private javax.swing.JTextField jtf_vueltos;
    // End of variables declaration//GEN-END:variables

}
