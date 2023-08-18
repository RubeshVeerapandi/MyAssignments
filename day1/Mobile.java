package week1.day1;

public class Mobile {

	public void sendSms() {
		System.out.println("Form Vivo:"+5345);
	}
    public long makeCall() {
		System.out.println("8875926285");
		return 0;
		
	} 
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int noOfmobile =1;
	    boolean ischarging=true;
	    String colour ="Black";
	    char logo='V';
	    float imenumber=326.3844f;
	    
	    System.out.println("noOfmobile:"+noOfmobile);
	    System.out.println("ischarging:"+ischarging);
	    System.out.println("colour:"+colour);
	    System.out.println("logo:"+logo);
	    System.out.println("imenumber:"+imenumber);
	    
	    
	    //create object	
	    Mobile v=new Mobile(); 
		v.sendSms();
		v.makeCall();
		System.out.println("noOfmobile:"+noOfmobile);
    }
}