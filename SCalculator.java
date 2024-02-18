import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SCalculator {

    private JFrame frame;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Launch the application.
     */
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

    /**
     * Create the application.
     */
    public SCalculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setBounds(200, 100, 565, 565);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField.setForeground(new Color(242, 242, 242));
        textField.setBackground(new Color(53, 53, 53));

        textField.setBounds(55, 69, 589, 65);
        frame.getContentPane().add(textField);
        textField.setColumns(10);



        JButton btnNewButton = new JButton("√");
        btnNewButton.setEnabled(false);
        btnNewButton.addActionListener(e -> {
            double a = Math.sqrt(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnNewButton.setBounds(148, 188, 90, 79);
        btnNewButton.setForeground(new Color(242, 242, 242));
        btnNewButton.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton);

        JButton btnRad = new JButton("Rad");

        btnRad.addActionListener(e -> {
            double radians = Math.toRadians(Double.parseDouble(textField.getText()));
            textField.setText(Double.toString(radians));
        });

        btnRad.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnRad.setForeground(new Color(242, 242, 242));
        btnRad.setBackground(new Color(84, 84, 84, 255));
        btnRad.setBounds(55, 188, 90, 79);

        frame.getContentPane().add(btnRad);




        JButton btnEx = new JButton("e^x");
        btnEx.setEnabled(false);
        btnEx.addActionListener(e -> {
            double a = Math.exp(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnEx.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnEx.setBounds(248, 188, 90, 79);
        btnEx.setForeground(new Color(242, 242, 242));
        btnEx.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnEx);

        JButton btnSin = new JButton("Sin");
        btnSin.setEnabled(false);
        btnSin.addActionListener(e -> {
            double a = Math.sin(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnSin.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnSin.setBounds(348, 188, 90, 79);
        btnSin.setForeground(new Color(242, 242, 242));
        btnSin.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnSin);

        JButton btnCos = new JButton("Cos");
        btnCos.setEnabled(false);
        btnCos.addActionListener(e -> {
            double a = Math.cos(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnCos.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnCos.setBounds(454, 188, 90, 79);
        btnCos.setForeground(new Color(242, 242, 242));
        btnCos.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnCos);

        JButton btnTan = new JButton("Tan");
        btnTan.setEnabled(false);
        btnTan.addActionListener(e -> {
            double a = Math.tan(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnTan.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnTan.setBounds(554, 188, 90, 79);
        btnTan.setBackground(new Color(84, 84, 84));
        btnTan.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(btnTan);

        JButton btnx = new JButton("1/x");
        btnx.setEnabled(false);
        btnx.addActionListener(e -> {
            double a = 1/(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnx.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnx.setBounds(148, 278, 90, 79);
        btnx.setForeground(new Color(242, 242, 242));
        btnx.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnx);

        JButton btnRand = new JButton("Rand");

        btnRand.addActionListener(e -> {
            // Generate random number
            double randNum = Math.random();

            textField.setText(Double.toString(randNum));
        });

        btnRand.setFont(new Font("Tahoma", Font.PLAIN, 24));

// Set bounds relative to frame size
        btnRand.setBounds(55, 278, 90, 79);
        btnRand.setForeground(new Color(242, 242, 242));
        btnRand.setBackground(new Color(84, 84, 84, 255));

        frame.getContentPane().add(btnRand);




        JButton btnNewButton_1_1 = new JButton("Log");
        btnNewButton_1_1.setEnabled(false);
        btnNewButton_1_1.addActionListener(e -> {
            double a = Math.log(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_1.setBounds(248, 278, 90, 79);
        btnNewButton_1_1.setForeground(new Color(242, 242, 242));
        btnNewButton_1_1.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton_1_1);

        JButton btnNewButton_2_1 = new JButton("Sinh");
        btnNewButton_2_1.setEnabled(false);
        btnNewButton_2_1.addActionListener(e -> {
            double a = Math.sinh(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton_2_1.setBounds(348, 278, 90, 79);
        btnNewButton_2_1.setForeground(new Color(242, 242, 242));
        btnNewButton_2_1.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton_2_1);

        JButton btnNewButton_3_1 = new JButton("Cosh");
        btnNewButton_3_1.setEnabled(false);
        btnNewButton_3_1.addActionListener(e -> {
            double a = Math.cosh(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton_3_1.setBounds(454, 278, 90, 79);
        btnNewButton_3_1.setForeground(new Color(242, 242, 242));
        btnNewButton_3_1.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton_3_1);

        JButton btnNewButton_4_1 = new JButton("Tanh");
        btnNewButton_4_1.setEnabled(false);
        btnNewButton_4_1.addActionListener(e -> {
            double a = Math.tanh(Double.parseDouble(textField.getText()));
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnNewButton_4_1.setBounds(554, 278, 90, 79);
        btnNewButton_4_1.setBackground(new Color(84, 84, 84));
        btnNewButton_4_1.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(btnNewButton_4_1);

        JButton btnXy = new JButton("X^Y");
        btnXy.setEnabled(false);
        btnXy.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="X^Y";
        });
        btnXy.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnXy.setBounds(148, 367, 90, 79);
        btnXy.setForeground(new Color(242, 242, 242));
        btnXy.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnXy);

        JButton btnMod = new JButton("Mod");

        btnMod.addActionListener(e -> {
            first = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = "Mod";
        });

        btnMod.setFont(new Font("Tahoma", Font.PLAIN, 29));

// Set bounds relative to frame size
        btnMod.setBounds(55, 367, 90, 79);

        btnMod.setBackground(new Color(84, 84, 84));
        btnMod.setForeground(new Color(255, 255, 255));

        frame.getContentPane().add(btnMod);


        JButton btnNewButton_1_2 = new JButton("%");
        btnNewButton_1_2.setEnabled(false);
        btnNewButton_1_2.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="%";
        });
        btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_2.setBounds(248, 367, 90, 79);
        btnNewButton_1_2.setForeground(new Color(242, 242, 242));
        btnNewButton_1_2.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton_1_2);

        JButton btnNewButton_2_2 = new JButton("C");
        btnNewButton_2_2.setEnabled(false);
        btnNewButton_2_2.addActionListener(e -> textField.setText(null));
        btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_2.setBounds(348, 367, 90, 79);
        btnNewButton_2_2.setForeground(new Color(242, 242, 242));
        btnNewButton_2_2.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton_2_2);

        JButton btnNewButton_3_2 = new JButton("Back");
        btnNewButton_3_2.setEnabled(false);
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
        btnNewButton_3_2.setBounds(454, 367, 90, 79);
        btnNewButton_3_2.setForeground(new Color(242, 242, 242));
        btnNewButton_3_2.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton_3_2);

        JButton btnNewButton_4_2 = new JButton("+");
        btnNewButton_4_2.setEnabled(false);
        btnNewButton_4_2.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="+";
        });
        btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_2.setBounds(554, 367, 90, 79);
        btnNewButton_4_2.setBackground(new Color(255, 102, 0));
        btnNewButton_4_2.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(btnNewButton_4_2);

        JButton btnX = new JButton("X^3");
        btnX.setEnabled(false);
        btnX.addActionListener(e -> {
            double a = (Double.parseDouble(textField.getText()));
            a=a*a*a;
            textField.setText("");
            textField.setText(textField.getText()+a);
        });
        btnX.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnX.setBounds(148, 457, 90, 79);
        btnX.setForeground(new Color(242, 242, 242));
        btnX.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnX);

        JButton btnNewButton_1_3 = new JButton("7");
        btnNewButton_1_3.setEnabled(false);
        btnNewButton_1_3.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_3.getText();
            textField.setText(number);
        });
        btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_3.setBounds(248, 457, 90, 79);
        btnNewButton_1_3.setForeground(new Color(242, 242, 242));
        btnNewButton_1_3.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_1_3);

        JButton btnNewButton_2_3 = new JButton("8");
        btnNewButton_2_3.setEnabled(false);
        btnNewButton_2_3.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_2_3.getText();
            textField.setText(number);
        });
        btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_3.setBounds(348, 457, 90, 79);
        btnNewButton_2_3.setForeground(new Color(242, 242, 242));
        btnNewButton_2_3.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_2_3);

        JButton btnNewButton_3_3 = new JButton("9");
        btnNewButton_3_3.setEnabled(false);
        btnNewButton_3_3.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_3_3.getText();
            textField.setText(number);
        });
        btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_3.setBounds(454, 457, 90, 79);
        btnNewButton_3_3.setForeground(new Color(242, 242, 242));
        btnNewButton_3_3.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_3_3);

        JButton btnNewButton_4_3 = new JButton("-");
        btnNewButton_4_3.setEnabled(false);
        btnNewButton_4_3.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="-";
        });
        btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_3.setBounds(554, 457, 90, 79);
        btnNewButton_4_3.setBackground(new Color(255, 102, 0));
        btnNewButton_4_3.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(btnNewButton_4_3);




        JButton btnNewButton_1_4 = new JButton("4");
        btnNewButton_1_4.setEnabled(false);
        btnNewButton_1_4.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_4.getText();
            textField.setText(number);
        });
        JButton btnX_1 = new JButton("X^2");
        btnX_1.setEnabled(false);

        btnX_1.addActionListener(e -> {
            double a = Double.parseDouble(textField.getText());
            a = a * a;

            textField.setText(String.valueOf(a));
        });

        btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnX_1.setBounds(148, 547, 90, 79);

        btnX_1.setForeground(Color.white);
        btnX_1.setBackground(new Color(84, 84, 84));

        frame.getContentPane().add(btnX_1);
        btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_4.setBounds(248, 547, 90, 79);
        btnNewButton_1_4.setForeground(new Color(242, 242, 242));
        btnNewButton_1_4.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_1_4);

        JButton btnE = new JButton("e");

        btnE.addActionListener(e -> textField.setText(String.valueOf(Math.E)));

        btnE.setFont(new Font("Tahoma", Font.PLAIN, 29));

