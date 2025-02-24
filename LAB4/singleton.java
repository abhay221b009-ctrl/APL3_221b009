public class singleton{
	private singleton(){
	System.out.println("1");
}
	public static singleton userinstance;
	static singleton getinstance(){
	if(userinstance==null){
		userinstance=new singleton();
		}
	return userinstance;
	}




}