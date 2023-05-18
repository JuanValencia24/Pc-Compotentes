package Principal;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JhonPava
 */
public class JFramePrincipal extends javax.swing.JFrame {

    ArrayList<Persona> personas;
    DefaultTableModel modelo;

    ArrayList<Equipo> equipos;
    DefaultTableModel modelo2;
    DefaultTableModel modelo3;

    public JFramePrincipal() {
        initComponents();
        personas = new ArrayList();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        mostrarDatosPersona();

        equipos = new ArrayList();
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("ID EQUIPO");
        modelo2.addColumn("MODELO");
        modelo2.addColumn("PROBLEMAS");
        modelo2.addColumn("ESTADO");
        modelo2.addColumn("ID PERSONA");

        modelo3 = new DefaultTableModel();
        modelo3.addColumn("ID EQUIPO");
        modelo3.addColumn("MODELO");
        modelo3.addColumn("PROBLEMAS");
        modelo3.addColumn("ESTADO");
        modelo3.addColumn("ID PERSONA");

    }

    public void mostrarDatosEquipos() {
        modelo2.setNumRows(equipos.size());
        for (int i = 0; i < equipos.size(); i++) {
            modelo2.setValueAt(equipos.get(i).getIdeEquip(), i, 0);
            modelo2.setValueAt(equipos.get(i).getModelo(), i, 1);
            modelo2.setValueAt(equipos.get(i).getProblemas(), i, 2);
            modelo2.setValueAt(equipos.get(i).getEstado(), i, 3);
            modelo2.setValueAt(equipos.get(i).getIdePerson(), i, 4);
            llenarComboBoxPersona();
        }
        jTDatosE.setModel(modelo2);
        mostrarDatosEquiposInventario();
    }

    public void mostrarDatosEquiposInventario() {
        modelo3.setNumRows(equipos.size());
        for (int i = 0; i < equipos.size(); i++) {
            modelo3.setValueAt(equipos.get(i).getIdeEquip(), i, 0);
            modelo3.setValueAt(equipos.get(i).getModelo(), i, 1);
            modelo3.setValueAt(equipos.get(i).getProblemas(), i, 2);
            modelo3.setValueAt(equipos.get(i).getEstado(), i, 3);
            modelo3.setValueAt(equipos.get(i).getIdePerson(), i, 4);
        }
        jTinventario.setModel(modelo3);

    }

    public void mostrarUnEquipo() {

        if (jbuscar.getText().equals("")) {
            mostrarDatosEquiposInventario();
        } else {
            int cont = 0;
            limpiarTabla();
            modelo3.setNumRows(equipos.size());
            for (int i = 0; i < equipos.size(); i++) {
                if (equipos.get(i).IdeEquip.equals(jbuscar.getText()) || equipos.get(i).IdePerson.equals(jbuscar.getText())) {
                    modelo3.setValueAt(equipos.get(i).getIdeEquip(), cont, 0);
                    modelo3.setValueAt(equipos.get(i).getModelo(), cont, 1);
                    modelo3.setValueAt(equipos.get(i).getProblemas(), cont, 2);
                    modelo3.setValueAt(equipos.get(i).getEstado(), cont, 3);
                    modelo3.setValueAt(equipos.get(i).getIdePerson(), cont, 4);
                    cont++;
                }
            }
            jTinventario.setModel(modelo3);
        }

    }

    public void mostrarDatosPersona() {
        modelo.setNumRows(personas.size());
        for (int i = 0; i < personas.size(); i++) {
            modelo.setValueAt(personas.get(i).getCodigo(), i, 0);
            modelo.setValueAt(personas.get(i).getNombre(), i, 1);
            modelo.setValueAt(personas.get(i).getApellido(), i, 2);
            llenarComboBoxPersona();
        }
        jtdatos.setModel(modelo);
    }

    public void llenarComboBoxPersona() {
        jcidpersona.removeAllItems();
        for (int i = 0; i < personas.size(); i++) {
            jcidpersona.addItem(personas.get(i).codigo);
        }
    }

    private void limpiarTabla() {

        for (int i = 0; i < jTinventario.getRowCount(); i++) {
            modelo3.removeRow(i);
            i -= 1;
        }

    }

    public static boolean validarNumero(String datos) {
        return datos.matches("[0-9]*");
    }

