package javaProj;

import javax.swing.*;

public class Cookie extends JPanel {

   int size;
   String map[][];

   public Cookie(int size) {
      this.size = size;
      map = new String[size][size];
      this.setLayout(null);
      this.setBounds(0, 0, 600, 600);

   }

}