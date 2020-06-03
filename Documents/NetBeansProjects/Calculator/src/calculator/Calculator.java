
package calculator;


public class Calculator extends javax.swing.JFrame {
    
    private int flag; //to know after operator which no. is pressed first
    private int count=0; //to count how many times dot is pressed
    private double data1=0.0,data2=0.0; //to store values entered 
    boolean isOperatorPressed=false;
    boolean isEqualPressed=false; 
    private int flagOperator=0; //1->plus 2->minus 3->multiply 4->divide
    private int countEntry=0; //to know which operator is pressed first

    
    public Calculator() {
        initComponents();
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bdelete = new javax.swing.JButton();
        bce = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        bsign = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        display = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        b2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setPreferredSize(new java.awt.Dimension(290, 310));
        setResizable(false);

        bdelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bdelete.setText("DEL");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        bce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bce.setText("CE");
        bce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });

        bc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        bsign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bsign.setText("+/-");
        bsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsignActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bdiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bmul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bmul.setText("*");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bminus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bminus.setText("-");
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bdot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        bplus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bplus.setText("+");
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });

        bequal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });

        display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setText("0");
        display.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(b5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bce, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(b2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bplus, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLayeredPane1)
                                .addGap(234, 234, 234))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bsign))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bmul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bdiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(119, 119, 119))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdelete)
                    .addComponent(bce)
                    .addComponent(bc)
                    .addComponent(bsign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9)
                    .addComponent(bdiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(bmul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b3)
                            .addComponent(b2)
                            .addComponent(bminus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b0)
                            .addComponent(bdot)
                            .addComponent(bplus)
                            .addComponent(bequal))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
       flag++;
        if(display.getText().equals("0") || display.getText().equals("Error")){
           ; //do nothing
       }
        else if(isOperatorPressed && flag==1){
           display.setText("0");
       }
          else{
           display.setText(display.getText()+"0");
          }
    }//GEN-LAST:event_b0ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        count++;
        if(display.getText().equals("Error")) { ; }
        else if(count==1){
            if(isOperatorPressed && flag==0){
                display.setText("0.");
                flag++;
            }
            else { display.setText(display.getText()+"."); flag++; }
        }
        else { ; }
    }//GEN-LAST:event_bdotActionPerformed

    private void bsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsignActionPerformed
        if(display.getText().equals("0") || display.getText().equals("Error")){
           ; //do nothing
       }
        else if(Double.parseDouble(display.getText())>0.0){
            display.setText("-"+display.getText());
        }
        else if(Double.parseDouble(display.getText())<0.0){
            int length=display.getText().length();
            display.setText(display.getText().substring(1,length));
        }
    }//GEN-LAST:event_bsignActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        if(display.getText().equals("0") || display.getText().equals("Error")){
           ; //do nothing
       }
        else{
            String number = display.getText(); //to store the number
            int length = display.getText().length();
            display.setText(display.getText().substring(0,length-1));
            
            //to set 0 when everything is dlt
            if(display.getText().equals("")){
                display.setText("0");
                if(isOperatorPressed && isEqualPressed==false){
                 flag=0;
                }
                else if(isEqualPressed){
                    flag=0; isOperatorPressed=false; 
                    flagOperator=0; countEntry=0;
                } 
                else{
                    flag=0; isOperatorPressed=false; isEqualPressed=false;
                    flagOperator=0; countEntry=0;
                }
            }
            
            //to make sure dot is dlt and count=0
            if(display.getText().indexOf(".")==-1){
                count=0;
            }
        } 
    }//GEN-LAST:event_bdeleteActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1 ){
            display.setText("1");
        }
        else{
            display.setText(display.getText()+"1");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("2");
        }
        else{
            display.setText(display.getText()+"2");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("3");
        }
        else{
            display.setText(display.getText()+"3");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("4");
        }
        else{
            display.setText(display.getText()+"4");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("5");
        }
        else{
            display.setText(display.getText()+"5");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
         flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("6");
        }
        else{
            display.setText(display.getText()+"6");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
         flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("7");
        }
        else{
            display.setText(display.getText()+"7");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("8");
        }
        else{
            display.setText(display.getText()+"8");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        flag++;
        if(display.getText()=="Error") { ; }
        else if(display.getText().equals("0") || flag==1){
            display.setText("9");
        }
        else{
            display.setText(display.getText()+"9");
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusActionPerformed
        countEntry++;
        if(flag==0) { ; } //multiple clicks should have no effect
        else{
        if(isOperatorPressed==false){
            data1=Double.parseDouble(display.getText());
        }
        if(isEqualPressed) { 
            data1=Double.parseDouble(display.getText());
            data2=0.0;
        }
        if(countEntry==1) { data1=data1+data2; }
        else if(isEqualPressed==false){
            data2=Double.parseDouble(display.getText());
        switch(flagOperator){
            case 1:
                data1=data1+data2;
                break;
            case 2:
                data1=data1-data2;
                break;
            case 3:
                data1=data1*data2;
                break;
            case 4:
                data1=data1/data2;
                if(data2==0.0){
                    display.setText("Error");
                }
                break;
        }
        }
        }
         count=0;
         isOperatorPressed=true;
         isEqualPressed=false;
        flagOperator=1;
        flag=0;
    }//GEN-LAST:event_bplusActionPerformed

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminusActionPerformed
         countEntry++;
         if(flag==0) { ; }
         else{
        if(isOperatorPressed==false){
            data1=Double.parseDouble(display.getText());
        }
        if(isEqualPressed) { 
            data1=Double.parseDouble(display.getText());
            data2=0.0;
        }
        if(countEntry==1) { data1=data1-data2; }
        else if(isEqualPressed==false){
            data2=Double.parseDouble(display.getText());
        switch(flagOperator){
            case 1:
                data1=data1+data2;
                break;
            case 2:
                data1=data1-data2;
                break;
            case 3:
                data1=data1*data2;
                break;
            case 4:
                data1=data1/data2;
                 if(data2==0.0){
                    display.setText("Error");
                }
                break;
        }
        }
        }
         count=0;
         isOperatorPressed=true;
         isEqualPressed=false;
        flagOperator=2;
        flag=0;
    }//GEN-LAST:event_bminusActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
         countEntry++;
         if(flag==0) { ; }
         else{
        if(isOperatorPressed==false){
            data1=Double.parseDouble(display.getText());
        }
        if(isEqualPressed) { 
            data1=Double.parseDouble(display.getText());
            data2=0.0;
        }
        if(countEntry==1) { data1=data1*1; }
        else if(isEqualPressed==false){
            data2=Double.parseDouble(display.getText());
        switch(flagOperator){
            case 1:
                data1=data1+data2;
                break;
            case 2:
                data1=data1-data2;
                break;
            case 3:
                data1=data1*data2;
                break;
            case 4:
                data1=data1/data2;
                 if(data2==0.0){
                    display.setText("Error");
                }
                break;
        }
        }
        }
         count=0;
         isOperatorPressed=true;
         isEqualPressed=false;
        flagOperator=3;
        flag=0;
    }//GEN-LAST:event_bmulActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
        countEntry++;
        if(flag==0) { ; }
        else{
        if(isOperatorPressed==false){
            data1=Double.parseDouble(display.getText());
        }
        if(isEqualPressed) { 
            data1=Double.parseDouble(display.getText());
            data2=0.0;
        }
        if(countEntry==1) { data1=data1/1; }
        else if(isEqualPressed==false){
            data2=Double.parseDouble(display.getText());
        switch(flagOperator){
            case 1:
                data1=data1+data2;
                break;
            case 2:
                data1=data1-data2;
                break;
            case 3:
                data1=data1*data2;
                break;
            case 4:
                data1=data1/data2;
                 if(data2==0.0){
                    display.setText("Error");
                }
                break;
        }
        }
        }
         count=0;
         isOperatorPressed=true;
         isEqualPressed=false;
        flagOperator=4;
        flag=0;
    }//GEN-LAST:event_bdivActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
        isEqualPressed=true;
        int length=display.getText().length();
        if(isOperatorPressed){
            if(flag>0) { data2=Double.parseDouble(display.getText()); }
            if(countEntry==1 && flag==0){
            switch(flagOperator){
            case 1:
                data1=data1+data1;
                if(data1==Math.floor(data1)){
                    int intData1= (int)data1;
                    display.setText(Integer.toString(intData1));
                }
                else {display.setText(Double.toString(data1));}
                break;
            case 2:
                data1=data1-data1;
                if(data1==Math.floor(data1)){
                    int intData1= (int)data1;
                    display.setText(Integer.toString(intData1));
                }
                else {display.setText(Double.toString(data1));}
                break;
            case 3:
                data1=data1*data1;
                if(data1==Math.floor(data1)){
                    int intData1= (int)data1;
                    display.setText(Integer.toString(intData1));
                }
                else {display.setText(Double.toString(data1));}
                break;
            case 4:
                data1=data1/data1;
                if(data1==0.0){
                    display.setText("Error");
                }
                if(data1==Math.floor(data1)){
                    int intData1= (int)data1;
                    display.setText(Integer.toString(intData1));
                }
                else {display.setText(Double.toString(data1));}
                break;
        }
        }
            else{
                 switch(flagOperator){
                      case 1:
                         data1=data1+data2;
                         if(data1==Math.floor(data1)){
                          int intData1= (int)data1;
                          display.setText(Integer.toString(intData1));
                         }
                         else {display.setText(Double.toString(data1));}
                         break;
                      case 2:
                         data1=data1-data2;
                         if(data1==Math.floor(data1)){
                          int intData1= (int)data1;
                          display.setText(Integer.toString(intData1));
                         }
                         else {display.setText(Double.toString(data1));}
                         break;
                      case 3:
                         data1=data1*data2;
                         if(data1==Math.floor(data1)){
                           int intData1= (int)data1;
                           display.setText(Integer.toString(intData1));
                         }
                         else {display.setText(Double.toString(data1));}
                         break;
                      case 4:
                         if(data2==0.0){
                             display.setText("Error");
                             break;
                         }
                          data1=data1/data2;
                         if(data1==Math.floor(data1)){
                          int intData1= (int)data1;
                          display.setText(Integer.toString(intData1));
                         }
                         else {display.setText(Double.toString(data1));}
                         break;
                    }
            }
            isOperatorPressed=false; countEntry=0;
        }
         
        
        else{
            if(length==1){
            char ch=display.getText().charAt(0);
            switch(ch){
                case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                    ;
                    break;
            }
        }
        }
            
    }//GEN-LAST:event_bequalActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        display.setText("0");
        flag=0; count=0; isOperatorPressed=false; isEqualPressed=false;
        flagOperator=0; countEntry=0; data1=0.0; data2=0.0;
    }//GEN-LAST:event_bcActionPerformed

    private void bceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bceActionPerformed
        if(isOperatorPressed && isEqualPressed==false){
            display.setText("0");
            flag=0;
        }
        else { ; }
    }//GEN-LAST:event_bceActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Calculator calci = new Calculator();
                calci.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bce;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bplus;
    private javax.swing.JButton bsign;
    private javax.swing.JLabel display;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
