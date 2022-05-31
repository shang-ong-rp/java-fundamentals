package Project3;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;

public class SearchFrame extends JFrame{
	
	int userid;
	SQL sql;
	MainFrame mainFrame;
	
	JButton submitButton = new JButton("Submit");
	JButton backButton = new JButton("Back");
	
	JTextField nameTF = new JTextField();
	JTextField typeTF = new JTextField();
	JTextField ModuleNumTF = new JTextField();
	JTextField BrandTF = new JTextField();
	SearchFrame frame = this;
	
	public SearchFrame(int id, SQL sqlo, MainFrame mainFrame)
	{
		userid = id;
		sql = sqlo;
		this.mainFrame = mainFrame;
		
		Panel titlePanel = new Panel();
		Panel searchContentPanel = new Panel();
		Panel buttonPanel = new Panel();
		
		// title panel 
		titlePanel.add(new JLabel("Search for the product you want!"));
		titlePanel.setSize(400,70);
		this.add(titlePanel,BorderLayout.NORTH);
		
		// search content panel 
		searchContentPanel.setLayout(new GridLayout(4,2,25,25));
		searchContentPanel.setSize(400,200);
		searchContentPanel.add(new JLabel("Name :"));
		searchContentPanel.add(nameTF);
		searchContentPanel.add(new JLabel("Type :"));
		searchContentPanel.add(typeTF);
		searchContentPanel.add(new JLabel("Module Number :"));
		searchContentPanel.add(ModuleNumTF);
		searchContentPanel.add(new JLabel("Brand :"));
		searchContentPanel.add(BrandTF);
		this.add(searchContentPanel, BorderLayout.CENTER);
		
		// button panel 
	    buttonPanel.setLayout(new GridLayout(1,2,25,25));	
	    SearchListener listener = new SearchListener();
	    submitButton.addActionListener(listener);
	    backButton.addActionListener(listener);
		buttonPanel.add(submitButton);
		buttonPanel.add(backButton);
	    this.add(buttonPanel, BorderLayout.SOUTH);
	}
	
	private void setUpNewUI(int id, SQL sql, MainFrame mainFrame)
	{
	    SearchFrame frame = new SearchFrame(id,sql,mainFrame);
	    frame.setTitle("RP Electronic E-Commerce");
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setSize(500, 400);
	    frame.setVisible(true);
	    // frame.pack();
	}
	   
	public static void invoke(int id, SQL sql, MainFrame mainFrame)
	{
		SearchFrame frame = new SearchFrame(id,sql,mainFrame);
		frame.setUpNewUI(id,sql,mainFrame);
	}
	    
	public class SearchListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if(event.getSource() ==  submitButton) {
				//base SQL query
				String sqlCode = "SELECT * FROM product "; 
			    /* select *
			    from product
			    where name LIKE name and type LIKE type and modelNumber LIKE modelNumber and brand LIKE brand;
				*/
				
			    String name = nameTF.getText().trim();
				String type = typeTF.getText().trim();
				String modelNum = ModuleNumTF.getText().trim();
				String brand = BrandTF.getText().trim();

				boolean notBlank = false;
				if((name.length() != 0) || ( type.length() != 0) || (modelNum.length() != 0) || (brand.length() != 0))		  
					sqlCode += "where ";
					
				// Add name	
				if(name.length() != 0) {
					notBlank = true;
					sqlCode += "name LIKE \'%" + name + "%\'";
				}
				
				// Add type
				if(type.length() != 0) {
					
					// If name was added
					if(notBlank == true)
						sqlCode += " AND ";
					else
						notBlank = true;
					
					sqlCode += "type LIKE \'%" + type + "%\'";
				}
				
				// Add modelNumber
				if(modelNum.length() != 0) {
					
					//If name or type was added
					if(notBlank == true)
						sqlCode += " AND ";
					else 
						notBlank = true;
					
					sqlCode += "modelNumber LIKE \'%" + modelNum + "%\'";
				}
				
				if(brand.length() != 0) {
					
					if(notBlank == true)
						sqlCode += " AND ";
					
					sqlCode += "brand = "+"\'"+brand+"\'";
				}
				
				sqlCode += ";";   
				System.out.println(sqlCode);
			    java.sql.ResultSet rs = sql.QueryExchte(sqlCode);
			    int rowCount = 0;
			          
			    try {
			    	rs.last();
			        rowCount = rs.getRow();
			        rs.first();
			    } catch (Exception e) {
			    	e.printStackTrace();
			    }
			    
			    if(rowCount == 0)			   
			    	JOptionPane.showMessageDialog(null, "No Result is found", "NO Result",JOptionPane.OK_OPTION);			      	
			    else {
			    	try {
						SaveToCartFrame.invoke(userid, sql, rs, frame);
						frame.setVisible(false);
					} catch (SQLException e) {
						e.printStackTrace();
					}
			    }
			    	  
			    	  //open SaveToCartFrame with rs, sql, and userid 
			}
			else if (event.getSource() == backButton) {
				mainFrame.setVisible(true);
				frame.dispose();
			}
			
		}// end actionPerformed Method
	} // end SearchListener Class
} // end Class