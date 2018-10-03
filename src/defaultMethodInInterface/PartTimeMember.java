package defaultMethodInInterface;

public class PartTimeMember extends Member {
	public final double partTimeMaintenanceCost = 400;
	public final double partTimeMemberFee = 600;
	
	@Override
	public double maintenanceFee(int month) {
		return month*partTimeMaintenanceCost;
	}

	@Override
	public double memberFee(int month) {
		return month*partTimeMemberFee;
	}

}
