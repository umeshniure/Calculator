/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Umesh
 */
public class Calculator extends javax.swing.JFrame {

    private String value;
    double number, answer, num, percentvalue;
    char calculate;

    /**
     * Creates new form Calculator2
     */
    public Calculator() {
        value = "";
        initComponents();
    }

    public void playSound3() {
        try {
            File sound = new File("C:\\Users\\Umesh\\OneDrive\\Documents\\NetBeansProjects\\Calculator\\src\\Sound\\click3.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void playSound2() {
        try {
            File sound = new File("C:\\Users\\Umesh\\OneDrive\\Documents\\NetBeansProjects\\Calculator\\src\\Sound\\click2.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void operation() {
        switch (calculate) {
            case '+':
                if (percentvalue != 0) {
                    answer = number + percentvalue;
                } else {
                    answer = number + Double.parseDouble(output.getText());
                }
                output.setText(Double.toString(answer));
                value = "";
                break;
            case '-':
                if (percentvalue != 0) {
                    answer = number - percentvalue;
                } else {
                    answer = number - Double.parseDouble(output.getText());
                }
                output.setText(Double.toString(answer));
                value = "";
                break;
            case 'x':
                if (percentvalue != 0) {
                    answer = number * percentvalue;
                } else {
                    answer = number * Double.parseDouble(output.getText());
                }
                output.setText(Double.toString(answer));
                value = "";
                break;
            case '÷':
                if (percentvalue != 0) {
                    answer = number / percentvalue;
                } else {
                    answer = number / Double.parseDouble(output.getText());
                }
                output.setText(Double.toString(answer));
                value = "";
                break;
        }
    }

    public void on() {
        value = "";
        onoff.setText("OFF");
        output.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        zero.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        multiply.setEnabled(true);
        divide.setEnabled(true);
        decimal.setEnabled(true);
        clear.setEnabled(true);
        back.setEnabled(true);
        plusminus.setEnabled(true);
        percent.setEnabled(true);
        equals.setEnabled(true);
    }

    public void off() {
        output.setText("");
        onoff.setText("ON");
        output.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        zero.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        multiply.setEnabled(false);
        divide.setEnabled(false);
        decimal.setEnabled(false);
        clear.setEnabled(false);
        back.setEnabled(false);
        plusminus.setEnabled(false);
        percent.setEnabled(false);
        equals.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zero = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        onoff = new javax.swing.JToggleButton();
        divide = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zero.setBackground(new java.awt.Color(153, 153, 153));
        zero.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(51, 51, 51));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        plusminus.setBackground(new java.awt.Color(153, 153, 153));
        plusminus.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        plusminus.setForeground(new java.awt.Color(51, 51, 51));
        plusminus.setText("+\\-");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        output.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        output.setText("0");

        onoff.setText("OFF");
        onoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoffActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(255, 204, 153));
        divide.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        divide.setForeground(new java.awt.Color(0, 51, 0));
        divide.setText("÷");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 51, 51));
        clear.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        back.setText("DEL");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        percent.setBackground(new java.awt.Color(255, 204, 153));
        percent.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        percent.setForeground(new java.awt.Color(0, 51, 0));
        percent.setText("%");
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(255, 204, 153));
        multiply.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        multiply.setForeground(new java.awt.Color(0, 51, 0));
        multiply.setText("x");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(255, 204, 153));
        plus.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(0, 51, 0));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(255, 204, 153));
        minus.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(0, 51, 0));
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(153, 153, 153));
        one.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        one.setForeground(new java.awt.Color(51, 51, 51));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(153, 153, 153));
        two.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        two.setForeground(new java.awt.Color(51, 51, 51));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(153, 153, 153));
        three.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        three.setForeground(new java.awt.Color(51, 51, 51));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(153, 153, 153));
        four.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        four.setForeground(new java.awt.Color(51, 51, 51));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(153, 153, 153));
        five.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        five.setForeground(new java.awt.Color(51, 51, 51));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(153, 153, 153));
        six.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        six.setForeground(new java.awt.Color(51, 51, 51));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(153, 153, 153));
        seven.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(51, 51, 51));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(153, 153, 153));
        eight.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        eight.setForeground(new java.awt.Color(51, 51, 51));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        decimal.setBackground(new java.awt.Color(153, 153, 153));
        decimal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        decimal.setForeground(new java.awt.Color(51, 51, 51));
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(153, 153, 153));
        nine.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(51, 51, 51));
        nine.setText("9");
        nine.setBorder(null);
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(255, 204, 153));
        equals.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        equals.setForeground(new java.awt.Color(0, 51, 0));
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(onoff))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(onoff)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "0");
        value = output.getText();
    }//GEN-LAST:event_zeroActionPerformed

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
        // TODO add your handling code here:
        playSound2();
        if (Double.parseDouble(value) > 0) {
            value = Double.toString(-(Double.parseDouble(value)));
            output.setText(value);
        } else if (Double.parseDouble(value) < 0) {
            value = Double.toString(-(Double.parseDouble(value)));
            output.setText(value);
        } else {
            output.setText(value);
        }
    }//GEN-LAST:event_plusminusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        // TODO add your handling code here:
        playSound2();
        number = Double.parseDouble(output.getText());
        value = "";
        calculate = '÷';
    }//GEN-LAST:event_divideActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        playSound2();
        value = "";
        calculate = 0;
        output.setText("0");
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        playSound2();
        if (output.getText().substring(0, output.getText().length() - 1) == "") {
            value = "";
            output.setText("0");
        } else {
            output.setText(output.getText().substring(0, output.getText().length() - 1));
            value = output.getText();
        }

    }//GEN-LAST:event_backActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        // TODO add your handling code here:
        playSound2();
        num = Double.parseDouble(output.getText());
        percentvalue = (num / 100) * number;
    }//GEN-LAST:event_percentActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        // TODO add your handling code here:
        playSound2();
        number = Double.parseDouble(output.getText());
        value = "";
        calculate = 'x';
    }//GEN-LAST:event_multiplyActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        playSound2();
        number = Double.parseDouble(output.getText());
        value = "";
        calculate = '+';
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
        playSound2();
        number = Double.parseDouble(output.getText());
        value = "";
        calculate = '-';

    }//GEN-LAST:event_minusActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "1");
        value = output.getText();
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "2");
        value = output.getText();
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "3");
        value = output.getText();
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "4");
        value = output.getText();
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "5");
        value = output.getText();
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "6");
        value = output.getText();
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "7");
        value = output.getText();
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "8");
        value = output.getText();
    }//GEN-LAST:event_eightActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        // TODO add your handling code here:
        playSound2();
        try {
            int str = Integer.parseInt((output.getText()));
            if (((Object) str).getClass().getSimpleName() != "Double") {
                output.setText(value + ".");
                value = output.getText();
            }
        } catch (Exception e) {
            // throw new NumberFormatException("You cannot enter more than one decimal point.");
            System.out.println("You cannot enter more than one decimal point.");
        }
    }//GEN-LAST:event_decimalActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        playSound2();
        output.setText(value + "9");
        value = output.getText();
    }//GEN-LAST:event_nineActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        // TODO add your handling code here:
        playSound2();
        operation();
    }//GEN-LAST:event_equalsActionPerformed

    private void onoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoffActionPerformed
        // TODO add your handling code here:
        if (onoff.isSelected()) {
            playSound3();
            off();
        } else {
            on();
        }
    }//GEN-LAST:event_onoffActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimal;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JToggleButton onoff;
    private javax.swing.JTextField output;
    private javax.swing.JButton percent;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
