import javax.swing.*;
import java.awt.*;



public class SCalculator {

    private JFrame frame;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SCalculator window = new SCalculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

   
    public SCalculator() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setBounds(0, 0, 820, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 45));
        textField.setForeground(new Color(242, 242, 242));
        textField.setBackground(new Color(53, 53, 53));
        textField.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        textField.setHorizontalAlignment(JTextField.RIGHT);
                textField.setBounds(0, 0, 810, 75);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnYthRoot = new JButton("Y√x");
        btnYthRoot.setEnabled(true);
        btnYthRoot.addActionListener(e -> {
            double num = Double.parseDouble(textField.getText());
            double y = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of y:")); // Prompt user for y
            double result = Math.pow(num, 1.0 / y); 
            textField.setText(""); 
            textField.setText(textField.getText() + result);
        });
        btnYthRoot.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnYthRoot.setBounds(0, 312, 90, 79);
        btnYthRoot.setForeground(new Color(242, 242, 242));
        btnYthRoot.setBackground(new Color(84, 84, 84, 255));
        btnYthRoot.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnYthRoot);

        JButton btnTenToX = new JButton("10^x");
        btnTenToX.setEnabled(true);
        btnTenToX.addActionListener(e -> {
            double x = Double.parseDouble(textField.getText());
            double result = Math.pow(10, x); 
            textField.setText(""); 
            textField.setText(textField.getText() + result);
        });
        btnTenToX.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnTenToX.setBounds(0, 233, 90, 79);
        btnTenToX.setForeground(new Color(242, 242, 242));
        btnTenToX.setBackground(new Color(84, 84, 84, 255));
        btnTenToX.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnTenToX);

        JButton btnBlank = new JButton("");
        btnBlank.setEnabled(true);
        btnBlank.addActionListener(e -> {

        });
        btnBlank.setBounds(0, 75, 90, 79);
        btnBlank.setForeground(new Color(84, 84, 84));
        btnBlank.setBackground(new Color(84, 84, 84, 255));
        btnBlank.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnBlank);


        JButton btnCubeRoot = new JButton("3√"); 
        btnCubeRoot.setEnabled(true);
        btnCubeRoot.addActionListener(e -> {
            double num = Double.parseDouble(textField.getText());
            double result = Math.cbrt(num); 
            textField.setText(""); 
            textField.setText(textField.getText() + result);
        });
        btnCubeRoot.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnCubeRoot.setBounds(0, 391, 90, 79);
        btnCubeRoot.setForeground(new Color(242, 242, 242));
        btnCubeRoot.setBackground(new Color(84, 84, 84, 255));
        btnCubeRoot.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnCubeRoot);


        JButton btnNewButton = new JButton("√");
        btnNewButton.setEnabled(true);
        btnNewButton.addActionListener(e -> {
            double a = Math.sqrt(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnNewButton.setBounds(180, 154, 90, 79);
        btnNewButton.setForeground(new Color(242, 242, 242));
        btnNewButton.setBackground(new Color(84, 84, 84, 255));
       btnNewButton.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton);

        JButton btnRad = new JButton("Rad");
        btnRad.setEnabled(true);
        btnRad.addActionListener(e -> {
            double radians = Math.toRadians(Double.parseDouble(textField.getText()));
            textField.setText(Double.toString(radians));
        });

        btnRad.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnRad.setForeground(new Color(242, 242, 242));
        btnRad.setBackground(new Color(84, 84, 84, 255));
        btnRad.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        btnRad.setBounds(180, 75, 90, 79);

        frame.getContentPane().add(btnRad);




        JButton btnEx = new JButton("e^x");
        btnEx.setEnabled(true);
        btnEx.addActionListener(e -> {
            double a = Math.exp(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnEx.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnEx.setBounds(180, 233, 90, 79);
        btnEx.setForeground(new Color(242, 242, 242));
        btnEx.setBackground(new Color(84, 84, 84, 255));
     btnEx.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnEx);

        JButton btnSin = new JButton("Sin");
        btnSin.setEnabled(true);
        btnSin.addActionListener(e -> {
            double a = Math.sin(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnSin.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnSin.setBounds(180, 312, 90, 79);
        btnSin.setForeground(new Color(242, 242, 242));
        btnSin.setBackground(new Color(84, 84, 84, 255));
        btnSin.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnSin);

        JButton btnCos = new JButton("Cos");
        btnCos.setEnabled(true);
        btnCos.addActionListener(e -> {
            double a = Math.cos(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnCos.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnCos.setBounds(180, 391, 90, 79);
        btnCos.setForeground(new Color(242, 242, 242));
        btnCos.setBackground(new Color(84, 84, 84, 255));
        btnCos.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnCos);

        JButton btnTan = new JButton("Tan");
        btnTan.setEnabled(true);
        btnTan.addActionListener(e -> {
            double a = Math.tan(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnTan.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnTan.setBounds(270, 391, 90, 79);
        btnTan.setBackground(new Color(84, 84, 84));
        btnTan.setForeground(new Color(255, 255, 255));
       btnTan.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnTan);

        JButton btnx = new JButton("1/x");
        btnx.setEnabled(true);
        btnx.addActionListener(e -> {
            double a = 1/(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnx.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnx.setBounds(90, 75, 90, 79);
        btnx.setForeground(new Color(242, 242, 242));
        btnx.setBackground(new Color(84, 84, 84, 255));
        btnx.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnx);

        JButton btnRand = new JButton("Rand");
        btnRand.setEnabled(true);
        btnRand.addActionListener(e -> {
          
            double randNum = Math.random();

            textField.setText(Double.toString(randNum));
        });

        btnRand.setFont(new Font("Tahoma", Font.PLAIN, 24));


        btnRand.setBounds(0, 154, 90, 79);
        btnRand.setForeground(new Color(242, 242, 242));
        btnRand.setBackground(new Color(84, 84, 84, 255));
        btnRand.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));

        frame.getContentPane().add(btnRand);




        JButton btnNewButton_1_1 = new JButton("Log");
        btnNewButton_1_1.setEnabled(true);
        btnNewButton_1_1.addActionListener(e -> {
            double a = Math.log(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_1.setBounds(90, 154, 90, 79);
        btnNewButton_1_1.setForeground(new Color(242, 242, 242));
        btnNewButton_1_1.setBackground(new Color(84, 84, 84, 255));
        btnNewButton_1_1.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_1_1);

        JButton btnNewButton_2_1 = new JButton("Sinh");
        btnNewButton_2_1.setEnabled(true);
        btnNewButton_2_1.addActionListener(e -> {
            double a = Math.sinh(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton_2_1.setBounds(90, 233, 90, 79);
        btnNewButton_2_1.setForeground(new Color(242, 242, 242));
        btnNewButton_2_1.setBackground(new Color(84, 84, 84, 255));
        btnNewButton_2_1.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_2_1);

        JButton btnNewButton_3_1 = new JButton("Cosh");
        btnNewButton_3_1.setEnabled(true);
        btnNewButton_3_1.addActionListener(e -> {
            double a = Math.cosh(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton_3_1.setBounds(90, 312, 90, 79);
        btnNewButton_3_1.setForeground(new Color(242, 242, 242));
        btnNewButton_3_1.setBackground(new Color(84, 84, 84, 255));
        btnNewButton_3_1.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_3_1);

        JButton btnNewButton_4_1 = new JButton("Tanh");
        btnNewButton_4_1.setEnabled(true);
        btnNewButton_4_1.addActionListener(e -> {
            double a = Math.tanh(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnNewButton_4_1.setBounds(90, 391, 90, 79);
        btnNewButton_4_1.setBackground(new Color(84, 84, 84));
        btnNewButton_4_1.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_4_1);

        JButton btnXy = new JButton("X^Y");
        btnXy.setEnabled(true);
        btnXy.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="X^Y";
        });
        btnXy.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnXy.setBounds(360, 75, 90, 79);
        btnXy.setForeground(new Color(242, 242, 242));
        btnXy.setBackground(new Color(84, 84, 84, 255));
        btnXy.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnXy);

        JButton btnMod = new JButton("Mod");
        btnMod.setEnabled(true);
        btnMod.addActionListener(e -> {
            first = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = "Mod";
        });

        btnMod.setFont(new Font("Tahoma", Font.PLAIN, 29));


        btnMod.setBounds(270, 75, 90, 79);

        btnMod.setBackground(new Color(84, 84, 84));
        btnMod.setForeground(new Color(255, 255, 255));
        btnMod.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));

        frame.getContentPane().add(btnMod);


        JButton btnNewButton_1_2 = new JButton("%");
        btnNewButton_1_2.setEnabled(true);
        btnNewButton_1_2.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="%";
        });
        btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_2.setBounds(450, 75, 90, 79);
        btnNewButton_1_2.setForeground(new Color(242, 242, 242));
        btnNewButton_1_2.setBackground(new Color(84, 84, 84, 255));
        btnNewButton_1_2.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_1_2);

        JButton btnNewButton_2_2 = new JButton("C");
        btnNewButton_2_2.setEnabled(true);
        btnNewButton_2_2.addActionListener(e -> textField.setText(null));
        btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_2.setBounds(540, 75, 90, 79);
        btnNewButton_2_2.setForeground(new Color(242, 242, 242));
        btnNewButton_2_2.setBackground(new Color(84, 84, 84, 255));
        btnNewButton_2_2.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_2_2);

        JButton btnNewButton_3_2 = new JButton("Back");
        btnNewButton_3_2.setEnabled(true);
        btnNewButton_3_2.addActionListener(e -> {
            String backSpace=null;
            if(textField.getText().length()>0) {
                StringBuilder str= new StringBuilder(textField.getText());
                str.deleteCharAt(textField.getText().length()-1);
                backSpace= str.toString();
                textField.setText(backSpace);
            }
        });
        btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton_3_2.setBounds(630, 75, 90, 79);
        btnNewButton_3_2.setForeground(new Color(242, 242, 242));
        btnNewButton_3_2.setBackground(new Color(84, 84, 84, 255));
        btnNewButton_3_2.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_3_2);

        JButton btnNewButton_4_2 = new JButton("+");
        btnNewButton_4_2.setEnabled(true);
        btnNewButton_4_2.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="+";
        });
        btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_2.setBounds(720, 75, 90, 79);
        btnNewButton_4_2.setBackground(new Color(255, 102, 0));
        btnNewButton_4_2.setForeground(new Color(255, 255, 255));
        btnNewButton_4_2.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_4_2);

        JButton btnX = new JButton("X^3");
        btnX.setEnabled(true);
        btnX.addActionListener(e -> {
            double a = (Double.parseDouble(textField.getText()));
            a=a*a*a;
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnX.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnX.setBounds(360, 154, 90, 79);
        btnX.setForeground(new Color(242, 242, 242));
        btnX.setBackground(new Color(84, 84, 84, 255));
        btnX.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnX);

        JButton btnNewButton_1_3 = new JButton("7");
        btnNewButton_1_3.setEnabled(true);
        btnNewButton_1_3.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_3.getText();
            textField.setText(number);
        });
        btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_3.setBounds(450, 154, 90, 79);
        btnNewButton_1_3.setForeground(new Color(242, 242, 242));
        btnNewButton_1_3.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_1_3.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_1_3);

        JButton btnNewButton_2_3 = new JButton("8");
        btnNewButton_2_3.setEnabled(true);
        btnNewButton_2_3.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_2_3.getText();
            textField.setText(number);
        });
        btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_3.setBounds(540, 154, 90, 79);
        btnNewButton_2_3.setForeground(new Color(242, 242, 242));
        btnNewButton_2_3.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_2_3.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_2_3);

        JButton btnNewButton_3_3 = new JButton("9");
        btnNewButton_3_3.setEnabled(true);
        btnNewButton_3_3.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_3_3.getText();
            textField.setText(number);
        });
        btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_3.setBounds(630, 154, 90, 79);
        btnNewButton_3_3.setForeground(new Color(242, 242, 242));
        btnNewButton_3_3.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_3_3.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_3_3);

        JButton btnNewButton_4_3 = new JButton("-");
        btnNewButton_4_3.setEnabled(true);
        btnNewButton_4_3.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="-";
        });
        btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_3.setBounds(720, 154, 90, 79);
        btnNewButton_4_3.setBackground(new Color(255, 102, 0));
        btnNewButton_4_3.setForeground(new Color(255, 255, 255));
        btnNewButton_4_3.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_4_3);




        JButton btnNewButton_1_4 = new JButton("4");
        btnNewButton_1_4.setEnabled(true);
        btnNewButton_1_4.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_4.getText();
            textField.setText(number);
        });
        JButton btnX_1 = new JButton("X^2");
        btnX_1.setEnabled(true);

        btnX_1.addActionListener(e -> {
            double a = Double.parseDouble(textField.getText());
            a = a * a;

            textField.setText(String.valueOf(a));
        });

        btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnX_1.setBounds(360, 233, 90, 79);

        btnX_1.setForeground(Color.white);
        btnX_1.setBackground(new Color(84, 84, 84));
        btnX_1.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));

        frame.getContentPane().add(btnX_1);
        btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_4.setBounds(450, 233, 90, 79);
        btnNewButton_1_4.setForeground(new Color(242, 242, 242));
        btnNewButton_1_4.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_1_4.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_1_4);

        JButton btnE = new JButton("e");
        btnE.setEnabled(true);
        btnE.addActionListener(e -> textField.setText(String.valueOf(Math.E)));

        btnE.setFont(new Font("Tahoma", Font.PLAIN, 29));


        btnE.setBounds(270, 233, 90, 79);

        btnE.setBackground(new Color(84, 84, 84));
        btnE.setForeground(new Color(255, 255, 255));
        btnE.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));

        frame.getContentPane().add(btnE);


        JButton btnNewButton_2_4 = new JButton("5");
        btnNewButton_2_4.setEnabled(true);
        btnNewButton_2_4.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_2_4.getText();
            textField.setText(number);
        });
        btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_4.setBounds(540, 233, 90, 79);
        btnNewButton_2_4.setForeground(new Color(242, 242, 242));
        btnNewButton_2_4.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_2_4.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_2_4);

        JButton btnNewButton_3_4 = new JButton("6");
        btnNewButton_3_4.setEnabled(true);
        btnNewButton_3_4.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_3_4.getText();
            textField.setText(number);
        });
        btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_4.setBounds(630, 233, 90, 79);
        btnNewButton_3_4.setForeground(new Color(242, 242, 242));
        btnNewButton_3_4.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_3_4.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_3_4);

        JButton btnNewButton_4_4 = new JButton("*");
        btnNewButton_4_4.setEnabled(true);
        btnNewButton_4_4.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="*";
        });
        btnNewButton_4_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_4.setBounds(720, 233, 90, 79);
        btnNewButton_4_4.setBackground(new Color(255, 102, 0));
        btnNewButton_4_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4_4.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_4_4);

        JButton btnN = new JButton("n!");
        btnN.setEnabled(true);
        btnN.addActionListener(e -> {
            double a=Double.parseDouble(textField.getText());
            double fact =1;
            while(a!=0) {
                fact=fact*a;
                a--;
            }
            textField.setText("");
            textField.setText(textField.getText()+fact);
        });
        btnN.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnN.setBounds(360, 312, 90, 79);
        btnN.setForeground(new Color(242, 242, 242));
        btnN.setBackground(new Color(84, 84, 84, 255));
        btnN.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnN);

        JButton btnNewButton_1_5 = new JButton("1");
        btnNewButton_1_5.setEnabled(true);
        btnNewButton_1_5.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_5.getText();
            textField.setText(number);

        });
        btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_5.setBounds(450, 312, 90, 79);
        btnNewButton_1_5.setForeground(new Color(242, 242, 242));
        btnNewButton_1_5.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_1_5.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_1_5);

        JButton btnNewButton_2_5 = new JButton("2");
        btnNewButton_2_5.setEnabled(true);
        btnNewButton_2_5.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_2_5.getText();
            textField.setText(number);
        });
        btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_5.setBounds(540, 312, 90, 79);
        btnNewButton_2_5.setForeground(new Color(242, 242, 242));
        btnNewButton_2_5.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_2_5.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_2_5);

        JButton btnNewButton_3_5 = new JButton("3");
        btnNewButton_3_5.setEnabled(true);
        btnNewButton_3_5.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_3_5.getText();
            textField.setText(number);
        });
        btnNewButton_3_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_5.setBounds(630, 312, 90, 79);
        btnNewButton_3_5.setForeground(new Color(242, 242, 242));
        btnNewButton_3_5.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_3_5.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_3_5);

        JButton btnNewButton_4_5 = new JButton("/");
        btnNewButton_4_5.setEnabled(true);
        btnNewButton_4_5.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="/";
        });
        btnNewButton_4_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_5.setBounds(720, 312, 90, 79);
        btnNewButton_4_5.setBackground(new Color(255, 102, 0));
        btnNewButton_4_5.setForeground(new Color(255, 255, 255));
        btnNewButton_4_5.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_4_5);

        JButton btnNewButton_10 = new JButton("+/-");
        btnNewButton_10.setEnabled(true);
        btnNewButton_10.addActionListener(e -> {
            double a= Double.parseDouble(String.valueOf(textField.getText()));
            a=a*(-1);
            textField.setText(String.valueOf(a));
        });
        btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_10.setBounds(360, 391, 90, 79);
        btnNewButton_10.setForeground(new Color(242, 242, 242));
        btnNewButton_10.setBackground(new Color(84, 84, 84, 255));
        btnNewButton_10.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_10);



        JButton btnPi = new JButton("π");
        btnPi.setEnabled(true);
        btnPi.addActionListener(e -> textField.setText(String.valueOf(Math.PI)));

        btnPi.setFont(new Font("Tahoma", Font.PLAIN, 29));

        btnPi.setBounds(270, 154, 90, 79);

        btnPi.setBackground(new Color(84, 84, 84));
        btnPi.setForeground(new Color(255, 255, 255));
        btnPi.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));

        frame.getContentPane().add(btnPi);


        JButton btnNewButton_1_6 = new JButton("0");
        btnNewButton_1_6.setEnabled(true);
        btnNewButton_1_6.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_6.getText();
            textField.setText(number);
        });
        btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_6.setBounds(450, 391, 180, 79);
        btnNewButton_1_6.setForeground(new Color(242, 242, 242));
        btnNewButton_1_6.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_1_6.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_1_6);

        JButton btnNewButton_3_6 = new JButton(".");
        btnNewButton_3_6.setEnabled(true);
        btnNewButton_3_6.addActionListener(e -> {
            String currentText = textField.getText();
         
            if (!currentText.contains(".")) {
                textField.setText(currentText + ".");
            }
        });
        btnNewButton_3_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_6.setBounds(630, 391, 90, 79);
        btnNewButton_3_6.setForeground(new Color(242, 242, 242));
        btnNewButton_3_6.setBackground(new Color(143, 143, 143, 255));
        btnNewButton_3_6.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        frame.getContentPane().add(btnNewButton_3_6);

        JButton btnLn = new JButton("ln");
        btnLn.setEnabled(true);
        btnLn.addActionListener(e -> {
            try {
                double num = Double.parseDouble(textField.getText());

                if(num <= 0) {
                    System.err.println("Cannot take ln of a non-positive number");
                } else {
                    double result = Math.log(num);
                    textField.setText(String.valueOf(result));
                }
            } catch (NumberFormatException ex) {
                System.err.println("Invalid input: " + ex.getMessage());
            }
        });

        btnLn.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnLn.setBounds(270, 312, 90, 79);

        btnLn.setForeground(Color.white);
        btnLn.setBackground(new Color(84, 84, 84));
        btnLn.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));

        frame.getContentPane().add(btnLn);



        JButton btnNewButton_4_6 = new JButton("=");
        btnNewButton_4_6.setEnabled(true);
        btnNewButton_4_6.setBounds(720, 391, 90, 79);
        btnNewButton_4_6.setBackground(new Color(255, 102, 0));
        btnNewButton_4_6.setForeground(new Color(255, 255, 255));
        btnNewButton_4_6.setBorder(BorderFactory. createLineBorder(new Color(53, 53, 53)));
        btnNewButton_4_6.addActionListener(e -> {
            second=Double.parseDouble(textField.getText());
            if(operation=="+") {
                result = first + second;
                answer= String.format("%.2f", result);
                textField.setText(answer);
            }
            else if(operation=="-") {
                result = first - second;
                answer= String.format("%.2f", result);
                textField.setText(answer);
            }
            else if(operation=="*") {
                result = first * second;
                answer= String.format("%.2f", result);
                textField.setText(answer);
            }
            else if(operation=="/") {
                result = first / second;
                answer= String.format("%.2f", result);
                textField.setText(answer);
            }
            else if(operation=="%") {
                result = first % second;
                answer= String.format("%.2f", result);
                textField.setText(answer);
            }
            else if(operation=="X^Y") {
                double resultt=1;
                for(int i=0;i<second;i++) {
                    resultt = first * resultt;

                }
                answer= String.format("%.2f", resultt);
                textField.setText(answer);
            }
        });



        btnNewButton_4_6.setFont(new Font("Tahoma", Font.PLAIN, 29));

        frame.getContentPane().add(btnNewButton_4_6);
    }
}
