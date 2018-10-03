package defaultMethodInInterface;

public class ServiceProvider {
	public static void main(String args[]) {
		final int partTimeMemberMonth = 6;
		final int fullTimeMemberMonth =12;
		
		PartTimeMember pMem = new PartTimeMember();
		System.out.println("Part Time Maintenance fee "+pMem.maintenanceFee(partTimeMemberMonth)+" Part Time  memberFee "+ pMem.memberFee(partTimeMemberMonth));
	
		FullTimeMember fMem = new FullTimeMember();
		System.out.println("Full time Maintenance fee "+fMem.maintenanceFee(fullTimeMemberMonth)+" Full time memberFee"
				+fMem.memberFee(fullTimeMemberMonth)
				+" gameFee "+ fMem.gameFee(fullTimeMemberMonth)
				+" gymFee "+ fMem.gymFee(fullTimeMemberMonth));
	} 
}
