
public class smartphone {
	String brand;
	String model;
	String colour;
        int NoOfPhone;
	double weight,height,width,depth,price,totalprice;
	
	//Create Setter Method
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public void setColour(String colour) {
			this.colour = colour;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public void setheight(double height) {
			this.height = height;
		}
		
		public void setwidth(double width) {
			this.width = width;
		}
		
		public void setdepth(double depth) {
			this.depth = depth;
		}
		
		public void setprice(double price) {
			this.price = price;
		}
	
                public void setNoOfPhone(int phone) {
			this.NoOfPhone = phone;
		}

		//Create Getter Method
		public String getbrand() {
			return this.brand;
		}
		
		public String getmodel() {
			return this.model;
		}
		
		public String getcolour() {
			return this.colour;
		}

		
		public Double getweight() {
			return this.weight;
		}

		
		public Double getheight() {
			return this.height;
		}
		
		public Double getwidth() {
			return this.width;
		}
		
		public Double getDepth() {
			return this.depth;
		}
		
		public Double getPrice() {
			return this.price;
		}
		
		public Integer getNoOfPhone() {
			return this.NoOfPhone;
		}

                public Double gettotalprice() {
                        this.totalprice = this.NoOfPhone*this.price;
			return this.totalprice;
		}



}