// Set bounds relative to frame size
        btnE.setBounds(55, 547, 90, 79);

        btnE.setBackground(new Color(84, 84, 84));
        btnE.setForeground(new Color(255, 255, 255));

        frame.getContentPane().add(btnE);


        JButton btnNewButton_2_4 = new JButton("5");
        btnNewButton_2_4.setEnabled(false);
        btnNewButton_2_4.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_2_4.getText();
            textField.setText(number);
        });
        btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_4.setBounds(348, 547, 90, 79);
        btnNewButton_2_4.setForeground(new Color(242, 242, 242));
        btnNewButton_2_4.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_2_4);

        JButton btnNewButton_3_4 = new JButton("6");
        btnNewButton_3_4.setEnabled(false);
        btnNewButton_3_4.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_3_4.getText();
            textField.setText(number);
        });
        btnNewButton_3_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_4.setBounds(454, 547, 90, 79);
        btnNewButton_3_4.setForeground(new Color(242, 242, 242));
        btnNewButton_3_4.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_3_4);

        JButton btnNewButton_4_4 = new JButton("*");
        btnNewButton_4_4.setEnabled(false);
        btnNewButton_4_4.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="*";
        });
        btnNewButton_4_4.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_4.setBounds(554, 547, 90, 79);
        btnNewButton_4_4.setBackground(new Color(255, 102, 0));
        btnNewButton_4_4.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(btnNewButton_4_4);

        JButton btnN = new JButton("n!");
        btnN.setEnabled(false);
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
        btnN.setBounds(148, 639, 90, 79);
        btnN.setForeground(new Color(242, 242, 242));
        btnN.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnN);

        JButton btnNewButton_1_5 = new JButton("1");
        btnNewButton_1_5.setEnabled(false);
        btnNewButton_1_5.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_5.getText();
            textField.setText(number);

        });
        btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_5.setBounds(248, 639, 90, 79);
        btnNewButton_1_5.setForeground(new Color(242, 242, 242));
        btnNewButton_1_5.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_1_5);

        JButton btnNewButton_2_5 = new JButton("2");
        btnNewButton_2_5.setEnabled(false);
        btnNewButton_2_5.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_2_5.getText();
            textField.setText(number);
        });
        btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_2_5.setBounds(348, 639, 90, 79);
        btnNewButton_2_5.setForeground(new Color(242, 242, 242));
        btnNewButton_2_5.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_2_5);

        JButton btnNewButton_3_5 = new JButton("3");
        btnNewButton_3_5.setEnabled(false);
        btnNewButton_3_5.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_3_5.getText();
            textField.setText(number);
        });
        btnNewButton_3_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_5.setBounds(454, 639, 90, 79);
        btnNewButton_3_5.setForeground(new Color(242, 242, 242));
        btnNewButton_3_5.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_3_5);

        JButton btnNewButton_4_5 = new JButton("/");
        btnNewButton_4_5.setEnabled(false);
        btnNewButton_4_5.addActionListener(e -> {
            first=Double.parseDouble(textField.getText());
            textField.setText("");
            operation="/";
        });
        btnNewButton_4_5.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_5.setBounds(554, 639, 90, 79);
        btnNewButton_4_5.setBackground(new Color(255, 102, 0));
        btnNewButton_4_5.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(btnNewButton_4_5);

        JButton btnNewButton_10 = new JButton("+/-");
        btnNewButton_10.setEnabled(false);
        btnNewButton_10.addActionListener(e -> {
            double a= Double.parseDouble(String.valueOf(textField.getText()));
            a=a*(-1);
            textField.setText(String.valueOf(a));
        });
        btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_10.setBounds(148, 732, 90, 79);
        btnNewButton_10.setForeground(new Color(242, 242, 242));
        btnNewButton_10.setBackground(new Color(84, 84, 84, 255));
        frame.getContentPane().add(btnNewButton_10);



        JButton btnPi = new JButton("π");

        btnPi.addActionListener(e -> textField.setText(String.valueOf(Math.PI)));

        btnPi.setFont(new Font("Tahoma", Font.PLAIN, 29));

