package paket;

public class Paket {
	int weight;
	int quantity;
	int priceItem;
	String productName;

	class status {
		private String code;
		private String description;
		
		public status (String eCode, String eDesc) {
			code = eCode;
			description = eDesc;
		}
	}

	class servicePackage {
		private String service;
		private int value;
		
		public servicePackage (String eService, int eValue) {
			service = eService;
			value = eValue;
		}
	}

	class city {
		private String origin;
		private String destination;
		public city (String eOrigin, String eDestination) {
			origin = eOrigin;
			destination = destination;
		}
	}
	

}


	

