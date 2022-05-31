package LU5;

public class EZLinkCardMain_WS5_P1 {

	public static void main(String[] args) {
		
		EZLinkCard_WS5_P1 ezlinkCard1 = new EZLinkCard_WS5_P1("EZ22154",10.0);
		EZLinkCard_WS5_P1 ezlinkCard2 = new EZLinkCard_WS5_P1("EZ94722",20.0);
		
		ezlinkCard1.display();
		ezlinkCard2.display();
		
		ezlinkCard1.deduct(10);
		ezlinkCard1.display();
	}	
}
