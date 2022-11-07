import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class SliderDemo implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);//ticks reprezinta liniile de pe slider
        slider.setMinorTickSpacing(10);//spatierea intre tick-uri

        slider.setPaintTrack(true);//sunt tickuri mai mari
        slider.setMajorTickSpacing(25);//spatiere intre track uri

        slider.setPaintLabels(true);//arata valorile trackuriloro
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));

        slider.setOrientation(SwingConstants.VERTICAL);//schimba orientarea sliderului(totusi ramane hetero cred)

        label.setText("*C="+ slider.getValue());
        label.setFont(new Font("MV Boli",Font.PLAIN,20));

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("*C="+ slider.getValue());
    }

    
}