    public static boolean validarLetra(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txnombre = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        txapellido = new java.awt.TextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtdatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTproblemas = new javax.swing.JTextArea();
        jTidequipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTmodelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcestado = new javax.swing.JComboBox<>();
        jcidpersona = new javax.swing.JComboBox<>();
        btnGuardarE = new javax.swing.JButton();
        btnModificarE = new javax.swing.JButton();
        btnBorrarE = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTDatosE = new javax.swing.JTable();
        btnCancelar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jbuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTinventario = new javax.swing.JTable();
        btnCancelar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("SALIR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("USUARIO");

        txtidentificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentificacionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CODIGO:");

        txnombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("APELLIDO:");

        txapellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txapellidoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("GUARDAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtdatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(45, 45, 45)
                                .addComponent(btnModificar)
                                .addGap(51, 51, 51)
                                .addComponent(btnEliminar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)))))
                .addGap(0, 68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCancelar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("REGISTRAR PERSONA", jPanel1);

        jTproblemas.setColumns(20);
        jTproblemas.setRows(5);
        jScrollPane2.setViewportView(jTproblemas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID EQUIPO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("MODELO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("PROBLEMAS:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ESTADO:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("PERSONA ID:");

        jcestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAÑADO", "REPARACION", "BUENO" }));
        jcestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcestadoActionPerformed(evt);
            }
        });

        jcidpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcidpersonaActionPerformed(evt);
            }
        });

        btnGuardarE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarE.setText("GUARDAR");
        btnGuardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEActionPerformed(evt);
            }
        });

        btnModificarE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarE.setText("MODIFICAR");
        btnModificarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEActionPerformed(evt);
            }
        });

        btnBorrarE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBorrarE.setText("ELIMINAR");
        btnBorrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEActionPerformed(evt);
            }
        });

        jTDatosE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTDatosE);

        btnCancelar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar1.setText("SALIR");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jTidequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(12, 12, 12)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(114, 114, 114)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel8))
                                        .addComponent(jLabel9))
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcestado, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(77, 77, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnGuardarE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarE)
                .addGap(208, 208, 208)
                .addComponent(btnBorrarE)
                .addGap(137, 137, 137))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTidequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jcidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarE)
                    .addComponent(btnModificarE)
                    .addComponent(btnGuardarE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("REGISTRAR EQUIPO", jPanel2);

        jLabel10.setText("BUSCAR POR ID PERSONA O ID COMPUTADOR :");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTinventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTinventario);

        btnCancelar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar2.setText("SALIR");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jLabel10)
                            .addGap(29, 29, 29)
                            .addComponent(jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(btnBuscar))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCancelar2)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("IINVENTARIO", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
       if (txnombre.getText().equals("") || txapellido.getText().equals("") || txtidentificacion.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS SOLICITADOS");
        } else {
            if (!validarNumero(txtidentificacion.getText().trim()) || !validarLetra(txapellido.getText().trim()) || !validarLetra(txnombre.getText().trim())) {
                JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS SON INCORRECTOS");
            } else {

                Persona p = new Persona();
                p.setCodigo(txtidentificacion.getText());
                p.setNombre(txnombre.getText());
                p.setApellido(txapellido.getText());
                personas.add(p);

                txnombre.setText("");
                txapellido.setText("");
                txtidentificacion.setText("");
                mostrarDatosPersona();

            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnombreActionPerformed


    }//GEN-LAST:event_txnombreActionPerformed


    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (jtdatos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL REGISTRO PARA MODIFICAR");
        } else {
            MenuModificarPerson jfModificarPers = new MenuModificarPerson(personas.get(jtdatos.getSelectedRow()), this);
            jfModificarPers.setVisible(true);

        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void jcestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcestadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (jtdatos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL REGISTRO PARA ELIMINAR");
        } else {
            personas.remove(jtdatos.getSelectedRow());
            mostrarDatosPersona();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBorrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEActionPerformed
        if (jTDatosE.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL REGISTRO PARA ELIMINAR");
        } else {
            equipos.remove(jTDatosE.getSelectedRow());
            mostrarDatosEquipos();
        }
    }//GEN-LAST:event_btnBorrarEActionPerformed

    private void btnModificarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEActionPerformed
        if (jTDatosE.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL REGISTRO PARA MODIFICAR");
        } else {
            MenuModificarEquip jfModificarEquip = new MenuModificarEquip(equipos.get(jTDatosE.getSelectedRow()), this);
            jfModificarEquip.setVisible(true);

        }
    }//GEN-LAST:event_btnModificarEActionPerformed

    private void jcidpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcidpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcidpersonaActionPerformed

    private void btnGuardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEActionPerformed
        
       
            System.out.println("verga "+jcidpersona.getSelectedIndex());
  
        if (jTmodelo.getText().equals("") || jTidequipo.getText().equals("") || jTproblemas.getText().equals("") || jcidpersona.getSelectedIndex()<0) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS SOLICITADOS");
        } else {
            if(!validarNumero(jTidequipo.getText().trim())){
                JOptionPane.showMessageDialog(null, "LA ID DE EQUIPO SOLO PERMITE NUMEROS");
            }else{
                
                Equipo e = new Equipo();
                e.setModelo(jTmodelo.getText());
                e.setIdeEquip(jTidequipo.getText());
                e.setProblemas(jTproblemas.getText());
                e.setEstado(jcestado.getSelectedItem().toString());
                e.setIdePerson(jcidpersona.getSelectedItem().toString());
                equipos.add(e);

                jTmodelo.setText("");
                jTidequipo.setText("");
                jTproblemas.setText("");

                mostrarDatosEquipos();

            }
            
        }
    }//GEN-LAST:event_btnGuardarEActionPerformed

    private void txtidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentificacionActionPerformed

    private void txapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txapellidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        mostrarUnEquipo();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelar2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarE;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarE;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarE;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTDatosE;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTidequipo;
    private javax.swing.JTable jTinventario;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTextArea jTproblemas;
    private javax.swing.JTextField jbuscar;
    private javax.swing.JComboBox<String> jcestado;
    private javax.swing.JComboBox<String> jcidpersona;
    private javax.swing.JTable jtdatos;
    private java.awt.TextField txapellido;
    private java.awt.TextField txnombre;
    private javax.swing.JTextField txtidentificacion;
    // End of variables declaration//GEN-END:variables

}