package gui;

import logica.Calculadora;

/**
 *
 * @author Josue Dario Alfaro
 */
public class Pantalla extends javax.swing.JFrame {
    Calculadora calcu;

    public Pantalla() {
        initComponents();
        calcu= new Calculadora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_AC = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_x = new javax.swing.JButton();
        btn_s = new javax.swing.JButton();
        btn_r = new javax.swing.JButton();
        btn_d = new javax.swing.JButton();
        txt_monitor = new javax.swing.JTextField();
        txt_simbolo = new javax.swing.JTextField();
        btn_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_AC.setText("AC");
        btn_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ACActionPerformed(evt);
            }
        });

        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_x.setText("*");
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });

        btn_s.setText("+");
        btn_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sActionPerformed(evt);
            }
        });

        btn_r.setText("-");
        btn_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rActionPerformed(evt);
            }
        });

        btn_d.setText("/");
        btn_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dActionPerformed(evt);
            }
        });

        txt_monitor.setEditable(false);
        txt_monitor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_simbolo.setEditable(false);
        txt_simbolo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_monitor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_AC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_s, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addComponent(btn_r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_simbolo))
                    .addComponent(btn_d, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(txt_simbolo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_r)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_1)
                            .addComponent(btn_3)
                            .addComponent(btn_2)
                            .addComponent(btn_x))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_4)
                            .addComponent(btn_6)
                            .addComponent(btn_5)
                            .addComponent(btn_s))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_7)
                            .addComponent(btn_9)
                            .addComponent(btn_8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AC)
                            .addComponent(btn_0)
                            .addComponent(btn_d)
                            .addComponent(btn_igual))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        calcu.agregarDigito(9); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        calcu.agregarDigito(1); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sActionPerformed
        txt_simbolo.setText("+");
        calcu.iniciarSegundoOperando(); // Cambia al segundo operando
    }//GEN-LAST:event_btn_sActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        txt_simbolo.setText("*");
        calcu.iniciarSegundoOperando(); // Cambia al segundo operando
    }//GEN-LAST:event_btn_xActionPerformed

    private void btn_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rActionPerformed
    txt_simbolo.setText("-");
    calcu.iniciarSegundoOperando(); // Cambia al segundo operando

    }//GEN-LAST:event_btn_rActionPerformed

    private void btn_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dActionPerformed
    txt_simbolo.setText("/");
    calcu.iniciarSegundoOperando(); // Cambia al segundo operando

    }//GEN-LAST:event_btn_dActionPerformed

    private void btn_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ACActionPerformed
    calcu.reiniciar();
    txt_monitor.setText("0"); 
    txt_simbolo.setText("");
    }//GEN-LAST:event_btn_ACActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        calcu.agregarDigito(2); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        calcu.agregarDigito(3); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        calcu.agregarDigito(4); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        calcu.agregarDigito(5); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        calcu.agregarDigito(6); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        calcu.agregarDigito(7); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        calcu.agregarDigito(8); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        calcu.agregarDigito(0); // Agrega el dígito al operando actual
        if (!txt_simbolo.getText().isEmpty() && calcu.getN2() != 0) {
            txt_monitor.setText(String.valueOf(calcu.getN2())); // Muestra el segundo operando
        } else {
            txt_monitor.setText(String.valueOf(calcu.getN1())); // Muestra el primer operando
        }
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        String operador = txt_simbolo.getText();
        if (!operador.isEmpty()) {
            calcu.realizarOperacion(operador);
            txt_monitor.setText(String.valueOf(calcu.getResultado()));
            txt_simbolo.setText(""); // Limpia el símbolo
        }
    }//GEN-LAST:event_btn_igualActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_AC;
    private javax.swing.JButton btn_d;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_r;
    private javax.swing.JButton btn_s;
    private javax.swing.JButton btn_x;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_monitor;
    private javax.swing.JTextField txt_simbolo;
    // End of variables declaration//GEN-END:variables
}
