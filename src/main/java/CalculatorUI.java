public class CalculatorUI extends javax.swing.JFrame {
    private double firstValue = 0;
    private double secondValue=0;
    private double memoryValue=0;
    private String operation = "?";
    private boolean resultClick = false;
    CalcFunctions calcFunc = new CalcFunctions();
    private CalculatorUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanelCalc = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        clearEnd = new javax.swing.JButton();
        cSum = new javax.swing.JButton();
        cMinus = new javax.swing.JButton();
        cMultiply = new javax.swing.JButton();
        cDivide = new javax.swing.JButton();
        result = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        memory = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calc");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanelCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        clearEnd.setText("◄");
        clearEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEndActionPerformed(evt);
            }
        });

        cSum.setText("+");
        cSum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSumActionPerformed(evt);
            }
        });

        cMinus.setText("-");
        cMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMinusActionPerformed(evt);
            }
        });

        cMultiply.setText("*");
        cMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMultiplyActionPerformed(evt);
            }
        });

        cDivide.setText("/");
        cDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDivideActionPerformed(evt);
            }
        });

        result.setText("=");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });

        number6.setText("6");
        number6.setToolTipText("");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });

        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        memory.setText("M");
        memory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryActionPerformed(evt);
            }
        });

        display.setEditable(false);
        display.setName("display");
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanelCalcLayout = new javax.swing.GroupLayout(jPanelCalc);
        jPanelCalc.setLayout(jPanelCalcLayout);
        jPanelCalcLayout.setHorizontalGroup(
                jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCalcLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(display)
                                        .addGroup(jPanelCalcLayout.createSequentialGroup()
                                                .addComponent(cSum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanelCalcLayout.createSequentialGroup()
                                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanelCalcLayout.createSequentialGroup()
                                                                .addComponent(memory, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanelCalcLayout.createSequentialGroup()
                                                                        .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanelCalcLayout.createSequentialGroup()
                                                                        .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanelCalcLayout.createSequentialGroup()
                                                                        .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCalcLayout.createSequentialGroup()
                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(clearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanelCalcLayout.setVerticalGroup(
                jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCalcLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cSum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelCalcLayout.createSequentialGroup()
                                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(memory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void cSumActionPerformed(java.awt.event.ActionEvent evt) {
        if(firstValue==0) firstValue = Double.valueOf(display.getText());
        display.setText("");
        operation = "+";
        resultClick=false;
    }

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"1");
    }

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"2");
    }

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"3");
    }

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"4");
    }

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"5");
    }

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"6");
    }

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"7");
    }

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"8");
    }

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"9");
    }

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+"0");
    }

    private void clearEndActionPerformed(java.awt.event.ActionEvent evt) {
        String temp = display.getText();
        if (temp.equals("") || temp.equals("Incorrect operation") || resultClick==true){
            display.setText("");
            resultClick=false;
        }
        else display.setText(temp.substring(0,temp.length()-1));
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText("");
        resultClick=false;
        firstValue=0;
        secondValue=0;
    }

    private void cMinusActionPerformed(java.awt.event.ActionEvent evt) {
        if(firstValue==0) firstValue = Double.valueOf(display.getText());
        display.setText("");
        operation = "-";
        resultClick=false;
    }

    private void cMultiplyActionPerformed(java.awt.event.ActionEvent evt) {
        if(firstValue==0) firstValue = Double.valueOf(display.getText());
        display.setText("");
        operation = "*";
        resultClick=false;
    }

    private void cDivideActionPerformed(java.awt.event.ActionEvent evt) {
        if(firstValue==0) firstValue = Double.valueOf(display.getText());
        display.setText("");
        operation = "/";
        resultClick=false;
    }

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {

        if(display.getText().equals("")) secondValue=0;
        else if("?".equals(operation)) {
            display.setText("Incorrect operation");
        }
        else secondValue = Double.valueOf(display.getText());

        if("+".equals(operation)){
            double result = calcFunc.summer(firstValue,secondValue);
            display.setText(String.valueOf(result));
            firstValue=result;
            resultClick = true;
        }
        if("-".equals(operation)){
            double result = calcFunc.diff(firstValue,secondValue);
            display.setText(String.valueOf(result));
            firstValue=result;
            resultClick = true;
        }
        if("*".equals(operation)){
            double result = calcFunc.multi(firstValue,secondValue);
            display.setText(String.valueOf(result));
            firstValue=result;
            resultClick = true;
        }
        if("/".equals(operation)){
            double result = calcFunc.divide(firstValue,secondValue);
            display.setText(String.valueOf(result));
            firstValue=result;
            resultClick = true;
        }
        operation = "?";
    }

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.resultClick==true) {
            this.display.setText("");
            this.firstValue=0;
            this.resultClick=false;
        }
        this.display.setText(this.display.getText()+".");
    }

    private void memoryActionPerformed(java.awt.event.ActionEvent evt) {
        if(resultClick==true){
            memoryValue=firstValue;
        }else if (!display.getText().isEmpty()){
            memoryValue=Double.valueOf(display.getText());
        }else if(display.getText().isEmpty()) {
            display.setText(String.valueOf(memoryValue));
        }

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
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton cDivide;
    private javax.swing.JButton cMinus;
    private javax.swing.JButton cMultiply;
    private javax.swing.JButton cSum;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearEnd;
    private javax.swing.JTextField display;
    private javax.swing.JButton dot;
    private javax.swing.JPanel jPanelCalc;
    private javax.swing.JButton memory;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton result;
    // End of variables declaration
}