// Set bounds relative to frame size
        btnPi.setBounds(55, frame.getHeight()-100, 90, 79);

        btnPi.setBackground(new Color(84, 84, 84));
        btnPi.setForeground(new Color(255, 255, 255));

        frame.getContentPane().add(btnPi);


        JButton btnNewButton_1_6 = new JButton("0");
        btnNewButton_1_6.setEnabled(false);
        btnNewButton_1_6.addActionListener(e -> {
            String number = textField.getText()+btnNewButton_1_6.getText();
            textField.setText(number);
        });
        btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_1_6.setBounds(248, 732, 190, 79);
        btnNewButton_1_6.setForeground(new Color(242, 242, 242));
        btnNewButton_1_6.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_1_6);

        JButton btnNewButton_3_6 = new JButton(".");
        btnNewButton_3_6.addActionListener(e -> {
            String currentText = textField.getText();
            // Check if the current text already contains a decimal point
            if (!currentText.contains(".")) {
                textField.setText(currentText + ".");
            }
        });
        btnNewButton_3_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_3_6.setBounds(454, 732, 90, 79);
        btnNewButton_3_6.setForeground(new Color(242, 242, 242));
        btnNewButton_3_6.setBackground(new Color(143, 143, 143, 255));
        frame.getContentPane().add(btnNewButton_3_6);

        JButton btnLn = new JButton("ln");

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
        btnLn.setBounds(55, 647, 90, 79);

        btnLn.setForeground(Color.white);
        btnLn.setBackground(new Color(84, 84, 84));

        frame.getContentPane().add(btnLn);



        JButton btnNewButton_4_6 = new JButton("=");
        btnNewButton_4_6.setEnabled(false);
        btnNewButton_4_6.setBounds(544, 732, 90, 79);
        btnNewButton_4_6.setBackground(new Color(255, 102, 0));
        btnNewButton_4_6.setForeground(new Color(255, 255, 255));
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
        JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
        rdbtnNewRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton.setEnabled(true);
                btnEx.setEnabled(true);
                btnSin.setEnabled(true);
                btnCos.setEnabled(true);
                btnTan.setEnabled(true);
                btnx.setEnabled(true);
                btnNewButton_1_1.setEnabled(true);
                btnNewButton_2_1.setEnabled(true);
                btnNewButton_3_1.setEnabled(true);
                btnNewButton_4_1.setEnabled(true);
                btnXy.setEnabled(true);
                btnNewButton_1_2.setEnabled(true);
                btnNewButton_2_2.setEnabled(true);
                btnNewButton_3_2.setEnabled(true);
                btnNewButton_4_2.setEnabled(true);
                btnX.setEnabled(true);
                btnNewButton_1_3.setEnabled(true);
                btnNewButton_2_3.setEnabled(true);
                btnNewButton_3_3.setEnabled(true);
                btnNewButton_4_3.setEnabled(true);
                btnX_1.setEnabled(true);
                btnNewButton_1_4.setEnabled(true);
                btnNewButton_2_4.setEnabled(true);
                btnNewButton_3_4.setEnabled(true);
                btnNewButton_4_4.setEnabled(true);
                btnN.setEnabled(true);
                btnNewButton_1_5.setEnabled(true);
                btnNewButton_2_5.setEnabled(true);
                btnNewButton_3_5.setEnabled(true);
                btnNewButton_4_5.setEnabled(true);
                btnNewButton_10.setEnabled(true);
                btnNewButton_1_6.setEnabled(true);
                btnNewButton_3_6.setEnabled(true);
                btnNewButton_4_6.setEnabled(true);
            }
        });
        buttonGroup.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.setBackground(new Color(50, 50, 50));
        rdbtnNewRadioButton.setForeground(Color.white);
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        rdbtnNewRadioButton.setBounds(348, 147, 49, 23);
        frame.getContentPane().add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
        rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton.setEnabled(false);
                btnEx.setEnabled(false);
                btnSin.setEnabled(false);
                btnCos.setEnabled(false);
                btnTan.setEnabled(false);
                btnx.setEnabled(false);
                btnNewButton_1_1.setEnabled(false);
                btnNewButton_2_1.setEnabled(false);
                btnNewButton_3_1.setEnabled(false);
                btnNewButton_4_1.setEnabled(false);
                btnXy.setEnabled(false);
                btnNewButton_1_2.setEnabled(false);
                btnNewButton_2_2.setEnabled(false);
                btnNewButton_3_2.setEnabled(false);
                btnNewButton_4_2.setEnabled(false);
                btnX.setEnabled(false);
                btnNewButton_1_3.setEnabled(false);
                btnNewButton_2_3.setEnabled(false);
                btnNewButton_3_3.setEnabled(false);
                btnNewButton_4_3.setEnabled(false);
                btnX_1.setEnabled(false);
                btnNewButton_1_4.setEnabled(false);
                btnNewButton_2_4.setEnabled(false);
                btnNewButton_3_4.setEnabled(false);
                btnNewButton_4_4.setEnabled(false);
                btnN.setEnabled(false);
                btnNewButton_1_5.setEnabled(false);
                btnNewButton_2_5.setEnabled(false);
                btnNewButton_3_5.setEnabled(false);
                btnNewButton_4_5.setEnabled(false);
                btnNewButton_10.setEnabled(false);
                btnNewButton_1_6.setEnabled(false);
                btnNewButton_3_6.setEnabled(false);
                btnNewButton_4_6.setEnabled(false);
            }
        });
        buttonGroup.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.setBackground(new Color(50, 50, 50));
        rdbtnNewRadioButton_1.setForeground(Color.white);
        rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        rdbtnNewRadioButton_1.setBounds(417, 147, 111, 23);
        frame.getContentPane().add(rdbtnNewRadioButton_1);

        btnNewButton_4_6.setFont(new Font("Tahoma", Font.PLAIN, 29));
        btnNewButton_4_6.setBounds(554, 732, 90, 79);
        frame.getContentPane().add(btnNewButton_4_6);
    }
}
