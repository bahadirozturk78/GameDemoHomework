package Entity;

public class Order {
	
	private int id;
	private int customerId;
	private int gameId;
	private int campaignId;
	
	public Order() {
		
	}
	
	public Order(int id, int customerId, int gameId, int campaignId) {
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	
}
