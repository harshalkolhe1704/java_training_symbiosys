package hasAinheritance;

public class Department 
{
	private String deptName;
	private int deptNo;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptNo=" + deptNo + "]";
	}
	
	

}
