package proxy;
public class ProxyInternetAccess implements OfficeInternetAccess {
	private String employeeName;
	private RealInternetAccess realAccess;
	public ProxyInternetAccess(String empName) {
		this.employeeName=empName;
	}

	@Override
	public void grantInternetAccess() {
		if(getRole(employeeName)>4) {
			realAccess = new RealInternetAccess(employeeName);
			realAccess.grantInternetAccess();
		}else {
			System.out.println("No internet access granted. Your job level in below 5.");
		}
	}

	private int getRole(String employeeName2) {
		return 5;
	}

}
