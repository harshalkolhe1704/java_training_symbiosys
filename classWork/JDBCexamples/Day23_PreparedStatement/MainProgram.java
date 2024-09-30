package Day_23_PreparedStatement;

public class MainProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//PreparedStatement.addVisitor(103,"Lokesh","Male",400,"CSN");
		System.out.println("-----------------------------------------------------");
		//PreparedStatement.validateVisitor(202);
		PreparedStatement.updateVisitorName(205, "Anuradha");
		System.out.println("=======================================================");
		PreparedStatement.updateVisitorRate(203, 100);
		System.out.println("=======================================================");
		PreparedStatement.deleteVisitor(102);
		System.out.println("=======================================================");
		PreparedStatement.showVisitors();
		
		

	}

}
