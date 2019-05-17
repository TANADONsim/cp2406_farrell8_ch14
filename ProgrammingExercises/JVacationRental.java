import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener{

    final  int  BASE_PRICE_PARK  =  600;
    final  int  POOL_PREMIUM  =  150;
    final  int  LAKE_PREMIUM  =  225;
    final  int  TWO_ROOM_PREMIUM  =  75;
    final  int  THREE_ROOMS_PREMIUM  =  150;
    final  int  MEALS  =  200;
    int totalPrice = BASE_PRICE_PARK;

    JCheckBox  poolBox  =  new  JCheckBox
            ("Pool Room  premium  $"  +  POOL_PREMIUM,  false);
    JCheckBox  lakeBox  =  new  JCheckBox
            ("Lake Room  premium  $"  +  LAKE_PREMIUM,  false);
    JCheckBox  twoBox  =  new  JCheckBox
            ("Two Room  premium  $"  +  TWO_ROOM_PREMIUM,  false);
    JCheckBox  threeBox  =  new  JCheckBox
            ("Three Room  premium  $"  +  THREE_ROOMS_PREMIUM,  false);
    JCheckBox  mealsBox  =  new  JCheckBox
            ("Meals included  $"  +  MEALS,  false);

    JLabel  resortLabel  =  new  JLabel ("Lambert's Vacation Rentals");
    JLabel  ePrice  =  new  JLabel("The  price  for  your  stay  is");
    JTextField  totPrice  =  new  JTextField(6);
    JLabel  optionExplainLabel  =  new  JLabel
            ("The base price for a Park Room is $" +  BASE_PRICE_PARK  +  ".");
    JLabel  optionExplainLabel2  =  new  JLabel ("Check  the  options  you  want.");

    public JVacationRental()
    {
        super("Price Estimator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new  FlowLayout());
        add(resortLabel);
        add(optionExplainLabel);
        add(optionExplainLabel2);
        add(poolBox);
        add(lakeBox);
        add(twoBox);
        add(threeBox);
        add(mealsBox);
        add(ePrice);
        add(totPrice);

        totPrice.setText("$"  +  totalPrice);
        poolBox.addItemListener(this);
        lakeBox.addItemListener(this);
        twoBox.addItemListener(this);
        threeBox.addItemListener(this);
        mealsBox.addItemListener(this);
    }

    public  void  itemStateChanged(ItemEvent  event)
    {
        Object  source  =  event.getSource();
        int  select  =  event.getStateChange();

        //selection for room locations
        if(source == poolBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += POOL_PREMIUM;
            else
                totalPrice -= POOL_PREMIUM;
        else if(source == lakeBox)
        {
            if(select == ItemEvent.SELECTED)
                totalPrice += LAKE_PREMIUM;
            else
                totalPrice -= LAKE_PREMIUM;
        }

        //selection for number of rooms
        if(source == twoBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += TWO_ROOM_PREMIUM;
            else
                totalPrice -= TWO_ROOM_PREMIUM;

        else if(source == threeBox)
        {
            if(select == ItemEvent.SELECTED)
                totalPrice += THREE_ROOMS_PREMIUM;
            else
                totalPrice -= THREE_ROOMS_PREMIUM;
        }

        //selections for meals
        if(source == mealsBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += MEALS;
            else
                totalPrice -= MEALS;
        totPrice.setText("$" + totalPrice);
    }

    public  static  void  main(String[]  args)
    {
        JVacationRental  aFrame  =
                new  JVacationRental();
        final  int  WIDTH  =  300;
        final  int  HEIGHT  =  400;
        aFrame.setSize(WIDTH,  HEIGHT);
        aFrame.setVisible(true);
    }
}