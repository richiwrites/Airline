import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class Welcome {

    public Welcome() {
        JFrame frame = new JFrame("Welcome Frame");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        try {
            frame.setIconImage(ImageIO.read(new File("resource/icon1.jpg")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));

                try {
                    Image backgroundImage = ImageIO.read(new File("plane.jpg"));
                    g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        contentPane.setOpaque(false);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Create buttons with resized icon images and text
        
        createButton(contentPane, "passengerRegistration.png", "Passenger Registration",frame);
        createButton(contentPane, "bookTicket.png", "Book Ticket",frame);
        createButton(contentPane, "addFlights.png", "Add Flights",frame);
        createButton(contentPane, "icon5.jpg", "Trip Info",frame);
        createButton(contentPane, "logOut.png", "Log Out",frame);

        frame.getContentPane().add(contentPane);
        frame.getContentPane().setBackground(new Color(135, 206, 235));
        frame.setVisible(true);
    }

    public void createButton(Container container, String iconFileName, String buttonText,JFrame frame) {
        try {

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new BorderLayout());


            BufferedImage iconImage = ImageIO.read(new File(iconFileName));
            ImageIcon icon = new ImageIcon(iconImage);
            JButton button = new JButton(icon);


            Font customFont = new Font("Arial", Font.BOLD, 14);
            button.setFont(customFont);

            // Resize the icon image
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newImg);
            button.setIcon(newIcon);


            button.setPreferredSize(new Dimension(100, 150));


            JLabel label = new JLabel(buttonText, SwingConstants.CENTER);


            buttonPanel.add(button, BorderLayout.CENTER);
            buttonPanel.add(label, BorderLayout.SOUTH);


            button.addActionListener(new ActionListener() {
                @Override
                
                public void actionPerformed(ActionEvent e) {
                    // Handle button click actions here
                    if (buttonText.equals("Passenger Registration")) {
                        new PassengerWindow().setVisible(true);
                        frame.dispose();
                    }else if(buttonText.equals("Book Ticket")){
                        new BookWindow().setVisible(true);
                        frame.dispose();
                    }
                    else if(buttonText.equals("Add Flights")){
                        new FlightWindow().setVisible(true);
                        frame.dispose();
                    }
                    else if(buttonText.equals("Log Out")){
                        frame.dispose();
                    }  
                } 
            });
            container.add(buttonPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Welcome();
            }
        });
    }
}
